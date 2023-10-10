package Java;

public class T58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int num = 0;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i-1) == ' ' && s.charAt(i) != ' '){
                num = 0;
            }else if(s.charAt(i) != ' '){
                num++;
            }

        }
        return num+1;
    }
}
