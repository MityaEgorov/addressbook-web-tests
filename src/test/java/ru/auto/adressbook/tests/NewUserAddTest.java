package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Comparator;
import java.util.List;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {
    app.getUserHelper().gotoHomePage();
    List<UserData> before = app.getUserHelper().getUserList();
    UserData user = new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", null);
    app.getUserHelper().createNewUser(user);
    app.getNavigationHelper().gotoHomePage();
    List<UserData> after = app.getUserHelper().getUserList();
    Assert.assertEquals(after.size(), before.size() + 1 );


    //user.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(user);
    Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);


  }

}

