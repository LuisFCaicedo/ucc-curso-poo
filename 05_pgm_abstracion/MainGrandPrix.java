public class MainGrandPrix {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final vehiculo vehiculo = new TipoCombustion();
        
        vehiculo.setMarca("DODGE");
        vehiculo.setCarroseria("sedan");

        vehiculo.startingEngine();
        vehiculo.speedUp();
        vehiculo.speedUp();
        vehiculo.breaking();
        vehiculo.speedUp();
        vehiculo.breaking();
        vehiculo.parking();
        vehiculo.stopingEngine();
    }
}