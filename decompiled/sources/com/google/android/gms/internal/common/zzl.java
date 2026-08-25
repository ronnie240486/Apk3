package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.gms.internal.common.zzk {
    private final char zza;

    public zzl(char r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            char r0 = r7.zza
            r1 = 6
            char[] r1 = new char[r1]
            r1 = {x0038: FILL_ARRAY_DATA , data: [92, 117, 0, 0, 0, 0} // fill-array
            r2 = 0
        L9:
            r3 = 4
            if (r2 >= r3) goto L1c
            int r4 = 5 - r2
            r5 = r0 & 15
            java.lang.String r6 = "0123456789ABCDEF"
            char r5 = r6.charAt(r5)
            r1[r4] = r5
            int r0 = r0 >> r3
            int r2 = r2 + 1
            goto L9
        L1c:
            java.lang.String r0 = java.lang.String.copyValueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 18
            r2.<init>(r1)
            java.lang.String r1 = "CharMatcher.is('"
            java.lang.String r3 = "')"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r0, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char r2) {
            r1 = this;
            char r0 = r1.zza
            if (r2 != r0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }
}
