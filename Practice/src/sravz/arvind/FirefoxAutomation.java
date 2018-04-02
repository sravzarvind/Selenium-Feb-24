package sravz.arvind;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://www.gmail.com");
	}
}
