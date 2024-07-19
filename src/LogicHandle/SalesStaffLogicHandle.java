package LogicHandle;

import Entity.SalesStaff;

import java.util.Scanner;

public class SalesStaffLogicHandle {

    private final SalesStaff[] salesStaffs = new SalesStaff[1000];

    public int getSalesStaffLength() {
        return salesStaffs.length;
    }

    public void inputNewSalesStaff() {
        System.out.println("Nhập số lượng nhân viên muốn thêm mới: ");
        int salesNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < salesNumber; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ" + (i + 1));
            SalesStaff salesStaff = new SalesStaff();
            salesStaff.inputInfo();
            saveSalesStaff(salesStaff);
        }
    }

    private void saveSalesStaff(SalesStaff salesStaff) {
        for (int i = 0; i < salesStaffs.length; i++) {
            if (salesStaffs[i] == null) {
                continue;
            }
            salesStaffs[i] = salesStaff;
                break;
        }

    }

    public void printSalesStaff() {
        for (int i = 0; i < salesStaffs.length; i++) {
            if (salesStaffs[i] == null) {
                continue;
            }
            System.out.println(salesStaffs[i]);
        }
    }

    public boolean checkSalesStaffAvailanle() {
        boolean checkSalesStaffAvailable = false;
        for (int i = 0; i < salesStaffs.length; i++) {
            if (salesStaffs[i] != null) {
                checkSalesStaffAvailable = true;
                break;
            }
        }
        return checkSalesStaffAvailable;
    }

    public SalesStaff searchSalesStaffById(int saleStaffID) {
        for (int i = 0; i < salesStaffs.length; i++) {
            if (salesStaffs[i] != null && saleStaffID == salesStaffs[i].getId()) {
                return salesStaffs[i];
            }
        }
        return null;
    }
}

