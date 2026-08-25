package io.realm;

/* JADX INFO: loaded from: classes3.dex */
class RealmMapEntrySet<K, V> implements java.util.Set<java.util.Map.Entry<K, V>> {
    private final io.realm.BaseRealm baseRealm;
    private final io.realm.EqualsHelper<K, V> equalsHelper;
    private final io.realm.RealmMapEntrySet.IteratorType iteratorType;
    private final io.realm.internal.OsMap osMap;
    private final io.realm.TypeSelectorForMap<K, V> typeSelectorForMap;

    /* JADX INFO: renamed from: io.realm.RealmMapEntrySet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmMapEntrySet$IteratorType = null;

        static {
                io.realm.RealmMapEntrySet$IteratorType[] r0 = io.realm.RealmMapEntrySet.IteratorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType = r0
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.LONG     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.BYTE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.SHORT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L49
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L54
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.STRING     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L60
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.DATE     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L78
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L84
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.BINARY     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L90
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.UUID     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> La8
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.MIXED     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType     // Catch: java.lang.NoSuchFieldError -> Lb4
                io.realm.RealmMapEntrySet$IteratorType r1 = io.realm.RealmMapEntrySet.IteratorType.OBJECT     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class BinaryValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, byte[]> {
        public BinaryValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, byte[]> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                byte[] r3 = (byte[]) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class BooleanValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Boolean> {
        public BooleanValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Boolean> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    public static class ByteValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Byte> {
        public ByteValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Byte> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.lang.Long r0 = (java.lang.Long) r0
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                byte r0 = r0.byteValue()
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                r1.<init>(r3, r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class DateValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.util.Date> {
        public DateValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.util.Date> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                java.util.Date r3 = (java.util.Date) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Decimal128ValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, org.bson.types.Decimal128> {
        public Decimal128ValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, org.bson.types.Decimal128> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                org.bson.types.Decimal128 r3 = (org.bson.types.Decimal128) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class DoubleValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Double> {
        public DoubleValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Double> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                java.lang.Double r3 = (java.lang.Double) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class EntrySetIterator<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        public final io.realm.BaseRealm baseRealm;
        public final io.realm.internal.OsMap osMap;
        private int pos;

        public EntrySetIterator(io.realm.internal.OsMap r2, io.realm.BaseRealm r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.pos = r0
                r1.osMap = r2
                r1.baseRealm = r3
                return
        }

        public abstract java.util.Map.Entry<K, V> getEntryInternal(int r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r6 = this;
                int r0 = r6.pos
                r1 = 1
                int r0 = r0 + r1
                long r2 = (long) r0
                io.realm.internal.OsMap r0 = r6.osMap
                long r4 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L10
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r6 = this;
                int r0 = r6.pos
                int r0 = r0 + 1
                r6.pos = r0
                io.realm.internal.OsMap r0 = r6.osMap
                long r0 = r0.size()
                int r2 = r6.pos
                long r3 = (long) r2
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 >= 0) goto L18
                java.util.Map$Entry r0 = r6.getEntryInternal(r2)
                return r0
            L18:
                java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
                java.lang.String r3 = "Cannot access index "
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                int r4 = r6.pos
                r3.append(r4)
                java.lang.String r4 = " when size is "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ". Remember to check hasNext() before using next()."
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FloatValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Float> {
        public FloatValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Float> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                java.lang.Float r3 = (java.lang.Float) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class IntegerValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Integer> {
        public IntegerValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Integer> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.lang.Long r0 = (java.lang.Long) r0
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                int r0 = r0.intValue()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.<init>(r3, r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum IteratorType extends java.lang.Enum<io.realm.RealmMapEntrySet.IteratorType> {
        private static final /* synthetic */ io.realm.RealmMapEntrySet.IteratorType[] $VALUES = null;
        public static final io.realm.RealmMapEntrySet.IteratorType BINARY = null;
        public static final io.realm.RealmMapEntrySet.IteratorType BOOLEAN = null;
        public static final io.realm.RealmMapEntrySet.IteratorType BYTE = null;
        public static final io.realm.RealmMapEntrySet.IteratorType DATE = null;
        public static final io.realm.RealmMapEntrySet.IteratorType DECIMAL128 = null;
        public static final io.realm.RealmMapEntrySet.IteratorType DOUBLE = null;
        public static final io.realm.RealmMapEntrySet.IteratorType FLOAT = null;
        public static final io.realm.RealmMapEntrySet.IteratorType INTEGER = null;
        public static final io.realm.RealmMapEntrySet.IteratorType LONG = null;
        public static final io.realm.RealmMapEntrySet.IteratorType MIXED = null;
        public static final io.realm.RealmMapEntrySet.IteratorType OBJECT = null;
        public static final io.realm.RealmMapEntrySet.IteratorType OBJECT_ID = null;
        public static final io.realm.RealmMapEntrySet.IteratorType SHORT = null;
        public static final io.realm.RealmMapEntrySet.IteratorType STRING = null;
        public static final io.realm.RealmMapEntrySet.IteratorType UUID = null;

