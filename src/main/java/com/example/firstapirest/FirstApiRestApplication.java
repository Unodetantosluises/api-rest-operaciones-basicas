package com.example.firstapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApiRestApplication {

	public static float suma(float a, float b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int multiplicacion(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static String calculaMayor(int a, int b) {
		if (a == b) {
			return "Son iguales";
		}
		return "Es mayor " + (a > b ? a : b);
	}


	public static void main(String[] args) {
		SpringApplication.run(FirstApiRestApplication.class, args);
	}
}
