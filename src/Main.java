import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos desejada");
        int termos = input.nextInt();
        for(int i=1;i<termos+1;i++){
            System.out.println(Fibonacci.calcularSequencia(i));
        }
    }
}