package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class DataBufferUtils {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String KEY_NEXT_PAGE_TOKEN = "next_page_token";

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeAndClose(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBuffer<E> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.getCount()
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L25
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.common.data.Freezable r2 = (com.google.android.gms.common.data.Freezable) r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.freeze()     // Catch: java.lang.Throwable -> L25
            r0.add(r2)     // Catch: java.lang.Throwable -> L25
            goto Ld
        L21:
            r3.close()
            return r0
        L25:
            r0 = move-exception
            r3.close()
            throw r0
    }

    public static boolean hasData(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBuffer<?> r0) {
            if (r0 == 0) goto La
            int r0 = r0.getCount()
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean hasNextPage(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBuffer<?> r1) {
            android.os.Bundle r1 = r1.getMetadata()
            if (r1 == 0) goto L10
            java.lang.String r0 = "next_page_token"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static boolean hasPrevPage(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBuffer<?> r1) {
            android.os.Bundle r1 = r1.getMetadata()
            if (r1 == 0) goto L11
            java.lang.String r0 = "prev_page_token"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L11
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }
}
