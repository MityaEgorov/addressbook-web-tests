package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.auto.adressbook.modal.UserData;

public class UserHelper extends NavigationHelper {
  public UserHelper(WebDriver wd) {
    super(wd);
  }

  public void fillUserForm(UserData userData) {
    usrtype(By.name("firstname"), userData.getName());
    usrtype(By.name("middlename"), userData.getMname());
    usrtype(By.name("lastname"), userData.getLname());
    usrtype(By.name("company"), userData.getComname());
    usrtype(By.name("email"), userData.getMail());

    // if (creation) new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(userData.getGroup());
    // else {
    //  Assert.assertFalse(isElementPresent(By.name("new_group")));
    // }

  }

  public void buttonEditUser() {
    click(By.cssSelector("img[alt='Edit']"));
  }

  public void clickUpdateUser() {
    click(By.xpath("//input[@name='update']"));
  }

  public void buttonDeleteUser() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void submitNewUser() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void gotoCreateUser() {
    wd.findElement(By.linkText("add new")).click();
  }


  public void createNewUser(UserData user) {
    gotoCreateUser();
    fillUserForm(user);
    submitNewUser();
  }

  public boolean noneUser() {
    return !isElementPresent(By.id("search_count")) || wd.findElement(By.id("search_count")).getText().equals("0");
  }
}
