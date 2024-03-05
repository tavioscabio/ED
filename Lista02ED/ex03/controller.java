package ex03;

public class controller {
	public int function(int vet[], int tamanho, int par) {
		if(tamanho<=0){
			return par;
		}else {
			if(vet[tamanho-1]%2==0) {
				tamanho = tamanho-1;
				par = par+1;
				return function(vet, tamanho, par);
			}else {
				tamanho = tamanho-1;

				return function(vet,tamanho, par);
			}
		
		}
	}
}
