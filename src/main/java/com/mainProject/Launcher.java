package com.mainProject;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Bharath Kumar Reddy Vatrapu
 */
public class Launcher extends javax.swing.JFrame {


    /**
     * Creates new form ObjectExtractor
     */
    public Launcher() {
        initComponents();

    }


    private void initComponents() {

        imgHome = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setUndecorated(true);
       // setIconImage(createImage("/icons/Origami_62px.png").getImage());
        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DomExtractor_783_590.gif")));
        imgHome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                dispose();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgHome, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgHome, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {


//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Launcher().setVisible(true);
//            }
//        });

        Launcher launcher=new Launcher();
        launcher.setVisible(true);
        Thread t=Thread.currentThread();
        t.sleep(7500);
        if(setupExtractor()){
            new Main().setVisible(true);
            launcher.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Setup Incomplete", "Terminating.. " , JOptionPane.INFORMATION_MESSAGE);
            launcher.dispose();
        }


    }

    public static boolean setupExtractor(){
        boolean flag=true;
        if(!Generic.createFolder(GlobalConstants.DomExtractor_Home_folder)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.DomExtractor_Config_folder)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.DomExtractor_Extractor_folder)){
            flag=false;
        }
        if(!Generic.createFolder(GlobalConstants.DomExtractor_Files_folder)){
            flag=false;
        }

        if(!Generic.createFile(GlobalConstants.DomExtractor_Config_Settings_file)){
            flag=false;
        }
        if(!Generic.createFile(GlobalConstants.DomExtractor_Config_Theme_file)){
            flag=false;
        }
        if(!Generic.createFile(GlobalConstants.DomExtractor_Extractor_path_file)){
            flag=false;
        }
        if(!Generic.createFile(GlobalConstants.DomExtractor_Extractor_url_file)){
            flag=false;
        }
        return flag;
    }
    public ImageIcon createImage(String path){
        return new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(path));
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel imgHome;
    // End of variables declaration


}
