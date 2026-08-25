package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class PermissionHelper {
    private PermissionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void requestPermissions(android.app.Fragment r2, java.lang.String[] r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            r2.requestPermissions(r3, r4)
        L9:
            return
    }
}
