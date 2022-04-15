package testing;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert = new SoftAssert();
  @Test(priority=1, groups = "smoke")
  public void createUser() {
	  System.out.println("I am in home Test");
	  System.out.println("Before assertion");
	  Assert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
  }
  @Test ( priority=2,dependsOnMethods = "createUser")
  public void editUser() {
	  System.out.println("Before assertion");
	  softAssert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After assertion");
	  softAssert.assertAll();
  }
  @Test (priority=3,dependsOnMethods = "editUser")
  public void deleteUser() {
	  System.out.println("I am in end Test");
	  System.out.println("Before assertion");
	  softAssert.assertTrue(2>3, "Verifying Element");
	  System.out.println("After assertion");
	  softAssert.assertEquals("abc", "abc");
	  System.out.println("After second assertion");
	  softAssert.assertAll();
  }
}
