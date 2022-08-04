package Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_TestNG_BeforeAfterMethod {

    @BeforeMethod // will get executed before each @Test!!!!
    public void beforeMethod() {
        System.out.println("Before each @Test");
    }

    @AfterMethod // will get executed after each @Test!!!!
    public void afterMethod() {
        System.out.println("After each @Test");
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
