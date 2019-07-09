package com.mainProject;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Bharath Kumar Reddy Vatrapu
 */
public class Themes extends javax.swing.JPanel {


    /**
     * Creates new form Extractor
     */
    public Themes() {
        initComponents();
        initload();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        panelExtractor = new javax.swing.JPanel();
        txtTheme = new javax.swing.JLabel();
        cbSelectTheme = new javax.swing.JComboBox<>();
        panelBody = new javax.swing.JPanel();
        btnBodyColor = new javax.swing.JButton();
        panelHeader = new javax.swing.JPanel();
        btnHeaderColor = new javax.swing.JButton();
        btnApply = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        imgSide = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();

        panelExtractor.setBackground(new java.awt.Color(GlobalConstants.body_Color_r,GlobalConstants.body_Color_g,GlobalConstants.body_Color_b));
        panelExtractor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        txtTheme.setFont(new java.awt.Font("Tahoma", 3, 14));
        txtTheme.setText("Theme: ");

        cbSelectTheme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Default1","Default2","Default3", "NeonBlue","SlateBlue", "BitterSweet", "Supernova", "LaserLemon","MintGreen","PersianGreen","FuchiaPink" }));

        panelBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Body", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnBodyColor.setBorder(null);
        btnBodyColor.setBorderPainted(false);

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
                panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBodyColor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelBodyLayout.setVerticalGroup(
                panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBodyColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        panelHeader.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Header", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnHeaderColor.setBorder(null);
        btnHeaderColor.setBorderPainted(false);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
                panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnHeaderColor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnHeaderColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );

        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnDefault.setText("Default");
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });

        imgSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Theme_242_297.gif")));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(imgSide, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgSide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSelect.setForeground(new java.awt.Color(102, 204, 0));
        btnSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Checked_32px.png")));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExtractorLayout = new javax.swing.GroupLayout(panelExtractor);
        panelExtractor.setLayout(panelExtractorLayout);
        panelExtractorLayout.setHorizontalGroup(
                panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelExtractorLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelExtractorLayout.createSequentialGroup()
                                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57)
                                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelExtractorLayout.createSequentialGroup()
                                                .addComponent(txtTheme)
                                                .addGap(18, 18, 18)
                                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbSelectTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSelect))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );
        panelExtractorLayout.setVerticalGroup(
                panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelExtractorLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelExtractorLayout.createSequentialGroup()
                                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtTheme)
                                                        .addComponent(cbSelectTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38)
                                                .addComponent(btnSelect)
                                                .addGap(18, 18, 18)
                                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelExtractorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelExtractor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelExtractor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {

        setColors(cbSelectTheme.getSelectedItem().toString());


    }

    public void setColors(String Theme){
        switch (Theme){

            case "Default1":
                btnHeaderColor.setBackground(new Color(GlobalConstants.Default1[0],GlobalConstants.Default1[1],GlobalConstants.Default1[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.Default1[3],GlobalConstants.Default1[4],GlobalConstants.Default1[5]));
                break;

            case "Default2":
                btnHeaderColor.setBackground(new Color(GlobalConstants.Default2[0],GlobalConstants.Default2[1],GlobalConstants.Default2[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.Default2[3],GlobalConstants.Default2[4],GlobalConstants.Default2[5]));
                break;
            case "Default3":
                btnHeaderColor.setBackground(new Color(GlobalConstants.Default3[0],GlobalConstants.Default3[1],GlobalConstants.Default3[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.Default3[3],GlobalConstants.Default3[4],GlobalConstants.Default3[5]));
                break;
            case "SlateBlue":
                btnHeaderColor.setBackground(new Color(GlobalConstants.SLATE_BLUE[0],GlobalConstants.SLATE_BLUE[1],GlobalConstants.SLATE_BLUE[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.SLATE_BLUE[3],GlobalConstants.SLATE_BLUE[4],GlobalConstants.SLATE_BLUE[5]));
                break;
            case "BitterSweet":
                btnHeaderColor.setBackground(new Color(GlobalConstants.BitterSweet[0],GlobalConstants.BitterSweet[1],GlobalConstants.BitterSweet[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.BitterSweet[3],GlobalConstants.BitterSweet[4],GlobalConstants.BitterSweet[5]));
                break;
            case "Supernova":
                btnHeaderColor.setBackground(new Color(GlobalConstants.Supernova[0],GlobalConstants.Supernova[1],GlobalConstants.Supernova[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.Supernova[3],GlobalConstants.Supernova[4],GlobalConstants.Supernova[5]));
                break;
            case "LaserLemon":
                btnHeaderColor.setBackground(new Color(GlobalConstants.LaserLemon[0],GlobalConstants.LaserLemon[1],GlobalConstants.LaserLemon[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.LaserLemon[3],GlobalConstants.LaserLemon[4],GlobalConstants.LaserLemon[5]));
                break;
            case "MintGreen":
                btnHeaderColor.setBackground(new Color(GlobalConstants.MintGreen[0],GlobalConstants.MintGreen[1],GlobalConstants.MintGreen[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.MintGreen[3],GlobalConstants.MintGreen[4],GlobalConstants.MintGreen[5]));
                break;
            case "PersianGreen":
                btnHeaderColor.setBackground(new Color(GlobalConstants.PersianGreen[0],GlobalConstants.PersianGreen[1],GlobalConstants.PersianGreen[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.PersianGreen[3],GlobalConstants.PersianGreen[4],GlobalConstants.PersianGreen[5]));
                break;
            case "NeonBlue":
                btnHeaderColor.setBackground(new Color(GlobalConstants.NeonBlue[0],GlobalConstants.NeonBlue[1],GlobalConstants.NeonBlue[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.NeonBlue[3],GlobalConstants.NeonBlue[4],GlobalConstants.NeonBlue[5]));
                break;
            case "FuchiaPink":
                btnHeaderColor.setBackground(new Color(GlobalConstants.FuchiaPink[0],GlobalConstants.FuchiaPink[1],GlobalConstants.FuchiaPink[2]));
                btnBodyColor.setBackground(new Color(GlobalConstants.FuchiaPink[3],GlobalConstants.FuchiaPink[4],GlobalConstants.FuchiaPink[5]));
                break;
        }
    }

    public void btnApplyActionPerformed(java.awt.event.ActionEvent evt){
        Generic.writeText(cbSelectTheme.getSelectedItem().toString(),GlobalConstants.DomExtractor_Config_Theme_file,false);
        JOptionPane.showMessageDialog(null, "Applied Theme..Restart App for effect", "Info" , JOptionPane.INFORMATION_MESSAGE);

    }

    public void initload(){
        cbSelectTheme.setSelectedItem(GlobalConstants.THEME);
        setColors(GlobalConstants.THEME);
    }
    public void btnDefaultActionPerformed(java.awt.event.ActionEvent evt){
        cbSelectTheme.setSelectedItem(GlobalConstants.DEFAULT_THEME);
        setColors(GlobalConstants.DEFAULT_THEME);
        Generic.writeText(GlobalConstants.DEFAULT_THEME,GlobalConstants.DomExtractor_Config_Theme_file,false);
        JOptionPane.showMessageDialog(null, "Applied Theme..Restart App for effect", "Info" , JOptionPane.INFORMATION_MESSAGE);

    }
    // Variables declaration - do not modify
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnBodyColor;
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnHeaderColor;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cbSelectTheme;
    private javax.swing.JLabel imgSide;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelExtractor;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JLabel txtTheme;
    // End of variables declaration
}
