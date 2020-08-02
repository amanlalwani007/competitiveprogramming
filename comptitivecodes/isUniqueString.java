import java.util.Arrays;

class isUniqueString {
    public static boolean bruteforce(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean SortingMethod(String str) {
        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);
        for (int i = 0; i < chArray.length - 1; i++) {
            if (chArray[i] != chArray[i + 1])
                continue;
            else
                return false;
        }
        return true;

    }

    public static boolean ExtraDataStructore(String str)
    {
        final static MAX_CHAR=256;
        if(str.length()>MAX_CHAR){
            return false;
        }
        boolean[] chars=new boolean[MAX_CHAR];
        Arrays.fill(chars, false);
        for(int i=0;i<str.length();i++){
            int index=(int)str.charAt(i);
        
        if(chars[index]==true){
            return false;
        }
        chars[index]=true;
}
return true;
    }

    public static boolean optimized_withoususingextrads(String str){
        int checker=0;
        for(int i=0;i<str.length();i++){
            int bitAtindex=str.charAt(i)-'a';
            if((checker&(1<<bitAtindex))>0 ){
                return false;
            }
            checker=checker|(1<<bitAtindex);


        }
        return true;


    }

    public static void main(String[] args) {

    }

}