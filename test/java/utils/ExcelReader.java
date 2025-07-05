package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    /**
     * MethodName: readData
     * Description: Reads data from an Excel sheet based on given sheet name, row number, and cell number.
     * Return Type: String
     * Parameter: String sheetName, int rowNum, int cellNum
     * Author Name: Aditya
     */
    public static String readData(String sheetName, int rowNum, int cellNum) {
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        String value = "";

        try {
            Properties prop = new Properties();
            fis = new FileInputStream("./config/config.properties");
            prop.load(fis);
            workbook = new XSSFWorkbook(prop.getProperty("ExcelPath"));
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = sheet.getRow(rowNum);
            XSSFCell cell = row.getCell(cellNum);

            if (cell.getCellType() == CellType.NUMERIC) {
                value = String.valueOf(cell.getNumericCellValue());
            } else if (cell.getCellType() == CellType.STRING) {
                value = cell.getStringCellValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return value;
    }
}
