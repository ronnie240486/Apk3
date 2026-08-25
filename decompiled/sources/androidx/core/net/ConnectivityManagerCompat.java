package androidx.core.net;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectivityManagerCompat {
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
        @androidx.annotation.DoNotInline
        public static boolean isActiveNetworkMetered(android.net.ConnectivityManager r0) {
                boolean r0 = r0.isActiveNetworkMetered()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getRestrictBackgroundStatus(android.net.ConnectivityManager r0) {
                int r0 = r0.getRestrictBackgroundStatus()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface RestrictBackgroundStatus {
    }

    private ConnectivityManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @android.annotation.SuppressLint({"ReferencesDeprecated"})
    public static android.net.NetworkInfo getNetworkInfoFromBroadcast(@androidx.annotation.NonNull android.net.ConnectivityManager r1, @androidx.annotation.NonNull android.content.Intent r2) {
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r2 = r2.getParcelableExtra(r0)
            android.net.NetworkInfo r2 = (android.net.NetworkInfo) r2
            if (r2 == 0) goto L13
            int r2 = r2.getType()
            android.net.NetworkInfo r1 = r1.getNetworkInfo(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static int getRestrictBackgroundStatus(@androidx.annotation.NonNull android.net.ConnectivityManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            int r2 = androidx.core.net.ConnectivityManagerCompat.Api24Impl.getRestrictBackgroundStatus(r2)
            return r2
        Lb:
            r2 = 3
            return r2
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean isActiveNetworkMetered(@androidx.annotation.NonNull android.net.ConnectivityManager r0) {
            boolean r0 = androidx.core.net.ConnectivityManagerCompat.Api16Impl.isActiveNetworkMetered(r0)
            return r0
    }
}
