public class Main {
    public static void main(String[] args) {

        // Choose one clothing type
        ClothingType type = ClothingType.DRESS;


        // Switch statement to print description of the dress
        switch (type) {
            case DRESS: System.out.println("Elegant wear made from traditional fabric.");break;
            case SHIRT: System.out.println("Stylish African shirt suitable for all occasions.");break;
            case TROUSER: System.out.println("Good for all coporate programs.");break;
            case JACKET: System.out.println("Warm and fashionable, great for cool weather.");break;
            case ACCESSORY: System.out.println("Adds a touch of beauty to how you already look .");break;
            default: System.out.println("Ohhhh the clothing type does not exist in our boutique.");break;
        }
    }
}