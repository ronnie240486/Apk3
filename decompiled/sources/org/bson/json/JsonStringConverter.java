package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class JsonStringConverter implements org.bson.json.Converter<java.lang.String> {
    public JsonStringConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.String r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.String r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            r2.writeString(r1)
            return
    }
}
