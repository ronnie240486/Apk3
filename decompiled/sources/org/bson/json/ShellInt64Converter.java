package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class ShellInt64Converter implements org.bson.json.Converter<java.lang.Long> {
    public ShellInt64Converter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Long r8, org.bson.json.StrictJsonWriter r9) {
            r7 = this;
            long r0 = r8.longValue()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L26
            long r0 = r8.longValue()
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L26
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r8
            java.lang.String r8 = "NumberLong(%d)"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            r9.writeRaw(r8)
            goto L33
        L26:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r8
            java.lang.String r8 = "NumberLong(\"%d\")"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            r9.writeRaw(r8)
        L33:
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
