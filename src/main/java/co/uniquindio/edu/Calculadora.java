package co.uniquindio.edu;

public class Calculadora implements CalculadoraEnteros {
     int num1;
     int num2;
     int sumaDecimales;
      
       
          public Calculadora(int num1, int num2) {
          this.num1 = num1;
          this.num2 = num2;
     
          }
          @Override
          public int  sumarEnteros(){
         return num1+num2;
          }
     
}


    
