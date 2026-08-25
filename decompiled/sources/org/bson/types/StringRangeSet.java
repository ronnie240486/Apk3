package org.bson.types;

/* JADX INFO: loaded from: classes2.dex */
class StringRangeSet implements java.util.Set<java.lang.String> {
    private static final java.lang.String[] STRINGS = null;
    private final int size;


    static {
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.String[] r0 = new java.lang.String[r0]
            org.bson.types.StringRangeSet.STRINGS = r0
            r0 = 0
        L7:
            java.lang.String[] r1 = org.bson.types.StringRangeSet.STRINGS
            int r2 = r1.length
            if (r0 >= r2) goto L15
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L7
        L15:
            return
    }

    public StringRangeSet(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "size >= 0"
            org.bson.assertions.Assertions.isTrue(r1, r0)
            r2.size = r3
            return
    }

    public static /* synthetic */ int access$000(org.bson.types.StringRangeSet r0) {
            int r0 = r0.size
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(org.bson.types.StringRangeSet r0, int r1) {
            java.lang.String r0 = r0.intToString(r1)
            return r0
    }

    private java.lang.String intToString(int r3) {
            r2 = this;
            java.lang.String[] r0 = org.bson.types.StringRangeSet.STRINGS
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            goto Lc
        L8:
            java.lang.String r3 = java.lang.Integer.toString(r3)
        Lc:
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    public boolean add(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.lang.String> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L15
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L15
            if (r3 < 0) goto L15
            int r0 = r2.size()     // Catch: java.lang.NumberFormatException -> L15
            if (r3 >= r0) goto L15
            r1 = 1
        L15:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            org.bson.types.StringRangeSet$1 r0 = new org.bson.types.StringRangeSet$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r3 = this;
            int r0 = r3.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L7:
            int r2 = r3.size()
            if (r1 >= r2) goto L16
            java.lang.String r2 = r3.intToString(r1)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L16:
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.size()
            if (r0 < r1) goto L9
            r0 = r4
            goto L19
        L9:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r3.size
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L19:
            r1 = 0
        L1a:
            int r2 = r3.size()
            if (r1 >= r2) goto L29
            java.lang.String r2 = r3.intToString(r1)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L1a
        L29:
            int r1 = r4.length
            int r2 = r3.size()
            if (r1 <= r2) goto L35
            int r1 = r3.size
            r2 = 0
            r4[r1] = r2
        L35:
            return r0
    }
}
