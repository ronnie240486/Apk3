package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzh extends com.google.android.play.core.review.zzg {
    public zzh(com.google.android.play.core.review.zzi r3, com.google.android.play.core.tasks.zzi r4) {
            r2 = this;
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "OnRequestInstallCallback"
            r0.<init>(r1)
            r2.<init>(r3, r0, r4)
            return
    }

    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.internal.zzae
    public final void zzb(android.os.Bundle r4) throws android.os.RemoteException {
            r3 = this;
            super.zzb(r4)
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r0 = r4.get(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r1 = "is_review_no_op"
            boolean r4 = r4.getBoolean(r1)
            com.google.android.play.core.tasks.zzi r1 = r3.zzb
            com.google.android.play.core.review.zza r2 = new com.google.android.play.core.review.zza
            r2.<init>(r0, r4)
            r1.zze(r2)
            return
    }
}
