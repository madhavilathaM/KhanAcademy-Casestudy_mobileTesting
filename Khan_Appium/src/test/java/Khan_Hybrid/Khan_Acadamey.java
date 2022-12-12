package Khan_Hybrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Khan_Acadamey {
	
	
	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void beforetest() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
		
	
		
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test(enabled=true,priority=0)//sign in
	public void Signin() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		System.out.println("Welcome to Khan Acadamy");
				
		Thread.sleep(15000);
				
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
		
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"madhavilatha.medharametla@gmail.com\")").click();
		System.out.println("User Signed in");
		Thread.sleep(5000);
		
		
	}
	
	@Test(enabled=true,priority=1)
		public void selectLanguage() throws InterruptedException
		{
			
		
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)) "+
		         ".scrollIntoView(new UiSelector().text(\"Select language\"))")).click();
		
		Thread.sleep(3000);
		
			//driver.findElementByAndroidUIAutomator("text(\"Select language\")").click();
			
			driver.findElement(MobileBy.xpath("//*[@text='English (default)']")).click();
			Thread.sleep(3000);
			
			System.out.println("Selected English Language");
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			
				
		}
	
	@Test(enabled=true,priority=2)
	public void explore1() throws InterruptedException//playing vedio
	{
		
		Thread.sleep(8000);
		
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		
		Thread.sleep(5000);
		
	int subjects=  driver.findElements(MobileBy.className("android.widget.TextView")).size();
		
	System.out.println("Number of Subjects :" + subjects);
		
		driver.findElementByAndroidUIAutomator("text(\"Computing\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Computer science\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Information theory\")").click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Source encoding\")").click();
		Thread.sleep(4000);
	
		
		//driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Pause\"]/android.widget.ImageView")).click();
		//android.view.ViewGroup[@content-desc="Play"]/android.widget.ImageView

		//Thread.sleep(7000);
		
		//System.out.println("Vedio paused");
		
	}
	
	
	@Test(enabled=true,priority=3)
	public void Addbookmarks() throws InterruptedException
	{
		
		
Thread.sleep(4000);
		
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		
		driver.findElementByAndroidUIAutomator("text(\"Test prep\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Praxis Core Reading\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Lessons\")").click();
		
		Thread.sleep(4000);
		
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
		
		Thread.sleep(4000);
		
		String message=driver.findElement(MobileBy.id("android:id/alertTitle")).getText();
		
		System.out.println(message);
		
		driver.findElement(MobileBy.id("android:id/button2")).click();
		
		
	}
	
	@Test(enabled=true,priority=4)
	public void deletebookmark() throws InterruptedException
	{
		
		driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_bookmarks")).click();
		Thread.sleep(4000);
		
		driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
		
		
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Delete\")").click();
		
		System.out.println("Bookmark deleted");
		
		Thread.sleep(6000);
	
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));

		//driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_home")).click();
		
	}
	
	@Test(enabled=false,priority=5)
	public void sharevedio() throws InterruptedException
	{
		
		Thread.sleep(6000);
	driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		
		Thread.sleep(4000);
		

		driver.findElementByAndroidUIAutomator("text(\"Science\")").click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Class 10 Chemistry (India)\")").click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Acids, bases, and salts\")").click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Litmus solution (Natural indicator)\")").click();
		Thread.sleep(4000);
		
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Pause\"]/android.widget.ImageView")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.AccessibilityId("Share")).click();
		
		Thread.sleep(6000);
		
		//driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		
		driver.findElements(MobileBy.id("android:id/icon")).get(0).click();
		
				
		Thread.sleep(4000);
		
		
		//driver.findElement(MobileBy.id("android:id/button1")).click();
		
		
		driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
		
		System.out.println("Vedio link was shared through message");
		
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
		
		Thread.sleep(3000);
		
	}
	
	
	@Test(enabled=true,priority=5)
	public void sharevedio1() throws InterruptedException
	{
		
		Thread.sleep(6000);
	driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		
		Thread.sleep(4000);
		

		driver.findElementByAndroidUIAutomator("text(\"Arts and humanities\")").click();
		Thread.sleep(4000);
		
		
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)) "+
		         ".scrollIntoView(new UiSelector().text(\"Art of Oceania\"))")).click();
//		driver.findElement(MobileBy.AndroidUIAutomator(
//		        "new UiScrollable(new UiSelector().scrollable(true)) "));
		         
		
		
		
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable.scrollIntoView(true)");
		Thread.sleep(4000);
		
		//driver.findElementByAndroidUIAutomator("text(\"Art of Oceania\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Oceania: peoples and places\")").click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Mask (Buk), Torres Strait, Mabuiag Island\")").click();
		
		
		Thread.sleep(2000);
		
		//driver.findElement(MobileBy.className("android.view.View")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Pause\"]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("text(\"Share\")").click();
		//driver.findElement(MobileBy.AccessibilityId("Share")).click();
		
		Thread.sleep(8000);
		
		//driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		
		driver.findElements(MobileBy.id("android:id/icon")).get(0).click();
		
				
		Thread.sleep(4000);
		
		
		
		
		driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
		
		System.out.println("Vedio link was shared through message");
		
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(7000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		driver.findElementByAndroidUIAutomator("text(\"Home\")").click();
		
		Thread.sleep(3000);
		
	}
	
	
	
	
	

}
