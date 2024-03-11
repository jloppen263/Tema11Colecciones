package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public void show() {

		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int option = 0;
		do {
			System.out.println("Menu:");
			System.out.println("1. Nueva lista");
			System.out.println("2. Número de cadenas");
			System.out.println("3. Añadir cadena");
			System.out.println("4. Eliminar cadena");
			System.out.println("5. Contiene cadena");
			System.out.println("6. Mostrar lista entera");
			System.out.println("7. Salir");
			System.out.print("Seleccione una opción: ");

			option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1:
				list.clear();
				System.out.println("Se ha creado una nueva lista vacía.");
				break;
			case 2:
				System.out.printf("La lista tiene %d cadenas.\n", list.size());
				break;
			case 3:
				System.out.print("Introduzca una cadena: ");
				String newString = scanner.nextLine();
				list.add(newString);
				System.out.printf("La cadena '%s' se ha añadido a la lista.\n", newString);
				break;
			case 4:
				System.out.print("Introduzca el índice de la cadena que desea eliminar: ");
				int index = scanner.nextInt();
				scanner.nextLine(); // Consumir la nueva línea después del número
				if (index >= 0 && index < list.size()) {
					String removedString = list.remove(index);
					System.out.printf("La cadena '%s' se ha eliminado de la lista.\n", removedString);
				} else {
					System.out.println("El índice introducido no es válido.");
				}
				break;
			case 5:
				System.out.print("Introduzca una cadena para buscar en la lista: ");
				String searchString = scanner.nextLine();
				if (list.contains(searchString)) {
					System.out.printf("La cadena '%s' está en la lista.\n", searchString);
				} else {
					System.out.printf("La cadena '%s' no está en la lista.\n", searchString);
				}
				break;
			case 6:
				System.out.println("La lista entera es:");
				for (String string : list) {
					System.out.println(string);
				}
				break;
			case 7:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
				break;
			}
		} while (option != 7);
	}

}
