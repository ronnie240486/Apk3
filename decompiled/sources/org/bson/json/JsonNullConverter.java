package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class JsonNullConverter implements org.bson.json.Converter<org.bson.BsonNull> {
    public JsonNullConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonNull r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonNull r1 = (org.bson.BsonNull) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonNull r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            r2.writeNull()
            return
    }
}
