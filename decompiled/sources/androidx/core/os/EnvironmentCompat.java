package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class EnvironmentCompat {
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";
    private static final java.lang.String TAG = "EnvironmentCompat";

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getStorageState(java.io.File r0) {
                java.lang.String r0 = android.os.Environment.getStorageState(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getExternalStorageState(java.io.File r0) {
                java.lang.String r0 = android.os.Environment.getExternalStorageState(r0)
                return r0
        }
    }

    private EnvironmentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String getStorageState(@androidx.annotation.NonNull java.io.File r0) {
            java.lang.String r0 = androidx.core.os.EnvironmentCompat.Api21Impl.getExternalStorageState(r0)
            return r0
    }
}
