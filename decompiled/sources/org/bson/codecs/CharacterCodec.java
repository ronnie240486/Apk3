package org.bson.codecs;

/* JADX INFO: loaded from: classes.dex */
public class CharacterCodec implements org.bson.codecs.Codec<java.lang.Character> {
    public CharacterCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public java.lang.Character decode(org.bson.BsonReader r3, org.bson.codecs.DecoderContext r4) {
            r2 = this;
            java.lang.String r3 = r3.readString()
            int r4 = r3.length()
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L15
            char r3 = r3.charAt(r0)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            return r3
        L15:
            org.bson.BsonInvalidOperationException r4 = new org.bson.BsonInvalidOperationException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r3
            java.lang.String r3 = "Attempting to decode the string '%s' to a character, but its length is not equal to one"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r4.<init>(r3)
            throw r4
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.lang.Character r1 = r0.decode(r1, r2)
            return r1
    }

    public void encode(org.bson.BsonWriter r1, java.lang.Character r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.String r3 = "value"
            org.bson.assertions.Assertions.notNull(r3, r2)
            java.lang.String r2 = r2.toString()
            r1.writeString(r2)
            return
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.lang.Character r2 = (java.lang.Character) r2
            r0.encode(r1, r2, r3)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.lang.Character> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            return r0
    }
}
