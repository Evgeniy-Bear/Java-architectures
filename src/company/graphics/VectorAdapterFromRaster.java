package company.graphics;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
