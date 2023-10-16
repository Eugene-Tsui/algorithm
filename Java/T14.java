package Java;

public class T14 {
    public static void main(String[] args) {
        String[] strs = { "ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs){
        int n = strs.length;
        int m = strs[0].length();
        String trans = "";
        for (int i = 0; i < n; i++) {
            if(strs[i].length()<m){
                m = strs[i].length();
                trans = strs[i];
            }
        }

        for (int i = 1; i < n; i++) {
            m = Math.min(strs[i].length(),trans.length());
            for(int j=0;j<m;j++){
                if(strs[i].charAt(j) != trans.charAt(j)){
                    trans = trans.substring(0,j);
                    break;
                }
            }
        }

        return trans;
    }
}
