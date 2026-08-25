package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int noteOp(android.app.AppOpsManager r0, java.lang.String r1, int r2, java.lang.String r3) {
                int r0 = r0.noteOp(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int noteOpNoThrow(android.app.AppOpsManager r0, java.lang.String r1, int r2, java.lang.String r3) {
                int r0 = r0.noteOpNoThrow(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static <T> T getSystemService(android.content.Context r0, java.lang.Class<T> r1) {
                java.lang.Object r0 = r0.getSystemService(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int noteProxyOp(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
                int r0 = r0.noteProxyOp(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int noteProxyOpNoThrow(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
                int r0 = r0.noteProxyOpNoThrow(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String permissionToOp(java.lang.String r0) {
                java.lang.String r0 = android.app.AppOpsManager.permissionToOp(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int checkOpNoThrow(@androidx.annotation.Nullable android.app.AppOpsManager r0, @androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.NonNull java.lang.String r3) {
                if (r0 != 0) goto L4
                r0 = 1
                return r0
            L4:
                int r0 = r0.checkOpNoThrow(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static java.lang.String getOpPackageName(@androidx.annotation.NonNull android.content.Context r0) {
                java.lang.String r0 = r0.getOpPackageName()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.app.AppOpsManager getSystemService(@androidx.annotation.NonNull android.content.Context r1) {
                java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
                return r1
        }
    }

    private AppOpsManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkOrNoteProxyOp(@androidx.annotation.NonNull android.content.Context r2, int r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.lang.String r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1e
            android.app.AppOpsManager r0 = androidx.core.app.AppOpsManagerCompat.Api29Impl.getSystemService(r2)
            int r1 = android.os.Binder.getCallingUid()
            int r5 = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(r0, r4, r1, r5)
            if (r5 == 0) goto L15
            return r5
        L15:
            java.lang.String r2 = androidx.core.app.AppOpsManagerCompat.Api29Impl.getOpPackageName(r2)
            int r2 = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(r0, r4, r3, r2)
            return r2
        L1e:
            int r2 = noteProxyOpNoThrow(r2, r4, r5)
            return r2
    }

    public static int noteOp(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = androidx.core.app.AppOpsManagerCompat.Api19Impl.noteOp(r1, r2, r3, r4)
            return r1
    }

    public static int noteOpNoThrow(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, int r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = androidx.core.app.AppOpsManagerCompat.Api19Impl.noteOpNoThrow(r1, r2, r3, r4)
            return r1
    }

    public static int noteProxyOp(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L13
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r2 = androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(r2, r0)
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2
            int r2 = androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOp(r2, r3, r4)
            return r2
        L13:
            r2 = 1
            return r2
    }

    public static int noteProxyOpNoThrow(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L13
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r2 = androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(r2, r0)
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2
            int r2 = androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOpNoThrow(r2, r3, r4)
            return r2
        L13:
            r2 = 1
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String permissionToOp(@androidx.annotation.NonNull java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.app.AppOpsManagerCompat.Api23Impl.permissionToOp(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
