package ejercicio8;

import java.time.LocalDate;
import java.util.*;


public class Main {

	public List<Pelicula> addFilms() {

		List<Pelicula> peliculas = new ArrayList<>();
		peliculas.add(new Pelicula(Genero.TERROR, "Poltergeist, juegos diabólicos", Genero.TERROR,
				LocalDate.of(2015, 5, 22), LocalDate.of(01, 01, 16)));
		peliculas.add(new Pelicula(Genero.TERROR, "La cumbre escarlata", Genero.TERROR, LocalDate.of(2015, 10, 9),
				LocalDate.of(2016, 2, 12)));
		peliculas.add(new Pelicula(Genero.COMEDIA, "Ocho apellidos catalanes", Genero.COMEDIA,
				LocalDate.of(2015, 11, 20), LocalDate.of(2016, 3, 18)));
		peliculas.add(new Pelicula(Genero.COMEDIA, "Padres por desigual", Genero.COMEDIA, LocalDate.of(2016, 1, 1),
				LocalDate.of(2016, 5, 11)));
		peliculas.add(new Pelicula(Genero.FICCION, "Star Wars: El despertar de la Fuerza", Genero.FICCION,
				LocalDate.of(2015, 12, 18), LocalDate.of(2016, 4, 20)));
		peliculas.add(new Pelicula(Genero.FICCION, "Mad Max: Furia en la carretera", Genero.FICCION,
				LocalDate.of(2015, 5, 15), LocalDate.of(2015, 9, 1)));
		peliculas.add(new Pelicula(Genero.TERROR, "Copia de Poltergeist, juegos diabólicos", Genero.TERROR,
				LocalDate.of(2015, 5, 22), LocalDate.of(2015, 9, 22)));
		peliculas.add(new Pelicula(Genero.FICCION, "Copia de Star Wars: El despertar de la Fuerza", Genero.FICCION,
				LocalDate.of(2015, 12, 18), LocalDate.of(2016, 4, 20)));

		return peliculas;
	}

	public void Exercise1() {

		System.out.println("Manteniendo el orden de inserción sin duplicados: ");
		System.out.println();
		Set<Pelicula> set = new LinkedHashSet<>();
		List<Pelicula> peli = addFilms();
		set.addAll(peli);

		for (Pelicula p : set) {

			System.out.println(p);

		}
	}

	public void Exercise2() {

		SortedSet<Pelicula> tree = new TreeSet<>();
		List<Pelicula> peli = addFilms();
		tree.addAll(peli);

		for (Pelicula p : tree) {

			System.out.println(p);

		}		
	}
	
	public void Exercise3() {
		System.out.println("Arbol ordenado ascedentemente por fecha de estreno: ");
	    SortedSet<Pelicula> tree = new TreeSet<>(new Comparator<Pelicula>() {
	        @Override
	        public int compare(Pelicula p1, Pelicula p2) {
	            int result = p1.getFechaEstreno().compareTo(p2.getFechaEstreno());
	            if (result == 0) {
	                result = p1.getClave().getGenero().compareTo(p2.getClave().getGenero());
	            }
	            return result;
	        }
	    });
	    
	    List<Pelicula> peli = addFilms();
		tree.addAll(peli);

		for (Pelicula p : tree) {

			System.out.println(p);

		}		
	}
	
	public void show() {
		
		Exercise1();
		System.out.println();
		Exercise2();
		System.out.println();
		Exercise3();
		
	}
	
	public void Exercise4() {
		Map<String, Pelicula> peliculasMap = new TreeMap<>();

        List<Pelicula> peli = addFilms();
        for (Pelicula pelicula : peli) {
            peliculasMap.put(pelicula.getClave().toString(), pelicula);
        }

        for (Map.Entry<String, Pelicula> entry : peliculasMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

	public static void main(String[] args) {

		new Main().Exercise4();

	}
	
	
}
