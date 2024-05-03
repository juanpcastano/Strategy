package Filters;

public class GScaleFilter implements ImageFilter{
    @Override
    public void applyfilter(String Image) {
        System.out.println("Aplicando filtro de escala de grises");
        System.out.println(Image + " con filtro de escala de grises");
    }
}
