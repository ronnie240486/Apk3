package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbe {
    private final android.content.Context zza;

    public zzbe(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private final android.content.SharedPreferences zze() {
            r3 = this;
            android.content.Context r0 = r3.zza
            java.lang.String r1 = "playcore_split_install_internal"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            return r0
    }

    public final java.util.Set zza() {
            r4 = this;
            java.lang.Class<com.google.android.play.core.splitinstall.zzbe> r0 = com.google.android.play.core.splitinstall.zzbe.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.zze()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            java.lang.String r3 = "modules_to_uninstall_if_emulated"
            java.util.Set r1 = r1.getStringSet(r3, r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r1 != 0) goto L21
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            goto L21
        L1a:
            r1 = move-exception
            goto L23
        L1c:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    public final void zzb() {
            r4 = this;
            java.lang.Class<com.google.android.play.core.splitinstall.zzbe> r0 = com.google.android.play.core.splitinstall.zzbe.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.zze()     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L1b
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "modules_to_uninstall_if_emulated"
            android.content.SharedPreferences$Editor r1 = r1.putStringSet(r3, r2)     // Catch: java.lang.Throwable -> L1b
            r1.apply()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    public final void zzc(java.util.Collection r5) {
            r4 = this;
            java.lang.Class<com.google.android.play.core.splitinstall.zzbe> r0 = com.google.android.play.core.splitinstall.zzbe.class
            monitor-enter(r0)
            java.util.Set r1 = r4.zza()     // Catch: java.lang.Throwable -> L38
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L38
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L38
            r1 = 0
        L11:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L23
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L38
            boolean r3 = r2.add(r3)     // Catch: java.lang.Throwable -> L38
            r1 = r1 | r3
            goto L11
        L23:
            if (r1 == 0) goto L36
            android.content.SharedPreferences r5 = r4.zze()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L38
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L38
            java.lang.String r1 = "modules_to_uninstall_if_emulated"
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r1, r2)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L38
            r5.apply()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L38
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r5
    }

    public final void zzd(java.util.Collection r7) {
            r6 = this;
            java.lang.Class<com.google.android.play.core.splitinstall.zzbe> r0 = com.google.android.play.core.splitinstall.zzbe.class
            monitor-enter(r0)
            java.util.Set r1 = r6.zza()     // Catch: java.lang.Throwable -> L3e
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
            r3 = 0
        L11:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L29
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3e
            boolean r5 = r7.contains(r4)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L25
            r3 = 1
            goto L11
        L25:
            r2.add(r4)     // Catch: java.lang.Throwable -> L3e
            goto L11
        L29:
            if (r3 == 0) goto L3c
            android.content.SharedPreferences r7 = r6.zze()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L3e
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L3e
            java.lang.String r1 = "modules_to_uninstall_if_emulated"
            android.content.SharedPreferences$Editor r7 = r7.putStringSet(r1, r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L3e
            r7.apply()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L3e
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r7
    }
}
