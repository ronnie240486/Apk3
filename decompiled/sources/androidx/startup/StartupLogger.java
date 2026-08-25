package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class StartupLogger {
    private static final java.lang.String TAG = "StartupLogger";

    private StartupLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void e(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.e(r0, r1, r2)
            return
    }

    public static void i(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.i(r0, r1)
            return
    }

    public static void w(@androidx.annotation.NonNull java.lang.String r1) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.w(r0, r1)
            return
    }
}
