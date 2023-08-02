package ru.auto.adressbook;

import org.testng.annotations.Test;

public class NewUserAdd extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {

    gotoCreateUser();
    fillUserForm(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com"));
    submitNewUser();
    gotoHomePage();
    clickLogOut();
  }

}

