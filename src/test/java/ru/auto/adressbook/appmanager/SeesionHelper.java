package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeesionHelper {
  private final FirefoxDriver wd;

  public SeesionHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void login(String name, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(name);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
