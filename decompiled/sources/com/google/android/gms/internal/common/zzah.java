package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzah {
    public static java.lang.Object[] zza(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L18
            r1 = r2[r0]
            if (r1 == 0) goto La
            int r0 = r0 + 1
            goto L1
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r3 = 20
            java.lang.String r1 = "at index "
            java.lang.String r3 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r1, r0)
            r2.<init>(r3)
            throw r2
        L18:
            return r2
    }
}
