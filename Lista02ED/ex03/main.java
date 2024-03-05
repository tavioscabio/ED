package ex03;

import javax.swing.JOptionPane;

//3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de 
//números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais 
//diferentes de zero.
public class main {
	public static void main(String[] args) {
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho do vetor"));
		int vet[]= new int[tamanho];
		int c = 0;
		int par = 0;
		
		controller function = new controller();
		
		do{
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Escolha um valor para a posição "+c));
			vet[c]=valor;
			c = c+1;
			
		}while(vet.length>c);
		
		par = function.function(vet, tamanho, par);
		System.out.println("O numero de valores pares existente no vetor é: "+par);
		
	}

}
