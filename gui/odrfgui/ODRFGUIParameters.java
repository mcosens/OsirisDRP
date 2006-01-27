package edu.ucla.astro.osiris.drp.odrfgui;

import java.awt.*;
import java.io.File;

/**
 * <p>Title: </p>
 * <p>Description: OSIRIS Control Software Package</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: UCLA IR Lab</p>
 * @author Jason Weiss
 * @version 1.0
 */

public class ODRFGUIParameters {
  //. this class follows the singleton design pattern (gamma, et al, Design Patterns)
  //. only one instance of this class is allowed.
  private static ODRFGUIParameters singleton = null;

  public static File OSIRIS_CONFIG_FILE = new File("/kroot/rel/default/data/osiris_cfg.xml");

  public static String DRF_EXTENSION_WRITING = "writing";
  public static String DRF_EXTENSION_QUEUED = "waiting";

  public static File OSIRIS_DRP_BACKBONE_CONFIG_FILE = new File("/kroot/rel/default/data/RPBconfig.xml");

  public static File DEFAULT_INPUT_DIR = new File("/u/osrsdev/osiris/spec_raw/");
  public static File DEFAULT_OUTPUT_DIR = new File("/u/osrsdev/osiris/spec_orp/");
  public static File DEFAULT_LOG_DIR = new File("/u/osrsdev/osiris/spec_orp/DRFs/");
  public static String OSIRIS_CALIB_ARCHIVE_DIR = "/osiris-calib/SPEC";
  public static File DRF_QUEUE_DIR = new File("/u/osrsdev/osiris/drf_queue");
  public static File DRF_READ_PATH = new File("/u/osrsdev/osiris/");
  public static File DRF_WRITE_PATH = new File("/u/osrsdev/osiris/");

  public static Point POINT_MAINFRAME_LOCATION = new Point(100, 100);

  public static Dimension DIM_MAINFRAME = new Dimension(300, 400);
  public static Dimension DIM_MODULE_LIST = new Dimension(120, 250);

  public static Font FONT_MENU = new Font("Dailog", 0, 12);
  public static Font FONT_MENUITEM = new Font("Dailog", 0, 12);

  public static boolean DEFAULT_AUTOSET_DATASET_NAME = true;

  public static String REDUCTION_TYPE_ARP_SPEC = "ARP_SPEC";
  public static String REDUCTION_TYPE_CRP_SPEC = "CRP_SPEC";
  public static String REDUCTION_TYPE_ORP_SPEC = "ORP_SPEC";
  public static String REDUCTION_TYPE_SRP_SPEC = "SRP_SPEC";

  public static String[] REDUCTION_TYPE_LIST = {REDUCTION_TYPE_ARP_SPEC,
						REDUCTION_TYPE_CRP_SPEC,
						REDUCTION_TYPE_ORP_SPEC,
						REDUCTION_TYPE_SRP_SPEC};

  public static String DEFAULT_REDUCTION_TYPE = REDUCTION_TYPE_ARP_SPEC;

  public static String REDUCTION_TEMPLATE_ARP_BASIC = "/kroot/rel/default/data/basicARP_drfTemplate.xml";
  public static String REDUCTION_TEMPLATE_ORP_BASIC = "/kroot/rel/default/data/basicORP_drfTemplate.xml";
  public static String[] DEFAULT_REDUCTION_TEMPLATE_LIST = {REDUCTION_TEMPLATE_ARP_BASIC,
							  REDUCTION_TEMPLATE_ORP_BASIC};

