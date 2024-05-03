import Filters.GScaleFilter;
import Filters.HContrastFilter;
import Filters.SepiaFilter;
import Procesors.ImageProcessor;

public class Main {
    public static void main(String[] args) {


        ImageProcessor processor = new ImageProcessor();
        processor.setFilter(new GScaleFilter());
        processor.executefilter("soy una imagen de ejemplo");
        processor.setFilter(new HContrastFilter());
        processor.executefilter("soy una imagen de ejemplo");
        processor.setFilter(new SepiaFilter());
        processor.executefilter("soy una imagen de ejemplo");
    }
}