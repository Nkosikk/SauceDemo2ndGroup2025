package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir=System.getProperty("user.dir")+"/src/test/java/TestData/data.xlsx";

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
    public String firstName;
    public static String lastName;
    public String postalCode;

    public ReadFromExcel() throws IOException {
    }

    static XSSFSheet sheet =workbook.getSheet("Login Details");

    public static String username=sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password=sheet.getRow(1).getCell(1).getStringCellValue();

    static XSSFSheet sheetOverview =workbook.getSheet("User Information");

    public static String firstName=sheetOverview.getRow(0).getCell(0).getStringCellValue();
    public static String lastName=sheetOverview.getRow(1).getCell(1).getStringCellValue();
    public static String postalCode=sheetOverview.getRow(1).getCell(2).getStringCellValue();

}
