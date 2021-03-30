package company.graphics;

public class Main {
    public static void main(String[] args) {
        VectorGraphicsInterface g1= new VectorAdapterFromRaster();

        g1.drawLine();
        g1.drawSquare();

        VectorGraphicsInterface g2= new VectorAdapterFromRaster2();
        g2.drawSquare();
        g2.drawLine();
    }
}
