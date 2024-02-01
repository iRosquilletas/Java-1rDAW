import lib.Fraccion;

public class Fraccion1 {
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion();

        fraccion.invertir();
        System.out.println("invertir: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        fraccion.simplificar();
        System.out.println("simplificar: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        Fraccion otra = new Fraccion();
        otra.setNumerador(7);
        otra.setDenominador(88);

        fraccion.multiplicar(otra);
        System.out.println("multiplicación: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());

        fraccion.dividir(otra);
        System.out.println("división: " + fraccion.getNumerador() + "/" + fraccion.getDenominador());
    }
}
