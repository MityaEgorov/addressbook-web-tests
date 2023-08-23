package ru.auto.adressbook.modal;

public class UserData {
  private final String name;
  private final String mname;
  private final String lname;
  private final String comname;
  private final String mail;
  private final String group;

  public UserData(String name, String mname, String lname, String comname, String mail, String group) {
    this.name = name;
    this.mname = mname;
    this.lname = lname;
    this.comname = comname;
    this.mail = mail;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
