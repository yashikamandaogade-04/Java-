interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type){System.out.println("Applying "+type+" filter to image");}
    public void reset_filter(){System.out.println("Resetting image filters");}
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type){System.out.println("Filtering data by "+type);}
    public void reset_filter(){System.out.println("Resetting data filters");}
}

public class TestFilter {
    public static void main(String[] args) {
        Filterable f1 = new ImageProcessor();
        f1.apply_filter("grayscale");
        f1.reset_filter();

        Filterable f2 = new DataAnalyzer();
        f2.apply_filter("outliers");
        f2.reset_filter();
    }
}
