package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ExtendedJsonTimestampConverter implements org.bson.json.Converter<org.bson.BsonTimestamp> {
    public ExtendedJsonTimestampConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    private long toUnsignedLong(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonTimestamp r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonTimestamp r1 = (org.bson.BsonTimestamp) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonTimestamp r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            r4.writeStartObject()
            java.lang.String r0 = "$timestamp"
            r4.writeStartObject(r0)
            int r0 = r3.getTime()
            long r0 = r2.toUnsignedLong(r0)
            java.lang.String r0 = org.bson.internal.UnsignedLongs.toString(r0)
            java.lang.String r1 = "t"
            r4.writeNumber(r1, r0)
            int r3 = r3.getInc()
            long r0 = r2.toUnsignedLong(r3)
            java.lang.String r3 = org.bson.internal.UnsignedLongs.toString(r0)
            java.lang.String r0 = "i"
            r4.writeNumber(r0, r3)
            r4.writeEndObject()
            r4.writeEndObject()
            return
    }
}
