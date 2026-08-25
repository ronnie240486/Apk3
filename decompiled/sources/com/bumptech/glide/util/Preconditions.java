package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkArgument(boolean r0, @androidx.annotation.NonNull java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String checkNotEmpty(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be null or empty"
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public static <T extends java.util.Collection<Y>, Y> T checkNotEmpty(@androidx.annotation.NonNull T r1) {
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be empty."
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public static <T> T checkNotNull(@androidx.annotation.Nullable T r1) {
            java.lang.String r0 = "Argument must not be null"
            java.lang.Object r1 = checkNotNull(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static <T> T checkNotNull(@androidx.annotation.Nullable T r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }
}
