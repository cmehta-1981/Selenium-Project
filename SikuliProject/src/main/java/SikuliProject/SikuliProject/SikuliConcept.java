package SikuliProject.SikuliProject;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliConcept {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.axmag.com/download/pdfurl-guide.pdf");
		
		URL TestURL = new URL("http://www.axmag.com/download/pdfurl-guide.pdf");
		
		BufferedInputStream TestFile = new BufferedInputStream(TestURL.openStream());
		PDFParser TestPDF = new PDFParser((RandomAccessRead) TestFile);
		TestPDF.parse();
		String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());
		
		if(TestText.contains("Open the setting.xml, you can see it is like this"));
		
		System.out.println(TestText);
		
		driver.quit();
		
		

	}

}
