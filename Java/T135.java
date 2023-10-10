package Java;

public class T135 {
    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings){
        int n = ratings.length;
        int[] a = new int[n];
        a[0] = 1;
        for (int i = 1; i < n; i++) {
            if(ratings[i]>ratings[i-1]){
                a[i] = a[i-1]+1;
            }else{
                a[i] = 1;
            }
        }
        for (int i = n-2; i >=0 ; i--) {
            if(ratings[i]>ratings[i+1]){
                a[i] = Math.max(a[i],a[i+1]+1);
            }else {
                a[i] = Math.max(a[i],1);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
}
