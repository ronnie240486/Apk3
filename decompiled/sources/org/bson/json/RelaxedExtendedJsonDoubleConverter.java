package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class RelaxedExtendedJsonDoubleConverter implements org.bson.json.Converter<java.lang.Double> {
    private static final org.bson.json.Converter<java.lang.Double> FALLBACK_CONVERTER = null;

    static {
            org.bson.json.ExtendedJsonDoubleConverter r0 = new org.bson.json.ExtendedJsonDoubleConverter
            r0.<init>()
            org.bson.json.RelaxedExtendedJsonDoubleConverter.FALLBACK_CONVERTER = r0
            return
    }

    public RelaxedExtendedJsonDoubleConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(java.lang.Double r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            boolean r0 = r3.isNaN()
            if (r0 != 0) goto L19
            boolean r0 = r3.isInfinite()
            if (r0 == 0) goto Ld
            goto L19
        Ld:
            double r0 = r3.doubleValue()
            java.lang.String r3 = java.lang.Double.toString(r0)
            r4.writeNumber(r3)
            goto L1e
        L19:
            org.bson.json.Converter<java.lang.Double> r0 = org.bson.json.RelaxedExtendedJsonDoubleConverter.FALLBACK_CONVERTER
            r0.convert(r3, r4)
        L1e:
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(java.lang.Double r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            java.lang.Double r1 = (java.lang.Double) r1
            r0.convert2(r1, r2)
            return
    }
}
