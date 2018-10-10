package astro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest


{

    private CalcTest calcTest;

    @Before
    public void setup ()
    {
        calcTest = new CalcTest();
    }


    @Test
    public void testCalcAdd()
    {
//        int result = calcTest.addNumbers(3,5);
//        assertEquals(9,result);
        Assert.assertEquals(8,calcTest.addNumbers(3,5));
        Assert.assertEquals(0,calcTest.addNumbers(1,-1));
        Assert.assertTrue(calcTest.isTrue(false));
    }
}
