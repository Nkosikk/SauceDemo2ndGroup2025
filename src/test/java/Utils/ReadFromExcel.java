package Utils;


import io.opentelemetry.api.common.Value;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static final String testDataDir=System.getProperty("user.dir")+"/src/ExtentReportManager/java/TestData/data.xlsx";

    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(testDataDir);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ReadFromExcel() throws IOException {
    }

     XSSFSheet sheet =workbook.getSheet("Login Details");
    public  String username=sheet.getRow(1).getCell(0).getStringCellValue();
    public  String password=sheet.getRow(1).getCell(1).getStringCellValue();


     XSSFSheet sheet1 =workbook.getSheet("Checkout Your Information");
    public  String firstname=sheet1.getRow(1).getCell(0).getStringCellValue();
    public  String lastname=sheet1.getRow(1).getCell(1).getStringCellValue();
    public String postalCode=sheet1.getRow(1).getCell(2).getStringCellValue();





}
