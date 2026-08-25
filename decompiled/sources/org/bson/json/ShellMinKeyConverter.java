package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ShellMinKeyConverter implements org.bson.json.Converter<org.bson.BsonMinKey> {
    public ShellMinKeyConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonMinKey r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonMinKey r1 = (org.bson.BsonMinKey) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonMinKey r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.String r1 = "MinKey"
            r2.writeRaw(r1)
            return
    }
}
