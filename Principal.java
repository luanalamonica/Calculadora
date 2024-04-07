package Calculadora;

import java.util.Scanner;



public class Principal {



    public static void main(String[] args) throws Exception {

    	CalculadoraCientifica calculadora = new CalculadoraCientifica();

    	Scanner scanner = new Scanner(System.in);

    	

        System.out.println("Selecione a operação:");

        System.out.println("1 - Soma");

        System.out. println("2 - Subtração"); 

        System.out.println("3 - Multiplicação"); 

        System.out.println("4 - Divisão"); 

        System.out.println("5 - Raiz quadrada"); 

        System.out.println("6 - Potência");

        int operacao = scanner.nextInt();

        

        System.out. print ("Digite o primeiro número: "); 

        double numero1 = scanner.nextDouble(); 

        System.out. print ("Digite o segundo número: "); 

        double numero2 = scanner.nextDouble();



        double resultado = 0; 

        switch (operacao) { 

        case 1: 

        	resultado = calculadora.soma(numero1, numero2);

			break; 

		case 2: 

			resultado = calculadora.subtracao(numero1, numero2); 

			break; 

		case 3: 

			resultado = calculadora.produto(numero1, numero2); 

			break; 

		case 4:  

			resultado = calculadora.divisao (numero1, numero2); 

			break;

		case 5: 

			resultado = calculadora.raizQuadrada (numero1); 

			break; 

		case 6:  

			resultado = calculadora.potencia (numero1, numero2);

			break;

        }

        

        	System.out.println("RESULTADO: "+ resultado);

    }

}