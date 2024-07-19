package Entity;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Scanner;

public class SalesStaff extends Person {

    private int id;
    private LocalDate contractSignDate;

    public static int AUTO_ID = 1000;

    public SalesStaff() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public void inputInfo() {
        System.out.println("Nhập tên nhân viên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ của nhân viên: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại của nhân viên: ");
        this.setPhoneNumber(new Scanner(System.in).nextLine());

    }

    public int getId() {
        return id;
    }



    public LocalDate getContractSignDate() {
        return contractSignDate;
    }

    public void setContractSignDate(LocalDate contractSignDate) {
        this.contractSignDate = contractSignDate;
    }

    @Override
    public String toString() {
        return "SalesStaff{" +
                "id=" + id +
                ", contractSignDate=" + contractSignDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}


