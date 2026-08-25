package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class ByteArrayPool {
    public static final java.util.Comparator<byte[]> BUF_COMPARATOR = null;
    private final java.util.List<byte[]> mBuffersByLastUse;
    private final java.util.List<byte[]> mBuffersBySize;
    private int mCurrentSize;
    private final int mSizeLimit;


    static {
            com.android.volley.toolbox.ByteArrayPool$1 r0 = new com.android.volley.toolbox.ByteArrayPool$1
            r0.<init>()
            com.android.volley.toolbox.ByteArrayPool.BUF_COMPARATOR = r0
            return
    }

    public ByteArrayPool(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mBuffersByLastUse = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 64
            r0.<init>(r1)
            r2.mBuffersBySize = r0
            r0 = 0
            r2.mCurrentSize = r0
            r2.mSizeLimit = r3
            return
    }

    private synchronized void trim() {
            r2 = this;
            monitor-enter(r2)
        L1:
            int r0 = r2.mCurrentSize     // Catch: java.lang.Throwable -> L1e
            int r1 = r2.mSizeLimit     // Catch: java.lang.Throwable -> L1e
            if (r0 <= r1) goto L1c
            java.util.List<byte[]> r0 = r2.mBuffersByLastUse     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1e
            java.util.List<byte[]> r1 = r2.mBuffersBySize     // Catch: java.lang.Throwable -> L1e
            r1.remove(r0)     // Catch: java.lang.Throwable -> L1e
            int r1 = r2.mCurrentSize     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 - r0
            r2.mCurrentSize = r1     // Catch: java.lang.Throwable -> L1e
            goto L1
        L1c:
            monitor-exit(r2)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized byte[] getBuf(int r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            java.util.List<byte[]> r1 = r3.mBuffersBySize     // Catch: java.lang.Throwable -> L2e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2e
            if (r0 >= r1) goto L2a
            java.util.List<byte[]> r1 = r3.mBuffersBySize     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L2e
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L2e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2e
            if (r2 < r4) goto L27
            int r4 = r3.mCurrentSize     // Catch: java.lang.Throwable -> L2e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 - r2
            r3.mCurrentSize = r4     // Catch: java.lang.Throwable -> L2e
            java.util.List<byte[]> r4 = r3.mBuffersBySize     // Catch: java.lang.Throwable -> L2e
            r4.remove(r0)     // Catch: java.lang.Throwable -> L2e
            java.util.List<byte[]> r4 = r3.mBuffersByLastUse     // Catch: java.lang.Throwable -> L2e
            r4.remove(r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return r1
        L27:
            int r0 = r0 + 1
            goto L2
        L2a:
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r3)
            return r4
        L2e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public synchronized void returnBuf(byte[] r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L2e
            int r0 = r3.length     // Catch: java.lang.Throwable -> L2b
            int r1 = r2.mSizeLimit     // Catch: java.lang.Throwable -> L2b
            if (r0 <= r1) goto L9
            goto L2e
        L9:
            java.util.List<byte[]> r0 = r2.mBuffersByLastUse     // Catch: java.lang.Throwable -> L2b
            r0.add(r3)     // Catch: java.lang.Throwable -> L2b
            java.util.List<byte[]> r0 = r2.mBuffersBySize     // Catch: java.lang.Throwable -> L2b
            java.util.Comparator<byte[]> r1 = com.android.volley.toolbox.ByteArrayPool.BUF_COMPARATOR     // Catch: java.lang.Throwable -> L2b
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 >= 0) goto L1b
            int r0 = -r0
            int r0 = r0 + (-1)
        L1b:
            java.util.List<byte[]> r1 = r2.mBuffersBySize     // Catch: java.lang.Throwable -> L2b
            r1.add(r0, r3)     // Catch: java.lang.Throwable -> L2b
            int r0 = r2.mCurrentSize     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L2b
            int r0 = r0 + r3
            r2.mCurrentSize = r0     // Catch: java.lang.Throwable -> L2b
            r2.trim()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return
        L2b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L2e:
            monitor-exit(r2)
            return
    }
}
