import java.util.Scanner;

public class exe4 {
  
    public static void main(String args[]){

        Scanner teclado= new Scanner(System.in);
            System.out.println("digete o valor");
        double valor =teclado.nextDouble();  // valor 100 ,10% de aumento
        double porcentagem=1.01; //1.01% de aumento
        double valor_final=valor +(porcentagem*valor);
        System.out.println("O valor final:"+valor_final);

          

    }
    



}
