package ejercicio8;

public enum Genero {
    COMEDIA('C'), FICCION('F'), TERROR('T');

    private char codigo;
    private int numeroInicial;

    Genero(char codigo) {
        this.codigo = codigo;
        this.numeroInicial = 1; 
    }

    public char getCodigo() {
        return codigo;
    }

    public int getNumeroInicial() {
        return numeroInicial;
    }

    public void incrementarNumero() {
        numeroInicial++; 
    }
}

