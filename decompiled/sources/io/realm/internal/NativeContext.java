package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class NativeContext {
    public static final io.realm.internal.NativeContext dummyContext = null;
    private static final java.lang.Thread finalizingThread = null;
    private static final java.lang.ref.ReferenceQueue<io.realm.internal.NativeObject> referenceQueue = null;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ManualReleaseNativeContext extends io.realm.internal.NativeContext {
        private final java.util.LinkedList<io.realm.internal.NativeObject> references;

        public ManualReleaseNativeContext() {
                r1 = this;
                r1.<init>()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r1.references = r0
                return
        }

        @Override // io.realm.internal.NativeContext
        public void addReference(io.realm.internal.NativeObject r2) {
                r1 = this;
                java.util.LinkedList<io.realm.internal.NativeObject> r0 = r1.references
                r0.add(r2)
                return
        }

        public void release() {
                r6 = this;
                java.util.LinkedList<io.realm.internal.NativeObject> r0 = r6.references
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                io.realm.internal.NativeObject r1 = (io.realm.internal.NativeObject) r1
                long r2 = r1.getNativeFinalizerPtr()
                long r4 = r1.getNativePtr()
                io.realm.internal.NativeObjectReference.nativeCleanUp(r2, r4)
                goto L6
            L1e:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface NativeContextRunnable {
        void run(io.realm.internal.NativeContext r1);
    }

    static {
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            io.realm.internal.NativeContext.referenceQueue = r0
            java.lang.Thread r1 = new java.lang.Thread
            io.realm.internal.FinalizerRunnable r2 = new io.realm.internal.FinalizerRunnable
            r2.<init>(r0)
            r1.<init>(r2)
            io.realm.internal.NativeContext.finalizingThread = r1
            io.realm.internal.NativeContext r0 = new io.realm.internal.NativeContext
            r0.<init>()
            io.realm.internal.NativeContext.dummyContext = r0
            java.lang.String r0 = "RealmFinalizingDaemon"
            r1.setName(r0)
            r1.start()
            return
    }

    public NativeContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public void addReference(io.realm.internal.NativeObject r3) {
            r2 = this;
            io.realm.internal.NativeObjectReference r0 = new io.realm.internal.NativeObjectReference
            java.lang.ref.ReferenceQueue<io.realm.internal.NativeObject> r1 = io.realm.internal.NativeContext.referenceQueue
            r0.<init>(r2, r3, r1)
            return
    }
}
