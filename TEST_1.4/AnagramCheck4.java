import java.util.Arrays;

public class AnagramCheck4{

    public static boolean anagramCheck4(String arg1, String arg2){
        boolean result = false;

        if(arg1.length() != arg2.length()){
            result = false;
        }

        //convert to char Array
        char[] argChar1 = arg1.toLowerCase().trim().toCharArray();
        char[] argChar2 = arg2.toLowerCase().trim().toCharArray();
        Arrays.sort(argChar1);
        Arrays.sort(argChar2);

        result = Arrays.equals(argChar1, argChar2);

        return result;
    }

    public static void main(String[] args){
        boolean k = anagramCheck4("jsdklfsdlakflsdk", "jsdklfsdlakflsdk");
        boolean k2 = anagramCheck4("jsdklfsdlakflsdk", "h");

        System.out.println("1: "+k+"\n2: "+k2);

    }
}