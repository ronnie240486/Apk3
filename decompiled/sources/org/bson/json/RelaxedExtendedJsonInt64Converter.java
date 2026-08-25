package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class RelaxedExtendedJsonInt64Converter implements org.bson.json.Converter<java.lang.Long> {
    public RelaxedExtendedJsonInt64Converter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Long r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            long r0 = r3.longValue()
            java.lang.String r3 = java.lang.Long.toString(r0)
            r4.writeNumber(r3)
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.Long r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.convert2(r1, r2)
            return
    }
}
