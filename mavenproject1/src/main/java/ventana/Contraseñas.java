/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

 import java.util.Random;

import java.util.Scanner;


public class Contraseñas {
    Random random = new Random();
	Scanner sc = new Scanner(System.in);
	String colchon = "AEIOUbcdfghjklmnñpqrstvwxyz1234567890_.-,";
	int x, i, y;

	public void Crear() {
		System.out.println("Cuántas contraseñas necesitas?");
		y = sc.nextInt();

		for (i = 1; i <= y; i++) {
			System.out.println("Contraseña:---------");
			for (x = 1; x <= 8; x++) {
				int ran;
				char car;
				ran = random.nextInt(colchon.length());
				car = colchon.charAt(ran);
				String letra = String.valueOf(car);
				if (colchon.contains(letra))
					;// los valores específicos están en la variable colchón, la utentificación no es
						// necesaria, ni la dimensión
				System.out.println(car);
			}
			System.out.println("Contraseña autenticada");

		}
	}


}
