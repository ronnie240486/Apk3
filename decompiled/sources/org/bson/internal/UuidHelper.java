package org.bson.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class UuidHelper {

    /* JADX INFO: renamed from: org.bson.internal.UuidHelper$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bson$UuidRepresentation = null;

        static {
                org.bson.UuidRepresentation[] r0 = org.bson.UuidRepresentation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.bson.internal.UuidHelper.AnonymousClass1.$SwitchMap$org$bson$UuidRepresentation = r0
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.C_SHARP_LEGACY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.bson.internal.UuidHelper.AnonymousClass1.$SwitchMap$org$bson$UuidRepresentation     // Catch: java.lang.NoSuchFieldError -> L1d
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.JAVA_LEGACY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.bson.internal.UuidHelper.AnonymousClass1.$SwitchMap$org$bson$UuidRepresentation     // Catch: java.lang.NoSuchFieldError -> L28
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.PYTHON_LEGACY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.bson.internal.UuidHelper.AnonymousClass1.$SwitchMap$org$bson$UuidRepresentation     // Catch: java.lang.NoSuchFieldError -> L33
                org.bson.UuidRepresentation r1 = org.bson.UuidRepresentation.STANDARD     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private UuidHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.UUID decodeBinaryToUuid(byte[] r5, byte r6, org.bson.UuidRepresentation r7) {
            int r0 = r5.length
            r1 = 1
            r2 = 0
            r3 = 16
            if (r0 != r3) goto L62
            org.bson.BsonBinarySubType r0 = org.bson.BsonBinarySubType.UUID_LEGACY
            byte r0 = r0.getValue()
            r3 = 8
            if (r6 != r0) goto L54
            int[] r6 = org.bson.internal.UuidHelper.AnonymousClass1.$SwitchMap$org$bson$UuidRepresentation
            int r0 = r7.ordinal()
            r6 = r6[r0]
            r0 = 4
            r4 = 2
            if (r6 == r1) goto L4a
            if (r6 == r4) goto L43
            r1 = 3
            if (r6 == r1) goto L54
            if (r6 == r0) goto L3b
            org.bson.BSONException r5 = new org.bson.BSONException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unexpected UUID representation: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3b:
            org.bson.BSONException r5 = new org.bson.BSONException
            java.lang.String r6 = "Can not decode a subtype 3 (UUID legacy) BSON binary when the decoder is configured to use the standard UUID representation"
            r5.<init>(r6)
            throw r5
        L43:
            reverseByteArray(r5, r2, r3)
            reverseByteArray(r5, r3, r3)
            goto L54
        L4a:
            reverseByteArray(r5, r2, r0)
            reverseByteArray(r5, r0, r4)
            r6 = 6
            reverseByteArray(r5, r6, r4)
        L54:
            java.util.UUID r6 = new java.util.UUID
            long r0 = readLongFromArrayBigEndian(r5, r2)
            long r2 = readLongFromArrayBigEndian(r5, r3)
            r6.<init>(r0, r2)
            return r6
        L62:
            org.bson.BsonSerializationException r6 = new org.bson.BsonSerializationException
            java.lang.Object[] r7 = new java.lang.Object[r1]
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r2] = r5
            java.lang.String r5 = "Expected length to be 16, not %d."
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
    }

    public static byte[] encodeUuidToBinary(java.util.UUID r6, org.bson.UuidRepresentation r7) {
            r0 = 16
            byte[] r0 = new byte[r0]
            long r1 = r6.getMostSignificantBits()
            r3 = 0
            writeLongToArrayBigEndian(r0, r3, r1)
            long r1 = r6.getLeastSignificantBits()
            r6 = 8
            writeLongToArrayBigEndian(r0, r6, r1)
            int[] r1 = org.bson.internal.UuidHelper.AnonymousClass1.$SwitchMap$org$bson$UuidRepresentation
            int r2 = r7.ordinal()
            r1 = r1[r2]
            r2 = 1
            r4 = 4
            r5 = 2
            if (r1 == r2) goto L48
            if (r1 == r5) goto L41
            r6 = 3
            if (r1 == r6) goto L52
            if (r1 != r4) goto L2a
            goto L52
        L2a:
            org.bson.BSONException r6 = new org.bson.BSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected UUID representation: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L41:
            reverseByteArray(r0, r3, r6)
            reverseByteArray(r0, r6, r6)
            goto L52
        L48:
            reverseByteArray(r0, r3, r4)
            reverseByteArray(r0, r4, r5)
            r6 = 6
            reverseByteArray(r0, r6, r5)
        L52:
            return r0
    }

    private static long readLongFromArrayBigEndian(byte[] r7, int r8) {
            int r0 = r8 + 7
            r0 = r7[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 0
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    private static void reverseByteArray(byte[] r2, int r3, int r4) {
            int r4 = r4 + r3
            int r4 = r4 + (-1)
        L3:
            if (r3 >= r4) goto L12
            r0 = r2[r3]
            r1 = r2[r4]
            r2[r3] = r1
            r2[r4] = r0
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            goto L3
        L12:
            return
    }

    private static void writeLongToArrayBigEndian(byte[] r5, int r6, long r7) {
            int r0 = r6 + 7
            r1 = 255(0xff, double:1.26E-321)
            long r3 = r7 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            int r0 = r6 + 6
            r3 = 8
            long r3 = r7 >> r3
            long r3 = r3 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            int r0 = r6 + 5
            r3 = 16
            long r3 = r7 >> r3
            long r3 = r3 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            int r0 = r6 + 4
            r3 = 24
            long r3 = r7 >> r3
            long r3 = r3 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            int r0 = r6 + 3
            r3 = 32
            long r3 = r7 >> r3
            long r3 = r3 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            int r0 = r6 + 2
            r3 = 40
            long r3 = r7 >> r3
            long r3 = r3 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            int r0 = r6 + 1
            r3 = 48
            long r3 = r7 >> r3
            long r3 = r3 & r1
            int r4 = (int) r3
            byte r3 = (byte) r4
            r5[r0] = r3
            r0 = 56
            long r7 = r7 >> r0
            long r7 = r7 & r1
            int r8 = (int) r7
            byte r7 = (byte) r8
            r5[r6] = r7
            return
    }
}
