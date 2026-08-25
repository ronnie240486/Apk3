package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zacl extends com.google.android.gms.common.api.internal.UnregisterListenerMethod {
    public final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    public zacl(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r1, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(com.google.android.gms.common.api.Api.AnyClient r2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = r1.zaa
            com.google.android.gms.common.api.internal.RemoteCall r0 = com.google.android.gms.common.api.internal.RegistrationMethods.Builder.zab(r0)
            r0.accept(r2, r3)
            return
    }
}
