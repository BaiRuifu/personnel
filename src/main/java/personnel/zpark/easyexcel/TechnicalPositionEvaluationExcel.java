package personnel.zpark.easyexcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**将专业技术职务评聘申报人员汇总表的数据写入到Excel
 *
 * @Author BaiRuifu
 * @Date 2020/1/14 13:24
 * @Version 1.0
 */
public class TechnicalPositionEvaluationExcel {
    public static void  writeToExcel(File file, String year, List<Map<Character,String>>data) throws IOException {
        int temp = 0;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("总表");
        temp = 0;
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 10 * 256);
        sheet.setColumnWidth(temp++, 18 * 256);
        sheet.setColumnWidth(temp++, 17 * 256);
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 18 * 256);
        sheet.setColumnWidth(temp++, 26 * 256);
        sheet.setColumnWidth(temp++, 12 * 256);
        sheet.setColumnWidth(temp++, 19 * 256);
        sheet.setColumnWidth(temp++, 11 * 256);
        sheet.setColumnWidth(temp++, 16 * 256);
        sheet.setColumnWidth(temp++, 16 * 256);
        sheet.setColumnWidth(temp++, 16 * 256);
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 9 * 256);
        sheet.setColumnWidth(temp++, 20 * 256);
        sheet.setColumnWidth(temp++, 13 * 256);
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 7 * 256);
        sheet.setColumnWidth(temp++, 13 * 256);
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


        head1.setCellValue(year+"年专业技术职务评聘申报人员汇总表");
        head2_1.setCellValue("序号");
        head2_2.setCellValue("类别");
        head2_3.setCellValue("部门");
        head2_4.setCellValue("姓名");
        head2_5.setCellValue("性别");
        head2_6.setCellValue("现岗位");
        head2_7.setCellValue("拟申报专业技术职务");
        head2_8.setCellValue("参评学历");
        head2_9.setCellValue("毕业学校");
        head2_10.setCellValue("毕业时间");
        head2_11.setCellValue("所学专业");
        head2_12.setCellValue("从事专业");
        head2_13.setCellValue("现专业技术职务");
        head2_14.setCellValue("取得资格时间");
        head2_15.setCellValue("聘任时间");
        head2_16.setCellValue("身份证号");
        head2_17.setCellValue("电话号码");
        head2_18.setCellValue("校内小号");
        head2_19.setCellValue("组别");
        head2_20.setCellValue("备注");

        CellRangeAddress head1Address = new CellRangeAddress(0,0,0,19);
        sheet.addMergedRegion(head1Address);

        XSSFCellStyle head1Style = workbook.createCellStyle();
        head1Style.setAlignment(HorizontalAlignment.CENTER);
        XSSFFont head1Font = workbook.createFont();
        head1Font.setFontHeightInPoints((short) 20);
        head1Font.setFontName("宋体");
        head1Font.setBold(true);
        head1Style.setFont(head1Font);
        head1.setCellStyle(head1Style);

        XSSFCellStyle head2Style = workbook.createCellStyle();
        head2Style.setAlignment(HorizontalAlignment.CENTER);
        head2Style.setBorderBottom(BorderStyle.THIN);
        head2Style.setBorderTop(BorderStyle.THIN);
        head2Style.setBorderLeft(BorderStyle.THIN);
        head2Style.setBorderRight(BorderStyle.THIN);
        XSSFFont head2Font = workbook.createFont();
        head2Font.setFontHeightInPoints((short) 12);
        head2Font.setFontName("宋体");
        head2Font.setBold(true);
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
        head2_19.setCellStyle(head2Style);
        head2_20.setCellStyle(head2Style);
//以下数据写内容
        XSSFCellStyle dataStyle = workbook.createCellStyle();
        XSSFFont dataFont = workbook.createFont();
        dataFont.setFontHeightInPoints((short) 10);
        dataStyle.setBorderTop(BorderStyle.THIN);
        dataStyle.setBorderBottom(BorderStyle.THIN);
        dataStyle.setBorderLeft(BorderStyle.THIN);
        dataStyle.setBorderRight(BorderStyle.THIN);//设置边框
        dataFont.setFontName("宋体");
        dataFont.setBold(false);
        dataStyle.setFont(dataFont);
        for (int i = 0;i<data.size();i++){
            Map<Character, String> data1 = data.get(i);
            XSSFRow rowdata = sheet.createRow(i + 2);
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
        }
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.flush();
        out.close();
    }
}
