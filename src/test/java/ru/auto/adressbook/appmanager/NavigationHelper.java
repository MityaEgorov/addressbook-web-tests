package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd=wd;

  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  public void gotoHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  public void submitNewUser() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void gotoCreateUser() {
    wd.findElement(By.linkText("add new")).click();
  }
}
