package ejercicio8;

public class Clave {
    private Genero genero;
    private int number;

    public Clave(Genero genero) {
        this.genero = genero;
        this.number = genero.getNumeroInicial(); 
        genero.incrementarNumero(); 
    }

    public Genero getGenero() {
        return genero;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%s%d", genero.getCodigo(), number);
    }
}
