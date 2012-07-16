import com.sun.deploy.net.proxy.StaticProxyManager;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/10/12
 * Time: 6:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class NumberToWordsTest {
    Number n1,n2;
    @Test
    public void testNumber()
    {
       n1=new Number("one hundred twenty nine thousand thirty three");
        Assert.assertEquals(129033,n1.getnValue());
    }
    @Test
    public void testAddition()
    {
        n1=new Number("one hundred twenty nine thousand thirty three");
        n2=new Number("four hundred thousand two hundred twenty two");
        Assert.assertEquals(529255,n1.add(n2));
    }
    @Test
    public void testSubstraction()
    {
        n1=new Number("one hundred twenty nine thousand thirty three");
        n2=new Number("thirty three");
        Assert.assertEquals(129000,n1.substract(n2));
    }
    @Test
    public void testMultiplication()
    {
        n1=new Number("nine thousand thirty three");
        n2=new Number("three");
        Assert.assertEquals(27099,n1.multiply(n2));
    }
    @Test
    public void testNumberToWords()
    {
        boolean i="twenty seven thousand ninety nine".equals(NumberToWords.charValue(27099).trim());
        Assert.assertEquals(true,i);
    }
 }
