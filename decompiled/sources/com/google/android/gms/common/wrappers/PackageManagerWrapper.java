package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class PackageManagerWrapper {

    @androidx.annotation.NonNull
    public final android.content.Context zza;

    public PackageManagerWrapper(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int checkCallingOrSelfPermission(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.zza
            int r2 = r0.checkCallingOrSelfPermission(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int checkPermission(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r2 = r0.checkPermission(r2, r3)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.pm.ApplicationInfo getApplicationInfo(@androidx.annotation.NonNull java.lang.String r2, int r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r3)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.CharSequence getApplicationLabel(@androidx.annotation.NonNull java.lang.String r4) throws android.content.pm.PackageManager.NameNotFoundException {
            r3 = this;
            android.content.Context r0 = r3.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r1 = r3.zza
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r2)
            java.lang.CharSequence r4 = r0.getApplicationLabel(r4)
            return r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public androidx.core.util.Pair<java.lang.CharSequence, android.graphics.drawable.Drawable> getApplicationLabelAndIcon(@androidx.annotation.NonNull java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r2 = this;
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.CharSequence r0 = r0.getApplicationLabel(r3)
            android.content.Context r1 = r2.zza
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.graphics.drawable.Drawable r3 = r1.getApplicationIcon(r3)
            androidx.core.util.Pair r3 = androidx.core.util.Pair.create(r0, r3)
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.pm.PackageInfo getPackageInfo(@androidx.annotation.NonNull java.lang.String r2, int r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r3)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isCallerInstantApp() {
            r2 = this;
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            if (r0 != r1) goto L11
            android.content.Context r0 = r2.zza
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            return r0
        L11:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L32
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Binder.getCallingUid()
            java.lang.String r0 = r0.getNameForUid(r1)
            if (r0 == 0) goto L32
            android.content.Context r1 = r2.zza
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            boolean r0 = r1.isInstantApp(r0)
            return r0
        L32:
            r0 = 0
            return r0
    }

    @android.annotation.TargetApi(19)
    public final boolean zza(int r5, @androidx.annotation.NonNull java.lang.String r6) {
            r4 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            android.content.Context r0 = r4.zza     // Catch: java.lang.SecurityException -> L20
            java.lang.String r3 = "appops"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch: java.lang.SecurityException -> L20
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch: java.lang.SecurityException -> L20
            if (r0 == 0) goto L18
            r0.checkPackage(r5, r6)     // Catch: java.lang.SecurityException -> L20
            return r1
        L18:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.SecurityException -> L20
            java.lang.String r6 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r5.<init>(r6)     // Catch: java.lang.SecurityException -> L20
            throw r5     // Catch: java.lang.SecurityException -> L20
        L20:
            return r2
        L21:
            android.content.Context r0 = r4.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r5 = r0.getPackagesForUid(r5)
            if (r6 == 0) goto L3f
            if (r5 == 0) goto L3f
            r0 = 0
        L30:
            int r3 = r5.length
            if (r0 >= r3) goto L3f
            r3 = r5[r0]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L3c
            return r1
        L3c:
            int r0 = r0 + 1
            goto L30
        L3f:
            return r2
    }
}
