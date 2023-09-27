package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Comparator;
import java.util.List;

public class UserModificationTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    app.goTo().HomePage();
    if (app.user().list().size() == 0) {
      app.user().create(new UserData()
              .withName("Test1").withMname("Test2").withLname("Testt").withComname("Tesst").withMail("some@mail.com"));
    }
  }


  @Test
  public void testUserModification(){
    List<UserData> before = app.user().list();
    UserData modifiedUser = before.iterator().next();
    UserData user = new UserData()
            .withId(modifiedUser.getId()).withName("1234").withMname("1234").withLname("Qwe12333rtuy").withComname("Qwer33232tuy").withMail("some@mail.com").withGroup("test");
    app.user().modify(user);
    List<UserData> after = app.user().list();

    before.remove(user);
    before.add(user);

    Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }


}
