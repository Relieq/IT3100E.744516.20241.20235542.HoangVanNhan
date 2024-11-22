package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("Before swap:");
        System.out.println("jungleDVD title: " + jungleDVD.getTitle());
        System.out.println("cinderellaDVD title: " + cinderellaDVD.getTitle());

        // Sử dụng cách 1: Truyền mảng
        DigitalVideoDisc[] discs = {jungleDVD, cinderellaDVD};
        swap(discs);
        jungleDVD = discs[0];
        cinderellaDVD = discs[1];

        System.out.println("After swap:");
        System.out.println("jungleDVD title: " + jungleDVD.getTitle());
        System.out.println("cinderellaDVD title: " + cinderellaDVD.getTitle());

        // Thay đổi tiêu đề của jungleDVD
        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("After changeTitle:");
        System.out.println("jungleDVD title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc[] discs) {
        if (discs.length >= 2) {
            DigitalVideoDisc temp = discs[0];
            discs[0] = discs[1];
            discs[1] = temp;
        }
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}
