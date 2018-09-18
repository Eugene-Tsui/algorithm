package Test1;
/*DNA sorting*/

import java.util.Scanner;
public class Test2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int charLong = input.nextInt();
        int charNum = input.nextInt();

        String numString[] = new String[charNum];
        int a[] = new int[charNum];
        input.nextLine();
        for(int i=0;i<charNum;i++){
            a[i]=0;
            numString[i]=input.nextLine();
            for(int j = 0; j < charLong; j++){
                if(numString[i].charAt(j) == 'A'){
                    continue;
                }else if (numString[i].charAt(j) == 'C'){
                    for(int k = j+1; k < charLong; k++){
                        if(numString[i].charAt(k) == 'A'){
                            a[i]++;
                        }
                    }
                }else if (numString[i].charAt(j) == 'G'){
                    for(int k = j+1; k < charLong; k++){
                        if(numString[i].charAt(k) == 'A'|| numString[i].charAt(k) == 'C'){
                            a[i]++;
                        }
                    }
                }else{
                    for(int k = j+1; k < charLong; k++){
                        if(numString[i].charAt(k) != 'T'){
                            a[i]++;
                        }
                    }
                }
            }
        }

        int minSort = 0;
        for(int i = 0; i < charNum; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < charNum; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minSort = j;
                }
            }

            System.out.println(numString[minSort]);

            int tmp = a[i];
            a[i] = a[minSort];
            a[minSort] = tmp;
            String tmpString = numString[i];
            numString[i] = numString[minSort];
            numString[minSort] = tmpString;
        }
    }
}
