package Entity;

import java.util.ArrayList;

public class Store {
    // Danh sách các DVD trong cửa hàng
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The DVD [" + dvd.getTitle() + "] has been added to the store.");
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("The DVD [" + dvd.getTitle() + "] has been removed from the store.");
        } else {
            System.out.println("The DVD [" + dvd.getTitle() + "] is not in the store.");
        }
    }

    // Phương thức in danh sách DVD trong cửa hàng
    public void print() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd.toString());
            }
        }
        System.out.println("**************************************************");
    }
}
