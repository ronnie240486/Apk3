package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class Preconditions {
    private Preconditions() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Uninstantiable"
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkArgument(boolean r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkArgument(boolean r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkHandlerThread(@androidx.annotation.NonNull android.os.Handler r5) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r5.getLooper()
            if (r0 == r1) goto L51
            if (r0 == 0) goto L15
            java.lang.Thread r0 = r0.getThread()
            java.lang.String r0 = r0.getName()
            goto L17
        L15:
            java.lang.String r0 = "null current looper"
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            android.os.Looper r5 = r5.getLooper()
            java.lang.Thread r5 = r5.getThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 36
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Must be called on "
            java.lang.String r3 = " thread, but got "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r2, r5, r3, r0)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            r1.<init>(r5)
            throw r1
        L51:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkHandlerThread(@androidx.annotation.NonNull android.os.Handler r1, @androidx.annotation.NonNull java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkMainThread(@androidx.annotation.NonNull java.lang.String r1) {
            boolean r0 = com.google.android.gms.common.util.zzb.zza()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String checkNotEmpty(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given String is empty or null"
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String checkNotEmpty(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotMainThread() {
            java.lang.String r0 = "Must not be called on the main application thread"
            checkNotMainThread(r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkNotMainThread(@androidx.annotation.NonNull java.lang.String r1) {
            boolean r0 = com.google.android.gms.common.util.zzb.zza()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T checkNotNull(@androidx.annotation.Nullable T r1) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T checkNotNull(@androidx.annotation.NonNull T r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int checkNotZero(int r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Given Integer is zero"
            r1.<init>(r0)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static int checkNotZero(int r0, @androidx.annotation.NonNull java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static long checkNotZero(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given Long is zero"
            r3.<init>(r4)
            throw r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static long checkNotZero(long r3, @androidx.annotation.NonNull java.lang.Object r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r3.<init>(r4)
            throw r3
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

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void checkState(boolean r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }
}
