import Filters.GEscaleFilter;
import Filters.HContrastFilter;
import Filters.SepiaFilter;
import Procesors.ImageProcessor;

public class Main {
    public static void main(String[] args) {


        ImageProcessor processor = new ImageProcessor();
        processor.setFilter(new GEscaleFilter());
        processor.applyfilter("soy una imagen de ejemplo");
        processor.setFilter(new HContrastFilter());
        processor.applyfilter("soy una imagen de ejemplo");
        processor.setFilter(new SepiaFilter());
        processor.applyfilter("soy una imagen de ejemplo");
    }
}