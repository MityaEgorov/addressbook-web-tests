package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.auto.adressbook.modal.UserData;

public class UserHelper extends HelperBase {
  public UserHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillUserForm(UserData userData) {
    type(By.name("firstname"), userData.getName());
    type(By.name("middlename"), userData.getMname());
    type(By.name("lastname"), userData.getLname());
    type(By.name("company"), userData.getComname());
    type(By.name("email"), userData.getMail());
  }

  public void type(By locator, String data) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(data);
  }
}
