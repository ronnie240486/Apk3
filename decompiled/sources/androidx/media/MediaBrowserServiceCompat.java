package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends android.app.Service {
    public static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-5f;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String KEY_MEDIA_ITEM = "media_item";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String KEY_SEARCH_RESULTS = "search_results";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int RESULT_OK = 0;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    public final androidx.media.MediaBrowserServiceCompat.ConnectionRecord mConnectionFromFwk;
    public final androidx.collection.ArrayMap<android.os.IBinder, androidx.media.MediaBrowserServiceCompat.ConnectionRecord> mConnections;
    public androidx.media.MediaBrowserServiceCompat.ConnectionRecord mCurConnection;
    public final androidx.media.MediaBrowserServiceCompat.ServiceHandler mHandler;
    private androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl mImpl;
    public final java.util.ArrayList<androidx.media.MediaBrowserServiceCompat.ConnectionRecord> mPendingConnections;
    public android.support.v4.media.session.MediaSessionCompat.Token mSession;





    public static final class BrowserRoot {
        public static final java.lang.String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final java.lang.String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final java.lang.String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";

        @java.lang.Deprecated
        public static final java.lang.String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final android.os.Bundle mExtras;
        private final java.lang.String mRootId;

        public BrowserRoot(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto La
                r0.mRootId = r1
                r0.mExtras = r2
                return
            La:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead"
                r1.<init>(r2)
                throw r1
        }

        public static /* synthetic */ java.lang.String access$000(androidx.media.MediaBrowserServiceCompat.BrowserRoot r0) {
                java.lang.String r0 = r0.mRootId
                return r0
        }

        public static /* synthetic */ android.os.Bundle access$100(androidx.media.MediaBrowserServiceCompat.BrowserRoot r0) {
                android.os.Bundle r0 = r0.mExtras
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public java.lang.String getRootId() {
                r1 = this;
                java.lang.String r0 = r1.mRootId
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ConnectionRecord implements android.os.IBinder.DeathRecipient {
        public final androidx.media.MediaSessionManager.RemoteUserInfo browserInfo;
        public final androidx.media.MediaBrowserServiceCompat.ServiceCallbacks callbacks;
        public final int pid;
        public final java.lang.String pkg;
        public androidx.media.MediaBrowserServiceCompat.BrowserRoot root;
        public final android.os.Bundle rootHints;
        public final java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> subscriptions;
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;
        public final int uid;


        public ConnectionRecord(androidx.media.MediaBrowserServiceCompat r1, java.lang.String r2, int r3, int r4, android.os.Bundle r5, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.subscriptions = r1
                r0.pkg = r2
                r0.pid = r3
                r0.uid = r4
                androidx.media.MediaSessionManager$RemoteUserInfo r1 = new androidx.media.MediaSessionManager$RemoteUserInfo
                r1.<init>(r2, r3, r4)
                r0.browserInfo = r1
                r0.rootHints = r5
                r0.callbacks = r6
                return
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1 r1 = new androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1
                r1.<init>(r2)
                r0.post(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface MediaBrowserServiceImpl {
        android.os.Bundle getBrowserRootHints();

        androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo r1, java.lang.String r2, android.os.Bundle r3);

        void notifyChildrenChanged(java.lang.String r1, android.os.Bundle r2);

        android.os.IBinder onBind(android.content.Intent r1);

        void onCreate();

        void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(21)
    public class MediaBrowserServiceImplApi21 implements androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl {
        public android.os.Messenger mMessenger;
        public final java.util.List<android.os.Bundle> mRootExtrasList;
        public android.service.media.MediaBrowserService mServiceFwk;
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;





        /* JADX INFO: loaded from: classes.dex */
        @androidx.annotation.RequiresApi(21)
        public class MediaBrowserServiceApi21 extends android.service.media.MediaBrowserService {
            public final /* synthetic */ androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;

            public MediaBrowserServiceApi21(androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 r1, android.content.Context r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r0.attachBaseContext(r2)
                    return
            }

            @Override // android.service.media.MediaBrowserService
            @android.annotation.SuppressLint({"SyntheticAccessor"})
            public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r4, int r5, android.os.Bundle r6) {
                    r3 = this;
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r6)
                    androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 r0 = r3.this$1
                    r1 = 0
                    if (r6 != 0) goto La
                    r2 = r1
                    goto Lf
                La:
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>(r6)
                Lf:
                    androidx.media.MediaBrowserServiceCompat$BrowserRoot r4 = r0.onGetRoot(r4, r5, r2)
                    if (r4 != 0) goto L16
                    goto L23
                L16:
                    android.service.media.MediaBrowserService$BrowserRoot r1 = new android.service.media.MediaBrowserService$BrowserRoot
                    java.lang.String r5 = androidx.media.MediaBrowserServiceCompat.BrowserRoot.access$000(r4)
                    android.os.Bundle r4 = androidx.media.MediaBrowserServiceCompat.BrowserRoot.access$100(r4)
                    r1.<init>(r5, r4)
                L23:
                    return r1
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String r3, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r4) {
                    r2 = this;
                    androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 r0 = r2.this$1
                    androidx.media.MediaBrowserServiceCompat$ResultWrapper r1 = new androidx.media.MediaBrowserServiceCompat$ResultWrapper
                    r1.<init>(r4)
                    r0.onLoadChildren(r3, r1)
                    return
            }
        }

        public MediaBrowserServiceImplApi21(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mRootExtrasList = r1
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
                r2 = this;
                android.os.Messenger r0 = r2.mMessenger
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L1d
                android.os.Bundle r0 = r0.rootHints
                if (r0 != 0) goto L11
                goto L1c
            L11:
                android.os.Bundle r1 = new android.os.Bundle
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                android.os.Bundle r0 = r0.rootHints
                r1.<init>(r0)
            L1c:
                return r1
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L9
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.browserInfo
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(androidx.media.MediaSessionManager.RemoteUserInfo r3, java.lang.String r4, android.os.Bundle r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4
                r1.<init>(r2, r3, r4, r5)
                r0.post(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                r2.notifyChildrenChangedForFramework(r3, r4)
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3
                r1.<init>(r2, r3, r4)
                r0.post(r1)
                return
        }

        public final void notifyChildrenChangedForCompatOnHandler(androidx.media.MediaBrowserServiceCompat.ConnectionRecord r4, java.lang.String r5, android.os.Bundle r6) {
                r3 = this;
                java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r0 = r4.subscriptions
                java.lang.Object r0 = r0.get(r5)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L2e
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
                S r2 = r1.second
                android.os.Bundle r2 = (android.os.Bundle) r2
                boolean r2 = androidx.media.MediaBrowserCompatUtils.hasDuplicatedItems(r6, r2)
                if (r2 == 0) goto Le
                androidx.media.MediaBrowserServiceCompat r2 = r3.this$0
                S r1 = r1.second
                android.os.Bundle r1 = (android.os.Bundle) r1
                r2.performLoadChildren(r5, r4, r1, r6)
                goto Le
            L2e:
                return
        }

        public void notifyChildrenChangedForFramework(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                android.service.media.MediaBrowserService r2 = r0.mServiceFwk
                r2.notifyChildrenChanged(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent r2) {
                r1 = this;
                android.service.media.MediaBrowserService r0 = r1.mServiceFwk
                android.os.IBinder r2 = r0.onBind(r2)
                return r2
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                r0.<init>(r2, r1)
                r2.mServiceFwk = r0
                r0.onCreate()
                return
        }

        public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
                r11 = this;
                r0 = -1
                r1 = 0
                if (r14 == 0) goto L59
                r2 = 0
                java.lang.String r3 = "extra_client_version"
                int r2 = r14.getInt(r3, r2)
                if (r2 == 0) goto L59
                r14.remove(r3)
                android.os.Messenger r2 = new android.os.Messenger
                androidx.media.MediaBrowserServiceCompat r3 = r11.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r3 = r3.mHandler
                r2.<init>(r3)
                r11.mMessenger = r2
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                r3 = 2
                java.lang.String r4 = "extra_service_version"
                r2.putInt(r4, r3)
                android.os.Messenger r3 = r11.mMessenger
                android.os.IBinder r3 = r3.getBinder()
                java.lang.String r4 = "extra_messenger"
                androidx.core.app.BundleCompat.putBinder(r2, r4, r3)
                androidx.media.MediaBrowserServiceCompat r3 = r11.this$0
                android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.mSession
                if (r3 == 0) goto L49
                android.support.v4.media.session.IMediaSession r3 = r3.getExtraBinder()
                if (r3 != 0) goto L3f
                r3 = r1
                goto L43
            L3f:
                android.os.IBinder r3 = r3.asBinder()
            L43:
                java.lang.String r4 = "extra_session_binder"
                androidx.core.app.BundleCompat.putBinder(r2, r4, r3)
                goto L4e
            L49:
                java.util.List<android.os.Bundle> r3 = r11.mRootExtrasList
                r3.add(r2)
            L4e:
                java.lang.String r3 = "extra_calling_pid"
                int r0 = r14.getInt(r3, r0)
                r14.remove(r3)
                r7 = r0
                goto L5b
            L59:
                r2 = r1
                r7 = -1
            L5b:
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = new androidx.media.MediaBrowserServiceCompat$ConnectionRecord
                androidx.media.MediaBrowserServiceCompat r5 = r11.this$0
                r10 = 0
                r4 = r0
                r6 = r12
                r8 = r13
                r9 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10)
                androidx.media.MediaBrowserServiceCompat r3 = r11.this$0
                r3.mCurConnection = r0
                androidx.media.MediaBrowserServiceCompat$BrowserRoot r12 = r3.onGetRoot(r12, r13, r14)
                androidx.media.MediaBrowserServiceCompat r13 = r11.this$0
                r13.mCurConnection = r1
                if (r12 != 0) goto L76
                return r1
            L76:
                android.os.Messenger r14 = r11.mMessenger
                if (r14 == 0) goto L7f
                java.util.ArrayList<androidx.media.MediaBrowserServiceCompat$ConnectionRecord> r13 = r13.mPendingConnections
                r13.add(r0)
            L7f:
                if (r2 != 0) goto L86
                android.os.Bundle r2 = r12.getExtras()
                goto L93
            L86:
                android.os.Bundle r13 = r12.getExtras()
                if (r13 == 0) goto L93
                android.os.Bundle r13 = r12.getExtras()
                r2.putAll(r13)
            L93:
                androidx.media.MediaBrowserServiceCompat$BrowserRoot r13 = new androidx.media.MediaBrowserServiceCompat$BrowserRoot
                java.lang.String r12 = r12.getRootId()
                r13.<init>(r12, r2)
                return r13
        }

        public void onLoadChildren(java.lang.String r3, androidx.media.MediaBrowserServiceCompat.ResultWrapper<java.util.List<android.os.Parcel>> r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2
                r0.<init>(r3, r4)
                androidx.media.MediaBrowserServiceCompat r4 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r4.mConnectionFromFwk
                r4.mCurConnection = r1
                r4.onLoadChildren(r3, r0)
                androidx.media.MediaBrowserServiceCompat r3 = r2.this$0
                r4 = 0
                r3.mCurConnection = r4
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1
                r1.<init>(r2, r3)
                r0.postOrRun(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(23)
    public class MediaBrowserServiceImplApi23 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 {
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;


        /* JADX INFO: loaded from: classes.dex */
        public class MediaBrowserServiceApi23 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            public final /* synthetic */ androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 this$1;

            public MediaBrowserServiceApi23(androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 r1, android.content.Context r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1, r2)
                    return
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(java.lang.String r3, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> r4) {
                    r2 = this;
                    androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 r0 = r2.this$1
                    androidx.media.MediaBrowserServiceCompat$ResultWrapper r1 = new androidx.media.MediaBrowserServiceCompat$ResultWrapper
                    r1.<init>(r4)
                    r0.onLoadItem(r3, r1)
                    return
            }
        }

        public MediaBrowserServiceImplApi23(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                r0.<init>(r2, r1)
                r2.mServiceFwk = r0
                r0.onCreate()
                return
        }

        public void onLoadItem(java.lang.String r3, androidx.media.MediaBrowserServiceCompat.ResultWrapper<android.os.Parcel> r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1
                r0.<init>(r3, r4)
                androidx.media.MediaBrowserServiceCompat r4 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r4.mConnectionFromFwk
                r4.mCurConnection = r1
                r4.onLoadItem(r3, r0)
                androidx.media.MediaBrowserServiceCompat r3 = r2.this$0
                r4 = 0
                r3.mCurConnection = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(26)
    public class MediaBrowserServiceImplApi26 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 {
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;


        /* JADX INFO: loaded from: classes.dex */
        public class MediaBrowserServiceApi26 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public final /* synthetic */ androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 this$1;

            public MediaBrowserServiceApi26(androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 r1, android.content.Context r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r1, r2)
                    return
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(java.lang.String r4, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r5, android.os.Bundle r6) {
                    r3 = this;
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r6)
                    androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 r0 = r3.this$1
                    androidx.media.MediaBrowserServiceCompat r1 = r0.this$0
                    androidx.media.MediaBrowserServiceCompat$ConnectionRecord r2 = r1.mConnectionFromFwk
                    r1.mCurConnection = r2
                    androidx.media.MediaBrowserServiceCompat$ResultWrapper r1 = new androidx.media.MediaBrowserServiceCompat$ResultWrapper
                    r1.<init>(r5)
                    r0.onLoadChildren(r4, r1, r6)
                    androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 r4 = r3.this$1
                    androidx.media.MediaBrowserServiceCompat r4 = r4.this$0
                    r5 = 0
                    r4.mCurConnection = r5
                    return
            }
        }

        public MediaBrowserServiceImplApi26(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r0.mCurConnection
                if (r1 == 0) goto L23
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mConnectionFromFwk
                if (r1 != r0) goto L11
                android.service.media.MediaBrowserService r0 = r2.mServiceFwk
                android.os.Bundle r0 = r0.getBrowserRootHints()
                return r0
            L11:
                android.os.Bundle r0 = r1.rootHints
                if (r0 != 0) goto L17
                r0 = 0
                goto L22
            L17:
                android.os.Bundle r0 = new android.os.Bundle
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r1.mCurConnection
                android.os.Bundle r1 = r1.rootHints
                r0.<init>(r1)
            L22:
                return r0
            L23:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        public final void notifyChildrenChangedForFramework(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                if (r3 == 0) goto L8
                android.service.media.MediaBrowserService r0 = r1.mServiceFwk
                r0.notifyChildrenChanged(r2, r3)
                goto Ld
            L8:
                android.service.media.MediaBrowserService r3 = r1.mServiceFwk
                r3.notifyChildrenChanged(r2)
            Ld:
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                r0.<init>(r2, r1)
                r2.mServiceFwk = r0
                r0.onCreate()
                return
        }

        public void onLoadChildren(java.lang.String r3, androidx.media.MediaBrowserServiceCompat.ResultWrapper<java.util.List<android.os.Parcel>> r4, android.os.Bundle r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1
                r0.<init>(r2, r3, r4, r5)
                androidx.media.MediaBrowserServiceCompat r4 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r4.mConnectionFromFwk
                r4.mCurConnection = r1
                r4.onLoadChildren(r3, r0, r5)
                androidx.media.MediaBrowserServiceCompat r3 = r2.this$0
                r4 = 0
                r3.mCurConnection = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(28)
    public class MediaBrowserServiceImplApi28 extends androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 {
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;

        public MediaBrowserServiceImplApi28(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r0.mCurConnection
                if (r1 == 0) goto L19
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mConnectionFromFwk
                if (r1 != r0) goto L16
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = new androidx.media.MediaSessionManager$RemoteUserInfo
                android.service.media.MediaBrowserService r1 = r2.mServiceFwk
                android.media.session.MediaSessionManager$RemoteUserInfo r1 = r1.getCurrentBrowserInfo()
                r0.<init>(r1)
                return r0
            L16:
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = r1.browserInfo
                return r0
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class MediaBrowserServiceImplBase implements androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl {
        private android.os.Messenger mMessenger;
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;




        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.Bundle getBrowserRootHints() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L18
                android.os.Bundle r0 = r0.rootHints
                if (r0 != 0) goto Lc
                r0 = 0
                goto L17
            Lc:
                android.os.Bundle r0 = new android.os.Bundle
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r1 = r1.mCurConnection
                android.os.Bundle r1 = r1.rootHints
                r0.<init>(r1)
            L17:
                return r0
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ConnectionRecord r0 = r0.mCurConnection
                if (r0 == 0) goto L9
                androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.browserInfo
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfo r3, @androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3
                r1.<init>(r2, r3, r4, r5)
                r0.post(r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(@androidx.annotation.NonNull java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2
                r1.<init>(r2, r3, r4)
                r0.post(r1)
                return
        }

        public final void notifyChildrenChangedOnHandler(androidx.media.MediaBrowserServiceCompat.ConnectionRecord r4, java.lang.String r5, android.os.Bundle r6) {
                r3 = this;
                java.util.HashMap<java.lang.String, java.util.List<androidx.core.util.Pair<android.os.IBinder, android.os.Bundle>>> r0 = r4.subscriptions
                java.lang.Object r0 = r0.get(r5)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L2e
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
                S r2 = r1.second
                android.os.Bundle r2 = (android.os.Bundle) r2
                boolean r2 = androidx.media.MediaBrowserCompatUtils.hasDuplicatedItems(r6, r2)
                if (r2 == 0) goto Le
                androidx.media.MediaBrowserServiceCompat r2 = r3.this$0
                S r1 = r1.second
                android.os.Bundle r1 = (android.os.Bundle) r1
                r2.performLoadChildren(r5, r4, r1, r6)
                goto Le
            L2e:
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public android.os.IBinder onBind(android.content.Intent r2) {
                r1 = this;
                java.lang.String r2 = r2.getAction()
                java.lang.String r0 = "android.media.browse.MediaBrowserService"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L13
                android.os.Messenger r2 = r1.mMessenger
                android.os.IBinder r2 = r2.getBinder()
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
                r2 = this;
                android.os.Messenger r0 = new android.os.Messenger
                androidx.media.MediaBrowserServiceCompat r1 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r1 = r1.mHandler
                r0.<init>(r1)
                r2.mMessenger = r0
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1 r1 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }
    }

    public static class Result<T> {
        private final java.lang.Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendResultCalled;

        public Result(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mDebug = r1
                return
        }

        private void checkExtraFields(@androidx.annotation.Nullable android.os.Bundle r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return
            L3:
                java.lang.String r0 = "android.media.browse.extra.DOWNLOAD_PROGRESS"
                boolean r1 = r3.containsKey(r0)
                if (r1 == 0) goto L26
                float r3 = r3.getFloat(r0)
                r0 = -1222130260(0xffffffffb727c5ac, float:-1.0E-5)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L1e
                r0 = 1065353300(0x3f800054, float:1.00001)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 > 0) goto L1e
                goto L26
            L1e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]"
                r3.<init>(r0)
                throw r3
            L26:
                return
        }

        public void detach() {
                r3 = this;
                boolean r0 = r3.mDetachCalled
                if (r0 != 0) goto L3a
                boolean r0 = r3.mSendResultCalled
                if (r0 != 0) goto L25
                boolean r0 = r3.mSendErrorCalled
                if (r0 != 0) goto L10
                r0 = 1
                r3.mDetachCalled = r0
                return
            L10:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "detach() called when sendError() had already been called for: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.Object r2 = r3.mDebug
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "detach() called when sendResult() had already been called for: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.Object r2 = r3.mDebug
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L3a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "detach() called when detach() had already been called for: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.Object r2 = r3.mDebug
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final int getFlags() {
                r1 = this;
                int r0 = r1.mFlags
                return r0
        }

        public final boolean isDone() {
                r1 = this;
                boolean r0 = r1.mDetachCalled
                if (r0 != 0) goto Lf
                boolean r0 = r1.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r1.mSendErrorCalled
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public void onErrorSent(@androidx.annotation.Nullable android.os.Bundle r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "It is not supported to send an error for "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void onProgressUpdateSent(@androidx.annotation.Nullable android.os.Bundle r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "It is not supported to send an interim update for "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void onResultSent(@androidx.annotation.Nullable T r1) {
                r0 = this;
                return
        }

        public void sendError(@androidx.annotation.Nullable android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r2.mSendErrorCalled
                if (r0 != 0) goto Lf
                r0 = 1
                r2.mSendErrorCalled = r0
                r2.onErrorSent(r3)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "sendError() called when either sendResult() or sendError() had already been called for: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void sendProgressUpdate(@androidx.annotation.Nullable android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r2.mSendErrorCalled
                if (r0 != 0) goto Lf
                r2.checkExtraFields(r3)
                r2.onProgressUpdateSent(r3)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public void sendResult(@androidx.annotation.Nullable T r3) {
                r2 = this;
                boolean r0 = r2.mSendResultCalled
                if (r0 != 0) goto Lf
                boolean r0 = r2.mSendErrorCalled
                if (r0 != 0) goto Lf
                r0 = 1
                r2.mSendResultCalled = r0
                r2.onResultSent(r3)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "sendResult() called when either sendResult() or sendError() had already been called for: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Object r1 = r2.mDebug
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public final void setFlags(int r1) {
                r0 = this;
                r0.mFlags = r1
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class ResultWrapper<T> {
        public android.service.media.MediaBrowserService.Result mResultFwk;

        public ResultWrapper(android.service.media.MediaBrowserService.Result r1) {
                r0 = this;
                r0.<init>()
                r0.mResultFwk = r1
                return
        }

        public void detach() {
                r1 = this;
                android.service.media.MediaBrowserService$Result r0 = r1.mResultFwk
                r0.detach()
                return
        }

        public void sendResult(T r6) {
                r5 = this;
                boolean r0 = r6 instanceof java.util.List
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L3c
                android.service.media.MediaBrowserService$Result r0 = r5.mResultFwk
                java.util.List r6 = (java.util.List) r6
                if (r6 != 0) goto Ld
                goto L38
            Ld:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r6.size()
                r2.<init>(r3)
                java.util.Iterator r6 = r6.iterator()
            L1a:
                boolean r3 = r6.hasNext()
                if (r3 == 0) goto L38
                java.lang.Object r3 = r6.next()
                android.os.Parcel r3 = (android.os.Parcel) r3
                r3.setDataPosition(r1)
                android.os.Parcelable$Creator r4 = android.media.browse.MediaBrowser.MediaItem.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r3)
                android.media.browse.MediaBrowser$MediaItem r4 = (android.media.browse.MediaBrowser.MediaItem) r4
                r2.add(r4)
                r3.recycle()
                goto L1a
            L38:
                r0.sendResult(r2)
                goto L59
            L3c:
                boolean r0 = r6 instanceof android.os.Parcel
                if (r0 == 0) goto L54
                android.os.Parcel r6 = (android.os.Parcel) r6
                r6.setDataPosition(r1)
                android.service.media.MediaBrowserService$Result r0 = r5.mResultFwk
                android.os.Parcelable$Creator r1 = android.media.browse.MediaBrowser.MediaItem.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r6)
                r0.sendResult(r1)
                r6.recycle()
                goto L59
            L54:
                android.service.media.MediaBrowserService$Result r6 = r5.mResultFwk
                r6.sendResult(r2)
            L59:
                return
        }
    }

    public class ServiceBinderImpl {
        public final /* synthetic */ androidx.media.MediaBrowserServiceCompat this$0;










        public ServiceBinderImpl(androidx.media.MediaBrowserServiceCompat r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void addSubscription(java.lang.String r9, android.os.IBinder r10, android.os.Bundle r11, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r12) {
                r8 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r8.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3 r7 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3
                r1 = r7
                r2 = r8
                r3 = r12
                r4 = r9
                r5 = r10
                r6 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.postOrRun(r7)
                return
        }

        public void connect(java.lang.String r10, int r11, int r12, android.os.Bundle r13, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r14) {
                r9 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r9.this$0
                java.util.Objects.requireNonNull(r0)
                r1 = 0
                if (r10 != 0) goto L9
                goto L22
            L9:
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String[] r0 = r0.getPackagesForUid(r12)
                int r2 = r0.length
                r3 = 0
            L13:
                if (r3 >= r2) goto L22
                r4 = r0[r3]
                boolean r4 = r4.equals(r10)
                if (r4 == 0) goto L1f
                r1 = 1
                goto L22
            L1f:
                int r3 = r3 + 1
                goto L13
            L22:
                if (r1 == 0) goto L38
                androidx.media.MediaBrowserServiceCompat r0 = r9.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1 r8 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1
                r1 = r8
                r2 = r9
                r3 = r14
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.postOrRun(r8)
                return
            L38:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "Package/uid mismatch: uid="
                r13.append(r14)
                r13.append(r12)
                java.lang.String r12 = " package="
                r13.append(r12)
                r13.append(r10)
                java.lang.String r10 = r13.toString()
                r11.<init>(r10)
                throw r11
        }

        public void disconnect(androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2
                r1.<init>(r2, r3)
                r0.postOrRun(r1)
                return
        }

        public void getMediaItem(java.lang.String r3, android.support.v4.os.ResultReceiver r4, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r5) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L15
                if (r4 != 0) goto L9
                goto L15
            L9:
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5
                r1.<init>(r2, r5, r3, r4)
                r0.postOrRun(r1)
            L15:
                return
        }

        public void registerCallbacks(androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r10, java.lang.String r11, int r12, int r13, android.os.Bundle r14) {
                r9 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r9.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6 r8 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r13
                r5 = r11
                r6 = r12
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.postOrRun(r8)
                return
        }

        public void removeSubscription(java.lang.String r3, android.os.IBinder r4, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r5) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4
                r1.<init>(r2, r5, r3, r4)
                r0.postOrRun(r1)
                return
        }

        public void search(java.lang.String r9, android.os.Bundle r10, android.support.v4.os.ResultReceiver r11, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r12) {
                r8 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r9)
                if (r0 != 0) goto L1b
                if (r11 != 0) goto L9
                goto L1b
            L9:
                androidx.media.MediaBrowserServiceCompat r0 = r8.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8 r7 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8
                r1 = r7
                r2 = r8
                r3 = r12
                r4 = r9
                r5 = r10
                r6 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.postOrRun(r7)
            L1b:
                return
        }

        public void sendCustomAction(java.lang.String r9, android.os.Bundle r10, android.support.v4.os.ResultReceiver r11, androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r12) {
                r8 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r9)
                if (r0 != 0) goto L1b
                if (r11 != 0) goto L9
                goto L1b
            L9:
                androidx.media.MediaBrowserServiceCompat r0 = r8.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9 r7 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9
                r1 = r7
                r2 = r8
                r3 = r12
                r4 = r9
                r5 = r10
                r6 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r0.postOrRun(r7)
            L1b:
                return
        }

        public void unregisterCallbacks(androidx.media.MediaBrowserServiceCompat.ServiceCallbacks r3) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompat r0 = r2.this$0
                androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = r0.mHandler
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7 r1 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7
                r1.<init>(r2, r3)
                r0.postOrRun(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface ServiceCallbacks {
        android.os.IBinder asBinder();

        void onConnect(java.lang.String r1, android.support.v4.media.session.MediaSessionCompat.Token r2, android.os.Bundle r3) throws android.os.RemoteException;

        void onConnectFailed() throws android.os.RemoteException;

        void onLoadChildren(java.lang.String r1, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2, android.os.Bundle r3, android.os.Bundle r4) throws android.os.RemoteException;
    }

    public static class ServiceCallbacksCompat implements androidx.media.MediaBrowserServiceCompat.ServiceCallbacks {
        public final android.os.Messenger mCallbacks;

        public ServiceCallbacksCompat(android.os.Messenger r1) {
                r0 = this;
                r0.<init>()
                r0.mCallbacks = r1
                return
        }

        private void sendRequest(int r2, android.os.Bundle r3) throws android.os.RemoteException {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r2 = 2
                r0.arg1 = r2
                r0.setData(r3)
                android.os.Messenger r2 = r1.mCallbacks
                r2.send(r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public android.os.IBinder asBinder() {
                r1 = this;
                android.os.Messenger r0 = r1.mCallbacks
                android.os.IBinder r0 = r0.getBinder()
                return r0
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(java.lang.String r3, android.support.v4.media.session.MediaSessionCompat.Token r4, android.os.Bundle r5) throws android.os.RemoteException {
                r2 = this;
                if (r5 != 0) goto L7
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
            L7:
                r0 = 2
                java.lang.String r1 = "extra_service_version"
                r5.putInt(r1, r0)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_media_session_token"
                r0.putParcelable(r3, r4)
                java.lang.String r3 = "data_root_hints"
                r0.putBundle(r3, r5)
                r3 = 1
                r2.sendRequest(r3, r0)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() throws android.os.RemoteException {
                r2 = this;
                r0 = 2
                r1 = 0
                r2.sendRequest(r0, r1)
                return
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(java.lang.String r3, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5, android.os.Bundle r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_options"
                r0.putBundle(r3, r5)
                java.lang.String r3 = "data_notify_children_changed_options"
                r0.putBundle(r3, r6)
                if (r4 == 0) goto L28
                boolean r3 = r4 instanceof java.util.ArrayList
                if (r3 == 0) goto L1d
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                goto L23
            L1d:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r4)
                r4 = r3
            L23:
                java.lang.String r3 = "data_media_item_list"
                r0.putParcelableArrayList(r3, r4)
            L28:
                r3 = 3
                r2.sendRequest(r3, r0)
                return
        }
    }

    public final class ServiceHandler extends android.os.Handler {
        private final androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl mServiceBinderImpl;

        public ServiceHandler(androidx.media.MediaBrowserServiceCompat r2) {
                r1 = this;
                r1.<init>()
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r0 = new androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl
                r0.<init>(r2)
                r1.mServiceBinderImpl = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r10) {
                r9 = this;
                android.os.Bundle r0 = r10.getData()
                int r1 = r10.what
                java.lang.String r2 = "data_callback_token"
                java.lang.String r3 = "data_calling_uid"
                java.lang.String r4 = "data_calling_pid"
                java.lang.String r5 = "data_package_name"
                java.lang.String r6 = "data_root_hints"
                java.lang.String r7 = "data_result_receiver"
                java.lang.String r8 = "data_media_item_id"
                switch(r1) {
                    case 1: goto L110;
                    case 2: goto L103;
                    case 3: goto Le5;
                    case 4: goto Ld0;
                    case 5: goto Lb9;
                    case 6: goto L96;
                    case 7: goto L88;
                    case 8: goto L65;
                    case 9: goto L42;
                    default: goto L17;
                }
            L17:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unhandled message: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r1 = "\n  Service version: "
                r0.append(r1)
                r1 = 2
                r0.append(r1)
                java.lang.String r1 = "\n  Client version: "
                r0.append(r1)
                int r10 = r10.arg1
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "MBServiceCompat"
                android.util.Log.w(r0, r10)
                goto L130
            L42:
                java.lang.String r1 = "data_custom_action_extras"
                android.os.Bundle r1 = r0.getBundle(r1)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                java.lang.String r3 = "data_custom_action"
                java.lang.String r3 = r0.getString(r3)
                android.os.Parcelable r0 = r0.getParcelable(r7)
                android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r4 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r4.<init>(r10)
                r2.sendCustomAction(r3, r1, r0, r4)
                goto L130
            L65:
                java.lang.String r1 = "data_search_extras"
                android.os.Bundle r1 = r0.getBundle(r1)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                java.lang.String r3 = "data_search_query"
                java.lang.String r3 = r0.getString(r3)
                android.os.Parcelable r0 = r0.getParcelable(r7)
                android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r4 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r4.<init>(r10)
                r2.search(r3, r1, r0, r4)
                goto L130
            L88:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r0 = r9.mServiceBinderImpl
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r1 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r1.<init>(r10)
                r0.unregisterCallbacks(r1)
                goto L130
            L96:
                android.os.Bundle r7 = r0.getBundle(r6)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r7)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r1 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r1.<init>(r10)
                java.lang.String r10 = r0.getString(r5)
                int r5 = r0.getInt(r4)
                int r6 = r0.getInt(r3)
                r3 = r1
                r4 = r10
                r2.registerCallbacks(r3, r4, r5, r6, r7)
                goto L130
            Lb9:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r1 = r9.mServiceBinderImpl
                java.lang.String r2 = r0.getString(r8)
                android.os.Parcelable r0 = r0.getParcelable(r7)
                android.support.v4.os.ResultReceiver r0 = (android.support.v4.os.ResultReceiver) r0
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r3 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r3.<init>(r10)
                r1.getMediaItem(r2, r0, r3)
                goto L130
            Ld0:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r1 = r9.mServiceBinderImpl
                java.lang.String r3 = r0.getString(r8)
                android.os.IBinder r0 = androidx.core.app.BundleCompat.getBinder(r0, r2)
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r2 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r2.<init>(r10)
                r1.removeSubscription(r3, r0, r2)
                goto L130
            Le5:
                java.lang.String r1 = "data_options"
                android.os.Bundle r1 = r0.getBundle(r1)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r3 = r9.mServiceBinderImpl
                java.lang.String r4 = r0.getString(r8)
                android.os.IBinder r0 = androidx.core.app.BundleCompat.getBinder(r0, r2)
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r2 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r2.<init>(r10)
                r3.addSubscription(r4, r0, r1, r2)
                goto L130
            L103:
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r0 = r9.mServiceBinderImpl
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r1 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r1.<init>(r10)
                r0.disconnect(r1)
                goto L130
            L110:
                android.os.Bundle r6 = r0.getBundle(r6)
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r6)
                androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl r2 = r9.mServiceBinderImpl
                java.lang.String r1 = r0.getString(r5)
                int r4 = r0.getInt(r4)
                int r5 = r0.getInt(r3)
                androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat r7 = new androidx.media.MediaBrowserServiceCompat$ServiceCallbacksCompat
                android.os.Messenger r10 = r10.replyTo
                r7.<init>(r10)
                r3 = r1
                r2.connect(r3, r4, r5, r6, r7)
            L130:
                return
        }

        public void postOrRun(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                android.os.Looper r1 = r2.getLooper()
                java.lang.Thread r1 = r1.getThread()
                if (r0 != r1) goto L12
                r3.run()
                goto L15
            L12:
                r2.post(r3)
            L15:
                return
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(android.os.Message r4, long r5) {
                r3 = this;
                android.os.Bundle r0 = r4.getData()
                java.lang.Class<android.support.v4.media.MediaBrowserCompat> r1 = android.support.v4.media.MediaBrowserCompat.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r0.setClassLoader(r1)
                int r1 = android.os.Binder.getCallingUid()
                java.lang.String r2 = "data_calling_uid"
                r0.putInt(r2, r1)
                int r1 = android.os.Binder.getCallingPid()
                java.lang.String r2 = "data_calling_pid"
                if (r1 <= 0) goto L22
                r0.putInt(r2, r1)
                goto L2c
            L22:
                boolean r1 = r0.containsKey(r2)
                if (r1 != 0) goto L2c
                r1 = -1
                r0.putInt(r2, r1)
            L2c:
                boolean r4 = super.sendMessageAtTime(r4, r5)
                return r4
        }
    }

    static {
            java.lang.String r0 = "MBServiceCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.media.MediaBrowserServiceCompat.DEBUG = r0
            return
    }

    public MediaBrowserServiceCompat() {
            r8 = this;
            r8.<init>()
            androidx.media.MediaBrowserServiceCompat$ConnectionRecord r7 = new androidx.media.MediaBrowserServiceCompat$ConnectionRecord
            java.lang.String r2 = "android.media.session.MediaController"
            r3 = -1
            r4 = -1
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mConnectionFromFwk = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.mPendingConnections = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r8.mConnections = r0
            androidx.media.MediaBrowserServiceCompat$ServiceHandler r0 = new androidx.media.MediaBrowserServiceCompat$ServiceHandler
            r0.<init>(r8)
            r8.mHandler = r0
            return
    }

    public final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> applyOptions(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.String r0 = "android.media.browse.extra.PAGE"
            r1 = -1
            int r0 = r5.getInt(r0, r1)
            java.lang.String r2 = "android.media.browse.extra.PAGE_SIZE"
            int r5 = r5.getInt(r2, r1)
            if (r0 != r1) goto L16
            if (r5 != r1) goto L16
            return r4
        L16:
            int r1 = r5 * r0
            int r2 = r1 + r5
            if (r0 < 0) goto L35
            r0 = 1
            if (r5 < r0) goto L35
            int r5 = r4.size()
            if (r1 < r5) goto L26
            goto L35
        L26:
            int r5 = r4.size()
            if (r2 <= r5) goto L30
            int r2 = r4.size()
        L30:
            java.util.List r4 = r4.subList(r1, r2)
            return r4
        L35:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void attachToBaseContext(android.content.Context r1) {
            r0 = this;
            r0.attachBaseContext(r1)
            return
    }

    @Override // android.app.Service
    public void dump(java.io.FileDescriptor r1, java.io.PrintWriter r2, java.lang.String[] r3) {
            r0 = this;
            return
    }

    public final android.os.Bundle getBrowserRootHints() {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getBrowserRootHints()
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.getCurrentBrowserInfo()
            return r0
    }

    @androidx.annotation.Nullable
    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSession
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void notifyChildrenChanged(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfo r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Bundle r4) {
            r1 = this;
            if (r2 == 0) goto L1c
            if (r3 == 0) goto L14
            if (r4 == 0) goto Lc
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            r0.notifyChildrenChanged(r2, r3, r4)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "options cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "remoteUserInfo cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
    }

    public void notifyChildrenChanged(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L9
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r2.mImpl
            r1 = 0
            r0.notifyChildrenChanged(r3, r1)
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "parentId cannot be null in notifyChildrenChanged"
            r3.<init>(r0)
            throw r3
    }

    public void notifyChildrenChanged(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
            r1 = this;
            if (r2 == 0) goto L12
            if (r3 == 0) goto La
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            r0.notifyChildrenChanged(r2, r3)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "options cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId cannot be null in notifyChildrenChanged"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            android.os.IBinder r2 = r0.onBind(r2)
            return r2
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi28 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi28
            r0.<init>(r2)
            r2.mImpl = r0
            goto L30
        L11:
            r1 = 26
            if (r0 < r1) goto L1d
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26
            r0.<init>(r2)
            r2.mImpl = r0
            goto L30
        L1d:
            r1 = 23
            if (r0 < r1) goto L29
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23
            r0.<init>(r2)
            r2.mImpl = r0
            goto L30
        L29:
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 r0 = new androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
            r0.<init>(r2)
            r2.mImpl = r0
        L30:
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r2.mImpl
            r0.onCreate()
            return
    }

    public void onCustomAction(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<android.os.Bundle> r3) {
            r0 = this;
            r1 = 0
            r3.sendError(r1)
            return
    }

    @androidx.annotation.Nullable
    public abstract androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(@androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3);

    public abstract void onLoadChildren(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r2);

    public void onLoadChildren(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r2, @androidx.annotation.NonNull android.os.Bundle r3) {
            r0 = this;
            r3 = 1
            r2.setFlags(r3)
            r0.onLoadChildren(r1, r2)
            return
    }

    public void onLoadItem(java.lang.String r1, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<android.support.v4.media.MediaBrowserCompat.MediaItem> r2) {
            r0 = this;
            r1 = 2
            r2.setFlags(r1)
            r1 = 0
            r2.sendResult(r1)
            return
    }

    public void onSearch(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r3) {
            r0 = this;
            r1 = 4
            r3.setFlags(r1)
            r1 = 0
            r3.sendResult(r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void onSubscribe(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void onUnsubscribe(java.lang.String r1) {
            r0 = this;
            return
    }

    public final void performLoadChildren(java.lang.String r9, androidx.media.MediaBrowserServiceCompat.ConnectionRecord r10, android.os.Bundle r11, android.os.Bundle r12) {
            r8 = this;
            androidx.media.MediaBrowserServiceCompat$1 r7 = new androidx.media.MediaBrowserServiceCompat$1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mCurConnection = r10
            if (r11 != 0) goto L14
            r8.onLoadChildren(r9, r7)
            goto L17
        L14:
            r8.onLoadChildren(r9, r7, r11)
        L17:
            r11 = 0
            r8.mCurConnection = r11
            boolean r11 = r7.isDone()
            if (r11 == 0) goto L21
            return
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "onLoadChildren must call detach() or sendResult() before returning for package="
            java.lang.StringBuilder r12 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12)
            java.lang.String r10 = r10.pkg
            java.lang.String r0 = " id="
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r10, r0, r9)
            r11.<init>(r9)
            throw r11
    }

    public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r2) {
            r1 = this;
            if (r2 == 0) goto L16
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSession
            if (r0 != 0) goto Le
            r1.mSession = r2
            androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl r0 = r1.mImpl
            r0.setSessionToken(r2)
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The session token has already been set"
            r2.<init>(r0)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Session token may not be null"
            r2.<init>(r0)
            throw r2
    }
}
