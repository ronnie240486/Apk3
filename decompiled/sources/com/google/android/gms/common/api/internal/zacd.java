package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zacd<T> implements com.google.android.gms.tasks.OnCompleteListener<T> {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey<?> zac;
    private final long zad;
    private final long zae;

    @com.google.android.gms.common.util.VisibleForTesting
    public zacd(com.google.android.gms.common.api.internal.GoogleApiManager r1, int r2, com.google.android.gms.common.api.internal.ApiKey r3, long r4, long r6) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.zae = r6
            return
    }

    @androidx.annotation.Nullable
    public static <T> com.google.android.gms.common.api.internal.zacd<T> zaa(com.google.android.gms.common.api.internal.GoogleApiManager r10, int r11, com.google.android.gms.common.api.internal.ApiKey<?> r12) {
            boolean r0 = r10.zaF()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L4d
            boolean r2 = r0.getMethodInvocationTelemetryEnabled()
            if (r2 != 0) goto L19
            return r1
        L19:
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            com.google.android.gms.common.api.internal.zabq r2 = r10.zak(r12)
            if (r2 == 0) goto L4e
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            boolean r3 = r3 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r3 != 0) goto L2c
            return r1
        L2c:
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r3 = (com.google.android.gms.common.internal.BaseGmsClient) r3
            boolean r4 = r3.hasConnectionInfo()
            if (r4 == 0) goto L4e
            boolean r4 = r3.isConnecting()
            if (r4 != 0) goto L4e
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = zab(r2, r3, r11)
            if (r0 != 0) goto L45
            return r1
        L45:
            r2.zaq()
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            goto L4e
        L4d:
            r0 = 1
        L4e:
            com.google.android.gms.common.api.internal.zacd r9 = new com.google.android.gms.common.api.internal.zacd
            r1 = 0
            if (r0 == 0) goto L5a
            long r3 = java.lang.System.currentTimeMillis()
            r5 = r3
            goto L5b
        L5a:
            r5 = r1
        L5b:
            if (r0 == 0) goto L63
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7 = r0
            goto L64
        L63:
            r7 = r1
        L64:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r7)
            return r9
    }

    @androidx.annotation.Nullable
    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq<?> r2, com.google.android.gms.common.internal.BaseGmsClient<?> r3, int r4) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r3 = r3.getTelemetryConfiguration()
            r0 = 0
            if (r3 == 0) goto L33
            boolean r1 = r3.getMethodInvocationTelemetryEnabled()
            if (r1 == 0) goto L33
            int[] r1 = r3.getMethodInvocationMethodKeyAllowlist()
            if (r1 != 0) goto L21
            int[] r1 = r3.getMethodInvocationMethodKeyDisallowlist()
            if (r1 != 0) goto L1a
            goto L28
        L1a:
            boolean r4 = com.google.android.gms.common.util.ArrayUtils.contains(r1, r4)
            if (r4 == 0) goto L28
            goto L33
        L21:
            boolean r4 = com.google.android.gms.common.util.ArrayUtils.contains(r1, r4)
            if (r4 != 0) goto L28
            goto L33
        L28:
            int r2 = r2.zac()
            int r4 = r3.getMaxMethodInvocationsLogged()
            if (r2 >= r4) goto L33
            return r3
        L33:
            return r0
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @androidx.annotation.WorkerThread
    public final void onComplete(@androidx.annotation.NonNull com.google.android.gms.tasks.Task<T> r23) {
            r22 = this;
            r0 = r22
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r0.zaa
            boolean r1 = r1.zaF()
            if (r1 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r1.getConfig()
            if (r1 == 0) goto L1d
            boolean r2 = r1.getMethodInvocationTelemetryEnabled()
            if (r2 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r0.zaa
            com.google.android.gms.common.api.internal.ApiKey<?> r3 = r0.zac
            com.google.android.gms.common.api.internal.zabq r2 = r2.zak(r3)
            if (r2 == 0) goto Lfb
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            boolean r3 = r3 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r3 != 0) goto L31
            goto Lfb
        L31:
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r3 = (com.google.android.gms.common.internal.BaseGmsClient) r3
            long r4 = r0.zad
            r6 = 1
            r7 = 0
            r9 = 0
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 <= 0) goto L43
            r4 = 1
            goto L44
        L43:
            r4 = 0
        L44:
            int r20 = r3.getGCoreServiceId()
            r5 = 100
            if (r1 == 0) goto L88
            boolean r10 = r1.getMethodTimingTelemetryEnabled()
            r4 = r4 & r10
            int r10 = r1.getBatchPeriodMillis()
            int r11 = r1.getMaxMethodInvocationsInBatch()
            int r1 = r1.getVersion()
            boolean r12 = r3.hasConnectionInfo()
            if (r12 == 0) goto L85
            boolean r12 = r3.isConnecting()
            if (r12 != 0) goto L85
            int r4 = r0.zab
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = zab(r2, r3, r4)
            if (r2 != 0) goto L72
            return
        L72:
            boolean r3 = r2.getMethodTimingTelemetryEnabled()
            if (r3 == 0) goto L7f
            long r3 = r0.zad
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 <= 0) goto L7f
            goto L80
        L7f:
            r6 = 0
        L80:
            int r11 = r2.getMaxMethodInvocationsLogged()
            r4 = r6
        L85:
            r2 = r10
            r3 = r11
            goto L8f
        L88:
            r10 = 5000(0x1388, float:7.006E-42)
            r1 = 0
            r2 = 5000(0x1388, float:7.006E-42)
            r3 = 100
        L8f:
            com.google.android.gms.common.api.internal.GoogleApiManager r6 = r0.zaa
            boolean r10 = r23.isSuccessful()
            r11 = -1
            if (r10 == 0) goto L9b
            r12 = 0
            r13 = 0
            goto Lcb
        L9b:
            boolean r9 = r23.isCanceled()
            if (r9 == 0) goto La5
            r12 = 100
        La3:
            r13 = -1
            goto Lcb
        La5:
            java.lang.Exception r5 = r23.getException()
            boolean r9 = r5 instanceof com.google.android.gms.common.api.ApiException
            if (r9 == 0) goto Lc6
            com.google.android.gms.common.api.ApiException r5 = (com.google.android.gms.common.api.ApiException) r5
            com.google.android.gms.common.api.Status r5 = r5.getStatus()
            int r9 = r5.getStatusCode()
            com.google.android.gms.common.ConnectionResult r5 = r5.getConnectionResult()
            if (r5 != 0) goto Lbf
            r5 = -1
            goto Lc3
        Lbf:
            int r5 = r5.getErrorCode()
        Lc3:
            r13 = r5
            r12 = r9
            goto Lcb
        Lc6:
            r9 = 101(0x65, float:1.42E-43)
            r12 = 101(0x65, float:1.42E-43)
            goto La3
        Lcb:
            if (r4 == 0) goto Le1
            long r7 = r0.zad
            long r4 = java.lang.System.currentTimeMillis()
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r14 = r0.zae
            long r9 = r9 - r14
            int r10 = (int) r9
            r16 = r4
            r14 = r7
            r21 = r10
            goto Le6
        Le1:
            r14 = r7
            r16 = r14
            r21 = -1
        Le6:
            com.google.android.gms.common.internal.MethodInvocation r4 = new com.google.android.gms.common.internal.MethodInvocation
            int r11 = r0.zab
            r18 = 0
            r19 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r16, r18, r19, r20, r21)
            long r14 = (long) r2
            r11 = r6
            r12 = r4
            r13 = r1
            r16 = r3
            r11.zay(r12, r13, r14, r16)
        Lfb:
            return
    }
}
