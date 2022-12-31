package Microsoft;

public class SumOfN {
    public static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args) {
        int N = 0;
        sum(N=5,0);
    }
}
