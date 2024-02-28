//Criar uma função recursiva que receba o dividendo e o divisor de uma operção de divisão e, por subtrações, exiba o 
//resto da divisão
import javax.swing.JOptionPane;
public class Main {
  public static void main(String[]Args){
    
    controller chamaa = new controller ();
    int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Insira o Dividendo"));
    int divisor = Integer.parseInt(JOptionPane.showInputDialog("Insira o Dividendo"));

    int resto = chamaa.funcao(divisor, dividendo);
    System.out.println(resto);

  }
}
----------------------------------------------------------------------------------------------------------------------------
public class controller{
  public int funcao(int divisor,int dividendo){
    if (divisor<dividendo){
      return dividendo;
    }else{
      dividendo = dividendo - divisor;
      return funcao(dividendo, divisor);
    }
  }  
}
