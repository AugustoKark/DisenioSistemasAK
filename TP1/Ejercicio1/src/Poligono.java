public class Poligono {
    private int nro_lados;
    private int longitud_lados;

    public Poligono() {
    }

    public Poligono(int nro_lados, int longitud_lados) {
        this.nro_lados = nro_lados;
        this.longitud_lados = longitud_lados;
    }

    public int getNro_lados() {
        return nro_lados;
    }

    public void setNro_lados(int nro_lados) {
        this.nro_lados = nro_lados;
    }

    public int getLongitud_lados() {
        return longitud_lados;
    }

    public void setLongitud_lados(int longitud_lados) {
        this.longitud_lados = longitud_lados;
    }
}
