package io.realm.internal.async;

/* JADX INFO: loaded from: classes3.dex */
public class BgPriorityRunnable implements java.lang.Runnable {
    private final java.lang.Runnable runnable;

    public BgPriorityRunnable(java.lang.Runnable r1) {
            r0 = this;
            r0.<init>()
            r0.runnable = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            java.lang.Runnable r0 = r1.runnable
            r0.run()
            return
    }
}
