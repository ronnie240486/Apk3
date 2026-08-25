package android.support.v4.media;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaBrowserCompat {
    public static final java.lang.String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final java.lang.String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final boolean DEBUG = false;
    public static final java.lang.String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final java.lang.String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final java.lang.String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final java.lang.String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    public static final java.lang.String TAG = "MediaBrowserCompat";
    private final android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl mImpl;

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.media.MediaDescription getDescription(android.media.browse.MediaBrowser.MediaItem r0) {
                android.media.MediaDescription r0 = r0.getDescription()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getFlags(android.media.browse.MediaBrowser.MediaItem r0) {
                int r0 = r0.getFlags()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CallbackHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private java.lang.ref.WeakReference<android.os.Messenger> mCallbacksMessengerRef;

        public CallbackHandler(android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCallbackImplRef = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r12) {
                r11 = this;
                java.lang.String r0 = "MediaBrowserCompat"
                java.lang.ref.WeakReference<android.os.Messenger> r1 = r11.mCallbacksMessengerRef
                if (r1 == 0) goto Lae
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto Lae
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl> r1 = r11.mCallbackImplRef
                java.lang.Object r1 = r1.get()
                if (r1 != 0) goto L16
                goto Lae
            L16:
                android.os.Bundle r1 = r12.getData()
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl> r2 = r11.mCallbackImplRef
                java.lang.Object r2 = r2.get()
                android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl r2 = (android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl) r2
                java.lang.ref.WeakReference<android.os.Messenger> r3 = r11.mCallbacksMessengerRef
                java.lang.Object r3 = r3.get()
                r9 = r3
                android.os.Messenger r9 = (android.os.Messenger) r9
                r10 = 1
                int r3 = r12.what     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r4 = "data_media_item_id"
                if (r3 == r10) goto L88
                r5 = 2
                if (r3 == r5) goto L84
                r5 = 3
                if (r3 == r5) goto L62
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.os.BadParcelableException -> La1
                r1.<init>()     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "Unhandled message: "
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                r1.append(r12)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "\n  Client version: "
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                r1.append(r10)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "\n  Service version: "
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                int r3 = r12.arg1     // Catch: android.os.BadParcelableException -> La1
                r1.append(r3)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r1 = r1.toString()     // Catch: android.os.BadParcelableException -> La1
                android.util.Log.w(r0, r1)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            L62:
                java.lang.String r3 = "data_options"
                android.os.Bundle r7 = r1.getBundle(r3)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r7)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "data_notify_children_changed_options"
                android.os.Bundle r8 = r1.getBundle(r3)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r8)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r5 = r1.getString(r4)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r3 = "data_media_item_list"
                java.util.ArrayList r6 = r1.getParcelableArrayList(r3)     // Catch: android.os.BadParcelableException -> La1
                r3 = r2
                r4 = r9
                r3.onLoadChildren(r4, r5, r6, r7, r8)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            L84:
                r2.onConnectionFailed(r9)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            L88:
                java.lang.String r3 = "data_root_hints"
                android.os.Bundle r3 = r1.getBundle(r3)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r4 = r1.getString(r4)     // Catch: android.os.BadParcelableException -> La1
                java.lang.String r5 = "data_media_session_token"
                android.os.Parcelable r1 = r1.getParcelable(r5)     // Catch: android.os.BadParcelableException -> La1
                android.support.v4.media.session.MediaSessionCompat$Token r1 = (android.support.v4.media.session.MediaSessionCompat.Token) r1     // Catch: android.os.BadParcelableException -> La1
                r2.onServiceConnected(r9, r4, r1, r3)     // Catch: android.os.BadParcelableException -> La1
                goto Lae
            La1:
                java.lang.String r1 = "Could not unparcel the data."
                android.util.Log.e(r0, r1)
                int r12 = r12.what
                if (r12 != r10) goto Lae
                r2.onConnectionFailed(r9)
            Lae:
                return
        }

        public void setCallbacksMessenger(android.os.Messenger r2) {
                r1 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCallbacksMessengerRef = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ConnectionCallback {
        public final android.media.browse.MediaBrowser.ConnectionCallback mConnectionCallbackFwk;
        public android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal mConnectionCallbackInternal;

        @androidx.annotation.RequiresApi(21)
        public class ConnectionCallbackApi21 extends android.media.browse.MediaBrowser.ConnectionCallback {
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.ConnectionCallback this$0;

            public ConnectionCallbackApi21(android.support.v4.media.MediaBrowserCompat.ConnectionCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal r0 = r0.mConnectionCallbackInternal
                    if (r0 == 0) goto L9
                    r0.onConnected()
                L9:
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    r0.onConnected()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal r0 = r0.mConnectionCallbackInternal
                    if (r0 == 0) goto L9
                    r0.onConnectionFailed()
                L9:
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    r0.onConnectionFailed()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal r0 = r0.mConnectionCallbackInternal
                    if (r0 == 0) goto L9
                    r0.onConnectionSuspended()
                L9:
                    android.support.v4.media.MediaBrowserCompat$ConnectionCallback r0 = r1.this$0
                    r0.onConnectionSuspended()
                    return
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public ConnectionCallback() {
                r1 = this;
                r1.<init>()
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21 r0 = new android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21
                r0.<init>(r1)
                r1.mConnectionCallbackFwk = r0
                return
        }

        public void onConnected() {
                r0 = this;
                return
        }

        public void onConnectionFailed() {
                r0 = this;
                return
        }

        public void onConnectionSuspended() {
                r0 = this;
                return
        }

        public void setInternalConnectionCallback(android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal r1) {
                r0 = this;
                r0.mConnectionCallbackInternal = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class CustomActionCallback {
        public CustomActionCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onError(java.lang.String r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onProgressUpdate(java.lang.String r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onResult(java.lang.String r1, android.os.Bundle r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class CustomActionResultReceiver extends android.support.v4.os.ResultReceiver {
        private final java.lang.String mAction;
        private final android.support.v4.media.MediaBrowserCompat.CustomActionCallback mCallback;
        private final android.os.Bundle mExtras;

        public CustomActionResultReceiver(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.MediaBrowserCompat.CustomActionCallback r3, android.os.Handler r4) {
                r0 = this;
                r0.<init>(r4)
                r0.mAction = r1
                r0.mExtras = r2
                r0.mCallback = r3
                return
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int r3, android.os.Bundle r4) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r0 = r2.mCallback
                if (r0 != 0) goto L5
                return
            L5:
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r4)
                r0 = -1
                if (r3 == r0) goto L48
                if (r3 == 0) goto L3e
                r0 = 1
                if (r3 == r0) goto L34
                java.lang.String r0 = "Unknown result code: "
                java.lang.String r1 = " (extras="
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r0, r3, r1)
                android.os.Bundle r0 = r2.mExtras
                r3.append(r0)
                java.lang.String r0 = ", resultData="
                r3.append(r0)
                r3.append(r4)
                java.lang.String r4 = ")"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MediaBrowserCompat"
                android.util.Log.w(r4, r3)
                goto L51
            L34:
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r3 = r2.mCallback
                java.lang.String r0 = r2.mAction
                android.os.Bundle r1 = r2.mExtras
                r3.onProgressUpdate(r0, r1, r4)
                goto L51
            L3e:
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r3 = r2.mCallback
                java.lang.String r0 = r2.mAction
                android.os.Bundle r1 = r2.mExtras
                r3.onResult(r0, r1, r4)
                goto L51
            L48:
                android.support.v4.media.MediaBrowserCompat$CustomActionCallback r3 = r2.mCallback
                java.lang.String r0 = r2.mAction
                android.os.Bundle r1 = r2.mExtras
                r3.onError(r0, r1, r4)
            L51:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ItemCallback {
        public final android.media.browse.MediaBrowser.ItemCallback mItemCallbackFwk;

        @androidx.annotation.RequiresApi(23)
        public class ItemCallbackApi23 extends android.media.browse.MediaBrowser.ItemCallback {
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.ItemCallback this$0;

            public ItemCallbackApi23(android.support.v4.media.MediaBrowserCompat.ItemCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(@androidx.annotation.NonNull java.lang.String r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ItemCallback r0 = r1.this$0
                    r0.onError(r2)
                    return
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(android.media.browse.MediaBrowser.MediaItem r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$ItemCallback r0 = r1.this$0
                    android.support.v4.media.MediaBrowserCompat$MediaItem r2 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItem(r2)
                    r0.onItemLoaded(r2)
                    return
            }
        }

        public ItemCallback() {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L11
                android.support.v4.media.MediaBrowserCompat$ItemCallback$ItemCallbackApi23 r0 = new android.support.v4.media.MediaBrowserCompat$ItemCallback$ItemCallbackApi23
                r0.<init>(r2)
                r2.mItemCallbackFwk = r0
                goto L14
            L11:
                r0 = 0
                r2.mItemCallbackFwk = r0
            L14:
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                return
        }

        public void onItemLoaded(android.support.v4.media.MediaBrowserCompat.MediaItem r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ItemReceiver extends android.support.v4.os.ResultReceiver {
        private final android.support.v4.media.MediaBrowserCompat.ItemCallback mCallback;
        private final java.lang.String mMediaId;

        public ItemReceiver(java.lang.String r1, android.support.v4.media.MediaBrowserCompat.ItemCallback r2, android.os.Handler r3) {
                r0 = this;
                r0.<init>(r3)
                r0.mMediaId = r1
                r0.mCallback = r2
                return
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int r2, android.os.Bundle r3) {
                r1 = this;
                if (r3 == 0) goto L6
                android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r3)
            L6:
                if (r2 != 0) goto L2e
                if (r3 == 0) goto L2e
                java.lang.String r2 = "media_item"
                boolean r0 = r3.containsKey(r2)
                if (r0 != 0) goto L13
                goto L2e
            L13:
                android.os.Parcelable r2 = r3.getParcelable(r2)
                if (r2 == 0) goto L26
                boolean r3 = r2 instanceof android.support.v4.media.MediaBrowserCompat.MediaItem
                if (r3 == 0) goto L1e
                goto L26
            L1e:
                android.support.v4.media.MediaBrowserCompat$ItemCallback r2 = r1.mCallback
                java.lang.String r3 = r1.mMediaId
                r2.onError(r3)
                goto L2d
            L26:
                android.support.v4.media.MediaBrowserCompat$ItemCallback r3 = r1.mCallback
                android.support.v4.media.MediaBrowserCompat$MediaItem r2 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r2
                r3.onItemLoaded(r2)
            L2d:
                return
            L2e:
                android.support.v4.media.MediaBrowserCompat$ItemCallback r2 = r1.mCallback
                java.lang.String r3 = r1.mMediaId
                r2.onError(r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        @androidx.annotation.Nullable
        android.os.Bundle getExtras();

        void getItem(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r2);

        @androidx.annotation.Nullable
        android.os.Bundle getNotifyChildrenChangedOptions();

        @androidx.annotation.NonNull
        java.lang.String getRoot();

        android.content.ComponentName getServiceComponent();

        @androidx.annotation.NonNull
        android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r3);

        void sendCustomAction(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r3);

        void subscribe(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable android.os.Bundle r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r3);

        void unsubscribe(@androidx.annotation.NonNull java.lang.String r1, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class MediaBrowserImplApi21 implements android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl, android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl, android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal {
        public final android.media.browse.MediaBrowser mBrowserFwk;
        public android.os.Messenger mCallbacksMessenger;
        public final android.content.Context mContext;
        public final android.support.v4.media.MediaBrowserCompat.CallbackHandler mHandler;
        private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
        private android.os.Bundle mNotifyChildrenChangedOptions;
        public final android.os.Bundle mRootHints;
        public android.support.v4.media.MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
        public int mServiceVersion;
        private final androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat.Subscription> mSubscriptions;








        public MediaBrowserImplApi21(android.content.Context r3, android.content.ComponentName r4, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r5, android.os.Bundle r6) {
                r2 = this;
                r2.<init>()
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = new android.support.v4.media.MediaBrowserCompat$CallbackHandler
                r0.<init>(r2)
                r2.mHandler = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r2.mSubscriptions = r0
                r2.mContext = r3
                android.os.Bundle r0 = new android.os.Bundle
                if (r6 == 0) goto L1b
                r0.<init>(r6)
                goto L1e
            L1b:
                r0.<init>()
            L1e:
                r2.mRootHints = r0
                r6 = 1
                java.lang.String r1 = "extra_client_version"
                r0.putInt(r1, r6)
                int r6 = android.os.Process.myPid()
                java.lang.String r1 = "extra_calling_pid"
                r0.putInt(r1, r6)
                r5.setInternalConnectionCallback(r2)
                android.media.browse.MediaBrowser r6 = new android.media.browse.MediaBrowser
                android.media.browse.MediaBrowser$ConnectionCallback r5 = r5.mConnectionCallbackFwk
                r6.<init>(r3, r4, r5, r0)
                r2.mBrowserFwk = r6
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
                r1 = this;
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                r0.connect()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 == 0) goto L13
                android.os.Messenger r1 = r2.mCallbacksMessenger
                if (r1 == 0) goto L13
                r0.unregisterCallbackMessenger(r1)     // Catch: android.os.RemoteException -> Lc
                goto L13
            Lc:
                java.lang.String r0 = "MediaBrowserCompat"
                java.lang.String r1 = "Remote error unregistering client messenger."
                android.util.Log.i(r0, r1)
            L13:
                android.media.browse.MediaBrowser r0 = r2.mBrowserFwk
                r0.disconnect()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.Nullable
        public android.os.Bundle getExtras() {
                r1 = this;
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r6) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L67
                if (r6 == 0) goto L5f
                android.media.browse.MediaBrowser r0 = r4.mBrowserFwk
                boolean r0 = r0.isConnected()
                java.lang.String r1 = "MediaBrowserCompat"
                if (r0 != 0) goto L22
                java.lang.String r0 = "Not connected, unable to retrieve the MediaItem."
                android.util.Log.i(r1, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1
                r1.<init>(r4, r6, r5)
                r0.post(r1)
                return
            L22:
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r4.mServiceBinderWrapper
                if (r0 != 0) goto L31
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2
                r1.<init>(r4, r6, r5)
                r0.post(r1)
                return
            L31:
                android.support.v4.media.MediaBrowserCompat$ItemReceiver r0 = new android.support.v4.media.MediaBrowserCompat$ItemReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r2 = r4.mHandler
                r0.<init>(r5, r6, r2)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r4.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L40
                android.os.Messenger r3 = r4.mCallbacksMessenger     // Catch: android.os.RemoteException -> L40
                r2.getMediaItem(r5, r0, r3)     // Catch: android.os.RemoteException -> L40
                goto L5e
            L40:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Remote error getting media item: "
                r0.append(r2)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r1, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3
                r1.<init>(r4, r6, r5)
                r0.post(r1)
            L5e:
                return
            L5f:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "cb is null"
                r5.<init>(r6)
                throw r5
            L67:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "mediaId is empty"
                r5.<init>(r6)
                throw r5
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public android.os.Bundle getNotifyChildrenChangedOptions() {
                r1 = this;
                android.os.Bundle r0 = r1.mNotifyChildrenChangedOptions
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public java.lang.String getRoot() {
                r1 = this;
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                java.lang.String r0 = r0.getRoot()
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public android.content.ComponentName getServiceComponent() {
                r1 = this;
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                android.content.ComponentName r0 = r0.getServiceComponent()
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mMediaSessionToken
                if (r0 != 0) goto L10
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                android.media.session.MediaSession$Token r0 = r0.getSessionToken()
                android.support.v4.media.session.MediaSessionCompat$Token r0 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r0)
                r1.mMediaSessionToken = r0
            L10:
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mMediaSessionToken
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
                r1 = this;
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                boolean r0 = r0.isConnected()
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
                r5 = this;
                java.lang.String r0 = "MediaBrowserCompat"
                android.media.browse.MediaBrowser r1 = r5.mBrowserFwk     // Catch: java.lang.IllegalStateException -> L5b
                android.os.Bundle r1 = r1.getExtras()     // Catch: java.lang.IllegalStateException -> L5b
                if (r1 != 0) goto Lb
                return
            Lb:
                r2 = 0
                java.lang.String r3 = "extra_service_version"
                int r2 = r1.getInt(r3, r2)
                r5.mServiceVersion = r2
                java.lang.String r2 = "extra_messenger"
                android.os.IBinder r2 = androidx.core.app.BundleCompat.getBinder(r1, r2)
                if (r2 == 0) goto L42
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r3 = new android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper
                android.os.Bundle r4 = r5.mRootHints
                r3.<init>(r2, r4)
                r5.mServiceBinderWrapper = r3
                android.os.Messenger r2 = new android.os.Messenger
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r3 = r5.mHandler
                r2.<init>(r3)
                r5.mCallbacksMessenger = r2
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r3 = r5.mHandler
                r3.setCallbacksMessenger(r2)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r5.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L3d
                android.content.Context r3 = r5.mContext     // Catch: android.os.RemoteException -> L3d
                android.os.Messenger r4 = r5.mCallbacksMessenger     // Catch: android.os.RemoteException -> L3d
                r2.registerCallbackMessenger(r3, r4)     // Catch: android.os.RemoteException -> L3d
                goto L42
            L3d:
                java.lang.String r2 = "Remote error registering client messenger."
                android.util.Log.i(r0, r2)
            L42:
                java.lang.String r0 = "extra_session_binder"
                android.os.IBinder r0 = androidx.core.app.BundleCompat.getBinder(r1, r0)
                android.support.v4.media.session.IMediaSession r0 = android.support.v4.media.session.IMediaSession.Stub.asInterface(r0)
                if (r0 == 0) goto L5a
                android.media.browse.MediaBrowser r1 = r5.mBrowserFwk
                android.media.session.MediaSession$Token r1 = r1.getSessionToken()
                android.support.v4.media.session.MediaSessionCompat$Token r0 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r1, r0)
                r5.mMediaSessionToken = r0
            L5a:
                return
            L5b:
                r1 = move-exception
                java.lang.String r2 = "Unexpected IllegalStateException"
                android.util.Log.e(r0, r2, r1)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(android.os.Messenger r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
                r2 = this;
                r0 = 0
                r2.mServiceBinderWrapper = r0
                r2.mCallbacksMessenger = r0
                r2.mMediaSessionToken = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r2.mHandler
                r1.setCallbacksMessenger(r0)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(android.os.Messenger r2, java.lang.String r3, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5, android.os.Bundle r6) {
                r1 = this;
                android.os.Messenger r0 = r1.mCallbacksMessenger
                if (r0 == r2) goto L5
                return
            L5:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r2 = r1.mSubscriptions
                java.lang.Object r2 = r2.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r2 = (android.support.v4.media.MediaBrowserCompat.Subscription) r2
                if (r2 != 0) goto L2a
                boolean r2 = android.support.v4.media.MediaBrowserCompat.DEBUG
                if (r2 == 0) goto L29
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "onLoadChildren for id that isn't subscribed id="
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MediaBrowserCompat"
                android.util.Log.d(r3, r2)
            L29:
                return
            L2a:
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r2 = r2.getCallback(r5)
                if (r2 == 0) goto L4e
                r0 = 0
                if (r5 != 0) goto L41
                if (r4 != 0) goto L39
                r2.onError(r3)
                goto L4e
            L39:
                r1.mNotifyChildrenChangedOptions = r6
                r2.onChildrenLoaded(r3, r4)
                r1.mNotifyChildrenChangedOptions = r0
                goto L4e
            L41:
                if (r4 != 0) goto L47
                r2.onError(r3, r5)
                goto L4e
            L47:
                r1.mNotifyChildrenChangedOptions = r6
                r2.onChildrenLoaded(r3, r4, r5)
                r1.mNotifyChildrenChangedOptions = r0
            L4e:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(android.os.Messenger r1, java.lang.String r2, android.support.v4.media.session.MediaSessionCompat.Token r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@androidx.annotation.NonNull java.lang.String r5, android.os.Bundle r6, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r7) {
                r4 = this;
                boolean r0 = r4.isConnected()
                if (r0 == 0) goto L4b
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r4.mServiceBinderWrapper
                java.lang.String r1 = "MediaBrowserCompat"
                if (r0 != 0) goto L1c
                java.lang.String r0 = "The connected service doesn't support search."
                android.util.Log.i(r1, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4
                r1.<init>(r4, r7, r5, r6)
                r0.post(r1)
                return
            L1c:
                android.support.v4.media.MediaBrowserCompat$SearchResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$SearchResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r2 = r4.mHandler
                r0.<init>(r5, r6, r7, r2)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r4.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L2b
                android.os.Messenger r3 = r4.mCallbacksMessenger     // Catch: android.os.RemoteException -> L2b
                r2.search(r5, r6, r0, r3)     // Catch: android.os.RemoteException -> L2b
                goto L4a
            L2b:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Remote error searching items with query: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                android.util.Log.i(r1, r2, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5
                r1.<init>(r4, r7, r5, r6)
                r0.post(r1)
            L4a:
                return
            L4b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "search() called while not connected"
                r5.<init>(r6)
                throw r5
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@androidx.annotation.NonNull java.lang.String r5, android.os.Bundle r6, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r7) {
                r4 = this;
                boolean r0 = r4.isConnected()
                if (r0 == 0) goto L56
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r4.mServiceBinderWrapper
                java.lang.String r1 = "MediaBrowserCompat"
                if (r0 != 0) goto L1d
                java.lang.String r0 = "The connected service doesn't support sendCustomAction."
                android.util.Log.i(r1, r0)
                if (r7 == 0) goto L1d
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6 r2 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6
                r2.<init>(r4, r7, r5, r6)
                r0.post(r2)
            L1d:
                android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r2 = r4.mHandler
                r0.<init>(r5, r6, r7, r2)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r4.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L2c
                android.os.Messenger r3 = r4.mCallbacksMessenger     // Catch: android.os.RemoteException -> L2c
                r2.sendCustomAction(r5, r6, r0, r3)     // Catch: android.os.RemoteException -> L2c
                goto L55
            L2c:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Remote error sending a custom action: action="
                r2.append(r3)
                r2.append(r5)
                java.lang.String r3 = ", extras="
                r2.append(r3)
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                android.util.Log.i(r1, r2, r0)
                if (r7 == 0) goto L55
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7
                r1.<init>(r4, r7, r5, r6)
                r0.post(r1)
            L55:
                return
            L56:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot send a custom action ("
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = ") with extras "
                r0.append(r5)
                r0.append(r6)
                java.lang.String r5 = " because the browser is not connected to the service."
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r7.<init>(r5)
                throw r7
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@androidx.annotation.NonNull java.lang.String r3, android.os.Bundle r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r5) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r2.mSubscriptions
                java.lang.Object r0 = r0.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto L14
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = new android.support.v4.media.MediaBrowserCompat$Subscription
                r0.<init>()
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r1 = r2.mSubscriptions
                r1.put(r3, r0)
            L14:
                r5.setSubscription(r0)
                if (r4 != 0) goto L1b
                r4 = 0
                goto L21
            L1b:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r4)
                r4 = r1
            L21:
                r0.putCallback(r4, r5)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 != 0) goto L30
                android.media.browse.MediaBrowser r4 = r2.mBrowserFwk
                android.media.browse.MediaBrowser$SubscriptionCallback r5 = r5.mSubscriptionCallbackFwk
                r4.subscribe(r3, r5)
                goto L4e
            L30:
                android.os.IBinder r5 = r5.mToken     // Catch: android.os.RemoteException -> L38
                android.os.Messenger r1 = r2.mCallbacksMessenger     // Catch: android.os.RemoteException -> L38
                r0.addSubscription(r3, r5, r4, r1)     // Catch: android.os.RemoteException -> L38
                goto L4e
            L38:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Remote error subscribing media item: "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.String r4 = "MediaBrowserCompat"
                android.util.Log.i(r4, r3)
            L4e:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@androidx.annotation.NonNull java.lang.String r8, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r9) {
                r7 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r7.mSubscriptions
                java.lang.Object r0 = r0.get(r8)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r7.mServiceBinderWrapper
                if (r1 != 0) goto L43
                if (r9 != 0) goto L18
                android.media.browse.MediaBrowser r1 = r7.mBrowserFwk
                r1.unsubscribe(r8)
                goto L8b
            L18:
                java.util.List r1 = r0.getCallbacks()
                java.util.List r2 = r0.getOptionsList()
                int r3 = r1.size()
                int r3 = r3 + (-1)
            L26:
                if (r3 < 0) goto L37
                java.lang.Object r4 = r1.get(r3)
                if (r4 != r9) goto L34
                r1.remove(r3)
                r2.remove(r3)
            L34:
                int r3 = r3 + (-1)
                goto L26
            L37:
                int r1 = r1.size()
                if (r1 != 0) goto L8b
                android.media.browse.MediaBrowser r1 = r7.mBrowserFwk
                r1.unsubscribe(r8)
                goto L8b
            L43:
                if (r9 != 0) goto L4c
                r2 = 0
                android.os.Messenger r3 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L74
                r1.removeSubscription(r8, r2, r3)     // Catch: android.os.RemoteException -> L74
                goto L8b
            L4c:
                java.util.List r1 = r0.getCallbacks()     // Catch: android.os.RemoteException -> L74
                java.util.List r2 = r0.getOptionsList()     // Catch: android.os.RemoteException -> L74
                int r3 = r1.size()     // Catch: android.os.RemoteException -> L74
                int r3 = r3 + (-1)
            L5a:
                if (r3 < 0) goto L8b
                java.lang.Object r4 = r1.get(r3)     // Catch: android.os.RemoteException -> L74
                if (r4 != r9) goto L71
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r4 = r7.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L74
                android.os.IBinder r5 = r9.mToken     // Catch: android.os.RemoteException -> L74
                android.os.Messenger r6 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L74
                r4.removeSubscription(r8, r5, r6)     // Catch: android.os.RemoteException -> L74
                r1.remove(r3)     // Catch: android.os.RemoteException -> L74
                r2.remove(r3)     // Catch: android.os.RemoteException -> L74
            L71:
                int r3 = r3 + (-1)
                goto L5a
            L74:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "removeSubscription failed with RemoteException parentId="
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.d(r2, r1)
            L8b:
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L93
                if (r9 != 0) goto L98
            L93:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r9 = r7.mSubscriptions
                r9.remove(r8)
            L98:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static class MediaBrowserImplApi23 extends android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(android.content.Context r1, android.content.ComponentName r2, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r3) {
                r1 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r1.mServiceBinderWrapper
                if (r0 != 0) goto Lc
                android.media.browse.MediaBrowser r0 = r1.mBrowserFwk
                android.media.browse.MediaBrowser$ItemCallback r3 = r3.mItemCallbackFwk
                r0.getItem(r2, r3)
                goto Lf
            Lc:
                super.getItem(r2, r3)
            Lf:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(26)
    public static class MediaBrowserImplApi26 extends android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(android.content.Context r1, android.content.ComponentName r2, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable android.os.Bundle r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r5) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 == 0) goto Le
                int r0 = r2.mServiceVersion
                r1 = 2
                if (r0 >= r1) goto La
                goto Le
            La:
                super.subscribe(r3, r4, r5)
                goto L1f
            Le:
                if (r4 != 0) goto L18
                android.media.browse.MediaBrowser r4 = r2.mBrowserFwk
                android.media.browse.MediaBrowser$SubscriptionCallback r5 = r5.mSubscriptionCallbackFwk
                r4.subscribe(r3, r5)
                goto L1f
            L18:
                android.media.browse.MediaBrowser r0 = r2.mBrowserFwk
                android.media.browse.MediaBrowser$SubscriptionCallback r5 = r5.mSubscriptionCallbackFwk
                r0.subscribe(r3, r4, r5)
            L1f:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@androidx.annotation.NonNull java.lang.String r3, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper
                if (r0 == 0) goto Le
                int r0 = r2.mServiceVersion
                r1 = 2
                if (r0 >= r1) goto La
                goto Le
            La:
                super.unsubscribe(r3, r4)
                goto L1d
            Le:
                if (r4 != 0) goto L16
                android.media.browse.MediaBrowser r4 = r2.mBrowserFwk
                r4.unsubscribe(r3)
                goto L1d
            L16:
                android.media.browse.MediaBrowser r0 = r2.mBrowserFwk
                android.media.browse.MediaBrowser$SubscriptionCallback r4 = r4.mSubscriptionCallbackFwk
                r0.unsubscribe(r3, r4)
            L1d:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class MediaBrowserImplBase implements android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl, android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl {
        public static final int CONNECT_STATE_CONNECTED = 3;
        public static final int CONNECT_STATE_CONNECTING = 2;
        public static final int CONNECT_STATE_DISCONNECTED = 1;
        public static final int CONNECT_STATE_DISCONNECTING = 0;
        public static final int CONNECT_STATE_SUSPENDED = 4;
        public final android.support.v4.media.MediaBrowserCompat.ConnectionCallback mCallback;
        public android.os.Messenger mCallbacksMessenger;
        public final android.content.Context mContext;
        private android.os.Bundle mExtras;
        public final android.support.v4.media.MediaBrowserCompat.CallbackHandler mHandler;
        private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
        private android.os.Bundle mNotifyChildrenChangedOptions;
        public final android.os.Bundle mRootHints;
        private java.lang.String mRootId;
        public android.support.v4.media.MediaBrowserCompat.ServiceBinderWrapper mServiceBinderWrapper;
        public final android.content.ComponentName mServiceComponent;
        public android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection mServiceConnection;
        public int mState;
        private final androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat.Subscription> mSubscriptions;







        /* JADX INFO: loaded from: classes2.dex */
        public class MediaServiceConnection implements android.content.ServiceConnection {
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase this$0;



            public MediaServiceConnection(android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            private void postOrRun(java.lang.Runnable r3) {
                    r2 = this;
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r1 = r2.this$0
                    android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r1.mHandler
                    android.os.Looper r1 = r1.getLooper()
                    java.lang.Thread r1 = r1.getThread()
                    if (r0 != r1) goto L16
                    r3.run()
                    goto L1d
                L16:
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r0 = r2.this$0
                    android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r0.mHandler
                    r0.post(r3)
                L1d:
                    return
            }

            public boolean isCurrent(java.lang.String r4) {
                    r3 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r0 = r3.this$0
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r1 = r0.mServiceConnection
                    r2 = 1
                    if (r1 != r3) goto Lf
                    int r1 = r0.mState
                    if (r1 == 0) goto Lf
                    if (r1 != r2) goto Le
                    goto Lf
                Le:
                    return r2
                Lf:
                    int r0 = r0.mState
                    if (r0 == 0) goto L3f
                    if (r0 == r2) goto L3f
                    java.lang.String r0 = " for "
                    java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r4, r0)
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r0 = r3.this$0
                    android.content.ComponentName r0 = r0.mServiceComponent
                    r4.append(r0)
                    java.lang.String r0 = " with mServiceConnection="
                    r4.append(r0)
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase r0 = r3.this$0
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r0 = r0.mServiceConnection
                    r4.append(r0)
                    java.lang.String r0 = " this="
                    r4.append(r0)
                    r4.append(r3)
                    java.lang.String r4 = r4.toString()
                    java.lang.String r0 = "MediaBrowserCompat"
                    android.util.Log.i(r0, r4)
                L3f:
                    r4 = 0
                    return r4
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1
                    r0.<init>(r1, r2, r3)
                    r1.postOrRun(r0)
                    return
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(android.content.ComponentName r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2
                    r0.<init>(r1, r2)
                    r1.postOrRun(r0)
                    return
            }
        }

        public MediaBrowserImplBase(android.content.Context r2, android.content.ComponentName r3, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r4, android.os.Bundle r5) {
                r1 = this;
                r1.<init>()
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = new android.support.v4.media.MediaBrowserCompat$CallbackHandler
                r0.<init>(r1)
                r1.mHandler = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r1.mSubscriptions = r0
                r0 = 1
                r1.mState = r0
                if (r2 == 0) goto L3d
                if (r3 == 0) goto L34
                if (r4 == 0) goto L2c
                r1.mContext = r2
                r1.mServiceComponent = r3
                r1.mCallback = r4
                if (r5 != 0) goto L24
                r2 = 0
                goto L29
            L24:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>(r5)
            L29:
                r1.mRootHints = r2
                return
            L2c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "connection callback must not be null"
                r2.<init>(r3)
                throw r2
            L34:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "service component must not be null"
                r2.<init>(r3)
                throw r2
            L3d:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "context must not be null"
                r2.<init>(r3)
                throw r2
        }

        private static java.lang.String getStateLabel(int r1) {
                if (r1 == 0) goto L21
                r0 = 1
                if (r1 == r0) goto L1e
                r0 = 2
                if (r1 == r0) goto L1b
                r0 = 3
                if (r1 == r0) goto L18
                r0 = 4
                if (r1 == r0) goto L15
                java.lang.String r0 = "UNKNOWN/"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
                return r1
            L15:
                java.lang.String r1 = "CONNECT_STATE_SUSPENDED"
                return r1
            L18:
                java.lang.String r1 = "CONNECT_STATE_CONNECTED"
                return r1
            L1b:
                java.lang.String r1 = "CONNECT_STATE_CONNECTING"
                return r1
            L1e:
                java.lang.String r1 = "CONNECT_STATE_DISCONNECTED"
                return r1
            L21:
                java.lang.String r1 = "CONNECT_STATE_DISCONNECTING"
                return r1
        }

        private boolean isCurrent(android.os.Messenger r3, java.lang.String r4) {
                r2 = this;
                android.os.Messenger r0 = r2.mCallbacksMessenger
                r1 = 1
                if (r0 != r3) goto Ld
                int r3 = r2.mState
                if (r3 == 0) goto Ld
                if (r3 != r1) goto Lc
                goto Ld
            Lc:
                return r1
            Ld:
                int r3 = r2.mState
                if (r3 == 0) goto L39
                if (r3 == r1) goto L39
                java.lang.String r3 = " for "
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r4, r3)
                android.content.ComponentName r4 = r2.mServiceComponent
                r3.append(r4)
                java.lang.String r4 = " with mCallbacksMessenger="
                r3.append(r4)
                android.os.Messenger r4 = r2.mCallbacksMessenger
                r3.append(r4)
                java.lang.String r4 = " this="
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MediaBrowserCompat"
                android.util.Log.i(r4, r3)
            L39:
                r3 = 0
                return r3
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
                r4 = this;
                int r0 = r4.mState
                if (r0 == 0) goto L20
                r1 = 1
                if (r0 != r1) goto L8
                goto L20
            L8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "connect() called while neigther disconnecting nor disconnected (state="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.mState
                java.lang.String r2 = getStateLabel(r2)
                java.lang.String r3 = ")"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                r0.<init>(r1)
                throw r0
            L20:
                r0 = 2
                r4.mState = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$1
                r1.<init>(r4)
                r0.post(r1)
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
                r2 = this;
                r0 = 0
                r2.mState = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r2.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$2
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        public void dump() {
                r3 = this;
                java.lang.String r0 = "MediaBrowserCompat"
                java.lang.String r1 = "MediaBrowserCompat..."
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mServiceComponent="
                r1.append(r2)
                android.content.ComponentName r2 = r3.mServiceComponent
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mCallback="
                r1.append(r2)
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback r2 = r3.mCallback
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mRootHints="
                r1.append(r2)
                android.os.Bundle r2 = r3.mRootHints
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mState="
                r1.append(r2)
                int r2 = r3.mState
                java.lang.String r2 = getStateLabel(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mServiceConnection="
                r1.append(r2)
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r2 = r3.mServiceConnection
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mServiceBinderWrapper="
                r1.append(r2)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r3.mServiceBinderWrapper
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mCallbacksMessenger="
                r1.append(r2)
                android.os.Messenger r2 = r3.mCallbacksMessenger
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mRootId="
                r1.append(r2)
                java.lang.String r2 = r3.mRootId
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "  mMediaSessionToken="
                r1.append(r2)
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r3.mMediaSessionToken
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
                return
        }

        public void forceCloseConnection() {
                r2 = this;
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection r0 = r2.mServiceConnection
                if (r0 == 0) goto L9
                android.content.Context r1 = r2.mContext
                r1.unbindService(r0)
            L9:
                r0 = 1
                r2.mState = r0
                r0 = 0
                r2.mServiceConnection = r0
                r2.mServiceBinderWrapper = r0
                r2.mCallbacksMessenger = r0
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r2.mHandler
                r1.setCallbacksMessenger(r0)
                r2.mRootId = r0
                r2.mMediaSessionToken = r0
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.Nullable
        public android.os.Bundle getExtras() {
                r4 = this;
                boolean r0 = r4.isConnected()
                if (r0 == 0) goto L9
                android.os.Bundle r0 = r4.mExtras
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "getExtras() called while not connected (state="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.mState
                java.lang.String r2 = getStateLabel(r2)
                java.lang.String r3 = ")"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r6) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L56
                if (r6 == 0) goto L4e
                boolean r0 = r4.isConnected()
                java.lang.String r1 = "MediaBrowserCompat"
                if (r0 != 0) goto L20
                java.lang.String r0 = "Not connected, unable to retrieve the MediaItem."
                android.util.Log.i(r1, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3
                r1.<init>(r4, r6, r5)
                r0.post(r1)
                return
            L20:
                android.support.v4.media.MediaBrowserCompat$ItemReceiver r0 = new android.support.v4.media.MediaBrowserCompat$ItemReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r2 = r4.mHandler
                r0.<init>(r5, r6, r2)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r4.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L2f
                android.os.Messenger r3 = r4.mCallbacksMessenger     // Catch: android.os.RemoteException -> L2f
                r2.getMediaItem(r5, r0, r3)     // Catch: android.os.RemoteException -> L2f
                goto L4d
            L2f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Remote error getting media item: "
                r0.append(r2)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r1, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r4.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4
                r1.<init>(r4, r6, r5)
                r0.post(r1)
            L4d:
                return
            L4e:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "cb is null"
                r5.<init>(r6)
                throw r5
            L56:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "mediaId is empty"
                r5.<init>(r6)
                throw r5
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public android.os.Bundle getNotifyChildrenChangedOptions() {
                r1 = this;
                android.os.Bundle r0 = r1.mNotifyChildrenChangedOptions
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public java.lang.String getRoot() {
                r4 = this;
                boolean r0 = r4.isConnected()
                if (r0 == 0) goto L9
                java.lang.String r0 = r4.mRootId
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "getRoot() called while not connected(state="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.mState
                java.lang.String r2 = getStateLabel(r2)
                java.lang.String r3 = ")"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public android.content.ComponentName getServiceComponent() {
                r4 = this;
                boolean r0 = r4.isConnected()
                if (r0 == 0) goto L9
                android.content.ComponentName r0 = r4.mServiceComponent
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "getServiceComponent() called while not connected (state="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.mState
                java.lang.String r3 = ")"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @androidx.annotation.NonNull
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
                r4 = this;
                boolean r0 = r4.isConnected()
                if (r0 == 0) goto L9
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r4.mMediaSessionToken
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "getSessionToken() called while not connected(state="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.mState
                java.lang.String r3 = ")"
                java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
                r2 = this;
                int r0 = r2.mState
                r1 = 3
                if (r0 != r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(android.os.Messenger r3) {
                r2 = this;
                java.lang.String r0 = "onConnectFailed for "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                android.content.ComponentName r1 = r2.mServiceComponent
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MediaBrowserCompat"
                android.util.Log.e(r1, r0)
                java.lang.String r0 = "onConnectFailed"
                boolean r3 = r2.isCurrent(r3, r0)
                if (r3 != 0) goto L1d
                return
            L1d:
                int r3 = r2.mState
                r0 = 2
                if (r3 == r0) goto L3e
                java.lang.String r3 = "onConnect from service while mState="
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                int r0 = r2.mState
                java.lang.String r0 = getStateLabel(r0)
                r3.append(r0)
                java.lang.String r0 = "... ignoring"
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r1, r3)
                return
            L3e:
                r2.forceCloseConnection()
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback r3 = r2.mCallback
                r3.onConnectionFailed()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(android.os.Messenger r4, java.lang.String r5, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r6, android.os.Bundle r7, android.os.Bundle r8) {
                r3 = this;
                java.lang.String r0 = "onLoadChildren"
                boolean r4 = r3.isCurrent(r4, r0)
                if (r4 != 0) goto L9
                return
            L9:
                boolean r4 = android.support.v4.media.MediaBrowserCompat.DEBUG
                java.lang.String r0 = "MediaBrowserCompat"
                if (r4 == 0) goto L29
                java.lang.String r1 = "onLoadChildren for "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                android.content.ComponentName r2 = r3.mServiceComponent
                r1.append(r2)
                java.lang.String r2 = " id="
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L29:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r1 = r3.mSubscriptions
                java.lang.Object r1 = r1.get(r5)
                android.support.v4.media.MediaBrowserCompat$Subscription r1 = (android.support.v4.media.MediaBrowserCompat.Subscription) r1
                if (r1 != 0) goto L4a
                if (r4 == 0) goto L49
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "onLoadChildren for id that isn't subscribed id="
                r4.append(r6)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.d(r0, r4)
            L49:
                return
            L4a:
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r4 = r1.getCallback(r7)
                if (r4 == 0) goto L6e
                r0 = 0
                if (r7 != 0) goto L61
                if (r6 != 0) goto L59
                r4.onError(r5)
                goto L6e
            L59:
                r3.mNotifyChildrenChangedOptions = r8
                r4.onChildrenLoaded(r5, r6)
                r3.mNotifyChildrenChangedOptions = r0
                goto L6e
            L61:
                if (r6 != 0) goto L67
                r4.onError(r5, r7)
                goto L6e
            L67:
                r3.mNotifyChildrenChangedOptions = r8
                r4.onChildrenLoaded(r5, r6, r7)
                r3.mNotifyChildrenChangedOptions = r0
            L6e:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(android.os.Messenger r7, java.lang.String r8, android.support.v4.media.session.MediaSessionCompat.Token r9, android.os.Bundle r10) {
                r6 = this;
                java.lang.String r0 = "onConnect"
                boolean r7 = r6.isCurrent(r7, r0)
                if (r7 != 0) goto L9
                return
            L9:
                int r7 = r6.mState
                r0 = 2
                java.lang.String r1 = "MediaBrowserCompat"
                if (r7 == r0) goto L2c
                java.lang.String r7 = "onConnect from service while mState="
                java.lang.StringBuilder r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
                int r8 = r6.mState
                java.lang.String r8 = getStateLabel(r8)
                r7.append(r8)
                java.lang.String r8 = "... ignoring"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.util.Log.w(r1, r7)
                return
            L2c:
                r6.mRootId = r8
                r6.mMediaSessionToken = r9
                r6.mExtras = r10
                r7 = 3
                r6.mState = r7
                boolean r7 = android.support.v4.media.MediaBrowserCompat.DEBUG
                if (r7 == 0) goto L41
                java.lang.String r7 = "ServiceCallbacks.onConnect..."
                android.util.Log.d(r1, r7)
                r6.dump()
            L41:
                android.support.v4.media.MediaBrowserCompat$ConnectionCallback r7 = r6.mCallback
                r7.onConnected()
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r7 = r6.mSubscriptions     // Catch: android.os.RemoteException -> L8f
                java.util.Set r7 = r7.entrySet()     // Catch: android.os.RemoteException -> L8f
                java.util.Iterator r7 = r7.iterator()     // Catch: android.os.RemoteException -> L8f
            L50:
                boolean r8 = r7.hasNext()     // Catch: android.os.RemoteException -> L8f
                if (r8 == 0) goto L94
                java.lang.Object r8 = r7.next()     // Catch: android.os.RemoteException -> L8f
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: android.os.RemoteException -> L8f
                java.lang.Object r9 = r8.getKey()     // Catch: android.os.RemoteException -> L8f
                java.lang.String r9 = (java.lang.String) r9     // Catch: android.os.RemoteException -> L8f
                java.lang.Object r8 = r8.getValue()     // Catch: android.os.RemoteException -> L8f
                android.support.v4.media.MediaBrowserCompat$Subscription r8 = (android.support.v4.media.MediaBrowserCompat.Subscription) r8     // Catch: android.os.RemoteException -> L8f
                java.util.List r10 = r8.getCallbacks()     // Catch: android.os.RemoteException -> L8f
                java.util.List r8 = r8.getOptionsList()     // Catch: android.os.RemoteException -> L8f
                r0 = 0
            L71:
                int r2 = r10.size()     // Catch: android.os.RemoteException -> L8f
                if (r0 >= r2) goto L50
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r2 = r6.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L8f
                java.lang.Object r3 = r10.get(r0)     // Catch: android.os.RemoteException -> L8f
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r3 = (android.support.v4.media.MediaBrowserCompat.SubscriptionCallback) r3     // Catch: android.os.RemoteException -> L8f
                android.os.IBinder r3 = r3.mToken     // Catch: android.os.RemoteException -> L8f
                java.lang.Object r4 = r8.get(r0)     // Catch: android.os.RemoteException -> L8f
                android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: android.os.RemoteException -> L8f
                android.os.Messenger r5 = r6.mCallbacksMessenger     // Catch: android.os.RemoteException -> L8f
                r2.addSubscription(r9, r3, r4, r5)     // Catch: android.os.RemoteException -> L8f
                int r0 = r0 + 1
                goto L71
            L8f:
                java.lang.String r7 = "addSubscription failed with RemoteException."
                android.util.Log.d(r1, r7)
            L94:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(@androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r6) {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L37
                android.support.v4.media.MediaBrowserCompat$SearchResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$SearchResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r6, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L15
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L15
                r1.search(r4, r5, r0, r2)     // Catch: android.os.RemoteException -> L15
                goto L36
            L15:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Remote error searching items with query: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.i(r2, r1, r0)
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
            L36:
                return
            L37:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "search() called while not connected (state="
                java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
                int r6 = r3.mState
                java.lang.String r6 = getStateLabel(r6)
                java.lang.String r0 = ")"
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r6, r0)
                r4.<init>(r5)
                throw r4
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(@androidx.annotation.NonNull java.lang.String r4, android.os.Bundle r5, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r6) {
                r3 = this;
                boolean r0 = r3.isConnected()
                if (r0 == 0) goto L41
                android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver r0 = new android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r1 = r3.mHandler
                r0.<init>(r4, r5, r6, r1)
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r3.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L15
                android.os.Messenger r2 = r3.mCallbacksMessenger     // Catch: android.os.RemoteException -> L15
                r1.sendCustomAction(r4, r5, r0, r2)     // Catch: android.os.RemoteException -> L15
                goto L40
            L15:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Remote error sending a custom action: action="
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ", extras="
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.i(r2, r1, r0)
                if (r6 == 0) goto L40
                android.support.v4.media.MediaBrowserCompat$CallbackHandler r0 = r3.mHandler
                android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6 r1 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6
                r1.<init>(r3, r6, r4, r5)
                r0.post(r1)
            L40:
                return
            L41:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot send a custom action ("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ") with extras "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = " because the browser is not connected to the service."
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r6.<init>(r4)
                throw r6
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(@androidx.annotation.NonNull java.lang.String r3, android.os.Bundle r4, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r5) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r2.mSubscriptions
                java.lang.Object r0 = r0.get(r3)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto L14
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = new android.support.v4.media.MediaBrowserCompat$Subscription
                r0.<init>()
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r1 = r2.mSubscriptions
                r1.put(r3, r0)
            L14:
                if (r4 != 0) goto L18
                r4 = 0
                goto L1e
            L18:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>(r4)
                r4 = r1
            L1e:
                r0.putCallback(r4, r5)
                boolean r0 = r2.isConnected()
                if (r0 == 0) goto L47
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r0 = r2.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L31
                android.os.IBinder r5 = r5.mToken     // Catch: android.os.RemoteException -> L31
                android.os.Messenger r1 = r2.mCallbacksMessenger     // Catch: android.os.RemoteException -> L31
                r0.addSubscription(r3, r5, r4, r1)     // Catch: android.os.RemoteException -> L31
                goto L47
            L31:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "addSubscription failed with RemoteException parentId="
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.String r4 = "MediaBrowserCompat"
                android.util.Log.d(r4, r3)
            L47:
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(@androidx.annotation.NonNull java.lang.String r8, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r9) {
                r7 = this;
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r7.mSubscriptions
                java.lang.Object r0 = r0.get(r8)
                android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                if (r9 != 0) goto L1c
                boolean r1 = r7.isConnected()     // Catch: android.os.RemoteException -> L4a
                if (r1 == 0) goto L61
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r1 = r7.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L4a
                r2 = 0
                android.os.Messenger r3 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L4a
                r1.removeSubscription(r8, r2, r3)     // Catch: android.os.RemoteException -> L4a
                goto L61
            L1c:
                java.util.List r1 = r0.getCallbacks()     // Catch: android.os.RemoteException -> L4a
                java.util.List r2 = r0.getOptionsList()     // Catch: android.os.RemoteException -> L4a
                int r3 = r1.size()     // Catch: android.os.RemoteException -> L4a
                int r3 = r3 + (-1)
            L2a:
                if (r3 < 0) goto L61
                java.lang.Object r4 = r1.get(r3)     // Catch: android.os.RemoteException -> L4a
                if (r4 != r9) goto L47
                boolean r4 = r7.isConnected()     // Catch: android.os.RemoteException -> L4a
                if (r4 == 0) goto L41
                android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper r4 = r7.mServiceBinderWrapper     // Catch: android.os.RemoteException -> L4a
                android.os.IBinder r5 = r9.mToken     // Catch: android.os.RemoteException -> L4a
                android.os.Messenger r6 = r7.mCallbacksMessenger     // Catch: android.os.RemoteException -> L4a
                r4.removeSubscription(r8, r5, r6)     // Catch: android.os.RemoteException -> L4a
            L41:
                r1.remove(r3)     // Catch: android.os.RemoteException -> L4a
                r2.remove(r3)     // Catch: android.os.RemoteException -> L4a
            L47:
                int r3 = r3 + (-1)
                goto L2a
            L4a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "removeSubscription failed with RemoteException parentId="
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaBrowserCompat"
                android.util.Log.d(r2, r1)
            L61:
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L69
                if (r9 != 0) goto L6e
            L69:
                androidx.collection.ArrayMap<java.lang.String, android.support.v4.media.MediaBrowserCompat$Subscription> r9 = r7.mSubscriptions
                r9.remove(r8)
            L6e:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(android.os.Messenger r1);

        void onLoadChildren(android.os.Messenger r1, java.lang.String r2, java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r3, android.os.Bundle r4, android.os.Bundle r5);

        void onServiceConnected(android.os.Messenger r1, java.lang.String r2, android.support.v4.media.session.MediaSessionCompat.Token r3, android.os.Bundle r4);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @android.annotation.SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.MediaBrowserCompat.MediaItem> CREATOR = null;
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final android.support.v4.media.MediaDescriptionCompat mDescription;
        private final int mFlags;


        static {
                android.support.v4.media.MediaBrowserCompat$MediaItem$1 r0 = new android.support.v4.media.MediaBrowserCompat$MediaItem$1
                r0.<init>()
                android.support.v4.media.MediaBrowserCompat.MediaItem.CREATOR = r0
                return
        }

        public MediaItem(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.mFlags = r0
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = (android.support.v4.media.MediaDescriptionCompat) r2
                r1.mDescription = r2
                return
        }

        public MediaItem(@androidx.annotation.NonNull android.support.v4.media.MediaDescriptionCompat r2, int r3) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L1c
                java.lang.String r0 = r2.getMediaId()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L14
                r1.mFlags = r3
                r1.mDescription = r2
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "description must have a non-empty media id"
                r2.<init>(r3)
                throw r2
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "description cannot be null"
                r2.<init>(r3)
                throw r2
        }

        public static android.support.v4.media.MediaBrowserCompat.MediaItem fromMediaItem(java.lang.Object r2) {
                if (r2 == 0) goto L16
                android.media.browse.MediaBrowser$MediaItem r2 = (android.media.browse.MediaBrowser.MediaItem) r2
                int r0 = android.support.v4.media.MediaBrowserCompat.Api21Impl.getFlags(r2)
                android.media.MediaDescription r2 = android.support.v4.media.MediaBrowserCompat.Api21Impl.getDescription(r2)
                android.support.v4.media.MediaDescriptionCompat r2 = android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(r2)
                android.support.v4.media.MediaBrowserCompat$MediaItem r1 = new android.support.v4.media.MediaBrowserCompat$MediaItem
                r1.<init>(r2, r0)
                return r1
            L16:
                r2 = 0
                return r2
        }

        public static java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> fromMediaItemList(java.util.List<?> r2) {
                if (r2 == 0) goto L22
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.size()
                r0.<init>(r1)
                java.util.Iterator r2 = r2.iterator()
            Lf:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r2.next()
                android.support.v4.media.MediaBrowserCompat$MediaItem r1 = fromMediaItem(r1)
                r0.add(r1)
                goto Lf
            L21:
                return r0
            L22:
                r2 = 0
                return r2
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        public android.support.v4.media.MediaDescriptionCompat getDescription() {
                r1 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                return r0
        }

        public int getFlags() {
                r1 = this;
                int r0 = r1.mFlags
                return r0
        }

        @androidx.annotation.Nullable
        public java.lang.String getMediaId() {
                r1 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                java.lang.String r0 = r0.getMediaId()
                return r0
        }

        public boolean isBrowsable() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public boolean isPlayable() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "MediaItem{"
                r0.<init>(r1)
                java.lang.String r1 = "mFlags="
                r0.append(r1)
                int r1 = r2.mFlags
                r0.append(r1)
                java.lang.String r1 = ", mDescription="
                r0.append(r1)
                android.support.v4.media.MediaDescriptionCompat r1 = r2.mDescription
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r0 = r1.mFlags
                r2.writeInt(r0)
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                r0.writeToParcel(r2, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class SearchCallback {
        public SearchCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onSearchResult(@androidx.annotation.NonNull java.lang.String r1, android.os.Bundle r2, @androidx.annotation.NonNull java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r3) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SearchResultReceiver extends android.support.v4.os.ResultReceiver {
        private final android.support.v4.media.MediaBrowserCompat.SearchCallback mCallback;
        private final android.os.Bundle mExtras;
        private final java.lang.String mQuery;

        public SearchResultReceiver(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.MediaBrowserCompat.SearchCallback r3, android.os.Handler r4) {
                r0 = this;
                r0.<init>(r4)
                r0.mQuery = r1
                r0.mExtras = r2
                r0.mCallback = r3
                return
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int r4, android.os.Bundle r5) {
                r3 = this;
                if (r5 == 0) goto L6
                android.os.Bundle r5 = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r5)
            L6:
                if (r4 != 0) goto L42
                if (r5 == 0) goto L42
                java.lang.String r4 = "search_results"
                boolean r0 = r5.containsKey(r4)
                if (r0 != 0) goto L14
                goto L42
            L14:
                android.os.Parcelable[] r4 = r5.getParcelableArray(r4)
                if (r4 == 0) goto L38
                java.util.ArrayList r5 = new java.util.ArrayList
                int r0 = r4.length
                r5.<init>(r0)
                int r0 = r4.length
                r1 = 0
            L22:
                if (r1 >= r0) goto L2e
                r2 = r4[r1]
                android.support.v4.media.MediaBrowserCompat$MediaItem r2 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r2
                r5.add(r2)
                int r1 = r1 + 1
                goto L22
            L2e:
                android.support.v4.media.MediaBrowserCompat$SearchCallback r4 = r3.mCallback
                java.lang.String r0 = r3.mQuery
                android.os.Bundle r1 = r3.mExtras
                r4.onSearchResult(r0, r1, r5)
                goto L41
            L38:
                android.support.v4.media.MediaBrowserCompat$SearchCallback r4 = r3.mCallback
                java.lang.String r5 = r3.mQuery
                android.os.Bundle r0 = r3.mExtras
                r4.onError(r5, r0)
            L41:
                return
            L42:
                android.support.v4.media.MediaBrowserCompat$SearchCallback r4 = r3.mCallback
                java.lang.String r5 = r3.mQuery
                android.os.Bundle r0 = r3.mExtras
                r4.onError(r5, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ServiceBinderWrapper {
        private android.os.Messenger mMessenger;
        private android.os.Bundle mRootHints;

        public ServiceBinderWrapper(android.os.IBinder r2, android.os.Bundle r3) {
                r1 = this;
                r1.<init>()
                android.os.Messenger r0 = new android.os.Messenger
                r0.<init>(r2)
                r1.mMessenger = r0
                r1.mRootHints = r3
                return
        }

        private void sendRequest(int r2, android.os.Bundle r3, android.os.Messenger r4) throws android.os.RemoteException {
                r1 = this;
                android.os.Message r0 = android.os.Message.obtain()
                r0.what = r2
                r2 = 1
                r0.arg1 = r2
                r0.setData(r3)
                r0.replyTo = r4
                android.os.Messenger r2 = r1.mMessenger
                r2.send(r0)
                return
        }

        public void addSubscription(java.lang.String r3, android.os.IBinder r4, android.os.Bundle r5, android.os.Messenger r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_callback_token"
                androidx.core.app.BundleCompat.putBinder(r0, r3, r4)
                java.lang.String r3 = "data_options"
                r0.putBundle(r3, r5)
                r3 = 3
                r2.sendRequest(r3, r0, r6)
                return
        }

        public void connect(android.content.Context r3, android.os.Messenger r4) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = r3.getPackageName()
                java.lang.String r1 = "data_package_name"
                r0.putString(r1, r3)
                int r3 = android.os.Process.myPid()
                java.lang.String r1 = "data_calling_pid"
                r0.putInt(r1, r3)
                android.os.Bundle r3 = r2.mRootHints
                java.lang.String r1 = "data_root_hints"
                r0.putBundle(r1, r3)
                r3 = 1
                r2.sendRequest(r3, r0, r4)
                return
        }

        public void disconnect(android.os.Messenger r3) throws android.os.RemoteException {
                r2 = this;
                r0 = 2
                r1 = 0
                r2.sendRequest(r0, r1, r3)
                return
        }

        public void getMediaItem(java.lang.String r3, android.support.v4.os.ResultReceiver r4, android.os.Messenger r5) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_result_receiver"
                r0.putParcelable(r3, r4)
                r3 = 5
                r2.sendRequest(r3, r0, r5)
                return
        }

        public void registerCallbackMessenger(android.content.Context r3, android.os.Messenger r4) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = r3.getPackageName()
                java.lang.String r1 = "data_package_name"
                r0.putString(r1, r3)
                int r3 = android.os.Process.myPid()
                java.lang.String r1 = "data_calling_pid"
                r0.putInt(r1, r3)
                android.os.Bundle r3 = r2.mRootHints
                java.lang.String r1 = "data_root_hints"
                r0.putBundle(r1, r3)
                r3 = 6
                r2.sendRequest(r3, r0, r4)
                return
        }

        public void removeSubscription(java.lang.String r3, android.os.IBinder r4, android.os.Messenger r5) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_media_item_id"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_callback_token"
                androidx.core.app.BundleCompat.putBinder(r0, r3, r4)
                r3 = 4
                r2.sendRequest(r3, r0, r5)
                return
        }

        public void search(java.lang.String r3, android.os.Bundle r4, android.support.v4.os.ResultReceiver r5, android.os.Messenger r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_search_query"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_search_extras"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "data_result_receiver"
                r0.putParcelable(r3, r5)
                r3 = 8
                r2.sendRequest(r3, r0, r6)
                return
        }

        public void sendCustomAction(java.lang.String r3, android.os.Bundle r4, android.support.v4.os.ResultReceiver r5, android.os.Messenger r6) throws android.os.RemoteException {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "data_custom_action"
                r0.putString(r1, r3)
                java.lang.String r3 = "data_custom_action_extras"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "data_result_receiver"
                r0.putParcelable(r3, r5)
                r3 = 9
                r2.sendRequest(r3, r0, r6)
                return
        }

        public void unregisterCallbackMessenger(android.os.Messenger r3) throws android.os.RemoteException {
                r2 = this;
                r0 = 7
                r1 = 0
                r2.sendRequest(r0, r1, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Subscription {
        private final java.util.List<android.support.v4.media.MediaBrowserCompat.SubscriptionCallback> mCallbacks;
        private final java.util.List<android.os.Bundle> mOptionsList;

        public Subscription() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCallbacks = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mOptionsList = r0
                return
        }

        public android.support.v4.media.MediaBrowserCompat.SubscriptionCallback getCallback(android.os.Bundle r3) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                int r1 = r1.size()
                if (r0 >= r1) goto L23
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                java.lang.Object r1 = r1.get(r0)
                android.os.Bundle r1 = (android.os.Bundle) r1
                boolean r1 = androidx.media.MediaBrowserCompatUtils.areSameOptions(r1, r3)
                if (r1 == 0) goto L20
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r3 = r2.mCallbacks
                java.lang.Object r3 = r3.get(r0)
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r3 = (android.support.v4.media.MediaBrowserCompat.SubscriptionCallback) r3
                return r3
            L20:
                int r0 = r0 + 1
                goto L1
            L23:
                r3 = 0
                return r3
        }

        public java.util.List<android.support.v4.media.MediaBrowserCompat.SubscriptionCallback> getCallbacks() {
                r1 = this;
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r0 = r1.mCallbacks
                return r0
        }

        public java.util.List<android.os.Bundle> getOptionsList() {
                r1 = this;
                java.util.List<android.os.Bundle> r0 = r1.mOptionsList
                return r0
        }

        public boolean isEmpty() {
                r1 = this;
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r0 = r1.mCallbacks
                boolean r0 = r0.isEmpty()
                return r0
        }

        public void putCallback(android.os.Bundle r3, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                int r1 = r1.size()
                if (r0 >= r1) goto L20
                java.util.List<android.os.Bundle> r1 = r2.mOptionsList
                java.lang.Object r1 = r1.get(r0)
                android.os.Bundle r1 = (android.os.Bundle) r1
                boolean r1 = androidx.media.MediaBrowserCompatUtils.areSameOptions(r1, r3)
                if (r1 == 0) goto L1d
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r3 = r2.mCallbacks
                r3.set(r0, r4)
                return
            L1d:
                int r0 = r0 + 1
                goto L1
            L20:
                java.util.List<android.support.v4.media.MediaBrowserCompat$SubscriptionCallback> r0 = r2.mCallbacks
                r0.add(r4)
                java.util.List<android.os.Bundle> r4 = r2.mOptionsList
                r4.add(r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class SubscriptionCallback {
        public final android.media.browse.MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
        public java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat.Subscription> mSubscriptionRef;
        public final android.os.IBinder mToken;

        /* JADX INFO: loaded from: classes2.dex */
        @androidx.annotation.RequiresApi(21)
        public class SubscriptionCallbackApi21 extends android.media.browse.MediaBrowser.SubscriptionCallback {
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.SubscriptionCallback this$0;

            public SubscriptionCallbackApi21(android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            public java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> applyOptions(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4, android.os.Bundle r5) {
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

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r7, java.util.List<android.media.browse.MediaBrowser.MediaItem> r8) {
                    r6 = this;
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r6.this$0
                    java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$Subscription> r0 = r0.mSubscriptionRef
                    if (r0 != 0) goto L8
                    r0 = 0
                    goto Le
                L8:
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.MediaBrowserCompat$Subscription r0 = (android.support.v4.media.MediaBrowserCompat.Subscription) r0
                Le:
                    if (r0 != 0) goto L1a
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r6.this$0
                    java.util.List r8 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItemList(r8)
                    r0.onChildrenLoaded(r7, r8)
                    goto L47
                L1a:
                    java.util.List r8 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItemList(r8)
                    java.util.List r1 = r0.getCallbacks()
                    java.util.List r0 = r0.getOptionsList()
                    r2 = 0
                L27:
                    int r3 = r1.size()
                    if (r2 >= r3) goto L47
                    java.lang.Object r3 = r0.get(r2)
                    android.os.Bundle r3 = (android.os.Bundle) r3
                    if (r3 != 0) goto L3b
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r3 = r6.this$0
                    r3.onChildrenLoaded(r7, r8)
                    goto L44
                L3b:
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r4 = r6.this$0
                    java.util.List r5 = r6.applyOptions(r8, r3)
                    r4.onChildrenLoaded(r7, r5, r3)
                L44:
                    int r2 = r2 + 1
                    goto L27
                L47:
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@androidx.annotation.NonNull java.lang.String r2) {
                    r1 = this;
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r1.this$0
                    r0.onError(r2)
                    return
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        @androidx.annotation.RequiresApi(26)
        public class SubscriptionCallbackApi26 extends android.support.v4.media.MediaBrowserCompat.SubscriptionCallback.SubscriptionCallbackApi21 {
            public final /* synthetic */ android.support.v4.media.MediaBrowserCompat.SubscriptionCallback this$0;

            public SubscriptionCallbackApi26(android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.util.List<android.media.browse.MediaBrowser.MediaItem> r3, @androidx.annotation.NonNull android.os.Bundle r4) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r4)
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r1.this$0
                    java.util.List r3 = android.support.v4.media.MediaBrowserCompat.MediaItem.fromMediaItemList(r3)
                    r0.onChildrenLoaded(r2, r3, r4)
                    return
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                    android.support.v4.media.MediaBrowserCompat$SubscriptionCallback r0 = r1.this$0
                    r0.onError(r2, r3)
                    return
            }
        }

        public SubscriptionCallback() {
                r2 = this;
                r2.<init>()
                android.os.Binder r0 = new android.os.Binder
                r0.<init>()
                r2.mToken = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L18
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26 r0 = new android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26
                r0.<init>(r2)
                r2.mSubscriptionCallbackFwk = r0
                goto L1f
            L18:
                android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21 r0 = new android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21
                r0.<init>(r2)
                r2.mSubscriptionCallbackFwk = r0
            L1f:
                return
        }

        public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2) {
                r0 = this;
                return
        }

        public void onChildrenLoaded(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r2, @androidx.annotation.NonNull android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                return
        }

        public void onError(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void setSubscription(android.support.v4.media.MediaBrowserCompat.Subscription r2) {
                r1 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mSubscriptionRef = r0
                return
        }
    }

    static {
            java.lang.String r0 = "MediaBrowserCompat"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            android.support.v4.media.MediaBrowserCompat.DEBUG = r0
            return
    }

    public MediaBrowserCompat(android.content.Context r3, android.content.ComponentName r4, android.support.v4.media.MediaBrowserCompat.ConnectionCallback r5, android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L11
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            goto L24
        L11:
            r1 = 23
            if (r0 < r1) goto L1d
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            goto L24
        L1d:
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21 r0 = new android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
        L24:
            return
    }

    public void connect() {
            r2 = this;
            java.lang.String r0 = "MediaBrowserCompat"
            java.lang.String r1 = "Connecting to a MediaBrowserService."
            android.util.Log.d(r0, r1)
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r2.mImpl
            r0.connect()
            return
    }

    public void disconnect() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.disconnect()
            return
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getExtras() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public void getItem(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.ItemCallback r3) {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.getItem(r2, r3)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.os.Bundle getNotifyChildrenChangedOptions() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getNotifyChildrenChangedOptions()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getRoot() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            java.lang.String r0 = r0.getRoot()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.ComponentName getServiceComponent() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.content.ComponentName r0 = r0.getServiceComponent()
            return r0
    }

    @androidx.annotation.NonNull
    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.getSessionToken()
            return r0
    }

    public boolean isConnected() {
            r1 = this;
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            boolean r0 = r0.isConnected()
            return r0
    }

    public void search(@androidx.annotation.NonNull java.lang.String r2, android.os.Bundle r3, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SearchCallback r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            if (r4 == 0) goto Le
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.search(r2, r3, r4)
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback cannot be null"
            r2.<init>(r3)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "query cannot be empty"
            r2.<init>(r3)
            throw r2
    }

    public void sendCustomAction(@androidx.annotation.NonNull java.lang.String r2, android.os.Bundle r3, @androidx.annotation.Nullable android.support.v4.media.MediaBrowserCompat.CustomActionCallback r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.sendCustomAction(r2, r3, r4)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "action cannot be empty"
            r2.<init>(r3)
            throw r2
    }

    public void subscribe(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.os.Bundle r3, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L20
            if (r4 == 0) goto L18
            if (r3 == 0) goto L10
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.subscribe(r2, r3, r4)
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "options are null"
            r2.<init>(r3)
            throw r2
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback is null"
            r2.<init>(r3)
            throw r2
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId is empty"
            r2.<init>(r3)
            throw r2
    }

    public void subscribe(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L17
            if (r4 == 0) goto Lf
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r2.mImpl
            r1 = 0
            r0.subscribe(r3, r1, r4)
            return
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "callback is null"
            r3.<init>(r4)
            throw r3
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "parentId is empty"
            r3.<init>(r4)
            throw r3
    }

    public void unsubscribe(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Ld
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r2.mImpl
            r1 = 0
            r0.unsubscribe(r3, r1)
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "parentId is empty"
            r3.<init>(r0)
            throw r3
    }

    public void unsubscribe(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            if (r3 == 0) goto Le
            android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl r0 = r1.mImpl
            r0.unsubscribe(r2, r3)
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback is null"
            r2.<init>(r3)
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parentId is empty"
            r2.<init>(r3)
            throw r2
    }
}
