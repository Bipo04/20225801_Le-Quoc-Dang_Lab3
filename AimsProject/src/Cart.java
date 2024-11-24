public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the cart.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void RemoveDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        for (int i = 0; i < qtyOrdered && itemsOrdered[i] != null; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                qtyOrdered--;
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" is not in the cart. Unable to remove.");
    }

    public float TotalCost() {
        if (qtyOrdered == 0) {
            return 0;
        }
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered && itemsOrdered[i] != null; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return Math.round(totalCost * 100) / 100.0f;
    }
    
    //2.1
    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    //     if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
    //         for (int i = 0 ; i < dvdList.length ; i++) {
    //             itemsOrdered[qtyOrdered] = dvdList[i];
    //             qtyOrdered++;
    //             System.out.println("The disc \"" + dvdList[i].getTitle() + "\" has been added to the cart.");
    //         }
    //     }
    //     else {
    //         System.out.println("Please reduce the number of discs.");
    //     }
    // }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (DigitalVideoDisc dvd : dvdList) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("The disc \"" + dvd.getTitle() + "\" has been added to the cart.");
            }
        } else {
            System.out.println("Please reduce the number of discs.");
        }
    }

    //2.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("\"" + dvd1.getTitle() + "\" and \"" + dvd2.getTitle() + "\" has been added to the cart.");
        }
        else {
            System.out.println("Please reduce the number of discs.");
        }
    }
    
    //6 in ra danh sách đĩa trong giỏ
    public void print(){
        System.out.println("**********************CART**********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + "." + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + TotalCost());
        System.out.println("*************************************************");
    }
}