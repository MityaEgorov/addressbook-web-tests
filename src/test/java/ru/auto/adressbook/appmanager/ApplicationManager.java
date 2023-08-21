package ru.auto.adressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {
  private SeesionHelper seesionHelper;
  private NavigationHelper navigationHelper ;
  private GroupHelper groupHelper;
  private UserHelper userHelper ;

  protected FirefoxDriver wd;


  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    userHelper = new UserHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    seesionHelper = new SeesionHelper(wd);
    seesionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public UserHelper getUserHelper() {
    return userHelper;
  }
}
