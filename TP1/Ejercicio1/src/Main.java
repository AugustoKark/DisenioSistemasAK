public class Main {
    public static void main(String[] args) {
        Poligono poligono1 = new Poligono();
        poligono1.setNro_lados(5);
        poligono1.setLongitud_lados(10);
        System.out.println("El poligono tiene " + poligono1.getNro_lados() + " lados y cada lado mide " + poligono1.getLongitud_lados() + " cm.");

    }
}