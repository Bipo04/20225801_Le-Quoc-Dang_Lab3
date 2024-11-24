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
        return totalCost;
    }
}