package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CancellationToken {
    public CancellationToken() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean isCancellationRequested();

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.CancellationToken onCanceledRequested(@androidx.annotation.NonNull com.google.android.gms.tasks.OnTokenCanceledListener r1);
}
