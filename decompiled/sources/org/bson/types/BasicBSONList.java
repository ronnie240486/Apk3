package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public class BasicBSONList extends java.util.ArrayList<java.lang.Object> implements org.bson.BSONObject {
    private static final long serialVersionUID = -4415279469780082174L;

    public BasicBSONList() {
            r0 = this;
            r0.<init>()
            return
    }

    public final int _getInt(java.lang.String r3, boolean r4) {
            r2 = this;
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L5
            return r3
        L5:
            if (r4 != 0) goto L9
            r3 = -1
            return r3
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "BasicBSONList can only work with numeric keys, not: ["
            java.lang.String r1 = "]"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            r4.<init>(r3)
            throw r4
    }

    @Override // org.bson.BSONObject
    public boolean containsField(java.lang.String r3) {
            r2 = this;
            r0 = 0
            int r3 = r2._getInt(r3, r0)
            if (r3 >= 0) goto L8
            return r0
        L8:
            if (r3 < 0) goto L11
            int r1 = r2.size()
            if (r3 >= r1) goto L11
            r0 = 1
        L11:
            return r0
    }

    @Override // org.bson.BSONObject
    @java.lang.Deprecated
    public boolean containsKey(java.lang.String r1) {
            r0 = this;
            boolean r1 = r0.containsField(r1)
            return r1
    }

    @Override // org.bson.BSONObject
    public java.lang.Object get(java.lang.String r3) {
            r2 = this;
            r0 = 1
            int r3 = r2._getInt(r3, r0)
            r0 = 0
            if (r3 >= 0) goto L9
            return r0
        L9:
            int r1 = r2.size()
            if (r3 < r1) goto L10
            return r0
        L10:
            java.lang.Object r3 = r2.get(r3)
            return r3
    }

    @Override // org.bson.BSONObject
    public java.util.Set<java.lang.String> keySet() {
            r2 = this;
            org.bson.types.StringRangeSet r0 = new org.bson.types.StringRangeSet
            int r1 = r2.size()
            r0.<init>(r1)
            return r0
    }

    public java.lang.Object put(int r2, java.lang.Object r3) {
            r1 = this;
        L0:
            int r0 = r1.size()
            if (r2 < r0) goto Lb
            r0 = 0
            r1.add(r0)
            goto L0
        Lb:
            r1.set(r2, r3)
            return r3
    }

    @Override // org.bson.BSONObject
    public java.lang.Object put(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            int r2 = r1._getInt(r2, r0)
            java.lang.Object r2 = r1.put(r2, r3)
            return r2
    }

    @Override // org.bson.BSONObject, java.util.AbstractMap, java.util.Map
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
    public java.lang.Object removeField(java.lang.String r3) {
            r2 = this;
            r0 = 1
            int r3 = r2._getInt(r3, r0)
            r0 = 0
            if (r3 >= 0) goto L9
            return r0
        L9:
            int r1 = r2.size()
            if (r3 < r1) goto L10
            return r0
        L10:
            java.lang.Object r3 = r2.remove(r3)
            return r3
    }

    @Override // org.bson.BSONObject
    public java.util.Map toMap() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.Object r3 = r4.get(r3)
            r0.put(r2, r3)
            goto Ld
        L23:
            return r0
    }
}
