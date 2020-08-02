import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binaryexponent{
    
    public static void main(String [] args){
        try{
        Scanner in=new Scanner(System.in);
        int n =in.nextInt();
        in.nextLine();
        List<Character> results=new ArrayList<>();
        for(int i=0;i<n;i++){
            String separated_values=in.nextLine();
            separated_values=separated_values.trim();
            String[] input_values=separated_values.split("\\s+");
            long result=lastDigit(Long.parseLong(String.valueOf(input_values[0])),Long.parseLong(String.valueOf(input_values[1])));
            results.add(String.valueOf(result).charAt(String.valueOf(result).length()-1));

        }
        for(Character values:results){
            System.out.println(values);
        }

        


        in.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }


    }

    static long lastDigit(long a,long b){
        if(a==0){
            return 0;

        }
        if (b==0){
            return a;
        }
        long result=lastDigit(a, b/2);
        if (b%2==0){
            return result*result;
        }
        else{
            return result*result*a;
        }




    }
}