public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd_1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd_1);

        DigitalVideoDisc dvd_2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd_2);
        
        DigitalVideoDisc dvd_3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd_3);

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.TotalCost());
        System.out.println("==========================================================");

        System.out.println("Test the functionality of removing a disc from the cart");
        anOrder.RemoveDigitalVideoDisc(dvd_1);
        anOrder.RemoveDigitalVideoDisc(dvd_2);
        anOrder.RemoveDigitalVideoDisc(dvd_3);
        System.out.println("==========================================================");

        System.out.println("Test the functionality of removing a disc from an empty cart");
        anOrder.RemoveDigitalVideoDisc(dvd_1);
        System.out.println("==========================================================");
        
        System.out.println("Test the functionality of removing a disc that is not in the cart");
        anOrder.addDigitalVideoDisc(dvd_1);
        anOrder.RemoveDigitalVideoDisc(dvd_3);
        System.out.println("==========================================================");
        
        System.out.println("Test overloading");
        anOrder.addDigitalVideoDisc(dvd_1, dvd_2, dvd_3);
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.TotalCost());
        System.out.println("==========================================================");
        
        //test print method
        anOrder.print();
        System.out.println("==========================================================");
        
        //test the search method
        anOrder.searchCart(3);
        anOrder.searchCart("The Lion King");
        anOrder.searchCart(0);

    }
}