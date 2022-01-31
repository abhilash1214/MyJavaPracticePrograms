package TestGroup.PracticeProblems2D;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A25_TestNGAnnotationsB {
	 @BeforeSuite
	  public void beforeSuite() {
	    System.out.println("BeforeSuite");
	  }

	  @BeforeTest
	  public void beforeTest() {
	    System.out.println("BeforeTest");
	  }

	  @BeforeClass
	  public void beforeClass() {
	    System.out.println("BeforeClass");
	  }

	  @BeforeMethod
	  public void beforeMethod() {
	    System.out.println("BeforeMethod");
	  }
	  
	  @Test
	  public void myTestMethod1() {
	    System.out.println("myTestMethod1");
	  }

	  @Test
	  public void myTestMethod2() {
	    System.out.println("myTestMethod2");
	  }
	  


}
