package Chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/15/2026
 **/
public class ReadFromExcel {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Results.xlsx";

        try {
            FileInputStream fileInput = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = workbook.getSheetAt(0);
//            for (int i = 0; i < sheet.getLastRowNum(); i++) {
//                //row
//                Row row = sheet.getRow(i);
//                for (int col = 0; col < row.getLastCellNum(); col++) {
//                    Cell cell = row.getCell(col);
//                    System.out.print(cell + "\t\t");
//                }
//                System.out.println();
//            }
            for (Row row : sheet){
                for (Cell cell : row){
                    switch (cell.getCellType()){
                        case STRING -> System.out.print(cell.getStringCellValue() + "\t");
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                        default -> System.out.println("Invalid cell type (" + cell.getCellType() + ")");
                    }
                }
                System.out.println();
            }

            fileInput.close();
            workbook.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}