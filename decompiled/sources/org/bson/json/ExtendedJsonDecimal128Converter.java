package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class ExtendedJsonDecimal128Converter implements org.bson.json.Converter<org.bson.types.Decimal128> {
    public ExtendedJsonDecimal128Converter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.types.Decimal128 r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.types.Decimal128 r1 = (org.bson.types.Decimal128) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.types.Decimal128 r2, org.bson.json.StrictJsonWriter r3) {
            r1 = this;
            r3.writeStartObject()
            java.lang.String r0 = "$numberDecimal"
            r3.writeName(r0)
            java.lang.String r2 = r2.toString()
            r3.writeString(r2)
            r3.writeEndObject()
            return
    }
}
