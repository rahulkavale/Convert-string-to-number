/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/16/12
 * Time: 5:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class NumberNew {
        private int value;
        private String numberInWords;
        private String words[]=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninghteen","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred","thousand"};
        private int valueInNumber[]=new int[]{0   ,    1,    2,      3,     4,    5,     6,      7,      8,     9,   10,      11,     12,         13,       14,        15,       16,         17,        18,         19,      20,      30,      40,     50,     60,      70,      80,       90,     100,      1000};
        NumberNew(String numberInWords){
            value=0;
            this.numberInWords=numberInWords.toLowerCase();
        }
    private void testWhetherlastThreeDigitsZero(){
        if(numberInWords.endsWith("thousand")){
            numberInWords=numberInWords+" zero";
        }
    }
        public int valueInNumbers(){
            testWhetherlastThreeDigitsZero();
            String wordsArray[]=numberInWords.split("thousand");
            int valueOfSeperatedThreeDigit[]=new int[wordsArray.length];

            int tempValue;
            for(int index=0;index<wordsArray.length;index++){
                String currWord=wordsArray[index];
                valueOfSeperatedThreeDigit[index]=valueOfThreePlaces(currWord.trim());
                System.out.println("currWord "+currWord+"="+valueOfSeperatedThreeDigit[index]);
            }
            if(wordsArray.length>1) {
                return valueOfSeperatedThreeDigit[0]*1000+valueOfSeperatedThreeDigit[1];
            }
            return valueOfSeperatedThreeDigit[0];
        }
    private int getIndexOfWord(String string){
        int index=0;
        for(index=0;index<words.length;index++){
            if(words[index].equalsIgnoreCase(string.trim()))
                return index;
        }
        return 0;
        //throw new RuntimeException("Invalid word");
    }
        public int valueOfThreePlaces(String number){
            String tempWordsArray[]=number.split(" ");
            System.out.println("Inside valueOfThreePlaces");
            for(String currWord:tempWordsArray){
                System.out.println("currWord="+currWord);
            }
            int valueOfWord=0;
            int index=0;
            for(String currWord:tempWordsArray){
                 index=getIndexOfWord(currWord.trim());
                if(!isAPlace(words[index])){
                    valueOfWord+=valueInNumber[index];
                }
                else
                    valueOfWord*=valueInNumber[index];
            }

            return valueOfWord;
        }
    private boolean isAPlace(String word){
        if(word.equals("hundred"))
            return true;
        if (word.equals("thousand"))
            return true;
        return false;
    }
}
