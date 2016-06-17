import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test2 {
	  @Test
	   public void testCase1() {
	      System.out.println("in test2 class");
	   }


	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("in beforeMethod of test 2 class");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod of test 2 class");
	   }
}
