package io.realm.internal.objectstore;

/* JADX INFO: loaded from: classes3.dex */
public class OsSubscriptionSet implements io.realm.internal.NativeObject, io.realm.mongodb.sync.SubscriptionSet {
    public static final byte STATE_VALUE_BOOTSTRAPPING = 2;
    public static final byte STATE_VALUE_COMPLETE = 3;
    public static final byte STATE_VALUE_ERROR = 4;
    public static final byte STATE_VALUE_PENDING = 1;
    public static final byte STATE_VALUE_SUPERSEDED = 5;
    public static final byte STATE_VALUE_UNCOMMITTED = 0;
    private static final long nativeFinalizerPtr = 0;
    private android.os.Handler mainHandler;
    private long nativePtr;
    public final io.realm.internal.RealmProxyMediator schema;
    private final io.realm.internal.async.RealmThreadPoolExecutor stateListenerExecutor;
    private final io.realm.internal.async.RealmThreadPoolExecutor updateExecutor;





    /* JADX INFO: loaded from: classes2.dex */
    public interface StateChangeCallback {
        void onChange(byte r1);
    }

    static {
            long r0 = nativeGetFinalizerMethodPtr()
            io.realm.internal.objectstore.OsSubscriptionSet.nativeFinalizerPtr = r0
            return
    }

