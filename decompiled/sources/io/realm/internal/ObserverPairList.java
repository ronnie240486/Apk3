package io.realm.internal;

import io.realm.internal.ObserverPairList.ObserverPair;

/* JADX INFO: loaded from: classes.dex */
public class ObserverPairList<T extends io.realm.internal.ObserverPairList.ObserverPair> {
    private boolean cleared;
    private java.util.List<T> pairs;

    /* JADX INFO: loaded from: classes2.dex */
    public interface Callback<T extends io.realm.internal.ObserverPairList.ObserverPair> {
        void onCalled(T r1, java.lang.Object r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class ObserverPair<T, S> {
        public final S listener;
        public final java.lang.ref.WeakReference<T> observerRef;
        public boolean removed;

        public ObserverPair(T r2, S r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.removed = r0
                r1.listener = r3
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r2)
                r1.observerRef = r3
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof io.realm.internal.ObserverPairList.ObserverPair
                r2 = 0
                if (r1 == 0) goto L26
                io.realm.internal.ObserverPairList$ObserverPair r5 = (io.realm.internal.ObserverPairList.ObserverPair) r5
                S r1 = r4.listener
                S r3 = r5.listener
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L24
                java.lang.ref.WeakReference<T> r1 = r4.observerRef
                java.lang.Object r1 = r1.get()
                java.lang.ref.WeakReference<T> r5 = r5.observerRef
                java.lang.Object r5 = r5.get()
                if (r1 != r5) goto L24
                goto L25
            L24:
                r0 = 0
            L25:
                return r0
            L26:
                return r2
        }

        public int hashCode() {
                r3 = this;
                java.lang.ref.WeakReference<T> r0 = r3.observerRef
                java.lang.Object r0 = r0.get()
                r1 = 0
                if (r0 == 0) goto Le
                int r0 = r0.hashCode()
                goto Lf
            Le:
                r0 = 0
            Lf:
                r2 = 527(0x20f, float:7.38E-43)
                int r2 = r2 + r0
                int r2 = r2 * 31
                S r0 = r3.listener
                if (r0 == 0) goto L1c
                int r1 = r0.hashCode()
            L1c:
                int r2 = r2 + r1
                return r2
        }
    }

    public ObserverPairList() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.pairs = r0
            r0 = 0
            r1.cleared = r0
            return
    }

    public void add(T r3) {
            r2 = this;
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r2.pairs
            boolean r0 = r0.contains(r3)
            r1 = 0
            if (r0 != 0) goto L10
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r2.pairs
            r0.add(r3)
            r3.removed = r1
        L10:
            boolean r3 = r2.cleared
            if (r3 == 0) goto L16
            r2.cleared = r1
        L16:
            return
    }

    public void clear() {
            r1 = this;
            r0 = 1
            r1.cleared = r0
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r1.pairs
            r0.clear()
            return
    }

    public void foreach(io.realm.internal.ObserverPairList.Callback<T> r5) {
            r4 = this;
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r4.pairs
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            io.realm.internal.ObserverPairList$ObserverPair r1 = (io.realm.internal.ObserverPairList.ObserverPair) r1
            boolean r2 = r4.cleared
            if (r2 == 0) goto L17
            goto L2d
        L17:
            java.lang.ref.WeakReference<T> r2 = r1.observerRef
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L25
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r2 = r4.pairs
            r2.remove(r1)
            goto L6
        L25:
            boolean r3 = r1.removed
            if (r3 != 0) goto L6
            r5.onCalled(r1, r2)
            goto L6
        L2d:
            return
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r1.pairs
            boolean r0 = r0.isEmpty()
            return r0
    }

    public <S, U> void remove(S r4, U r5) {
            r3 = this;
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r3.pairs
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            io.realm.internal.ObserverPairList$ObserverPair r1 = (io.realm.internal.ObserverPairList.ObserverPair) r1
            java.lang.ref.WeakReference<T> r2 = r1.observerRef
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto L6
            S r2 = r1.listener
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L6
            r4 = 1
            r1.removed = r4
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r4 = r3.pairs
            r4.remove(r1)
        L2a:
            return
    }

    public final void removeByObserver(java.lang.Object r4) {
            r3 = this;
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r3.pairs
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            io.realm.internal.ObserverPairList$ObserverPair r1 = (io.realm.internal.ObserverPairList.ObserverPair) r1
            java.lang.ref.WeakReference<T> r2 = r1.observerRef
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L6
        L1c:
            r2 = 1
            r1.removed = r2
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r2 = r3.pairs
            r2.remove(r1)
            goto L6
        L25:
            return
    }

    public int size() {
            r1 = this;
            java.util.List<T extends io.realm.internal.ObserverPairList$ObserverPair> r0 = r1.pairs
            int r0 = r0.size()
            return r0
    }
}
