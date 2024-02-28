public class Pieza {
    private String forma;
    private String color;

    public Pieza(String forma, String color) {
        this.forma = forma;
        this.color = color;
    }

    public double area() {
        // Método ficticio para calcular el área
        return 0.0;
    }

    public boolean equals(Object o) {
        if (o instanceof Pieza) {
            Pieza p = (Pieza) o;
            return this.color.equals(p.color) &&
                    this.forma.equals(p.forma) &&
                    this.area() == p.area();
        }
        return false;
    }

    // Getters y setters
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
