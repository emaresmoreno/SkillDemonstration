import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void test(){
        assertEquals("We expect 4 to be divided by 2", 
        2, SkillDemo.divide(4,2));

    }
    
}
