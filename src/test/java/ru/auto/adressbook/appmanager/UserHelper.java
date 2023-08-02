package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import ru.auto.adressbook.modal.UserData;

public class UserHelper {
  protected final GroupHelper groupHelper = new GroupHelper();

  public void gotoHomePage() {
    groupHelper.wd.findElement(By.linkText("home page")).click();
  }

  public void submitNewUser() {
    groupHelper.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillUserForm(UserData userData) {
    groupHelper.wd.findElement(By.name("firstname")).click();
    groupHelper.wd.findElement(By.name("firstname")).clear();
    groupHelper.wd.findElement(By.name("firstname")).sendKeys(userData.getName());
    groupHelper.wd.findElement(By.name("middlename")).click();
    groupHelper.wd.findElement(By.name("middlename")).clear();
    groupHelper.wd.findElement(By.name("middlename")).sendKeys(userData.getMname());
    groupHelper.wd.findElement(By.name("lastname")).click();
    groupHelper.wd.findElement(By.name("lastname")).clear();
    groupHelper.wd.findElement(By.name("lastname")).sendKeys(userData.getLname());
    groupHelper.wd.findElement(By.name("company")).click();
    groupHelper.wd.findElement(By.name("company")).clear();
    groupHelper.wd.findElement(By.name("company")).sendKeys(userData.getComname());
    groupHelper.wd.findElement(By.name("email")).click();
    groupHelper.wd.findElement(By.name("email")).clear();
    groupHelper.wd.findElement(By.name("email")).sendKeys(userData.getMail());
  }

  public void gotoCreateUser() {
    groupHelper.wd.findElement(By.linkText("add new")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
}
