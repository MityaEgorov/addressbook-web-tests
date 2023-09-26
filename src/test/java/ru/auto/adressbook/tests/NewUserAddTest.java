package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.List;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {
    app.getUserHelper().gotoHomePage();
    List<UserData> before = app.getUserHelper().getUserList();
    //int before = app.getUserHelper().getUserCount();
    app.getUserHelper().createNewUser(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", "Test"));
    app.getNavigationHelper().gotoHomePage();
    List<UserData> after = app.getUserHelper().getUserList();
    //int after = app.getUserHelper().getUserCount();
    Assert.assertEquals(after.size(), before.size() + 1 );


  }

}

