package Entity;

import java.util.Arrays;

public class SellingItems {

    private SalesStaff salesStaff;
    private SellingItemsDetails[] details;
    private int totalQuantity;

    public SellingItems(SalesStaff salesStaff, SellingItemsDetails[] details, int totalQuantity) {
        this.salesStaff = salesStaff;
        this.details = details;
        this.totalQuantity = totalQuantity;
    }

    public SellingItems(SalesStaff salesStaff, SellingItemsDetails[] details) {
        this.salesStaff = salesStaff;
        this.details = details;
    }

    public SellingItems(SalesStaff salesStaff, int totalQuantity) {
        this.salesStaff = salesStaff;
        this.totalQuantity = totalQuantity;
    }

    public SellingItems(SellingItemsDetails[] details, int totalQuantity) {
        this.details = details;
        this.totalQuantity = totalQuantity;
    }

    public SalesStaff getSalesStaff() {
        return salesStaff;
    }

    public void setSalesStaff(SalesStaff salesStaff) {
        this.salesStaff = salesStaff;
    }

    public SellingItemsDetails[] getDetails() {
        return details;
    }

    public void setDetails(SellingItemsDetails[] details) {
        this.details = details;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "SellingItems{" +
                "salesStaff=" + salesStaff +
                ", details=" + Arrays.toString(details) +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}


