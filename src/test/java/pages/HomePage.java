package pages;

import org.openqa.selenium.By;
public class HomePage extends BasePage{

	private By User_Name = By.xpath("//input[@id='user-name']");
	private By User_Pass = By.xpath("//input[@id='password']");
	private By LoginBtn = By.xpath("//input[@id='login-button']");

//	public void user_name(String user_name) {
//		writeText(User_Name , user_name);
//	}
//	public void user_pass(String user_pass) {
//		writeText(User_Name , user_pass);
//	}
	public void LoginButton() {
		click(LoginBtn);
	}

	public void  Home_page_part(String user_name, String user_pass){
		writeText(User_Name, user_name);
		writeText(User_Pass, user_pass);
		LoginButton();
	}

}
