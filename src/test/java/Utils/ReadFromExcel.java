package Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {

    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/testData/Datafile.xlsx";
    private static Workbook workbook;

    static {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH)) {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error reading Excel file at " + FILE_PATH, e);
        }
    }

    public static String getCellValue(String sheetName, int rowNumber, int cellNumber) {
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet " + sheetName + " does not exist in the Excel file");
        }
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            return "";
        }
        Cell cell = row.getCell(cellNumber);
        if (cell == null) {
            return "";
        }

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return "";
        }
    }

    public static String username = getCellValue("Login Details", 1, 0);
    public static String password = getCellValue("Login Details", 1, 1);
    public static String firstname = getCellValue("User Information", 1, 0);
    public static String lastname = getCellValue("User Information", 1, 1);
    public static String postalcode = getCellValue("User Information", 1, 2);
}