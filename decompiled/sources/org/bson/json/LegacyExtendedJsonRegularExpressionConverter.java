package org.bson.json;

/* JADX INFO: loaded from: classes2.dex */
class LegacyExtendedJsonRegularExpressionConverter implements org.bson.json.Converter<org.bson.BsonRegularExpression> {
    public LegacyExtendedJsonRegularExpressionConverter() {
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
    public void convert2(org.bson.BsonRegularExpression r3, org.bson.json.StrictJsonWriter r4) {
            r2 = this;
            r4.writeStartObject()
            java.lang.String r0 = r3.getPattern()
            java.lang.String r1 = "$regex"
            r4.writeString(r1, r0)
            java.lang.String r3 = r3.getOptions()
            java.lang.String r0 = "$options"
            r4.writeString(r0, r3)
            r4.writeEndObject()
            return
    }
}
