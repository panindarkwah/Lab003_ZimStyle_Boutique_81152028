public class ZimStyleApp {
    public static void main(String[] args) {

        // Using default constructor
        ClothingItem item1 = new ClothingItem();

        // Using partial constructor
        ClothingItem item2 = new ClothingItem("Kente Dress", ClothingType.DRESS);

        // Using parameterized constructor
        ClothingItem item3 = new ClothingItem("African Jacket", 2500.0, Size.L, ClothingType.JACKET);



        // Show how many items were created
        System.out.println("Total clothing items created: " + ClothingItem.getItemCount());
    }
}


class ClothingItem {
    // Private instance variables
    private String name;
    private double price;
    private Size size;
    private ClothingType type;

    // Class variable
    private static int itemCount = 0;

    // Parameterized constructor
    public ClothingItem(String name, double price, Size size, ClothingType type) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.type = type;
        itemCount++;
    }

    // Partial constructor
    public ClothingItem(String name, ClothingType type) {
        this.name = name;
        this.type = type;
        this.size = Size.M;   // default
        this.price = 1000.0;  // default
        itemCount++;
    }

    // 3Default constructor
    public ClothingItem() {
        this.name = "Generic African Wear";
        this.type = ClothingType.SHIRT;
        this.size = Size.M;
        this.price = 1000.0;
        itemCount++;
    }

    // Static accessor for item count
    public static int getItemCount() {
        return itemCount;
    }

    // Task 4 Add a method to Display Clothing Info
    public void displayInfo() {
        System.out.println("Name: " + name + " | Type: " + type + " | Size: " + size + " | Price: " + price + " ZiG");
    }


    public void displayInfo(boolean showPrice) {
        if (showPrice) {
            System.out.println("Name: " + name + " | Type: " + type + " | Size: " + size + " | Price: " + price + " ZiG");
        } else {
            System.out.println("Name: " + name + " | Type: " + type + " | Size: " + size);

        }
    }
    // task 6 Applying discount based on price
    public void applyDiscount() {
        if (price > 50) {
            double discount = price * 0.10;
            price = price - discount;
            System.out.println(name + " discounted by " + discount + " ZiG. New price: " + price + " ZiG");
        } else {
            System.out.println(name + " has no discount.");
        }

    }

    // Task 7
    public class ZimStyleApp {
        public static void main(String[] args) {
            //  Creating inventory array and add items using different constructors
            ClothingItem[] inventory = new ClothingItem[5];

            inventory[0] = new ClothingItem(); // default constructor
            inventory[1] = new ClothingItem("Ankara Dress", ClothingType.DRESS); // partial constructor
            inventory[2] = new ClothingItem("Kente Jacket", 1200, Size.L, ClothingType.JACKET); // full constructor
            inventory[3] = new ClothingItem("Chitenge Shirt", 800, Size.M, ClothingType.SHIRT);
            inventory[4] = new ClothingItem("African Trousers", 950, Size.L, ClothingType.TROUSER);

            // Looping through array to display all items

            for (int i = 0; i < inventory.length; i++) {
                inventory[i].displayInfo();
            }
            System.out.println("Total items created: " + ClothingItem.getItemCount());



            // Task 8 Displaying discount for all items
            for (ClothingItem item : inventory)
                item.applyDiscount();

            //   Task 8 `Average Price
            double totalPrice = 0;
            for (ClothingItem item : inventory) {
                totalPrice += item.getPrice();
            }
            double avgPrice = totalPrice / inventory.length;



            System.out.printf("%nAverage price of all items: %.2f ZiG%n", avgPrice);

            // Total items
            System.out.println("Total items created: " + ClothingItem.getItemCount());

        }
    }

}
