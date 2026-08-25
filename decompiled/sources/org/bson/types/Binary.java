package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public class Binary implements java.io.Serializable {
    private static final long serialVersionUID = 7902997490338209467L;
    private final byte[] data;
    private final byte type;

    public Binary(byte r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            java.lang.Object r1 = r2.clone()
            byte[] r1 = (byte[]) r1
            r0.data = r1
            return
    }

    public Binary(org.bson.BsonBinarySubType r1, byte[] r2) {
            r0 = this;
            byte r1 = r1.getValue()
            r0.<init>(r1, r2)
            return
    }

    public Binary(byte[] r2) {
            r1 = this;
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.BINARY
            r1.<init>(r0, r2)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L27
        L12:
            org.bson.types.Binary r5 = (org.bson.types.Binary) r5
            byte r2 = r4.type
            byte r3 = r5.type
            if (r2 == r3) goto L1b
            return r1
        L1b:
            byte[] r2 = r4.data
            byte[] r5 = r5.data
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 != 0) goto L26
            return r1
        L26:
            return r0
        L27:
            return r1
    }

    public byte[] getData() {
            r1 = this;
            byte[] r0 = r1.data
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    public byte getType() {
            r1 = this;
            byte r0 = r1.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            byte r0 = r2.type
            int r0 = r0 * 31
            byte[] r1 = r2.data
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public int length() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            return r0
    }
}
