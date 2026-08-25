package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface PermissionResult {
    }

    private PermissionChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkCallingOrSelfPermission(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lf
            java.lang.String r0 = r3.getPackageName()
            goto L10
        Lf:
            r0 = 0
        L10:
            int r1 = android.os.Binder.getCallingPid()
            int r2 = android.os.Binder.getCallingUid()
            int r3 = checkPermission(r3, r4, r1, r2, r0)
            return r3
    }

    public static int checkCallingPermission(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lc
            r2 = -1
            return r2
        Lc:
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Binder.getCallingUid()
            int r2 = checkPermission(r2, r3, r0, r1, r4)
            return r2
    }

    public static int checkPermission(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3, int r4, int r5, @androidx.annotation.Nullable java.lang.String r6) {
            int r4 = r2.checkPermission(r3, r4, r5)
            r0 = -1
            if (r4 != r0) goto L8
            return r0
        L8:
            java.lang.String r3 = androidx.core.app.AppOpsManagerCompat.permissionToOp(r3)
            r4 = 0
            if (r3 != 0) goto L10
            return r4
        L10:
            if (r6 != 0) goto L24
            android.content.pm.PackageManager r6 = r2.getPackageManager()
            java.lang.String[] r6 = r6.getPackagesForUid(r5)
            if (r6 == 0) goto L23
            int r1 = r6.length
            if (r1 > 0) goto L20
            goto L23
        L20:
            r6 = r6[r4]
            goto L24
        L23:
            return r0
        L24:
            int r0 = android.os.Process.myUid()
            java.lang.String r1 = r2.getPackageName()
            if (r0 != r5) goto L36
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r1, r6)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 == 0) goto L3e
            int r2 = androidx.core.app.AppOpsManagerCompat.checkOrNoteProxyOp(r2, r5, r3, r6)
            goto L42
        L3e:
            int r2 = androidx.core.app.AppOpsManagerCompat.noteProxyOpNoThrow(r2, r3, r6)
        L42:
            if (r2 != 0) goto L45
            goto L46
        L45:
            r4 = -2
        L46:
            return r4
    }

    public static int checkSelfPermission(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r3 = checkPermission(r3, r4, r0, r1, r2)
            return r3
    }
}
