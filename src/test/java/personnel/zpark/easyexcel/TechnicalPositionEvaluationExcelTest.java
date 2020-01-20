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
 * @Date 2020/1/15 18:50
 * @Version 1.0
 */
public class TechnicalPositionEvaluationExcelTest {
List<Map<Character,String>> data;
String i = "2020";
    @Before
    public void setUp() throws Exception {
        data = new ArrayList<>();
        Map map = new HashMap<Character,String>();
        map.put('A',"SAJDOIJAD");
        map.put('T',"dsadada");
        Map map1 = new HashMap<>();
        map1.put('A',"SAJDOIJAD");
        map1.put('Z',"dsadada");
        data.add(map);
        data.add(map1);


    }

    @Test
    public void writeToExcel() throws IOException {{

        TechnicalPositionEvaluationExcel.writeToExcel(new File("C:\\Users\\83876\\Desktop\\sam.xlsx"),i,data);
    }
    }
}