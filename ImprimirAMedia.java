import javax.swing.JOptionPane;

public class ImprimirAMedia{

   public static void main (String [] args){
   
      int n1, n2, n3, n4, media;
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Numero"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero"));
      n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro Numero"));
      n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Quarto Numero"));
      
      media = (n1 + n2 + n3 + n4)/ 4;
      JOptionPane.showMessageDialog(null, " A media é: " +media);
      
   }
}