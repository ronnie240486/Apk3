package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class ShellBinaryConverter implements org.bson.json.Converter<org.bson.BsonBinary> {
    public ShellBinaryConverter() {
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
    public void convert2(org.bson.BsonBinary r4, org.bson.json.StrictJsonWriter r5) {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte r1 = r4.getType()
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r2 = 0
            r0[r2] = r1
            byte[] r4 = r4.getData()
            java.lang.String r4 = org.bson.internal.Base64.encode(r4)
            r1 = 1
            r0[r1] = r4
            java.lang.String r4 = "new BinData(%s, \"%s\")"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r5.writeRaw(r4)
            return
    }
}
