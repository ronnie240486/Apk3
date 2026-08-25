package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaco {
    private static final java.util.concurrent.ExecutorService zaa = null;

    static {
            com.google.android.gms.internal.base.zam r0 = com.google.android.gms.internal.base.zap.zaa()
            com.google.android.gms.common.util.concurrent.NumberedThreadFactory r1 = new com.google.android.gms.common.util.concurrent.NumberedThreadFactory
            java.lang.String r2 = "GAC_Transform"
            r1.<init>(r2)
            r2 = 1
            java.util.concurrent.ExecutorService r0 = r0.zaa(r1, r2)
            com.google.android.gms.common.api.internal.zaco.zaa = r0
            return
    }

    public static java.util.concurrent.ExecutorService zaa() {
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.common.api.internal.zaco.zaa
            return r0
    }
}
