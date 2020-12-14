package pkg1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized.Parameters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class Logintest_junit {
	String un="abc";
	int age;
	String browser;
	
		public  Logintest_junit(String un,int age,String browser)
	{
		this.un=un;
		this.age=age;
		this.browser=browser;
		
	}
		@Parameters
		public static collection<Object[][]> getData("abc",34,"chrome")
		{
			object[][] data=new object[2][3];
		}
@Test
public void login()
{
	System.out.println("login");
	
}
@Test
public void middle()
{
	System.out.println("middle");
}
@Test
public void end()
{
	System.out.println("end");
}
}
