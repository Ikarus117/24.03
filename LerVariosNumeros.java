import javax.swing.JOptionPane;

public class LerVariosNumeros{

   public static void main(String [] args){
   
   int n1 = 0;
   n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
   
   if ((n1 >= 100 && n1 <= 200)){
      System.out.println ("Ele esta entre 100 e 200");
      }else 
      System.out.println ("Ele nao esta entre 100 e 200");
   }
}