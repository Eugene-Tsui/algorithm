package Java.LeetCode;

public class T151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  Bob    Loves  Alice   "));
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        int n =str.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >=0; i--) {
            if(!str[i].isEmpty()){
                sb.append(str[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
