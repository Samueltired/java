import java.util.Scanner;

public class Exer5{
    public static void main(String[]args){

        String nome;
        int idade;
        String cpf;

        Scanner teclado=new Scanner(System.in);
        System.out.print(" Digite seu nome ");
        nome=teclado.next();
            System.out.println(nome);
         // quando quiser colocar variavel só ela quando for testo aspas duplas

         System.out.print(" Digite sua idade ");
         idade=teclado.nextInt();
             System.out.println(idade);

             System.out.print(" Digite seu cpf ");
             cpf=teclado.next();
                 System.out.println(idade);

        if (idade>=18){
            System.out.println(nome+"autorização para votar");

        }else{
        System.out.println("não votar");
        }
        





                 System.out.println(nome + idade + cpf);
        

        

    }



}
