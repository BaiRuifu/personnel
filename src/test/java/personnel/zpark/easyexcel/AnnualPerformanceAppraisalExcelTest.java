package personnel.zpark.easyexcel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**Character是哪一列 String是内容 i为年份
 * @Author BaiRuifu
 * @Date 2020/1/14 12:05
 * @Version 1.0
 */
class AnnualPerformanceAppraisalExcelTest {
    List<Map<Character,String>> data;
String i = "2020";
    @BeforeEach
    void setUp() {
        data = new ArrayList<>();
        Map map = new HashMap<Character,String>();
        map.put('A',"ajsoijd");
        map.put('N',"ajsoijd");
        Map map1 = new HashMap<Character,String>();
        map1.put('A',"ajsoijd");
        map1.put('N',"ajsoijd");
        data.add(map);
        data.add(map1);


    }

    @Test
    void testWriteToExcel() throws IOException {

AnnualPerformanceAppraisalExcel.writeToExcel(new File("C:\\Users\\83876\\Desktop\\年度绩效考核等次汇总表汇报修改.xlsx"),i,data);
    }
}