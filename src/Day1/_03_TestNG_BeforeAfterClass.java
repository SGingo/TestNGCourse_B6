package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_TestNG_BeforeAfterClass {

    @BeforeClass // will get executed before any @Test gets executed - at the beginning (only 1 time)
    public void beforeClass() {
        System.out.println("Before running any Test!");
    }

    @AfterClass // will get executed after all the @Test are completed - at the very end (only 1 time)
    public void afterClass() {
        System.out.println("After running all Test!");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}
