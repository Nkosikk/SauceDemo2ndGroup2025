package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String TestdataDir=System.getProperty("user.dir")+"/src/test/java/Testdata/data.xlsx";


    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(TestdataDir);
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

    public ReadFromExcel() throws IOException{

    }

    static XSSFSheet sheet =workbook.getSheet("Login Details");

    public static String username=sheet.getRow(1).getCell(0).getStringCellValue();

    public static String password=sheet.getRow(1).getCell(1).getStringCellValue();


    static XSSFSheet sheetUser =workbook.getSheet("User Information");

    public static String firstName=sheetUser.getRow(1).getCell(0).getStringCellValue();
    public static String lastName=sheetUser.getRow(1).getCell(1).getStringCellValue();
    public static String postalCode=sheetUser.getRow(2).getCell(2).getStringCellValue();

    @Test
    public void test(){
        System.out.println(username);
        System.out.println(password);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(postalCode);
    }



}
