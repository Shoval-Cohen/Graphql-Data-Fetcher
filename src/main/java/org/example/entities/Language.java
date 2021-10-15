package org.example.entities;

public class Language extends IEntity {
    String nativeLang;
    boolean rtl;

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
