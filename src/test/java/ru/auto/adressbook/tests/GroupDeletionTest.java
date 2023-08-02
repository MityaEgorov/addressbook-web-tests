package ru.auto.adressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getGroupHelper().getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returntoGroupPage();
  }

}


