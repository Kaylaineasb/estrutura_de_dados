package atv2;

public class Soma {
    static int soma(int n){
        if (n==0){
            return 0;
        }else{
            return n + soma(n-1);
        }
    }
}
