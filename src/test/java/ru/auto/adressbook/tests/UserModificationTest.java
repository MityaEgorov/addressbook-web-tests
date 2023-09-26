package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.HashSet;
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


    user.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());


    before.add(user);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }

}
