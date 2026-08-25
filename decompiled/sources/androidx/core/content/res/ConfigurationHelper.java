package androidx.core.content.res;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDensityDpi(@androidx.annotation.NonNull android.content.res.Resources r0) {
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.densityDpi
            return r0
    }
}
