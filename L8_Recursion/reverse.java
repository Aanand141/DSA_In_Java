public class reverse {
    public static void main(String[] args) {
        String src = "100";
        String firstsrc = "";
        String Secondsrc= "";
        for(int index=src.length()-1;index>=0;index--){
             firstsrc += src.charAt(index);
             
        }
        System.out.println("first reverse is :"+firstsrc);
        for(int index=firstsrc.length()-1;index>=0;index--){
            Secondsrc += firstsrc.charAt(index);
        }
        System.out.println("The second reverse is :"+Secondsrc);

    }
    
}
