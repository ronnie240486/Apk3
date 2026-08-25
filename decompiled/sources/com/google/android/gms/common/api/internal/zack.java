package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zack extends com.google.android.gms.common.api.internal.RegisterListenerMethod {
    public final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    public zack(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r1, com.google.android.gms.common.api.internal.ListenerHolder r2, com.google.android.gms.common.Feature[] r3, boolean r4, int r5) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(com.google.android.gms.common.api.Api.AnyClient r2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r1.zaa
            com.google.android.gms.common.api.internal.RemoteCall r0 = com.google.android.gms.common.api.internal.RegistrationMethods.Builder.zaa(r0)
            r0.accept(r2, r3)
            return
    }
}
