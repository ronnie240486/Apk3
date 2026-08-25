package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zao implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.common.api.internal.zap zaa;
    private final com.google.android.gms.common.api.internal.zam zab;

    public zao(com.google.android.gms.common.api.internal.zap r1, com.google.android.gms.common.api.internal.zam r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            return
    }

    @Override // java.lang.Runnable
    @androidx.annotation.MainThread
    public final void run() {
            r8 = this;
            com.google.android.gms.common.api.internal.zap r0 = r8.zaa
            boolean r0 = r0.zaa
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.gms.common.api.internal.zam r0 = r8.zab
            com.google.android.gms.common.ConnectionResult r0 = r0.zab()
            boolean r1 = r0.hasResolution()
            if (r1 == 0) goto L35
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = r1.mLifecycleFragment
            android.app.Activity r1 = r1.getActivity()
            android.app.PendingIntent r0 = r0.getResolution()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            com.google.android.gms.common.api.internal.zam r3 = r8.zab
            int r3 = r3.zaa()
            r4 = 0
            android.content.Intent r0 = com.google.android.gms.common.api.GoogleApiActivity.zaa(r1, r0, r3, r4)
            r1 = 1
            r2.startActivityForResult(r0, r1)
            return
        L35:
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            com.google.android.gms.common.GoogleApiAvailability r2 = r1.zac
            android.app.Activity r1 = r1.getActivity()
            int r3 = r0.getErrorCode()
            r4 = 0
            android.content.Intent r1 = r2.getErrorResolutionIntent(r1, r3, r4)
            if (r1 == 0) goto L5f
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            com.google.android.gms.common.GoogleApiAvailability r2 = r1.zac
            android.app.Activity r3 = r1.getActivity()
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            com.google.android.gms.common.api.internal.LifecycleFragment r4 = r1.mLifecycleFragment
            int r5 = r0.getErrorCode()
            r6 = 2
            com.google.android.gms.common.api.internal.zap r7 = r8.zaa
            r2.zag(r3, r4, r5, r6, r7)
            return
        L5f:
            int r1 = r0.getErrorCode()
            r2 = 18
            if (r1 != r2) goto L8a
            com.google.android.gms.common.api.internal.zap r0 = r8.zaa
            com.google.android.gms.common.GoogleApiAvailability r1 = r0.zac
            android.app.Activity r0 = r0.getActivity()
            com.google.android.gms.common.api.internal.zap r2 = r8.zaa
            android.app.Dialog r0 = r1.zab(r0, r2)
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            com.google.android.gms.common.GoogleApiAvailability r2 = r1.zac
            android.app.Activity r1 = r1.getActivity()
            android.content.Context r1 = r1.getApplicationContext()
            com.google.android.gms.common.api.internal.zan r3 = new com.google.android.gms.common.api.internal.zan
            r3.<init>(r8, r0)
            r2.zac(r1, r3)
            return
        L8a:
            com.google.android.gms.common.api.internal.zap r1 = r8.zaa
            com.google.android.gms.common.api.internal.zam r2 = r8.zab
            int r2 = r2.zaa()
            com.google.android.gms.common.api.internal.zap.zaf(r1, r0, r2)
            return
    }
}
