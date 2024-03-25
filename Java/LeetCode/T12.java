package Java.LeetCode;

public class T12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    public static StringBuilder intToRoman(int num){
        String[] symbol = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i<13){
            if(num<nums[i])
                i++;
            else{
                num-=nums[i];
                sb.append(symbol[i]);
            }
        }
        return sb;
    }
}
