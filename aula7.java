import  javax.swing.JOptionPane;
public class aula7 {
    public static void main (String[]args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(" informe o numero"));
        if (numero % 4 == 0){
                JOptionPane.showMessageDialog(null,"ele é multiplo de 4");
        }else if (numero % 7 == 0){
            JOptionPane.showMessageDialog(null,"ele é multiplo de 7"); 
        }else{
            JOptionPane.showMessageDialog(null,"não é multiplo de 4 nem de 7");  


        }

        }



    }




