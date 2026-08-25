package androidx.startup;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInitializer {
    private static final java.lang.String SECTION_NAME = "Startup";
    private static volatile androidx.startup.AppInitializer sInstance;
    private static final java.lang.Object sLock = null;

    @androidx.annotation.NonNull
    public final android.content.Context mContext;

    @androidx.annotation.NonNull
    public final java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> mDiscovered;

    @androidx.annotation.NonNull
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> mInitialized;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.startup.AppInitializer.sLock = r0
            return
    }

    public AppInitializer(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.mDiscovered = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mInitialized = r1
            return
    }

    @androidx.annotation.NonNull
    private <T> T doInitialize(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<?>> r5, @androidx.annotation.NonNull java.util.Set<java.lang.Class<?>> r6) {
            r4 = this;
            boolean r0 = androidx.tracing.Trace.isEnabled()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L88
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L88
        Ld:
            boolean r0 = r6.contains(r5)     // Catch: java.lang.Throwable -> L88
            r1 = 0
            if (r0 != 0) goto L73
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r4.mInitialized     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L69
            r6.add(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Constructor r0 = r5.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L62
            androidx.startup.Initializer r0 = (androidx.startup.Initializer) r0     // Catch: java.lang.Throwable -> L62
            java.util.List r1 = r0.dependencies()     // Catch: java.lang.Throwable -> L62
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L53
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L62
        L3b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L62
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.mInitialized     // Catch: java.lang.Throwable -> L62
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L3b
            r4.doInitialize(r2, r6)     // Catch: java.lang.Throwable -> L62
            goto L3b
        L53:
            android.content.Context r1 = r4.mContext     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.create(r1)     // Catch: java.lang.Throwable -> L62
            r6.remove(r5)     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r4.mInitialized     // Catch: java.lang.Throwable -> L62
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L62
            goto L6f
        L62:
            r5 = move-exception
            androidx.startup.StartupException r6 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L88
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L88
            throw r6     // Catch: java.lang.Throwable -> L88
        L69:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r4.mInitialized     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r6.get(r5)     // Catch: java.lang.Throwable -> L88
        L6f:
            androidx.tracing.Trace.endSection()
            return r0
        L73:
            java.lang.String r6 = "Cannot initialize %s. Cycle detected."
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L88
            r0[r1] = r5     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = java.lang.String.format(r6, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L88
            throw r6     // Catch: java.lang.Throwable -> L88
        L88:
            r5 = move-exception
            androidx.tracing.Trace.endSection()
            throw r5
    }

    @androidx.annotation.NonNull
    public static androidx.startup.AppInitializer getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.sInstance
            if (r0 != 0) goto L17
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            androidx.startup.AppInitializer r1 = androidx.startup.AppInitializer.sInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            androidx.startup.AppInitializer r1 = new androidx.startup.AppInitializer     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            androidx.startup.AppInitializer.sInstance = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            androidx.startup.AppInitializer r2 = androidx.startup.AppInitializer.sInstance
            return r2
    }

    public final void discoverAndInitialize(@androidx.annotation.Nullable android.os.Bundle r6) {
            r5 = this;
            android.content.Context r0 = r5.mContext
            int r1 = androidx.startup.R.string.androidx_startup
            java.lang.String r0 = r0.getString(r1)
            if (r6 == 0) goto L5d
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L56
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L56
            java.util.Set r2 = r6.keySet()     // Catch: java.lang.ClassNotFoundException -> L56
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L56
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L56
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L56
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassNotFoundException -> L56
            r4 = 0
            java.lang.String r4 = r6.getString(r3, r4)     // Catch: java.lang.ClassNotFoundException -> L56
            boolean r4 = r0.equals(r4)     // Catch: java.lang.ClassNotFoundException -> L56
            if (r4 == 0) goto L17
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L56
            java.lang.Class<androidx.startup.Initializer> r4 = androidx.startup.Initializer.class
            boolean r4 = r4.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L56
            if (r4 == 0) goto L17
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r4 = r5.mDiscovered     // Catch: java.lang.ClassNotFoundException -> L56
            r4.add(r3)     // Catch: java.lang.ClassNotFoundException -> L56
            goto L17
        L40:
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r6 = r5.mDiscovered     // Catch: java.lang.ClassNotFoundException -> L56
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.ClassNotFoundException -> L56
        L46:
            boolean r0 = r6.hasNext()     // Catch: java.lang.ClassNotFoundException -> L56
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r6.next()     // Catch: java.lang.ClassNotFoundException -> L56
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L56
            r5.doInitialize(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L56
            goto L46
        L56:
            r6 = move-exception
            androidx.startup.StartupException r0 = new androidx.startup.StartupException
            r0.<init>(r6)
            throw r0
        L5d:
            return
    }

    @androidx.annotation.NonNull
    public <T> T initializeComponent(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<T>> r3) {
            r2 = this;
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.mInitialized     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L14
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r2.doInitialize(r3, r1)     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public boolean isEagerlyInitialized(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<?>> r2) {
            r1 = this;
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r0 = r1.mDiscovered
            boolean r2 = r0.contains(r2)
            return r2
    }
}
