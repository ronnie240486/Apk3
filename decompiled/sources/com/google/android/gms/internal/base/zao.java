package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zao implements com.google.android.gms.internal.base.zam {
    private zao() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ zao(com.google.android.gms.internal.base.zan r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.base.zam
    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory r1, int r2) {
            r0 = this;
            r2 = 1
            java.util.concurrent.ExecutorService r1 = r0.zac(r2, r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.base.zam
    public final java.util.concurrent.ExecutorService zab(int r2, int r3) {
            r1 = this;
            java.util.concurrent.ThreadFactory r2 = java.util.concurrent.Executors.defaultThreadFactory()
            r3 = 4
            r0 = 2
            java.util.concurrent.ExecutorService r2 = r1.zac(r3, r2, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.base.zam
    public final java.util.concurrent.ExecutorService zac(int r9, java.util.concurrent.ThreadFactory r10, int r11) {
            r8 = this;
            java.util.concurrent.ThreadPoolExecutor r11 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r3 = 60
            r0 = r11
            r1 = r9
            r2 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9 = 1
            r11.allowCoreThreadTimeOut(r9)
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.unconfigurableExecutorService(r11)
            return r9
    }
}
