package selenium_Core_Features.ExcelDataDrivenApachePOI_10;
import org.testng.annotations.Test;

	public class ExcelTest {

	    @Test(dataProvider = "excelData", dataProviderClass = ExcelReader.class)
	    public void testExcelData(String col1, String col2, String col3) {
	        System.out.println("Col1: " + col1 + ", Col2: " + col2 + ", Col3: " + col3);
	    }
	}
