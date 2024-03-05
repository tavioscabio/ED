package ex04;

public class controller {
	public int function(int valor,int aux) {
		if(valor<=0) {
			return aux;
		}else {
			if(valor%2==0) {
				return function(valor-1, aux);
			}else {
				aux = aux*valor;
				return function(valor-1, aux);
			}
		}
		
	}

}
