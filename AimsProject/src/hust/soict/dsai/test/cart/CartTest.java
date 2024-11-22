package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart cart = new Cart();

        // Tạo các DVD mẫu và thêm vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // In giỏ hàng
        cart.print();

        // Tìm DVD theo ID
        DigitalVideoDisc searchByIdResult = cart.searchById(2);
        if (searchByIdResult != null) {
            System.out.println("Found by ID: " + searchByIdResult);
        }

        // Tìm DVD theo title
        DigitalVideoDisc searchByTitleResult = cart.searchByTitle("Star Wars");
        if (searchByTitleResult != null) {
            System.out.println("Found by Title: " + searchByTitleResult);
        }
    }
}
