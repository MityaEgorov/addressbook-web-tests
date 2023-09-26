package ru.auto.adressbook.modal;

import java.util.Objects;

public class UserData {

  private  int id = Integer.MAX_VALUE;;
  private  String name;
  private  String mname;
  private  String lname;
  private  String comname;
  private  String mail;
  private  String group;

  public UserData withName(String name) {
    this.name = name;
    return this;
  }

  public UserData withMname(String mname) {
    this.mname = mname;
    return this;
  }

  public UserData withLname(String lname) {
    this.lname = lname;
    return this;
  }

  public UserData withComname(String comname) {
    this.comname = comname;
    return this;
  }

  public UserData withMail(String mail) {
    this.mail = mail;
    return this;
  }

  public UserData withGroup(String group) {
    this.group = group;
    return this;
  }

  public UserData withId(int id) {
    this.id = id;
    return this;
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


  @Override
  public String toString() {
    return "UserData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", lname='" + lname + '\'' +
            '}';
  }

}
