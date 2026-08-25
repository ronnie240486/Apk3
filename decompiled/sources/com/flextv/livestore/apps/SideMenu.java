package com.flextv.livestore.apps;

/* JADX INFO: loaded from: classes.dex */
public class SideMenu {
    public int image_url;
    public java.lang.String menu;
    public int position;

    public SideMenu(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.menu = r1
            r0.position = r2
            r0.image_url = r3
            return
    }

    public int getImage_url() {
            r1 = this;
            int r0 = r1.image_url
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.menu
            return r0
    }

    public int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }
}
