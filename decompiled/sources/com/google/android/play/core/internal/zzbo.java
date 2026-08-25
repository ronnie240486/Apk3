package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzbo implements com.google.android.play.core.internal.zzbd {
    public zzbo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.internal.zzbd
    public final boolean zza(java.lang.Object r4, java.io.File r5, java.io.File r6) {
            r3 = this;
            r4 = 0
            java.lang.String r6 = "dalvik.system.DexFile"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.String r0 = "isDexOptNeeded"
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Object r5 = com.google.android.play.core.internal.zzbw.zzf(r6, r0, r1, r2, r5)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.ClassNotFoundException -> L1f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.ClassNotFoundException -> L1f
            if (r5 != 0) goto L1e
            r4 = 1
        L1e:
            return r4
        L1f:
            java.lang.String r5 = "SplitCompat"
            java.lang.String r6 = "Unexpected missing dalvik.system.DexFile."
            android.util.Log.e(r5, r6)
            return r4
    }
}
