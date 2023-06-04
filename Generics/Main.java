public class Main {
    public static void main(String[] args) {
        
        ShoppingCart<Electronics> electronicsCart = new ShoppingCart<>();
        electronicsCart.addItem(new Electronics("TV", 25000));
        electronicsCart.addItem(new Electronics("Refrigarator",30000));


        ShoppingCart<Clothing> clothingCart = new ShoppingCart<>();
        clothingCart.addItem(new Clothing("Shirt", 650));
        clothingCart.addItem(new Clothing("Jeans", 2700));

        // Compile time error

        // ShoppingCart<Book> bookCart = new ShoppingCart<>();
        // bookCart.addItem(new Book("Head First java"));
        // bookCart.addItem(new Book("Black Book of java"));


        electronicsCart.displayItems();
        System.out.println("Total = "+electronicsCart.getTotalPrice());
        System.out.println("-------------------------------------");

        clothingCart.displayItems();
        System.out.println("Total = "+clothingCart.getTotalPrice());

    }
}
