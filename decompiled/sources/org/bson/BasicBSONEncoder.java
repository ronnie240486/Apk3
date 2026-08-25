package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BasicBSONEncoder implements org.bson.BSONEncoder {
    private org.bson.BsonBinaryWriter bsonWriter;
    private org.bson.io.OutputBuffer outputBuffer;

    public BasicBSONEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean isTopLevelDocument() {
            r1 = this;
            org.bson.BsonBinaryWriter r0 = r1.bsonWriter
            org.bson.BsonBinaryWriter$Context r0 = r0.getContext()
            org.bson.BsonBinaryWriter$Context r0 = r0.getParentContext()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static void writeLongToArrayLittleEndian(byte[] r5, int r6, long r7) {
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r7 & r0
            int r3 = (int) r2
            byte r2 = (byte) r3
            r5[r6] = r2
            int r2 = r6 + 1
            r3 = 8
            long r3 = r7 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r2] = r3
            int r2 = r6 + 2
            r3 = 16
            long r3 = r7 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r2] = r3
            int r2 = r6 + 3
            r3 = 24
            long r3 = r7 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r2] = r3
            int r2 = r6 + 4
            r3 = 32
            long r3 = r7 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r2] = r3
            int r2 = r6 + 5
            r3 = 40
            long r3 = r7 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r2] = r3
            int r2 = r6 + 6
            r3 = 48
            long r3 = r7 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r2] = r3
            int r6 = r6 + 7
            r2 = 56
            long r7 = r7 >> r2
            long r7 = r7 & r0
            int r8 = (int) r7
            byte r7 = (byte) r8
            r5[r6] = r7
            return
    }

    public final void _putObjectField(java.lang.String r6, java.lang.Object r7) {
            r5 = this;
            java.lang.String r0 = "_transientFields"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "\u0000"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L34f
            java.lang.String r0 = "$where"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L31
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L31
            org.bson.types.Code r0 = new org.bson.types.Code
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            r5.putName(r6)
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            java.lang.String r0 = r0.getCode()
            r1.writeJavaScript(r0)
        L31:
            java.lang.Object r7 = org.bson.BSON.applyEncodingHooks(r7)
            if (r7 != 0) goto L41
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeNull()
            goto L339
        L41:
            boolean r0 = r7 instanceof java.util.Date
            if (r0 == 0) goto L55
            java.util.Date r7 = (java.util.Date) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            long r0 = r7.getTime()
            r6.writeDateTime(r0)
            goto L339
        L55:
            boolean r0 = r7 instanceof org.bson.types.Decimal128
            if (r0 == 0) goto L65
            org.bson.types.Decimal128 r7 = (org.bson.types.Decimal128) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeDecimal128(r7)
            goto L339
        L65:
            boolean r0 = r7 instanceof java.lang.Number
            java.lang.String r1 = "Can't serialize "
            if (r0 == 0) goto Lc9
            java.lang.Number r7 = (java.lang.Number) r7
            r5.putName(r6)
            boolean r6 = r7 instanceof java.lang.Integer
            if (r6 != 0) goto Lbe
            boolean r6 = r7 instanceof java.lang.Short
            if (r6 != 0) goto Lbe
            boolean r6 = r7 instanceof java.lang.Byte
            if (r6 != 0) goto Lbe
            boolean r6 = r7 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r6 == 0) goto L81
            goto Lbe
        L81:
            boolean r6 = r7 instanceof java.lang.Long
            if (r6 != 0) goto Lb3
            boolean r6 = r7 instanceof java.util.concurrent.atomic.AtomicLong
            if (r6 == 0) goto L8a
            goto Lb3
        L8a:
            boolean r6 = r7 instanceof java.lang.Float
            if (r6 != 0) goto La8
            boolean r6 = r7 instanceof java.lang.Double
            if (r6 == 0) goto L93
            goto La8
        L93:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r7 = r7.getClass()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        La8:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            double r0 = r7.doubleValue()
            r6.writeDouble(r0)
            goto L339
        Lb3:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            long r0 = r7.longValue()
            r6.writeInt64(r0)
            goto L339
        Lbe:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            int r7 = r7.intValue()
            r6.writeInt32(r7)
            goto L339
        Lc9:
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto Ldb
            java.lang.String r7 = r7.toString()
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeString(r7)
            goto L339
        Ldb:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto Led
            java.lang.String r7 = r7.toString()
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeString(r7)
            goto L339
        Led:
            boolean r0 = r7 instanceof org.bson.types.ObjectId
            if (r0 == 0) goto Lfd
            org.bson.types.ObjectId r7 = (org.bson.types.ObjectId) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeObjectId(r7)
            goto L339
        Lfd:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L111
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            boolean r7 = r7.booleanValue()
            r6.writeBoolean(r7)
            goto L339
        L111:
            boolean r0 = r7 instanceof java.util.regex.Pattern
            if (r0 == 0) goto L132
            java.util.regex.Pattern r7 = (java.util.regex.Pattern) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            org.bson.BsonRegularExpression r0 = new org.bson.BsonRegularExpression
            java.lang.String r1 = r7.pattern()
            int r7 = r7.flags()
            java.lang.String r7 = org.bson.BSON.regexFlags(r7)
            r0.<init>(r1, r7)
            r6.writeRegularExpression(r0)
            goto L339
        L132:
            boolean r0 = r7 instanceof java.lang.Iterable
            r2 = 0
            if (r0 == 0) goto L15e
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeStartArray()
            java.util.Iterator r6 = r7.iterator()
        L145:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L157
            java.lang.Object r7 = r6.next()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5._putObjectField(r0, r7)
            goto L145
        L157:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeEndArray()
            goto L339
        L15e:
            boolean r0 = r7 instanceof org.bson.BSONObject
            if (r0 == 0) goto L16c
            org.bson.BSONObject r7 = (org.bson.BSONObject) r7
            r5.putName(r6)
            r5.putObject(r7)
            goto L339
        L16c:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L1a3
            java.util.Map r7 = (java.util.Map) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeStartDocument()
            java.util.Set r6 = r7.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L182:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L19c
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r7 = r7.getValue()
            r5._putObjectField(r0, r7)
            goto L182
        L19c:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeEndDocument()
            goto L339
        L1a3:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L1b8
            byte[] r7 = (byte[]) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            org.bson.BsonBinary r0 = new org.bson.BsonBinary
            r0.<init>(r7)
            r6.writeBinaryData(r0)
            goto L339
        L1b8:
            boolean r3 = r7 instanceof org.bson.types.Binary
            if (r3 == 0) goto L1d5
            org.bson.types.Binary r7 = (org.bson.types.Binary) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            org.bson.BsonBinary r0 = new org.bson.BsonBinary
            byte r1 = r7.getType()
            byte[] r7 = r7.getData()
            r0.<init>(r1, r7)
            r6.writeBinaryData(r0)
            goto L339
        L1d5:
            boolean r3 = r7 instanceof java.util.UUID
            if (r3 == 0) goto L200
            java.util.UUID r7 = (java.util.UUID) r7
            r5.putName(r6)
            r6 = 16
            byte[] r6 = new byte[r6]
            long r0 = r7.getMostSignificantBits()
            writeLongToArrayLittleEndian(r6, r2, r0)
            long r0 = r7.getLeastSignificantBits()
            r7 = 8
            writeLongToArrayLittleEndian(r6, r7, r0)
            org.bson.BsonBinaryWriter r7 = r5.bsonWriter
            org.bson.BsonBinary r0 = new org.bson.BsonBinary
            org.bson.BsonBinarySubType r1 = org.bson.BsonBinarySubType.UUID_LEGACY
            r0.<init>(r1, r6)
            r7.writeBinaryData(r0)
            goto L339
        L200:
            java.lang.Class r3 = r7.getClass()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L2c4
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeStartArray()
            boolean r6 = r7 instanceof int[]
            if (r6 == 0) goto L225
            int[] r7 = (int[]) r7
            int r6 = r7.length
        L219:
            if (r2 >= r6) goto L2bd
            r0 = r7[r2]
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            r1.writeInt32(r0)
            int r2 = r2 + 1
            goto L219
        L225:
            boolean r6 = r7 instanceof long[]
            if (r6 == 0) goto L238
            long[] r7 = (long[]) r7
            int r6 = r7.length
        L22c:
            if (r2 >= r6) goto L2bd
            r0 = r7[r2]
            org.bson.BsonBinaryWriter r3 = r5.bsonWriter
            r3.writeInt64(r0)
            int r2 = r2 + 1
            goto L22c
        L238:
            boolean r6 = r7 instanceof float[]
            if (r6 == 0) goto L24c
            float[] r7 = (float[]) r7
            int r6 = r7.length
        L23f:
            if (r2 >= r6) goto L2bd
            r0 = r7[r2]
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            double r3 = (double) r0
            r1.writeDouble(r3)
            int r2 = r2 + 1
            goto L23f
        L24c:
            boolean r6 = r7 instanceof short[]
            if (r6 == 0) goto L25f
            short[] r7 = (short[]) r7
            int r6 = r7.length
        L253:
            if (r2 >= r6) goto L2bd
            short r0 = r7[r2]
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            r1.writeInt32(r0)
            int r2 = r2 + 1
            goto L253
        L25f:
            if (r0 == 0) goto L270
            byte[] r7 = (byte[]) r7
            int r6 = r7.length
        L264:
            if (r2 >= r6) goto L2bd
            r0 = r7[r2]
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            r1.writeInt32(r0)
            int r2 = r2 + 1
            goto L264
        L270:
            boolean r6 = r7 instanceof double[]
            if (r6 == 0) goto L283
            double[] r7 = (double[]) r7
            int r6 = r7.length
        L277:
            if (r2 >= r6) goto L2bd
            r0 = r7[r2]
            org.bson.BsonBinaryWriter r3 = r5.bsonWriter
            r3.writeDouble(r0)
            int r2 = r2 + 1
            goto L277
        L283:
            boolean r6 = r7 instanceof boolean[]
            if (r6 == 0) goto L296
            boolean[] r7 = (boolean[]) r7
            int r6 = r7.length
        L28a:
            if (r2 >= r6) goto L2bd
            boolean r0 = r7[r2]
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            r1.writeBoolean(r0)
            int r2 = r2 + 1
            goto L28a
        L296:
            boolean r6 = r7 instanceof java.lang.String[]
            if (r6 == 0) goto L2a9
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r6 = r7.length
        L29d:
            if (r2 >= r6) goto L2bd
            r0 = r7[r2]
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            r1.writeString(r0)
            int r2 = r2 + 1
            goto L29d
        L2a9:
            int r6 = java.lang.reflect.Array.getLength(r7)
        L2ad:
            if (r2 >= r6) goto L2bd
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.Object r1 = java.lang.reflect.Array.get(r7, r2)
            r5._putObjectField(r0, r1)
            int r2 = r2 + 1
            goto L2ad
        L2bd:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeEndArray()
            goto L339
        L2c4:
            boolean r0 = r7 instanceof org.bson.types.Symbol
            if (r0 == 0) goto L2d7
            org.bson.types.Symbol r7 = (org.bson.types.Symbol) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            java.lang.String r7 = r7.getSymbol()
            r6.writeSymbol(r7)
            goto L339
        L2d7:
            boolean r0 = r7 instanceof org.bson.types.BSONTimestamp
            if (r0 == 0) goto L2f3
            org.bson.types.BSONTimestamp r7 = (org.bson.types.BSONTimestamp) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            org.bson.BsonTimestamp r0 = new org.bson.BsonTimestamp
            int r1 = r7.getTime()
            int r7 = r7.getInc()
            r0.<init>(r1, r7)
            r6.writeTimestamp(r0)
            goto L339
        L2f3:
            boolean r0 = r7 instanceof org.bson.types.CodeWScope
            if (r0 == 0) goto L30d
            org.bson.types.CodeWScope r7 = (org.bson.types.CodeWScope) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            java.lang.String r0 = r7.getCode()
            r6.writeJavaScriptWithScope(r0)
            org.bson.BSONObject r6 = r7.getScope()
            r5.putObject(r6)
            goto L339
        L30d:
            boolean r0 = r7 instanceof org.bson.types.Code
            if (r0 == 0) goto L320
            org.bson.types.Code r7 = (org.bson.types.Code) r7
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            java.lang.String r7 = r7.getCode()
            r6.writeJavaScript(r7)
            goto L339
        L320:
            boolean r0 = r7 instanceof org.bson.types.MinKey
            if (r0 == 0) goto L32d
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeMinKey()
            goto L339
        L32d:
            boolean r0 = r7 instanceof org.bson.types.MaxKey
            if (r0 == 0) goto L33a
            r5.putName(r6)
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeMaxKey()
        L339:
            return
        L33a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r7 = r7.getClass()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L34f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Document field names can't have a NULL character. (Bad Key: '"
            java.lang.String r1 = "')"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6, r1)
            r7.<init>(r6)
            throw r7
    }

    @Override // org.bson.BSONEncoder
    public void done() {
            r1 = this;
            org.bson.BsonBinaryWriter r0 = r1.bsonWriter
            r0.close()
            r0 = 0
            r1.bsonWriter = r0
            return
    }

    @Override // org.bson.BSONEncoder
    public byte[] encode(org.bson.BSONObject r2) {
            r1 = this;
            org.bson.io.BasicOutputBuffer r0 = new org.bson.io.BasicOutputBuffer
            r0.<init>()
            r1.set(r0)
            r1.putObject(r2)
            r1.done()
            byte[] r2 = r0.toByteArray()
            return r2
    }

    public final void putName(java.lang.String r3) {
            r2 = this;
            org.bson.BsonBinaryWriter r0 = r2.bsonWriter
            org.bson.AbstractBsonWriter$State r0 = r0.getState()
            org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.NAME
            if (r0 != r1) goto Lf
            org.bson.BsonBinaryWriter r0 = r2.bsonWriter
            r0.writeName(r3)
        Lf:
            return
    }

    @Override // org.bson.BSONEncoder
    public int putObject(org.bson.BSONObject r6) {
            r5 = this;
            org.bson.io.OutputBuffer r0 = r5.outputBuffer
            int r0 = r0.getPosition()
            org.bson.BsonBinaryWriter r1 = r5.bsonWriter
            r1.writeStartDocument()
            boolean r1 = r5.isTopLevelDocument()
            java.lang.String r2 = "_id"
            if (r1 == 0) goto L20
            boolean r1 = r6.containsField(r2)
            if (r1 == 0) goto L20
            java.lang.Object r1 = r6.get(r2)
            r5._putObjectField(r2, r1)
        L20:
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r5.isTopLevelDocument()
            if (r4 == 0) goto L41
            boolean r4 = r3.equals(r2)
            if (r4 == 0) goto L41
            goto L28
        L41:
            java.lang.Object r4 = r6.get(r3)
            r5._putObjectField(r3, r4)
            goto L28
        L49:
            org.bson.BsonBinaryWriter r6 = r5.bsonWriter
            r6.writeEndDocument()
            org.bson.io.OutputBuffer r6 = r5.outputBuffer
            int r6 = r6.getPosition()
            int r6 = r6 - r0
            return r6
    }

    @Override // org.bson.BSONEncoder
    public void set(org.bson.io.OutputBuffer r2) {
            r1 = this;
            org.bson.BsonBinaryWriter r0 = r1.bsonWriter
            if (r0 != 0) goto Le
            r1.outputBuffer = r2
            org.bson.BsonBinaryWriter r0 = new org.bson.BsonBinaryWriter
            r0.<init>(r2)
            r1.bsonWriter = r0
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Performing another operation at this moment"
            r2.<init>(r0)
            throw r2
    }
}
