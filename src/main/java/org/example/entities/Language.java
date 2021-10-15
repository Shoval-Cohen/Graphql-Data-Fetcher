package org.example.entities;

public class Language {
    String code;
    String name;
    String nativeLang;
    boolean rtl;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNative() {
        return nativeLang;
    }

    public void setNative(String nativeLang) {
        this.nativeLang = nativeLang;
    }

    public boolean isRtl() {
        return rtl;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }
}
