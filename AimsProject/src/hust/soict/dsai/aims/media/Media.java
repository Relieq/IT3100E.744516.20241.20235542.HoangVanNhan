package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    // Các thuộc tính chung
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    // Constructor không tham số
    public Media() {
    }

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Constructor đầy đủ
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Phương thức toString() chung cho các lớp con
    @Override
    public String toString() {
        return "Media [ID: " + id + ", Title: " + title + ", Category: " + category + ", Cost: $" + cost + "]";
    }

    // Phương thức isMatch kiểm tra tiêu đề
    public boolean isMatch(String title) {
        return this.getTitle().equalsIgnoreCase(title); // So sánh không phân biệt chữ hoa chữ thường
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return title.equalsIgnoreCase(media.title);
    }
}
