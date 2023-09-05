package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

public class UserDeletionTest extends TestBase {
  @Test
  public void testUserDeletion() {
    app.getNavigationHelper().gotoHomePage();
    int before = app.getUserHelper().getUserCount();
    if (app.getUserHelper().noneUser()) {
      app.getUserHelper().createNewUser(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"));
    }
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().buttonDeleteUser();
    int after = app.getUserHelper().getUserCount();
    Assert.assertEquals(after, before - 1 );
  }

}
