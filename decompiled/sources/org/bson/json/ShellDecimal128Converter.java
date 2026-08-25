package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ShellDecimal128Converter implements org.bson.json.Converter<org.bson.types.Decimal128> {
    public ShellDecimal128Converter() {
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
    public void convert2(org.bson.types.Decimal128 r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.toString()
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "NumberDecimal(\"%s\")"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r4.writeRaw(r3)
            return
    }
}
