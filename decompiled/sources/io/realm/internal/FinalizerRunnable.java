package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
class FinalizerRunnable implements java.lang.Runnable {
    private final java.lang.ref.ReferenceQueue<io.realm.internal.NativeObject> referenceQueue;

    public FinalizerRunnable(java.lang.ref.ReferenceQueue<io.realm.internal.NativeObject> r1) {
            r0 = this;
            r0.<init>()
            r0.referenceQueue = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
        L0:
            java.lang.ref.ReferenceQueue<io.realm.internal.NativeObject> r0 = r2.referenceQueue     // Catch: java.lang.InterruptedException -> Lc
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> Lc
            io.realm.internal.NativeObjectReference r0 = (io.realm.internal.NativeObjectReference) r0     // Catch: java.lang.InterruptedException -> Lc
            r0.cleanup()     // Catch: java.lang.InterruptedException -> Lc
            goto L0
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore"
            io.realm.log.RealmLog.fatal(r1, r0)
            return
    }
}
