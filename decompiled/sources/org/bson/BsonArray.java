package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonArray extends org.bson.BsonValue implements java.util.List<org.bson.BsonValue>, java.lang.Cloneable {
    private final java.util.List<org.bson.BsonValue> values;

    /* JADX INFO: renamed from: org.bson.BsonArray$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.BsonArray.AnonymousClass1.$SwitchMap$org$bson$BsonType = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.BsonArray.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.BsonArray.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.BsonArray.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public BsonArray() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public BsonArray(java.util.List<? extends org.bson.BsonValue> r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public BsonArray(java.util.List<? extends org.bson.BsonValue> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto Ld
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r0.values = r2
            goto Lf
        Ld:
            r0.values = r1
        Lf:
            return
    }

    public static org.bson.BsonArray parse(java.lang.String r2) {
            org.bson.codecs.BsonArrayCodec r0 = new org.bson.codecs.BsonArrayCodec
            r0.<init>()
            org.bson.json.JsonReader r1 = new org.bson.json.JsonReader
            r1.<init>(r2)
            org.bson.codecs.DecoderContext$Builder r2 = org.bson.codecs.DecoderContext.builder()
            org.bson.codecs.DecoderContext r2 = r2.build()
            org.bson.BsonArray r2 = r0.decode(r1, r2)
            return r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, org.bson.BsonValue r2) {
            r0 = this;
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            r0.add2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int r2, org.bson.BsonValue r3) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            r0.add(r2, r3)
            return
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            org.bson.BsonValue r1 = (org.bson.BsonValue) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    public boolean add(org.bson.BsonValue r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends org.bson.BsonValue> r3) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.addAll(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends org.bson.BsonValue> r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.addAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            r0.clear()
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            org.bson.BsonArray r0 = r1.mo2035clone()
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public org.bson.BsonArray mo2035clone() {
            r5 = this;
            org.bson.BsonArray r0 = new org.bson.BsonArray
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            int[] r3 = org.bson.BsonArray.AnonymousClass1.$SwitchMap$org$bson$BsonType
            org.bson.BsonType r4 = r2.getBsonType()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L55
            r4 = 2
            if (r3 == r4) goto L49
            r4 = 3
            if (r3 == r4) goto L3d
            r4 = 4
            if (r3 == r4) goto L31
            r0.add(r2)
            goto L9
        L31:
            org.bson.BsonJavaScriptWithScope r2 = r2.asJavaScriptWithScope()
            org.bson.BsonJavaScriptWithScope r2 = org.bson.BsonJavaScriptWithScope.clone(r2)
            r0.add(r2)
            goto L9
        L3d:
            org.bson.BsonBinary r2 = r2.asBinary()
            org.bson.BsonBinary r2 = org.bson.BsonBinary.clone(r2)
            r0.add(r2)
            goto L9
        L49:
            org.bson.BsonArray r2 = r2.asArray()
            org.bson.BsonArray r2 = r2.mo2035clone()
            r0.add(r2)
            goto L9
        L55:
            org.bson.BsonDocument r2 = r2.asDocument()
            org.bson.BsonDocument r2 = r2.mo2036clone()
            r0.add(r2)
            goto L9
        L61:
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.bson.BsonArray
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.bson.BsonArray r2 = (org.bson.BsonArray) r2
            java.util.List r0 = r1.getValues()
            java.util.List r2 = r2.getValues()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ org.bson.BsonValue get(int r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.get2(r1)
            return r1
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue get2(int r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.lang.Object r2 = r0.get(r2)
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            return r2
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.ARRAY
            return r0
    }

    public java.util.List<org.bson.BsonValue> getValues() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<org.bson.BsonValue> iterator() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public java.util.ListIterator<org.bson.BsonValue> listIterator() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<org.bson.BsonValue> listIterator(int r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.util.ListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ org.bson.BsonValue remove(int r1) {
            r0 = this;
            org.bson.BsonValue r1 = r0.remove2(r1)
            return r1
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue remove2(int r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.lang.Object r2 = r0.remove(r2)
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ org.bson.BsonValue set(int r1, org.bson.BsonValue r2) {
            r0 = this;
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            org.bson.BsonValue r1 = r0.set2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public org.bson.BsonValue set2(int r2, org.bson.BsonValue r3) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.lang.Object r2 = r0.set(r2, r3)
            org.bson.BsonValue r2 = (org.bson.BsonValue) r2
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.List
    public java.util.List<org.bson.BsonValue> subList(int r2, int r3) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.List<org.bson.BsonValue> r0 = r1.values
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonArray{values="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<org.bson.BsonValue> r1 = r2.values
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
