package ex01;

public class controller {
	public int multsoma (int A, int B, int aux){
		if (A==0) {
			return aux;
		}else {
			aux = aux+B;
			return multsoma(A-1, B, aux);
		}
	}
}