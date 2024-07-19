package Entity;

public class SellingItemsDetails {

    private Item item;
    private int quantity;

    public SellingItemsDetails(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }



    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SellingItemsDetails{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
