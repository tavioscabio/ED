package ex02;

import javax.swing.JOptionPane;
public class Main {
  public static void main(String[]Args){
    
    controller chamaa = new controller ();
    int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Insira o Dividendo"));
    int divisor = Integer.parseInt(JOptionPane.showInputDialog("Insira o Divisor"));

    int resto = chamaa.funcao(divisor, dividendo);
    System.out.println(resto);

  }
}