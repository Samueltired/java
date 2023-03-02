import java.util.Scanner;
public class aula{
 public static void main(String[]args){

        //exerciocio 03 numero antecessor e sucessor10
   
            Scanner in = new Scanner(System.in);
            int antecessor, sucessor, um_numero;
            System.out.print("Digite o valor do um numero: ");
            um_numero = in.nextInt();
            in.nextLine();
            antecessor=um_numero-1;
            sucessor=um_numero+1;
            System.out.println("O valor do antecessor: " + antecessor);
            System.out.println("O valor do sucessor: " + sucessor);

 }
 
}




