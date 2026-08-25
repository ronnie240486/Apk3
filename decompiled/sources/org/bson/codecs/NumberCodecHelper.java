package org.bson.codecs;

/* JADX INFO: loaded from: classes3.dex */
final class NumberCodecHelper {

    /* JADX INFO: renamed from: org.bson.codecs.NumberCodecHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$BsonType = null;

        static {
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType = r0
                org.bson.BsonType r1 = org.bson.BsonType.INT32     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.BsonType r1 = org.bson.BsonType.INT64     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.BsonType r1 = org.bson.BsonType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private NumberCodecHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double decodeDouble(org.bson.BsonReader r7) {
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            org.bson.BsonType r1 = r7.getCurrentBsonType()
            int[] r2 = org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L68
            r4 = 2
            if (r2 == r4) goto L53
            r4 = 3
            if (r2 == r4) goto L4e
            r4 = 4
            if (r2 != r4) goto L3d
            org.bson.types.Decimal128 r7 = r7.readDecimal128()
            double r1 = r7.doubleValue()     // Catch: java.lang.NumberFormatException -> L38
            org.bson.types.Decimal128 r3 = new org.bson.types.Decimal128     // Catch: java.lang.NumberFormatException -> L38
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L38
            r4.<init>(r1)     // Catch: java.lang.NumberFormatException -> L38
            r3.<init>(r4)     // Catch: java.lang.NumberFormatException -> L38
            boolean r3 = r7.equals(r3)     // Catch: java.lang.NumberFormatException -> L38
            if (r3 == 0) goto L33
            goto L6d
        L33:
            org.bson.BsonInvalidOperationException r1 = invalidConversion(r0, r7)     // Catch: java.lang.NumberFormatException -> L38
            throw r1     // Catch: java.lang.NumberFormatException -> L38
        L38:
            org.bson.BsonInvalidOperationException r7 = invalidConversion(r0, r7)
            throw r7
        L3d:
            org.bson.BsonInvalidOperationException r7 = new org.bson.BsonInvalidOperationException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Invalid numeric type, found: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        L4e:
            double r1 = r7.readDouble()
            goto L6d
        L53:
            long r1 = r7.readInt64()
            double r3 = (double) r1
            long r5 = (long) r3
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L5f
            r1 = r3
            goto L6d
        L5f:
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            org.bson.BsonInvalidOperationException r7 = invalidConversion(r0, r7)
            throw r7
        L68:
            int r7 = r7.readInt32()
            double r1 = (double) r7
        L6d:
            return r1
    }

    public static int decodeInt(org.bson.BsonReader r6) {
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            org.bson.BsonType r1 = r6.getCurrentBsonType()
            int[] r2 = org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L6e
            r4 = 2
            if (r2 == r4) goto L59
            r4 = 3
            if (r2 == r4) goto L45
            r4 = 4
            if (r2 != r4) goto L34
            org.bson.types.Decimal128 r6 = r6.readDecimal128()
            int r1 = r6.intValue()
            org.bson.types.Decimal128 r2 = new org.bson.types.Decimal128
            long r3 = (long) r1
            r2.<init>(r3)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L2f
            goto L72
        L2f:
            org.bson.BsonInvalidOperationException r6 = invalidConversion(r0, r6)
            throw r6
        L34:
            org.bson.BsonInvalidOperationException r6 = new org.bson.BsonInvalidOperationException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Invalid numeric type, found: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            throw r6
        L45:
            double r1 = r6.readDouble()
            int r6 = (int) r1
            double r3 = (double) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L50
            goto L63
        L50:
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
            org.bson.BsonInvalidOperationException r6 = invalidConversion(r0, r6)
            throw r6
        L59:
            long r1 = r6.readInt64()
            int r6 = (int) r1
            long r3 = (long) r6
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L65
        L63:
            r1 = r6
            goto L72
        L65:
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            org.bson.BsonInvalidOperationException r6 = invalidConversion(r0, r6)
            throw r6
        L6e:
            int r1 = r6.readInt32()
        L72:
            return r1
    }

    public static long decodeLong(org.bson.BsonReader r7) {
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            org.bson.BsonType r1 = r7.getCurrentBsonType()
            int[] r2 = org.bson.codecs.NumberCodecHelper.AnonymousClass1.$SwitchMap$org$bson$BsonType
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L5e
            r4 = 2
            if (r2 == r4) goto L59
            r4 = 3
            if (r2 == r4) goto L44
            r4 = 4
            if (r2 != r4) goto L33
            org.bson.types.Decimal128 r7 = r7.readDecimal128()
            long r1 = r7.longValue()
            org.bson.types.Decimal128 r3 = new org.bson.types.Decimal128
            r3.<init>(r1)
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L2e
            goto L63
        L2e:
            org.bson.BsonInvalidOperationException r7 = invalidConversion(r0, r7)
            throw r7
        L33:
            org.bson.BsonInvalidOperationException r7 = new org.bson.BsonInvalidOperationException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Invalid numeric type, found: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        L44:
            double r1 = r7.readDouble()
            long r3 = (long) r1
            double r5 = (double) r3
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L50
            r1 = r3
            goto L63
        L50:
            java.lang.Double r7 = java.lang.Double.valueOf(r1)
            org.bson.BsonInvalidOperationException r7 = invalidConversion(r0, r7)
            throw r7
        L59:
            long r1 = r7.readInt64()
            goto L63
        L5e:
            int r7 = r7.readInt32()
            long r1 = (long) r7
        L63:
            return r1
    }

    private static <T extends java.lang.Number> org.bson.BsonInvalidOperationException invalidConversion(java.lang.Class<T> r3, java.lang.Number r4) {
            org.bson.BsonInvalidOperationException r0 = new org.bson.BsonInvalidOperationException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Could not convert `%s` to a %s without losing precision"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            return r0
    }
}
