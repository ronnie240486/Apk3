package io.realm;

/* JADX INFO: loaded from: classes.dex */
final class RealmCache {
    private static final java.lang.String ASYNC_CALLBACK_NULL_MSG = "The callback cannot be null.";
    private static final java.lang.String ASYNC_NOT_ALLOWED_MSG = "Realm instances cannot be loaded asynchronously on a non-looper thread.";
    private static final java.lang.String DIFFERENT_KEY_MESSAGE = "Wrong key used to decrypt Realm.";
    private static final java.lang.String WRONG_REALM_CLASS_MESSAGE = "The type of Realm class must be Realm or DynamicRealm.";
    private static final java.util.List<java.lang.ref.WeakReference<io.realm.RealmCache>> cachesList = null;
    private static final java.util.Collection<io.realm.RealmCache> leakedCaches = null;
    private io.realm.RealmConfiguration configuration;
    private final java.util.concurrent.atomic.AtomicBoolean isLeaked;
    private final java.util.Set<java.lang.String> pendingRealmFileCreation;
    private final java.lang.String realmPath;
    private final java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache.RealmCacheType, io.realm.internal.OsSharedRealm.VersionID>, io.realm.RealmCache.ReferenceCounter> refAndCountMap;


    public interface Callback {
        void onResult(int r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Callback0 {
        void onCall();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CreateRealmRunnable<T extends io.realm.BaseRealm> implements java.lang.Runnable {
        private final io.realm.BaseRealm.InstanceCallback<T> callback;
        private final java.util.concurrent.CountDownLatch canReleaseBackgroundInstanceLatch;
        private final io.realm.RealmConfiguration configuration;
        private java.util.concurrent.Future future;
        private final io.realm.internal.RealmNotifier notifier;
        private final java.lang.Class<T> realmClass;



        public CreateRealmRunnable(io.realm.internal.RealmNotifier r3, io.realm.RealmConfiguration r4, io.realm.BaseRealm.InstanceCallback<T> r5, java.lang.Class<T> r6) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.canReleaseBackgroundInstanceLatch = r0
                r2.configuration = r4
                r2.realmClass = r6
                r2.callback = r5
                r2.notifier = r3
                return
        }

        public static /* synthetic */ java.util.concurrent.Future access$100(io.realm.RealmCache.CreateRealmRunnable r0) {
                java.util.concurrent.Future r0 = r0.future
                return r0
        }

        public static /* synthetic */ java.util.concurrent.CountDownLatch access$200(io.realm.RealmCache.CreateRealmRunnable r0) {
                java.util.concurrent.CountDownLatch r0 = r0.canReleaseBackgroundInstanceLatch
                return r0
        }

        public static /* synthetic */ io.realm.RealmConfiguration access$300(io.realm.RealmCache.CreateRealmRunnable r0) {
                io.realm.RealmConfiguration r0 = r0.configuration
                return r0
        }

        public static /* synthetic */ java.lang.Class access$400(io.realm.RealmCache.CreateRealmRunnable r0) {
                java.lang.Class<T extends io.realm.BaseRealm> r0 = r0.realmClass
                return r0
        }

        public static /* synthetic */ io.realm.BaseRealm.InstanceCallback access$500(io.realm.RealmCache.CreateRealmRunnable r0) {
                io.realm.BaseRealm$InstanceCallback<T extends io.realm.BaseRealm> r0 = r0.callback
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                r0 = 0
                r1 = 0
                io.realm.RealmConfiguration r2 = r6.configuration     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                java.lang.Class<T extends io.realm.BaseRealm> r3 = r6.realmClass     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                io.realm.BaseRealm r1 = io.realm.RealmCache.createRealmOrGetFromCache(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                io.realm.internal.RealmNotifier r2 = r6.notifier     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                io.realm.RealmCache$CreateRealmRunnable$1 r3 = new io.realm.RealmCache$CreateRealmRunnable$1     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                r3.<init>(r6)     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                boolean r2 = r2.post(r3)     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                if (r2 != 0) goto L1c
                java.util.concurrent.CountDownLatch r2 = r6.canReleaseBackgroundInstanceLatch     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                r2.countDown()     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
            L1c:
                java.util.concurrent.CountDownLatch r2 = r6.canReleaseBackgroundInstanceLatch     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                r3 = 2
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                boolean r2 = r2.await(r3, r5)     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                if (r2 != 0) goto L2f
                java.lang.String r2 = "Timeout for creating Realm instance in foreground thread in `CreateRealmRunnable` "
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
                io.realm.log.RealmLog.warn(r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.InterruptedException -> L51
            L2f:
                if (r1 == 0) goto L5e
                goto L5b
            L32:
                r2 = move-exception
                io.realm.internal.ObjectServerFacade r3 = io.realm.internal.ObjectServerFacade.getSyncFacadeIfPossible()     // Catch: java.lang.Throwable -> L5f
                boolean r3 = r3.wasDownloadInterrupted(r2)     // Catch: java.lang.Throwable -> L5f
                if (r3 != 0) goto L4e
                java.lang.String r3 = "`CreateRealmRunnable` failed."
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L5f
                io.realm.log.RealmLog.error(r2, r3, r0)     // Catch: java.lang.Throwable -> L5f
                io.realm.internal.RealmNotifier r0 = r6.notifier     // Catch: java.lang.Throwable -> L5f
                io.realm.RealmCache$CreateRealmRunnable$2 r3 = new io.realm.RealmCache$CreateRealmRunnable$2     // Catch: java.lang.Throwable -> L5f
                r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L5f
                r0.post(r3)     // Catch: java.lang.Throwable -> L5f
            L4e:
                if (r1 == 0) goto L5e
                goto L5b
            L51:
                r2 = move-exception
                java.lang.String r3 = "`CreateRealmRunnable` has been interrupted."
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L5f
                io.realm.log.RealmLog.warn(r2, r3, r0)     // Catch: java.lang.Throwable -> L5f
                if (r1 == 0) goto L5e
            L5b:
                r1.close()
            L5e:
                return
            L5f:
                r0 = move-exception
                if (r1 == 0) goto L65
                r1.close()
            L65:
                throw r0
        }

        public void setFuture(java.util.concurrent.Future r1) {
                r0 = this;
                r0.future = r1
                return
        }
    }

    public static class GlobalReferenceCounter extends io.realm.RealmCache.ReferenceCounter {
        private io.realm.BaseRealm cachedRealm;

        private GlobalReferenceCounter() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public /* synthetic */ GlobalReferenceCounter(io.realm.RealmCache.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void clearThreadLocalCache() {
                r4 = this;
                io.realm.BaseRealm r0 = r4.cachedRealm
                java.lang.String r0 = r0.getPath()
                java.lang.ThreadLocal<java.lang.Integer> r1 = r4.localCount
                r2 = 0
                r1.set(r2)
                r4.cachedRealm = r2
                java.util.concurrent.atomic.AtomicInteger r1 = r4.globalCount
                int r1 = r1.decrementAndGet()
                if (r1 < 0) goto L17
                return
            L17:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Global reference counter of Realm"
                java.lang.String r3 = " not be negative."
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0, r3)
                r1.<init>(r0)
                throw r1
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public final io.realm.BaseRealm getRealmInstance() {
                r1 = this;
                io.realm.BaseRealm r0 = r1.cachedRealm
                return r0
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public final int getThreadLocalCount() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.globalCount
                int r0 = r0.get()
                return r0
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public final boolean hasInstanceAvailableForThread() {
                r1 = this;
                io.realm.BaseRealm r0 = r1.cachedRealm
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public final void onRealmCreated(io.realm.BaseRealm r2) {
                r1 = this;
                r1.cachedRealm = r2
                java.lang.ThreadLocal<java.lang.Integer> r2 = r1.localCount
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.set(r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.globalCount
                r2.incrementAndGet()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum RealmCacheType extends java.lang.Enum<io.realm.RealmCache.RealmCacheType> {
        private static final /* synthetic */ io.realm.RealmCache.RealmCacheType[] $VALUES = null;
        public static final io.realm.RealmCache.RealmCacheType DYNAMIC_REALM = null;
        public static final io.realm.RealmCache.RealmCacheType TYPED_REALM = null;

        static {
                io.realm.RealmCache$RealmCacheType r0 = new io.realm.RealmCache$RealmCacheType
                java.lang.String r1 = "TYPED_REALM"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.RealmCache.RealmCacheType.TYPED_REALM = r0
                io.realm.RealmCache$RealmCacheType r1 = new io.realm.RealmCache$RealmCacheType
                java.lang.String r3 = "DYNAMIC_REALM"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.RealmCache.RealmCacheType.DYNAMIC_REALM = r1
                r3 = 2
                io.realm.RealmCache$RealmCacheType[] r3 = new io.realm.RealmCache.RealmCacheType[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.realm.RealmCache.RealmCacheType.$VALUES = r3
                return
        }

        private RealmCacheType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.RealmCache.RealmCacheType valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.RealmCache$RealmCacheType> r0 = io.realm.RealmCache.RealmCacheType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.RealmCache$RealmCacheType r1 = (io.realm.RealmCache.RealmCacheType) r1
                return r1
        }

        public static io.realm.RealmCache.RealmCacheType[] values() {
                io.realm.RealmCache$RealmCacheType[] r0 = io.realm.RealmCache.RealmCacheType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.RealmCache$RealmCacheType[] r0 = (io.realm.RealmCache.RealmCacheType[]) r0
                return r0
        }
    }

    public static abstract class ReferenceCounter {
        public java.util.concurrent.atomic.AtomicInteger globalCount;
        public final java.lang.ThreadLocal<java.lang.Integer> localCount;

        private ReferenceCounter() {
                r2 = this;
                r2.<init>()
                java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
                r0.<init>()
                r2.localCount = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.globalCount = r0
                return
        }

        public /* synthetic */ ReferenceCounter(io.realm.RealmCache.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void clearThreadLocalCache();

        public int getGlobalCount() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.globalCount
                int r0 = r0.get()
                return r0
        }

        public abstract io.realm.BaseRealm getRealmInstance();

        public abstract int getThreadLocalCount();

        public abstract boolean hasInstanceAvailableForThread();

        public void incrementThreadCount(int r3) {
                r2 = this;
                java.lang.ThreadLocal<java.lang.Integer> r0 = r2.localCount
                java.lang.Object r0 = r0.get()
                java.lang.Integer r0 = (java.lang.Integer) r0
                java.lang.ThreadLocal<java.lang.Integer> r1 = r2.localCount
                if (r0 == 0) goto L11
                int r0 = r0.intValue()
                int r3 = r3 + r0
            L11:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.set(r3)
                return
        }

        public abstract void onRealmCreated(io.realm.BaseRealm r1);

        public void setThreadCount(int r2) {
                r1 = this;
                java.lang.ThreadLocal<java.lang.Integer> r0 = r1.localCount
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.set(r2)
                return
        }
    }

    public static class ThreadConfinedReferenceCounter extends io.realm.RealmCache.ReferenceCounter {
        private final java.lang.ThreadLocal<io.realm.BaseRealm> localRealm;

        private ThreadConfinedReferenceCounter() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
                r0.<init>()
                r1.localRealm = r0
                return
        }

        public /* synthetic */ ThreadConfinedReferenceCounter(io.realm.RealmCache.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void clearThreadLocalCache() {
                r4 = this;
                java.lang.ThreadLocal<io.realm.BaseRealm> r0 = r4.localRealm
                java.lang.Object r0 = r0.get()
                io.realm.BaseRealm r0 = (io.realm.BaseRealm) r0
                java.lang.String r0 = r0.getPath()
                java.lang.ThreadLocal<java.lang.Integer> r1 = r4.localCount
                r2 = 0
                r1.set(r2)
                java.lang.ThreadLocal<io.realm.BaseRealm> r1 = r4.localRealm
                r1.set(r2)
                java.util.concurrent.atomic.AtomicInteger r1 = r4.globalCount
                int r1 = r1.decrementAndGet()
                if (r1 < 0) goto L20
                return
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Global reference counter of Realm"
                java.lang.String r3 = " can not be negative."
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0, r3)
                r1.<init>(r0)
                throw r1
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public io.realm.BaseRealm getRealmInstance() {
                r1 = this;
                java.lang.ThreadLocal<io.realm.BaseRealm> r0 = r1.localRealm
                java.lang.Object r0 = r0.get()
                io.realm.BaseRealm r0 = (io.realm.BaseRealm) r0
                return r0
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public int getThreadLocalCount() {
                r1 = this;
                java.lang.ThreadLocal<java.lang.Integer> r0 = r1.localCount
                java.lang.Object r0 = r0.get()
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto Lf
                int r0 = r0.intValue()
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public boolean hasInstanceAvailableForThread() {
                r1 = this;
                java.lang.ThreadLocal<io.realm.BaseRealm> r0 = r1.localRealm
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void onRealmCreated(io.realm.BaseRealm r2) {
                r1 = this;
                java.lang.ThreadLocal<io.realm.BaseRealm> r0 = r1.localRealm
                r0.set(r2)
                java.lang.ThreadLocal<java.lang.Integer> r2 = r1.localCount
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.set(r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.globalCount
                r2.incrementAndGet()
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            io.realm.RealmCache.cachesList = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            io.realm.RealmCache.leakedCaches = r0
            return
    }

    private RealmCache(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.refAndCountMap = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.isLeaked = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.pendingRealmFileCreation = r0
            r2.realmPath = r3
            return
    }

    public static /* synthetic */ void access$800(java.lang.String r0, java.io.File r1) {
            copyFileIfNeeded(r0, r1)
            return
    }

    private static void copyAssetFileIfNeeded(io.realm.RealmConfiguration r4) {
            boolean r0 = r4.hasAssetFile()
            if (r0 == 0) goto L14
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getRealmDirectory()
            java.lang.String r2 = r4.getRealmFileName()
            r0.<init>(r1, r2)
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 0
            io.realm.internal.ObjectServerFacade r1 = io.realm.internal.ObjectServerFacade.getFacade(r1)
            java.lang.String r1 = r1.getSyncServerCertificateAssetName(r4)
            boolean r2 = io.realm.internal.Util.isEmptyString(r1)
            r2 = r2 ^ 1
            if (r0 != 0) goto L28
            if (r2 == 0) goto L30
        L28:
            io.realm.RealmCache$1 r3 = new io.realm.RealmCache$1
            r3.<init>(r0, r4, r2, r1)
            io.realm.internal.OsObjectStore.callWithLock(r4, r3)
        L30:
            return
    }

    private static void copyFileIfNeeded(java.lang.String r6, java.io.File r7) {
            boolean r0 = r7.exists()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            android.content.Context r1 = io.realm.BaseRealm.applicationContext     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            java.io.InputStream r1 = r1.open(r6)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            if (r1 == 0) goto L4d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
        L1d:
            int r3 = r1.read(r7)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r4 = -1
            if (r3 <= r4) goto L29
            r4 = 0
            r2.write(r7, r4, r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            goto L1d
        L29:
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r6 = move-exception
            if (r0 != 0) goto L36
            r0 = r6
        L36:
            if (r0 != 0) goto L39
            return
        L39:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r7 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r6.<init>(r7, r0)
            throw r6
        L41:
            r6 = move-exception
            goto L47
        L43:
            r7 = move-exception
            goto L4b
        L45:
            r6 = move-exception
            r2 = r0
        L47:
            r0 = r1
            goto L85
        L49:
            r7 = move-exception
            r2 = r0
        L4b:
            r0 = r1
            goto L6b
        L4d:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r3.append(r6)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            throw r7     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
        L66:
            r6 = move-exception
            r2 = r0
            goto L85
        L69:
            r7 = move-exception
            r2 = r0
        L6b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L84
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L84
            r4.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r6 = move-exception
        L85:
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.io.IOException -> L8b
            goto L8c
        L8b:
        L8c:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L91
        L91:
            throw r6
    }

    private <E extends io.realm.BaseRealm> void createInstance(java.lang.Class<E> r2, io.realm.RealmCache.ReferenceCounter r3, io.realm.internal.OsSharedRealm.VersionID r4) {
            r1 = this;
            java.lang.Class<io.realm.Realm> r0 = io.realm.Realm.class
            if (r2 != r0) goto L10
            io.realm.Realm r2 = io.realm.Realm.createInstance(r1, r4)
            io.realm.RealmSchema r4 = r2.getSchema()
            r4.createKeyPathMapping()
            goto L18
        L10:
            java.lang.Class<io.realm.DynamicRealm> r0 = io.realm.DynamicRealm.class
            if (r2 != r0) goto L1c
            io.realm.DynamicRealm r2 = io.realm.DynamicRealm.createInstance(r1, r4)
        L18:
            r3.onRealmCreated(r2)
            return
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The type of Realm class must be Realm or DynamicRealm."
            r2.<init>(r3)
            throw r2
    }

    public static <E extends io.realm.BaseRealm> E createRealmOrGetFromCache(io.realm.RealmConfiguration r2, java.lang.Class<E> r3) {
            java.lang.String r0 = r2.getPath()
            r1 = 1
            io.realm.RealmCache r0 = getCache(r0, r1)
            io.realm.internal.OsSharedRealm$VersionID r1 = io.realm.internal.OsSharedRealm.VersionID.LIVE
            io.realm.BaseRealm r2 = r0.doCreateRealmOrGetFromCache(r2, r3, r1)
            return r2
    }

    public static <E extends io.realm.BaseRealm> E createRealmOrGetFromCache(io.realm.RealmConfiguration r2, java.lang.Class<E> r3, io.realm.internal.OsSharedRealm.VersionID r4) {
            java.lang.String r0 = r2.getPath()
            r1 = 1
            io.realm.RealmCache r0 = getCache(r0, r1)
            io.realm.BaseRealm r2 = r0.doCreateRealmOrGetFromCache(r2, r3, r4)
            return r2
    }

    public static <T extends io.realm.BaseRealm> io.realm.RealmAsyncTask createRealmOrGetFromCacheAsync(io.realm.RealmConfiguration r2, io.realm.BaseRealm.InstanceCallback<T> r3, java.lang.Class<T> r4) {
            java.lang.String r0 = r2.getPath()
            r1 = 1
            io.realm.RealmCache r0 = getCache(r0, r1)
            io.realm.RealmAsyncTask r2 = r0.doCreateRealmOrGetFromCacheAsync(r2, r3, r4)
            return r2
    }

    private synchronized <E extends io.realm.BaseRealm> E doCreateRealmOrGetFromCache(io.realm.RealmConfiguration r5, java.lang.Class<E> r6, io.realm.internal.OsSharedRealm.VersionID r7) {
            r4 = this;
            monitor-enter(r4)
            io.realm.RealmCache$ReferenceCounter r0 = r4.getRefCounter(r6, r7)     // Catch: java.lang.Throwable -> L48
            int r1 = r4.getTotalGlobalRefCount()     // Catch: java.lang.Throwable -> L48
            r2 = 1
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L1b
            copyAssetFileIfNeeded(r5)     // Catch: java.lang.Throwable -> L48
            boolean r3 = r5.realmExists()     // Catch: java.lang.Throwable -> L48
            r4.configuration = r5     // Catch: java.lang.Throwable -> L48
            goto L1e
        L1b:
            r4.validateConfiguration(r5)     // Catch: java.lang.Throwable -> L48
        L1e:
            boolean r3 = r0.hasInstanceAvailableForThread()     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L27
            r4.createInstance(r6, r0, r7)     // Catch: java.lang.Throwable -> L48
        L27:
            r0.incrementThreadCount(r2)     // Catch: java.lang.Throwable -> L48
            io.realm.BaseRealm r6 = r0.getRealmInstance()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L46
            io.realm.internal.ObjectServerFacade r7 = io.realm.internal.ObjectServerFacade.getSyncFacadeIfPossible()     // Catch: java.lang.Throwable -> L48
            io.realm.internal.OsSharedRealm r0 = r6.sharedRealm     // Catch: java.lang.Throwable -> L48
            io.realm.Realm r0 = io.realm.Realm.createInstance(r0)     // Catch: java.lang.Throwable -> L48
            r7.downloadInitialFlexibleSyncData(r0, r5)     // Catch: java.lang.Throwable -> L48
            boolean r5 = r5.isReadOnly()     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L46
            r6.refresh()     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r4)
            return r6
        L48:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private synchronized <T extends io.realm.BaseRealm> io.realm.RealmAsyncTask doCreateRealmOrGetFromCacheAsync(io.realm.RealmConfiguration r5, io.realm.BaseRealm.InstanceCallback<T> r6, java.lang.Class<T> r7) {
            r4 = this;
            monitor-enter(r4)
            io.realm.internal.android.AndroidCapabilities r0 = new io.realm.internal.android.AndroidCapabilities     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "Realm instances cannot be loaded asynchronously on a non-looper thread."
            r0.checkCanDeliverNotification(r1)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L32
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L3a
            io.realm.RealmCache$CreateRealmRunnable r1 = new io.realm.RealmCache$CreateRealmRunnable     // Catch: java.lang.Throwable -> L3a
            io.realm.internal.android.AndroidRealmNotifier r2 = new io.realm.internal.android.AndroidRealmNotifier     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r2, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            io.realm.internal.async.RealmThreadPoolExecutor r6 = io.realm.BaseRealm.asyncTaskExecutor     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.Future r7 = r6.submitTransaction(r1)     // Catch: java.lang.Throwable -> L3a
            r1.setFuture(r7)     // Catch: java.lang.Throwable -> L3a
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.getSyncFacadeIfPossible()     // Catch: java.lang.Throwable -> L3a
            r0.createNativeSyncSession(r5)     // Catch: java.lang.Throwable -> L3a
            io.realm.internal.async.RealmAsyncTaskImpl r5 = new io.realm.internal.async.RealmAsyncTaskImpl     // Catch: java.lang.Throwable -> L3a
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)
            return r5
        L32:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = "The callback cannot be null."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r5     // Catch: java.lang.Throwable -> L3a
        L3a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private synchronized void doInvokeWithGlobalRefCount(io.realm.RealmCache.Callback r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.getTotalGlobalRefCount()     // Catch: java.lang.Throwable -> La
            r2.onResult(r0)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private static io.realm.RealmCache getCache(java.lang.String r5, boolean r6) {
            java.util.List<java.lang.ref.WeakReference<io.realm.RealmCache>> r0 = io.realm.RealmCache.cachesList
            monitor-enter(r0)
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
            r2 = 0
        L8:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3f
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L3f
            io.realm.RealmCache r3 = (io.realm.RealmCache) r3     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L20
            r1.remove()     // Catch: java.lang.Throwable -> L3f
            goto L8
        L20:
            java.lang.String r4 = r3.realmPath     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L8
            r2 = r3
            goto L8
        L2a:
            if (r2 != 0) goto L3d
            if (r6 == 0) goto L3d
            io.realm.RealmCache r2 = new io.realm.RealmCache     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3f
            java.util.List<java.lang.ref.WeakReference<io.realm.RealmCache>> r5 = io.realm.RealmCache.cachesList     // Catch: java.lang.Throwable -> L3f
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L3f
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r5.add(r6)     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r2
        L3f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
    }

    public static int getLocalThreadCount(io.realm.RealmConfiguration r2) {
            java.lang.String r2 = r2.getPath()
            r0 = 0
            io.realm.RealmCache r2 = getCache(r2, r0)
            if (r2 != 0) goto Lc
            return r0
        Lc:
            java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache$RealmCacheType, io.realm.internal.OsSharedRealm$VersionID>, io.realm.RealmCache$ReferenceCounter> r2 = r2.refAndCountMap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            io.realm.RealmCache$ReferenceCounter r1 = (io.realm.RealmCache.ReferenceCounter) r1
            int r1 = r1.getThreadLocalCount()
            int r0 = r0 + r1
            goto L16
        L28:
            return r0
    }

    private <E extends io.realm.BaseRealm> io.realm.RealmCache.ReferenceCounter getRefCounter(java.lang.Class<E> r2, io.realm.internal.OsSharedRealm.VersionID r3) {
            r1 = this;
            io.realm.RealmCache$RealmCacheType r0 = io.realm.RealmCache.RealmCacheType.TYPED_REALM
            java.lang.Class<io.realm.Realm> r0 = io.realm.Realm.class
            if (r2 != r0) goto L9
            io.realm.RealmCache$RealmCacheType r2 = io.realm.RealmCache.RealmCacheType.TYPED_REALM
            goto Lf
        L9:
            java.lang.Class<io.realm.DynamicRealm> r0 = io.realm.DynamicRealm.class
            if (r2 != r0) goto L38
            io.realm.RealmCache$RealmCacheType r2 = io.realm.RealmCache.RealmCacheType.DYNAMIC_REALM
        Lf:
            io.realm.internal.util.Pair r0 = new io.realm.internal.util.Pair
            r0.<init>(r2, r3)
            java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache$RealmCacheType, io.realm.internal.OsSharedRealm$VersionID>, io.realm.RealmCache$ReferenceCounter> r2 = r1.refAndCountMap
            java.lang.Object r2 = r2.get(r0)
            io.realm.RealmCache$ReferenceCounter r2 = (io.realm.RealmCache.ReferenceCounter) r2
            if (r2 != 0) goto L37
            io.realm.internal.OsSharedRealm$VersionID r2 = io.realm.internal.OsSharedRealm.VersionID.LIVE
            boolean r2 = r3.equals(r2)
            r3 = 0
            if (r2 == 0) goto L2d
            io.realm.RealmCache$ThreadConfinedReferenceCounter r2 = new io.realm.RealmCache$ThreadConfinedReferenceCounter
            r2.<init>(r3)
            goto L32
        L2d:
            io.realm.RealmCache$GlobalReferenceCounter r2 = new io.realm.RealmCache$GlobalReferenceCounter
            r2.<init>(r3)
        L32:
            java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache$RealmCacheType, io.realm.internal.OsSharedRealm$VersionID>, io.realm.RealmCache$ReferenceCounter> r3 = r1.refAndCountMap
            r3.put(r0, r2)
        L37:
            return r2
        L38:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The type of Realm class must be Realm or DynamicRealm."
            r2.<init>(r3)
            throw r2
    }

    private int getTotalGlobalRefCount() {
            r3 = this;
            java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache$RealmCacheType, io.realm.internal.OsSharedRealm$VersionID>, io.realm.RealmCache$ReferenceCounter> r0 = r3.refAndCountMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            io.realm.RealmCache$ReferenceCounter r2 = (io.realm.RealmCache.ReferenceCounter) r2
            int r2 = r2.getGlobalCount()
            int r1 = r1 + r2
            goto Lb
        L1d:
            return r1
    }

    private int getTotalLiveRealmGlobalRefCount() {
            r4 = this;
            java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache$RealmCacheType, io.realm.internal.OsSharedRealm$VersionID>, io.realm.RealmCache$ReferenceCounter> r0 = r4.refAndCountMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r0.next()
            io.realm.RealmCache$ReferenceCounter r2 = (io.realm.RealmCache.ReferenceCounter) r2
            boolean r3 = r2 instanceof io.realm.RealmCache.ThreadConfinedReferenceCounter
            if (r3 == 0) goto Lb
            int r2 = r2.getGlobalCount()
            int r1 = r1 + r2
            goto Lb
        L21:
            return r1
    }

    public static void invokeWithGlobalRefCount(io.realm.RealmConfiguration r2, io.realm.RealmCache.Callback r3) {
            java.util.List<java.lang.ref.WeakReference<io.realm.RealmCache>> r0 = io.realm.RealmCache.cachesList
            monitor-enter(r0)
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            io.realm.RealmCache r2 = getCache(r2, r1)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L13
            r3.onResult(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L13:
            r2.doInvokeWithGlobalRefCount(r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    private void validateConfiguration(io.realm.RealmConfiguration r5) {
            r4 = this;
            io.realm.RealmConfiguration r0 = r4.configuration
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L9
            return
        L9:
            io.realm.RealmConfiguration r0 = r4.configuration
            byte[] r0 = r0.getEncryptionKey()
            byte[] r1 = r5.getEncryptionKey()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L77
            io.realm.RealmMigration r0 = r5.getMigration()
            io.realm.RealmConfiguration r1 = r4.configuration
            io.realm.RealmMigration r1 = r1.getMigration()
            if (r1 == 0) goto L5a
            if (r0 == 0) goto L5a
            java.lang.Class r2 = r1.getClass()
            java.lang.Class r3 = r0.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            io.realm.RealmMigration r5 = r5.getMigration()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Configurations cannot be different if used to open the same file. \nCached configuration: \n"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            io.realm.RealmConfiguration r2 = r4.configuration
            r1.append(r2)
            java.lang.String r2 = "\n\nNew configuration: \n"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L77:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong key used to decrypt Realm."
            r5.<init>(r0)
            throw r5
    }

    public io.realm.RealmConfiguration getConfiguration() {
            r1 = this;
            io.realm.RealmConfiguration r0 = r1.configuration
            return r0
    }

    public final void leak() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isLeaked
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto Le
            java.util.Collection<io.realm.RealmCache> r0 = io.realm.RealmCache.leakedCaches
            r0.add(r2)
        Le:
            return
    }

    public final synchronized void release(io.realm.BaseRealm r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r5.getPath()     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r5.isFrozen()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L16
            io.realm.internal.OsSharedRealm r2 = r5.sharedRealm     // Catch: java.lang.Throwable -> L8b
            io.realm.internal.OsSharedRealm$VersionID r2 = r2.getVersionID()     // Catch: java.lang.Throwable -> L8b
            goto L18
        L16:
            io.realm.internal.OsSharedRealm$VersionID r2 = io.realm.internal.OsSharedRealm.VersionID.LIVE     // Catch: java.lang.Throwable -> L8b
        L18:
            io.realm.RealmCache$ReferenceCounter r1 = r4.getRefCounter(r1, r2)     // Catch: java.lang.Throwable -> L8b
            int r2 = r1.getThreadLocalCount()     // Catch: java.lang.Throwable -> L8b
            r3 = 0
            if (r2 > 0) goto L36
            java.lang.String r5 = "%s has been closed already. refCount is %s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8b
            r1[r3] = r0     // Catch: java.lang.Throwable -> L8b
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L8b
            r1[r0] = r2     // Catch: java.lang.Throwable -> L8b
            io.realm.log.RealmLog.warn(r5, r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r4)
            return
        L36:
            int r2 = r2 + (-1)
            if (r2 != 0) goto L86
            r1.clearThreadLocalCache()     // Catch: java.lang.Throwable -> L8b
            r5.doClose()     // Catch: java.lang.Throwable -> L8b
            int r0 = r4.getTotalLiveRealmGlobalRefCount()     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L89
            r0 = 0
            r4.configuration = r0     // Catch: java.lang.Throwable -> L8b
            java.util.Map<io.realm.internal.util.Pair<io.realm.RealmCache$RealmCacheType, io.realm.internal.OsSharedRealm$VersionID>, io.realm.RealmCache$ReferenceCounter> r0 = r4.refAndCountMap     // Catch: java.lang.Throwable -> L8b
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8b
        L53:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L8b
            io.realm.RealmCache$ReferenceCounter r1 = (io.realm.RealmCache.ReferenceCounter) r1     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r1 instanceof io.realm.RealmCache.GlobalReferenceCounter     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L53
            io.realm.BaseRealm r1 = r1.getRealmInstance()     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L53
        L69:
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L53
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L69
        L73:
            io.realm.RealmConfiguration r0 = r5.getConfiguration()     // Catch: java.lang.Throwable -> L8b
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L8b
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.getFacade(r3)     // Catch: java.lang.Throwable -> L8b
            io.realm.RealmConfiguration r5 = r5.getConfiguration()     // Catch: java.lang.Throwable -> L8b
            r0.realmClosed(r5)     // Catch: java.lang.Throwable -> L8b
            goto L89
        L86:
            r1.setThreadCount(r2)     // Catch: java.lang.Throwable -> L8b
        L89:
            monitor-exit(r4)
            return
        L8b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
