package com.andyhax;

/* JADX INFO: loaded from: classes2.dex */
public class VPNManager {
    public static java.util.ArrayList<com.andyhax.VPNDetails> _haxVPN;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.andyhax.VPNManager._haxVPN = r0
            return
    }

    public native VPNManager();

    public static native void Demo();

    public static native java.lang.String GetPassword(java.lang.String r0);

    public static native java.lang.String GetUsername(java.lang.String r0);

    public static native void PopulateVPN(java.lang.String r0);
}
