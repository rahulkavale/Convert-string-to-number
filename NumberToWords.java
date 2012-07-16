/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/6/12
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;

public class NumberToWords {
    public static void main(String[] args) {
        try {
            System.out.println("Enter First Number");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String v = br.readLine();
            Number n = new Number(v.trim()+" ");
            System.out.println("Enter Second Number");
            v = ""+br.readLine();
            Number n1 = new Number(v.trim()+" ");
            System.out.println("Enter Operation");
            String op=br.readLine();
            int ans=perform(n,n1,op);
            System.out.println("Answer  " + ans);
            System.out.println();
            System.out.println(charValue(ans));
            System.exit(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static String words(int i)
    {
        switch(i)
        {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twleve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 30:
                return "thirty";
            case 40:
                return "fourty";
            case 50:
                return "fifty";
            case 60:
                return "sixty";
            case 70:
                return "seventy";
            case 80:
                return "eighty";
            case 90:
                return "ninety";
        }
        return "";
    }
    public static String words1(int n,String s)
    {
        String str=words(n);
        if(str.equalsIgnoreCase("zero"))
            return "";
        else
            return words(n)+" "+s;
    }
    public static String charValue(int n)
    {
        String ans="";
        int n1=n/1000;
        int n2=n%1000;
        System.out.println("n1  " + n1);
        System.out.println("n2  " + n2);
        int n11=n1/100;
        int n12=(n1/10)%10;
        int n13=n1%10;
        int n21=n2/100;
        int n22=(n2/10)%10;
        int n23=n2%10;
        System.out.println("n11="+n11+"\nn12="+n12+"\nn13="+n13+"\nn21="+n21+"\nn22="+n22+"\nn23="+n23);
        if(n11!=0&&n12!=0&&n13!=0)//124567
            ans=words1(n11,"hundred ")+words1(n12*10,"")+words1(n13,"thousand ");
        else if(n11!=0&&(n12==0&&n13==0))//100234
            ans=words1(n11,"hundred ")+"thousand ";
        else if(n12!=0&&(n11==0&&n13==0))//010234
            ans=words(n12*10)+"thousand ";
        else if(n13!=0&&(n11==0&&n12==0))//001234
            ans=words(n13)+"thousand ";
        else if((n11!=0&&n12!=0)&&n13==0)//120345
            ans=words1(n11,"hundred ")+words1(n12*10,"")+"thousand ";
        else if((n11!=0&&n12!=0)&&n13==0)//102345
            ans=words1(n11,"hundred ")+words1(n13,"")+"thousand ";
        else if(n11==0&&n12!=0&&n13!=0)//012345
            ans=words1(n12*10,"")+words1(n13,"")+"thousand ";
        else if(n11!=0&&n12==0&&n13!=0)//102345
            ans=words1(n11*10,"hundred ")+words1(n13,"")+"thousand ";
        if(n21!=0&&n22==0&&n23==0)//000100
            ans=ans+""+words1(n21,"hundred ");
        else if(n21==0&&n22!=0&&n23==0)//000010
            ans=ans+""+words1(n22*10," ");
        else if(n21==0&&n22==0&&n23!=0)//000001
            ans=ans+""+" "+words1(n23,"");
        else if(n21==0&&n22!=0&&n23!=0)//000012
        {
            if(words1(n22*10,"").trim().equals("ten"))
                ans=ans+""+words1(n22*10+n23,"");
            else
            {
                ans=ans+""+words1(n22*10,"")+words1(n23,"");
            }
        }
        else if(n21!=0&&n22!=0&&n23!=0)//000123
        {
            if(words1(n22*10,"").trim().equals("ten"))
                ans=ans+""+words1(n21,"hundred ")+words1(n22*10+n23,"");
            else
                ans=ans+""+words1(n21,"hundred ")+words1(n22*10,"")+words1(n23,"");
        }
        else if(n21!=0&&n22==0&&n23!=0)//000103
            ans=ans+""+words1(n21,"hundred ") +words1(n23,"");
        else if(n21!=0&&n22!=0&&n23==0)//000120
            ans=ans+""+words1(n21,"hundred ") +words1(n22*10,"");
        else //000000
            ans="zero";
        return ans;

    }
    public static int perform(Number n1,Number n2,String op)
    {
        int ans=0;
        if(op.equalsIgnoreCase("addition"))
        {
            ans=(n1.add(n2));
            if(ans>=0&&ans<=999999){
                System.out.println("ans " + ans);
                return ans;
            }
            else {
                System.out.println("Ans out of range");
                System.exit(-1);
            }
        }
        else if(op.equalsIgnoreCase("multiplication")){
            ans=(n1.multiply(n2));
            if(ans>=0&&ans<=999999){
                System.out.println("ans " + ans);
                return ans;
            }
            else{
                System.out.println("Ans out of range");
                System.exit(-1);
            }
        }
        else if(op.equalsIgnoreCase("substraction")){
            ans=(n1.substract(n2));
            if(ans>=0&&ans<=999999){
                System.out.println("ans " + ans);
                return ans;
            }
            else{
                System.out.println("Ans out of range");
                System.exit(-1);
            }
        }
        else{
            System.out.println("Enter valid Operation");
            return 0;
        }
        return -1;
    }
}
