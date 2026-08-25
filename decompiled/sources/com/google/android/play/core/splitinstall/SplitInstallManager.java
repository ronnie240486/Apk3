package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public interface SplitInstallManager {
    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int r1);

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> r1);

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> r1);

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> r1);

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> r1);

    @androidx.annotation.NonNull
    java.util.Set<java.lang.String> getInstalledLanguages();

    @androidx.annotation.NonNull
    java.util.Set<java.lang.String> getInstalledModules();

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int r1);

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates();

    void registerListener(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1);

    boolean startConfirmationDialogForResult(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallSessionState r1, @androidx.annotation.NonNull android.app.Activity r2, int r3) throws android.content.IntentSender.SendIntentException;

    boolean startConfirmationDialogForResult(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallSessionState r1, @androidx.annotation.NonNull com.google.android.play.core.common.IntentSenderForResultStarter r2, int r3) throws android.content.IntentSender.SendIntentException;

    com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallRequest r1);

    void unregisterListener(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1);

    void zza(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1);

    void zzb(@androidx.annotation.NonNull com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener r1);
}
