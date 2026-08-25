package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class IntentCompat {

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.content.Intent makeMainSelectorActivity(java.lang.String r0, java.lang.String r1) {
                android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r0, r1)
                return r0
        }
    }

    private IntentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Intent createManageUnusedAppRestrictionsIntent(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.lang.String r6) {
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            boolean r0 = androidx.core.content.PackageManagerCompat.areUnusedAppRestrictionsAvailable(r0)
            if (r0 == 0) goto L4a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            java.lang.String r3 = "package"
            if (r0 < r1) goto L23
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r5.<init>(r0)
            android.net.Uri r6 = android.net.Uri.fromParts(r3, r6, r2)
            android.content.Intent r5 = r5.setData(r6)
            return r5
        L23:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r1.<init>(r4)
            android.net.Uri r6 = android.net.Uri.fromParts(r3, r6, r2)
            android.content.Intent r6 = r1.setData(r6)
            r1 = 30
            if (r0 < r1) goto L37
            return r6
        L37:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r5 = androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(r5)
            java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            android.content.Intent r5 = r6.setPackage(r5)
            return r5
        L4a:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Unused App Restriction features are not available on this device"
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.NonNull
    public static android.content.Intent makeMainSelectorActivity(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.content.Intent r0 = androidx.core.content.IntentCompat.Api15Impl.makeMainSelectorActivity(r0, r1)
            return r0
    }
}