  //. possible calibration file location strings
  public static String FIND_FILE_SPECIFY_FILE = "find_file_specify_file";
  public static String FIND_FILE_PREVIOUS_RAW = "find_file_previous_raw";
  public static String FIND_FILE_NEXT_RAW = "find_file_next_raw";
  public static String FIND_FILE_CURRENT = "find_file_current";
  public static String FIND_FILE_FIRST = "find_file_first";
  public static String FIND_FILE_MOST_RECENT = "find_file_most_recent";
  public static String FIND_FILE_ARCHIVED_DARK = "find_file_archived_dark";
  public static String FIND_FILE_CONSTRUCT_FROM_FILENAME = "find_file_construct_from_filename";
  public static String FIND_FILE_USE_ENVIRONMENT_VARIABLE = "find_file_use_environment_variable";
  public static String FIND_FILE_DO_NOT_USE = "find_file_do_not_use";
  public static String FIND_FILE_NONE = "find_file_none";

  //. corresponding menu choices
  public static String FIND_FILE_MENU_SPECIFY_FILE = "Specify a file";
  public static String FIND_FILE_MENU_PREVIOUS_RAW = "Previous raw frame";
  public static String FIND_FILE_MENU_NEXT_RAW = "Next raw frame";
  public static String FIND_FILE_MENU_CURRENT = "Current raw frame";
  public static String FIND_FILE_MENU_FIRST = "Oldest valid file";
  public static String FIND_FILE_MENU_MOST_RECENT = "Most recent valid file";
  public static String FIND_FILE_MENU_ARCHIVED_DARK = "Default archived dark";
  public static String FIND_FILE_MENU_CONSTRUCT_FROM_FILENAME = "Construct from filename";
  public static String FIND_FILE_MENU_USE_ENVIRONMENT_VARIABLE= "Use environment variable";
  public static String FIND_FILE_MENU_DO_NOT_USE= "Do Not Use";
  public static String FIND_FILE_MENU_NONE= "Not Used";



  public static String REDUCTION_MODULE_TABLE_COLUMN_HEADER_NAME = "Module Name";
  public static String REDUCTION_MODULE_TABLE_COLUMN_HEADER_SKIP = "Skip";
  public static String REDUCTION_MODULE_TABLE_COLUMN_HEADER_FIND_FILE = "Find File";
  public static String REDUCTION_MODULE_TABLE_COLUMN_HEADER_RESOLVED_FILE = "Resolved Filename";
  public static int REDUCTION_MODULE_TABLE_COLUMN_NAME = 0;
  public static int REDUCTION_MODULE_TABLE_COLUMN_SKIP = 1;
  public static int REDUCTION_MODULE_TABLE_COLUMN_FIND_FILE = 2;
  public static int REDUCTION_MODULE_TABLE_COLUMN_RESOLVED_FILE = 3;
  public static String[] REDUCTION_MODULE_TABLE_COLUMN_HEADERS = {REDUCTION_MODULE_TABLE_COLUMN_HEADER_NAME,
								  REDUCTION_MODULE_TABLE_COLUMN_HEADER_SKIP,
								  REDUCTION_MODULE_TABLE_COLUMN_HEADER_FIND_FILE,
								  REDUCTION_MODULE_TABLE_COLUMN_HEADER_RESOLVED_FILE};
  public static int REDUCTION_MODULE_TABLE_COLUMN_WIDTH_NAME = 180;
  public static int REDUCTION_MODULE_TABLE_COLUMN_WIDTH_SKIP = 40;
  public static int REDUCTION_MODULE_TABLE_COLUMN_WIDTH_FIND_FILE = 125;
  public static int REDUCTION_MODULE_TABLE_COLUMN_WIDTH_RESOLVED_FILE = 600;


  //. specify files that take calibration files
  public static String MODULE_CALIBRATE_WAVELENGTH = "Calibrate Wavelength";
  public static String MODULE_CORRECT_DISPERSION = "Correct Dispersion";
  public static String MODULE_DIVIDE_FLAT = "Divide by Flat Field";
  public static String MODULE_INTERPOLATE_1D = "Interpolate 1d";
  public static String MODULE_INTERPOLATE_3D = "Interpolate 3d";
  public static String MODULE_SPATIALLY_RECTIFY = "Spatially Rectify Spectrum";
  public static String MODULE_SUBTRACT_DARK = "Subtract Dark Frame";
  public static String MODULE_SUBTRACT_SKY = "Subtract Sky";

