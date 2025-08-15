package aplication;

import java.util.Scanner;

import entities.Triangule;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangule x, y;
		x = new Triangule(); // criando uma variável x com [a, b, c]
		y = new Triangule(); // criando uma variável y com [a, b, c]
		
		System.out.println("Digite os lados do triângulo X: ");
		
		x.a = sc.nextDouble(); //recebendo a entradada de dados
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y: ");
		
		y.a = sc.nextDouble(); //recebendo a entradada de dados
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("O valor do trinãngulo X é: %.4f%n", areaX);
		System.out.printf("O valor do trinãngulo y é: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A área do triângulo X é maior !");			
		}else {
			System.out.println("%nA área do triângulo Y é maior !");			
		}
			
		sc.close();
	}

}
