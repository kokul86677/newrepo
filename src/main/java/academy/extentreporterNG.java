package academy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreporterNG {
	static ExtentReports e;
public static ExtentReports config()
{
	String path = System.getProperty("user.dir")+"\\reports\\exrep.html";
	ExtentSparkReporter ex = new ExtentSparkReporter(path);
	ex.config().setDocumentTitle("academymavenreports");
	ex.config().setReportName("test");
	 e = new ExtentReports();
	 e.attachReporter(ex);
	 return e;
}
}
