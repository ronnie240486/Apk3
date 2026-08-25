package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Serialization {

    /* JADX INFO: renamed from: com.google.common.collect.Serialization$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class FieldSetter<T> {
        private final java.lang.reflect.Field field;

        private FieldSetter(java.lang.reflect.Field r2) {
                r1 = this;
                r1.<init>()
                r1.field = r2
                r0 = 1
                r2.setAccessible(r0)
                return
        }

        public /* synthetic */ FieldSetter(java.lang.reflect.Field r1, com.google.common.collect.Serialization.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public final void set(T r2, int r3) {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field     // Catch: java.lang.IllegalAccessException -> La
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.IllegalAccessException -> La
                r0.set(r2, r3)     // Catch: java.lang.IllegalAccessException -> La
                return
            La:
                r2 = move-exception
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>(r2)
                throw r3
        }

        public final void set(T r2, java.lang.Object r3) {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field     // Catch: java.lang.IllegalAccessException -> L6
                r0.set(r2, r3)     // Catch: java.lang.IllegalAccessException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>(r2)
                throw r3
        }
    }

    private Serialization() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> com.google.common.collect.Serialization.FieldSetter<T> getFieldSetter(java.lang.Class<T> r1, java.lang.String r2) {
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Lb
            com.google.common.collect.Serialization$FieldSetter r2 = new com.google.common.collect.Serialization$FieldSetter     // Catch: java.lang.NoSuchFieldException -> Lb
            r0 = 0
            r2.<init>(r1, r0)     // Catch: java.lang.NoSuchFieldException -> Lb
            return r2
        Lb:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
    }

    public static <K, V> void populateMap(java.util.Map<K, V> r4, java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            int r0 = r5.readInt()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r5.readObject()
            java.lang.Object r3 = r5.readObject()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static <K, V> void populateMultimap(com.google.common.collect.Multimap<K, V> r6, java.io.ObjectInputStream r7, int r8) throws java.io.IOException, java.lang.ClassNotFoundException {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r8) goto L20
            java.lang.Object r2 = r7.readObject()
            java.util.Collection r2 = r6.get(r2)
            int r3 = r7.readInt()
            r4 = 0
        L11:
            if (r4 >= r3) goto L1d
            java.lang.Object r5 = r7.readObject()
            r2.add(r5)
            int r4 = r4 + 1
            goto L11
        L1d:
            int r1 = r1 + 1
            goto L2
        L20:
            return
    }

    public static <E> void populateMultiset(com.google.common.collect.Multiset<E> r4, java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            int r0 = r5.readInt()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r5.readObject()
            int r3 = r5.readInt()
            r4.add(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static <K, V> void writeMap(java.util.Map<K, V> r2, java.io.ObjectOutputStream r3) throws java.io.IOException {
            int r0 = r2.size()
            r3.writeInt(r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3.writeObject(r1)
            java.lang.Object r0 = r0.getValue()
            r3.writeObject(r0)
            goto Lf
        L2a:
            return
    }

    public static <K, V> void writeMultimap(com.google.common.collect.Multimap<K, V> r2, java.io.ObjectOutputStream r3) throws java.io.IOException {
            java.util.Map r0 = r2.asMap()
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.Map r2 = r2.asMap()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3.writeObject(r1)
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3.writeInt(r1)
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto L41
        L4f:
            return
    }

    public static <E> void writeMultiset(com.google.common.collect.Multiset<E> r2, java.io.ObjectOutputStream r3) throws java.io.IOException {
            java.util.Set r0 = r2.entrySet()
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            com.google.common.collect.Multiset$Entry r0 = (com.google.common.collect.Multiset.Entry) r0
            java.lang.Object r1 = r0.getElement()
            r3.writeObject(r1)
            int r0 = r0.getCount()
            r3.writeInt(r0)
            goto L13
        L2e:
            return
    }
}
