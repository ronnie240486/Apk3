package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbc {
    private static final com.google.android.play.core.internal.zzag zzb = null;
    private static final android.content.Intent zzc = null;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public com.google.android.play.core.internal.zzas zza;
    private final java.lang.String zzd;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "SplitInstallService"
            r0.<init>(r1)
            com.google.android.play.core.splitinstall.zzbc.zzb = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            com.google.android.play.core.splitinstall.zzbc.zzc = r0
            return
    }

    public zzbc(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            r7.<init>()
            r7.zzd = r9
            boolean r9 = com.google.android.play.core.internal.zzch.zzb(r8)
            if (r9 == 0) goto L20
            com.google.android.play.core.internal.zzas r9 = new com.google.android.play.core.internal.zzas
            android.content.Context r1 = com.google.android.play.core.internal.zzce.zza(r8)
            com.google.android.play.core.internal.zzag r2 = com.google.android.play.core.splitinstall.zzbc.zzb
            android.content.Intent r4 = com.google.android.play.core.splitinstall.zzbc.zzc
            com.google.android.play.core.splitinstall.zzak r5 = com.google.android.play.core.splitinstall.zzak.zza
            r6 = 0
            java.lang.String r3 = "SplitInstallService"
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zza = r9
        L20:
            return
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zza() {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "playcore_version_code"
            r2 = 11003(0x2afb, float:1.5418E-41)
            r0.putInt(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.internal.zzag zzb() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String zzk(com.google.android.play.core.splitinstall.zzbc r0) {
            java.lang.String r0 = r0.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zzl(java.util.Collection r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "language"
            r2.putString(r3, r1)
            r0.add(r2)
            goto Ld
        L27:
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zzm(java.util.Collection r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "module_name"
            r2.putString(r3, r1)
            r0.add(r2)
            goto Ld
        L27:
            return r0
    }

    private static com.google.android.play.core.tasks.Task zzn() {
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = -14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "onError(%d)"
            r0.zzb(r3, r1)
            com.google.android.play.core.splitinstall.SplitInstallException r0 = new com.google.android.play.core.splitinstall.SplitInstallException
            r0.<init>(r2)
            com.google.android.play.core.tasks.Task r0 = com.google.android.play.core.tasks.Tasks.zza(r0)
            return r0
    }

    public final com.google.android.play.core.tasks.Task zzc(int r5) {
            r4 = this;
            com.google.android.play.core.internal.zzas r0 = r4.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r5 = zzn()
            return r5
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1[r2] = r3
            java.lang.String r2 = "cancelInstall(%d)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r4.zza
            com.google.android.play.core.splitinstall.zzas r2 = new com.google.android.play.core.splitinstall.zzas
            r2.<init>(r4, r0, r5, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r5 = r0.zza()
            return r5
    }

    public final com.google.android.play.core.tasks.Task zzd(java.util.List r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzn()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "deferredInstall(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.splitinstall.zzan r2 = new com.google.android.play.core.splitinstall.zzan
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    public final com.google.android.play.core.tasks.Task zze(java.util.List r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzn()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "deferredLanguageInstall(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.splitinstall.zzao r2 = new com.google.android.play.core.splitinstall.zzao
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    public final com.google.android.play.core.tasks.Task zzf(java.util.List r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzn()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "deferredLanguageUninstall(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.splitinstall.zzap r2 = new com.google.android.play.core.splitinstall.zzap
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    public final com.google.android.play.core.tasks.Task zzg(java.util.List r4) {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r4 = zzn()
            return r4
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "deferredUninstall(%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.splitinstall.zzam r2 = new com.google.android.play.core.splitinstall.zzam
            r2.<init>(r3, r0, r4, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r4 = r0.zza()
            return r4
    }

    public final com.google.android.play.core.tasks.Task zzh(int r5) {
            r4 = this;
            com.google.android.play.core.internal.zzas r0 = r4.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r5 = zzn()
            return r5
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1[r2] = r3
            java.lang.String r2 = "getSessionState(%d)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r4.zza
            com.google.android.play.core.splitinstall.zzaq r2 = new com.google.android.play.core.splitinstall.zzaq
            r2.<init>(r4, r0, r5, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r5 = r0.zza()
            return r5
    }

    public final com.google.android.play.core.tasks.Task zzi() {
            r3 = this;
            com.google.android.play.core.internal.zzas r0 = r3.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r0 = zzn()
            return r0
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "getSessionStates"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r3.zza
            com.google.android.play.core.splitinstall.zzar r2 = new com.google.android.play.core.splitinstall.zzar
            r2.<init>(r3, r0, r0)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r0 = r0.zza()
            return r0
    }

    public final com.google.android.play.core.tasks.Task zzj(java.util.Collection r10, java.util.Collection r11) {
            r9 = this;
            com.google.android.play.core.internal.zzas r0 = r9.zza
            if (r0 != 0) goto L9
            com.google.android.play.core.tasks.Task r10 = zzn()
            return r10
        L9:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.zzbc.zzb
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            java.lang.String r2 = "startInstall(%s,%s)"
            com.google.android.play.core.tasks.zzi r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2, r1)
            com.google.android.play.core.internal.zzas r1 = r9.zza
            com.google.android.play.core.splitinstall.zzal r2 = new com.google.android.play.core.splitinstall.zzal
            r3 = r2
            r4 = r9
            r5 = r0
            r6 = r10
            r7 = r11
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r1.zzq(r2, r0)
            com.google.android.play.core.tasks.Task r10 = r0.zza()
            return r10
    }
}
