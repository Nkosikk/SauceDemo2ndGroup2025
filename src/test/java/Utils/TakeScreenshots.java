package Utils;

import org.testng.annotations.Test;

public class TakeScreenshots {


    private static final String screenshotDir = System.getProperty("user.dir")+;

    @Test
    public void test(){
        System.out.println(screenshotDir);
    }
}
