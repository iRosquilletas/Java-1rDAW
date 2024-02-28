public class main {
    public static void main(String[] args) {
        Pieza p1 = new Pieza("cuadrado", "rojo");
        Pieza p2 = new Pieza("cuadrado", "rojo");
        Double d = new Double(1.0);
        String k = "Hola";
        boolean b1 = p1.equals(p2);
        boolean b2 = d.equals(k);
        boolean b3 = k.equals(p2);
        boolean b4 = p1.equals(d);
        System.out.println("Comparación entre dos objetos Pieza: " + b1);
        System.out.println("Comparación entre un Double y un String: " + b2);
        System.out.println("Comparación entre un String y un objeto Pieza: " + b3);
        System.out.println("Comparación entre un objeto Pieza y un Double: " + b4);
    }
}
