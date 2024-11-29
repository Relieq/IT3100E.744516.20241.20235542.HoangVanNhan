package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added media: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed media: " + media.getTitle());
        } else {
            System.out.println("Item not found in store: " + media.getTitle());
        }
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }

    public ArrayList<Media> getItemsInStore(){
        return this.itemsInStore;
    }

    public void sortByTitle() {
        itemsInStore.sort(Media.COMPARE_BY_TITLE_COST);
        System.out.println("Store sorted by title (and cost for same title)");
    }

    public void sortByCost() {
        itemsInStore.sort(Media.COMPARE_BY_COST_TITLE);
        System.out.println("Store sorted by cost (and title for same cost)");
    }
}