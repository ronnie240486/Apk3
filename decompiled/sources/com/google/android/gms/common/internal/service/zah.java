package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zah extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.common.internal.service.zal> {
    public zah(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r11, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r12) {
            r7 = this;
            r3 = 39
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.service.zal
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.common.internal.service.zal r3 = (com.google.android.gms.common.internal.service.zal) r3
            goto L18
        L12:
            com.google.android.gms.common.internal.service.zal r0 = new com.google.android.gms.common.internal.service.zal
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.ICommonService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.service.START"
            return r0
    }
}
