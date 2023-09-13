package Java;

public class T274 {
    public static void main(String[] args) {
        int[] citations = {100};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int h = 0,sum=0;
        int a[] = new int[1005];
        for(int i=0;i<citations.length;i++){
            a[citations[i]]++;
        }
        for(int i=0; i<1005; i++){
            if( citations.length - sum >= i){
                h = i;
            }
            sum += a[i];

        }
        return h;
    }
}
