    
    import javax.swing.JOptionPane;
    public class caixa{

    public static void main (String[]args){

        String nome=null;

        nome= JOptionPane.showInputDialog("QUAL SEU NOME");

        JOptionPane.showConfirmDialog(null,"O seu nome é "+ nome + "?" );

        JOptionPane.showMessageDialog(null,"BEM VINDO"+nome);

        

}



}
    

