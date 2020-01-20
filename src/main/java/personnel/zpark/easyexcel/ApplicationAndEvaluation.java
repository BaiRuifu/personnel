package personnel.zpark.easyexcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**辅导员申报专业技术职务评聘成果呈报表写入Excel
 * @Author BaiRuifu
 * @Date 2020/1/18 9:50
 * @Version 1.0
 */
public class ApplicationAndEvaluation {
    public static void writeToExcel(File file) throws IOException {
        int temp;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("教师和实验系列");
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,14));
        sheet.addMergedRegion(new CellRangeAddress(1,1,0,3));
        sheet.addMergedRegion(new CellRangeAddress(1,1,4,6));
        sheet.addMergedRegion(new CellRangeAddress(1,1,7,10));
        sheet.addMergedRegion(new CellRangeAddress(1,1,11,14));
        sheet.addMergedRegion(new CellRangeAddress(2,2,0,2));
        sheet.addMergedRegion(new CellRangeAddress(2,2,8,10));
        sheet.addMergedRegion(new CellRangeAddress(2,2,11,12));
        sheet.addMergedRegion(new CellRangeAddress(3,3,0,3));
        sheet.addMergedRegion(new CellRangeAddress(3,3,8,9));
        sheet.addMergedRegion(new CellRangeAddress(3,3,10,12));
        sheet.addMergedRegion(new CellRangeAddress(4,4,0,2));
        sheet.addMergedRegion(new CellRangeAddress(4,4,4,5));
        sheet.addMergedRegion(new CellRangeAddress(6,7,0,2));//年度考核
        sheet.addMergedRegion(new CellRangeAddress(5,5,8,9));//聘任年限
        sheet.addMergedRegion(new CellRangeAddress(5,5,0,3));//聘任年限
        sheet.addMergedRegion(new CellRangeAddress(6,6,3,4));
        sheet.addMergedRegion(new CellRangeAddress(6,6,5,6));
        sheet.addMergedRegion(new CellRangeAddress(6,6,7,9));
        sheet.addMergedRegion(new CellRangeAddress(7,7,3,4));
        sheet.addMergedRegion(new CellRangeAddress(7,7,5,6));
        sheet.addMergedRegion(new CellRangeAddress(7,7,7,9));
        sheet.addMergedRegion(new CellRangeAddress(6,7,10,10));
        sheet.addMergedRegion(new CellRangeAddress(6,7,11,12));
        sheet.addMergedRegion(new CellRangeAddress(8,8,0,2));
        sheet.addMergedRegion(new CellRangeAddress(8,8,3,4));
        sheet.addMergedRegion(new CellRangeAddress(8,8,5,9));
        sheet.addMergedRegion(new CellRangeAddress(8,8,11,12));
        sheet.addMergedRegion(new CellRangeAddress(9,9,0,14));





        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.flush();
        out.close();
    }
}
