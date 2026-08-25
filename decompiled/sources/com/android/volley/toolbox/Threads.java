package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes2.dex */
final class Threads {
    private Threads() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void throwIfNotOnMainThread() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be invoked from the main thread."
            r0.<init>(r1)
            throw r0
    }
}
