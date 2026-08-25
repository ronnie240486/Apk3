package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
final class NativeObjectReference extends java.lang.ref.PhantomReference<io.realm.internal.NativeObject> {
    private static io.realm.internal.NativeObjectReference.ReferencePool referencePool;
    private final io.realm.internal.NativeContext context;
    private final long nativeFinalizerPtr;
    private final long nativePtr;
    private io.realm.internal.NativeObjectReference next;
    private io.realm.internal.NativeObjectReference prev;

    /* JADX INFO: renamed from: io.realm.internal.NativeObjectReference$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ReferencePool {
        public io.realm.internal.NativeObjectReference head;

        private ReferencePool() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ReferencePool(io.realm.internal.NativeObjectReference.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            io.realm.internal.NativeObjectReference$ReferencePool r0 = new io.realm.internal.NativeObjectReference$ReferencePool
            r1 = 0
            r0.<init>(r1)
            io.realm.internal.NativeObjectReference.referencePool = r0
            return
    }

    public NativeObjectReference(io.realm.internal.NativeContext r3, io.realm.internal.NativeObject r4, java.lang.ref.ReferenceQueue<? super io.realm.internal.NativeObject> r5) {
            r2 = this;
            r2.<init>(r4, r5)
            long r0 = r4.getNativePtr()
            r2.nativePtr = r0
            long r4 = r4.getNativeFinalizerPtr()
            r2.nativeFinalizerPtr = r4
            r2.context = r3
            io.realm.internal.NativeObjectReference$ReferencePool r3 = io.realm.internal.NativeObjectReference.referencePool
            monitor-enter(r3)
            r4 = 0
            access$002(r2, r4)     // Catch: java.lang.Throwable -> L28
            io.realm.internal.NativeObjectReference r4 = r3.head     // Catch: java.lang.Throwable -> L28
            access$102(r2, r4)     // Catch: java.lang.Throwable -> L28
            io.realm.internal.NativeObjectReference r4 = r3.head     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L24
            access$002(r4, r2)     // Catch: java.lang.Throwable -> L28
        L24:
            r3.head = r2     // Catch: java.lang.Throwable -> L28
            monitor-exit(r3)
            return
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public static /* synthetic */ io.realm.internal.NativeObjectReference access$000(io.realm.internal.NativeObjectReference r0) {
            io.realm.internal.NativeObjectReference r0 = r0.prev
            return r0
    }

    public static /* synthetic */ io.realm.internal.NativeObjectReference access$002(io.realm.internal.NativeObjectReference r0, io.realm.internal.NativeObjectReference r1) {
            r0.prev = r1
            return r1
    }

    public static /* synthetic */ io.realm.internal.NativeObjectReference access$100(io.realm.internal.NativeObjectReference r0) {
            io.realm.internal.NativeObjectReference r0 = r0.next
            return r0
    }

    public static /* synthetic */ io.realm.internal.NativeObjectReference access$102(io.realm.internal.NativeObjectReference r0, io.realm.internal.NativeObjectReference r1) {
            r0.next = r1
            return r1
    }

    public static native void nativeCleanUp(long r0, long r2);

    public final void cleanup() {
            r5 = this;
            io.realm.internal.NativeContext r0 = r5.context
            monitor-enter(r0)
            long r1 = r5.nativeFinalizerPtr     // Catch: java.lang.Throwable -> L2f
            long r3 = r5.nativePtr     // Catch: java.lang.Throwable -> L2f
            nativeCleanUp(r1, r3)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            io.realm.internal.NativeObjectReference$ReferencePool r0 = io.realm.internal.NativeObjectReference.referencePool
            monitor-enter(r0)
            io.realm.internal.NativeObjectReference r1 = access$100(r5)     // Catch: java.lang.Throwable -> L2c
            io.realm.internal.NativeObjectReference r2 = access$000(r5)     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            access$102(r5, r3)     // Catch: java.lang.Throwable -> L2c
            access$002(r5, r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L23
            access$102(r2, r1)     // Catch: java.lang.Throwable -> L2c
            goto L25
        L23:
            r0.head = r1     // Catch: java.lang.Throwable -> L2c
        L25:
            if (r1 == 0) goto L2a
            access$002(r1, r2)     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r0)
            return
        L2c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
    }
}
