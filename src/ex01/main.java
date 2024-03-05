package ex01;

import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
		
	controller inst = new controller ();	
		
	int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para A"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para B"));
	int aux = 0;	
		int resultado = inst.multsoma(a,b,aux);
		System.out.println(resultado);
	}

}