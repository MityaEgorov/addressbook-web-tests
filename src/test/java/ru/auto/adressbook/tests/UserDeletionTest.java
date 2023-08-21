package ru.auto.adressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTest extends TestBase {
  @Test
  public void testUserDeletion() {
    app.getUserHelper().gotoHomePage();
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().buttonDeleteUser();

  }

}
