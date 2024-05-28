package co.uniquindio.edu;

public class AdaptadorCalculadoraDecimal implements CalculadoraEnteros {

    private CalculadoraDecimales calcularDecimal;

    public AdaptadorCalculadoraDecimal(CalculadoraDecimales calcularDecimal) {
        this.calcularDecimal = calcularDecimal;
    }
    @Override
    public int sumarEnteros (){
        double resultado= calcularDecimal.sumarDecimales();
        return (int) resultado;
   
      
    }

    
}