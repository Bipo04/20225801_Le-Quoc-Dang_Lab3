package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int numberOfItemsInStore;

    public Store(int maxItem){
        itemsInStore = new DigitalVideoDisc[maxItem];
        numberOfItemsInStore = 0;
    }

    public void addDVD(DigitalVideoDisc dvd){
        if (numberOfItemsInStore < itemsInStore.length){
            itemsInStore[numberOfItemsInStore] = dvd;
            numberOfItemsInStore++;
            System.out.println("Added DVD: " + dvd.getTitle());
        }
        else {
            System.out.println("Store is full");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd){
        boolean removed = false;
        for (int i = 0; i < numberOfItemsInStore; i++){
            if (itemsInStore[i].equals(dvd)){
                removed = true;
                for(int j = i; j < numberOfItemsInStore-1; j++){
                    itemsInStore[j] = itemsInStore[j+1];
                }
                numberOfItemsInStore--;
                System.out.println("Removed DVD: " + dvd.getTitle());
                break;
            }
        }
        if (!removed){
            System.out.println("DVD not found");
        }
    }
}