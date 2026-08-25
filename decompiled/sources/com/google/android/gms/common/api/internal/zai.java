package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zai {
    public final int zac;

    public zai(int r1) {
            r0 = this;
            r0.<init>()
            r0.zac = r1
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zah(android.os.RemoteException r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r2 = r2.getLocalizedMessage()
            r0.append(r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            java.lang.String r0 = r0.toString()
            r1 = 19
            r2.<init>(r1, r0)
            return r2
    }

    public abstract void zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1);

    public abstract void zae(@androidx.annotation.NonNull java.lang.Exception r1);

    public abstract void zaf(com.google.android.gms.common.api.internal.zabq<?> r1) throws android.os.DeadObjectException;

    public abstract void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r1, boolean r2);
}
