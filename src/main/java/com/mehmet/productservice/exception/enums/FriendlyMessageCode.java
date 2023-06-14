package com.mehmet.productservice.exception.enums;

public enum FriendlyMessageCode implements IFriendlyMessageCode
{
    OK(1000),
    ERROR(1001),
    PRODUCT_NOT_CREATED_EXCEPTION(1500);
    ;
    private final int value;

    FriendlyMessageCode(int value) {
        this.value = value;
    }

    @Override
    public int getIFriendlyMessageCode() {
        return value;
    }
}
