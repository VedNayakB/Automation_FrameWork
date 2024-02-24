package tests;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {
	WebDriver driver;

	@Test(dataProvider = "getData")
	public void LoginTestVeda(HashMap<String, String> input) {
	page.Login(input.get("username"), input.get("password"));

	}

	@DataProvider
	public Object[][] getData() {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("username", "Veda");
		map1.put("password", "password1121");

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("username", "Gourav");
		map2.put("password", "Test1121");
		return new Object[][] { { map1 }, { map2 } };

	}

}
