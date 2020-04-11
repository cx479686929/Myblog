package com.cx.mylogserver.mysqlHelper.model;


public class Articles {

  private long aid;
  private String aname;
  private String adate;
  private String aurl;


  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
  }


  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }


  public String getAdate() {
    return adate;
  }

  public void setAdate(String adate) {
    this.adate = adate;
  }


  public String getAurl() {
    return aurl;
  }

  public void setAurl(String aurl) {
    this.aurl = aurl;
  }

}
