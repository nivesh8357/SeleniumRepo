package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationSequence {
     @BeforeSuite
	static void beforesuit() {
		System.out.println("Before Suite");
	}
     @BeforeTest
	static void beforeTest() {
		System.out.println("Before Test");
	}
     @BeforeClass
	static void beforeclass() {
		System.out.println("Before class");
	}
     @BeforeMethod
	static void beforemethod() {
		System.out.println("Before method");
	}
     @Test
	static void test() {
		System.out.println("Test");
	}
     @AfterMethod
	static void aftermethod() {
		System.out.println("after method");
	}
     @AfterClass
	static void afterclass() {
		System.out.println("After Class");
	}
     @AfterSuite
	static void afterSuite() {
		System.out.println("After Suite");
	}
     @AfterTest
	static void aftertest() {
		System.out.println("After test");
	}
	
	
}
