package selenium_Core_Features.ExcelDataDrivenApachePOI_10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class ExcelReader {

    public Object[][] readExcelData(String filePath) throws IOException {
    	
        // Step 1: Load the Excel file using the given file path
        FileInputStream fis = new FileInputStream(filePath);

        // Step 2: Open the workbook from the input stream
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        // Step 3: Access the first sheet in the workbook
        XSSFSheet sheet = wb.getSheetAt(0);// You can make this dynamic if needed
        
       // XSSFSheet sheet = wb.getSheet("Sheet1"); //Another way of accessing the first sheet
        
        // Step 4: Get the total number of rows in the sheet (including header)
        int rowCount = sheet.getPhysicalNumberOfRows();

        // Step 5: Get the header row to determine the number of columns
        XSSFRow headerRow = sheet.getRow(0);
        int colCount = headerRow.getLastCellNum();

        // Step 6: Create a 2D Object array to store Excel data (excluding header row)
        Object[][] data = new Object[rowCount - 1][colCount];

        // Step 7: Use DataFormatter to handle all cell types consistently- 
        //to consistently convert any Excel cell value into a formatted String, 
        //regardless of the cell's original data type (e.g., number, date, boolean, formula, or string).
        DataFormatter formatter = new DataFormatter();

        // Step 8: Loop through the rows and columns to fetch data into the array
        for (int i = 0; i < rowCount - 1; i++) {
            XSSFRow row = sheet.getRow(i + 1); // Skip header row (starts from row 1)
            for (int j = 0; j < colCount; j++) {
                XSSFCell cell = row.getCell(j);
                data[i][j] = formatter.formatCellValue(cell); // Convert all cell values to String
            }
        }

        // Step 9: Close the workbook and input stream
        wb.close();
        fis.close();

        // Step 10: Return the extracted data
        return data;
    }
    
    
    @DataProvider(name = "excelData")
    public Object[][] getExcelData() throws IOException {
    	
        String filePath = "C:\\Users\\OM\\OneDrive\\Desktop\\Abhishek's Workspace1\\selenium_introduction_RahulShetty\\src\\test\\resources\\TestWorkbook_1.xlsx"; // <-- Put your path here
        
        return readExcelData(filePath);
    }

}    
