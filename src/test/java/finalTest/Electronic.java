package finalTest;

public class Electronic extends Product {
    public int warrantyMonths;  //
    public double powerKW;      //

    public static final float VAT = 0.15f;

    public Electronic(String maHang, String productName, int numberInventory, int price,
                      int warrantyMonths, double powerKW) {
        super(maHang, productName, numberInventory, price);

        this.warrantyMonths = warrantyMonths;
        this.powerKW = powerKW;
    }

    @Override
    public String evaluate() {
        if (numberInventory < 3) {
            return "Bán được hàng";
        }
        return "";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nBảo hành: %d tháng\nCông suất: %.2f kW\nVAT: %.2f%%\nĐánh giá: %s\n",
                warrantyMonths, powerKW, VAT * 100, evaluate());
    }
}

