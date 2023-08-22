package ru.auto.adressbook.tests;

import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {

    app.getUserHelper().gotoCreateUser();
    app.getUserHelper().fillUserForm(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"), true);
    app.getUserHelper().submitNewUser();
    app.getUserHelper().gotoHomePage();
  }

}

