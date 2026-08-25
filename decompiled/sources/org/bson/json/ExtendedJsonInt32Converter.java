package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class ExtendedJsonInt32Converter implements org.bson.json.Converter<java.lang.Integer> {
    public ExtendedJsonInt32Converter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Integer r2, org.bson.json.StrictJsonWriter r3) {
            r1 = this;
            r3.writeStartObject()
            java.lang.String r0 = "$numberInt"
            r3.writeName(r0)
            int r2 = r2.intValue()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r3.writeString(r2)
            r3.writeEndObject()
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
