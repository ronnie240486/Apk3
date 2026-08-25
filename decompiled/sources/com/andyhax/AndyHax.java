package com.andyhax;

/* JADX INFO: loaded from: classes2.dex */
public class AndyHax {
    public static java.util.ArrayList<com.andyhax.DNSContainer> _haxDNS;
    public static int _numberAccounts;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.andyhax.AndyHax._haxDNS = r0
            r0 = 0
            com.andyhax.AndyHax._numberAccounts = r0
            return
    }

    public native AndyHax();

    public static native java.lang.String FormatMAC(java.lang.String r0);

    public static native void PopulateDNS(java.lang.String r0);

    public static native java.lang.String convertInputStreamToString(java.io.InputStream r0, int r1);

    public static native java.lang.String downloadContent(java.lang.String r0);
}
