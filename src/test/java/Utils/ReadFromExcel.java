package Utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/Data.xlsx";

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

    static XSSFSheet sheet = workbook.getSheet("Login Details");

    public static String username = getCellValue(sheet, 1, 0);
    public static String password = getCellValue(sheet, 1, 1);

    static XSSFSheet sheet1 = workbook.getSheet("User Information");
    public static String name = getCellValue(sheet1, 1, 0);
    public static String surname = getCellValue(sheet1, 1, 1);
    public static String postalCode = getCellValue(sheet1, 1, 2);

    private static String getCellValue(XSSFSheet sheet, int row, int col) {
        CellType cellType = sheet.getRow(row).getCell(col).getCellType();
        switch (cellType) {
            case STRING:
                return sheet.getRow(row).getCell(col).getStringCellValue();
            case NUMERIC:
                return String.valueOf(sheet.getRow(row).getCell(col).getNumericCellValue());
            default:
                throw new IllegalStateException("Unexpected cell type: " + cellType);
        }
    }
}