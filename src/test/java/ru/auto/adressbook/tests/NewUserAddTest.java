package ru.auto.adressbook.tests;

import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {

    app.gotoCreateUser();
    app.fillUserForm(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com"));
    app.submitNewUser();
    app.gotoHomePage();
  }

}

