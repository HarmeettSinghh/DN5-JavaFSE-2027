public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")

        };

        // Linear Search
        Product linearResult = SearchAlgorithm.linearSearch(products, "Watch");

        System.out.println(" Linear Search ");

        if (linearResult != null) {
            System.out.println(linearResult.productName + " found at " + linearResult.productId);
        } else {
            System.out.println("Product Not Found");
        }

        // Binary Search
        Product binaryResult = SearchAlgorithm.binarySearch(products, 104);

        System.out.println(" Binary Search ");

        if (binaryResult != null) {
            System.out.println(binaryResult.productName + " found at " + binaryResult.productId );
        } else {
            System.out.println("Product Not Found");
        }

    }
}