package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Set;

public class UserDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    app.goTo().HomePage();
    if (app.user().list().size() == 0) {
      app.user().create(new UserData()
              .withName("Test1").withMname("Test2").withLname("Testt").withComname("Tesst").withMail("some@mail.com").withGroup(null));
    }
  }
  @Test
  public void testUserDeletion() {
    Set<UserData> before = app.user().all();
    UserData deletedUser = before.iterator().next();
    int index = before.size() - 1;
    app.user().delete(deletedUser);
    Set<UserData> after = app.user().all();
    Assert.assertEquals(after.size(), index);

    before.remove(deletedUser);
    Assert.assertEquals(before,after);
  }



}
