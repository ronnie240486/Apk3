package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class JsonDoubleConverter implements org.bson.json.Converter<java.lang.Double> {
    public JsonDoubleConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Double r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            double r0 = r3.doubleValue()
            java.lang.String r3 = java.lang.Double.toString(r0)
            r4.writeNumber(r3)
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.Double r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.Double r1 = (java.lang.Double) r1
            r0.convert2(r1, r2)
            return
    }
}
