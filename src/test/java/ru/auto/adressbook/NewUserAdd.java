package ru.auto.adressbook;

import org.testng.annotations.Test;

public class NewUserAdd extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {

    app.gotoCreateUser();
    app.fillUserForm(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com"));
    app.submitNewUser();
    app.gotoHomePage();
    app.clickLogOut();
  }

}

