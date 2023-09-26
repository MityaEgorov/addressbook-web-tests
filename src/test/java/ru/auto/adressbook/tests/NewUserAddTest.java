package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Comparator;
import java.util.List;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {
    app.user().HomePage();
    List<UserData> before = app.user().list();
    UserData user = new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", null);
    app.user().create(user);
    app.goTo().HomePage();
    List<UserData> after = app.user().list();
    Assert.assertEquals(after.size(), before.size() + 1 );

    before.add(user);
    Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);


  }

}

