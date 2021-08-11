package co.utp.misiontic2022.alex.reto2;

public class JugueteBebe extends Juguete {
    // Constantes
    private final static String MATERIAL="Plastico";
    // Atributos
    private String material;
    private Double precioFinal;
    // Constructores
    
    public JugueteBebe(String material) {
        super();
        this.material = material;
    }

    public JugueteBebe(){
        super();
        this.material = MATERIAL;
    
    }

    public JugueteBebe(String marca, String paisOrigen, int precioBase, String material) {
        super(marca, paisOrigen, precioBase);
        this.material = material;
        
    }
    // Metodos
    public double calcularPrecio(){
        // Calculos
        if(material==MATERIAL){
            precioFinal=super.calcularPrecio()+10000;

        }else{
            precioFinal=super.calcularPrecio();
        }
    return precioFinal;
    }
 // getters/setters de ser necesarios

 
}
