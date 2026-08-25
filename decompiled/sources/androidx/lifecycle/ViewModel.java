package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModel {

    @androidx.annotation.Nullable
    private final java.util.Map<java.lang.String, java.lang.Object> mBagOfTags;
    private volatile boolean mCleared;

    @androidx.annotation.Nullable
    private final java.util.Set<java.io.Closeable> mCloseables;

    public ViewModel() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mCloseables = r0
            r0 = 0
            r1.mCleared = r0
            return
    }

    public ViewModel(@androidx.annotation.NonNull java.io.Closeable... r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.mCloseables = r0
            r1 = 0
            r2.mCleared = r1
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.addAll(r3)
            return
    }

    private static void closeWithRuntimeException(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L11
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.io.IOException -> La
            r1.close()     // Catch: java.io.IOException -> La
            goto L11
        La:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L11:
            return
    }

    public void addCloseable(@androidx.annotation.NonNull java.io.Closeable r3) {
            r2 = this;
            java.util.Set<java.io.Closeable> r0 = r2.mCloseables
            if (r0 == 0) goto Lf
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r2.mCloseables     // Catch: java.lang.Throwable -> Lc
            r1.add(r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
        Lf:
            return
    }

    @androidx.annotation.MainThread
    public final void clear() {
            r3 = this;
            r0 = 1
            r3.mCleared = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            if (r0 == 0) goto L25
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L22
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L22
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L22
            goto L12
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
        L25:
            java.util.Set<java.io.Closeable> r0 = r3.mCloseables
            if (r0 == 0) goto L45
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r3.mCloseables     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L42
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L42
            goto L30
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
        L45:
            r3.onCleared()
            return
    }

    public final java.lang.Object getTag() {
            r3 = this;
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    public void onCleared() {
            r0 = this;
            return
    }

    public final java.lang.Object setTagIfAbsent(java.lang.Object r5) {
            r4 = this;
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mBagOfTags
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.mBagOfTags     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L12
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.mBagOfTags     // Catch: java.lang.Throwable -> L1f
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> L1f
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L16
            goto L17
        L16:
            r5 = r2
        L17:
            boolean r0 = r4.mCleared
            if (r0 == 0) goto L1e
            closeWithRuntimeException(r5)
        L1e:
            return r5
        L1f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }
}
