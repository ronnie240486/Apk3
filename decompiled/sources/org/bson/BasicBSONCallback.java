package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BasicBSONCallback implements org.bson.BSONCallback {
    private final java.util.LinkedList<java.lang.String> nameStack;
    private java.lang.Object root;
    private final java.util.LinkedList<org.bson.BSONObject> stack;

    public BasicBSONCallback() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.stack = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.nameStack = r0
            r1.reset()
            return
    }

    public final void _put(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            org.bson.BSONObject r0 = r2.cur()
            boolean r1 = org.bson.BSON.hasDecodeHooks()
            if (r1 != 0) goto Lb
            goto Lf
        Lb:
            java.lang.Object r4 = org.bson.BSON.applyDecodingHooks(r4)
        Lf:
            r0.put(r3, r4)
            return
    }

    @Override // org.bson.BSONCallback
    public java.lang.Object arrayDone() {
            r1 = this;
            java.lang.Object r0 = r1.objectDone()
            return r0
    }

    @Override // org.bson.BSONCallback
    public void arrayStart() {
            r2 = this;
            r0 = 1
            r1 = 0
            org.bson.BSONObject r0 = r2.create(r0, r1)
            r2.root = r0
            java.util.LinkedList<org.bson.BSONObject> r1 = r2.stack
            org.bson.BSONObject r0 = (org.bson.BSONObject) r0
            r1.add(r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void arrayStart(java.lang.String r3) {
            r2 = this;
            java.util.LinkedList<java.lang.String> r0 = r2.nameStack
            r0.addLast(r3)
            java.util.LinkedList<java.lang.String> r0 = r2.nameStack
            r1 = 1
            org.bson.BSONObject r0 = r2.create(r1, r0)
            java.util.LinkedList<org.bson.BSONObject> r1 = r2.stack
            java.lang.Object r1 = r1.getLast()
            org.bson.BSONObject r1 = (org.bson.BSONObject) r1
            r1.put(r3, r0)
            java.util.LinkedList<org.bson.BSONObject> r3 = r2.stack
            r3.addLast(r0)
            return
    }

    public org.bson.BSONObject create() {
            r1 = this;
            org.bson.BasicBSONObject r0 = new org.bson.BasicBSONObject
            r0.<init>()
            return r0
    }

    public org.bson.BSONObject create(boolean r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            if (r1 == 0) goto L8
            org.bson.types.BasicBSONList r1 = new org.bson.types.BasicBSONList
            r1.<init>()
            goto Lc
        L8:
            org.bson.BSONObject r1 = r0.create()
        Lc:
            return r1
    }

    @Override // org.bson.BSONCallback
    public org.bson.BSONCallback createBSONCallback() {
            r1 = this;
            org.bson.BasicBSONCallback r0 = new org.bson.BasicBSONCallback
            r0.<init>()
            return r0
    }

    public final org.bson.BSONObject cur() {
            r1 = this;
            java.util.LinkedList<org.bson.BSONObject> r0 = r1.stack
            java.lang.Object r0 = r0.getLast()
            org.bson.BSONObject r0 = (org.bson.BSONObject) r0
            return r0
    }

    @Override // org.bson.BSONCallback
    public java.lang.Object get() {
            r1 = this;
            java.lang.Object r0 = r1.root
            return r0
    }

    @Override // org.bson.BSONCallback
    public void gotBinary(java.lang.String r2, byte r3, byte[] r4) {
            r1 = this;
            if (r3 == 0) goto Lf
            r0 = 2
            if (r3 != r0) goto L6
            goto Lf
        L6:
            org.bson.types.Binary r0 = new org.bson.types.Binary
            r0.<init>(r3, r4)
            r1._put(r2, r0)
            goto L12
        Lf:
            r1._put(r2, r4)
        L12:
            return
    }

    @Override // org.bson.BSONCallback
    @java.lang.Deprecated
    public void gotBinaryArray(java.lang.String r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.gotBinary(r2, r0, r3)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotCode(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.bson.types.Code r0 = new org.bson.types.Code
            r0.<init>(r3)
            r1._put(r2, r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotCodeWScope(java.lang.String r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            org.bson.types.CodeWScope r0 = new org.bson.types.CodeWScope
            org.bson.BSONObject r4 = (org.bson.BSONObject) r4
            r0.<init>(r3, r4)
            r1._put(r2, r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotDBRef(java.lang.String r3, java.lang.String r4, org.bson.types.ObjectId r5) {
            r2 = this;
            org.bson.BasicBSONObject r0 = new org.bson.BasicBSONObject
            java.lang.String r1 = "$ns"
            r0.<init>(r1, r4)
            java.lang.String r4 = "$id"
            org.bson.BasicBSONObject r4 = r0.append(r4, r5)
            r2._put(r3, r4)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotDate(java.lang.String r2, long r3) {
            r1 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            r1._put(r2, r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotDecimal128(java.lang.String r1, org.bson.types.Decimal128 r2) {
            r0 = this;
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotDouble(java.lang.String r1, double r2) {
            r0 = this;
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotInt(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotLong(java.lang.String r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotMaxKey(java.lang.String r3) {
            r2 = this;
            org.bson.BSONObject r0 = r2.cur()
            org.bson.types.MaxKey r1 = new org.bson.types.MaxKey
            r1.<init>()
            r0.put(r3, r1)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotMinKey(java.lang.String r3) {
            r2 = this;
            org.bson.BSONObject r0 = r2.cur()
            org.bson.types.MinKey r1 = new org.bson.types.MinKey
            r1.<init>()
            r0.put(r3, r1)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotNull(java.lang.String r3) {
            r2 = this;
            org.bson.BSONObject r0 = r2.cur()
            r1 = 0
            r0.put(r3, r1)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotObjectId(java.lang.String r1, org.bson.types.ObjectId r2) {
            r0 = this;
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotRegex(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            int r3 = org.bson.BSON.regexFlags(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotSymbol(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0._put(r1, r2)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotTimestamp(java.lang.String r2, int r3, int r4) {
            r1 = this;
            org.bson.types.BSONTimestamp r0 = new org.bson.types.BSONTimestamp
            r0.<init>(r3, r4)
            r1._put(r2, r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotUUID(java.lang.String r2, long r3, long r5) {
            r1 = this;
            java.util.UUID r0 = new java.util.UUID
            r0.<init>(r3, r5)
            r1._put(r2, r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void gotUndefined(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // org.bson.BSONCallback
    public java.lang.Object objectDone() {
            r2 = this;
            java.util.LinkedList<org.bson.BSONObject> r0 = r2.stack
            java.lang.Object r0 = r0.removeLast()
            org.bson.BSONObject r0 = (org.bson.BSONObject) r0
            java.util.LinkedList<java.lang.String> r1 = r2.nameStack
            int r1 = r1.size()
            if (r1 <= 0) goto L16
            java.util.LinkedList<java.lang.String> r1 = r2.nameStack
            r1.removeLast()
            goto L1e
        L16:
            java.util.LinkedList<org.bson.BSONObject> r1 = r2.stack
            int r1 = r1.size()
            if (r1 > 0) goto L2c
        L1e:
            boolean r1 = org.bson.BSON.hasDecodeHooks()
            if (r1 != 0) goto L25
            goto L2b
        L25:
            java.lang.Object r0 = org.bson.BSON.applyDecodingHooks(r0)
            org.bson.BSONObject r0 = (org.bson.BSONObject) r0
        L2b:
            return r0
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal object end in current context."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BSONCallback
    public void objectStart() {
            r2 = this;
            java.util.LinkedList<org.bson.BSONObject> r0 = r2.stack
            int r0 = r0.size()
            if (r0 > 0) goto L18
            r0 = 0
            r1 = 0
            org.bson.BSONObject r0 = r2.create(r0, r1)
            r2.root = r0
            java.util.LinkedList<org.bson.BSONObject> r1 = r2.stack
            org.bson.BSONObject r0 = (org.bson.BSONObject) r0
            r1.add(r0)
            return
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal object beginning in current context."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.BSONCallback
    public void objectStart(java.lang.String r3) {
            r2 = this;
            java.util.LinkedList<java.lang.String> r0 = r2.nameStack
            r0.addLast(r3)
            java.util.LinkedList<java.lang.String> r0 = r2.nameStack
            r1 = 0
            org.bson.BSONObject r0 = r2.create(r1, r0)
            java.util.LinkedList<org.bson.BSONObject> r1 = r2.stack
            java.lang.Object r1 = r1.getLast()
            org.bson.BSONObject r1 = (org.bson.BSONObject) r1
            r1.put(r3, r0)
            java.util.LinkedList<org.bson.BSONObject> r3 = r2.stack
            r3.addLast(r0)
            return
    }

    @Override // org.bson.BSONCallback
    public void reset() {
            r1 = this;
            r0 = 0
            r1.root = r0
            java.util.LinkedList<org.bson.BSONObject> r0 = r1.stack
            r0.clear()
            java.util.LinkedList<java.lang.String> r0 = r1.nameStack
            r0.clear()
            return
    }
}
