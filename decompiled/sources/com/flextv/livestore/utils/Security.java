package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Security {
    private static final java.lang.String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final java.lang.String KEY_FACTORY_ALGORITHM = "RSA";
    private static final java.lang.String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final java.lang.String TAG = "IABUtil/Security";

    public native Security();

    public static native byte[] decrypt(byte[] r0, byte[] r1);

    public static native java.security.PublicKey generatePublicKey(java.lang.String r0);

    public static native java.lang.String getAddData(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    public static native java.lang.String getDecodedString(java.lang.String r0);

    public static native java.lang.String getDeleteData(java.lang.String r0, java.lang.String r1);

    private static native java.lang.String getEncryptKey(int r0);

    private static native int getEncryptKeyPosition(java.lang.String r0);

    private static native java.lang.String getEncryptPositionString(int r0);

    public static native org.json.JSONObject getFileData(int r0);

    public static native org.json.JSONObject getJsonData(java.lang.String r0);

    public static native java.lang.String getParentData(java.lang.String r0, java.lang.String r1);

    public static native java.lang.String getStringData(java.lang.String r0, java.lang.String r1, boolean r2, java.lang.String r3);

    public static native org.json.JSONObject getUserObject(java.lang.String r0, java.lang.String r1);

    public static native boolean verify(java.security.PublicKey r0, java.lang.String r1, java.lang.String r2);

    public static native boolean verifyPurchase(java.lang.String r0, java.lang.String r1, java.lang.String r2);
}
