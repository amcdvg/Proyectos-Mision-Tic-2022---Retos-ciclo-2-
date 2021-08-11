public class reto {
    public static void  main (String[] args) throws Exception {
        inversion resultadoInversion = new inversion();
        System.out.println(resultadoInversion.compararInversion(12,2000000,5));

        inversion resultadoInversion2 = new inversion();
        System.out.println(resultadoInversion2.compararInversion(11,2005000.0,4));

        inversion resultadoInversion3 = new inversion();
        System.out.println(resultadoInversion3.compararInversion(11,2005000.0,0));



    } 
    
}
