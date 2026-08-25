package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class BasicBSONObject extends java.util.LinkedHashMap<java.lang.String, java.lang.Object> implements org.bson.BSONObject {
    private static final long serialVersionUID = -4415279469780082174L;

    public BasicBSONObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public BasicBSONObject(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public BasicBSONObject(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.put(r1, r2)
            return
    }

    public BasicBSONObject(java.util.Map r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.lang.Object canonicalize(java.lang.Object r1) {
            boolean r0 = r1 instanceof org.bson.BSONObject
            if (r0 == 0) goto Lf
            boolean r0 = r1 instanceof org.bson.types.BasicBSONList
            if (r0 != 0) goto Lf
            org.bson.BSONObject r1 = (org.bson.BSONObject) r1
            org.bson.BasicBSONObject r1 = canonicalizeBSONObject(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L1a
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = canonicalizeList(r1)
            return r1
        L1a:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L24
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r1 = canonicalizeMap(r1)
        L24:
            return r1
    }

    private static org.bson.BasicBSONObject canonicalizeBSONObject(org.bson.BSONObject r4) {
            org.bson.BasicBSONObject r0 = new org.bson.BasicBSONObject
            r0.<init>()
            java.util.TreeSet r1 = new java.util.TreeSet
            java.util.Set r2 = r4.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            java.lang.Object r3 = canonicalize(r3)
            r0.put(r2, r3)
            goto L12
        L2a:
            return r0
    }

    private static java.util.List canonicalizeList(java.util.List<java.lang.Object> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = canonicalize(r1)
            r0.add(r1)
            goto Ld
        L1f:
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.Object> canonicalizeMap(java.util.Map<java.lang.String, java.lang.Object> r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.TreeSet r1 = new java.util.TreeSet
            java.util.Set r2 = r4.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            java.lang.Object r3 = canonicalize(r3)
            r0.put(r2, r3)
            goto L16
        L2e:
            return r0
    }

    private byte[] encode() {
            r1 = this;
            org.bson.BSONEncoder r0 = r1.getEncoder()
            byte[] r0 = r0.encode(r1)
            return r0
    }

    private org.bson.BSONEncoder getEncoder() {
            r1 = this;
            org.bson.BasicBSONEncoder r0 = new org.bson.BasicBSONEncoder
            r0.<init>()
            return r0
    }

    private int toInt(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto Lb
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
        Lb:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L16
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "can't convert: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " to int"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public org.bson.BasicBSONObject append(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.put(r1, r2)
            return r0
    }

    @Override // org.bson.BSONObject
    public boolean containsField(java.lang.String r1) {
            r0 = this;
            boolean r1 = super.containsKey(r1)
            return r1
    }

    @Override // org.bson.BSONObject
    @java.lang.Deprecated
    public boolean containsKey(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.containsField(r1)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof org.bson.BSONObject
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.bson.BSONObject r4 = (org.bson.BSONObject) r4
            java.util.Set r0 = r3.keySet()
            java.util.Set r2 = r4.keySet()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1b
            return r1
        L1b:
            org.bson.BSONEncoder r0 = r3.getEncoder()
            org.bson.BasicBSONObject r1 = canonicalizeBSONObject(r3)
            byte[] r0 = r0.encode(r1)
            org.bson.BSONEncoder r1 = r3.getEncoder()
            org.bson.BasicBSONObject r4 = canonicalizeBSONObject(r4)
            byte[] r4 = r1.encode(r4)
            boolean r4 = java.util.Arrays.equals(r0, r4)
            return r4
    }

    @Override // org.bson.BSONObject
    public java.lang.Object get(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            return r1
    }

    public boolean getBoolean(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.getBoolean(r2, r0)
            return r2
    }

    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto L7
            return r3
        L7:
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L17
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
        L17:
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L22
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "can't coerce to bool:"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r2 = r2.getClass()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public java.util.Date getDate(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            java.util.Date r1 = (java.util.Date) r1
            return r1
    }

    public java.util.Date getDate(java.lang.String r1, java.util.Date r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L9
            r2 = r1
            java.util.Date r2 = (java.util.Date) r2
        L9:
            return r2
    }

    public double getDouble(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            return r0
    }

    public double getDouble(java.lang.String r1, double r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.Number r1 = (java.lang.Number) r1
            double r1 = r1.doubleValue()
            return r1
    }

    public int getInt(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.get(r3)
            if (r0 == 0) goto Lb
            int r3 = r2.toInt(r0)
            return r3
        Lb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "no value for: "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    public int getInt(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r0.toInt(r1)
            return r1
    }

    public long getLong(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            return r0
    }

    public long getLong(java.lang.String r1, long r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            return r1
    }

    public org.bson.types.ObjectId getObjectId(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            org.bson.types.ObjectId r1 = (org.bson.types.ObjectId) r1
            return r1
    }

    public org.bson.types.ObjectId getObjectId(java.lang.String r1, org.bson.types.ObjectId r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L9
            r2 = r1
            org.bson.types.ObjectId r2 = (org.bson.types.ObjectId) r2
        L9:
            return r2
    }

    public java.lang.String getString(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public java.lang.String getString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r1 = this;
            org.bson.BasicBSONObject r0 = canonicalizeBSONObject(r1)
            byte[] r0 = r0.encode()
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // org.bson.BSONObject
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.put(r1, r2)
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, org.bson.BSONObject
    public void putAll(java.util.Map r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L8
        L24:
            return
    }

    @Override // org.bson.BSONObject
    public void putAll(org.bson.BSONObject r4) {
            r3 = this;
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.get(r1)
            r3.put(r1, r2)
            goto L8
        L1c:
            return
    }

    @Override // org.bson.BSONObject
    public java.lang.Object removeField(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = r0.remove(r1)
            return r1
    }

    @Override // org.bson.BSONObject
    public java.util.Map toMap() {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }
}
