package co.utp.misiontic2022.alex.reto2;

public class Factura {
    // Atributos
    private Double totalJuguetes;
    private Double totalJuguetesBebe;
    private Double totalJuguetesLego;
    private Juguete[] Juguetes;
    // Constructores
    public Factura(Juguete[] juguetes) {
        Juguetes = juguetes;
    }
    // Metodos
    public void mostrarTotales(){
        // Calculo de totales
        totalJuguetes=0.0;
        totalJuguetesBebe = 0.0;
        totalJuguetesLego =0.0;
        for(int i = 0; i < 5; i++){
            totalJuguetes = totalJuguetes +Juguetes[i].calcularPrecio();
            if (Juguetes[i] instanceof JugueteBebe){
                totalJuguetesBebe = totalJuguetesBebe + Juguetes[i].calcularPrecio();
            }
            if (Juguetes[i] instanceof JugueteLogo){
                totalJuguetesLego = totalJuguetesLego + Juguetes[i].calcularPrecio();
            }
        }       
        System.out.println("El precio total de los juguetes es de " + totalJuguetes);
        System.out.println("La suma del precio de los JuguetesBebe es de " + totalJuguetesBebe);
        System.out.print("La suma del precio de los JuguetesLego es de " + totalJuguetesLego);
    }
    
}
