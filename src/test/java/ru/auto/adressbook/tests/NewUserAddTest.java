package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Set;

public class NewUserAddTest extends TestBase {

  @Test
  public void testNewUserAdd() throws Exception {
    app.user().HomePage();
    Set<UserData> before = app.user().all();
    UserData user = new UserData()
            .withName("Test1").withMname("Test2").withLname("Testt").withComname("Tesst").withMail("some@mail.com").withGroup(null);
    app.user().create(user);
    app.goTo().HomePage();
    Set<UserData> after = app.user().all();
    Assert.assertEquals(after.size(), before.size() + 1 );

    user.withId(after.stream().mapToInt((u) -> u.getId()).max().getAsInt());
    before.add(user);
    Assert.assertEquals(before,after);


  }

}

