package personnel.zpark.easyexcel;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author BaiRuifu
 * @Date 2020/1/18 18:40
 * @Version 1.0
 */
public class ApplicationAndEvaluationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void writeToExcel() throws IOException {
        ApplicationAndEvaluation.writeToExcel(new File("C:\\Users\\83876\\Desktop\\sam3.xlsx"));
    }
}