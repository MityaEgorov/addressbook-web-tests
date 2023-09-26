package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Comparator;
import java.util.List;

public class UserModificationTest extends TestBase {
  @Test
  public void testUserModification(){
    app.getNavigationHelper().gotoHomePage();
    List<UserData> before = app.getUserHelper().getUserList();
    if (app.getUserHelper().noneUser()) {
      app.getUserHelper().createNewUser(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", null));
    }
    UserData user = new UserData(before.get(before.size() -1).getId(),"Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test");
    app.getUserHelper().buttonEditUser();
    app.getUserHelper().fillUserForm(user);
    app.getUserHelper().clickUpdateUser();
    app.getNavigationHelper().gotoHomePage();
    List<UserData> after = app.getUserHelper().getUserList();
    //Assert.assertEquals(after, before.size() -1);

    before.remove(before.size() -1);
    before.add(user);

    Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }

}
