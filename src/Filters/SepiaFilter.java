package Filters;

public class SepiaFilter implements ImageFilter{
    @Override
    public void applyfilter(String Image) {
        System.out.println("Aplicando filtro de sepia");
        System.out.println(Image + " con filtro de sepia");
    }
}
