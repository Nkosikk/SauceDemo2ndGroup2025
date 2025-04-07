package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/Datasheet.xlsx";
    private static XSSFWorkbook workbook = null;
    private static XSSFSheet sheet = null;

    static {
        try (FileInputStream fis = new FileInputStream(testDataDir)) {
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet("Login Details");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + testDataDir);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error reading the Excel file: " + testDataDir);
            e.printStackTrace();
        }
    }

    public ReadFromExcel() throws IOException {
        // Constructor can be used for additional initialization if needed
    }

    public static String username = sheet != null ? sheet.getRow(1).getCell(0).getStringCellValue() : null;
    public static String password = sheet != null ? sheet.getRow(1).getCell(1).getStringCellValue() : null;

   public static String firstname = sheet != null ? sheet.getRow(6).getCell(0).getStringCellValue() : null;
    public static String lastname = sheet != null ? sheet.getRow(7).getCell(0).getStringCellValue() : null;
    public static String postalCode = sheet != null ? sheet.getRow(8).getCell(0).getStringCellValue() : null;

}