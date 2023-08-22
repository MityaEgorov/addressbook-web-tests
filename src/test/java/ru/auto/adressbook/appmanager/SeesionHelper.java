package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeesionHelper extends HelperBase{
  public SeesionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String name, String password) {
    type(By.name("user") , name);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }
}
