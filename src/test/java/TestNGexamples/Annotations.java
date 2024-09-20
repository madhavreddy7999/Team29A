package TestNGexamples;

import org.testng.annotations.*;


public class Annotations {

@BeforeSuite
public void power1() {
	System.out.println("power1 executed");

}
@AfterSuite
public void power2() {
	System.out.println("power2 executed");
}

@BeforeTest
public void power3() {
	System.out.println("power3 executed");
}

@AfterTest
public void power4() {
	System.out.println("power4 executed");
}
@BeforeClass
public void power5() {
	System.out.println("power5 executed");
}
@AfterClass
public void power6() {
	System.out.println("power6 executed");
}

@BeforeMethod
public void power7() {
	System.out.println("power7 executed");
}
 @AfterMethod
public void power8() {
	System.out.println("power8 executed");
}
 @Test
 public void power9(){
	 
	 System.out.println("power9 executed");
	 }
}