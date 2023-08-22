package ru.auto.adressbook.tests;

import org.openqa.selenium.remote.Browser;
import ru.auto.adressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(Browser.FIREFOX.browserName());

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

}