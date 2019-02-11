package poiApiReader;

/**
 * Hello world!
 *
 */
public class Xls_readerTest
{
	public static void main(String[] args) {
		String xlspath = System.getProperty("user.dir") + "\\resources\\data.xlsx";

		Xls_Reader xls = new Xls_Reader(xlspath);

		String SheetName = "TestData";

		int columnCount = xls.getColumnCount(SheetName);

		int rowCount = xls.getRowCount(SheetName);
		for (int i = 0; i <= columnCount; i++) {
			for (int j = 0; j <= rowCount; j++) {

				System.out.print(xls.getCellData(SheetName, i, j)+ " ");
			}
			System.out.println();
		}

	}
}
