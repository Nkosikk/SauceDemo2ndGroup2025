package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String testdataDir = System.getProperty("user.dir") + "/src/test/java/TestData/Data.xlsx";

    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(testdataDir);
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

    static XSSFSheet sheet = workbook.getSheet("Login details");
    static XSSFSheet Sheet = workbook.getSheet("User Information");

    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();

    public static String firstname = Sheet.getRow(1).getCell(0).getStringCellValue();
    public static String lastname = Sheet.getRow(1).getCell(1).getStringCellValue();
    public static String zipcode = String.valueOf(Sheet.getRow(1).getCell(2).getNumericCellValue());




    @Test
    public void test() {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(zipcode);
    }
}
