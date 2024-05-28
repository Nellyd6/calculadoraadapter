package co.uniquindio.edu;

public class main {
    public static void main(String[] args) {
        Calculadora calcularEntero= new Calculadora(5, 3);
        
        // Obtener y mostrar la suma de números enteros
        int sumaEnteros = calcularEntero.sumarEnteros();
        System.out.println("Suma de enteros: " + sumaEnteros);
        
        // Crear una instancia de la calculadora de números decimales
        CalculadoraDecimal calcularDecimal = new CalculadoraDecimal(2.4, 3.3);

        AdaptadorCalculadoraDecimal adaptador = new AdaptadorCalculadoraDecimal(calcularDecimal);
        
        // Obtener y mostrar la suma de números enteros usando el adaptador
        int sumaEnterosDesdeDecimal = adaptador.sumarEnteros();
        System.out.println("Suma de enteros desde la calculadora de decimales: " + sumaEnterosDesdeDecimal);

    }
}