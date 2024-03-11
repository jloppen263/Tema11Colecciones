package ejercicio8;

import java.time.LocalDate;
import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {

    private Clave clave;
    private Genero genero;
    private String nombre;
    private LocalDate fechaEstreno;
    private LocalDate fechaDVD;

    public Pelicula(Genero genero1, String nombre, Genero genero, LocalDate fechaEstreno, LocalDate fechaDVD) {
        this.clave = new Clave(genero);
        this.nombre = nombre;
        this.genero = genero1; // Corregido: asignar genero1 al atributo genero
        this.fechaEstreno = fechaEstreno;
        this.fechaDVD = fechaDVD;
    }

    public Clave getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() { // Agregado: getter para el atributo genero
        return genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public LocalDate getFechaDVD() {
        return fechaDVD;
    }

    @Override
    public int compareTo(Pelicula otraPelicula) {
        int comparacionFechaDVD = otraPelicula.fechaDVD.compareTo(this.fechaDVD);
        if (comparacionFechaDVD != 0) {
            return comparacionFechaDVD;
        }
        return this.nombre.compareTo(otraPelicula.nombre);
    }

    @Override
    public String toString() {
        return String.format("Clave %s Nombre: %s Clave: %s Fecha de estreno: %s Fecha DVD: %s", clave.getGenero(), nombre, clave,
                fechaEstreno, fechaDVD);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pelicula pelicula = (Pelicula) obj;
        return Objects.equals(nombre, pelicula.nombre) &&
               genero == pelicula.genero &&
               Objects.equals(fechaEstreno, pelicula.fechaEstreno) &&
               Objects.equals(fechaDVD, pelicula.fechaDVD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, genero, fechaEstreno, fechaDVD);
    }
}
