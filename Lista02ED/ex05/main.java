package ex05;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		
		controller func = new controller();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		int primo = 1;
		int mdc = func.function(x,y);
		System.out.println("O MDC é: "+mdc);
	}

}
