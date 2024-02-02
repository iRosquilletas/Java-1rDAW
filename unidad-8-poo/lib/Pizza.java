package lib;

public class Pizza {
    private String tipo;
    private String tamaño;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        totalPedidas++;
    }

    public void sirve() {
        if (estado.equals("pedida")) {
            System.out.println("pizza " + tipo + " " + tamaño + ", servida");
            estado = "servida";
            totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    @Override
    public String toString() {
        return "pizza " + tipo + " " + tamaño + ", " + estado;
    }
}
