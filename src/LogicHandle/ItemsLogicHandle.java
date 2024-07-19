package LogicHandle;

import Entity.Item;

import java.util.Scanner;

public class ItemsLogicHandle {

    private final Item[] items = new Item[1000];

    public int getItemsLength () {
        return items.length;
    }

    public void inputNewItimes() {
        System.out.println("Nhập số lượng mặt hàng muốn thêm mới: ");
        int itemNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < itemNumber ; i++) {
        System.out.println("Nhập thông tin cho mặt hàng thứ" + (i+1));
        Item item = new Item();
        item.inputInfo();
        saveItem(item);
        }

        }

    private void saveItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                items [i] = item;
                break;
            }

        }
    }

    public void printItems() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            }
            System.out.println(items[i]);
        }
    }

    public boolean checkItemsAvailable() {
        boolean checkItemsAvailable = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                checkItemsAvailable = true;
                break;
            }
        }
        return checkItemsAvailable;
    }


        public Item searchItemsByID ( int itemID){
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && itemID == items[i].getId()) {
                    return items[i];
                }
            }
            return null;
        }

}



