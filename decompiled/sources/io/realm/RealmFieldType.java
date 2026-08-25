package io.realm;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public final enum RealmFieldType extends java.lang.Enum<io.realm.RealmFieldType> {
    private static final /* synthetic */ io.realm.RealmFieldType[] $VALUES = null;
    public static final io.realm.RealmFieldType BINARY = null;
    public static final io.realm.RealmFieldType BINARY_LIST = null;
    public static final io.realm.RealmFieldType BINARY_SET = null;
    public static final io.realm.RealmFieldType BOOLEAN = null;
    public static final io.realm.RealmFieldType BOOLEAN_LIST = null;
    public static final io.realm.RealmFieldType BOOLEAN_SET = null;
    public static final io.realm.RealmFieldType DATE = null;
    public static final io.realm.RealmFieldType DATE_LIST = null;
    public static final io.realm.RealmFieldType DATE_SET = null;
    public static final io.realm.RealmFieldType DECIMAL128 = null;
    public static final io.realm.RealmFieldType DECIMAL128_LIST = null;
    public static final io.realm.RealmFieldType DECIMAL128_SET = null;
    public static final io.realm.RealmFieldType DOUBLE = null;
    public static final io.realm.RealmFieldType DOUBLE_LIST = null;
    public static final io.realm.RealmFieldType DOUBLE_SET = null;
    public static final io.realm.RealmFieldType FLOAT = null;
    public static final io.realm.RealmFieldType FLOAT_LIST = null;
    public static final io.realm.RealmFieldType FLOAT_SET = null;
    public static final io.realm.RealmFieldType INTEGER = null;
    public static final io.realm.RealmFieldType INTEGER_LIST = null;
    public static final io.realm.RealmFieldType INTEGER_SET = null;
    public static final io.realm.RealmFieldType LINKING_OBJECTS = null;
    public static final io.realm.RealmFieldType LINK_SET = null;
    public static final io.realm.RealmFieldType LIST = null;
    public static final io.realm.RealmFieldType MIXED = null;
    public static final io.realm.RealmFieldType MIXED_LIST = null;
    public static final io.realm.RealmFieldType MIXED_SET = null;
    public static final io.realm.RealmFieldType OBJECT = null;
    public static final io.realm.RealmFieldType OBJECT_ID = null;
    public static final io.realm.RealmFieldType OBJECT_ID_LIST = null;
    public static final io.realm.RealmFieldType OBJECT_ID_SET = null;
    public static final io.realm.RealmFieldType STRING = null;
    public static final io.realm.RealmFieldType STRING_LIST = null;
    public static final io.realm.RealmFieldType STRING_SET = null;
    public static final io.realm.RealmFieldType STRING_TO_BINARY_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_BOOLEAN_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_DATE_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_DECIMAL128_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_DOUBLE_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_FLOAT_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_INTEGER_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_LINK_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_MIXED_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_OBJECT_ID_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_STRING_MAP = null;
    public static final io.realm.RealmFieldType STRING_TO_UUID_MAP = null;
    public static final io.realm.RealmFieldType TYPED_LINK = null;
    public static final io.realm.RealmFieldType UUID = null;
    public static final io.realm.RealmFieldType UUID_LIST = null;
    public static final io.realm.RealmFieldType UUID_SET = null;
    private static final io.realm.RealmFieldType[] basicTypes = null;
    private static final io.realm.RealmFieldType[] listTypes = null;
    private static final io.realm.RealmFieldType[] mapTypes = null;
    private static final io.realm.RealmFieldType[] setTypes = null;
    private final int nativeValue;

    static {
            io.realm.RealmFieldType r0 = new io.realm.RealmFieldType
            java.lang.String r1 = "INTEGER"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.realm.RealmFieldType.INTEGER = r0
            io.realm.RealmFieldType r1 = new io.realm.RealmFieldType
            java.lang.String r3 = "BOOLEAN"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.realm.RealmFieldType.BOOLEAN = r1
            io.realm.RealmFieldType r3 = new io.realm.RealmFieldType
            java.lang.String r5 = "STRING"
            r6 = 2
            r3.<init>(r5, r6, r6)
            io.realm.RealmFieldType.STRING = r3
            io.realm.RealmFieldType r5 = new io.realm.RealmFieldType
            java.lang.String r7 = "BINARY"
            r8 = 3
            r9 = 4
            r5.<init>(r7, r8, r9)
            io.realm.RealmFieldType.BINARY = r5
            io.realm.RealmFieldType r7 = new io.realm.RealmFieldType
            java.lang.String r10 = "DATE"
            r11 = 8
            r7.<init>(r10, r9, r11)
            io.realm.RealmFieldType.DATE = r7
            io.realm.RealmFieldType r10 = new io.realm.RealmFieldType
            java.lang.String r12 = "FLOAT"
            r13 = 5
            r14 = 9
            r10.<init>(r12, r13, r14)
            io.realm.RealmFieldType.FLOAT = r10
            io.realm.RealmFieldType r12 = new io.realm.RealmFieldType
            java.lang.String r15 = "DOUBLE"
            r13 = 6
            r9 = 10
            r12.<init>(r15, r13, r9)
            io.realm.RealmFieldType.DOUBLE = r12
            io.realm.RealmFieldType r15 = new io.realm.RealmFieldType
            java.lang.String r8 = "OBJECT"
            r6 = 7
            r4 = 12
            r15.<init>(r8, r6, r4)
            io.realm.RealmFieldType.OBJECT = r15
            io.realm.RealmFieldType r8 = new io.realm.RealmFieldType
            java.lang.String r6 = "DECIMAL128"
            r2 = 11
            r8.<init>(r6, r11, r2)
            io.realm.RealmFieldType.DECIMAL128 = r8
            io.realm.RealmFieldType r6 = new io.realm.RealmFieldType
            java.lang.String r11 = "OBJECT_ID"
            r4 = 15
            r6.<init>(r11, r14, r4)
            io.realm.RealmFieldType.OBJECT_ID = r6
            io.realm.RealmFieldType r11 = new io.realm.RealmFieldType
            java.lang.String r14 = "UUID"
            r4 = 17
            r11.<init>(r14, r9, r4)
            io.realm.RealmFieldType.UUID = r11
            io.realm.RealmFieldType r14 = new io.realm.RealmFieldType
            java.lang.String r9 = "MIXED"
            r14.<init>(r9, r2, r13)
            io.realm.RealmFieldType.MIXED = r14
            io.realm.RealmFieldType r9 = new io.realm.RealmFieldType
            java.lang.String r2 = "TYPED_LINK"
            r13 = 16
            r4 = 12
            r9.<init>(r2, r4, r13)
            io.realm.RealmFieldType.TYPED_LINK = r9
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r4 = "LIST"
            r13 = 13
            r2.<init>(r4, r13, r13)
            io.realm.RealmFieldType.LIST = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r13 = "LINKING_OBJECTS"
            r16 = r2
            r2 = 14
            r4.<init>(r13, r2, r2)
            io.realm.RealmFieldType.LINKING_OBJECTS = r4
            io.realm.RealmFieldType r13 = new io.realm.RealmFieldType
            java.lang.String r2 = "INTEGER_LIST"
            r17 = r4
            r4 = 128(0x80, float:1.8E-43)
            r18 = r9
            r9 = 15
            r13.<init>(r2, r9, r4)
            io.realm.RealmFieldType.INTEGER_LIST = r13
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "BOOLEAN_LIST"
            r4 = 129(0x81, float:1.81E-43)
            r19 = r13
            r13 = 16
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.BOOLEAN_LIST = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_LIST"
            r13 = 130(0x82, float:1.82E-43)
            r20 = r2
            r2 = 17
            r4.<init>(r9, r2, r13)
            io.realm.RealmFieldType.STRING_LIST = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "BINARY_LIST"
            r13 = 18
            r21 = r4
            r4 = 132(0x84, float:1.85E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.BINARY_LIST = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "DATE_LIST"
            r13 = 19
            r22 = r2
            r2 = 136(0x88, float:1.9E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.DATE_LIST = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "FLOAT_LIST"
            r13 = 20
            r23 = r4
            r4 = 137(0x89, float:1.92E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.FLOAT_LIST = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "DOUBLE_LIST"
            r13 = 21
            r24 = r2
            r2 = 138(0x8a, float:1.93E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.DOUBLE_LIST = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "DECIMAL128_LIST"
            r13 = 22
            r25 = r4
            r4 = 139(0x8b, float:1.95E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.DECIMAL128_LIST = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "OBJECT_ID_LIST"
            r13 = 23
            r26 = r2
            r2 = 143(0x8f, float:2.0E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.OBJECT_ID_LIST = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "UUID_LIST"
            r13 = 24
            r27 = r4
            r4 = 145(0x91, float:2.03E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.UUID_LIST = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "MIXED_LIST"
            r13 = 25
            r28 = r2
            r2 = 134(0x86, float:1.88E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.MIXED_LIST = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_INTEGER_MAP"
            r13 = 26
            r29 = r4
            r4 = 512(0x200, float:7.17E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.STRING_TO_INTEGER_MAP = r2
            io.realm.RealmFieldType r9 = new io.realm.RealmFieldType
            java.lang.String r13 = "STRING_TO_BOOLEAN_MAP"
            r4 = 27
            r30 = r2
            r2 = 513(0x201, float:7.19E-43)
            r9.<init>(r13, r4, r2)
            io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP = r9
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r4 = "STRING_TO_STRING_MAP"
            r13 = 28
            r31 = r9
            r9 = 514(0x202, float:7.2E-43)
            r2.<init>(r4, r13, r9)
            io.realm.RealmFieldType.STRING_TO_STRING_MAP = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_BINARY_MAP"
            r13 = 29
            r32 = r2
            r2 = 516(0x204, float:7.23E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.STRING_TO_BINARY_MAP = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_DATE_MAP"
            r13 = 30
            r33 = r4
            r4 = 520(0x208, float:7.29E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.STRING_TO_DATE_MAP = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_FLOAT_MAP"
            r13 = 31
            r34 = r2
            r2 = 521(0x209, float:7.3E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.STRING_TO_FLOAT_MAP = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_DOUBLE_MAP"
            r13 = 32
            r35 = r4
            r4 = 522(0x20a, float:7.31E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_DECIMAL128_MAP"
            r13 = 33
            r36 = r2
            r2 = 523(0x20b, float:7.33E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_OBJECT_ID_MAP"
            r13 = 34
            r37 = r4
            r4 = 527(0x20f, float:7.38E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_UUID_MAP"
            r13 = 35
            r38 = r2
            r2 = 529(0x211, float:7.41E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.STRING_TO_UUID_MAP = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_MIXED_MAP"
            r13 = 36
            r39 = r4
            r4 = 518(0x206, float:7.26E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.STRING_TO_MIXED_MAP = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "STRING_TO_LINK_MAP"
            r13 = 37
            r40 = r2
            r2 = 524(0x20c, float:7.34E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.STRING_TO_LINK_MAP = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "INTEGER_SET"
            r13 = 38
            r41 = r4
            r4 = 256(0x100, float:3.59E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.INTEGER_SET = r2
            io.realm.RealmFieldType r9 = new io.realm.RealmFieldType
            java.lang.String r13 = "BOOLEAN_SET"
            r4 = 39
            r42 = r2
            r2 = 257(0x101, float:3.6E-43)
            r9.<init>(r13, r4, r2)
            io.realm.RealmFieldType.BOOLEAN_SET = r9
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r4 = "STRING_SET"
            r13 = 40
            r43 = r9
            r9 = 258(0x102, float:3.62E-43)
            r2.<init>(r4, r13, r9)
            io.realm.RealmFieldType.STRING_SET = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "BINARY_SET"
            r13 = 41
            r44 = r2
            r2 = 260(0x104, float:3.64E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.BINARY_SET = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "DATE_SET"
            r13 = 42
            r45 = r4
            r4 = 264(0x108, float:3.7E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.DATE_SET = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "FLOAT_SET"
            r13 = 43
            r46 = r2
            r2 = 265(0x109, float:3.71E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.FLOAT_SET = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "DOUBLE_SET"
            r13 = 44
            r47 = r4
            r4 = 266(0x10a, float:3.73E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.DOUBLE_SET = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "DECIMAL128_SET"
            r13 = 45
            r48 = r2
            r2 = 267(0x10b, float:3.74E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.DECIMAL128_SET = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "OBJECT_ID_SET"
            r13 = 46
            r49 = r4
            r4 = 271(0x10f, float:3.8E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.OBJECT_ID_SET = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "UUID_SET"
            r13 = 47
            r50 = r2
            r2 = 273(0x111, float:3.83E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.UUID_SET = r4
            io.realm.RealmFieldType r2 = new io.realm.RealmFieldType
            java.lang.String r9 = "LINK_SET"
            r13 = 48
            r51 = r4
            r4 = 268(0x10c, float:3.76E-43)
            r2.<init>(r9, r13, r4)
            io.realm.RealmFieldType.LINK_SET = r2
            io.realm.RealmFieldType r4 = new io.realm.RealmFieldType
            java.lang.String r9 = "MIXED_SET"
            r13 = 49
            r52 = r2
            r2 = 262(0x106, float:3.67E-43)
            r4.<init>(r9, r13, r2)
            io.realm.RealmFieldType.MIXED_SET = r4
            r2 = 50
            io.realm.RealmFieldType[] r2 = new io.realm.RealmFieldType[r2]
            r9 = 0
            r2[r9] = r0
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r3
            r0 = 3
            r2[r0] = r5
            r0 = 4
            r2[r0] = r7
            r0 = 5
            r2[r0] = r10
            r0 = 6
            r2[r0] = r12
            r0 = 7
            r2[r0] = r15
            r0 = 8
            r2[r0] = r8
            r0 = 9
            r2[r0] = r6
            r0 = 10
            r2[r0] = r11
            r0 = 11
            r2[r0] = r14
            r0 = 12
            r2[r0] = r18
            r0 = 13
            r2[r0] = r16
            r0 = 14
            r2[r0] = r17
            r0 = 15
            r2[r0] = r19
            r0 = 16
            r2[r0] = r20
            r0 = 17
            r2[r0] = r21
            r0 = 18
            r2[r0] = r22
            r0 = 19
            r2[r0] = r23
            r0 = 20
            r2[r0] = r24
            r0 = 21
            r2[r0] = r25
            r0 = 22
            r2[r0] = r26
            r0 = 23
            r2[r0] = r27
            r0 = 24
            r2[r0] = r28
            r0 = 25
            r2[r0] = r29
            r0 = 26
            r2[r0] = r30
            r0 = 27
            r2[r0] = r31
            r0 = 28
            r2[r0] = r32
            r0 = 29
            r2[r0] = r33
            r0 = 30
            r2[r0] = r34
            r0 = 31
            r2[r0] = r35
            r0 = 32
            r2[r0] = r36
            r0 = 33
            r2[r0] = r37
            r0 = 34
            r2[r0] = r38
            r0 = 35
            r2[r0] = r39
            r0 = 36
            r2[r0] = r40
            r0 = 37
            r2[r0] = r41
            r0 = 38
            r2[r0] = r42
            r0 = 39
            r2[r0] = r43
            r0 = 40
            r2[r0] = r44
            r0 = 41
            r2[r0] = r45
            r0 = 42
            r2[r0] = r46
            r0 = 43
            r2[r0] = r47
            r0 = 44
            r2[r0] = r48
            r0 = 45
            r2[r0] = r49
            r0 = 46
            r2[r0] = r50
            r0 = 47
            r2[r0] = r51
            r0 = 48
            r2[r0] = r52
            r0 = 49
            r2[r0] = r4
            io.realm.RealmFieldType.$VALUES = r2
            r0 = 18
            io.realm.RealmFieldType[] r1 = new io.realm.RealmFieldType[r0]
            io.realm.RealmFieldType.basicTypes = r1
            io.realm.RealmFieldType[] r1 = new io.realm.RealmFieldType[r0]
            io.realm.RealmFieldType.listTypes = r1
            io.realm.RealmFieldType[] r1 = new io.realm.RealmFieldType[r0]
            io.realm.RealmFieldType.mapTypes = r1
            io.realm.RealmFieldType[] r0 = new io.realm.RealmFieldType[r0]
            io.realm.RealmFieldType.setTypes = r0
            io.realm.RealmFieldType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L394:
            if (r2 >= r1) goto L3c6
            r3 = r0[r2]
            int r4 = r3.nativeValue
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L3a7
            io.realm.RealmFieldType[] r6 = io.realm.RealmFieldType.basicTypes
            r6[r4] = r3
            r6 = 256(0x100, float:3.59E-43)
        L3a4:
            r7 = 512(0x200, float:7.17E-43)
            goto L3c3
        L3a7:
            r6 = 256(0x100, float:3.59E-43)
            if (r4 >= r6) goto L3b2
            io.realm.RealmFieldType[] r7 = io.realm.RealmFieldType.listTypes
            int r4 = r4 + (-128)
            r7[r4] = r3
            goto L3a4
        L3b2:
            r7 = 512(0x200, float:7.17E-43)
            if (r4 >= r7) goto L3bd
            io.realm.RealmFieldType[] r8 = io.realm.RealmFieldType.setTypes
            int r4 = r4 + (-256)
            r8[r4] = r3
            goto L3c3
        L3bd:
            io.realm.RealmFieldType[] r8 = io.realm.RealmFieldType.mapTypes
            int r4 = r4 + (-512)
            r8[r4] = r3
        L3c3:
            int r2 = r2 + 1
            goto L394
        L3c6:
            return
    }

    private RealmFieldType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.nativeValue = r3
            return
    }

    public static io.realm.RealmFieldType fromNativeValue(int r4) {
            if (r4 < 0) goto Lc
            io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.basicTypes
            int r1 = r0.length
            if (r4 >= r1) goto Lc
            r0 = r0[r4]
            if (r0 == 0) goto Lc
            return r0
        Lc:
            r0 = 128(0x80, float:1.8E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r4) goto L20
            if (r4 >= r1) goto L20
            int r0 = r4 + (-128)
            io.realm.RealmFieldType[] r2 = io.realm.RealmFieldType.listTypes
            int r3 = r2.length
            if (r0 >= r3) goto L20
            r0 = r2[r0]
            if (r0 == 0) goto L20
            return r0
        L20:
            r0 = 512(0x200, float:7.17E-43)
            if (r1 > r4) goto L32
            if (r4 >= r0) goto L32
            int r1 = r4 + (-256)
            io.realm.RealmFieldType[] r2 = io.realm.RealmFieldType.setTypes
            int r3 = r2.length
            if (r1 >= r3) goto L32
            r1 = r2[r1]
            if (r1 == 0) goto L32
            return r1
        L32:
            if (r0 > r4) goto L40
            int r0 = r4 + (-512)
            io.realm.RealmFieldType[] r1 = io.realm.RealmFieldType.mapTypes
            int r2 = r1.length
            if (r0 >= r2) goto L40
            r0 = r1[r0]
            if (r0 == 0) goto L40
            return r0
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid native Realm type: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
            r0.<init>(r4)
            throw r0
    }

    public static io.realm.RealmFieldType valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.RealmFieldType> r0 = io.realm.RealmFieldType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.RealmFieldType r1 = (io.realm.RealmFieldType) r1
            return r1
    }

    public static io.realm.RealmFieldType[] values() {
            io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.RealmFieldType[] r0 = (io.realm.RealmFieldType[]) r0
            return r0
    }

    public int getNativeValue() {
            r1 = this;
            int r0 = r1.nativeValue
            return r0
    }

    public boolean isValid(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.nativeValue
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L67
            if (r0 == r1) goto L64
            r3 = 2
            if (r0 == r3) goto L61
            r3 = 4
            if (r0 == r3) goto L56
            r1 = 6
            if (r0 == r1) goto L53
            switch(r0) {
                case 6: goto L53;
                case 17: goto L50;
                case 132: goto L4f;
                case 134: goto L4f;
                case 143: goto L4f;
                case 145: goto L4f;
                case 260: goto L4f;
                case 262: goto L4f;
                case 271: goto L4f;
                case 273: goto L4f;
                case 516: goto L4f;
                case 518: goto L4f;
                case 527: goto L4f;
                case 529: goto L4f;
                default: goto L14;
            }
        L14:
            switch(r0) {
                case 8: goto L4c;
                case 9: goto L49;
                case 10: goto L46;
                case 11: goto L43;
                case 12: goto L4f;
                case 13: goto L4f;
                case 14: goto L4f;
                case 15: goto L40;
                default: goto L17;
            }
        L17:
            switch(r0) {
                case 128: goto L4f;
                case 129: goto L4f;
                case 130: goto L4f;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 136: goto L4f;
                case 137: goto L4f;
                case 138: goto L4f;
                case 139: goto L4f;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 256: goto L4f;
                case 257: goto L4f;
                case 258: goto L4f;
                default: goto L20;
            }
        L20:
            switch(r0) {
                case 264: goto L4f;
                case 265: goto L4f;
                case 266: goto L4f;
                case 267: goto L4f;
                case 268: goto L4f;
                default: goto L23;
            }
        L23:
            switch(r0) {
                case 512: goto L4f;
                case 513: goto L4f;
                case 514: goto L4f;
                default: goto L26;
            }
        L26:
            switch(r0) {
                case 520: goto L4f;
                case 521: goto L4f;
                case 522: goto L4f;
                case 523: goto L4f;
                case 524: goto L4f;
                default: goto L29;
            }
        L29:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported Realm type:  "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L40:
            boolean r5 = r5 instanceof org.bson.types.ObjectId
            return r5
        L43:
            boolean r5 = r5 instanceof org.bson.types.Decimal128
            return r5
        L46:
            boolean r5 = r5 instanceof java.lang.Double
            return r5
        L49:
            boolean r5 = r5 instanceof java.lang.Float
            return r5
        L4c:
            boolean r5 = r5 instanceof java.util.Date
            return r5
        L4f:
            return r2
        L50:
            boolean r5 = r5 instanceof java.util.UUID
            return r5
        L53:
            boolean r5 = r5 instanceof io.realm.RealmAny
            return r5
        L56:
            boolean r0 = r5 instanceof byte[]
            if (r0 != 0) goto L60
            boolean r5 = r5 instanceof java.nio.ByteBuffer
            if (r5 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
        L61:
            boolean r5 = r5 instanceof java.lang.String
            return r5
        L64:
            boolean r5 = r5 instanceof java.lang.Boolean
            return r5
        L67:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L79
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L79
            boolean r0 = r5 instanceof java.lang.Short
            if (r0 != 0) goto L79
            boolean r5 = r5 instanceof java.lang.Byte
            if (r5 == 0) goto L78
            goto L79
        L78:
            r1 = 0
        L79:
            return r1
    }
}
