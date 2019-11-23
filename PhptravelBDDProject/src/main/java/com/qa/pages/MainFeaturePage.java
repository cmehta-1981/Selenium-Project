package com.qa.pages;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class MainFeaturePage extends Base{
	
	
	//OR (Object Repository
	
	@FindBy(xpath = "//h2[@class='wow fadeIn cw upper animated']")
	WebElement mainFeatureHeader;
	
	@FindBy(xpath = "//img[@class='wow fadeIn img-responsive animated']")
	WebElement  vacationPackagesImageText;
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-block']")
	WebElement demoButtonD;
	
	
	
	
	
	//Initialize the class object
	
	public MainFeaturePage() {
		PageFactory.initElements(driver, this);
	}

	
	//Actions
	
	public String ValidateMainFeatureHeader() {
		return mainFeatureHeader.getText();
		
		
	}
	
	public void ValidateVacationPackageImageText() throws Exception {
		
		File scr = vacationPackagesImageText.getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir")+"/screenshots/vacationPackage.png";
		FileHandler.copy(scr, new File(imagePath));
		ITesseract image = new Tesseract();
		String imageText = image.doOCR(new File(imagePath));
		System.out.println(imageText);
	}
	
}
