package Java;

public class T833 {
    public static void main(String[] args) {
        String S = "abcd";
        int[] indices = { 0, 2 };
        String[] sources = { "a", "cd" };
        String[] targets = { "eee", "ffff" };
        System.out.println(findReplaceString(S, indices, sources, targets));

    }
    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        //深拷贝

        String s1 = s;
        for (int i = 0; i < indices.length; i++) {
            String str = s.subSequence(indices[i],indices[i]+sources[i].length()).toString();
            System.out.println(str);
            if(sources[i].equals(str)){
                s1 = replaceTarget(s1, indices[i],indices[i]+sources[i].length(), targets[i]);
            }
        }
        return s1;
    }
    public static String replaceTarget(String s, int a, int b, String target){
        String s1,s2;
        s1 = s.substring(0, a);
        System.out.println("s1"+s1);
        s2 = s.substring(a+b);
        System.out.println("s2"+s2);
        s = s1+target+s2;
        System.out.println("s:"+s);
        return s;
    }
}
