package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzch {
    private static final com.google.android.play.core.internal.zzag zza = null;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "PhoneskyVerificationUtils"
            r0.<init>(r1)
            com.google.android.play.core.internal.zzch.zza = r0
            return
    }

    public static boolean zza(android.content.Context r1) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String[] r1 = r1.getPackagesForUid(r0)
            if (r1 == 0) goto L1c
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r0 = "com.android.vending"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static boolean zzb(android.content.Context r6) {
            java.lang.String r0 = "com.android.vending"
            r1 = 0
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            boolean r2 = r2.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r2 == 0) goto L61
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r2 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r6 == 0) goto L58
            int r0 = r6.length
            if (r0 != 0) goto L21
            goto L58
        L21:
            r2 = 0
        L22:
            if (r2 >= r0) goto L61
            r3 = r6[r2]
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.android.play.core.internal.zzcg.zza(r3)
            java.lang.String r4 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L56
            java.lang.String r4 = android.os.Build.TAGS
            java.lang.String r5 = "dev-keys"
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L4b
            java.lang.String r4 = android.os.Build.TAGS
            java.lang.String r5 = "test-keys"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L53
        L4b:
            java.lang.String r4 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
        L53:
            int r2 = r2 + 1
            goto L22
        L56:
            r6 = 1
            return r6
        L58:
            com.google.android.play.core.internal.zzag r6 = com.google.android.play.core.internal.zzch.zza
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Phonesky package is not signed -- possibly self-built package. Could not verify."
            r6.zze(r2, r0)
        L61:
            return r1
    }
}
