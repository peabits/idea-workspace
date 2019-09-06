
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import org.junit.Test;

public class ITest {

    @Test
    public void convertToSimple() {
        String original = "生命不息，奮鬥不止";
        String result = ZhConverterUtil.convertToSimple(original);
        System.out.println(result);
    }

    @Test
    public void convertToTraditional() {
        String original = "生命不息，奋斗不止";
        String result = ZhConverterUtil.convertToTraditional(original);
        System.out.println(result);
    }

}
