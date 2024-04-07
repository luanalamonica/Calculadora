package Calculadora;



	public class CalculadoraBasica extends Calculadora {



	    public double soma(double a, double b) {

	        return a + b;

	    }



	    public double subtracao(double a, double b) {

	        return a - b;

	    }

	    

	    public double produto(double a, double b) {

	        return a * b;

	    }



	    public double divisao(double a, double b) throws Exception {

	        if (b == 0) {

	            throw new Exception("Divisão por zero");

	        }



	        return a / b;

	    }

	}