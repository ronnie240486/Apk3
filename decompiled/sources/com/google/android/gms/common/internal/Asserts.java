package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class Asserts {
    private Asserts() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Uninstantiable"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkMainThread(@androidx.annotation.NonNull java.lang.String r5) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto Lf
            return
        Lf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 57
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "checkMainThread: current thread "
            java.lang.String r3 = " IS NOT the main thread "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r0, r3, r1)
            java.lang.String r0 = "!"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "Asserts"
            android.util.Log.e(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotMainThread(@androidx.annotation.NonNull java.lang.String r5) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto Lf
            return
        Lf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 56
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "checkNotMainThread: current thread "
            java.lang.String r3 = " IS the main thread "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r0, r3, r1)
            java.lang.String r0 = "!"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "Asserts"
            android.util.Log.e(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null reference"
            r1.<init>(r0)
            throw r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNull(@androidx.annotation.NonNull java.lang.Object r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "non-null reference"
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }
}
