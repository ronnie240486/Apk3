package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaaf {
    private final com.google.android.gms.common.api.internal.ApiKey<?> zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zab;

    public zaaf(com.google.android.gms.common.api.internal.ApiKey<?> r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r1.zab = r0
            r1.zaa = r2
            return
    }

    public final com.google.android.gms.common.api.internal.ApiKey<?> zaa() {
            r1 = this;
            com.google.android.gms.common.api.internal.ApiKey<?> r0 = r1.zaa
            return r0
    }

    public final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> zab() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r0 = r1.zab
            return r0
    }
}
