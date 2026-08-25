package com.google.common.base;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public class FinalizableReferenceQueue implements java.io.Closeable {
    private static final java.lang.String FINALIZER_CLASS_NAME = "com.google.common.base.internal.Finalizer";
    private static final java.util.logging.Logger logger = null;
    private static final java.lang.reflect.Method startFinalizer = null;
    public final java.lang.ref.PhantomReference<java.lang.Object> frqRef;
    public final java.lang.ref.ReferenceQueue<java.lang.Object> queue;
    public final boolean threadStarted;

    /* JADX INFO: loaded from: classes.dex */
    public static class DecoupledLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        private static final java.lang.String LOADING_ERROR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        public DecoupledLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.net.URL getBaseUrl() throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "com.google.common.base.internal.Finalizer"
                r1 = 46
                r2 = 47
                java.lang.String r0 = r0.replace(r1, r2)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = ".class"
                java.lang.String r0 = r0.concat(r1)
                java.lang.Class r1 = r5.getClass()
                java.lang.ClassLoader r1 = r1.getClassLoader()
                java.net.URL r1 = r1.getResource(r0)
                if (r1 == 0) goto L59
                java.lang.String r2 = r1.toString()
                boolean r3 = r2.endsWith(r0)
                if (r3 != 0) goto L45
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Unsupported path style: "
                int r3 = r2.length()
                if (r3 == 0) goto L3b
                java.lang.String r1 = r1.concat(r2)
                goto L41
            L3b:
                java.lang.String r2 = new java.lang.String
                r2.<init>(r1)
                r1 = r2
            L41:
                r0.<init>(r1)
                throw r0
            L45:
                r3 = 0
                int r4 = r2.length()
                int r0 = r0.length()
                int r4 = r4 - r0
                java.lang.String r0 = r2.substring(r3, r4)
                java.net.URL r2 = new java.net.URL
                r2.<init>(r1, r0)
                return r2
            L59:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @javax.annotation.CheckForNull
        public java.lang.Class<?> loadFinalizer() {
                r5 = this;
                r0 = 0
                java.net.URL r1 = r5.getBaseUrl()     // Catch: java.lang.Exception -> L17
                java.net.URLClassLoader r2 = new java.net.URLClassLoader     // Catch: java.lang.Exception -> L17
                r3 = 1
                java.net.URL[] r3 = new java.net.URL[r3]     // Catch: java.lang.Exception -> L17
                r4 = 0
                r3[r4] = r1     // Catch: java.lang.Exception -> L17
                r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L17
                java.lang.String r1 = "com.google.common.base.internal.Finalizer"
                java.lang.Class r0 = r2.loadClass(r1)     // Catch: java.lang.Exception -> L17
                return r0
            L17:
                r1 = move-exception
                java.util.logging.Logger r2 = com.google.common.base.FinalizableReferenceQueue.access$000()
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.String r4 = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path."
                r2.log(r3, r4, r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class DirectLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        public DirectLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public java.lang.Class<?> loadFinalizer() {
                r2 = this;
                java.lang.String r0 = "com.google.common.base.internal.Finalizer"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>(r0)
                throw r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface FinalizerLoader {
        @javax.annotation.CheckForNull
        java.lang.Class<?> loadFinalizer();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SystemLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        public SystemLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @javax.annotation.CheckForNull
        public java.lang.Class<?> loadFinalizer() {
                r3 = this;
                r0 = 0
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.SecurityException -> Le
                if (r1 == 0) goto Ld
                java.lang.String r2 = "com.google.common.base.internal.Finalizer"
                java.lang.Class r0 = r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> Ld
            Ld:
                return r0
            Le:
                java.util.logging.Logger r1 = com.google.common.base.FinalizableReferenceQueue.access$000()
                java.lang.String r2 = "Not allowed to access system class loader."
                r1.info(r2)
                return r0
        }
    }

    static {
            java.lang.Class<com.google.common.base.FinalizableReferenceQueue> r0 = com.google.common.base.FinalizableReferenceQueue.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.base.FinalizableReferenceQueue.logger = r0
            r0 = 3
            com.google.common.base.FinalizableReferenceQueue$FinalizerLoader[] r1 = new com.google.common.base.FinalizableReferenceQueue.FinalizerLoader[r0]
            com.google.common.base.FinalizableReferenceQueue$SystemLoader r2 = new com.google.common.base.FinalizableReferenceQueue$SystemLoader
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            com.google.common.base.FinalizableReferenceQueue$DecoupledLoader r2 = new com.google.common.base.FinalizableReferenceQueue$DecoupledLoader
            r2.<init>()
            r4 = 1
            r1[r4] = r2
            com.google.common.base.FinalizableReferenceQueue$DirectLoader r2 = new com.google.common.base.FinalizableReferenceQueue$DirectLoader
            r2.<init>()
            r5 = 2
            r1[r5] = r2
            java.lang.Class r1 = loadFinalizer(r1)
            java.lang.String r2 = "startFinalizer"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L43
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r0[r3] = r6     // Catch: java.lang.NoSuchMethodException -> L43
            java.lang.Class<java.lang.ref.ReferenceQueue> r3 = java.lang.ref.ReferenceQueue.class
            r0[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L43
            java.lang.Class<java.lang.ref.PhantomReference> r3 = java.lang.ref.PhantomReference.class
            r0[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L43
            java.lang.reflect.Method r0 = r1.getMethod(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L43
            com.google.common.base.FinalizableReferenceQueue.startFinalizer = r0
            return
        L43:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public FinalizableReferenceQueue() {
            r8 = this;
            r8.<init>()
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r8.queue = r0
            java.lang.ref.PhantomReference r1 = new java.lang.ref.PhantomReference
            r1.<init>(r8, r0)
            r8.frqRef = r1
            r2 = 1
            r3 = 0
            java.lang.reflect.Method r4 = com.google.common.base.FinalizableReferenceQueue.startFinalizer     // Catch: java.lang.Throwable -> L26 java.lang.IllegalAccessException -> L34
            r5 = 0
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L26 java.lang.IllegalAccessException -> L34
            java.lang.Class<com.google.common.base.FinalizableReference> r7 = com.google.common.base.FinalizableReference.class
            r6[r3] = r7     // Catch: java.lang.Throwable -> L26 java.lang.IllegalAccessException -> L34
            r6[r2] = r0     // Catch: java.lang.Throwable -> L26 java.lang.IllegalAccessException -> L34
            r0 = 2
            r6[r0] = r1     // Catch: java.lang.Throwable -> L26 java.lang.IllegalAccessException -> L34
            r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L26 java.lang.IllegalAccessException -> L34
            goto L31
        L26:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.base.FinalizableReferenceQueue.logger
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            java.lang.String r4 = "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created."
            r1.log(r2, r4, r0)
            r2 = 0
        L31:
            r8.threadStarted = r2
            return
        L34:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.base.FinalizableReferenceQueue.logger
            return r0
    }

    private static java.lang.Class<?> loadFinalizer(com.google.common.base.FinalizableReferenceQueue.FinalizerLoader... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r3[r1]
            java.lang.Class r2 = r2.loadFinalizer()
            if (r2 == 0) goto Ld
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            java.lang.ref.PhantomReference<java.lang.Object> r0 = r4.frqRef
            r0.enqueue()
            boolean r0 = r4.threadStarted
            if (r0 == 0) goto La
            goto L26
        La:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r4.queue
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 == 0) goto L26
            r0.clear()
            com.google.common.base.FinalizableReference r0 = (com.google.common.base.FinalizableReference) r0     // Catch: java.lang.Throwable -> L1b
            r0.finalizeReferent()     // Catch: java.lang.Throwable -> L1b
            goto La
        L1b:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.base.FinalizableReferenceQueue.logger
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "Error cleaning up after reference."
            r1.log(r2, r3, r0)
            goto La
        L26:
            return
    }
}
