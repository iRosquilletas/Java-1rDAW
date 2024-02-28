public class VectorPrograma {
    public static void main(String[] args) {
        int[] vector = new int[5];

        try {
            for (int i = 0; i < vector.length; i++) {
                if (i == 3) {
                    throw new ArrayIndexOutOfBoundsException("No se puede asignar un valor en la posición 3.");
                }
                vector[i] = i + 1; // Asignar valores al vector
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha lanzado una excepción: " + e.getMessage());
        }

        // Imprimir el vector
        System.out.println("Valores del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "] = " + vector[i]);
        }
    }
}
