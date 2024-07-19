package Constant;

public enum ItemsType {

    ĐT("Điện tử"),

    ĐL("Điện lạnh"),

    MT("Máy tính"),

    TBVP("Thiết bị văn phòng");

    public String value;

    public String getValue() {
        return value;
    }

    ItemsType(String value) {
        this.value = value;

    }


}
