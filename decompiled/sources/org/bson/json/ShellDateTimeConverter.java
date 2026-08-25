package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class ShellDateTimeConverter implements org.bson.json.Converter<java.lang.Long> {
    public ShellDateTimeConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Long r9, org.bson.json.StrictJsonWriter r10) {
            r8 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
            r0.<init>(r1)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            long r1 = r9.longValue()
            r3 = 0
            r4 = 1
            r5 = -59014396800000(0xffffca53a3d79400, double:NaN)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L48
            long r1 = r9.longValue()
            r5 = 253399536000000(0xe6772d545c00, double:1.25196005409712E-309)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L48
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.Date r2 = new java.util.Date
            long r4 = r9.longValue()
            r2.<init>(r4)
            java.lang.String r9 = r0.format(r2)
            r1[r3] = r9
            java.lang.String r9 = "ISODate(\"%s\")"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r10.writeRaw(r9)
            goto L55
        L48:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r9
            java.lang.String r9 = "new Date(%d)"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            r10.writeRaw(r9)
        L55:
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
