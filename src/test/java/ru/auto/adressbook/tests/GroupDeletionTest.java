package ru.auto.adressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.auto.adressbook.modal.GroupData;

import java.util.Set;

public class GroupDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test2"));
    }
  }

  @Test
  public void testGroupDeletion() throws Exception {
    Set<GroupData> before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Set<GroupData> after = app.group().all();
    //Assert.assertEquals(after.size(), after.size() -1);

    before.remove(deletedGroup);
    Assert.assertEquals(before, after);

  }



}
