package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc() {
        super();
    }

    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public CompactDisc(int id, String Title, String category, float cost) {
        super(id, Title, category, cost);
    }

    // Getter
    public String getArtist() {
        return artist;
    }

    // Thêm track
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track);
        } else {
            System.out.println("Track already exists: " + track);
        }
    }

    // Xóa track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track);
        } else {
            System.out.println("Track not found: " + track);
        }
    }

    // Tính tổng thời lượng
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Tracks: " + tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        for (Track track : tracks) {
            track.play();
        }
    }
}
