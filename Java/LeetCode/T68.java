package Java.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T68 {
    public static void main(String[] args) {
        String[] words = {"a"};
        int maxWidth = 1;
        System.out.println(fullJustify(words, maxWidth));
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        //words单词个数
        int wordsLength = words.length;
        //words中每个单词的长度
        int[] wordLengths = new int[300];

        for (int i = 0; i < wordsLength; i++) {
            wordLengths[i] = words[i].length();
        }


        //结果集每行单词个数
        int[] numbers = new int[300];
        //每行空格数
        int[] spaceNum = new int[300];
        //每行单词长度
        int num = 0;
        //行数
        int row = 0;
        //每行单词个数&&每行空格数
        for (int i = 0; i < wordsLength; i++) {
            if (num + wordLengths[i] > maxWidth) {
                //重置每行单词长度
                num = 0;
                //计算每行应加空格数
                spaceNum[row] = maxWidth-spaceNum[row];
                row++;
            }
            //每一行单词个数++
            numbers[row]++;
            //每一行长度+=
            spaceNum[row]+=words[i].length();
            //单词之间加空格
            num+=wordLengths[i]+1;
        }
        //计算每行应加空格数
        spaceNum[row] = maxWidth-spaceNum[row];

        //所在行
        row = 0;
        //当前单词数
        num = 0;
        //当前行单词数
        int numRow = 0;
        //临时变量String
        String temp = "";
//        if(numbers.length == 1){
//            temp+=words[row]+toSpace(spaceNum[row]);
//            result.add(temp);
//        }else{
            while(numbers[row]>0){

                //最后一行
                if(numbers[row+1] == 0){
                    //不是最后一个单词
                    if(num<wordsLength-1){
//                    result.set(row, result.get(row)+words[num]+" ");
                        temp+=words[num]+" ";
                        System.out.println(temp);
                        num++;
                        numRow++;
                    }
                    //最后一个单词
                    else if(num == wordsLength-1){
                        temp+=words[num];
                        num++;
                        numRow++;
                        temp+=toSpace(spaceNum[row]-numbers[row]+1);
                    }


                }
                //非最后一行且多于一个单词
                else if(numbers[row]>1){
                    int n = (spaceNum[row])/(numbers[row]-1);
                    int m = (spaceNum[row])%(numbers[row]-1);
                    System.out.println(numRow);
                    if(m>=numRow+1){
                        temp+=words[num]+toSpace(n+1);
                    }else{
                        if(numRow == numbers[row]-1){
                            temp+=words[num];
                        }else {
                            temp += words[num] + toSpace(n);
                        }
                    }

                    num++;
                    numRow++;
                }
                //非最后一行且等于一个单词
                else if(numbers[row] == 1){
//                result.set(row, result.get(row)+words[num]+toSpace(maxWidth-words[num].length()));
                    temp+=words[num]+toSpace(maxWidth-words[num].length());
                    num++;
                    numRow++;
                }

                if(numRow>=numbers[row]){
                    System.out.println(temp);
                    result.add(temp);
                    temp = "";
                    row++;
                    numRow = 0;
                }
            }
//        }



        return result;
    }

    public static String toSpace(int size){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
