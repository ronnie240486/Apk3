package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zza implements com.google.android.gms.tasks.OnSuccessListener<java.lang.Void> {
    public final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zza;

    public zza(com.google.android.gms.tasks.OnTokenCanceledListener r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Void r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            com.google.android.gms.tasks.OnTokenCanceledListener r1 = r0.zza
            r1.onCanceled()
            return
    }
}
