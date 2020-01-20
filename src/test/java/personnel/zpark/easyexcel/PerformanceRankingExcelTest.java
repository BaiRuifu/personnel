package personnel.zpark.easyexcel;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author BaiRuifu
 * @Date 2020/1/16 17:33
 * @Version 1.0
 */
public class PerformanceRankingExcelTest {
    List<Map<Character,String>>data;
    String i = "2020";

    @Before
    public void setUp() throws Exception {
        data = new ArrayList<>();
        Map map = new HashMap<Character,String>();
        map.put('A',"SAJ");
        map.put('T',"dsaSADA");
        Map map1 = new HashMap<>();
        map1.put('A',"SAJ");
        map1.put('T',"dsadada");
        data.add(map);
        data.add(map1);

    }

    @Test
    public void writeToExcel() throws IOException {
        PerformanceRankingExcel.writeToExcel(new File("C:\\Users\\83876\\Desktop\\sam.xlsx"),i,"教授","理工组",data);
    }
}