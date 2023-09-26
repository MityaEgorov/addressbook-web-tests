package ru.auto.adressbook.modal;

import java.util.Objects;

public class UserData {

  private  int id;
  private final String name;
  private final String mname;
  private final String lname;
  private final String comname;
  private final String mail;
  private final String group;




  public UserData(int id, String name, String mname, String lname, String comname, String mail, String group) {
    this.id = id;
    this.name = name;
    this.mname = mname;
    this.lname = lname;
    this.comname = comname;
    this.mail = mail;
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserData userData = (UserData) o;

    if (!Objects.equals(name, userData.name)) return false;
    return Objects.equals(lname, userData.lname);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (lname != null ? lname.hashCode() : 0);
    return result;
  }

  public UserData(String name, String mname, String lname, String comname, String mail, String group) {
    this.id = Integer.MAX_VALUE;
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


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  @Override
  public String toString() {
    return "UserData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", lname='" + lname + '\'' +
            '}';
  }

}
