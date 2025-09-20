package org.test.ADLearnDataDrivenFramework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Aacreateexcel {
    public static void main(String[] args) throws IOException {

        File excelLoc = new File
                ("/Users/mohammadsuhail/IdeaProjects/Learnjavaselenium/src/test/Exceldocument/work.xlsx");

        Workbook w = new XSSFWorkbook();

        Sheet sheet = w.createSheet("data");

        Row row = sheet.createRow(0);

        Cell cell = row.createCell(0);

        cell.setCellValue("Suhail");

        FileOutputStream stream = new FileOutputStream(excelLoc);

        w.write(stream);

    }
}