package hw1;

public class Main {

    static int ordersNumber;
    static String clientsName;
    static String productsName;
    static double productsPrice;
    static String clientsAddress;

    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        ordersNumber = 1;
        clientsName = "Alice";
        productsName = "smartphone";
        productsPrice = 305.99;
        clientsAddress = "Moon Street, 10";

        System.out.println("Order No " + ordersNumber + "\n" +
                "Client: " + clientsName + "." + "\n" +
                "Product: " + productsName + ", price " + CURRENCY + " " + productsPrice + "." + "\n" +
                "Address: " + clientsAddress + "." + "\n");

        ordersNumber = 2;
        clientsName = "Tom";
        productsName = "laptop";
        productsPrice = 570.95;
        clientsAddress = "Terra Street, 17";

        System.out.println("Order No " + ordersNumber + "\n" +
                "Client: " + clientsName + "." + "\n" +
                "Product: " + productsName + ", price " + CURRENCY + " " + productsPrice + "." + "\n" +
                "Address: " + clientsAddress + "." + "\n");
    }
}