package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.UserData;

import java.util.Comparator;
import java.util.List;

public class UserDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    app.goTo().HomePage();
    if (app.user().list().size() == 0) {
      app.user().create(new UserData("Test1", "Test2", "Testt", "Tesst", "some@mail.com", null));
    }
  }
  @Test
  public void testUserDeletion() {
    List<UserData> before = app.user().list();
    int index = before.size() - 1;
    app.user().delete();
    List<UserData> after = app.user().list();
    Assert.assertEquals(after.size(), index);

    before.remove(index);

    Comparator<? super UserData> byId = (u1, u2) -> Integer.compare(u1.getId(), u2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }



}
