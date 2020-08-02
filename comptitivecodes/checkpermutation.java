import java.util.Arrays;

class checkpermutation {

    // nlongn solution
    public static boolean SortingMethod(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 != n2) {
            return false;
        }
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < n1; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;

    }

    //O(n) time complexity algorithm 
    public static boolean Countcharactermethod(char[] str1,char[] str2){
        static int NO_OF_CHARS=256;
        int count1[]=new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[]=new int[NO_OF_CHARS];
        Arrays.fill(count2,0);
        int  i;
        for(i=0;i<str1.length&&i<str2.length;i++){
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        if(str1.length!=str2.length){
            return false;

        }

        for(int i=0;i<NO_OF_CHARS;i++){
            if(count1[i]!=count2[i])
            return false;
        }
        return true;


    }

    //space optimized method to use only one array to increase and decrease counter


    public static void main(String[] args) {
        System.out.println("check permutation code");
    }
}