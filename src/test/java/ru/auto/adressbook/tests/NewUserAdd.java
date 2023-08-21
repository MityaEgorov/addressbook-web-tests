package ru.auto.adressbook.tests;

import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class NewUserAdd extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {

    app.getNavigationHelper().gotoCreateUser();
    app.getUserHelper().fillUserForm(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com"));
    app.getNavigationHelper().submitNewUser();
    app.getNavigationHelper().gotoHomePage();
  }

}

