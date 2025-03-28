package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/Datasheet.xlsx";
    private static FileInputStream fis = null;
    private static XSSFWorkbook workbook = null;
    private static XSSFSheet sheet = null;

    static {
        try {
            fis = new FileInputStream(testDataDir);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet("Login Details");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + testDataDir);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error reading the Excel file: " + testDataDir);
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ReadFromExcel() throws IOException {
    }

    public static String username = sheet != null ? sheet.getRow(1).getCell(0).getStringCellValue() : null;
    public static String password = sheet != null ? sheet.getRow(1).getCell(1).getStringCellValue() : null;
}