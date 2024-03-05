package ex04;

import javax.swing.JOptionPane;

//. Faça uma função recursiva que receba um número inteiro positivo ímpar N e retorne o fatorial duplo 
//desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o 
//produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial 
//duplo de 5 é: 5!! = 1*3*5 = 15.
public class main {
	public static void main(String[] args) {
		
		int valor;
		int fat;
		int aux=1;
		controller fun = new controller ();
		
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor ímpar para calcular o fatorial duplo"));
		}while(valor%2==0);
		
		
		fat = fun.function(valor, aux);
		System.out.println("O fatorial duplo de "+valor+" é: "+fat);
		
	}
}
