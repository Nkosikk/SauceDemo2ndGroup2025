package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel
{private static String testDataDir=System.getProperty("user.dir")+"/src/test/java/TestData/data.xlsx";

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

    static XSSFSheet sheet =workbook.getSheet("Login Details");
    static XSSFSheet sheet1 =workbook.getSheet("User Information");

//    public class readFromExcel {
//        public static String firstName = "Lash";
//        public static String lastName = "Skosi";
//        public static String postalCode = "2587";
//    }

    public static String username=sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password=sheet.getRow(1).getCell(1).getStringCellValue();

    public static String firstname=sheet1.getRow(1).getCell(0).getStringCellValue();
    public static String lastname=sheet1.getRow(1).getCell(1).getStringCellValue();
    public static String zip=sheet1.getRow(1).getCell(1).getStringCellValue();
}
