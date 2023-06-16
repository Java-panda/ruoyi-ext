package com.ruoyi.panda.constant;

import com.ruoyi.panda.domain.MoneyNote;

public enum ImageTableType {
    MONEYNOTE(MoneyNote.class.getSimpleName());

    private String value;

    ImageTableType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
