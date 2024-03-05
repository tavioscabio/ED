package ex02;

public class controller{
	  public int funcao(int divisor,int dividendo){
	    if (divisor>dividendo){
	      return dividendo;
	    }else{
	      dividendo = dividendo - divisor;
	      return funcao(divisor, dividendo);
	    }
	  }  
	}    