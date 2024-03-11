package ejercicio11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public void show() {
		
		 Scanner sc = new Scanner(System.in);
	        Stack<Byte> stack = new Stack<>();
	        Queue<Byte> queue = new LinkedList<>();
	        byte elem;

	        int option = 0;
	        do {
	            System.out.println("Menú:");
	            System.out.println("1. Nueva pila");
	            System.out.println("2. Consultar elemento de la pila");
	            System.out.println("3. Añadir elemento a la pila");
	            System.out.println("4. Eliminar elemento de la pila");
	            System.out.println("5. Consultar toda la pila");
	            System.out.println("6. Nueva cola");
	            System.out.println("7. Consultar elemento de la cola");
	            System.out.println("8. Añadir elemento a la cola");
	            System.out.println("9. Eliminar elemento de la cola");
	            System.out.println("10. Consultar toda la cola");
	            System.out.println("11. Salir");
	            System.out.print("Elige una opción: ");
	            option = sc.nextInt();

	            switch (option) {
	                case 1:
	                    stack.clear();
	                    System.out.println("Pila creada.");
	                    break;

	                case 2:
	                    if (stack.empty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        System.out.println("Elemento en la cima de la pila: " + stack.peek());
	                    }
	                    break;

	                case 3:
	                    System.out.print("Introduce el elemento a añadir: ");
	                    elem = sc.nextByte();
	                    stack.push(elem);
	                    System.out.println("Elemento añadido.");
	                    break;

	                case 4:
	                    if (stack.empty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        stack.pop();
	                        System.out.println("Elemento eliminado.");
	                    }
	                    break;

	                case 5:
	                    if (stack.empty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        System.out.println("Contenido de la pila:");
	                        for (int i = stack.size() - 1; i >= 0; i--) {
	                            System.out.println(stack.get(i));
	                        }
	                    }
	                    break;

	                case 6:
	                    queue.clear();
	                    System.out.println("Cola creada.");
	                    break;

	                case 7:
	                    if (queue.isEmpty()) {
	                        System.out.println("La cola está vacía.");
	                    } else {
	                        System.out.println("Primer elemento de la cola: " + queue.peek());
	                    }
	                    break;

	                case 8:
	                    System.out.print("Introduce el elemento a añadir: ");
	                    elem = sc.nextByte();
	                    queue.offer(elem);
	                    System.out.println("Elemento añadido.");
	                    break;

	                case 9:
	                    if (queue.isEmpty()) {
	                        System.out.println("La cola está vacía.");
	                    } else {
	                        queue.poll();
	                        System.out.println("Elemento eliminado.");
	                    }
	                    break;

	                case 10:
	                    if (queue.isEmpty()) {
	                        System.out.println("La cola está vacía.");
	                    } else {
	                        System.out.println("Contenido de la cola:");
	                        for (Byte b : queue) {
	                            System.out.println(b);
	                        }
	                    }
	                    break;

	                case 11:
	                    System.out.println("Hasta luego.");
	                    break;

	                default:
	                    System.out.println();
	            }
	        
	
	        while (true); 
				
			
	        
	}       
	}
