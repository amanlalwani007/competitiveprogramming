class URLify{

    //))O(n) time complexity
    static char[] replacespaces(char[] str){
     int space_count=0;
     int i=0;
     static int MAX=1000;
     for(i=0;i<str.length;i++)
     {
      if(str[i]==' ')
      space_count++;
     }
     while(str[i-1]==' '){
         space_count--;
         i--;
     }
     int new_length=i+space_count*2;
     if(new_length>MAX)
     return str;
     int index=new_length-1;
     char[] new_str=str;
     str=new char[new_length];
     for (int j=i-1;j>=0;j--){

        if (new_str[j]==''){
            str[index]='0';
            str[index-1]='2'
            str[index-2];
            index=index-3;
        }
        else{
            str[index]=new_str[j];
            index--;

        }
        return str;
     }

    }






    public static void main(String args[]){
        System.out.println("Abc");
        String str="Mr john Smith";
        str=str.trim();
        str=str.replaceAll("\\s", "%20");
        System.out.println(str);

    }
}