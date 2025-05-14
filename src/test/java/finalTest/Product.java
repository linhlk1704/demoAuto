package finalTest;

public abstract class Product {
    public final String maHang;
    public String productName;
    public int numberInventory;
    public int price;

    public Product(String _maHang, String _productName, int _numberInventory, int _price) {
        this.maHang = _maHang;
        this.productName = _productName;
        this.numberInventory = _numberInventory;
        this.price = _price;
    }

    public Product(String maHang, String productName) {
        this(maHang, productName, 0, 0); // Gán mặc định số lượng và giá là 0
    }

    public abstract String evaluate();

    public void showInfo() {
        System.out.printf("Mã hàng là %s\nTên sản phẩm là %s\nGiá 1 sản phẩm là %d\nSố lượng tồn kho là %d\n",
                this.maHang, this.productName, this.price, this.numberInventory);
    }
}
