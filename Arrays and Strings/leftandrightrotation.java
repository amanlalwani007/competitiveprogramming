public class leftandrightrotation{
    static String leftrotation(String str,int d){
        String ans=str.substring(d)+str.substring(0,d);
        return ans;
    }
    static String rightrotate(String str,int d){
        return leftrotation(str, str.length-d);
    }

    public static void main(String[] args){
        System.out.println("abc");
    }
}