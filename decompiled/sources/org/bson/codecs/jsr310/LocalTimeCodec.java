package org.bson.codecs.jsr310;

/* JADX INFO: loaded from: classes3.dex */
public class LocalTimeCodec extends org.bson.codecs.jsr310.DateTimeBasedCodec<java.time.LocalTime> {
    public LocalTimeCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.Decoder
    public /* bridge */ /* synthetic */ java.lang.Object decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            java.time.LocalTime r1 = r0.decode(r1, r2)
            return r1
    }

    @Override // org.bson.codecs.Decoder
    public java.time.LocalTime decode(org.bson.BsonReader r1, org.bson.codecs.DecoderContext r2) {
            r0 = this;
            long r1 = r0.validateAndReadDateTime(r1)
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.OffsetDateTime r1 = r1.atOffset(r2)
            java.time.LocalTime r1 = r1.toLocalTime()
            return r1
    }

    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(org.bson.BsonWriter r1, java.lang.Object r2, org.bson.codecs.EncoderContext r3) {
            r0 = this;
            java.time.LocalTime r2 = (java.time.LocalTime) r2
            r0.encode(r1, r2, r3)
            return
    }

    public void encode(org.bson.BsonWriter r3, java.time.LocalTime r4, org.bson.codecs.EncoderContext r5) {
            r2 = this;
            r0 = 0
            java.time.LocalDate r5 = java.time.LocalDate.ofEpochDay(r0)
            java.time.LocalDateTime r4 = r4.atDate(r5)
            java.time.ZoneOffset r5 = java.time.ZoneOffset.UTC
            java.time.Instant r4 = r4.toInstant(r5)
            long r4 = r4.toEpochMilli()
            r3.writeDateTime(r4)
            return
    }

    @Override // org.bson.codecs.Encoder
    public java.lang.Class<java.time.LocalTime> getEncoderClass() {
            r1 = this;
            java.lang.Class<java.time.LocalTime> r0 = java.time.LocalTime.class
            return r0
    }
}
