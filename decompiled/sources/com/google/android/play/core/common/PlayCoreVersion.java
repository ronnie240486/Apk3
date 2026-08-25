package com.google.android.play.core.common;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes3.dex */
public class PlayCoreVersion {
    private static final java.util.Set zza = null;
    private static final java.util.Set zzb = null;
    private static final java.util.Map zzc = null;
    private static final com.google.android.play.core.internal.zzag zzd = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "app_update"
            java.lang.String r2 = "review"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.play.core.common.PlayCoreVersion.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "native"
            java.lang.String r2 = "unity"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.play.core.common.PlayCoreVersion.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.common.PlayCoreVersion.zzc = r0
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "PlayCoreVersion"
            r0.<init>(r1)
            com.google.android.play.core.common.PlayCoreVersion.zzd = r0
            return
    }

    private PlayCoreVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void addVersion(java.lang.String r4, java.lang.String r5, int r6) {
            java.lang.Class<com.google.android.play.core.common.PlayCoreVersion> r0 = com.google.android.play.core.common.PlayCoreVersion.class
            monitor-enter(r0)
            java.util.Set r1 = com.google.android.play.core.common.PlayCoreVersion.zza     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            com.google.android.play.core.internal.zzag r5 = com.google.android.play.core.common.PlayCoreVersion.zzd     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            r6[r2] = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "Illegal module name: %s"
            r5.zze(r4, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L1a:
            java.util.Set r1 = com.google.android.play.core.common.PlayCoreVersion.zzb     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L2f
            com.google.android.play.core.internal.zzag r4 = com.google.android.play.core.common.PlayCoreVersion.zzd     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            r6[r2] = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "Illegal platform name: %s"
            r4.zze(r5, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L2f:
            java.util.Map r4 = zzb(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3c
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L3c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public static android.os.Bundle zza(java.lang.String r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Map r3 = zzb(r3)
            java.lang.String r1 = "java"
            java.lang.Object r1 = r3.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "playcore_version_code"
            r0.putInt(r2, r1)
            java.lang.String r1 = "native"
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L31
            java.lang.Object r1 = r3.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "playcore_native_version"
            r0.putInt(r2, r1)
        L31:
            java.lang.String r1 = "unity"
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L48
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r1 = "playcore_unity_version"
            r0.putInt(r1, r3)
        L48:
            return r0
    }

    public static synchronized java.util.Map zzb(java.lang.String r5) {
            java.lang.Class<com.google.android.play.core.common.PlayCoreVersion> r0 = com.google.android.play.core.common.PlayCoreVersion.class
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.play.core.common.PlayCoreVersion.zzc     // Catch: java.lang.Throwable -> L26
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L1e
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "java"
            r4 = 11003(0x2afb, float:1.5418E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L26
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L26
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L26
        L1e:
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L26
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return r5
        L26:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }
}
