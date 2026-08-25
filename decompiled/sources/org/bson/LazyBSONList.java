package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class LazyBSONList extends org.bson.LazyBSONObject implements java.util.List {

    public class LazyBSONListIterator implements java.util.Iterator {
        private org.bson.BsonType cachedBsonType;
        private final org.bson.BsonBinaryReader reader;
        public final /* synthetic */ org.bson.LazyBSONList this$0;

        public LazyBSONListIterator(org.bson.LazyBSONList r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                org.bson.BsonBinaryReader r1 = r1.getBsonReader()
                r0.reader = r1
                r1.readStartDocument()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                org.bson.BsonType r0 = r2.cachedBsonType
                if (r0 != 0) goto Lc
                org.bson.BsonBinaryReader r0 = r2.reader
                org.bson.BsonType r0 = r0.readBsonType()
                r2.cachedBsonType = r0
            Lc:
                org.bson.BsonType r0 = r2.cachedBsonType
                org.bson.BsonType r1 = org.bson.BsonType.END_OF_DOCUMENT
                if (r0 == r1) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L17
                r0 = 0
                r2.cachedBsonType = r0
                org.bson.BsonBinaryReader r0 = r2.reader
                r0.readName()
                org.bson.LazyBSONList r0 = r2.this$0
                org.bson.BsonBinaryReader r1 = r2.reader
                java.lang.Object r0 = r0.readValue(r1)
                return r0
            L17:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported"
                r0.<init>(r1)
                throw r0
        }
    }

    public LazyBSONList(byte[] r1, int r2, org.bson.LazyBSONCallback r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public LazyBSONList(byte[] r1, org.bson.LazyBSONCallback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.List
    public void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Object is read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Object is read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Object is read only"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 <= r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection r4) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r1.next()
            r0.add(r2)
            goto L9
        L17:
            boolean r4 = r0.containsAll(r4)
            return r4
    }

    @Override // java.util.List
    public java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
            r1 = this;
            org.bson.LazyBSONList$LazyBSONListIterator r0 = new org.bson.LazyBSONList$LazyBSONListIterator
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = -1
            r2 = 0
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r0.next()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r1 = r2
        L17:
            int r2 = r2 + 1
            goto L6
        L1a:
            return r1
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported instance of this type"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported instance of this type"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Object is read only"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Object is read only"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
            r1 = this;
            java.util.Set r0 = r1.keySet()
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.List
    public java.util.List subList(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported"
            r2.<init>(r0)
            throw r2
    }
}
