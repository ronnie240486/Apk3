package androidx.core.os;

/* JADX INFO: loaded from: classes3.dex */
public class BuildCompat {

    @androidx.annotation.RequiresOptIn
    public @interface PrereleaseSdkCheck {
    }

    private BuildCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 24)
    @java.lang.Deprecated
    public static boolean isAtLeastN() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 25)
    @java.lang.Deprecated
    public static boolean isAtLeastNMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 26)
    @java.lang.Deprecated
    public static boolean isAtLeastO() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 27)
    @java.lang.Deprecated
    public static boolean isAtLeastOMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 28)
    @java.lang.Deprecated
    public static boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    public static boolean isAtLeastPreReleaseCodename(@androidx.annotation.NonNull java.lang.String r3) {
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r3 = r3.toUpperCase(r1)
            int r3 = r0.compareTo(r3)
            if (r3 < 0) goto L1d
            r2 = 1
        L1d:
            return r2
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 29)
    @java.lang.Deprecated
    public static boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 30)
    @java.lang.Deprecated
    public static boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 31, codename = "S")
    @android.annotation.SuppressLint({"RestrictedApi"})
    @java.lang.Deprecated
    public static boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L17
            r1 = 30
            if (r0 < r1) goto L15
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "S"
            boolean r0 = isAtLeastPreReleaseCodename(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @androidx.core.os.BuildCompat.PrereleaseSdkCheck
    @java.lang.Deprecated
    public static boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 >= r1) goto L17
            r1 = 31
            if (r0 < r1) goto L15
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "Sv2"
            boolean r0 = isAtLeastPreReleaseCodename(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @androidx.core.os.BuildCompat.PrereleaseSdkCheck
    public static boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L17
            r1 = 32
            if (r0 < r1) goto L15
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "Tiramisu"
            boolean r0 = isAtLeastPreReleaseCodename(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    @androidx.annotation.ChecksSdkIntAtLeast(codename = "UpsideDownCake")
    @androidx.core.os.BuildCompat.PrereleaseSdkCheck
    public static boolean isAtLeastU() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L12
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "UpsideDownCake"
            boolean r0 = isAtLeastPreReleaseCodename(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }
}
