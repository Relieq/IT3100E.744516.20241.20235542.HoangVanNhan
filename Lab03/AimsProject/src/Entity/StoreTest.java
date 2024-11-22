package Entity;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo một cửa hàng mới
        Store store = new Store();

        // Tạo các DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);

        // Thêm các DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // In danh sách DVD trong cửa hàng
        store.print();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // In lại danh sách DVD trong cửa hàng
        store.print();

        // Thử xóa một DVD không có trong cửa hàng
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Non-Existent DVD");
        store.removeDVD(dvd4);
    }
}
