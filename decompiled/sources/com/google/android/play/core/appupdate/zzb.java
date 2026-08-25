package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.play.core.listener.zzc {
    public zzb(android.content.Context r4) {
            r3 = this;
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "AppUpdateListenerRegistry"
            r0.<init>(r1)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "com.google.android.play.core.install.ACTION_INSTALL_STATUS"
            r1.<init>(r2)
            r3.<init>(r0, r1, r4)
            return
    }

    @Override // com.google.android.play.core.listener.zzc
    public final void zza(android.content.Context r7, android.content.Intent r8) {
            r6 = this;
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r0 = "package.name"
            java.lang.String r1 = r8.getStringExtra(r0)
            boolean r7 = r7.equals(r1)
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L22
            com.google.android.play.core.internal.zzag r7 = r6.zza
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = r8.getStringExtra(r0)
            r1[r2] = r8
            java.lang.String r8 = "ListenerRegistryBroadcastReceiver received broadcast for third party app: %s"
            r7.zza(r8, r1)
            return
        L22:
            com.google.android.play.core.internal.zzag r7 = r6.zza
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "List of extras in received intent:"
            r7.zza(r3, r0)
            android.os.Bundle r7 = r8.getExtras()
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L37:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.play.core.internal.zzag r3 = r6.zza
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r0
            android.os.Bundle r5 = r8.getExtras()
            java.lang.Object r0 = r5.get(r0)
            r4[r1] = r0
            java.lang.String r0 = "Key: %s; value: %s"
            r3.zza(r0, r4)
            goto L37
        L5a:
            com.google.android.play.core.internal.zzag r7 = r6.zza
            com.google.android.play.core.install.InstallState r7 = com.google.android.play.core.install.InstallState.zzb(r8, r7)
            com.google.android.play.core.internal.zzag r8 = r6.zza
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r7
            java.lang.String r1 = "ListenerRegistryBroadcastReceiver.onReceive: %s"
            r8.zza(r1, r0)
            r6.zzi(r7)
            return
    }
}
