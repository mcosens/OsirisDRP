package edu.ucla.astro.osiris.drp.util;

/**
 * <p>Title: OSIRIS Software Package</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: UCLA Infrared Imaging Detector Laboratory</p>
 * @author Jason L. Weiss
 * @version 1.0
 */

public class DRDException extends Exception {
  public DRDException(String msg) {
    super(msg);
  }
  public DRDException() {
    this("");
  }
}