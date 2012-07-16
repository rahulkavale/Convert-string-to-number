import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/16/12
 * Time: 5:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class testNumberNew {
    @Test
    public void testNumberSingleWord(){
        NumberNew ten=new NumberNew("ten");
        Assert.assertEquals(10,ten.valueInNumbers());
    }
    @Test
    public void testTwoNumbersEqualsDifferentNumbers(){
        NumberNew ten=new NumberNew("ten");
        Assert.assertNotSame(1, ten.valueInNumbers());
    }
    @Test
    public void testThreeDigitNumberEquality(){
        NumberNew number=new NumberNew("One hundred ninety six");
        Assert.assertEquals(196,number.valueInNumbers());
    }
    @Test
    public void testTwoThreeDigitNumbersEqualsDifferentNumbers(){
        NumberNew twohundred=new NumberNew("two hundred");
        Assert.assertNotSame(100, twohundred.valueInNumbers());
    }
    @Test
    public void testFourDigitNumberEquality(){
        NumberNew number=new NumberNew("one thousand fourty one");
        Assert.assertEquals(1041,number.valueInNumbers());
    }
    @Test
    public void testFourDigitNumberEqualityAgain(){
        NumberNew number=new NumberNew("nine thousand two hundred fourty eight");
        Assert.assertEquals(9248,number.valueInNumbers());
    }
    @Test
    public void testFiveDigitNumberEquality(){
        NumberNew number=new NumberNew("ninety one thousand two hundred fourty eight");
        Assert.assertEquals(91248,number.valueInNumbers());
    }
    @Test
         public void testSixDigitNumberEquality(){
        NumberNew number=new NumberNew("one hundred ninety one thousand two hundred fourty eight");
        Assert.assertEquals(191248,number.valueInNumbers());
    }
    @Test
    public void testSixDigitNumberEqualityAgain(){
        NumberNew number=new NumberNew("one hundred thousand");
        Assert.assertEquals(100000,number.valueInNumbers());
    }
}
