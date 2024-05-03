package Filters;

public class HContrastFilter implements ImageFilter{
    @Override
    public void applyfilter(String Image) {
        System.out.println("Aplicando filtro de contraste");
        System.out.println(Image + " con filtro de contraste");
    }
}