        static {
                io.realm.RealmMapEntrySet$IteratorType r0 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r1 = "LONG"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.RealmMapEntrySet.IteratorType.LONG = r0
                io.realm.RealmMapEntrySet$IteratorType r1 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r3 = "BYTE"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.RealmMapEntrySet.IteratorType.BYTE = r1
                io.realm.RealmMapEntrySet$IteratorType r3 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r5 = "SHORT"
                r6 = 2
                r3.<init>(r5, r6)
                io.realm.RealmMapEntrySet.IteratorType.SHORT = r3
                io.realm.RealmMapEntrySet$IteratorType r5 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r7 = "INTEGER"
                r8 = 3
                r5.<init>(r7, r8)
                io.realm.RealmMapEntrySet.IteratorType.INTEGER = r5
                io.realm.RealmMapEntrySet$IteratorType r7 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r9 = "FLOAT"
                r10 = 4
                r7.<init>(r9, r10)
                io.realm.RealmMapEntrySet.IteratorType.FLOAT = r7
                io.realm.RealmMapEntrySet$IteratorType r9 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r11 = "DOUBLE"
                r12 = 5
                r9.<init>(r11, r12)
                io.realm.RealmMapEntrySet.IteratorType.DOUBLE = r9
                io.realm.RealmMapEntrySet$IteratorType r11 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r13 = "STRING"
                r14 = 6
                r11.<init>(r13, r14)
                io.realm.RealmMapEntrySet.IteratorType.STRING = r11
                io.realm.RealmMapEntrySet$IteratorType r13 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r15 = "BOOLEAN"
                r14 = 7
                r13.<init>(r15, r14)
                io.realm.RealmMapEntrySet.IteratorType.BOOLEAN = r13
                io.realm.RealmMapEntrySet$IteratorType r15 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r14 = "DATE"
                r12 = 8
                r15.<init>(r14, r12)
                io.realm.RealmMapEntrySet.IteratorType.DATE = r15
                io.realm.RealmMapEntrySet$IteratorType r14 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r12 = "DECIMAL128"
                r10 = 9
                r14.<init>(r12, r10)
                io.realm.RealmMapEntrySet.IteratorType.DECIMAL128 = r14
                io.realm.RealmMapEntrySet$IteratorType r12 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r10 = "BINARY"
                r8 = 10
                r12.<init>(r10, r8)
                io.realm.RealmMapEntrySet.IteratorType.BINARY = r12
                io.realm.RealmMapEntrySet$IteratorType r10 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r8 = "OBJECT_ID"
                r6 = 11
                r10.<init>(r8, r6)
                io.realm.RealmMapEntrySet.IteratorType.OBJECT_ID = r10
                io.realm.RealmMapEntrySet$IteratorType r8 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r6 = "UUID"
                r4 = 12
                r8.<init>(r6, r4)
                io.realm.RealmMapEntrySet.IteratorType.UUID = r8
                io.realm.RealmMapEntrySet$IteratorType r6 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r4 = "MIXED"
                r2 = 13
                r6.<init>(r4, r2)
                io.realm.RealmMapEntrySet.IteratorType.MIXED = r6
                io.realm.RealmMapEntrySet$IteratorType r4 = new io.realm.RealmMapEntrySet$IteratorType
                java.lang.String r2 = "OBJECT"
                r17 = r6
                r6 = 14
                r4.<init>(r2, r6)
                io.realm.RealmMapEntrySet.IteratorType.OBJECT = r4
                r2 = 15
                io.realm.RealmMapEntrySet$IteratorType[] r2 = new io.realm.RealmMapEntrySet.IteratorType[r2]
                r16 = 0
                r2[r16] = r0
                r0 = 1
                r2[r0] = r1
                r0 = 2
                r2[r0] = r3
                r0 = 3
                r2[r0] = r5
                r0 = 4
                r2[r0] = r7
                r0 = 5
                r2[r0] = r9
                r0 = 6
                r2[r0] = r11
                r0 = 7
                r2[r0] = r13
                r0 = 8
                r2[r0] = r15
                r0 = 9
                r2[r0] = r14
                r0 = 10
                r2[r0] = r12
                r0 = 11
                r2[r0] = r10
                r0 = 12
                r2[r0] = r8
                r0 = 13
                r2[r0] = r17
                r2[r6] = r4
                io.realm.RealmMapEntrySet.IteratorType.$VALUES = r2
                return
        }