  //. only specify for files that can use a calibration file.
  //. if the file is optional, set to false, otherwise, set to true
  public static boolean MODULE_FILE_REQUIRED_CALIBRATE_WAVELENGTH = true;
  public static boolean MODULE_FILE_REQUIRED_CORRECT_DISPERSION = false;
  public static boolean MODULE_FILE_REQUIRED_DIVIDE_FLAT = true;
  public static boolean MODULE_FILE_REQUIRED_INTERPOLATE_1D = false;
  public static boolean MODULE_FILE_REQUIRED_INTERPOLATE_3D = false;
  public static boolean MODULE_FILE_REQUIRED_SPATIALLY_RECTIFY = true;
  public static boolean MODULE_FILE_REQUIRED_SUBTRACT_DARK = true;
  public static boolean MODULE_FILE_REQUIRED_SUBTRACT_SKY = true;


  //. file choices for modules that (can) take a calibration file
  public static String[] FIND_FILE_CHOICES_LOG_PATH = {FIND_FILE_MENU_CONSTRUCT_FROM_FILENAME,
						       FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_OUTPUT_DIR = {FIND_FILE_MENU_CONSTRUCT_FROM_FILENAME,
						         FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_CALIBRATE_WAVELENGTH = {FIND_FILE_MENU_MOST_RECENT,
						       FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_CORRECT_DISPERSION = {FIND_FILE_MENU_DO_NOT_USE,
							FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_DIVIDE_FLAT = {FIND_FILE_MENU_MOST_RECENT,
						       FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_INTERPOLATE_1D = {FIND_FILE_MENU_DO_NOT_USE,
							FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_INTERPOLATE_3D = {FIND_FILE_MENU_DO_NOT_USE,
							FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_SPATIALLY_RECTIFY = {FIND_FILE_MENU_MOST_RECENT,
						       FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_SUBTRACT_DARK = {FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_MODULE_SUBTRACT_SKY = {FIND_FILE_MENU_SPECIFY_FILE};
  public static String[] FIND_FILE_CHOICES_NONE = {FIND_FILE_MENU_NONE};

  public static String MODULE_CALFILE_NOT_FOUND = "UNABLE TO FIND VALID FILE";
  public static String MODULE_CALFILE_NOT_SPECIFIED = "NOT SPECIFIED";
  public static String MODULE_CALFILE_NOT_USED = "NOT USED";

  //. list the following only for modules that have an auto file finding method,
  //. e.g. MOST_RECENT
  public static String MODULE_DIR_CALIBRATE_WAVELENGTH = "wcal";
  public static String MODULE_DIR_DIVIDE_FLAT = "flats";
  public static String MODULE_DIR_SPATIALLY_RECTIFY = "rectification";
  public static String MODULE_FILEID_CALIBRATE_WAVELENGTH = "_wmap";
  public static String MODULE_FILEID_DIVIDE_FLAT = "__flat";
  public static String MODULE_FILEID_SPATIALLY_RECTIFY = "__infl";




  //. these can be deleted
  public static String[] FIND_FILE_CHOICES_MODULE_REMOVE_CROSSTALK = {FIND_FILE_MENU_NONE};
  public static String[] FIND_FILE_CHOICES_MODULE_ADJUST_CHANNEL_LEVELS = {FIND_FILE_MENU_NONE};
  public static String[] FIND_FILE_CHOICES_MODULE_GLITCH_IDENTIFICATION = {FIND_FILE_MENU_NONE};
  public static String[] FIND_FILE_CHOICES_MODULE_MAKE_DATA_CUBE = {FIND_FILE_MENU_NONE};
  public static String[] FIND_FILE_CHOICES_MODULE_SAVE_DATASET_INFO = {FIND_FILE_MENU_NONE};



  private ODRFGUIParameters() {
  }
  public static ODRFGUIParameters getInstance() {
    if (singleton == null) {
      singleton = new ODRFGUIParameters();
    }
    return singleton;
  }

}