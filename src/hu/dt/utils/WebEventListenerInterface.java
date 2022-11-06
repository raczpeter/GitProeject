package hu.dt.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebEventListenerInterface implements WebDriverListener {

	@Override
	public void beforeClick(WebElement element) {
		System.out.println("IF: Before click on: " + element.toString());
	}

	@Override
	public void afterClick(WebElement element) {
		System.out.println("IF: After click on: " + element.toString());
	}

	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("IF: Before navigating to: '" + url + "'");
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("IF: After navigated to:'" + url + "'");
	}

	@Override
	public void beforeFindElement(WebElement element, By locator) {
		System.out.println("IF: Before try to find element: " + locator.toString());
	}

	@Override
	public void afterFindElement(WebElement element, By locator, WebElement result) {
		System.out.println("IF: After try to find element: " + locator.toString());
	}

	@Override
	public void beforeBack(WebDriver.Navigation navigation) {
		System.out.println("IF: Before navigate back");
	}

	@Override
	public void afterBack(WebDriver.Navigation navigation) {
		System.out.println("IF: After navigate back");
	}

}