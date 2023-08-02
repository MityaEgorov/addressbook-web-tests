package ru.auto.adressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Test", "Test2", "Test3"));
    app.submitGroupCreation();
    app.returntoGroupPage();
  }

}
