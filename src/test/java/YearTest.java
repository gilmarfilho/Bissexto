import Year.Verifier;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gilmar-Filho on 04/10/2017.
 */
public class YearTest {
    Verifier verifier = new Verifier();

    @Test
    public void test400LeapYear1(){
        Assert.assertTrue(verifier.isLeapYear(1600));
    }

    @Test
    public void test400LeapYear2(){
        Assert.assertTrue(verifier.isLeapYear(2000));
    }

    @Test
    public void test400LeapYear3(){
        Assert.assertTrue(verifier.isLeapYear(2400));
    }

    @Test
    public void test400LeapYear4(){
        Assert.assertTrue(verifier.isLeapYear(2800));
    }

    @Test
    public void test400LeapYear5(){
        Assert.assertTrue(verifier.isLeapYear(3200));
    }

    @Test
    public void test4LeapYear1(){
        Assert.assertTrue(verifier.isLeapYear(1996));
    }

    @Test
    public void test4LeapYear2(){
        Assert.assertTrue(verifier.isLeapYear(2004));
    }

    @Test
    public void test4LeapYear3(){
        Assert.assertTrue(verifier.isLeapYear(2008));
    }

    @Test
    public void test4LeapYear4(){
        Assert.assertTrue(verifier.isLeapYear(2012));
    }

    @Test
    public void test4LeapYear5(){
        Assert.assertTrue(verifier.isLeapYear(2016));
    }

    @Test
    public void notLeapYear1(){
        Assert.assertFalse(verifier.isLeapYear(1999));
    }

    @Test
    public void notLeapYear2(){
        Assert.assertFalse(verifier.isLeapYear(2001));
    }

    @Test
    public void notLeapYear3(){
        Assert.assertFalse(verifier.isLeapYear(2002));
    }

    @Test
    public void notLeapYear4(){
        Assert.assertFalse(verifier.isLeapYear(2003));
    }

    @Test
    public void notLeapYear5(){
        Assert.assertFalse(verifier.isLeapYear(2005));
    }
}
