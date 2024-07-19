package LogicHandle;

import Entity.Item;
import Entity.SalesStaff;
import Entity.SellingItemsDetails;

import java.util.Scanner;

public class SaleLogicHandle {

    private final SaleLogicHandle[] saleLogicHandles = new SaleLogicHandle[1000];

    private final SalesStaffLogicHandle salesStaffLogicHandle;
    private final ItemsLogicHandle itemsLogicHandle;

    public SaleLogicHandle(SalesStaffLogicHandle salesStaffLogicHandle, ItemsLogicHandle itemsLogicHandle) {
        this.salesStaffLogicHandle = salesStaffLogicHandle;
        this.itemsLogicHandle = itemsLogicHandle;
    }

    public void createSellingList() {

        boolean ifSaleStaffAvailable = salesStaffLogicHandle.checkSalesStaffAvailanle();
        boolean ifItemAvailable = itemsLogicHandle.checkItemsAvailable();

        if (!ifSaleStaffAvailable || !ifItemAvailable) {
            System.out.println("Chưa có đủ dữ liệu về Nhân Viên hoặc Mặt hàng để thực hiện. Vui lòng nhập thông tin của Nhân Viên và Mặt Hàng trước khi mượn");
            return;
        }


        System.out.print("Có bao nhiêu nhân viên đang bán hàng: ");
        int salesStaffNumber;
        while (true) {
            salesStaffNumber = new Scanner(System.in).nextInt();
            if (salesStaffNumber > 0 && salesStaffNumber <= salesStaffLogicHandle.getSalesStaffLength()) {
                break;
            }
            System.out.println("Số lượng nhân viên không hợp lệ, vui lòng nhập lại: ");
        }
        for (int i = 0; i < salesStaffNumber; i++) {

            System.out.println("Nhập thông tin id của nhân viên bán hàng thứ " + (i + 1) + ": ");

            SalesStaff salesStaff = querySalesStaff();

            SellingItemsDetails[] details = declareSalesInfo();


        }

    }

    private SellingItemsDetails[] declareSalesInfo() {
        System.out.println("Số lượng mặt hàng bán của nhân viên: ");
        int sellItemsNumber = 0;
        while (true) {
            sellItemsNumber = new Scanner(System.in).nextInt();
            if (sellItemsNumber > 0 && sellItemsNumber <= itemsLogicHandle.getItemsLength() && sellItemsNumber <= 5) {
                break;
            }
            System.out.println("Số lượng hàng bán không hợp lệ ( nhập số dương và không vượt quá 5), vui lòng nhập lại: ");
        }
        SellingItemsDetails[] details = new SellingItemsDetails[sellItemsNumber];

        int count = 0;
        for (int i = 0; i < sellItemsNumber; i++) {
            System.out.println("Nhập id của mặt hàng thứ " + (i + 1) + ": ");

            Item item = null;
            while (true) {
                int itemID = new Scanner(System.in).nextInt();
                // xác định xem cái id của sách kia có tồn tại trong thư viện không
                item = itemsLogicHandle.searchItemsByID(itemID);
                if (item != null) {
                    break;
                }
                System.out.println("Không có mặt hàng nào khớp vs ID vừa nhập, xin vui lòng nhập lại: ");
            }
            int quantity = 0;
        SellingItemsDetails detail = new SellingItemsDetails(item, quantity);
        details[count] = detail;
        count++;

        }
        return details;
    }

        private SalesStaff querySalesStaff () {
            SalesStaff salesStaff = null;
            while (true) {
                int saleStaffID = new Scanner(System.in).nextInt();

                salesStaff = salesStaffLogicHandle.searchSalesStaffById(saleStaffID);
                if (salesStaff != null) {
                    break;
                }
                System.out.print("Không có nhân viên bán hàng nào mang mã vừa nhâp, xin vui lòng nhập lại: ");
            }
            return salesStaff;
        }
    }

