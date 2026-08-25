package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class JsonInt32Converter implements org.bson.json.Converter<java.lang.Integer> {
    public JsonInt32Converter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Integer r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r2.writeNumber(r1)
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.Integer r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.convert2(r1, r2)
            return
    }
}
