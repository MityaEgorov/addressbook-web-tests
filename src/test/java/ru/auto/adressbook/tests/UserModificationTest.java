package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class UserModificationTest extends TestBase {
  @Test
  public void testUserModification(){
    app.getNavigationHelper().gotoHomePage();
    int before = app.getUserHelper().getUserCount();
    if (app.getUserHelper().noneUser()) {
      app.getUserHelper().createNewUser(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"));
    }
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().fillUserForm(new UserData("Test4", "Test5", "Testtt", "Tesstt", "somee@mail.com",null));
    app.getUserHelper().clickUpdateUser();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getUserHelper().getUserCount();
    Assert.assertEquals(after, before );
  }

}
