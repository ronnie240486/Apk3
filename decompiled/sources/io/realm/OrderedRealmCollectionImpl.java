package io.realm;

/* JADX INFO: loaded from: classes2.dex */
abstract class OrderedRealmCollectionImpl<E> extends java.util.AbstractList<E> implements io.realm.OrderedRealmCollection<E> {
    private static final java.lang.String NOT_SUPPORTED_MESSAGE = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.";
    public final io.realm.BaseRealm baseRealm;

    @javax.annotation.Nullable
    public final java.lang.String className;

    @javax.annotation.Nullable
    public final java.lang.Class<E> classSpec;
    public final io.realm.OrderedRealmCollectionImpl.CollectionOperator<E> operator;
    public final io.realm.internal.OsResults osResults;

    /* JADX INFO: loaded from: classes3.dex */
    public static class ByteValueOperator extends io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator<java.lang.Byte> {
        public ByteValueOperator(io.realm.BaseRealm r2, io.realm.internal.OsResults r3, @javax.annotation.Nullable java.lang.String r4) {
                r1 = this;
                java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
                r1.<init>(r2, r3, r0, r4)
                return
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public java.lang.Byte get(int r2) {
                r1 = this;
                io.realm.internal.OsResults r0 = r1.osResults
                java.lang.Object r2 = r0.getValue(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                byte r2 = r2.byteValue()
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                return r2
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Byte r1 = r0.get(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public java.lang.Byte getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Object r1 = r2.getValue(r1)
                java.lang.Long r1 = (java.lang.Long) r1
                if (r1 != 0) goto La
                r1 = 0
                return r1
            La:
                byte r1 = r1.byteValue()
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Byte r1 = r0.getFromResults(r1, r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class CollectionOperator<T> {
        public final io.realm.BaseRealm baseRealm;

        @javax.annotation.Nullable
        public final java.lang.String className;

        @javax.annotation.Nullable
        public final java.lang.Class<T> classSpec;
        public final io.realm.internal.OsResults osResults;

        public CollectionOperator(io.realm.BaseRealm r1, io.realm.internal.OsResults r2, @javax.annotation.Nullable java.lang.Class<T> r3, @javax.annotation.Nullable java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.baseRealm = r1
                r0.osResults = r2
                r0.classSpec = r3
                r0.className = r4
                return
        }

        public abstract T convertRowToObject(io.realm.internal.UncheckedRow r1);

        public final T convertToObject(@javax.annotation.Nullable io.realm.internal.UncheckedRow r2, boolean r3, @javax.annotation.Nullable T r4) {
                r1 = this;
                if (r2 == 0) goto Ld
                io.realm.BaseRealm r3 = r1.baseRealm
                java.lang.Class<T> r4 = r1.classSpec
                java.lang.String r0 = r1.className
                io.realm.RealmModel r2 = r3.get(r4, r0, r2)
                return r2
            Ld:
                if (r3 != 0) goto L10
                return r4
            L10:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.String r3 = "No results were found."
                r2.<init>(r3)
                throw r2
        }

        @javax.annotation.Nullable
        public abstract T firstImpl(boolean r1, @javax.annotation.Nullable T r2);

        public abstract T get(int r1);

        public abstract T getFromResults(int r1, io.realm.internal.OsResults r2);

        @javax.annotation.Nullable
        public abstract T lastImpl(boolean r1, @javax.annotation.Nullable T r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class IntegerValueOperator extends io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator<java.lang.Integer> {
        public IntegerValueOperator(io.realm.BaseRealm r2, io.realm.internal.OsResults r3, @javax.annotation.Nullable java.lang.String r4) {
                r1 = this;
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                r1.<init>(r2, r3, r0, r4)
                return
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public java.lang.Integer get(int r2) {
                r1 = this;
                io.realm.internal.OsResults r0 = r1.osResults
                java.lang.Object r2 = r0.getValue(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                int r2 = r2.intValue()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Integer r1 = r0.get(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public java.lang.Integer getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Object r1 = r2.getValue(r1)
                java.lang.Long r1 = (java.lang.Long) r1
                if (r1 != 0) goto La
                r1 = 0
                return r1
            La:
                int r1 = r1.intValue()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Integer r1 = r0.getFromResults(r1, r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ModelCollectionOperator<T> extends io.realm.OrderedRealmCollectionImpl.CollectionOperator<T> {
        public ModelCollectionOperator(io.realm.BaseRealm r1, io.realm.internal.OsResults r2, @javax.annotation.Nullable java.lang.Class<T> r3, @javax.annotation.Nullable java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T convertRowToObject(io.realm.internal.UncheckedRow r4) {
                r3 = this;
                io.realm.BaseRealm r0 = r3.baseRealm
                java.lang.Class<T> r1 = r3.classSpec
                java.lang.String r2 = r3.className
                io.realm.RealmModel r4 = r0.get(r1, r2, r4)
                return r4
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        @javax.annotation.Nullable
        public T firstImpl(boolean r2, @javax.annotation.Nullable T r3) {
                r1 = this;
                io.realm.internal.OsResults r0 = r1.osResults
                io.realm.internal.UncheckedRow r0 = r0.firstUncheckedRow()
                java.lang.Object r2 = r1.convertToObject(r0, r2, r3)
                return r2
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T get(int r5) {
                r4 = this;
                io.realm.BaseRealm r0 = r4.baseRealm
                java.lang.Class<T> r1 = r4.classSpec
                java.lang.String r2 = r4.className
                io.realm.internal.OsResults r3 = r4.osResults
                io.realm.internal.UncheckedRow r5 = r3.getUncheckedRow(r5)
                io.realm.RealmModel r5 = r0.get(r1, r2, r5)
                return r5
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                io.realm.internal.UncheckedRow r1 = r2.getUncheckedRow(r1)
                java.lang.Object r1 = r0.convertRowToObject(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        @javax.annotation.Nullable
        public T lastImpl(boolean r2, @javax.annotation.Nullable T r3) {
                r1 = this;
                io.realm.internal.OsResults r0 = r1.osResults
                io.realm.internal.UncheckedRow r0 = r0.lastUncheckedRow()
                java.lang.Object r2 = r1.convertToObject(r0, r2, r3)
                return r2
        }
    }

    public static class PrimitiveValueOperator<T> extends io.realm.OrderedRealmCollectionImpl.CollectionOperator<T> {
        public PrimitiveValueOperator(io.realm.BaseRealm r1, io.realm.internal.OsResults r2, @javax.annotation.Nullable java.lang.Class<T> r3, @javax.annotation.Nullable java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T convertRowToObject(io.realm.internal.UncheckedRow r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Method 'convertRowToObject' cannot be used on primitive Realm collections."
                r2.<init>(r0)
                throw r2
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        @javax.annotation.Nullable
        public T firstImpl(boolean r5, @javax.annotation.Nullable T r6) {
                r4 = this;
                io.realm.internal.OsResults r5 = r4.osResults
                long r0 = r5.size()
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                io.realm.internal.OsResults r5 = r4.osResults
                r6 = 0
                java.lang.Object r5 = r5.getValue(r6)
                return r5
            L14:
                return r6
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T get(int r2) {
                r1 = this;
                io.realm.internal.OsResults r0 = r1.osResults
                java.lang.Object r2 = r0.getValue(r2)
                return r2
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Object r1 = r2.getValue(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        @javax.annotation.Nullable
        public T lastImpl(boolean r3, @javax.annotation.Nullable T r4) {
                r2 = this;
                io.realm.internal.OsResults r3 = r2.osResults
                long r0 = r3.size()
                int r3 = (int) r0
                if (r3 == 0) goto L12
                io.realm.internal.OsResults r4 = r2.osResults
                int r3 = r3 + (-1)
                java.lang.Object r3 = r4.getValue(r3)
                return r3
            L12:
                return r4
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RealmAnyValueOperator extends io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator<io.realm.RealmAny> {
        public RealmAnyValueOperator(io.realm.BaseRealm r2, io.realm.internal.OsResults r3, @javax.annotation.Nullable java.lang.String r4) {
                r1 = this;
                java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
                r1.<init>(r2, r3, r0, r4)
                return
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public io.realm.RealmAny get(int r3) {
                r2 = this;
                io.realm.internal.OsResults r0 = r2.osResults
                java.lang.Object r3 = r0.getValue(r3)
                io.realm.internal.core.NativeRealmAny r3 = (io.realm.internal.core.NativeRealmAny) r3
                io.realm.RealmAny r0 = new io.realm.RealmAny
                io.realm.BaseRealm r1 = r2.baseRealm
                io.realm.RealmAnyOperator r3 = io.realm.RealmAnyOperator.fromNativeRealmAny(r1, r3)
                r0.<init>(r3)
                return r0
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                io.realm.RealmAny r1 = r0.get(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public io.realm.RealmAny getFromResults(int r2, io.realm.internal.OsResults r3) {
                r1 = this;
                java.lang.Object r2 = r3.getValue(r2)
                io.realm.internal.core.NativeRealmAny r2 = (io.realm.internal.core.NativeRealmAny) r2
                io.realm.RealmAny r3 = new io.realm.RealmAny
                io.realm.BaseRealm r0 = r1.baseRealm
                io.realm.RealmAnyOperator r2 = io.realm.RealmAnyOperator.fromNativeRealmAny(r0, r2)
                r3.<init>(r2)
                return r3
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                io.realm.RealmAny r1 = r0.getFromResults(r1, r2)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class RealmCollectionIterator extends io.realm.internal.OsResults.Iterator<E> {
        public final /* synthetic */ io.realm.OrderedRealmCollectionImpl this$0;

        public RealmCollectionIterator(io.realm.OrderedRealmCollectionImpl r1) {
                r0 = this;
                r0.this$0 = r1
                io.realm.internal.OsResults r1 = r1.osResults
                r0.<init>(r1)
                return
        }

        @Override // io.realm.internal.OsResults.Iterator
        public final E getInternal(int r2, io.realm.internal.OsResults r3) {
                r1 = this;
                io.realm.OrderedRealmCollectionImpl r0 = r1.this$0
                io.realm.OrderedRealmCollectionImpl$CollectionOperator<E> r0 = r0.operator
                java.lang.Object r2 = r0.getFromResults(r2, r3)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class RealmCollectionListIterator extends io.realm.internal.OsResults.ListIterator<E> {
        public final /* synthetic */ io.realm.OrderedRealmCollectionImpl this$0;

        public RealmCollectionListIterator(io.realm.OrderedRealmCollectionImpl r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                io.realm.internal.OsResults r1 = r1.osResults
                r0.<init>(r1, r2)
                return
        }

        @Override // io.realm.internal.OsResults.Iterator
        public final E getInternal(int r2, io.realm.internal.OsResults r3) {
                r1 = this;
                io.realm.OrderedRealmCollectionImpl r0 = r1.this$0
                io.realm.OrderedRealmCollectionImpl$CollectionOperator<E> r0 = r0.operator
                java.lang.Object r2 = r0.getFromResults(r2, r3)
                return r2
        }
    }

    public static class ShortValueOperator extends io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator<java.lang.Short> {
        public ShortValueOperator(io.realm.BaseRealm r2, io.realm.internal.OsResults r3, @javax.annotation.Nullable java.lang.String r4) {
                r1 = this;
                java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
                r1.<init>(r2, r3, r0, r4)
                return
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Short r1 = r0.get(r1)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public java.lang.Short get(int r2) {
                r1 = this;
                io.realm.internal.OsResults r0 = r1.osResults
                java.lang.Object r2 = r0.getValue(r2)
                java.lang.Long r2 = (java.lang.Long) r2
                short r2 = r2.shortValue()
                java.lang.Short r2 = java.lang.Short.valueOf(r2)
                return r2
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public /* bridge */ /* synthetic */ java.lang.Object getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Short r1 = r0.getFromResults(r1, r2)
                return r1
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public java.lang.Short getFromResults(int r1, io.realm.internal.OsResults r2) {
                r0 = this;
                java.lang.Object r1 = r2.getValue(r1)
                java.lang.Long r1 = (java.lang.Long) r1
                if (r1 != 0) goto La
                r1 = 0
                return r1
            La:
                short r1 = r1.shortValue()
                java.lang.Short r1 = java.lang.Short.valueOf(r1)
                return r1
        }
    }

    public OrderedRealmCollectionImpl(io.realm.BaseRealm r9, io.realm.internal.OsResults r10, java.lang.Class<E> r11) {
            r8 = this;
            r0 = 0
            r1 = 0
            io.realm.OrderedRealmCollectionImpl$CollectionOperator r7 = getCollectionOperator(r0, r9, r10, r11, r1)
            r6 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public OrderedRealmCollectionImpl(io.realm.BaseRealm r7, io.realm.internal.OsResults r8, java.lang.Class<E> r9, io.realm.OrderedRealmCollectionImpl.CollectionOperator<E> r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private OrderedRealmCollectionImpl(io.realm.BaseRealm r1, io.realm.internal.OsResults r2, @javax.annotation.Nullable java.lang.Class<E> r3, @javax.annotation.Nullable java.lang.String r4, io.realm.OrderedRealmCollectionImpl.CollectionOperator<E> r5) {
            r0 = this;
            r0.<init>()
            r0.baseRealm = r1
            r0.osResults = r2
            r0.classSpec = r3
            r0.className = r4
            r0.operator = r5
            return
    }

    public OrderedRealmCollectionImpl(io.realm.BaseRealm r9, io.realm.internal.OsResults r10, java.lang.String r11) {
            r8 = this;
            r0 = 0
            r1 = 0
            io.realm.OrderedRealmCollectionImpl$CollectionOperator r7 = getCollectionOperator(r0, r9, r10, r1, r11)
            r5 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public OrderedRealmCollectionImpl(io.realm.BaseRealm r7, io.realm.internal.OsResults r8, java.lang.String r9, io.realm.OrderedRealmCollectionImpl.CollectionOperator<E> r10) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @javax.annotation.Nullable
    private E firstImpl(boolean r2, @javax.annotation.Nullable E r3) {
            r1 = this;
            io.realm.OrderedRealmCollectionImpl$CollectionOperator<E> r0 = r1.operator
            java.lang.Object r2 = r0.firstImpl(r2, r3)
            return r2
    }

    public static <T> io.realm.OrderedRealmCollectionImpl.CollectionOperator<T> getCollectionOperator(boolean r4, io.realm.BaseRealm r5, io.realm.internal.OsResults r6, @javax.annotation.Nullable java.lang.Class<T> r7, @javax.annotation.Nullable java.lang.String r8) {
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r4 == 0) goto L30
            if (r7 != r3) goto L12
            io.realm.OrderedRealmCollectionImpl$IntegerValueOperator r4 = new io.realm.OrderedRealmCollectionImpl$IntegerValueOperator
            r4.<init>(r5, r6, r8)
            return r4
        L12:
            if (r7 != r2) goto L1a
            io.realm.OrderedRealmCollectionImpl$ShortValueOperator r4 = new io.realm.OrderedRealmCollectionImpl$ShortValueOperator
            r4.<init>(r5, r6, r8)
            return r4
        L1a:
            if (r7 != r1) goto L22
            io.realm.OrderedRealmCollectionImpl$ByteValueOperator r4 = new io.realm.OrderedRealmCollectionImpl$ByteValueOperator
            r4.<init>(r5, r6, r8)
            return r4
        L22:
            if (r7 != r0) goto L2a
            io.realm.OrderedRealmCollectionImpl$RealmAnyValueOperator r4 = new io.realm.OrderedRealmCollectionImpl$RealmAnyValueOperator
            r4.<init>(r5, r6, r8)
            return r4
        L2a:
            io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator r4 = new io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator
            r4.<init>(r5, r6, r7, r8)
            return r4
        L30:
            io.realm.OrderedRealmCollectionImpl$ModelCollectionOperator r4 = new io.realm.OrderedRealmCollectionImpl$ModelCollectionOperator
            r4.<init>(r5, r6, r7, r8)
            return r4
    }

    private long getColumnKeyForSort(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L41
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L41
            java.lang.String r0 = "."
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L35
            io.realm.internal.OsResults r0 = r5.osResults
            io.realm.internal.Table r0 = r0.getTable()
            long r0 = r0.getColumnKey(r6)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L21
            return r0
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "Field '%s' does not exist."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Aggregates on child object fields are not supported: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6)
            r0.<init>(r6)
            throw r0
        L41:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-empty field name required."
            r6.<init>(r0)
            throw r6
    }

    @javax.annotation.Nullable
    private E lastImpl(boolean r2, @javax.annotation.Nullable E r3) {
            r1 = this;
            io.realm.OrderedRealmCollectionImpl$CollectionOperator<E> r0 = r1.operator
            java.lang.Object r2 = r0.lastImpl(r2, r3)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public boolean add(E r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.realm.RealmCollection
    public double average(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValid()
            long r0 = r3.getColumnKeyForSort(r4)
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.OsResults$Aggregate r2 = io.realm.internal.OsResults.Aggregate.AVERAGE
            java.lang.Number r4 = r4.aggregateNumber(r2, r0)
            double r0 = r4.doubleValue()
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public boolean contains(@javax.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.isLoaded()
            r1 = 0
            if (r0 == 0) goto L4c
            boolean r0 = r6 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L1b
            r0 = r6
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.InvalidRow r2 = io.realm.internal.InvalidRow.INSTANCE
            if (r0 != r2) goto L1b
            return r1
        L1b:
            java.util.Iterator r0 = r5.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof byte[]
            r4 = 1
            if (r3 == 0) goto L3e
            boolean r3 = r6 instanceof byte[]
            if (r3 == 0) goto L3e
            byte[] r2 = (byte[]) r2
            r3 = r6
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L1f
            return r4
        L3e:
            if (r2 == 0) goto L47
            boolean r3 = r2.equals(r6)
            if (r3 == 0) goto L47
            return r4
        L47:
            if (r2 != 0) goto L1f
            if (r6 != 0) goto L1f
            return r4
        L4c:
            return r1
    }

    public final io.realm.RealmResults<E> createLoadedResults(io.realm.internal.OsResults r4) {
            r3 = this;
            java.lang.String r0 = r3.className
            if (r0 == 0) goto Lc
            io.realm.RealmResults r1 = new io.realm.RealmResults
            io.realm.BaseRealm r2 = r3.baseRealm
            r1.<init>(r2, r4, r0)
            goto L15
        Lc:
            io.realm.RealmResults r1 = new io.realm.RealmResults
            io.realm.BaseRealm r0 = r3.baseRealm
            java.lang.Class<E> r2 = r3.classSpec
            r1.<init>(r0, r4, r2)
        L15:
            r1.load()
            return r1
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.OrderedRealmCollectionSnapshot<E> createSnapshot() {
            r4 = this;
            java.lang.String r0 = r4.className
            if (r0 == 0) goto Le
            io.realm.OrderedRealmCollectionSnapshot r1 = new io.realm.OrderedRealmCollectionSnapshot
            io.realm.BaseRealm r2 = r4.baseRealm
            io.realm.internal.OsResults r3 = r4.osResults
            r1.<init>(r2, r3, r0)
            return r1
        Le:
            io.realm.OrderedRealmCollectionSnapshot r0 = new io.realm.OrderedRealmCollectionSnapshot
            io.realm.BaseRealm r1 = r4.baseRealm
            io.realm.internal.OsResults r2 = r4.osResults
            java.lang.Class<E> r3 = r4.classSpec
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            int r0 = r1.size()
            if (r0 <= 0) goto L12
            io.realm.internal.OsResults r0 = r1.osResults
            r0.clear()
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r1.osResults
            boolean r0 = r0.deleteFirst()
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    public void deleteFromRealm(int r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r3.osResults
            long r1 = (long) r4
            r0.delete(r1)
            return
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValidAndInTransaction()
            io.realm.internal.OsResults r0 = r1.osResults
            boolean r0 = r0.deleteLast()
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E first() {
            r2 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r0 = r2.firstImpl(r0, r1)
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E first(@javax.annotation.Nullable E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.firstImpl(r0, r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    @javax.annotation.Nullable
    public E get(int r2) {
            r1 = this;
            io.realm.BaseRealm r0 = r1.baseRealm
            r0.checkIfValid()
            io.realm.OrderedRealmCollectionImpl$CollectionOperator<E> r0 = r1.operator
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public io.realm.Realm getRealm() {
            r2 = this;
            io.realm.BaseRealm r0 = r2.baseRealm
            r0.checkIfValid()
            io.realm.BaseRealm r0 = r2.baseRealm
            boolean r1 = r0 instanceof io.realm.Realm
            if (r1 == 0) goto Le
            io.realm.Realm r0 = (io.realm.Realm) r0
            return r0
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This method is only available for typed Realms"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isManaged() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isValid() {
            r1 = this;
            io.realm.internal.OsResults r0 = r1.osResults
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
            r1 = this;
            io.realm.OrderedRealmCollectionImpl$RealmCollectionIterator r0 = new io.realm.OrderedRealmCollectionImpl$RealmCollectionIterator
            r0.<init>(r1)
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E last() {
            r2 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r0 = r2.lastImpl(r0, r1)
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    @javax.annotation.Nullable
    public E last(@javax.annotation.Nullable E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.lastImpl(r0, r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator() {
            r2 = this;
            io.realm.OrderedRealmCollectionImpl$RealmCollectionListIterator r0 = new io.realm.OrderedRealmCollectionImpl$RealmCollectionListIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            io.realm.OrderedRealmCollectionImpl$RealmCollectionListIterator r0 = new io.realm.OrderedRealmCollectionImpl$RealmCollectionListIterator
            r0.<init>(r1, r2)
            return r0
    }

    @Override // io.realm.RealmCollection
    public java.lang.Number max(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValid()
            long r0 = r3.getColumnKeyForSort(r4)
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.OsResults$Aggregate r2 = io.realm.internal.OsResults.Aggregate.MAXIMUM
            java.lang.Number r4 = r4.aggregateNumber(r2, r0)
            return r4
    }

    @Override // io.realm.RealmCollection
    @javax.annotation.Nullable
    public java.util.Date maxDate(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValid()
            long r0 = r3.getColumnKeyForSort(r4)
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.OsResults$Aggregate r2 = io.realm.internal.OsResults.Aggregate.MAXIMUM
            java.util.Date r4 = r4.aggregateDate(r2, r0)
            return r4
    }

    @Override // io.realm.RealmCollection
    public java.lang.Number min(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValid()
            long r0 = r3.getColumnKeyForSort(r4)
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.OsResults$Aggregate r2 = io.realm.internal.OsResults.Aggregate.MINIMUM
            java.lang.Number r4 = r4.aggregateNumber(r2, r0)
            return r4
    }

    @Override // io.realm.RealmCollection
    public java.util.Date minDate(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValid()
            long r0 = r3.getColumnKeyForSort(r4)
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.OsResults$Aggregate r2 = io.realm.internal.OsResults.Aggregate.MINIMUM
            java.util.Date r4 = r4.aggregateDate(r2, r0)
            return r4
    }

    @Override // java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public E remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @java.lang.Deprecated
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.AbstractList, java.util.List
    @java.lang.Deprecated
    public E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'."
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r5 = this;
            boolean r0 = r5.isLoaded()
            if (r0 == 0) goto L19
            io.realm.internal.OsResults r0 = r5.osResults
            long r0 = r0.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L18
        L17:
            int r0 = (int) r0
        L18:
            return r0
        L19:
            r0 = 0
            return r0
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r4) {
            r3 = this;
            io.realm.internal.OsResults r0 = r3.osResults
            io.realm.BaseRealm r1 = r3.baseRealm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.Sort r2 = io.realm.Sort.ASCENDING
            io.realm.internal.OsResults r4 = r0.sort(r1, r4, r2)
            io.realm.RealmResults r4 = r3.createLoadedResults(r4)
            return r4
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r3, io.realm.Sort r4) {
            r2 = this;
            io.realm.internal.OsResults r0 = r2.osResults
            io.realm.BaseRealm r1 = r2.baseRealm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.internal.OsResults r3 = r0.sort(r1, r3, r4)
            io.realm.RealmResults r3 = r2.createLoadedResults(r3)
            return r3
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String r4, io.realm.Sort r5, java.lang.String r6, io.realm.Sort r7) {
            r3 = this;
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r6
            io.realm.Sort[] r6 = new io.realm.Sort[r0]
            r6[r2] = r5
            r6[r4] = r7
            io.realm.RealmResults r4 = r3.sort(r1, r6)
            return r4
    }

    @Override // io.realm.OrderedRealmCollection
    public io.realm.RealmResults<E> sort(java.lang.String[] r3, io.realm.Sort[] r4) {
            r2 = this;
            io.realm.internal.OsResults r0 = r2.osResults
            io.realm.BaseRealm r1 = r2.baseRealm
            io.realm.RealmSchema r1 = r1.getSchema()
            io.realm.internal.objectstore.OsKeyPathMapping r1 = r1.getKeyPathMapping()
            io.realm.internal.OsResults r3 = r0.sort(r1, r3, r4)
            io.realm.RealmResults r3 = r2.createLoadedResults(r3)
            return r3
    }

    @Override // io.realm.RealmCollection
    public java.lang.Number sum(java.lang.String r4) {
            r3 = this;
            io.realm.BaseRealm r0 = r3.baseRealm
            r0.checkIfValid()
            long r0 = r3.getColumnKeyForSort(r4)
            io.realm.internal.OsResults r4 = r3.osResults
            io.realm.internal.OsResults$Aggregate r2 = io.realm.internal.OsResults.Aggregate.SUM
            java.lang.Number r4 = r4.aggregateNumber(r2, r0)
            return r4
    }
}
