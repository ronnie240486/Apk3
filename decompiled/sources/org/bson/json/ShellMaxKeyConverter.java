package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ShellMaxKeyConverter implements org.bson.json.Converter<org.bson.BsonMaxKey> {
    public ShellMaxKeyConverter() {
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
    public void convert2(org.bson.BsonMaxKey r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.String r1 = "MaxKey"
            r2.writeRaw(r1)
            return
    }
}
