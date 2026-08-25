package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class ResourceRecycler {
    private final android.os.Handler handler;
    private boolean isRecycling;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ResourceRecyclerCallback implements android.os.Handler.Callback {
        public ResourceRecyclerCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Ld
                java.lang.Object r3 = r3.obj
                com.bumptech.glide.load.engine.Resource r3 = (com.bumptech.glide.load.engine.Resource) r3
                r3.recycle()
                return r1
            Ld:
                r3 = 0
                return r3
        }
    }

    public ResourceRecycler() {
            r3 = this;
            r3.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.bumptech.glide.load.engine.ResourceRecycler$ResourceRecyclerCallback r2 = new com.bumptech.glide.load.engine.ResourceRecycler$ResourceRecyclerCallback
            r2.<init>()
            r0.<init>(r1, r2)
            r3.handler = r0
            return
    }

    public final synchronized void recycle(com.bumptech.glide.load.engine.Resource<?> r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isRecycling     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            if (r0 != 0) goto L12
            if (r4 == 0) goto L9
            goto L12
        L9:
            r2.isRecycling = r1     // Catch: java.lang.Throwable -> L1d
            r3.recycle()     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2.isRecycling = r3     // Catch: java.lang.Throwable -> L1d
            goto L1b
        L12:
            android.os.Handler r4 = r2.handler     // Catch: java.lang.Throwable -> L1d
            android.os.Message r3 = r4.obtainMessage(r1, r3)     // Catch: java.lang.Throwable -> L1d
            r3.sendToTarget()     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
