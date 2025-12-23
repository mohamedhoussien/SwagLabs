package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelFileManager {

    private Workbook workbook;
    private Sheet sheet;

    public ExcelFileManager(String filepath, String sheetName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public String getSpecificCellValue(int rowNum, int colNum) {
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        DataFormatter dataFormatter=new DataFormatter();
        return  dataFormatter.formatCellValue(cell);
    }
}
