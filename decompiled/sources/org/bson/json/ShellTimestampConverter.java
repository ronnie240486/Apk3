package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ShellTimestampConverter implements org.bson.json.Converter<org.bson.BsonTimestamp> {
    public ShellTimestampConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonTimestamp r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonTimestamp r1 = (org.bson.BsonTimestamp) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonTimestamp r4, org.bson.json.StrictJsonWriter r5) {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r4.getTime()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r4 = r4.getInc()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 1
            r0[r1] = r4
            java.lang.String r4 = "Timestamp(%d, %d)"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r5.writeRaw(r4)
            return
    }
}
