package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    // Instance variables
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Class variable: đếm số lượng DVD được tạo
    private static int nbDigitalVideoDiscs = 0;

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Phương thức isMatch kiểm tra tiêu đề
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title); // So sánh không phân biệt chữ hoa chữ thường
    }

    // Phương thức toString để in chi tiết DVD
    @Override
    public String toString() {
        return this.id + ". [Title: " + this.title + "] - [Category: " + this.category + "] - " +
                "[Director: " + this.director + "] - [Length: " + this.length + "] - [$" + this.cost + "]";
    }

}
