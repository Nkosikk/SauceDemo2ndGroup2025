package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFromExcel {

    private static final Logger logger = Logger.getLogger(ReadFromExcel.class.getName());
    private static final String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";

    static FileInputStream fis;
    static XSSFWorkbook workbook;
    static XSSFSheet loginDetailsSheet;
    static XSSFSheet userInfoSheet;

    static {
        try {
            fis = new FileInputStream(testDataDir);
            workbook = new XSSFWorkbook(fis);
            loginDetailsSheet = workbook.getSheet("Login Details");
            if (loginDetailsSheet == null) {
                logger.log(Level.SEVERE, "Sheet 'Login Details' not found in the Excel file: " + testDataDir);
            }
            userInfoSheet = workbook.getSheet("User Information");
            if (userInfoSheet == null) {
                logger.log(Level.SEVERE, "Sheet 'User Information' not found in the Excel file: " + testDataDir);
            }
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "Excel file not found: " + testDataDir, e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading Excel file: " + testDataDir, e);
        }
    }

    public static String getCellValueAsString(XSSFSheet sheet, int row, int cell) {
        if (sheet == null || sheet.getRow(row) == null || sheet.getRow(row).getCell(cell) == null) {
            return null;
        }
        switch (sheet.getRow(row).getCell(cell).getCellType()) {
            case STRING:
                return sheet.getRow(row).getCell(cell).getStringCellValue();
            case NUMERIC:
                return String.valueOf(sheet.getRow(row).getCell(cell).getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(sheet.getRow(row).getCell(cell).getBooleanCellValue());
            default:
                return null;
        }
    }

    public static String username = getCellValueAsString(loginDetailsSheet, 1, 0);
    public static String password = getCellValueAsString(loginDetailsSheet, 1, 1);

    public static String firstname = getCellValueAsString(userInfoSheet, 1, 0);
    public static String lastname = getCellValueAsString(userInfoSheet, 1, 1);
    public static String postalCode = getCellValueAsString(userInfoSheet, 1, 2);
}