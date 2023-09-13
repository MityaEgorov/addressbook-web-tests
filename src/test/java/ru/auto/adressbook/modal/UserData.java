package ru.auto.adressbook.modal;

import java.util.Objects;

public class UserData {
  private final String name;
  private final String mname;

  @Override
  public String toString() {
    return "UserData{" +
            "name='" + name + '\'' +
            ", mname='" + mname + '\'' +
            ", lname='" + lname + '\'' +
            ", comname='" + comname + '\'' +
            ", mail='" + mail + '\'' +
            ", group='" + group + '\'' +
            '}';
  }

  private final String lname;
  private final String comname;
  private final String mail;
  private final String group;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserData userData = (UserData) o;

    if (!Objects.equals(name, userData.name)) return false;
    if (!Objects.equals(mname, userData.mname)) return false;
    if (!Objects.equals(lname, userData.lname)) return false;
    if (!Objects.equals(comname, userData.comname)) return false;
    if (!Objects.equals(mail, userData.mail)) return false;
    return Objects.equals(group, userData.group);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (mname != null ? mname.hashCode() : 0);
    result = 31 * result + (lname != null ? lname.hashCode() : 0);
    result = 31 * result + (comname != null ? comname.hashCode() : 0);
    result = 31 * result + (mail != null ? mail.hashCode() : 0);
    result = 31 * result + (group != null ? group.hashCode() : 0);
    return result;
  }

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
