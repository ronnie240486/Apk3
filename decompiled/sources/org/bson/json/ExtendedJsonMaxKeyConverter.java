package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ExtendedJsonMaxKeyConverter implements org.bson.json.Converter<org.bson.BsonMaxKey> {
    public ExtendedJsonMaxKeyConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonMaxKey r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonMaxKey r1 = (org.bson.BsonMaxKey) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonMaxKey r2, org.bson.json.StrictJsonWriter r3) {
            r1 = this;
            r3.writeStartObject()
            java.lang.String r2 = "$maxKey"
            java.lang.String r0 = "1"
            r3.writeNumber(r2, r0)
            r3.writeEndObject()
            return
    }
}
