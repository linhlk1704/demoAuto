package finalTest;
import java.time.LocalDate;

public class Food extends Product {
    public LocalDate startDate;
    public LocalDate endDate;
    public String branch;

    public static final float VAT = 0.08f;

    public Food(String maHang, String productName, int numberInventory, int price,
                LocalDate startDate, LocalDate endDate, String branch) {
        super(maHang, productName, numberInventory, price);
        this.startDate = startDate;
        this.endDate = endDate;
        this.branch = branch;
    }

    @Override
    public String evaluate() {
        if (numberInventory > 0 && endDate.isBefore(LocalDate.now())) {
            return "Hàng khó bán";
        }
        return "";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nNgày sản xuất: %s\nNgày hết hạn: %s\nNhà cung cấp: %s\nVAT: %.2f%%\nĐánh giá: %s\n",
                startDate, endDate, branch, VAT * 100, evaluate());
    }
}