    public OsSubscriptionSet(long r3, io.realm.internal.RealmProxyMediator r5, io.realm.internal.async.RealmThreadPoolExecutor r6, io.realm.internal.async.RealmThreadPoolExecutor r7) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mainHandler = r0
            r2.nativePtr = r3
            r2.schema = r5
            r2.stateListenerExecutor = r6
            r2.updateExecutor = r7
            return
    }

    public static /* synthetic */ android.os.Handler access$000(io.realm.internal.objectstore.OsSubscriptionSet r0) {
            android.os.Handler r0 = r0.mainHandler
            return r0
    }

    public static /* synthetic */ long access$100(io.realm.internal.objectstore.OsSubscriptionSet r2) {
            long r0 = r2.nativePtr
            return r0
    }

    public static /* synthetic */ long access$200(long r0, int r2) {
            long r0 = nativeSubscriptionAt(r0, r2)
            return r0
    }

    private static native long nativeCreateMutableSubscriptionSet(long r0);

    private static native java.lang.String nativeErrorMessage(long r0);

    private static native long nativeFindByName(long r0, java.lang.String r2);

    private static native long nativeFindByQuery(long r0, long r2);

    private static native long nativeGetFinalizerMethodPtr();

    private static native void nativeRefresh(long r0);

    private static native void nativeRelease(long r0);

    private static native long nativeSize(long r0);

    private static native byte nativeState(long r0);

    private static native long nativeSubscriptionAt(long r0, int r2);

    private static native void nativeWaitForSynchronization(long r0, io.realm.internal.objectstore.OsSubscriptionSet.StateChangeCallback r2);

    @javax.annotation.Nullable
    public io.realm.mongodb.sync.Subscription find(io.realm.RealmQuery r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r2 = r5.getQueryPointer()
            long r0 = nativeFindByQuery(r0, r2)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L16
            io.realm.internal.objectstore.OsSubscription r5 = new io.realm.internal.objectstore.OsSubscription
            r5.<init>(r0)
            return r5
        L16:
            r5 = 0
            return r5
    }

    @javax.annotation.Nullable
    public io.realm.mongodb.sync.Subscription find(java.lang.String r5) {
            r4 = this;
            long r0 = r4.nativePtr
            long r0 = nativeFindByName(r0, r5)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L12
            io.realm.internal.objectstore.OsSubscription r5 = new io.realm.internal.objectstore.OsSubscription
            r5.<init>(r0)
            return r5
        L12:
            r5 = 0
            return r5
    }

    public java.lang.String getErrorMessage() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeErrorMessage(r0)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.objectstore.OsSubscriptionSet.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.mongodb.sync.SubscriptionSet$State getState() {
            r2 = this;
            long r0 = r2.nativePtr
            byte r0 = nativeState(r0)
            long r0 = (long) r0
            io.realm.mongodb.sync.SubscriptionSet$State r0 = io.realm.mongodb.sync.SubscriptionSet$State.fromNativeValue(r0)
            return r0
    }

    public java.util.Iterator<io.realm.mongodb.sync.Subscription> iterator() {
            r1 = this;
            io.realm.internal.objectstore.OsSubscriptionSet$4 r0 = new io.realm.internal.objectstore.OsSubscriptionSet$4
            r0.<init>(r1)
            return r0
    }

    public void refresh() {
            r2 = this;
            long r0 = r2.nativePtr
            nativeRefresh(r0)
            return
    }

    public int size() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeSize(r0)
            int r1 = (int) r0
            return r1
    }

    public io.realm.mongodb.sync.SubscriptionSet update(io.realm.mongodb.sync.SubscriptionSet$UpdateCallback r8) {
            r7 = this;
            io.realm.internal.objectstore.OsMutableSubscriptionSet r6 = new io.realm.internal.objectstore.OsMutableSubscriptionSet
            long r0 = r7.nativePtr
            long r1 = nativeCreateMutableSubscriptionSet(r0)
            io.realm.internal.RealmProxyMediator r3 = r7.schema
            io.realm.internal.async.RealmThreadPoolExecutor r4 = r7.stateListenerExecutor
            io.realm.internal.async.RealmThreadPoolExecutor r5 = r7.updateExecutor
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            r8.update(r6)
            long r0 = r6.commit()
            long r2 = r7.nativePtr
            r7.nativePtr = r0
            nativeRelease(r2)
            return r7
    }

    public io.realm.RealmAsyncTask updateAsync(io.realm.mongodb.sync.SubscriptionSet$UpdateAsyncCallback r3) {
            r2 = this;
            io.realm.internal.async.RealmThreadPoolExecutor r0 = r2.updateExecutor
            io.realm.internal.objectstore.OsSubscriptionSet$3 r1 = new io.realm.internal.objectstore.OsSubscriptionSet$3
            r1.<init>(r2, r3)
            java.util.concurrent.Future r3 = r0.submit(r1)
            io.realm.internal.async.RealmAsyncTaskImpl r0 = new io.realm.internal.async.RealmAsyncTaskImpl
            io.realm.internal.async.RealmThreadPoolExecutor r1 = r2.updateExecutor
            r0.<init>(r3, r1)
            return r0
    }

    public boolean waitForSynchronization() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            boolean r0 = r2.waitForSynchronization(r0, r1)
            return r0
    }

    public boolean waitForSynchronization(java.lang.Long r6, java.util.concurrent.TimeUnit r7) {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            long r2 = r5.nativePtr
            io.realm.internal.objectstore.OsSubscriptionSet$1 r4 = new io.realm.internal.objectstore.OsSubscriptionSet$1
            r4.<init>(r1, r0)
            nativeWaitForSynchronization(r2, r4)
            long r2 = r6.longValue()     // Catch: java.lang.InterruptedException -> L30
            boolean r6 = r0.await(r2, r7)     // Catch: java.lang.InterruptedException -> L30
            if (r6 == 0) goto L28
            r5.refresh()
            boolean r6 = r1.get()
            return r6
        L28:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L30
            java.lang.String r7 = "Waiting for waitForSynchronization() timed out."
            r6.<init>(r7)     // Catch: java.lang.InterruptedException -> L30
            throw r6     // Catch: java.lang.InterruptedException -> L30
        L30:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Waiting for waitForSynchronization() was interrupted."
            r6.<init>(r7)
            throw r6
    }

    public io.realm.RealmAsyncTask waitForSynchronizationAsync(io.realm.mongodb.sync.SubscriptionSet$StateChangeCallback r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            io.realm.RealmAsyncTask r3 = r2.waitForSynchronizationAsync(r0, r1, r3)
            return r3
    }

    public io.realm.RealmAsyncTask waitForSynchronizationAsync(java.lang.Long r3, java.util.concurrent.TimeUnit r4, io.realm.mongodb.sync.SubscriptionSet$StateChangeCallback r5) {
            r2 = this;
            io.realm.internal.async.RealmThreadPoolExecutor r0 = r2.stateListenerExecutor
            io.realm.internal.objectstore.OsSubscriptionSet$2 r1 = new io.realm.internal.objectstore.OsSubscriptionSet$2
            r1.<init>(r2, r3, r4, r5)
            java.util.concurrent.Future r3 = r0.submit(r1)
            io.realm.internal.async.RealmAsyncTaskImpl r4 = new io.realm.internal.async.RealmAsyncTaskImpl
            io.realm.internal.async.RealmThreadPoolExecutor r5 = r2.stateListenerExecutor
            r4.<init>(r3, r5)
            return r4
    }
}
