package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class InternalFrameworkListenerExtensions {
    private InternalFrameworkListenerExtensions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void registerFrameworkListener(android.content.Context r0, com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1) {
            com.google.android.play.core.splitinstall.zzp r0 = com.google.android.play.core.splitinstall.zzu.zza(r0)
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r0.zza()
            r0.zza(r1)
            return
    }

    public static void unregisterFrameworkListener(android.content.Context r0, com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1) {
            com.google.android.play.core.splitinstall.zzp r0 = com.google.android.play.core.splitinstall.zzu.zza(r0)
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r0.zza()
            r0.zzb(r1)
            return
    }
}
