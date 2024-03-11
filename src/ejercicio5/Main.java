package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public void show() {
		
		List<Float> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int currentIndex = -1;

        int option = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Mostrar la lista");
            System.out.println("2. Mostrar siguiente");
            System.out.println("3. Mostrar anterior");
            System.out.println("4. Añadir elemento");
            System.out.println("5. Eliminar el último mostrado");
            System.out.println("6. Sustituir el último mostrado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número

            switch (option) {
                case 1:
                    System.out.println("La lista es:");
                    for (float number : list) {
                        System.out.println(number);
                    }
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        currentIndex = (currentIndex + 1) % list.size();
                        System.out.printf("El siguiente número es: %f\n", list.get(currentIndex));
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        currentIndex = (currentIndex - 1 + list.size()) % list.size();
                        System.out.printf("El número anterior es: %f\n", list.get(currentIndex));
                    }
                    break;
                case 4:
                    System.out.print("Introduzca el número a añadir: ");
                    float newNumber = scanner.nextFloat();
                    if (list.isEmpty()) {
                        list.add(newNumber);
                        currentIndex = 0;
                    } else {
                        list.add(currentIndex + 1, newNumber);
                        currentIndex++;
                    }
                    System.out.printf("El número %f se ha añadido a la lista.\n", newNumber);
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        float removedNumber = list.remove(currentIndex);
                        currentIndex = (currentIndex - 1 + list.size()) % list.size();
                        System.out.printf("El número %f se ha eliminado de la lista.\n", removedNumber);
                    }
                    break;
                case 6:
                    if (list.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.print("Introduzca el nuevo valor para sustituir: ");
                        float newValue = scanner.nextFloat();
                        list.set(currentIndex, newValue);
                        System.out.printf("El número %f se ha sustituido por %f.\n", list.get(currentIndex), newValue);
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


