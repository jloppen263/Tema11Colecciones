package ejercicio10;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public void show() {
		
		
	       Scanner scanner = new Scanner(System.in);
	        Stack<Byte> pila = new Stack<>();
	        byte elemento;
	        int opcion = 0;
	        
	        while(opcion != 6) {
	            System.out.println("Selecciona una opción:");
	            System.out.println("1. Nueva pila");
	            System.out.println("2. Consultar elemento");
	            System.out.println("3. Añadir elemento");
	            System.out.println("4. Eliminar elemento");
	            System.out.println("5. Consultar toda la pila");
	            System.out.println("6. Salir");
	            opcion = scanner.nextInt();
	            
	            switch(opcion) {
	                case 1:
	                    pila.clear();
	                    System.out.println("Nueva pila creada.");
	                    break;
	                case 2:
	                    if(pila.isEmpty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        System.out.println("El elemento en la cima de la pila es: " + pila.peek());
	                    }
	                    break;
	                case 3:
	                    System.out.println("Introduce el elemento a añadir:");
	                    elemento = scanner.nextByte();
	                    pila.push(elemento);
	                    System.out.println("Elemento añadido a la pila.");
	                    break;
	                case 4:
	                    if(pila.isEmpty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        elemento = pila.pop();
	                        System.out.println("Elemento eliminado de la pila: " + elemento);
	                    }
	                    break;
	                case 5:
	                    if(pila.isEmpty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        System.out.println("Elementos en la pila:");
	                        for(Byte b : pila) {
	                            System.out.println(b);
	                        }
	                    }
	                    break;
	                case 6:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	                    break;
	            }
	        }
	        
	        scanner.close();
		
	}

}
