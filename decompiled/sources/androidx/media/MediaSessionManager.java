package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {
    public static final boolean DEBUG = false;
    private static final java.lang.Object sLock = null;
    private static volatile androidx.media.MediaSessionManager sSessionManager;
    public androidx.media.MediaSessionManagerImplApi21 mImpl;

    /* JADX INFO: loaded from: classes2.dex */
    public interface MediaSessionManagerImpl {
        android.content.Context getContext();

        boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl r1);
    }

    public static final class RemoteUserInfo {
        public static final java.lang.String LEGACY_CONTROLLER = "android.media.session.MediaController";

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int UNKNOWN_PID = -1;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int UNKNOWN_UID = -1;
        public androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase mImpl;

        @androidx.annotation.RequiresApi(28)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28.getPackageName(r3)
                java.lang.String r1 = "package shouldn't be null"
                java.util.Objects.requireNonNull(r0, r1)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1a
                androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 r0 = new androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28
                r0.<init>(r3)
                r2.mImpl = r0
                return
            L1a:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "packageName should be nonempty"
                r3.<init>(r0)
                throw r3
        }

        public RemoteUserInfo(@androidx.annotation.NonNull java.lang.String r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "package shouldn't be null"
                java.util.Objects.requireNonNull(r3, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L24
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L1c
                androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28 r0 = new androidx.media.MediaSessionManagerImplApi28$RemoteUserInfoImplApi28
                r0.<init>(r3, r4, r5)
                r2.mImpl = r0
                goto L23
            L1c:
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = new androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase
                r0.<init>(r3, r4, r5)
                r2.mImpl = r0
            L23:
                return
            L24:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "packageName should be nonempty"
                r3.<init>(r4)
                throw r3
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof androidx.media.MediaSessionManager.RemoteUserInfo
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = r1.mImpl
                androidx.media.MediaSessionManager$RemoteUserInfo r2 = (androidx.media.MediaSessionManager.RemoteUserInfo) r2
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r2 = r2.mImpl
                boolean r2 = r0.equals(r2)
                return r2
        }

        @androidx.annotation.NonNull
        public java.lang.String getPackageName() {
                r1 = this;
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = r1.mImpl
                java.lang.String r0 = r0.getPackageName()
                return r0
        }

        public int getPid() {
                r1 = this;
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = r1.mImpl
                int r0 = r0.getPid()
                return r0
        }

        public int getUid() {
                r1 = this;
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = r1.mImpl
                int r0 = r0.getUid()
                return r0
        }

        public int hashCode() {
                r1 = this;
                androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r0 = r1.mImpl
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface RemoteUserInfoImpl {
        java.lang.String getPackageName();

        int getPid();

        int getUid();
    }

    static {
            java.lang.String r0 = "MediaSessionManager"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.media.MediaSessionManager.DEBUG = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.media.MediaSessionManager.sLock = r0
            return
    }

    private MediaSessionManager(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            androidx.media.MediaSessionManagerImplApi28 r0 = new androidx.media.MediaSessionManagerImplApi28
            r0.<init>(r3)
            r2.mImpl = r0
            goto L18
        L11:
            androidx.media.MediaSessionManagerImplApi21 r0 = new androidx.media.MediaSessionManagerImplApi21
            r0.<init>(r3)
            r2.mImpl = r0
        L18:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.media.MediaSessionManager getSessionManager(@androidx.annotation.NonNull android.content.Context r2) {
            if (r2 == 0) goto L1b
            java.lang.Object r0 = androidx.media.MediaSessionManager.sLock
            monitor-enter(r0)
            androidx.media.MediaSessionManager r1 = androidx.media.MediaSessionManager.sSessionManager     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L14
            androidx.media.MediaSessionManager r1 = new androidx.media.MediaSessionManager     // Catch: java.lang.Throwable -> L18
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            androidx.media.MediaSessionManager.sSessionManager = r1     // Catch: java.lang.Throwable -> L18
        L14:
            androidx.media.MediaSessionManager r2 = androidx.media.MediaSessionManager.sSessionManager     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "context cannot be null"
            r2.<init>(r0)
            throw r2
    }

    public boolean isTrustedForMediaControl(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfo r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            androidx.media.MediaSessionManagerImplApi21 r0 = r1.mImpl
            androidx.media.MediaSessionManagerImplBase$RemoteUserInfoImplBase r2 = r2.mImpl
            boolean r2 = r0.isTrustedForMediaControl(r2)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "userInfo should not be null"
            r2.<init>(r0)
            throw r2
    }
}
