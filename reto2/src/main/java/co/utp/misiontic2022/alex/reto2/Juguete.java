package co.utp.misiontic2022.alex.reto2;

public class Juguete {
    
    // Constantes
    private final static String MARCA="Hasbro";
    private final static String PAIS_ORIGEN="China";
    private final static Integer PRECIO_BASE=10000;
    // Atributos
    private String marca;
    private String paisOrigen;
    private Integer precioBase;
    private Double precioFinal;

    // Constructores
    public Juguete() {
        this.marca = MARCA;
        this.paisOrigen = PAIS_ORIGEN;
        this.precioBase= PRECIO_BASE;

    }
    
    public Juguete(String marca) {
        this.marca = marca;
        this.paisOrigen = PAIS_ORIGEN;
        this.precioBase= PRECIO_BASE;
    }

    public Juguete(String marca, String paisOrigen, int precioBase) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.precioBase = precioBase;
    }

    
    public double calcularPrecio(){
        // Calculos

        if (this.marca==MARCA){ 
            precioFinal=precioBase-precioBase*0.5;
        }else{
            precioFinal=precioBase-precioBase*0.25;
        }
        if (this.paisOrigen==PAIS_ORIGEN){
            if (precioFinal>5000){
                precioFinal=precioFinal-5000;
            }
        }else{
                if(precioFinal>2500){
                    precioFinal=precioFinal-2500;
                }

            }
              
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }
    public Double getPrecioFinal() {
        return precioFinal;
    }

    // getters/setters de ser necesarios

}
