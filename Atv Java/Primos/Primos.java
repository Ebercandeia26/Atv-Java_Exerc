package Primos;
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        
        int num ;
        int cont = 0;
        boolean continuar = true;

        Scanner sc = new Scanner(System.in);

        
        while(continuar){
            System.out.println("Digite um número para saber se o mesmo é primo ou não : ");
             num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;
            }
        }
        if (cont == 2){
            System.out.println("O número" + num + "é primo! ");
        }
        else{
            System.out.println("O numero " +  num  + " não é primo! ");
        }
            System.out.println("você quer continuar? ([y] [n])");
            String novo = sc.next();

            if(novo.equals("n")){
                continuar = false;
                System.out.println("Fim do programa!");
            }
            else {
                continuar = true;
            }
        }
    }
}
