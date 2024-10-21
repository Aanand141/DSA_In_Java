public class permutation {
    public static void main(String[] args) {
        String str = "abcd";
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(newString, permutation + curChar);
        }
    }
}
