package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class RelaxedExtendedJsonDateTimeConverter implements org.bson.json.Converter<java.lang.Long> {
    private static final org.bson.json.Converter<java.lang.Long> FALLBACK_CONVERTER = null;
    private static final long LAST_MS_OF_YEAR_9999 = 253402300799999L;

    static {
            org.bson.json.ExtendedJsonDateTimeConverter r0 = new org.bson.json.ExtendedJsonDateTimeConverter
            r0.<init>()
            org.bson.json.RelaxedExtendedJsonDateTimeConverter.FALLBACK_CONVERTER = r0
            return
    }

    public RelaxedExtendedJsonDateTimeConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Long r6, org.bson.json.StrictJsonWriter r7) {
            r5 = this;
            long r0 = r6.longValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L2c
            long r0 = r6.longValue()
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L2c
        L18:
            r7.writeStartObject()
            long r0 = r6.longValue()
            java.lang.String r6 = org.bson.json.DateTimeFormatter.format(r0)
            java.lang.String r0 = "$date"
            r7.writeString(r0, r6)
            r7.writeEndObject()
            goto L31
        L2c:
            org.bson.json.Converter<java.lang.Long> r0 = org.bson.json.RelaxedExtendedJsonDateTimeConverter.FALLBACK_CONVERTER
            r0.convert(r6, r7)
        L31:
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.Long r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.convert2(r1, r2)
            return
    }
}
