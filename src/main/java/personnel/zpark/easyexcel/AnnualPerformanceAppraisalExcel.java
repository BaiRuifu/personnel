package personnel.zpark.easyexcel;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.crypto.Data;


import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import personnel.zpark.model.Basic;

/**
 * 将年度绩效考核等次汇总表的数据写入到excel
 *
 * @Author BaiRuifu
 * @Date 2020/1/13 10:15
 * @Version 1.0
 */
public class AnnualPerformanceAppraisalExcel {

    /**
     * 将年度绩效考核等次汇总表的数据写入到excel
     *data中list行标 key为列标 value为数据
     * year是年份
     * @param file 文件的写入路径
     * @param data 是数据
     * @throws IOException
     */
    public static void writeToExcel(File file ,String year, List<Map<Character, String>> data) throws IOException {

        int temp = 0;
        // String filePath = "d:\\testlog\\sample.xls";//文件路径
        XSSFWorkbook workbook = new XSSFWorkbook();//创建Excel
        XSSFSheet sheet;//创建工作表(Sheet)
        sheet = workbook.createSheet("总表");//创建工作表(Sheet)
        temp = 0;
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 18 * 256);
        sheet.setColumnWidth(temp++, 20 * 256);
        sheet.setColumnWidth(temp++, 10 * 256);
        sheet.setColumnWidth(temp++, 16 * 256);
        sheet.setColumnWidth(temp++, 11 * 256);
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 13 * 256);
        sheet.setColumnWidth(temp++, 10 * 256);
        sheet.setColumnWidth(temp++, 26 * 256);
        sheet.setColumnWidth(temp++, 11 * 256);
        sheet.setColumnWidth(temp++, 15 * 256);
        sheet.setColumnWidth(temp++, 15 * 256);
        sheet.setColumnWidth(temp++, 20 * 256);


        //表头
        XSSFRow row1 = sheet.createRow(0);
        XSSFCell head1 = row1.createCell(0);

        XSSFRow row2 = sheet.createRow(1);
        XSSFCell head2 = row2.createCell(0);
        XSSFRow row3 = sheet.createRow(2);
        temp = 0;
        XSSFCell head3_1 = row3.createCell(temp++);
        XSSFCell head3_2 = row3.createCell(temp++);
        XSSFCell head3_3 = row3.createCell(temp++);
        XSSFCell head3_4 = row3.createCell(temp++);
        XSSFCell head3_5 = row3.createCell(temp++);
        XSSFCell head3_6 = row3.createCell(temp++);
        XSSFCell head3_7 = row3.createCell(temp++);
        XSSFCell head3_8 = row3.createCell(temp++);
        XSSFCell head3_9 = row3.createCell(temp++);
        XSSFCell head3_10 = row3.createCell(temp++);
        XSSFCell head3_11 = row3.createCell(temp++);
        XSSFCell head3_12 = row3.createCell(temp++);
        XSSFCell head3_13 = row3.createCell(temp++);
        XSSFCell head3_14 = row3.createCell(temp++);


        head1.setCellValue("吉林农业科技学院"+year+"年度绩效考核等次汇总表（教师系列）");
        head2.setCellValue("院长审核：已审核              书记签字：已审核");
        head3_1.setCellValue("序号");
        head3_2.setCellValue("单位名称");
        head3_3.setCellValue("姓  名");
        head3_4.setCellValue("");
        head3_5.setCellValue("职  务");
        head3_6.setCellValue("职称级别");
        head3_7.setCellValue("专职/兼职");
        head3_8.setCellValue("教师类型");
        head3_9.setCellValue("基础\r\n教学\r\n工作量");
        head3_10.setCellValue("完成教学工作量");
        head3_11.setCellValue("基础\r\n教科研工作量");
        head3_12.setCellValue("完成\r\n教科研工作量");
        head3_13.setCellValue("考核等次");
        head3_14.setCellValue("备注");


        CellRangeAddress head1Address = new CellRangeAddress(0, 0, 0, 13);
        CellRangeAddress head2Address = new CellRangeAddress(1, 1, 0, 13);
        sheet.addMergedRegion(head1Address);
        sheet.addMergedRegion(head2Address);

        XSSFCellStyle head1Style = workbook.createCellStyle();
//        head1Style.setBorderBottom(BorderStyle.THIN);
//        head1Style.setBorderTop(BorderStyle.THIN);
//        head1Style.setBorderLeft(BorderStyle.THIN);
//        head1Style.setBorderRight(BorderStyle.THIN);
        head1Style.setAlignment(HorizontalAlignment.CENTER);
        XSSFFont head1Font = workbook.createFont();
        head1Font.setFontHeightInPoints((short) 20);
        head1Font.setFontName("宋体");
        head1Font.setBold(true);
        head1Style.setFont(head1Font);
        head1.setCellStyle(head1Style);

        XSSFCellStyle head2Style = workbook.createCellStyle();
        head2Style.setAlignment(HorizontalAlignment.CENTER);
