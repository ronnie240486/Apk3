package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzt extends com.google.android.play.core.internal.zzl implements com.google.android.play.core.internal.zzu {
    public static com.google.android.play.core.internal.zzu zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.play.core.assetpacks.protocol.IAssetModuleService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.play.core.internal.zzu
            if (r1 == 0) goto L11
            com.google.android.play.core.internal.zzu r0 = (com.google.android.play.core.internal.zzu) r0
            return r0
        L11:
            com.google.android.play.core.internal.zzs r0 = new com.google.android.play.core.internal.zzs
            r0.<init>(r2)
            return r0
    }
}
