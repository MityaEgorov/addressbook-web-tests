package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Comparator;
import java.util.List;

public class UserDeletionTest extends TestBase {
  @Test
  public void testUserDeletion() {
    app.getNavigationHelper().gotoHomePage();
    if (app.getUserHelper().noneUser()) {
      app.getUserHelper().createNewUser(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"));
    }
    List<UserData> before = app.getUserHelper().getUserList();
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().buttonDeleteUser();
    List<UserData> after = app.getUserHelper().getUserList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() -1);

    Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }

}
