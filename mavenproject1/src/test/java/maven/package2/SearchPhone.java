package maven.package2;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchPhone {
	
@Test	
public void phoneSearchTest(ITestContext context)
{	
	SoftAssert sa=new SoftAssert();
	context.setAttribute("PhoneID", "samsung");
	String str1="ABC";
	String str2="ABC1";
	System.out.println("search-before assertion");
	sa.assertEquals(str1, str2);
//	Assert.assertTrue(5>10,"error message");
//	sa.assertTrue(true, "element not found--message");
	//sa.assertEquals(str1,str2);
	//sa.fail();
	
	
	
//	sa.assertAll();
	System.out.println("search-after assertion");
}
@Test(dependsOnMethods={"phoneSearchTest"})
public void select(ITestContext context)
{	String phID=(String)context.getAttribute("PhoneID");
	System.out.println("select"+phID);
//	Assert.fail();
}
@Test(dependsOnMethods= {"phoneSearchTest","select"})
public void checkout()
{
	System.out.println("checkout");
}
}
