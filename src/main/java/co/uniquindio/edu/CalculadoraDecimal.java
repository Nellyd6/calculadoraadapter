package co.uniquindio.edu;

    
public class CalculadoraDecimal implements CalculadoraDecimales {
    
    double numero1;
    double numero2;

    public CalculadoraDecimal(double numero1, double numero2) {
         this.numero1 = numero1;
         this.numero2 = numero2;
    }
    @Override
    public double sumarDecimales(){
     return (numero2 + numero1 );
    }
    
}
    