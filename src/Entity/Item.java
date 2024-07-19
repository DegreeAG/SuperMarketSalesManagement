package Entity;

import Constant.ItemsType;

import java.util.Scanner;

public class Item {

    private int id;
    private String itemsName;
    private ItemsType itemsType;
    private int itemsNumber;
    private float itemsPrice;

    public static  int AUTO_ID = 1000;

    public Item() {
        this.id= AUTO_ID;
        AUTO_ID++;
    }

    public void inputInfo() {
        System.out.println("Nhập tên mặt hàng: ");
        this.setItemsName(new Scanner(System.in).next());
        System.out.println("Nhập giá bán mặt hàng: ");
        this.setItemsPrice(new Scanner(System.in).nextFloat());
        System.out.println("Nhập số lượng mặt hàng: ");
        this.setItemsNumber(new Scanner(System.in).nextInt());
        System.out.println("Lựa chọn loại nhóm hàng: ");
        System.out.println("1. Điện Tử");
        System.out.println("2. Điện Lạnh");
        System.out.println("3. Máy Tính");
        System.out.println("4. Thiết Bị Văn Phòng");
        int productType;
        while (true) {
            productType = new Scanner(System.in).nextInt();
            switch (productType) {
                case 1:
                    this.setItemsType(ItemsType.ĐT);
                    break;
                case 2:
                    this.setItemsType(ItemsType.ĐL);
                    break;
                case 3:
                    this.setItemsType(ItemsType.MT);
                    break;
                case 4:
                    this.setItemsType(ItemsType.TBVP);
                    break;
            }
            return;
        }


    }


    public int getId() {
        return id;
    }


    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public ItemsType getItemsType() {
        return itemsType;
    }

    public void setItemsType(ItemsType itemsType) {
        this.itemsType = itemsType;
    }

    public int getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }

    public float getItemsPrice() {
        return itemsPrice;
    }

    public void setItemsPrice(float itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", itemsName='" + itemsName + '\'' +
                ", itemsType=" + itemsType +
                ", itemsNumber=" + itemsNumber +
                ", itemsPrice=" + itemsPrice +
                '}';
    }
}
