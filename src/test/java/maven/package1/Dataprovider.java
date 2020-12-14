package maven.package1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	@DataProvider
	public static Object[][] getData(Method m)
	{	
		Object[][] data = null;
		if(m.getName().equals("createUser"))
		{
		data=new Object[2][3];
		data[0][0]="chrome";
		data[0][1]="username1";
		data[0][2]=34;
		
		data[1][0]="firefox";
		data[1][1]="username2";
		data[1][2]=23;
		
		}
		else if(m.getName().equals("deleteUser"))
		{	data=new Object[2][2];
			data[0][0]="delete-username1";
			data[0][1]=34;
			data[1][0]="delete-username2";
			data[1][1]=23;
		}
		return data;
	}
		
}
