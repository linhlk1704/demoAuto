package finalTest;

import java.util.ArrayList;
import java.util.List;

public class ManageProduct {
    private List<Product> productList;

    public ManageProduct() {
        productList = new ArrayList<>();
    }

    private boolean isDuplicate(String maHang) {
        for (Product p : productList) {
            if (p.maHang.equalsIgnoreCase(maHang)) {
                return true;
            }
        }
        return false;
    }

    public boolean addProduct(Product p) {
        if (isDuplicate(p.maHang)) {
            System.out.println("❌ Mã hàng bị trùng: " + p.maHang);
            return false;
        }
        productList.add(p);
        System.out.println("✅ Đã thêm: " + p.productName);
        return true;
    }

    public void printByType() {
        System.out.println("📦 DANH SÁCH HÀNG THỰC PHẨM:");
        for (Product p : productList) {
            if (p instanceof Food) {
                p.showInfo();
                System.out.println("----------------------");
            }
        }

        System.out.println("📦 DANH SÁCH HÀNG ĐIỆN MÁY:");
        for (Product p : productList) {
            if (p instanceof Electronic) {
                p.showInfo();
                System.out.println("----------------------");
            }
        }

        System.out.println("📦 DANH SÁCH HÀNG QUẦN ÁO:");
        for (Product p : productList) {
            if (p instanceof Clothes) {
                p.showInfo();
                System.out.println("----------------------");
            }
        }
    }
}