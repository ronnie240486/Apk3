package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzl implements com.google.android.play.core.splitinstall.SplitInstallManager {
    private final com.google.android.play.core.internal.zzco zza;
    private final com.google.android.play.core.internal.zzco zzb;
    private final com.google.android.play.core.internal.zzco zzc;

    public zzl(com.google.android.play.core.internal.zzco r1, com.google.android.play.core.internal.zzco r2, com.google.android.play.core.internal.zzco r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    private final com.google.android.play.core.splitinstall.SplitInstallManager zzc() {
            r1 = this;
            com.google.android.play.core.internal.zzco r0 = r1.zzc
            java.lang.Object r0 = r0.zza()
            if (r0 != 0) goto L11
            com.google.android.play.core.internal.zzco r0 = r1.zza
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = (com.google.android.play.core.splitinstall.SplitInstallManager) r0
            goto L19
        L11:
            com.google.android.play.core.internal.zzco r0 = r1.zzb
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = (com.google.android.play.core.splitinstall.SplitInstallManager) r0
        L19:
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.cancelInstall(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.deferredInstall(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.deferredLanguageInstall(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.deferredLanguageUninstall(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.deferredUninstall(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            java.util.Set r0 = r0.getInstalledLanguages()
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final java.util.Set<java.lang.String> getInstalledModules() {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            java.util.Set r0 = r0.getInstalledModules()
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.getSessionState(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @androidx.annotation.NonNull
    public final com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r0 = r0.getSessionStates()
            return r0
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            r0.registerListener(r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallSessionState r2, @androidx.annotation.NonNull android.app.Activity r3, int r4) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            boolean r2 = r0.startConfirmationDialogForResult(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallSessionState r2, @androidx.annotation.NonNull com.google.android.play.core.common.IntentSenderForResultStarter r3, int r4) throws android.content.IntentSender.SendIntentException {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            boolean r2 = r0.startConfirmationDialogForResult(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallRequest r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            com.google.android.play.core.tasks.Task r2 = r0.startInstall(r2)
            return r2
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            r0.unregisterListener(r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            r0.zza(r2)
            return
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r2) {
            r1 = this;
            com.google.android.play.core.splitinstall.SplitInstallManager r0 = r1.zzc()
            r0.zzb(r2)
            return
    }
}
