package ru.auto.adressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTest extends TestBase {
  @Test
  public void testUserDeletion() {
    app.getUserHelper().gotoHomePage();
   // if ( ! app.getUserHelper().noneUser()) {
   //   app.getUserHelper().createUser(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"), true);
   // }
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().buttonDeleteUser();

  }

}
