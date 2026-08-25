package org.bson.util;

/* JADX INFO: loaded from: classes2.dex */
class ClassAncestry {
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> _ancestryCache = null;

    static {
            org.bson.util.CopyOnWriteMap r0 = org.bson.util.CopyOnWriteMap.newHashMap()
            org.bson.util.ClassAncestry._ancestryCache = r0
            return
    }

    public ClassAncestry() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<java.lang.Class<?>> computeAncestry(java.lang.Class<?> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0.add(r1)
            computeAncestry(r2, r0)
            java.util.Collections.reverse(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }

    private static <T> void computeAncestry(java.lang.Class<T> r3, java.util.List<java.lang.Class<?>> r4) {
            if (r3 == 0) goto L28
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 != r0) goto L7
            goto L28
        L7:
            java.lang.Class[] r0 = r3.getInterfaces()
            int r1 = r0.length
            int r1 = r1 + (-1)
        Le:
            if (r1 < 0) goto L18
            r2 = r0[r1]
            computeAncestry(r2, r4)
            int r1 = r1 + (-1)
            goto Le
        L18:
            java.lang.Class r0 = r3.getSuperclass()
            computeAncestry(r0, r4)
            boolean r0 = r4.contains(r3)
            if (r0 != 0) goto L28
            r4.add(r3)
        L28:
            return
    }

    public static <T> java.util.List<java.lang.Class<?>> getAncestry(java.lang.Class<T> r2) {
            java.util.concurrent.ConcurrentMap r0 = getClassAncestryCache()
        L4:
            java.lang.Object r1 = r0.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.util.List r1 = computeAncestry(r2)
            r0.putIfAbsent(r2, r1)
            goto L4
    }

    private static java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getClassAncestryCache() {
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> r0 = org.bson.util.ClassAncestry._ancestryCache
            return r0
    }
}