//        head2Style.setBorderBottom(BorderStyle.THIN);
//        head2Style.setBorderTop(BorderStyle.THIN);
//        head2Style.setBorderLeft(BorderStyle.THIN);
//        head2Style.setBorderRight(BorderStyle.THIN);
        XSSFFont head2Font = workbook.createFont();
        head2Font.setFontHeightInPoints((short) 16);
        head2Font.setFontName("宋体");
        head2Font.setBold(true);
        head2Style.setFont(head2Font);
        head2.setCellStyle(head2Style);

        XSSFCellStyle head3Style = workbook.createCellStyle();
        head3Style.setAlignment(HorizontalAlignment.CENTER);
        head3Style.setBorderBottom(BorderStyle.THIN);
        head3Style.setBorderTop(BorderStyle.THIN);
        head3Style.setBorderLeft(BorderStyle.THIN);
        head3Style.setBorderRight(BorderStyle.THIN);
        XSSFFont head3Font = workbook.createFont();
        head3Font.setFontHeightInPoints((short) 12);
        head3Font.setFontName("宋体");
        head3Font.setBold(true);
        head3Style.setFont(head3Font);
        head3_1.setCellStyle(head3Style);
        head3_2.setCellStyle(head3Style);
        head3_3.setCellStyle(head3Style);
        head3_4.setCellStyle(head3Style);
        head3_5.setCellStyle(head3Style);
        head3_6.setCellStyle(head3Style);
        head3_7.setCellStyle(head3Style);
        head3_8.setCellStyle(head3Style);
        head3_9.setCellStyle(head3Style);
        head3_10.setCellStyle(head3Style);
        head3_11.setCellStyle(head3Style);
        head3_12.setCellStyle(head3Style);
        head3_13.setCellStyle(head3Style);
        head3_14.setCellStyle(head3Style);

        //以下写数据内容
        XSSFCellStyle dataStyle = workbook.createCellStyle();
        //   head2Style.setAlignment(HorizontalAlignment.CENTER);
        dataStyle.setBorderBottom(BorderStyle.THIN);
        dataStyle.setBorderTop(BorderStyle.THIN);
        dataStyle.setBorderLeft(BorderStyle.THIN);
        dataStyle.setBorderRight(BorderStyle.THIN);
        XSSFFont dataFont = workbook.createFont();
        dataFont.setFontHeightInPoints((short) 11);
        dataFont.setFontName("宋体");
        dataFont.setBold(true);
        dataStyle.setFont(dataFont);

        for (int i = 0; i < data.size(); i++) {
            Map<Character, String> data1 = data.get(i);
            XSSFRow rowdata = sheet.createRow(i + 3);
            XSSFCell A = rowdata.createCell(0);
            XSSFCell B = rowdata.createCell(1);
            XSSFCell C = rowdata.createCell(2);
            XSSFCell D = rowdata.createCell(3);
            XSSFCell E = rowdata.createCell(4);
            XSSFCell F = rowdata.createCell(5);
            XSSFCell G = rowdata.createCell(6);
            XSSFCell H = rowdata.createCell(7);
            XSSFCell I = rowdata.createCell(8);
            XSSFCell J = rowdata.createCell(9);
            XSSFCell K = rowdata.createCell(10);
            XSSFCell L = rowdata.createCell(11);
            XSSFCell M = rowdata.createCell(12);
            XSSFCell N = rowdata.createCell(13);

            A.setCellValue(data1.get('A'));
            A.setCellStyle(dataStyle);
            B.setCellValue(data1.get('B'));
            B.setCellStyle(dataStyle);
            C.setCellValue(data1.get('C'));
            C.setCellStyle(dataStyle);
            D.setCellValue(data1.get('D'));
            D.setCellStyle(dataStyle);
            E.setCellValue(data1.get('E'));
            E.setCellStyle(dataStyle);
            F.setCellValue(data1.get('F'));
            F.setCellStyle(dataStyle);
            G.setCellValue(data1.get('G'));
            G.setCellStyle(dataStyle);
            E.setCellValue(data1.get('E'));
            E.setCellStyle(dataStyle);
            F.setCellValue(data1.get('F'));
            F.setCellStyle(dataStyle);
            G.setCellValue(data1.get('G'));
            G.setCellStyle(dataStyle);
            H.setCellValue(data1.get('H'));
            H.setCellStyle(dataStyle);
            I.setCellValue(data1.get('I'));
            I.setCellStyle(dataStyle);
            J.setCellValue(data1.get('J'));
            J.setCellStyle(dataStyle);
            K.setCellValue(data1.get('K'));
            K.setCellStyle(dataStyle);
            L.setCellValue(data1.get('L'));
            L.setCellStyle(dataStyle);
            M.setCellValue(data1.get('M'));
            M.setCellStyle(dataStyle);
            N.setCellValue(data1.get('N'));
            N.setCellStyle(dataStyle);

        }


        //写入到文件
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.flush();
        out.close();

    }
}


