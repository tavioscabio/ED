package Ex01;

import javax.swing.JOptionPane;

//1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
//multiplicação de A por B.


public class Main {
	public static void main(String[] args) {
		
	controller inst = new controller ();	
		
	int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para A"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para B"));
	int aux = 0;	
		int resultado = inst.multsoma(a,b,aux);
		
		System.out.println(resultado);
	}

}
