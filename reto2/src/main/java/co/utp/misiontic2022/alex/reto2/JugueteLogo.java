package co.utp.misiontic2022.alex.reto2;

//import java.util.Set;

public class JugueteLogo extends Juguete{
    // Constantes
    private final static int NUMERO_FICHAS = 100;
    // Atributos
    private int numero_fichas;
    private Double precioFinal;
    // Constructores
    public JugueteLogo(){
        super();
        this.numero_fichas=NUMERO_FICHAS;
    }

    public JugueteLogo(int numero_fichas) {
        super();
        this.numero_fichas = numero_fichas;
    }


    public JugueteLogo(String marca, String paisOrigen, int precioBase, int numero_fichas) {
        super(marca, paisOrigen, precioBase);
        this.numero_fichas = numero_fichas;
    }
    
    // Metodos
    public double calcularPrecio(){
        // Calculos
        if(numero_fichas<NUMERO_FICHAS){
            precioFinal=super.calcularPrecio()+15000;

        }else{
            precioFinal=super.calcularPrecio()+20000;
        }
        return precioFinal;
    }
    
}
