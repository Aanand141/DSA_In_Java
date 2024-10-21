public class Q9_Reverse {
    public static String ReverseString(String src){
        if(src.length()==1){
            return src;
        }
        char currChar = src.charAt(0);
        String nexString = ReverseString(src.substring(1));
        return nexString+currChar;
    }
    public static String DoubleReverseString(String reverse){
        if(reverse.length()==1){
            return reverse;
        }
        char currChar = reverse.charAt(0);
        String nexString = ReverseString(reverse.substring(1));
        return nexString+currChar;
    }
    public static void main(String[] args) {
        String src = "100";
        String reverse = ReverseString(src);
        System.out.println("reversing 1 time "+reverse);
        String doublerevrse = DoubleReverseString(reverse);
        System.out.println("2nd time reverse value is :"+doublerevrse);
    }
}
