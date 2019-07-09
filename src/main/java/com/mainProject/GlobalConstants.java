package com.mainProject;

import java.io.File;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bharath Kumar Reddy Vatrapu
 */

public class GlobalConstants {

    public static String DomExtractor_Home_folder = System.getProperty("user.home")+File.separator+"DomExtractor";
    public static String DomExtractor_Config_folder = DomExtractor_Home_folder+File.separator+"config";
    public static String DomExtractor_Config_Theme_file = DomExtractor_Config_folder+File.separator+"theme.txt";
    public static String DomExtractor_Config_Settings_file = DomExtractor_Config_folder+File.separator+"settings.txt";

    public static String DomExtractor_Extractor_folder = DomExtractor_Home_folder+File.separator+"Extractor";
    public static String DomExtractor_Extractor_url_file = DomExtractor_Extractor_folder+File.separator+"url.txt";
    public static String DomExtractor_Extractor_path_file = DomExtractor_Extractor_folder+File.separator+"path.txt";

    public static String DomExtractor_Files_folder = DomExtractor_Home_folder+File.separator+"Files";



//    public static int header_Color_r= 204;
//    public static int header_Color_g= 204;
//    public static int header_Color_b= 255;

    public static int header_Color_r= 255;
    public static int header_Color_g= 255;
    public static int header_Color_b= 255;

    public static int side_Color_r= 75;
    public static int side_Color_g= 75;
//    public static int side_Color_b= 55;
    public static int side_Color_b= 75;

    public static int body_Color_r=240;
    public static int body_Color_g= 240;
    public static int body_Color_b= 240;

    public static int button_Color_r=240;
    public static int button_Color_g= 240;
    public static int button_Color_b= 240;

    public static int Default[] = {255, 255, 255,240, 240, 240,240, 240, 240};
//    public static int Default1[] = {180,180,180,195,195,195,28,135,219};
    public static int Default1[] = {16,110,190,255, 255, 255,28,135,219};
    public static int Default2[] = {180,180,180,195,195,195,134,50,179};
    public static int Default3[] = {180,180,180,195,195,195,44,48,180};


    public static int SLATE_BLUE[] = {102, 102, 204,133, 133, 214,133, 133, 214};
    public static int BitterSweet[] = {255, 92, 92,255, 125, 125,255, 125, 125};
    public static int Supernova[] = {255, 173, 51,255, 189, 92,255, 189, 92};
    public static int LaserLemon[] = {255, 255, 92,255, 255, 151,255, 255, 151};
    public static int MintGreen[] = {92, 255, 92,151, 255, 151,151, 255, 151};
    public static int PersianGreen[] = {0, 163, 163,92, 196, 196,92, 196, 196};
    public static int NeonBlue[] = {67, 119, 202,119, 166, 254,119, 166, 254};
    public static int FuchiaPink[] = {255, 125, 255,255, 172, 255,255, 172, 255};




    public static String SETTINGS_FOLDER_PATH=DomExtractor_Files_folder;
    public static String SETTINGS_DRIVER_FOLDER_PATH=null;
    public static String SETTINGS_DEFAULT_BROWSER=null;
    public static String THEME=null;

    public static String DEFAULT_THEME="Default1";

    public static String Versio_Product = "DomExtractor 2.0";
    public static String Version_Java=System.getProperty("java.version")+"_"+System.getProperty("java.vm.version");
    public static String Version_JavaRuntime=System.getProperty("java.runtime.name");
    public static String Version_OS=System.getProperty("os.name")+"_"+System.getProperty("os.version");
    public static String user_name = System.getProperty("user.name");


    public static String selected_URL=null;

    public static boolean Help_frame_visibility = false;
}
