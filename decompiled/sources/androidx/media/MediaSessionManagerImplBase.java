package androidx.media;

/* JADX INFO: loaded from: classes3.dex */
class MediaSessionManagerImplBase implements androidx.media.MediaSessionManager.MediaSessionManagerImpl {
    private static final boolean DEBUG = false;
    private static final java.lang.String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final java.lang.String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final java.lang.String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    private static final java.lang.String TAG = "MediaSessionManager";
    public android.content.ContentResolver mContentResolver;
    public android.content.Context mContext;

    /* JADX INFO: loaded from: classes2.dex */
    public static class RemoteUserInfoImplBase implements androidx.media.MediaSessionManager.RemoteUserInfoImpl {
        private java.lang.String mPackageName;
        private int mPid;
        private int mUid;

        public RemoteUserInfoImplBase(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.mPackageName = r1
                r0.mPid = r2
                r0.mUid = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r5 = (androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase) r5
                int r1 = r4.mPid
                if (r1 < 0) goto L2e
                int r1 = r5.mPid
                if (r1 >= 0) goto L15
                goto L2e
            L15:
                java.lang.String r1 = r4.mPackageName
                java.lang.String r3 = r5.mPackageName
                boolean r1 = android.text.TextUtils.equals(r1, r3)
                if (r1 == 0) goto L2c
                int r1 = r4.mPid
                int r3 = r5.mPid
                if (r1 != r3) goto L2c
                int r1 = r4.mUid
                int r5 = r5.mUid
                if (r1 != r5) goto L2c
                goto L2d
            L2c:
                r0 = 0
            L2d:
                return r0
            L2e:
                java.lang.String r1 = r4.mPackageName
                java.lang.String r3 = r5.mPackageName
                boolean r1 = android.text.TextUtils.equals(r1, r3)
                if (r1 == 0) goto L3f
                int r1 = r4.mUid
                int r5 = r5.mUid
                if (r1 != r5) goto L3f
                goto L40
            L3f:
                r0 = 0
            L40:
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public java.lang.String getPackageName() {
                r1 = this;
                java.lang.String r0 = r1.mPackageName
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
                r1 = this;
                int r0 = r1.mPid
                return r0
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
                r1 = this;
                int r0 = r1.mUid
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r3.mPackageName
                r2 = 0
                r0[r2] = r1
                int r1 = r3.mUid
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    static {
            boolean r0 = androidx.media.MediaSessionManager.DEBUG
            androidx.media.MediaSessionManagerImplBase.DEBUG = r0
            return
    }

    public MediaSessionManagerImplBase(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            android.content.ContentResolver r1 = r1.getContentResolver()
            r0.mContentResolver = r1
            return
    }

    private boolean isPermissionGranted(androidx.media.MediaSessionManager.RemoteUserInfoImpl r5, java.lang.String r6) {
            r4 = this;
            int r0 = r5.getPid()
            r1 = 1
            r2 = 0
            if (r0 >= 0) goto L1b
            android.content.Context r0 = r4.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            int r5 = r0.checkPermission(r6, r5)
            if (r5 != 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
        L1b:
            android.content.Context r0 = r4.mContext
            int r3 = r5.getPid()
            int r5 = r5.getUid()
            int r5 = r0.checkPermission(r6, r3, r5)
            if (r5 != 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfoImpl r6) {
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            java.lang.String r2 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.String r1 = "android.permission.STATUS_BAR_SERVICE"
            boolean r1 = r5.isPermissionGranted(r6, r1)
            if (r1 != 0) goto L5c
            java.lang.String r1 = "android.permission.MEDIA_CONTENT_CONTROL"
            boolean r1 = r5.isPermissionGranted(r6, r1)
            if (r1 != 0) goto L5c
            int r1 = r6.getUid()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r2) goto L5c
            android.content.ContentResolver r1 = r5.mContentResolver
            java.lang.String r2 = "enabled_notification_listeners"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r2)
            if (r1 == 0) goto L59
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2)
            r2 = 0
        L3b:
            int r3 = r1.length
            if (r2 >= r3) goto L59
            r3 = r1[r2]
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)
            if (r3 == 0) goto L56
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = r6.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L56
            r6 = 1
            goto L5a
        L56:
            int r2 = r2 + 1
            goto L3b
        L59:
            r6 = 0
        L5a:
            if (r6 == 0) goto L5d
        L5c:
            r0 = 1
        L5d:
            return r0
        L5e:
            boolean r1 = androidx.media.MediaSessionManagerImplBase.DEBUG
            if (r1 == 0) goto L7e
            java.lang.String r1 = "Package "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r6 = r6.getPackageName()
            r1.append(r6)
            java.lang.String r6 = " doesn't exist"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "MediaSessionManager"
            android.util.Log.d(r1, r6)
        L7e:
            return r0
    }
}
