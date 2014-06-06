package com.vineetb.aspose;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.Style;
import com.aspose.cells.Workbook;

public class AsposeCurrencyAccounting {
	
	public static void main(String args[]){
		Workbook workbook = new Workbook();
		Cells cells = workbook.getWorksheets().get(0).getCells();
		
		Cell cell = cells.get("A1");
		String currencyFormat = "_ $* #,##0.00_ ;_ $* \"??_ ;_ @_";//same as style number 44
		Style style = cell.getStyle();
		style.setCultureCustom(currencyFormat);
		cell.setStyle(style);
		cell.putValue(-27034498.26);
		
		cell = cells.get("A2");
		style = cell.getStyle();
		style.setNumber(44);
		cell.setStyle(style);
		cell.putValue(-27034498.26);
		
		try {
			workbook.save("/Users/vineetb/Desktop/output.xls");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
