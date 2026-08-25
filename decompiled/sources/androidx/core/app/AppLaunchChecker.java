package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public class AppLaunchChecker {
    private static final java.lang.String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
    private static final java.lang.String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";

    @java.lang.Deprecated
    public AppLaunchChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasStartedFromLauncher(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.String r0 = "android.support.AppLaunchChecker"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r0 = "startedFromLauncher"
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static void onActivityCreate(@androidx.annotation.NonNull android.app.Activity r4) {
            java.lang.String r0 = "android.support.AppLaunchChecker"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            java.lang.String r2 = "startedFromLauncher"
            boolean r1 = r0.getBoolean(r2, r1)
            if (r1 == 0) goto L11
            return
        L11:
            android.content.Intent r4 = r4.getIntent()
            if (r4 != 0) goto L18
            return
        L18:
            java.lang.String r1 = r4.getAction()
            java.lang.String r3 = "android.intent.action.MAIN"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L40
            java.lang.String r1 = "android.intent.category.LAUNCHER"
            boolean r1 = r4.hasCategory(r1)
            if (r1 != 0) goto L34
            java.lang.String r1 = "android.intent.category.LEANBACK_LAUNCHER"
            boolean r4 = r4.hasCategory(r1)
            if (r4 == 0) goto L40
        L34:
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r0 = 1
            android.content.SharedPreferences$Editor r4 = r4.putBoolean(r2, r0)
            r4.apply()
        L40:
            return
    }
}
