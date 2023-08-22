package ru.auto.adressbook.tests;

import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class UserModificationTest extends TestBase {
  @Test
  public void testUserModification(){
    app.getUserHelper().gotoHomePage();
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().fillUserForm(new UserData("Test4", "Test5", "Testtt", "Tesstt", "somee@mail.com",null));
    app.getUserHelper().clickUpdateUser();
  }

}
