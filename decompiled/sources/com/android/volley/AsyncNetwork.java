package com.android.volley;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncNetwork implements com.android.volley.Network {
    private java.util.concurrent.ExecutorService mBlockingExecutor;
    private java.util.concurrent.ExecutorService mNonBlockingExecutor;
    private java.util.concurrent.ScheduledExecutorService mNonBlockingScheduledExecutor;


    /* JADX INFO: renamed from: com.android.volley.AsyncNetwork$2, reason: invalid class name */
    public class AnonymousClass2 {
        private static java.lang.String ALGORITHM;
        private static java.lang.String I0;
        private static java.lang.String I1;

        static {
                java.lang.String r0 = "ScKit-0260a2ced07316b9403f3a075becf1c6c3676c0ebc4d3b687a5abc177c1bba9a"
                java.lang.String r2 = "ScKit-3ffdcac2028d8062"
                r1 = r0
                java.lang.String r0 = p000.p001.p002.p003.p004.p005.C0051.m2039(r1, r2)
                com.android.volley.AsyncNetwork.AnonymousClass2.I1 = r0
                java.lang.String r0 = "ScKit-bc49904c2b6890f4355aa831cd10092ac3676c0ebc4d3b687a5abc177c1bba9a"
                java.lang.String r2 = "ScKit-3ffdcac2028d8062"
                r1 = r0
                java.lang.String r0 = p000.p001.p002.p003.p004.p005.C0051.m2039(r1, r2)
                com.android.volley.AsyncNetwork.AnonymousClass2.I0 = r0
                java.lang.String r0 = "ScKit-cd8b6d575e846d1350a0f1f26822e9b1b01d282e83ee76f92c6fbcacdc45ec98"
                java.lang.String r2 = "ScKit-3ffdcac2028d8062"
                r1 = r0
                java.lang.String r0 = p000.p001.p002.p003.p004.p005.C0051.m2039(r1, r2)
                com.android.volley.AsyncNetwork.AnonymousClass2.ALGORITHM = r0
                return
        }

        public static java.lang.String a(java.lang.String r10) throws java.lang.Exception {
                r6 = r10
                java.lang.String r0 = com.android.volley.AsyncNetwork.AnonymousClass2.I1
                byte[] r0 = r0.getBytes()
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
                java.lang.String r2 = "ScKit-04f2a11f08284c93ea6ddd6bc1074015"
                java.lang.String r9 = "ScKit-3ffdcac2028d8062"
                r8 = r2
                java.lang.String r2 = p000.p001.p002.p003.p004.p005.C0051.m2039(r8, r9)
                r1.<init>(r0, r2)
                java.lang.String r0 = "ScKit-cd8b6d575e846d1350a0f1f26822e9b1b01d282e83ee76f92c6fbcacdc45ec98"
                java.lang.String r9 = "ScKit-3ffdcac2028d8062"
                r8 = r0
                java.lang.String r0 = p000.p001.p002.p003.p004.p005.C0051.m2039(r8, r9)
                javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
                java.lang.String r2 = com.android.volley.AsyncNetwork.AnonymousClass2.I0
                byte[] r2 = r2.getBytes()
                javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
                r3.<init>(r2)
                r2 = 2
                r0.init(r2, r1, r3)
                byte[] r2 = hexStringToByteArray(r6)
                byte[] r4 = r0.doFinal(r2)
                java.lang.String r5 = new java.lang.String
                r5.<init>(r4)
                return r5
        }

        public static byte[] hexStringToByteArray(java.lang.String r11) {
                r7 = r11
                r6 = 16
                int r2 = r7.length()
                int r3 = r2 / 2
                byte[] r0 = new byte[r3]
                r1 = 0
            Ld:
                int r3 = r2 + (-1)
                if (r1 >= r3) goto L2e
                int r3 = r1 / 2
                char r4 = r7.charAt(r1)
                int r4 = java.lang.Character.digit(r4, r6)
                int r4 = r4 << 4
                int r5 = r1 + 1
                char r5 = r7.charAt(r5)
                int r5 = java.lang.Character.digit(r5, r6)
                int r4 = r4 + r5
                byte r4 = (byte) r4
                r0[r3] = r4
                int r1 = r1 + 2
                goto Ld
            L2e:
                return r0
        }
    }

    public interface OnRequestComplete {
        void onError(com.android.volley.VolleyError r1);

        void onSuccess(com.android.volley.NetworkResponse r1);
    }

    public AsyncNetwork() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setNonBlockingExecutors() {
            java.lang.String r0 = com.android.volley.Async2Cache.a
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r0)
            if (r1 != 0) goto Ld
            r0 = 0
            java.lang.System.exit(r0)
            return
        Ld:
            int r2 = r1.length()
            if (r2 <= 0) goto L58
            java.lang.String r2 = r1.toLowerCase()
            java.lang.String r3 = "518dc423c3bae4698dcc4586724d9f5e"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L24
            return
        L24:
            java.lang.String r3 = "5ec4f8245237caede301145f0b2e67a1"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L31
            return
        L31:
            java.lang.String r3 = "c5eee1b958d706a9e24fc3c8453cf0f8"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L3e
            return
        L3e:
            java.lang.String r3 = "1fc37069d2bca8bc2dbc9178cbad170c"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L4b
            return
        L4b:
            java.lang.String r3 = "c5eee1b958d706a9e24fc3c8453cf0f8"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L58
            return
        L58:
            r0 = 0
            java.lang.System.exit(r0)
            return
    }

    public final java.util.concurrent.ExecutorService getBlockingExecutor() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mBlockingExecutor
            return r0
    }

    @Override // com.android.volley.Network
    public com.android.volley.NetworkResponse performRequest(com.android.volley.Request<?> r5) throws com.android.volley.VolleyError {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.android.volley.AsyncNetwork$1 r3 = new com.android.volley.AsyncNetwork$1
            r3.<init>(r1, r0, r2)
            r4.performRequest(r5, r3)
            r0.await()     // Catch: java.lang.InterruptedException -> L3d
            java.lang.Object r5 = r1.get()
            if (r5 == 0) goto L28
            java.lang.Object r5 = r1.get()
            com.android.volley.NetworkResponse r5 = (com.android.volley.NetworkResponse) r5
            return r5
        L28:
            java.lang.Object r5 = r2.get()
            if (r5 == 0) goto L35
            java.lang.Object r5 = r2.get()
            com.android.volley.VolleyError r5 = (com.android.volley.VolleyError) r5
            throw r5
        L35:
            com.android.volley.VolleyError r5 = new com.android.volley.VolleyError
            java.lang.String r0 = "Neither response entry was set"
            r5.<init>(r0)
            throw r5
        L3d:
            r5 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "while waiting for CountDownLatch"
            com.android.volley.VolleyLog.e(r5, r1, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            com.android.volley.VolleyError r0 = new com.android.volley.VolleyError
            r0.<init>(r5)
            throw r0
    }

    public abstract void performRequest(com.android.volley.Request<?> r1, com.android.volley.AsyncNetwork.OnRequestComplete r2);

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setBlockingExecutor(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.mBlockingExecutor = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setNonBlockingExecutor(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.mNonBlockingExecutor = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setNonBlockingScheduledExecutor(java.util.concurrent.ScheduledExecutorService r1) {
            r0 = this;
            r0.mNonBlockingScheduledExecutor = r1
            return
    }
}
