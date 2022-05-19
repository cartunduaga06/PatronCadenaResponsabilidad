public class Articulo {

    private String Nombre;
    private int Lote;
    private int peso;
    private String envasado;

    public Articulo(String nombre, int lote, int peso, String envasado) {
        Nombre = nombre;
        Lote = lote;
        this.peso = peso;
        this.envasado = envasado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getLote() {
        return Lote;
    }

    public void setLote(int lote) {
        Lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }
}
