import java.sql.Array;
import java.util.Arrays;

public class AnagramCheck5{
    public static boolean anagramCheck5(String arg1, String arg2){
        boolean result  = false;
        if(arg1.length() != arg2.length()){
            result = false;
        }

        char[] charArr1 = arg1.toLowerCase().trim().toCharArray();
        char[] charArr2 = arg2.toLowerCase().trim().toCharArray();
        
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        result = Arrays.equals(charArr1, charArr2);

        return result;
    }


    public static void main(String[] args){
        boolean k = anagramCheck5("jsdklfsdlakflsdk", "jsdklfsdlakflsdk");
        boolean k2 = anagramCheck5("jsdklfsdlakflsdk", "h");

        System.out.println("1: "+k+"\n2: "+k2);

    }
}