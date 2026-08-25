package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class CopyOnWriteMultiset<E> implements java.lang.Iterable<E> {

    @androidx.annotation.GuardedBy("lock")
    private final java.util.Map<E, java.lang.Integer> elementCounts;

    @androidx.annotation.GuardedBy("lock")
    private java.util.Set<E> elementSet;

    @androidx.annotation.GuardedBy("lock")
    private java.util.List<E> elements;
    private final java.lang.Object lock;

    public CopyOnWriteMultiset() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.elementCounts = r0
            java.util.Set r0 = java.util.Collections.emptySet()
            r1.elementSet = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.elements = r0
            return
    }

    public void add(E r5) {
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L40
            java.util.List<E> r2 = r4.elements     // Catch: java.lang.Throwable -> L40
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r1.add(r5)     // Catch: java.lang.Throwable -> L40
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L40
            r4.elements = r1     // Catch: java.lang.Throwable -> L40
            java.util.Map<E, java.lang.Integer> r1 = r4.elementCounts     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L2d
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L40
            java.util.Set<E> r3 = r4.elementSet     // Catch: java.lang.Throwable -> L40
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40
            r2.add(r5)     // Catch: java.lang.Throwable -> L40
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)     // Catch: java.lang.Throwable -> L40
            r4.elementSet = r2     // Catch: java.lang.Throwable -> L40
        L2d:
            java.util.Map<E, java.lang.Integer> r2 = r4.elementCounts     // Catch: java.lang.Throwable -> L40
            r3 = 1
            if (r1 == 0) goto L37
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L40
            int r3 = r3 + r1
        L37:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L40
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
    }

    public int count(E r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r2.elementCounts     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L18
            java.util.Map<E, java.lang.Integer> r1 = r2.elementCounts     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L1b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L1b
            goto L19
        L18:
            r3 = 0
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public java.util.Set<E> elementSet() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.Set<E> r1 = r2.elementSet     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.List<E> r1 = r2.elements     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public void remove(E r5) {
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.elementCounts     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        Lf:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            java.util.List<E> r3 = r4.elements     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            r2.remove(r5)     // Catch: java.lang.Throwable -> L4c
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch: java.lang.Throwable -> L4c
            r4.elements = r2     // Catch: java.lang.Throwable -> L4c
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            r3 = 1
            if (r2 != r3) goto L3c
            java.util.Map<E, java.lang.Integer> r1 = r4.elementCounts     // Catch: java.lang.Throwable -> L4c
            r1.remove(r5)     // Catch: java.lang.Throwable -> L4c
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4c
            java.util.Set<E> r2 = r4.elementSet     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r1.remove(r5)     // Catch: java.lang.Throwable -> L4c
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch: java.lang.Throwable -> L4c
            r4.elementSet = r5     // Catch: java.lang.Throwable -> L4c
            goto L4a
        L3c:
            java.util.Map<E, java.lang.Integer> r2 = r4.elementCounts     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4c
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r5
    }
}
