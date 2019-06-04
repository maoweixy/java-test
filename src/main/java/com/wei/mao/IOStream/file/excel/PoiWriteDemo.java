package com.wei.mao.IOStream.file.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 毛伟
 * @Date 10/31/17  15:28
 */
public class PoiWriteDemo {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet1");

        for (int row = 0; row < 10; row++)
        {
            Row rows = sheet.createRow(row);
            for (int col = 0; col < 10; col++)
            {
                // 向工作表中添加数据
                rows.createCell(col).setCellValue("data" + row + col);
            }
        }

        File xlsFile = new File("poi.xlsx");
        FileOutputStream xlsStream = new FileOutputStream(xlsFile);
        workbook.write(xlsStream);
    }
}
