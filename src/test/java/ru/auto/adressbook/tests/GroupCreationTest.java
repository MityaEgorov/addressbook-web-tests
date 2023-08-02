package ru.auto.adressbook.tests;

import org.testng.annotations.Test;
import ru.auto.adressbook.modal.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Test", "Test2", "Test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returntoGroupPage();
  }

}
