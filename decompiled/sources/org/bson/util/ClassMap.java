package org.bson.util;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ClassMap<T> {
    private final java.util.Map<java.lang.Class<?>, T> cache;
    private final java.util.Map<java.lang.Class<?>, T> map;

    /* JADX INFO: renamed from: org.bson.util.ClassMap$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class ComputeFunction implements org.bson.util.Function<java.lang.Class<?>, T> {
        public final /* synthetic */ org.bson.util.ClassMap this$0;

        private ComputeFunction(org.bson.util.ClassMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ComputeFunction(org.bson.util.ClassMap r1, org.bson.util.ClassMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public T apply2(java.lang.Class<?> r3) {
                r2 = this;
                java.util.List r3 = org.bson.util.ClassMap.getAncestry(r3)
                java.util.Iterator r3 = r3.iterator()
            L8:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L21
                java.lang.Object r0 = r3.next()
                java.lang.Class r0 = (java.lang.Class) r0
                org.bson.util.ClassMap r1 = r2.this$0
                java.util.Map r1 = org.bson.util.ClassMap.access$000(r1)
                java.lang.Object r0 = r1.get(r0)
                if (r0 == 0) goto L8
                return r0
            L21:
                r3 = 0
                return r3
        }

        @Override // org.bson.util.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Class<?> r1) {
                r0 = this;
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.Object r1 = r0.apply2(r1)
                return r1
        }
    }

    public ClassMap() {
            r2 = this;
            r2.<init>()
            org.bson.util.CopyOnWriteMap r0 = org.bson.util.CopyOnWriteMap.newHashMap()
            r2.map = r0
            org.bson.util.ClassMap$ComputeFunction r0 = new org.bson.util.ClassMap$ComputeFunction
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Map r0 = org.bson.util.ComputingMap.create(r0)
            r2.cache = r0
            return
    }

    public static /* synthetic */ java.util.Map access$000(org.bson.util.ClassMap r0) {
            java.util.Map<java.lang.Class<?>, T> r0 = r0.map
            return r0
    }

    public static <T> java.util.List<java.lang.Class<?>> getAncestry(java.lang.Class<T> r0) {
            java.util.List r0 = org.bson.util.ClassAncestry.getAncestry(r0)
            return r0
    }

    public void clear() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, T> r0 = r1.map
            r0.clear()
            java.util.Map<java.lang.Class<?>, T> r0 = r1.cache
            r0.clear()
            return
    }

    public T get(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, T> r0 = r1.cache
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, T> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    public T put(java.lang.Class<?> r2, T r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, T> r0 = r1.map     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lc
            java.util.Map<java.lang.Class<?>, T> r3 = r1.cache
            r3.clear()
            return r2
        Lc:
            r2 = move-exception
            java.util.Map<java.lang.Class<?>, T> r3 = r1.cache
            r3.clear()
            throw r2
    }

    public T remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, T> r0 = r1.map     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lc
            java.util.Map<java.lang.Class<?>, T> r0 = r1.cache
            r0.clear()
            return r2
        Lc:
            r2 = move-exception
            java.util.Map<java.lang.Class<?>, T> r0 = r1.cache
            r0.clear()
            throw r2
    }

    public int size() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, T> r0 = r1.map
            int r0 = r0.size()
            return r0
    }
}
