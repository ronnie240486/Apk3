package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class LazyBSONCallback extends org.bson.EmptyBSONCallback {
    private java.lang.Object root;

    public LazyBSONCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object getRoot() {
            r1 = this;
            java.lang.Object r0 = r1.root
            return r0
    }

    private void setRoot(java.lang.Object r1) {
            r0 = this;
            r0.root = r1
            return
    }

    public java.util.List createArray(byte[] r2, int r3) {
            r1 = this;
            org.bson.LazyBSONList r0 = new org.bson.LazyBSONList
            r0.<init>(r2, r3, r1)
            return r0
    }

    public java.lang.Object createDBRef(java.lang.String r3, org.bson.types.ObjectId r4) {
            r2 = this;
            org.bson.BasicBSONObject r0 = new org.bson.BasicBSONObject
            java.lang.String r1 = "$ns"
            r0.<init>(r1, r3)
            java.lang.String r3 = "$id"
            org.bson.BasicBSONObject r3 = r0.append(r3, r4)
            return r3
    }

    public java.lang.Object createObject(byte[] r2, int r3) {
            r1 = this;
            org.bson.LazyBSONObject r0 = new org.bson.LazyBSONObject
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // org.bson.EmptyBSONCallback, org.bson.BSONCallback
    public java.lang.Object get() {
            r1 = this;
            java.lang.Object r0 = r1.getRoot()
            return r0
    }

    @Override // org.bson.EmptyBSONCallback, org.bson.BSONCallback
    public void gotBinary(java.lang.String r1, byte r2, byte[] r3) {
            r0 = this;
            r1 = 0
            java.lang.Object r1 = r0.createObject(r3, r1)
            r0.setRoot(r1)
            return
    }

    @Override // org.bson.EmptyBSONCallback, org.bson.BSONCallback
    public void reset() {
            r1 = this;
            r0 = 0
            r1.root = r0
            return
    }
}
