import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Contador c = new Contador();
        boolean continuar = true;
      
        while(continuar){
        System.out.println("O que você quer fazer com seu contador? ([1]incrementar [2]zerar [3]retornar valor)");
        int opcao = sc.nextInt();

        if(opcao == 1){
            c.Incrementar();
        }
        if(opcao == 2){
            c.Zerar();
        }
        if(opcao == 3){
            c.ObterValor();
        }
        
        System.out.println("Você quer continuar ? ([y] ou [n])");
        String novo = sc.next();

        if (novo.equals("n")){
            continuar = false;
            System.out.println("Fim do programa!");
        }
 
    }   
  }
}
