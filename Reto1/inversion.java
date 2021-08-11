/**
* Universidad Tecnológica de Pereira <br>
* (Pereira, Risaralda - Colombia)
* */
//import package utp.misiontic2022.c2.mundo;
//import java.lang.Math;
//import java.util.Scanner;
/**
* Clase que representa un Proyecto.
*/

public class inversion {   
    // ---------------------------------------------
    // Atributos
    private int pTiempo; 
    private double pMonto;
    private double pInteres;
    public double calcularInteresCompuesto;
    public double Total;
    public double TotalS;
    public double calcularInteresSimple;
    public double respuesta;
    // Métodos
    // ---------------------------------------------
    public double getpInteres() {
        return pInteres;
    }

    public void setpInteres(double pInteres) {
        this.pInteres = pInteres;
    }

    public double getpMonto() {
        return pMonto;
    }

    public void setpMonto(double pMonto) {
        this.pMonto = pMonto;
    }

    public int getpTiempo() {
        return pTiempo;
    }
    public void setpTiempo(int pTiempo) {
        this.pTiempo = pTiempo;
    }


    public double calcularInteresCompuesto() {
        Total= Math.pow(1+getpInteres(), getpTiempo());
        calcularInteresCompuesto = getpMonto()*(Total-1);   
        return calcularInteresCompuesto;
    }

    public double calcularInteresSimple(){
        calcularInteresSimple = getpMonto() *getpTiempo()*getpInteres();
        return calcularInteresSimple;  
    }
   
    /**
     * Método para comparar la diferencia en el total de
     * intereses generados para el proyecto.
     * @return Un mensaje con el valor final del interés
     */
    
     public String compararInversion(int pTiempo, double pMonto, double pInteres)
        {   setpInteres(pInteres);
            setpTiempo(pTiempo);
            setpMonto(pMonto);
            // Cálculo de la diferencia entre tipos de tasas 
            respuesta = calcularInteresCompuesto() - calcularInteresSimple();          
            if ( respuesta > 0 ){                        
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta ;
            }
            else{
                return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";    
            }   
        }   
}
