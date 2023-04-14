public class Contador{

    public int cont;

    public void Zerar(){
        cont= 0;
        System.out.println("O seu contador foi zerado");
    }

    public void Incrementar(){
        cont++;
        System.out.println("Você incrementou 1 no seu contador ! ");
    }
    
    public void ObterValor(){
        System.out.println("O valor atual do seu contador é : " + cont);
    }
    

}