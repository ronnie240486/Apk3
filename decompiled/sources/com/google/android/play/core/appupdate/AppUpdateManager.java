package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public interface AppUpdateManager {
    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> completeUpdate();

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo();

    void registerListener(@androidx.annotation.NonNull com.google.android.play.core.install.InstallStateUpdatedListener r1);

    com.google.android.play.core.tasks.Task<java.lang.Integer> startUpdateFlow(@androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateInfo r1, @androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateOptions r3);

    boolean startUpdateFlowForResult(@androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, @androidx.annotation.NonNull android.app.Activity r3, int r4) throws android.content.IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, @androidx.annotation.NonNull com.google.android.play.core.common.IntentSenderForResultStarter r3, int r4) throws android.content.IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateInfo r1, @androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateOptions r3, int r4) throws android.content.IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateInfo r1, @androidx.annotation.NonNull com.google.android.play.core.common.IntentSenderForResultStarter r2, @androidx.annotation.NonNull com.google.android.play.core.appupdate.AppUpdateOptions r3, int r4) throws android.content.IntentSender.SendIntentException;

    void unregisterListener(@androidx.annotation.NonNull com.google.android.play.core.install.InstallStateUpdatedListener r1);
}
