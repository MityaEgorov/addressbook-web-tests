package ru.auto.adressbook;

public class UserData {
  private final String name;
  private final String mname;
  private final String lname;
  private final String comname;
  private final String mail;

  public UserData(String name, String mname, String lname, String comname, String mail) {
    this.name = name;
    this.mname = mname;
    this.lname = lname;
    this.comname = comname;
    this.mail = mail;
  }

  public String getName() {
    return name;
  }

  public String getMname() {
    return mname;
  }

  public String getLname() {
    return lname;
  }

  public String getComname() {
    return comname;
  }

  public String getMail() {
    return mail;
  }
}
