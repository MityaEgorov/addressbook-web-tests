package ru.auto.adressbook.tests;

import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {

    app.getNavigationHelper().gotoCreateUser();
    //noinspection TestFailedLine
    app.getUserHelper().fillUserForm(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"), true);
    app.getNavigationHelper().submitNewUser();
    app.getNavigationHelper().gotoHomePage();
  }

}

