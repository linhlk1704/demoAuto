package finalTest;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ManageProduct manager = new ManageProduct();
        Product f = new Food("TP01", "Sữa chua", 50, 10000,
                LocalDate.of(2025, 4, 1), LocalDate.of(2025, 5, 1), "Vinamilk");

        Product e = new Electronic("DM01", "Máy lạnh", 2, 5000000, 24, 1.5);

        Product c = new Clothes("QA01", "Áo sơ mi", 80, 200000,
                "Việt Tiến", LocalDate.of(2025, 3, 15));

        manager.addProduct(f);
        manager.addProduct(e);
        manager.addProduct(c);
        manager.printByType();
    }
}