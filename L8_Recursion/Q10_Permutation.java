public class Q10_Permutation{
    public static void PrintPerm(String str,String Permutation){
        if(str.length()==0){
            System.out.println(Permutation);
        }
        for(int i =0;i<str.length();i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            PrintPerm(newStr, Permutation+curChar);

        }
    }
    public static void main(String[] args){
        String str = "abcd";
        PrintPerm(str,"");
    }
}