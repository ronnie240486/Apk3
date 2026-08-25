package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class zae<A extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api.AnyClient>> extends com.google.android.gms.common.api.internal.zai {
    public final A zaa;

    public zae(int r1, A r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "Null methods are not runnable."
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r1
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            A extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api$AnyClient> r0 = r2.zaa     // Catch: java.lang.IllegalStateException -> L6
            r0.setFailedResult(r3)     // Catch: java.lang.IllegalStateException -> L6
            return
        L6:
            r3 = move-exception
            java.lang.String r0 = "ApiCallRunner"
            java.lang.String r1 = "Exception reporting failure"
            android.util.Log.w(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@androidx.annotation.NonNull java.lang.Exception r6) {
            r5 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r6 = r6.getLocalizedMessage()
            int r2 = r1.length()
            java.lang.String r3 = java.lang.String.valueOf(r6)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 2
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = ": "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r1, r2, r6)
            r1 = 10
            r0.<init>(r1, r6)
            A extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api$AnyClient> r6 = r5.zaa     // Catch: java.lang.IllegalStateException -> L33
            r6.setFailedResult(r0)     // Catch: java.lang.IllegalStateException -> L33
            return
        L33:
            r6 = move-exception
            java.lang.String r0 = "ApiCallRunner"
            java.lang.String r1 = "Exception reporting failure"
            android.util.Log.w(r0, r1, r6)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq<?> r2) throws android.os.DeadObjectException {
            r1 = this;
            A extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api$AnyClient> r0 = r1.zaa     // Catch: java.lang.RuntimeException -> La
            com.google.android.gms.common.api.Api$Client r2 = r2.zaf()     // Catch: java.lang.RuntimeException -> La
            r0.run(r2)     // Catch: java.lang.RuntimeException -> La
            return
        La:
            r2 = move-exception
            r1.zae(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r2, boolean r3) {
            r1 = this;
            A extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<? extends com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Api$AnyClient> r0 = r1.zaa
            r2.zac(r0, r3)
            return
    }
}
