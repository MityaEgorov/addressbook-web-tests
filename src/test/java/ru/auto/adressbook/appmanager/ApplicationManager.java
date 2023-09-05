package ru.auto.adressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.Browser.EDGE;

public class ApplicationManager  {
  private final String browser;
  private SeesionHelper seesionHelper;
  private NavigationHelper navigationHelper ;
  private GroupHelper groupHelper;
  private UserHelper userHelper ;

   WebDriver wd;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {

    if (browser.equals(Browser.FIREFOX.browserName())) {
      wd = new FirefoxDriver();
    } else if (browser.equals(Browser.CHROME.browserName())){
      wd = new ChromeDriver();
    } else if (browser.equals(EDGE.browserName())){
      wd = new EdgeDriver();
    }
   
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
