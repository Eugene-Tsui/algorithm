package Java;

public class T392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        if(t.isEmpty()) return false;
        for (int i = 0,j = 0; j < t.length(); j++) {
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i == s.length()){
                return true;
            }
        }
        return false;
    }
}
