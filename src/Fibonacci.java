public class Fibonacci {
    static int calcularSequencia(int n){
        if(n<2){
            return n;
        }else{
            return calcularSequencia(n-1)+calcularSequencia(n-2);
        }
    }
}
