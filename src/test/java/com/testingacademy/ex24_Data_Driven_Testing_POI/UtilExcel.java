package com.testingacademy.ex24_Data_Driven_Testing_POI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {
    // Apache POI - helps us tpo use excel file
    // Read the File
    // Create a Workbook
    // Sheet
    // Row and Cell
    // 2D Object - getData()

    //src/test/resources/TestData.xlsx
    public static String SHEET_PATH = System.getProperty("user.dir" + "/src/test/resources/TestData.xlsx");
    static Workbook book;
    static Sheet sheet;

    public static Object[][] getTestDataFromExcel(String sheetName) throws IOException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(SHEET_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        book = WorkbookFactory.create(file);
        sheet = book.getSheet(sheetName);

        //get total no of rows and columns - 5 x 2 metrics
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;
    }

    //    public static Object[][] getTestDataFromSQL(String sheetName){
    //        return null;
    //    }
    public Object[][] getData() throws IOException {
        return getTestDataFromExcel("Sheet1");
        //return getTestDataFromSQL("Sheet2");

    }
}
