package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class ExtendedJsonBinaryConverter implements org.bson.json.Converter<org.bson.BsonBinary> {
    public ExtendedJsonBinaryConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonBinary r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonBinary r1 = (org.bson.BsonBinary) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonBinary r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            r4.writeStartObject()
            java.lang.String r0 = "$binary"
            r4.writeStartObject(r0)
            byte[] r0 = r3.getData()
            java.lang.String r0 = org.bson.internal.Base64.encode(r0)
            java.lang.String r1 = "base64"
            r4.writeString(r1, r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte r3 = r3.getType()
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "%02X"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = "subType"
            r4.writeString(r0, r3)
            r4.writeEndObject()
            r4.writeEndObject()
            return
    }
}
