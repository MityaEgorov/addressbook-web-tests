package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeesionHelper extends HelperBase{
  public SeesionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String name, String password) {
    type(By.name("user") , name);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }
}
