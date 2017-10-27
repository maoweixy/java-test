package com.wei.mao.file.excel;

import com.sun.tools.javah.Util;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;

public class PoiReadDemo {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        File xlsFile = new File("/Users/maowei/Downloads/test.xlsx");
        // 获得工作簿
        Workbook workbook = WorkbookFactory.create(xlsFile);
        Sheet sheet = workbook.getSheetAt(0);
        // 获得行数
        int rowNum = sheet.getLastRowNum() + 1;

        // 获得列数，先获得一行，在得到改行列数
        Row tmp = sheet.getRow(0);
        int colNum = tmp.getLastCellNum();
        short minColIx = tmp.getFirstCellNum();
        short maxColIx = tmp.getLastCellNum();
        System.out.println(minColIx);
        System.out.println(maxColIx);
        // 读取数据
        for (int row = 1; row < rowNum; row++) {
            User user = new User();
            Row r = sheet.getRow(row);
            for (int col = 0; col < colNum; col++) {
                Cell cell = r.getCell(col);
                if (cell == null) {
                    System.out.println("cell is null at row : "+(row+1)+", clo : "+col+1);
                    System.exit(0);
                }
                switch (col) {
                    case 0:
                        user.setUsername(cell.getStringCellValue());
                        break;
                    case 1:
                        user.setPassword(cell.getStringCellValue());
                        break;
                    case 2:
                        user.setRealName(cell.getStringCellValue());
                        break;
                    case 3:
                        user.setEmail(cell.getStringCellValue());
                        break;
                    case 4:
                        String company = cell.getStringCellValue();
                        //todo 查询group数据库
                        Group group = new Group();
                        user.setGroup(group);
                        break;
                }
            }
            System.out.println(user);
        }
    }
}