package ex05;

public class controller {
	public int function (int x,int y) {
		if(x == y){
			return x; 
		}else {
			if(x>y){
				return function(x-y,y);
		}else {
			return function(y,x);
			}
		
		}
	}

}
