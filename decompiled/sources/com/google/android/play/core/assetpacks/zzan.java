package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzan extends com.google.android.play.core.assetpacks.zzal {
    public zzan(com.google.android.play.core.assetpacks.zzaw r1, com.google.android.play.core.tasks.zzi r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    public final void zze(android.os.Bundle r1, android.os.Bundle r2) throws android.os.RemoteException {
            r0 = this;
            super.zze(r1, r2)
            java.lang.String r2 = "chunk_file_descriptor"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            com.google.android.play.core.tasks.zzi r2 = r0.zza
            r2.zze(r1)
            return
    }
}
