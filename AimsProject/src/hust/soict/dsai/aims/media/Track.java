package hust.soict.dsai.aims.media;

public class Track {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track other = (Track) obj;
            return this.title.equalsIgnoreCase(other.title) && this.length == other.length;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Track [Title: " + title + ", Length: " + length + "]";
    }
}