        private IteratorType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.RealmMapEntrySet.IteratorType valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.RealmMapEntrySet$IteratorType> r0 = io.realm.RealmMapEntrySet.IteratorType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.RealmMapEntrySet$IteratorType r1 = (io.realm.RealmMapEntrySet.IteratorType) r1
                return r1
        }

        public static io.realm.RealmMapEntrySet.IteratorType[] values() {
                io.realm.RealmMapEntrySet$IteratorType[] r0 = io.realm.RealmMapEntrySet.IteratorType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.RealmMapEntrySet$IteratorType[] r0 = (io.realm.RealmMapEntrySet.IteratorType[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LongValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Long> {
        public LongValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Long> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.lang.Long r0 = (java.lang.Long) r0
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1.<init>(r3, r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ObjectIdValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, org.bson.types.ObjectId> {
        public ObjectIdValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, org.bson.types.ObjectId> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                org.bson.types.ObjectId r3 = (org.bson.types.ObjectId) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RealmAnyValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, io.realm.RealmAny> {
        public RealmAnyValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, io.realm.RealmAny> getEntryInternal(int r4) {
                r3 = this;
                io.realm.internal.OsMap r0 = r3.osMap
                io.realm.internal.util.Pair r4 = r0.getKeyRealmAnyPair(r4)
                F r0 = r4.first
                S r4 = r4.second
                io.realm.internal.core.NativeRealmAny r4 = (io.realm.internal.core.NativeRealmAny) r4
                io.realm.RealmAny r1 = new io.realm.RealmAny
                io.realm.BaseRealm r2 = r3.baseRealm
                io.realm.RealmAnyOperator r4 = io.realm.RealmAnyOperator.fromNativeRealmAny(r2, r4)
                r1.<init>(r4)
                java.util.AbstractMap$SimpleImmutableEntry r4 = new java.util.AbstractMap$SimpleImmutableEntry
                r4.<init>(r0, r1)
                return r4
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RealmModelValueIterator<K, V> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, V> {
        private final io.realm.TypeSelectorForMap<K, V> typeSelectorForMap;

        public RealmModelValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2, io.realm.TypeSelectorForMap<K, V> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.typeSelectorForMap = r3
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, V> getEntryInternal(int r6) {
                r5 = this;
                io.realm.internal.OsMap r0 = r5.osMap
                io.realm.internal.util.Pair r6 = r0.getKeyObjRowPair(r6)
                F r0 = r6.first
                S r6 = r6.second
                java.lang.Long r6 = (java.lang.Long) r6
                long r1 = r6.longValue()
                r3 = -1
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 != 0) goto L1d
                java.util.AbstractMap$SimpleImmutableEntry r6 = new java.util.AbstractMap$SimpleImmutableEntry
                r1 = 0
                r6.<init>(r0, r1)
                return r6
            L1d:
                io.realm.TypeSelectorForMap<K, V> r6 = r5.typeSelectorForMap
                io.realm.BaseRealm r3 = r5.baseRealm
                java.util.Map$Entry r6 = r6.getModelEntry(r3, r1, r0)
                return r6
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ShortValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.Short> {
        public ShortValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.Short> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.lang.Long r0 = (java.lang.Long) r0
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                short r0 = r0.shortValue()
                java.lang.Short r0 = java.lang.Short.valueOf(r0)
                r1.<init>(r3, r0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class StringValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.lang.String> {
        public StringValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.lang.String> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                java.lang.String r3 = (java.lang.String) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class UUIDValueIterator<K> extends io.realm.RealmMapEntrySet.EntrySetIterator<K, java.util.UUID> {
        public UUIDValueIterator(io.realm.internal.OsMap r1, io.realm.BaseRealm r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public final java.util.Map.Entry<K, java.util.UUID> getEntryInternal(int r3) {
                r2 = this;
                io.realm.internal.OsMap r0 = r2.osMap
                io.realm.internal.util.Pair r3 = r0.getEntryForPrimitive(r3)
                S r0 = r3.second
                if (r0 != 0) goto L13
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r3 = r3.first
                r1 = 0
                r0.<init>(r3, r1)
                return r0
            L13:
                java.util.AbstractMap$SimpleImmutableEntry r0 = new java.util.AbstractMap$SimpleImmutableEntry
                F r1 = r3.first
                S r3 = r3.second
                java.util.UUID r3 = (java.util.UUID) r3
                r0.<init>(r1, r3)
                return r0
        }
    }

    public RealmMapEntrySet(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, io.realm.RealmMapEntrySet.IteratorType r3, io.realm.EqualsHelper r4) {
            r0 = this;
            r0.<init>()
            r0.baseRealm = r1
            r0.osMap = r2
            r0.iteratorType = r3
            r0.equalsHelper = r4
            r1 = 0
            r0.typeSelectorForMap = r1
            return
    }

    public RealmMapEntrySet(io.realm.BaseRealm r1, io.realm.internal.OsMap r2, io.realm.RealmMapEntrySet.IteratorType r3, @org.jetbrains.annotations.Nullable io.realm.TypeSelectorForMap<K, V> r4) {
            r0 = this;
            r0.<init>()
            r0.baseRealm = r1
            r0.osMap = r2
            r0.iteratorType = r3
            io.realm.GenericEquals r1 = new io.realm.GenericEquals
            r1.<init>()
            r0.equalsHelper = r1
            r0.typeSelectorForMap = r4
            return
    }

    private static <K, V> io.realm.RealmMapEntrySet.EntrySetIterator<K, V> iteratorFactory(io.realm.RealmMapEntrySet.IteratorType r1, io.realm.internal.OsMap r2, io.realm.BaseRealm r3, @org.jetbrains.annotations.Nullable io.realm.TypeSelectorForMap r4) {
            int[] r0 = io.realm.RealmMapEntrySet.AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L71;
                case 2: goto L6b;
                case 3: goto L65;
                case 4: goto L5f;
                case 5: goto L59;
                case 6: goto L53;
                case 7: goto L4d;
                case 8: goto L47;
                case 9: goto L41;
                case 10: goto L3b;
                case 11: goto L35;
                case 12: goto L2f;
                case 13: goto L29;
                case 14: goto L23;
                case 15: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid iterator type."
            r1.<init>(r2)
            throw r1
        L13:
            if (r4 == 0) goto L1b
            io.realm.RealmMapEntrySet$RealmModelValueIterator r1 = new io.realm.RealmMapEntrySet$RealmModelValueIterator
            r1.<init>(r2, r3, r4)
            return r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Missing class container when creating RealmModelValueIterator."
            r1.<init>(r2)
            throw r1
        L23:
            io.realm.RealmMapEntrySet$RealmAnyValueIterator r1 = new io.realm.RealmMapEntrySet$RealmAnyValueIterator
            r1.<init>(r2, r3)
            return r1
        L29:
            io.realm.RealmMapEntrySet$UUIDValueIterator r1 = new io.realm.RealmMapEntrySet$UUIDValueIterator
            r1.<init>(r2, r3)
            return r1
        L2f:
            io.realm.RealmMapEntrySet$ObjectIdValueIterator r1 = new io.realm.RealmMapEntrySet$ObjectIdValueIterator
            r1.<init>(r2, r3)
            return r1
        L35:
            io.realm.RealmMapEntrySet$BinaryValueIterator r1 = new io.realm.RealmMapEntrySet$BinaryValueIterator
            r1.<init>(r2, r3)
            return r1
        L3b:
            io.realm.RealmMapEntrySet$Decimal128ValueIterator r1 = new io.realm.RealmMapEntrySet$Decimal128ValueIterator
            r1.<init>(r2, r3)
            return r1
        L41:
            io.realm.RealmMapEntrySet$DateValueIterator r1 = new io.realm.RealmMapEntrySet$DateValueIterator
            r1.<init>(r2, r3)
            return r1
        L47:
            io.realm.RealmMapEntrySet$BooleanValueIterator r1 = new io.realm.RealmMapEntrySet$BooleanValueIterator
            r1.<init>(r2, r3)
            return r1
        L4d:
            io.realm.RealmMapEntrySet$StringValueIterator r1 = new io.realm.RealmMapEntrySet$StringValueIterator
            r1.<init>(r2, r3)
            return r1
        L53:
            io.realm.RealmMapEntrySet$DoubleValueIterator r1 = new io.realm.RealmMapEntrySet$DoubleValueIterator
            r1.<init>(r2, r3)
            return r1
        L59:
            io.realm.RealmMapEntrySet$FloatValueIterator r1 = new io.realm.RealmMapEntrySet$FloatValueIterator
            r1.<init>(r2, r3)
            return r1
        L5f:
            io.realm.RealmMapEntrySet$IntegerValueIterator r1 = new io.realm.RealmMapEntrySet$IntegerValueIterator
            r1.<init>(r2, r3)
            return r1
        L65:
            io.realm.RealmMapEntrySet$ShortValueIterator r1 = new io.realm.RealmMapEntrySet$ShortValueIterator
            r1.<init>(r2, r3)
            return r1
        L6b:
            io.realm.RealmMapEntrySet$ByteValueIterator r1 = new io.realm.RealmMapEntrySet$ByteValueIterator
            r1.<init>(r2, r3)
            return r1
        L71:
            io.realm.RealmMapEntrySet$LongValueIterator r1 = new io.realm.RealmMapEntrySet$LongValueIterator
            r1.<init>(r2, r3)
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    public boolean add(java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This set is immutable and cannot be modified."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This set is immutable and cannot be modified."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This set is immutable and cannot be modified."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
            r8 = this;
            java.util.Iterator r0 = r8.iterator()
        L4:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r3 = 1
            if (r1 != 0) goto L17
            if (r9 != 0) goto L17
            return r3
        L17:
            boolean r4 = r9 instanceof java.util.Map.Entry
            if (r4 == 0) goto L42
            if (r1 == 0) goto L4
            io.realm.EqualsHelper<K, V> r4 = r8.equalsHelper
            r5 = r9
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Objects.requireNonNull(r4)
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r7 = r1.getKey()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L3f
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r2 = r5.getValue()
            boolean r2 = r4.compareInternal(r1, r2)
        L3f:
            if (r2 == 0) goto L4
            return r3
        L42:
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb
            boolean r4 = r3.isEmpty()
            return r4
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 == 0) goto L26
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto Lf
        L26:
            return r2
        L27:
            r4 = 1
            return r4
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r5 = this;
            io.realm.internal.OsMap r0 = r5.osMap
            long r0 = r0.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r4 = this;
            io.realm.RealmMapEntrySet$IteratorType r0 = r4.iteratorType
            io.realm.internal.OsMap r1 = r4.osMap
            io.realm.BaseRealm r2 = r4.baseRealm
            io.realm.TypeSelectorForMap<K, V> r3 = r4.typeSelectorForMap
            io.realm.RealmMapEntrySet$EntrySetIterator r0 = iteratorFactory(r0, r1, r2, r3)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This set is immutable and cannot be modified."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This set is immutable and cannot be modified."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This set is immutable and cannot be modified."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
            r5 = this;
            io.realm.internal.OsMap r0 = r5.osMap
            long r0 = r0.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            int r1 = (int) r0
            goto L12
        Lf:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L12:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r4 = this;
            io.realm.internal.OsMap r0 = r4.osMap
            long r0 = r0.size()
            int r1 = (int) r0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.util.Iterator r1 = r4.iterator()
            r2 = 0
        Le:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto Le
        L1f:
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r7) {
            r6 = this;
            io.realm.internal.OsMap r0 = r6.osMap
            long r0 = r0.size()
            int r2 = r7.length
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L1d
            int r2 = r7.length
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L13
            goto L1d
        L13:
            java.lang.Class<java.util.Map$Entry> r2 = java.util.Map.Entry.class
            int r3 = (int) r0
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            goto L1e
        L1d:
            r2 = r7
        L1e:
            r3 = 0
            java.util.Iterator r4 = r6.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r2[r3] = r5
            int r3 = r3 + 1
            goto L23
        L34:
            int r7 = r7.length
            long r4 = (long) r7
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L3d
            r7 = 0
            r2[r3] = r7
        L3d:
            return r2
    }
}
