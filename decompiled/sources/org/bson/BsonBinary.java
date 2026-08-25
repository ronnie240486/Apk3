package org.bson;

/* JADX INFO: loaded from: classes.dex */
public class BsonBinary extends org.bson.BsonValue {
    private final byte[] data;
    private final byte type;

    public BsonBinary(byte r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto La
            r0.type = r1
            r0.data = r2
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "data may not be null"
            r1.<init>(r2)
            throw r1
    }

    public BsonBinary(java.util.UUID r2) {
            r1 = this;
            org.bson.UuidRepresentation r0 = org.bson.UuidRepresentation.STANDARD
            r1.<init>(r2, r0)
            return
    }

    public BsonBinary(java.util.UUID r1, org.bson.UuidRepresentation r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L2a
            if (r2 == 0) goto L21
            byte[] r1 = org.bson.internal.UuidHelper.encodeUuidToBinary(r1, r2)
            r0.data = r1
            org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.STANDARD
            if (r2 != r1) goto L18
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_STANDARD
            byte r1 = r1.getValue()
            goto L1e
        L18:
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_LEGACY
            byte r1 = r1.getValue()
        L1e:
            r0.type = r1
            return
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "uuidRepresentation may not be null"
            r1.<init>(r2)
            throw r1
        L2a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "uuid may not be null"
            r1.<init>(r2)
            throw r1
    }

    public BsonBinary(org.bson.BsonBinarySubType r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            if (r2 == 0) goto L10
            byte r1 = r1.getValue()
            r0.type = r1
            r0.data = r2
            return
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "data may not be null"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "type may not be null"
            r1.<init>(r2)
            throw r1
    }

    public BsonBinary(byte[] r2) {
            r1 = this;
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.BINARY
            r1.<init>(r0, r2)
            return
    }

    public static org.bson.BsonBinary clone(org.bson.BsonBinary r2) {
            org.bson.BsonBinary r0 = new org.bson.BsonBinary
            byte r1 = r2.type
            byte[] r2 = r2.data
            java.lang.Object r2 = r2.clone()
            byte[] r2 = (byte[]) r2
            r0.<init>(r1, r2)
            return r0
    }

    public java.util.UUID asUuid() {
            r3 = this;
            byte r0 = r3.type
            boolean r0 = org.bson.BsonBinarySubType.isUuid(r0)
            if (r0 == 0) goto L2c
            byte r0 = r3.type
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_STANDARD
            byte r1 = r1.getValue()
            if (r0 != r1) goto L23
            byte[] r0 = r3.data
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            byte r1 = r3.type
            org.bson.UuidRepresentation r2 = org.bson.UuidRepresentation.STANDARD
            java.util.UUID r0 = org.bson.internal.UuidHelper.decodeBinaryToUuid(r0, r1, r2)
            return r0
        L23:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.String r1 = "uuidRepresentation must be set to return the correct UUID."
            r0.<init>(r1)
            throw r0
        L2c:
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            java.lang.String r1 = "type must be a UUID subtype."
            r0.<init>(r1)
            throw r0
    }

    public java.util.UUID asUuid(org.bson.UuidRepresentation r3) {
            r2 = this;
            java.lang.String r0 = "uuidRepresentation"
            org.bson.assertions.Assertions.notNull(r0, r3)
            org.bson.UuidRepresentation r0 = org.bson.UuidRepresentation.STANDARD
            if (r3 != r0) goto L11
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_STANDARD
            byte r0 = r0.getValue()
            goto L17
        L11:
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_LEGACY
            byte r0 = r0.getValue()
        L17:
            byte r1 = r2.type
            if (r1 != r0) goto L2a
            byte[] r0 = r2.data
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            byte r1 = r2.type
            java.util.UUID r3 = org.bson.internal.UuidHelper.decodeBinaryToUuid(r0, r1, r3)
            return r3
        L2a:
            org.bson.BsonInvalidOperationException r3 = new org.bson.BsonInvalidOperationException
            java.lang.String r0 = "uuidRepresentation does not match current uuidRepresentation."
            r3.<init>(r0)
            throw r3
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
            org.bson.BsonBinary r5 = (org.bson.BsonBinary) r5
            byte[] r2 = r4.data
            byte[] r3 = r5.data
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            byte r2 = r4.type
            byte r5 = r5.type
            if (r2 == r5) goto L26
            return r1
        L26:
            return r0
        L27:
            return r1
    }

    @Override // org.bson.BsonValue
    public org.bson.BsonType getBsonType() {
            r1 = this;
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            return r0
    }

    public byte[] getData() {
            r1 = this;
            byte[] r0 = r1.data
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

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BsonBinary{type="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            byte r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            byte[] r1 = r2.data
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
