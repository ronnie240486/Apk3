package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcd {
    public static void zza(android.content.pm.PackageManager r10, android.content.ComponentName r11, int r12) {
            int r12 = r10.getComponentEnabledSetting(r11)
            r0 = 1
            if (r12 == r0) goto L53
            r1 = 2
            if (r12 == r1) goto L50
            java.lang.String r12 = r11.getPackageName()
            java.lang.String r2 = r11.getClassName()
            r3 = 516(0x204, float:7.23E-43)
            android.content.pm.PackageInfo r12 = r10.getPackageInfo(r12, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r3 = 3
            android.content.pm.ComponentInfo[][] r4 = new android.content.pm.ComponentInfo[r3][]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ActivityInfo[] r5 = r12.activities     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r6 = 0
            r4[r6] = r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ServiceInfo[] r5 = r12.services     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r4[r0] = r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ProviderInfo[] r12 = r12.providers     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r4[r1] = r12     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r12 = 0
        L29:
            if (r12 >= r3) goto L45
            r1 = r4[r12]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r1 != 0) goto L30
            goto L42
        L30:
            int r5 = r1.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r7 = 0
        L32:
            if (r7 >= r5) goto L42
            r8 = r1[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r9 = r8.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            boolean r9 = r9.equals(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r9 == 0) goto L3f
            goto L46
        L3f:
            int r7 = r7 + 1
            goto L32
        L42:
            int r12 = r12 + 1
            goto L29
        L45:
            r8 = 0
        L46:
            if (r8 != 0) goto L49
            goto L50
        L49:
            boolean r12 = r8.isEnabled()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r12 == 0) goto L50
            goto L53
        L50:
            r10.setComponentEnabledSetting(r11, r0, r0)
        L53:
            return
    }
}
