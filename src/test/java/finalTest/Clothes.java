package finalTest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Clothes extends Product {
    public String manufacturer;
    public LocalDate importDate;
    public static final float VAT = 0.15f;


    public Clothes(String maHang, String productName, int numberInventory, int price,
                   String manufacturer, LocalDate importDate) {
        super(maHang, productName, numberInventory, price);
        this.manufacturer = manufacturer;
        this.importDate = importDate;
    }


    @Override
    public String evaluate() {
        long daysInWarehouse = ChronoUnit.DAYS.between(importDate, LocalDate.now());
        if (numberInventory > 60 && daysInWarehouse > 20) {
            return "Hàng bán chậm";
        }
        return "";
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nNhà sản xuất: %s\nNgày nhập kho: %s\nVAT: %.2f%%\nĐánh giá: %s\n",
                manufacturer, importDate, VAT * 100, evaluate());
    }
}
