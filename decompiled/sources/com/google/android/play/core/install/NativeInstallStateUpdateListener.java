package com.google.android.play.core.install;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class NativeInstallStateUpdateListener implements com.google.android.play.core.install.InstallStateUpdatedListener {
    public NativeInstallStateUpdateListener() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: onStateUpdate, reason: avoid collision after fix types in other method */
    public native void onStateUpdate2(com.google.android.play.core.install.InstallState r1);

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final /* bridge */ /* synthetic */ void onStateUpdate(com.google.android.play.core.install.InstallState r1) {
            r0 = this;
            com.google.android.play.core.install.InstallState r1 = (com.google.android.play.core.install.InstallState) r1
            r0.onStateUpdate2(r1)
            return
    }
}
