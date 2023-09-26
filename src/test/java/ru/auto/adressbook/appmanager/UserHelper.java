package ru.auto.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.auto.adressbook.modal.UserData;

import java.util.ArrayList;
import java.util.List;

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
    return !isElementPresent(By.name("selected[]"));
    //|| wd.findElement(By.id("search_count")).getText().equals("0");
  }

  public int getUserCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<UserData> getUserList() {
    List<UserData> users = new ArrayList<UserData>();
    List<WebElement> elements = wd.findElements(By.cssSelector("tr[name=entry]"));
    for (WebElement element : elements) {
      String lastName = element.findElement(By.cssSelector("td:nth-child(2)")).getText();
      String name = element.findElement(By.cssSelector("td:nth-child(3)")).getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      UserData user = new UserData( id, name, null,lastName,null,null, null) ;
      users.add(user);
    }
    return users;
  }
}
