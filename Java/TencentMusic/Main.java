package Java.TencentMusic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();
        char[] strChar = str.toCharArray();
        char[] patternChar = pattern.toCharArray();
//        if(strChar==null || patternChar==null){
//            System.out.println(false);
//        }
        System.out.println(matchStr(strChar, patternChar, strChar.length, patternChar.length));
    }

    private static boolean matchStr(char[] strChar, char[] patternChar, int strNum, int patternNum) {
        if(strNum == strChar.length && patternNum == patternChar.length){
            return true;
        }
        if(strNum!=strChar.length && patternNum==patternChar.length)
            return false;

        if(patternChar.length - patternNum >= 2 && patternChar[patternNum+1]=='*'){
            if(patternChar[patternNum] == '.' || patternChar[patternNum]==strChar[strNum]){
                return matchStr(strChar,patternChar, strNum, patternNum-2) || matchStr(strChar, patternChar, strNum+1, patternNum);
            }
        }
        if (patternChar[patternNum] == '.'){
            return matchStr(strChar, patternChar, strNum+1, patternNum+1);
        }else{
            return patternChar[patternNum]==strChar[strNum] && matchStr(strChar, patternChar, strNum-1, patternNum-1);
        }

//        return false;
    }


}


/**
 * if(strNum == strChar.length && patternNum == patternChar.length){
 *             return true;
 *         }
 *         if(strNum < strChar.length && patternNum == patternChar.length){
 *             return false;
 *         }
 *
 *         if(patternNum+1 < patternChar.length && patternChar[patternNum+1] == '*'){
 *             if((strNum < strChar.length && strChar[strNum] == patternChar[patternNum]) ||
 *                     (strNum < strChar.length && patternChar[patternNum]=='.')){
 *                 return matchStr(strChar, patternChar, strNum+1, patternNum+1) ||
 *                         matchStr(strChar, patternChar, strNum+1, patternNum+1) ||
 *                         matchStr(strChar, patternChar, strNum, patternNum+2);
 *             }else{
 *                 return matchStr(strChar, patternChar, strNum, patternNum +2);
 *             }
 *         }
 *
 *         if((strNum < strChar.length && strChar[strNum] == patternChar[patternNum]) ||
 *             )
 *         return true;
 * */