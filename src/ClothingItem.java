public class ClothingItem {

    //  Private data fields
    private String name;
    private double price;
    private Size size;
    private ClothingType type;


    private static int itemCount = 0;


    public ClothingItem(String name, double price, Size size, ClothingType type) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.type = type;
        itemCount++;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public ClothingType getType() {
        return type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setType(ClothingType type) {
        this.type = type;
    }

    // Public accessor for the class variable
    public static int getItemCount() {
        return itemCount;
    }


}