package Procesors;

import Filters.ImageFilter;

public class ImageProcessor {
    private ImageFilter filter = null;

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void applyfilter(String Image){
        if(filter == null){
            System.out.println("No hay filtro seleccionado");
        }
        filter.applyfilter(Image);
    }

}
