package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract void notifyListener();

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void notifyListener(@androidx.annotation.NonNull L r1) {
            r0 = this;
            r0.notifyListener()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @com.google.android.gms.common.annotation.KeepForSdk
    public void onNotifyListenerFailed() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zaa
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }
}
