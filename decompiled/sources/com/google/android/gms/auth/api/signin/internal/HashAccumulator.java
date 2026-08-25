package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class HashAccumulator {
    private int zab;

    public HashAccumulator() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zab = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            int r0 = r2.zab
            r1 = 31
            int r1 = r1 * r0
            if (r3 != 0) goto La
            r3 = 0
            goto Le
        La:
            int r3 = r3.hashCode()
        Le:
            int r1 = r1 + r3
            r2.zab = r1
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int hash() {
            r1 = this;
            int r0 = r1.zab
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean r3) {
            r2 = this;
            int r0 = r2.zab
            r1 = 31
            int r1 = r1 * r0
            int r1 = r1 + r3
            r2.zab = r1
            return r2
    }
}
