package org.test.ADLearnDataDrivenFramework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Abupdateexcel {
    public static void main(String[] args) throws IOException {
        File excelLoc = new File
                ("/Users/mohammadsuhail/IdeaProjects/Learnjavaselenium/src/test/Exceldocument/work.xlsx");

        FileInputStream fis = new FileInputStream(excelLoc);

        Workbook w = new XSSFWorkbook(fis);

        Sheet data = w.getSheet("data");

        Row row = data.getRow(0);

        Cell cell = row.getCell(0);

        String Value = cell.getStringCellValue();

        if (Value.equalsIgnoreCase("SUHAIl")) {
            cell.setCellValue("Welcome");
        }
        FileOutputStream fos = new FileOutputStream(excelLoc);

        w.write(fos);

    }
}
