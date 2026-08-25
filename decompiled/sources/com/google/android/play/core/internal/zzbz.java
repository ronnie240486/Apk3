package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbz extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzca {
    public static com.google.android.play.core.internal.zzca zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.play.core.internal.zzca
            if (r1 == 0) goto L11
            com.google.android.play.core.internal.zzca r0 = (com.google.android.play.core.internal.zzca) r0
            return r0
        L11:
            com.google.android.play.core.internal.zzby r0 = new com.google.android.play.core.internal.zzby
            r0.<init>(r2)
            return r0
    }
}
