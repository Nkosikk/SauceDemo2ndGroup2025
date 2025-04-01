package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/testData/Datafile.xlsx";

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

    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();


    static XSSFSheet UserInformation = workbook.getSheet("User Information");

    public static String firstname = UserInformation.getRow(1).getCell(0).getStringCellValue();
//    public static String lastanme = UserInformation.getRow(1).getCell(1).getStringCellValue();
//    public static String postalcode = UserInformation.getRow(2).getCell(2).getStringCellValue();
//}
}
