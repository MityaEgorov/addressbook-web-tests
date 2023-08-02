package ru.auto.adressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test", "Test2", "Test3"));
    submitGroupCreation();
    returntoGroupPage();
  }

}
