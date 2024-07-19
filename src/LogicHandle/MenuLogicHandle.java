package LogicHandle;

import Entity.SalesStaff;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MenuLogicHandle {

    private final ItemsLogicHandle itemsLogicHandle = new ItemsLogicHandle();
    private final SalesStaffLogicHandle salesStaffLogicHandle = new SalesStaffLogicHandle();
    private final SaleLogicHandle saleLogicHandle = new SaleLogicHandle(salesStaffLogicHandle, itemsLogicHandle);

    public void menu() {
      while (true) {
          printMenuOptions();
          int functionChoice = chooseFunctionChoice();
          switch (functionChoice) {
              case 1:
                  itemsLogicHandle.inputNewItimes();
                  break;
              case 2:
                  itemsLogicHandle.printItems();
                  break;
              case 3:
                  salesStaffLogicHandle.inputNewSalesStaff();
                  break;
              case 4:
                  salesStaffLogicHandle.printSalesStaff();
                  break;
              case 5:
                    saleLogicHandle.createSellingList();
                  break;
              case 6:
                  System.out.println("Chwcs năng 6");
                  break;
              case 7:
                  System.out.println("Chwcs năng 7");
                  break;
              case 8:
                  System.out.println("Chwcs năng 8");
                  break;
              case 9:
                  return;

          }
      }
    }

    private void printMenuOptions() {

            System.out.println("==========PHẦN MỀM QUẢN LÝ BÁN HÀNG==========");
            System.out.println("1. Nhập danh sách mặt hàng mới: ");
            System.out.println("2. Hiển thị danh sách mặt hàng đã có trong siêu thị:");
            System.out.println("3. Đăng kí tài khoản mới cho nhân viên siêu thị: ");
            System.out.println("4. Hiển thị danh sách nhân viên đang có trong siêu thị: ");
            System.out.println("5. Lập bảng danh sách bán hàng: ");
            System.out.println("6. Hiển thị bảng danh sách bán hàng: ");
            System.out.println("7. Sắp xếp danh sách bán hàng: ");
            System.out.println("8. Tìm kiếm và hiển thị danh sách bán hàng: ");
            System.out.println("9. Thoát ");

        }


    private int chooseFunctionChoice() {
        System.out.println("Xin mời chọn chức năng");
        int functionChoice;
        while (true) {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại (từ 1 tới 9):");
        }
        return functionChoice;
    }
}








