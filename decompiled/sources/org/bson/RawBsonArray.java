package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class RawBsonArray extends org.bson.BsonArray implements java.io.Serializable {
    private static final java.lang.String IMMUTABLE_MSG = "RawBsonArray instances are immutable";
    private static final long serialVersionUID = 2;
    private final transient org.bson.RawBsonArray.RawBsonArrayList delegate;

    /* JADX INFO: loaded from: classes3.dex */
    public static class RawBsonArrayList extends java.util.AbstractList<org.bson.BsonValue> {
        private static final int MIN_BSON_ARRAY_SIZE = 5;
        private final byte[] bytes;
        private java.lang.Integer cachedSize;
        private final int length;
        private final int offset;

        public class Itr implements java.util.Iterator<org.bson.BsonValue> {
            private org.bson.BsonBinaryReader bsonReader;
            private int currentPosition;
            private int cursor;
            public final /* synthetic */ org.bson.RawBsonArray.RawBsonArrayList this$0;

            public Itr(org.bson.RawBsonArray.RawBsonArrayList r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r1 = 0
                    r0.cursor = r1
                    r0.currentPosition = r1
                    r0.setIterator(r1)
                    return
            }

            public Itr(org.bson.RawBsonArray.RawBsonArrayList r1, int r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r1 = 0
                    r0.cursor = r1
                    r0.currentPosition = r1
                    r0.setIterator(r2)
                    return
            }

            public int getCursor() {
                    r1 = this;
                    int r0 = r1.cursor
                    return r0
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.cursor
                    org.bson.RawBsonArray$RawBsonArrayList r1 = r2.this$0
                    int r1 = r1.size()
                    if (r0 == r1) goto Lc
                    r0 = 1
                    goto Ld
                Lc:
                    r0 = 0
                Ld:
                    if (r0 != 0) goto L14
                    org.bson.BsonBinaryReader r1 = r2.bsonReader
                    r1.close()
                L14:
                    return r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ org.bson.BsonValue next() {
                    r1 = this;
                    org.bson.BsonValue r0 = r1.next2()
                    return r0
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
            public org.bson.BsonValue next2() {
                    r2 = this;
                L0:
                    int r0 = r2.cursor
                    int r1 = r2.currentPosition
                    if (r0 <= r1) goto L21
                    org.bson.BsonBinaryReader r0 = r2.bsonReader
                    org.bson.BsonType r0 = r0.readBsonType()
                    org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
                    if (r0 == r1) goto L21
                    org.bson.BsonBinaryReader r0 = r2.bsonReader
                    r0.skipName()
                    org.bson.BsonBinaryReader r0 = r2.bsonReader
                    r0.skipValue()
                    int r0 = r2.currentPosition
                    int r0 = r0 + 1
                    r2.currentPosition = r0
                    goto L0
                L21:
                    org.bson.BsonBinaryReader r0 = r2.bsonReader
                    org.bson.BsonType r0 = r0.readBsonType()
                    org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
                    if (r0 == r1) goto L45
                    org.bson.BsonBinaryReader r0 = r2.bsonReader
                    r0.skipName()
                    int r0 = r2.cursor
                    int r0 = r0 + 1
                    r2.cursor = r0
                    r2.currentPosition = r0
                    org.bson.RawBsonArray$RawBsonArrayList r0 = r2.this$0
                    byte[] r0 = org.bson.RawBsonArray.RawBsonArrayList.access$000(r0)
                    org.bson.BsonBinaryReader r1 = r2.bsonReader
                    org.bson.BsonValue r0 = org.bson.RawBsonValueHelper.decode(r0, r1)
                    return r0
                L45:
                    org.bson.BsonBinaryReader r0 = r2.bsonReader
                    r0.close()
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "RawBsonArray instances are immutable"
                    r0.<init>(r1)
                    throw r0
            }

            public void setCursor(int r1) {
                    r0 = this;
                    r0.cursor = r1
                    return
            }

            public final void setIterator(int r1) {
                    r0 = this;
                    r0.cursor = r1
                    r1 = 0
                    r0.currentPosition = r1
                    org.bson.BsonBinaryReader r1 = r0.bsonReader
                    if (r1 == 0) goto Lc
                    r1.close()
                Lc:
                    org.bson.RawBsonArray$RawBsonArrayList r1 = r0.this$0
                    org.bson.BsonBinaryReader r1 = org.bson.RawBsonArray.RawBsonArrayList.access$300(r1)
                    r0.bsonReader = r1
                    r1.readStartDocument()
                    return
            }
        }

        /* JADX INFO: loaded from: classes.dex */
        public class ListItr extends org.bson.RawBsonArray.RawBsonArrayList.Itr implements java.util.ListIterator<org.bson.BsonValue> {
            public final /* synthetic */ org.bson.RawBsonArray.RawBsonArrayList this$0;

            public ListItr(org.bson.RawBsonArray.RawBsonArrayList r1, int r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.util.ListIterator
            public /* bridge */ /* synthetic */ void add(org.bson.BsonValue r1) {
                    r0 = this;
                    org.bson.BsonValue r1 = (org.bson.BsonValue) r1
                    r0.add2(r1)
                    return
            }

            /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
            public void add2(org.bson.BsonValue r2) {
                    r1 = this;
                    java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                    java.lang.String r0 = "RawBsonArray instances are immutable"
                    r2.<init>(r0)
                    throw r2
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                    r1 = this;
                    int r0 = r1.getCursor()
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                    r1 = this;
                    int r0 = r1.getCursor()
                    return r0
            }

            @Override // java.util.ListIterator
            public /* bridge */ /* synthetic */ org.bson.BsonValue previous() {
                    r1 = this;
                    org.bson.BsonValue r0 = r1.previous2()
                    return r0
            }

            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: previous, reason: avoid collision after fix types in other method */
            public org.bson.BsonValue previous2() {
                    r2 = this;
                    org.bson.RawBsonArray$RawBsonArrayList r0 = r2.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L12
                    int r1 = r2.previousIndex()     // Catch: java.lang.IndexOutOfBoundsException -> L12
                    org.bson.BsonValue r0 = r0.get(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L12
                    int r1 = r2.previousIndex()     // Catch: java.lang.IndexOutOfBoundsException -> L12
                    r2.setIterator(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L12
                    return r0
                L12:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                    r1 = this;
                    int r0 = r1.getCursor()
                    int r0 = r0 + (-1)
                    return r0
            }

            @Override // java.util.ListIterator
            public /* bridge */ /* synthetic */ void set(org.bson.BsonValue r1) {
                    r0 = this;
                    org.bson.BsonValue r1 = (org.bson.BsonValue) r1
                    r0.set2(r1)
                    return
            }

            /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
            public void set2(org.bson.BsonValue r2) {
                    r1 = this;
                    java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                    java.lang.String r0 = "RawBsonArray instances are immutable"
                    r2.<init>(r0)
                    throw r2
            }
        }

        public RawBsonArrayList(byte[] r5, int r6, int r7) {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = "bytes"
                org.bson.assertions.Assertions.notNull(r0, r5)
                r0 = 1
                r1 = 0
                if (r6 < 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                java.lang.String r3 = "offset >= 0"
                org.bson.assertions.Assertions.isTrueArgument(r3, r2)
                int r2 = r5.length
                if (r6 >= r2) goto L19
                r2 = 1
                goto L1a
            L19:
                r2 = 0
            L1a:
                java.lang.String r3 = "offset < bytes.length"
                org.bson.assertions.Assertions.isTrueArgument(r3, r2)
                int r2 = r5.length
                int r2 = r2 - r6
                if (r7 > r2) goto L25
                r2 = 1
                goto L26
            L25:
                r2 = 0
            L26:
                java.lang.String r3 = "length <= bytes.length - offset"
                org.bson.assertions.Assertions.isTrueArgument(r3, r2)
                r2 = 5
                if (r7 < r2) goto L2f
                goto L30
            L2f:
                r0 = 0
            L30:
                java.lang.String r1 = "length >= 5"
                org.bson.assertions.Assertions.isTrueArgument(r1, r0)
                r4.bytes = r5
                r4.offset = r6
                r4.length = r7
                return
        }

        public static /* synthetic */ byte[] access$000(org.bson.RawBsonArray.RawBsonArrayList r0) {
                byte[] r0 = r0.bytes
                return r0
        }

        public static /* synthetic */ int access$100(org.bson.RawBsonArray.RawBsonArrayList r0) {
                int r0 = r0.offset
                return r0
        }

        public static /* synthetic */ int access$200(org.bson.RawBsonArray.RawBsonArrayList r0) {
                int r0 = r0.length
                return r0
        }

        public static /* synthetic */ org.bson.BsonBinaryReader access$300(org.bson.RawBsonArray.RawBsonArrayList r0) {
                org.bson.BsonBinaryReader r0 = r0.createReader()
                return r0
        }

        private org.bson.BsonBinaryReader createReader() {
                r5 = this;
                org.bson.BsonBinaryReader r0 = new org.bson.BsonBinaryReader
                org.bson.io.ByteBufferBsonInput r1 = new org.bson.io.ByteBufferBsonInput
                byte[] r2 = r5.bytes
                int r3 = r5.offset
                int r4 = r5.length
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2, r3, r4)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                r2.order(r3)
                org.bson.ByteBufNIO r3 = new org.bson.ByteBufNIO
                r3.<init>(r2)
                r1.<init>(r3)
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                org.bson.BsonValue r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public org.bson.BsonValue get(int r5) {
                r4 = this;
                if (r5 < 0) goto L38
                r0 = 0
                org.bson.BsonBinaryReader r1 = r4.createReader()
                r1.readStartDocument()     // Catch: java.lang.Throwable -> L33
            La:
                org.bson.BsonType r2 = r1.readBsonType()     // Catch: java.lang.Throwable -> L33
                org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L33
                if (r2 == r3) goto L27
                r1.skipName()     // Catch: java.lang.Throwable -> L33
                if (r0 != r5) goto L21
                byte[] r5 = r4.bytes     // Catch: java.lang.Throwable -> L33
                org.bson.BsonValue r5 = org.bson.RawBsonValueHelper.decode(r5, r1)     // Catch: java.lang.Throwable -> L33
                r1.close()
                return r5
            L21:
                r1.skipValue()     // Catch: java.lang.Throwable -> L33
                int r0 = r0 + 1
                goto La
            L27:
                r1.readEndDocument()     // Catch: java.lang.Throwable -> L33
                r1.close()
                java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
                r5.<init>()
                throw r5
            L33:
                r5 = move-exception
                r1.close()
                throw r5
            L38:
                java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
                r5.<init>()
                throw r5
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<org.bson.BsonValue> iterator() {
                r1 = this;
                org.bson.RawBsonArray$RawBsonArrayList$Itr r0 = new org.bson.RawBsonArray$RawBsonArrayList$Itr
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<org.bson.BsonValue> listIterator() {
                r2 = this;
                org.bson.RawBsonArray$RawBsonArrayList$ListItr r0 = new org.bson.RawBsonArray$RawBsonArrayList$ListItr
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<org.bson.BsonValue> listIterator(int r2) {
                r1 = this;
                org.bson.RawBsonArray$RawBsonArrayList$ListItr r0 = new org.bson.RawBsonArray$RawBsonArrayList$ListItr
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r4 = this;
                java.lang.Integer r0 = r4.cachedSize
                if (r0 == 0) goto L9
                int r0 = r0.intValue()
                return r0
            L9:
                r0 = 0
                org.bson.BsonBinaryReader r1 = r4.createReader()
                r1.readStartDocument()     // Catch: java.lang.Throwable -> L33
            L11:
                org.bson.BsonType r2 = r1.readBsonType()     // Catch: java.lang.Throwable -> L33
                org.bson.BsonType r3 = org.bson.BsonType.END_OF_DOCUMENT     // Catch: java.lang.Throwable -> L33
                if (r2 == r3) goto L22
                int r0 = r0 + 1
                r1.readName()     // Catch: java.lang.Throwable -> L33
                r1.skipValue()     // Catch: java.lang.Throwable -> L33
                goto L11
            L22:
                r1.readEndDocument()     // Catch: java.lang.Throwable -> L33
                r1.close()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.cachedSize = r0
                int r0 = r0.intValue()
                return r0
            L33:
                r0 = move-exception
                r1.close()
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SerializationProxy implements java.io.Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        public SerializationProxy(byte[] r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                int r0 = r3.length
                if (r0 != r5) goto L9
                r2.bytes = r3
                goto L11
            L9:
                byte[] r0 = new byte[r5]
                r2.bytes = r0
                r1 = 0
                java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            L11:
                return
        }

        private java.lang.Object readResolve() {
                r2 = this;
                org.bson.RawBsonArray r0 = new org.bson.RawBsonArray
                byte[] r1 = r2.bytes
                r0.<init>(r1)
                return r0
        }
    }

    private RawBsonArray(org.bson.RawBsonArray.RawBsonArrayList r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.delegate = r2
            return
    }

    public RawBsonArray(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "bytes"
            java.lang.Object r0 = org.bson.assertions.Assertions.notNull(r0, r3)
            byte[] r0 = (byte[]) r0
            int r3 = r3.length
            r1 = 0
            r2.<init>(r0, r1, r3)
            return
    }

    public RawBsonArray(byte[] r2, int r3, int r4) {
            r1 = this;
            org.bson.RawBsonArray$RawBsonArrayList r0 = new org.bson.RawBsonArray$RawBsonArrayList
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            return
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Proxy required"
            r2.<init>(r0)
            throw r2
    }

    private java.lang.Object writeReplace() {
            r4 = this;
            org.bson.RawBsonArray$SerializationProxy r0 = new org.bson.RawBsonArray$SerializationProxy
            org.bson.RawBsonArray$RawBsonArrayList r1 = r4.delegate
            byte[] r1 = org.bson.RawBsonArray.RawBsonArrayList.access$000(r1)
            org.bson.RawBsonArray$RawBsonArrayList r2 = r4.delegate
            int r2 = org.bson.RawBsonArray.RawBsonArrayList.access$100(r2)
            org.bson.RawBsonArray$RawBsonArrayList r3 = r4.delegate
            int r3 = org.bson.RawBsonArray.RawBsonArrayList.access$200(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.bson.BsonArray, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, org.bson.BsonValue r2) {
            r0 = this;
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            r0.add2(r1, r2)
            return
    }

    @Override // org.bson.BsonArray
    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int r1, org.bson.BsonValue r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "RawBsonArray instances are immutable"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            org.bson.BsonValue r1 = (org.bson.BsonValue) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    @Override // org.bson.BsonArray
    public boolean add(org.bson.BsonValue r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonArray instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonArray, java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends org.bson.BsonValue> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "RawBsonArray instances are immutable"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends org.bson.BsonValue> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonArray instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "RawBsonArray instances are immutable"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BsonArray
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            org.bson.BsonArray r0 = r1.mo2035clone()
            return r0
    }

    @Override // org.bson.BsonArray
    /* JADX INFO: renamed from: clone */
    public org.bson.BsonArray mo2035clone() {
            r4 = this;
            org.bson.RawBsonArray r0 = new org.bson.RawBsonArray
            org.bson.RawBsonArray$RawBsonArrayList r1 = r4.delegate
            byte[] r1 = org.bson.RawBsonArray.RawBsonArrayList.access$000(r1)
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            org.bson.RawBsonArray$RawBsonArrayList r2 = r4.delegate
            int r2 = org.bson.RawBsonArray.RawBsonArrayList.access$100(r2)
            org.bson.RawBsonArray$RawBsonArrayList r3 = r4.delegate
            int r3 = org.bson.RawBsonArray.RawBsonArrayList.access$200(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Override // org.bson.BsonArray, java.util.List
    public /* bridge */ /* synthetic */ org.bson.BsonValue remove(int r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.remove2(r1)
            return r1
    }

    @Override // org.bson.BsonArray, java.util.List
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue remove2(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonArray instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonArray instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonArray instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonArray, java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "RawBsonArray instances are immutable"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.BsonArray, java.util.List
    public /* bridge */ /* synthetic */ org.bson.BsonValue set(int r1, org.bson.BsonValue r2) {
            r0 = this;
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonValue r1 = r0.set2(r1, r2)
            return r1
    }

    @Override // org.bson.BsonArray
    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue set2(int r1, org.bson.BsonValue r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "RawBsonArray instances are immutable"
            r1.<init>(r2)
            throw r1
    }
}
