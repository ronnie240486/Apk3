package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class JsonBooleanConverter implements org.bson.json.Converter<java.lang.Boolean> {
    public JsonBooleanConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Boolean r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r2.writeBoolean(r1)
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.Boolean r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.convert2(r1, r2)
            return
    }
}
