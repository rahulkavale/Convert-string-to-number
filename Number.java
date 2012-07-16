/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/16/12
 * Time: 5:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Number {
        private int value,nvalue;
        private String numberInWords;
        private int pv, fv;
        public Number(String v){
            int i = 0;
            String[] st = v.split("thousand");

            int val[]=new int[st.length];
            numberInWords = "" + v;
            System.out.println("st.length="+st.length);

            while (i < st.length) {
                String[] st1 = st[i].split(" ");
                int k = 0;
                System.out.println("st[" + i + "]" + st[i]);
                while(k<st1.length)
                {
                    System.out.println("st1[" + k + "]" + st1[k]);
                    k++;
                }
                k=0;
                pv=0;fv=1;
                while (k < st1.length) {
                    System.out.println("working "+st1[k]);
                    if(isPlace(st1[k])){
                        fv=getPlace(st1[k]);
                        value*=fv;
                        System.out.println(" fv="+ fv+" value="+value);
                    }
                    else{
                        pv=getInt(st1[k]);
                        value+=pv;
                        System.out.println("pv=" + pv +" value="+value);
                    }
                    k++;
                }
                val[i]=value;
                value=0;
                if(st.length==1){
                    break;
                }
                i++;
            }
            if(st.length==1){
                nvalue=val[0];
            }
            else{
                nvalue=val[0]*1000+val[1];
            }
            if(nvalue>999999){
                System.out.println("Out of range Number");
                System.exit(-1);
            }
            System.out.println("Final value is " + nvalue);
        }
        public int getValue() {
            return value;
        }
        public int getnValue() {
            return nvalue;
        }
        public static boolean isPlace(String t)
        {
            if(t.equalsIgnoreCase("hundred")||t.equalsIgnoreCase("thousand"))
                return true;
            else
                return false;
        }
        public static int getInt(String st) {
            if (st.equalsIgnoreCase("One")) {
                return 1;
            } else if (st.equalsIgnoreCase("Two")) {
                return 2;
            } else if (st.equalsIgnoreCase("Three")) {
                return 3;
            } else if (st.equalsIgnoreCase("Four")) {
                return 4;
            } else if (st.equalsIgnoreCase("Five")) {
                return 5;
            } else if (st.equalsIgnoreCase("Six")) {
                return 6;
            } else if (st.equalsIgnoreCase("Seven")) {
                return 7;
            } else if (st.equalsIgnoreCase("eight")) {
                return 8;
            } else if (st.equalsIgnoreCase("Nine")) {
                return 9;
            } else if (st.equalsIgnoreCase("ten")) {
                return 10;
            } else if (st.equalsIgnoreCase("Zero")) {
                return 0;
            } else if (st.equalsIgnoreCase("eleven")) {
                return 11;
            } else if (st.equalsIgnoreCase("twelve")) {
                return 12;
            } else if (st.equalsIgnoreCase("thirteen")) {
                return 13;
            } else if (st.equalsIgnoreCase("fourteen")) {
                return 14;
            } else if (st.equalsIgnoreCase("fiftenn")) {
                return 15;
            } else if (st.equalsIgnoreCase("sixteen")) {
                return 16;
            } else if (st.equalsIgnoreCase("seventeen")) {
                return 17;
            } else if (st.equalsIgnoreCase("eighteen")) {
                return 18;
            } else if (st.equalsIgnoreCase("nintenn")) {
                return 19;
            } else if (st.equalsIgnoreCase("Twenty")) {
                return 20;
            } else if (st.equalsIgnoreCase("Thirty")) {
                return 30;
            } else if (st.equalsIgnoreCase("Fourty")) {
                return 40;
            } else if (st.equalsIgnoreCase("Fifty")) {
                return 50;
            } else if (st.equalsIgnoreCase("Sixty")) {
                return 60;
            } else if (st.equalsIgnoreCase("Seventy")) {
                return 70;
            } else if (st.equalsIgnoreCase("Eighty")) {
                return 80;
            } else if (st.equalsIgnoreCase("Ninety")) {
                return 90;
            }
            else if (st.equalsIgnoreCase("and")) {
                return 0;
            }
            else if (st.equalsIgnoreCase("only")) {
                return 0;
            }
            else
            {
                System.out.println(st+" not valid");
            }
            return 0;
        }
        public int getPlace(String str) {
            if (str.equalsIgnoreCase("hundred")) {
                return 100;
            } else if (str.equalsIgnoreCase("thousand")) {
                return 1000;
            } else if (str.endsWith("ty")) {
                int x = getInt(str);
                fv = 1;
                return x;
            } else {
                pv = 1;
            }
            return getInt(str);
        }
        public int add(Number n)
        {
            return nvalue+n.nvalue;
        }
        public int multiply(Number n)
        {
            return nvalue*n.nvalue;
        }
        public int substract(Number n)
        {
            return nvalue-n.nvalue;
        }
    }
