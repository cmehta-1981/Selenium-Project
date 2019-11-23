import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PDFReaderTest {
	
	@Test
	public void PDFReaderTest() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://www.axmag.com/download/pdfurl-guide.pdf");
		driver.get("file:///D:/Users/cmehta/Downloads/Provident%20Fund%20Benefits%20-%20Retirals%20-%20Employee.pdf");
		
		String currentUrl = driver.getCurrentUrl();
		
		URL url= new URL(currentUrl);
		
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		String pdfContents = new PDFTextStripper().getText(document);
		
		System.out.println(pdfContents);
		
		//Assert.assertTrue(pdfContents.contains("Thank you for using the “Download PDF file” feature, to download a correct PDF file"));
		
		driver.quit();
		
	}

}
