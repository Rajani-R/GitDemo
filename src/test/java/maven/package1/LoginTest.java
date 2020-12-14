package maven.package1;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProviderClass=Dataprovider.class,dataProvider="getData")
	public void createUser(String br,String un,int age)
	{
		
		System.out.println(br);
		System.out.println(un);
		System.out.println(age);
		
	}
	@Test(dataProviderClass=Dataprovider.class,dataProvider="getData")
	public void deleteUser(String un,int age)
	{
		System.out.println(un);
		System.out.println(age);
	}
	
	
	

}
