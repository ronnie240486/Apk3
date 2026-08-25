package org.bson.codecs.jsr310;

/* JADX INFO: loaded from: classes.dex */
abstract class DateTimeBasedCodec<T> implements org.bson.codecs.Codec<T> {
    public DateTimeBasedCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public final long validateAndReadDateTime(org.bson.BsonReader r6) {
            r5 = this;
            org.bson.BsonType r0 = r6.getCurrentBsonType()
            org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L11
            long r0 = r6.readDateTime()
            return r0
        L11:
            org.bson.codecs.configuration.CodecConfigurationException r6 = new org.bson.codecs.configuration.CodecConfigurationException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Class r4 = r5.getEncoderClass()
            java.lang.String r4 = r4.getSimpleName()
            r2[r3] = r4
            r3 = 1
            r2[r3] = r1
            r1 = 2
            r2[r1] = r0
            java.lang.String r0 = "Could not decode into %s, expected '%s' BsonType but got '%s'."
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r6.<init>(r0)
            throw r6
    }
}
