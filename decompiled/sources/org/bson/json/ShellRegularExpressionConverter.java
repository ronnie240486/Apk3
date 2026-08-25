package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class ShellRegularExpressionConverter implements org.bson.json.Converter<org.bson.BsonRegularExpression> {
    public ShellRegularExpressionConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.json.Converter
    public /* bridge */ /* synthetic */ void convert(org.bson.BsonRegularExpression r1, org.bson.json.StrictJsonWriter r2) {
            r0 = this;
            org.bson.BsonRegularExpression r1 = (org.bson.BsonRegularExpression) r1
            r0.convert2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(org.bson.BsonRegularExpression r4, org.bson.json.StrictJsonWriter r5) {
            r3 = this;
            java.lang.String r0 = r4.getPattern()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "/"
            if (r0 == 0) goto L11
            java.lang.String r0 = "(?:)"
            goto L1b
        L11:
            java.lang.String r0 = r4.getPattern()
            java.lang.String r2 = "\\/"
            java.lang.String r0 = r0.replace(r1, r2)
        L1b:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r1, r0, r1)
            java.lang.String r4 = r4.getOptions()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.writeRaw(r4)
            return
    }
}
