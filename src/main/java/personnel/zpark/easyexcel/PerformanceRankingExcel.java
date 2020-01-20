package personnel.zpark.easyexcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 申报人员代表性业绩排序表写入到Excel
 *
 * @Author BaiRuifu
 * @Date 2020/1/16 9:50
 * @Version 1.0
 */
public class PerformanceRankingExcel {
    public static void writeToExcel(File file, String year, String perf, String cate, List<Map<Character, String>> data) throws IOException {
        //perf：职称  ; cate 类别
        int temp;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("排序结果");
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 24));
        sheet.addMergedRegion(new CellRangeAddress(1, 3, 0, 0));
        sheet.addMergedRegion(new CellRangeAddress(1, 3, 1, 1));
        sheet.addMergedRegion(new CellRangeAddress(1, 3, 2, 2));
        sheet.addMergedRegion(new CellRangeAddress(1, 3, 3, 3));
        sheet.addMergedRegion(new CellRangeAddress(1, 3, 4, 4));//量化分数
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 5, 8));//论文
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 9, 10));//主持总经费
        sheet.addMergedRegion(new CellRangeAddress(2, 3, 11, 11));//项目合计
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 9, 16));//教科研
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 12, 16));//主持教
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 17, 24));//奖项类
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 17, 20));//奖教学成果奖
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 21, 24));//科研奖项

        temp = 0;
        sheet.setColumnWidth(temp++, 6 * 256);
        sheet.setColumnWidth(temp++, 18 * 256);
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 10 * 256);
        sheet.setColumnWidth(temp++, 6 * 256);
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 6 * 256);
        sheet.setColumnWidth(temp++, 6 * 256);
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 6 * 256);
        sheet.setColumnWidth(temp++, 8 * 256);
        sheet.setColumnWidth(temp++, 6 * 256);
        sheet.setColumnWidth(temp++, 6 * 256);//p
        sheet.setColumnWidth(temp++, 7 * 256);//q
        sheet.setColumnWidth(temp++, 5 * 256);//r
        sheet.setColumnWidth(temp++, 6 * 256);//s
        sheet.setColumnWidth(temp++, 6 * 256);//t
        sheet.setColumnWidth(temp++, 5 * 256);//u
        sheet.setColumnWidth(temp++, 6 * 256);//v
        sheet.setColumnWidth(temp++, 5 * 256);//w
        sheet.setColumnWidth(temp++, 6 * 256);//x
        sheet.setColumnWidth(temp++, 8 * 256);//25组
        //表头
        XSSFRow row1 = sheet.createRow(0);
        XSSFCell head1 = row1.createCell(0);
        //第二行
        XSSFRow row2 = sheet.createRow(1);
        temp = 0;
        XSSFCell head2_1 = row2.createCell(temp++);
        XSSFCell head2_2 = row2.createCell(temp++);
        XSSFCell head2_3 = row2.createCell(temp++);
        XSSFCell head2_4 = row2.createCell(temp++);
        XSSFCell head2_5 = row2.createCell(temp++);
        XSSFCell head2_6 = row2.createCell(temp++);
        XSSFCell head2_7 = row2.createCell(temp++);
        XSSFCell head2_8 = row2.createCell(temp++);
        XSSFCell head2_9 = row2.createCell(temp++);
        XSSFCell head2_10 = row2.createCell(temp++);
        XSSFCell head2_11 = row2.createCell(temp++);
        XSSFCell head2_12 = row2.createCell(temp++);
        XSSFCell head2_13 = row2.createCell(temp++);
        XSSFCell head2_14 = row2.createCell(temp++);
        XSSFCell head2_15 = row2.createCell(temp++);
        XSSFCell head2_16 = row2.createCell(temp++);
        XSSFCell head2_17 = row2.createCell(temp++);
        XSSFCell head2_18 = row2.createCell(temp++);
        XSSFCell head2_19 = row2.createCell(temp++);
        XSSFCell head2_20 = row2.createCell(temp++);
        XSSFCell head2_21 = row2.createCell(temp++);
        XSSFCell head2_22 = row2.createCell(temp++);
        XSSFCell head2_23 = row2.createCell(temp++);
        XSSFCell head2_24 = row2.createCell(temp++);
        XSSFCell head2_25 = row2.createCell(temp++);
        row2.setHeightInPoints(30);//设置行高

        //第三行
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
        XSSFCell head3_15 = row3.createCell(temp++);
        XSSFCell head3_16 = row3.createCell(temp++);
        XSSFCell head3_17 = row3.createCell(temp++);
        XSSFCell head3_18 = row3.createCell(temp++);
        XSSFCell head3_19 = row3.createCell(temp++);
        XSSFCell head3_20 = row3.createCell(temp++);
        XSSFCell head3_21 = row3.createCell(temp++);
        XSSFCell head3_22 = row3.createCell(temp++);
        XSSFCell head3_23 = row3.createCell(temp++);
        XSSFCell head3_24 = row3.createCell(temp++);
        XSSFCell head3_25 = row3.createCell(temp++);
        row3.setHeightInPoints(30);
        //第四行
        XSSFRow row4 = sheet.createRow(3);
        temp = 0;
        XSSFCell head4_1 = row4.createCell(temp++);
        XSSFCell head4_2 = row4.createCell(temp++);
        XSSFCell head4_3 = row4.createCell(temp++);
        XSSFCell head4_4 = row4.createCell(temp++);
        XSSFCell head4_5 = row4.createCell(temp++);
        XSSFCell head4_6 = row4.createCell(temp++);
        XSSFCell head4_7 = row4.createCell(temp++);
        XSSFCell head4_8 = row4.createCell(temp++);
        XSSFCell head4_9 = row4.createCell(temp++);
        XSSFCell head4_10 = row4.createCell(temp++);
        XSSFCell head4_11 = row4.createCell(temp++);
        XSSFCell head4_12 = row4.createCell(temp++);
        XSSFCell head4_13 = row4.createCell(temp++);
        XSSFCell head4_14 = row4.createCell(temp++);
        XSSFCell head4_15 = row4.createCell(temp++);
        XSSFCell head4_16 = row4.createCell(temp++);
        XSSFCell head4_17 = row4.createCell(temp++);
        XSSFCell head4_18 = row4.createCell(temp++);
        XSSFCell head4_19 = row4.createCell(temp++);
        XSSFCell head4_20 = row4.createCell(temp++);
        XSSFCell head4_21 = row4.createCell(temp++);
        XSSFCell head4_22 = row4.createCell(temp++);
        XSSFCell head4_23 = row4.createCell(temp++);
        XSSFCell head4_24 = row4.createCell(temp++);
        XSSFCell head4_25 = row4.createCell(temp++);
        row4.setHeightInPoints(30);


        head1.setCellValue(year + "年" + perf + "(" + cate + ")申报人员代表性业绩排序表");
        head2_1.setCellValue("序号");
        head2_2.setCellValue("单位");
        head2_3.setCellValue("姓名");
        head2_4.setCellValue("申报名称");
        head2_5.setCellValue("量化分数");
        head2_6.setCellValue("论文");
        head2_10.setCellValue("教、科研项目课题类");
        head2_18.setCellValue("奖项类");
        head3_10.setCellValue("主持总经费\r\n（万元）");
        head3_12.setCellValue("项目合计");
        head3_13.setCellValue("主持教、科研课题\r\n（项数）");
        head3_18.setCellValue("教学成果奖\r\n（等级/名次）");
        head3_22.setCellValue("科研奖项\r\n（等级/名次）");
        head4_6.setCellValue("检索");
        head4_7.setCellValue("重要");
        head4_8.setCellValue("核心");
        head4_9.setCellValue("一般");
        head4_10.setCellValue("纵向");
        head4_11.setCellValue("横向");
        head4_13.setCellValue("国家");
        head4_14.setCellValue("省部");
        head4_15.setCellValue("厅");
        head4_16.setCellValue("校级");
        head4_17.setCellValue("横向");
        head4_18.setCellValue("国家");
        head4_19.setCellValue("省");
        head4_20.setCellValue("厅级");
        head4_21.setCellValue("校级");
        head4_22.setCellValue("国家");
        head4_23.setCellValue("省");
        head4_24.setCellValue("厅");
        head4_25.setCellValue("校");

        XSSFCellStyle head1Style = workbook.createCellStyle();
        head1Style.setAlignment(HorizontalAlignment.CENTER);//水平居中
        head1Style.setBorderBottom(BorderStyle.THIN);
        head1Style.setBorderTop(BorderStyle.THIN);
        head1Style.setBorderLeft(BorderStyle.THIN);
        head1Style.setBorderRight(BorderStyle.THIN);
        XSSFFont head1Font = workbook.createFont();
        head1Font.setFontHeightInPoints((short) 20);
        head1Font.setFontName("宋体");
        head1Font.setBold(true);
        head1Style.setFont(head1Font);
        head1.setCellStyle(head1Style);

        XSSFCellStyle head2Style = workbook.createCellStyle();
        head2Style.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        head2Style.setAlignment(HorizontalAlignment.CENTER);
        head2Style.setBorderBottom(BorderStyle.THIN);
        head2Style.setBorderTop(BorderStyle.THIN);
        head2Style.setBorderLeft(BorderStyle.THIN);
        head2Style.setBorderRight(BorderStyle.THIN);
        head2Style.setWrapText(true);
        XSSFFont head2Font = workbook.createFont();
        head2Font.setFontHeightInPoints((short) 10);
        head2Font.setFontName("宋体");
        head2Font.setBold(false);
        head2Style.setFont(head2Font);
        head2_1.setCellStyle(head2Style);
        head2_2.setCellStyle(head2Style);
        head2_3.setCellStyle(head2Style);
        head2_4.setCellStyle(head2Style);
        head2_5.setCellStyle(head2Style);
        head2_6.setCellStyle(head2Style);
        head2_7.setCellStyle(head2Style);
        head2_8.setCellStyle(head2Style);
        head2_9.setCellStyle(head2Style);
        head2_10.setCellStyle(head2Style);
        head2_11.setCellStyle(head2Style);
        head2_12.setCellStyle(head2Style);
        head2_13.setCellStyle(head2Style);
        head2_14.setCellStyle(head2Style);
        head2_15.setCellStyle(head2Style);
        head2_16.setCellStyle(head2Style);
        head2_17.setCellStyle(head2Style);
        head2_18.setCellStyle(head2Style);
        head2_19.setCellStyle(head2Style);
        head2_20.setCellStyle(head2Style);
        head2_21.setCellStyle(head2Style);
        head2_22.setCellStyle(head2Style);
        head2_23.setCellStyle(head2Style);
        head2_24.setCellStyle(head2Style);
        head2_25.setCellStyle(head2Style);

        XSSFCellStyle head3Style = workbook.createCellStyle();
        head3Style.setAlignment(HorizontalAlignment.CENTER);
        XSSFFont head3Font = workbook.createFont();
        head3Font.setFontHeightInPoints((short) 10);
        head3Font.setFontName("宋体");
        head3Font.setBold(false);
        head3Style.setBorderTop(BorderStyle.THIN);
        head3Style.setBorderTop(BorderStyle.THIN);
        head3Style.setBorderTop(BorderStyle.THIN);
        head3Style.setBorderTop(BorderStyle.THIN);//设置边框
        head3Style.setFont(head3Font);
        head3_1.setCellStyle(head2Style);
        head3_2.setCellStyle(head2Style);
        head3_3.setCellStyle(head2Style);
        head3_4.setCellStyle(head2Style);
        head3_5.setCellStyle(head2Style);
        head3_6.setCellStyle(head2Style);
        head3_7.setCellStyle(head2Style);
        head3_8.setCellStyle(head2Style);
        head3_9.setCellStyle(head2Style);
        head3_10.setCellStyle(head2Style);
        head3_11.setCellStyle(head2Style);
        head3_12.setCellStyle(head2Style);
        head3_13.setCellStyle(head2Style);
        head3_14.setCellStyle(head2Style);
        head3_15.setCellStyle(head2Style);
        head3_16.setCellStyle(head2Style);
        head3_17.setCellStyle(head2Style);
        head3_18.setCellStyle(head2Style);
        head3_19.setCellStyle(head2Style);
        head3_20.setCellStyle(head2Style);
        head3_21.setCellStyle(head2Style);
        head3_22.setCellStyle(head2Style);
        head3_23.setCellStyle(head2Style);
        head3_24.setCellStyle(head2Style);
        head3_25.setCellStyle(head2Style);

        XSSFCellStyle head4Style = workbook.createCellStyle();
        head4Style.setAlignment(HorizontalAlignment.CENTER);
        XSSFFont head4Font = workbook.createFont();
        head4Font.setFontHeightInPoints((short) 10);
        head4Font.setFontName("宋体");
        head4Font.setBold(false);
        head4Style.setBorderTop(BorderStyle.THIN);
        head4Style.setBorderBottom(BorderStyle.THIN);
        head4Style.setBorderLeft(BorderStyle.THIN);
        head4Style.setBorderRight(BorderStyle.THIN);//设置边框
        head4Style.setFont(head4Font);
        head4_1.setCellStyle(head4Style);
        head4_2.setCellStyle(head4Style);
        head4_3.setCellStyle(head4Style);
        head4_4.setCellStyle(head4Style);
        head4_5.setCellStyle(head4Style);
        head4_6.setCellStyle(head4Style);
        head4_7.setCellStyle(head4Style);
        head4_8.setCellStyle(head4Style);
        head4_9.setCellStyle(head4Style);
        head4_10.setCellStyle(head4Style);
        head4_11.setCellStyle(head4Style);
        head4_12.setCellStyle(head4Style);
        head4_13.setCellStyle(head4Style);
        head4_14.setCellStyle(head4Style);
        head4_15.setCellStyle(head4Style);
        head4_16.setCellStyle(head4Style);
        head4_17.setCellStyle(head4Style);
        head4_18.setCellStyle(head4Style);
        head4_19.setCellStyle(head4Style);
        head4_20.setCellStyle(head4Style);
        head4_21.setCellStyle(head4Style);
        head4_22.setCellStyle(head4Style);
        head4_23.setCellStyle(head4Style);
        head4_24.setCellStyle(head4Style);
        head4_25.setCellStyle(head4Style);

        XSSFCellStyle dataStyle = workbook.createCellStyle();
        XSSFFont dataFont = workbook.createFont();
        dataFont.setFontHeightInPoints((short) 9);
        dataStyle.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        dataStyle.setAlignment(HorizontalAlignment.CENTER);
        dataFont.setFontName("宋体");
        dataStyle.setBorderTop(BorderStyle.THIN);
        dataStyle.setBorderBottom(BorderStyle.THIN);
        dataStyle.setBorderLeft(BorderStyle.THIN);
        dataStyle.setBorderRight(BorderStyle.THIN);//设置边框
        head2Style.setWrapText(true);
        dataFont.setBold(false);
        dataStyle.setFont(dataFont);
        for (int i = 0; i < data.size(); i++) {
            Map<Character, String> data1 = data.get(i);
            XSSFRow rowdata = sheet.createRow(i + 4);
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
            XSSFCell O = rowdata.createCell(14);
            XSSFCell P = rowdata.createCell(15);
            XSSFCell Q = rowdata.createCell(16);
            XSSFCell R = rowdata.createCell(17);
            XSSFCell S = rowdata.createCell(18);
            XSSFCell T = rowdata.createCell(19);
            XSSFCell U = rowdata.createCell(20);
            XSSFCell V = rowdata.createCell(21);
            XSSFCell W = rowdata.createCell(22);
            XSSFCell X = rowdata.createCell(23);
            XSSFCell Y = rowdata.createCell(24);
            rowdata.setHeightInPoints(30);

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
            O.setCellValue(data1.get('O'));
            O.setCellStyle(dataStyle);
            P.setCellValue(data1.get('P'));
            P.setCellStyle(dataStyle);
            Q.setCellValue(data1.get('Q'));
            Q.setCellStyle(dataStyle);
            R.setCellValue(data1.get('R'));
            R.setCellStyle(dataStyle);
            S.setCellValue(data1.get('S'));
            S.setCellStyle(dataStyle);
            T.setCellValue(data1.get('T'));
            T.setCellStyle(dataStyle);
            U.setCellValue(data1.get('U'));
            U.setCellStyle(dataStyle);
            V.setCellValue(data1.get('V'));
            V.setCellStyle(dataStyle);
            W.setCellValue(data1.get('W'));
            W.setCellStyle(dataStyle);
            X.setCellValue(data1.get('X'));
            X.setCellStyle(dataStyle);
            Y.setCellValue(data1.get('Y'));
            Y.setCellStyle(dataStyle);

        }
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.flush();
        out.close();

    }

}
