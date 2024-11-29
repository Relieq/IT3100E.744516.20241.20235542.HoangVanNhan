package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Instance variables

    // Class variable: đếm số lượng DVD được tạo
    private static int nbDigitalVideoDiscs = 0;

    // Constructor
    public DigitalVideoDisc() {
        super(); // Gọi constructor của Media
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDiscs++;
        super(nbDigitalVideoDiscs, title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        nbDigitalVideoDiscs++;
        super(nbDigitalVideoDiscs, title, category, cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        nbDigitalVideoDiscs++;
        super(nbDigitalVideoDiscs, title, category, cost, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        super(nbDigitalVideoDiscs, title, category, cost, length, director);
    }

    // Phương thức toString để in chi tiết DVD
    @Override
    public String toString() {
        return this.getId() + ". [Title: " + this.getTitle() + "] - [Category: " + this.getCategory() + "] - " +
                "[Director: " + this.getDirector() + "] - [Length: " + this.getLength() + "] - [$" + this.getCost() + "]";
    }

    // Phương thức play để phát DVD
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
