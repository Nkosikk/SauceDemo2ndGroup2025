package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.io.File;

public class ExtentReportManager {

    private static final String reportDir=System.getProperty("user.dir")+"/Reports/sauceDemo.html";

    public static ExtentReports extentSetup(){
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(new File(reportDir));
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Sauce Demo");

        extentReports.setSystemInfo("OS",System.getProperty("os.name"));
        extentReports.setSystemInfo("Execution Machine",System.getProperty("user.name"));
        return extentReports;
    }
/*
    @Test
    public void Test()
    {
        System.out.println("Test");
    }
*/
}
