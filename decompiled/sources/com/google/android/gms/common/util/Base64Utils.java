package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class Base64Utils {
    public Base64Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decode(@androidx.annotation.NonNull java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decodeUrlSafe(@androidx.annotation.NonNull java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@androidx.annotation.NonNull java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encode(@androidx.annotation.NonNull byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encodeUrlSafe(@androidx.annotation.NonNull byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String encodeUrlSafeNoPadding(@androidx.annotation.NonNull byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }
}
