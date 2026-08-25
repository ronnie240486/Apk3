package io.realm.internal;

/* JADX INFO: loaded from: classes3.dex */
public class Property implements io.realm.internal.NativeObject {
    public static final boolean INDEXED = true;
    public static final boolean PRIMARY_KEY = true;
    public static final boolean REQUIRED = true;
    public static final int TYPE_ARRAY = 128;
    public static final int TYPE_BOOL = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_DATE = 4;
    public static final int TYPE_DECIMAL128 = 11;
    public static final int TYPE_DICTIONARY = 512;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 0;
    public static final int TYPE_LINKING_OBJECTS = 8;
    public static final int TYPE_MIXED = 9;
    public static final int TYPE_NULLABLE = 64;
    public static final int TYPE_OBJECT = 7;
    public static final int TYPE_OBJECT_ID = 10;
    public static final int TYPE_REQUIRED = 0;
    public static final int TYPE_SET = 256;
    public static final int TYPE_STRING = 2;
    public static final int TYPE_UUID = 12;
    private static final long nativeFinalizerPtr = 0;
    private long nativePtr;

    /* JADX INFO: renamed from: io.realm.internal.Property$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINKING_OBJECTS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L49
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L54
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L60
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L78
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L84
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L90
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> La8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Ld8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Le4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lf0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lfc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L108
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch: java.lang.NoSuchFieldError -> L108
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L108
                r2 = 22
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L108
            L108:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L114
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch: java.lang.NoSuchFieldError -> L114
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
                r2 = 23
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            L114:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L120
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch: java.lang.NoSuchFieldError -> L120
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L120
                r2 = 24
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L120
            L120:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L12c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_LIST     // Catch: java.lang.NoSuchFieldError -> L12c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12c
                r2 = 25
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12c
            L12c:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L138
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP     // Catch: java.lang.NoSuchFieldError -> L138
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L138
                r2 = 26
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L138
            L138:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L144
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP     // Catch: java.lang.NoSuchFieldError -> L144
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L144
                r2 = 27
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L144
            L144:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L150
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_STRING_MAP     // Catch: java.lang.NoSuchFieldError -> L150
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L150
                r2 = 28
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L150
            L150:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L15c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP     // Catch: java.lang.NoSuchFieldError -> L15c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15c
                r2 = 29
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15c
            L15c:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L168
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP     // Catch: java.lang.NoSuchFieldError -> L168
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L168
                r2 = 30
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L168
            L168:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L174
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP     // Catch: java.lang.NoSuchFieldError -> L174
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L174
                r2 = 31
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L174
            L174:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L180
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP     // Catch: java.lang.NoSuchFieldError -> L180
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L180
                r2 = 32
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L180
            L180:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L18c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DATE_MAP     // Catch: java.lang.NoSuchFieldError -> L18c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L18c
                r2 = 33
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L18c
            L18c:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L198
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP     // Catch: java.lang.NoSuchFieldError -> L198
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L198
                r2 = 34
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L198
            L198:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1a4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP     // Catch: java.lang.NoSuchFieldError -> L1a4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1a4
                r2 = 35
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1a4
            L1a4:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1b0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_UUID_MAP     // Catch: java.lang.NoSuchFieldError -> L1b0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1b0
                r2 = 36
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1b0
            L1b0:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1bc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_LINK_MAP     // Catch: java.lang.NoSuchFieldError -> L1bc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1bc
                r2 = 37
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1bc
            L1bc:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1c8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_SET     // Catch: java.lang.NoSuchFieldError -> L1c8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c8
                r2 = 38
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c8
            L1c8:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_SET     // Catch: java.lang.NoSuchFieldError -> L1d4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d4
                r2 = 39
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d4
            L1d4:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1e0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_SET     // Catch: java.lang.NoSuchFieldError -> L1e0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1e0
                r2 = 40
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1e0
            L1e0:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1ec
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_SET     // Catch: java.lang.NoSuchFieldError -> L1ec
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ec
                r2 = 41
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ec
            L1ec:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1f8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_SET     // Catch: java.lang.NoSuchFieldError -> L1f8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f8
                r2 = 42
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1f8
            L1f8:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L204
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_SET     // Catch: java.lang.NoSuchFieldError -> L204
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L204
                r2 = 43
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L204
            L204:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L210
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_SET     // Catch: java.lang.NoSuchFieldError -> L210
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L210
                r2 = 44
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L210
            L210:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L21c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_SET     // Catch: java.lang.NoSuchFieldError -> L21c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L21c
                r2 = 45
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L21c
            L21c:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L228
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_SET     // Catch: java.lang.NoSuchFieldError -> L228
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L228
                r2 = 46
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L228
            L228:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L234
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_SET     // Catch: java.lang.NoSuchFieldError -> L234
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L234
                r2 = 47
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L234
            L234:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L240
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINK_SET     // Catch: java.lang.NoSuchFieldError -> L240
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L240
                r2 = 48
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L240
            L240:
                int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L24c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_SET     // Catch: java.lang.NoSuchFieldError -> L24c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24c
                r2 = 49
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24c
            L24c:
                return
        }
    }

    static {
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.Property.nativeFinalizerPtr = r0
            return
    }

    public Property(long r1) {
            r0 = this;
            r0.<init>()
            r0.nativePtr = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.dummyContext
            r1.addReference(r0)
            return
    }

    public static int convertFromRealmFieldType(io.realm.RealmFieldType r3, boolean r4) {
            int[] r0 = io.realm.internal.Property.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto Lc2;
                case 2: goto Lbf;
                case 3: goto Lbc;
                case 4: goto Lb3;
                case 5: goto Lb4;
                case 6: goto Lb1;
                case 7: goto Laf;
                case 8: goto Lad;
                case 9: goto Lab;
                case 10: goto La8;
                case 11: goto La5;
                case 12: goto La2;
                case 13: goto L9f;
                case 14: goto L9d;
                case 15: goto L9a;
                case 16: goto L97;
                case 17: goto L94;
                case 18: goto L91;
                case 19: goto L8e;
                case 20: goto L8b;
                case 21: goto L88;
                case 22: goto L85;
                case 23: goto L82;
                case 24: goto L7f;
                case 25: goto L7c;
                case 26: goto L79;
                case 27: goto L76;
                case 28: goto L73;
                case 29: goto L70;
                case 30: goto L6d;
                case 31: goto L6a;
                case 32: goto L66;
                case 33: goto L62;
                case 34: goto L5e;
                case 35: goto L5a;
                case 36: goto L56;
                case 37: goto L52;
                case 38: goto L4e;
                case 39: goto L4a;
                case 40: goto L46;
                case 41: goto L42;
                case 42: goto L3e;
                case 43: goto L3a;
                case 44: goto L36;
                case 45: goto L32;
                case 46: goto L2e;
                case 47: goto L2a;
                case 48: goto L27;
                case 49: goto L23;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r3.name()
            r1[r2] = r3
            java.lang.String r3 = "Unsupported filed type: '%s'."
            java.lang.String r3 = java.lang.String.format(r0, r3, r1)
            r4.<init>(r3)
            throw r4
        L23:
            r1 = 265(0x109, float:3.71E-43)
            goto Lb4
        L27:
            r3 = 263(0x107, float:3.69E-43)
            return r3
        L2a:
            r1 = 268(0x10c, float:3.76E-43)
            goto Lb4
        L2e:
            r1 = 266(0x10a, float:3.73E-43)
            goto Lb4
        L32:
            r1 = 267(0x10b, float:3.74E-43)
            goto Lb4
        L36:
            r1 = 260(0x104, float:3.64E-43)
            goto Lb4
        L3a:
            r1 = 259(0x103, float:3.63E-43)
            goto Lb4
        L3e:
            r1 = 262(0x106, float:3.67E-43)
            goto Lb4
        L42:
            r1 = 261(0x105, float:3.66E-43)
            goto Lb4
        L46:
            r1 = 256(0x100, float:3.59E-43)
            goto Lb4
        L4a:
            r1 = 258(0x102, float:3.62E-43)
            goto Lb4
        L4e:
            r1 = 257(0x101, float:3.6E-43)
            goto Lb4
        L52:
            r1 = 519(0x207, float:7.27E-43)
            goto Lb4
        L56:
            r1 = 524(0x20c, float:7.34E-43)
            goto Lb4
        L5a:
            r1 = 522(0x20a, float:7.31E-43)
            goto Lb4
        L5e:
            r1 = 523(0x20b, float:7.33E-43)
            goto Lb4
        L62:
            r1 = 516(0x204, float:7.23E-43)
            goto Lb4
        L66:
            r1 = 515(0x203, float:7.22E-43)
            goto Lb4
        L6a:
            r1 = 518(0x206, float:7.26E-43)
            goto Lb4
        L6d:
            r1 = 517(0x205, float:7.24E-43)
            goto Lb4
        L70:
            r1 = 512(0x200, float:7.17E-43)
            goto Lb4
        L73:
            r1 = 514(0x202, float:7.2E-43)
            goto Lb4
        L76:
            r1 = 513(0x201, float:7.19E-43)
            goto Lb4
        L79:
            r1 = 521(0x209, float:7.3E-43)
            goto Lb4
        L7c:
            r1 = 137(0x89, float:1.92E-43)
            goto Lb4
        L7f:
            r1 = 134(0x86, float:1.88E-43)
            goto Lb4
        L82:
            r1 = 140(0x8c, float:1.96E-43)
            goto Lb4
        L85:
            r1 = 138(0x8a, float:1.93E-43)
            goto Lb4
        L88:
            r1 = 139(0x8b, float:1.95E-43)
            goto Lb4
        L8b:
            r1 = 133(0x85, float:1.86E-43)
            goto Lb4
        L8e:
            r1 = 132(0x84, float:1.85E-43)
            goto Lb4
        L91:
            r1 = 131(0x83, float:1.84E-43)
            goto Lb4
        L94:
            r1 = 130(0x82, float:1.82E-43)
            goto Lb4
        L97:
            r1 = 129(0x81, float:1.81E-43)
            goto Lb4
        L9a:
            r1 = 128(0x80, float:1.8E-43)
            goto Lb4
        L9d:
            r1 = 6
            goto Lb4
        L9f:
            r1 = 9
            goto Lb4
        La2:
            r1 = 12
            goto Lb4
        La5:
            r1 = 10
            goto Lb4
        La8:
            r1 = 11
            goto Lb4
        Lab:
            r1 = 5
            goto Lb4
        Lad:
            r1 = 4
            goto Lb4
        Laf:
            r1 = 3
            goto Lb4
        Lb1:
            r1 = 2
            goto Lb4
        Lb3:
            r1 = 0
        Lb4:
            if (r4 == 0) goto Lb7
            goto Lb9
        Lb7:
            r2 = 64
        Lb9:
            r3 = r1 | r2
            return r3
        Lbc:
            r3 = 136(0x88, float:1.9E-43)
            return r3
        Lbf:
            r3 = 135(0x87, float:1.89E-43)
            return r3
        Lc2:
            r3 = 71
            return r3
    }

    private static io.realm.RealmFieldType convertToRealmFieldType(int r4) {
            r0 = r4 & (-65)
            switch(r0) {
                case 0: goto Lbf;
                case 1: goto Lbc;
                case 2: goto Lb9;
                case 3: goto Lb6;
                case 4: goto Lb3;
                case 5: goto Lb0;
                case 6: goto Lad;
                case 7: goto Laa;
                default: goto L5;
            }
        L5:
            switch(r0) {
                case 9: goto La7;
                case 10: goto La4;
                case 11: goto La1;
                case 12: goto L9e;
                default: goto L8;
            }
        L8:
            switch(r0) {
                case 128: goto L9b;
                case 129: goto L98;
                case 130: goto L95;
                case 131: goto L92;
                case 132: goto L8f;
                case 133: goto L8c;
                case 134: goto L89;
                case 135: goto L86;
                case 136: goto L83;
                case 137: goto L80;
                case 138: goto L7d;
                case 139: goto L7a;
                case 140: goto L77;
                default: goto Lb;
            }
        Lb:
            switch(r0) {
                case 256: goto L74;
                case 257: goto L71;
                case 258: goto L6e;
                case 259: goto L6b;
                case 260: goto L68;
                case 261: goto L65;
                case 262: goto L62;
                case 263: goto L5f;
                default: goto Le;
            }
        Le:
            switch(r0) {
                case 265: goto L5c;
                case 266: goto L59;
                case 267: goto L56;
                case 268: goto L53;
                default: goto L11;
            }
        L11:
            switch(r0) {
                case 512: goto L50;
                case 513: goto L4d;
                case 514: goto L4a;
                case 515: goto L47;
                case 516: goto L44;
                case 517: goto L41;
                case 518: goto L3e;
                case 519: goto L3b;
                default: goto L14;
            }
        L14:
            switch(r0) {
                case 521: goto L38;
                case 522: goto L35;
                case 523: goto L32;
                case 524: goto L2f;
                default: goto L17;
            }
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r4 = "Unsupported property type: '%d'"
            java.lang.String r4 = java.lang.String.format(r1, r4, r2)
            r0.<init>(r4)
            throw r0
        L2f:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_UUID_MAP
            return r4
        L32:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP
            return r4
        L35:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP
            return r4
        L38:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP
            return r4
        L3b:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_LINK_MAP
            return r4
        L3e:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP
            return r4
        L41:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP
            return r4
        L44:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_DATE_MAP
            return r4
        L47:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP
            return r4
        L4a:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_STRING_MAP
            return r4
        L4d:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP
            return r4
        L50:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP
            return r4
        L53:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.UUID_SET
            return r4
        L56:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DECIMAL128_SET
            return r4
        L59:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.OBJECT_ID_SET
            return r4
        L5c:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.MIXED_SET
            return r4
        L5f:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.LINK_SET
            return r4
        L62:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DOUBLE_SET
            return r4
        L65:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.FLOAT_SET
            return r4
        L68:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DATE_SET
            return r4
        L6b:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BINARY_SET
            return r4
        L6e:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_SET
            return r4
        L71:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BOOLEAN_SET
            return r4
        L74:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.INTEGER_SET
            return r4
        L77:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.UUID_LIST
            return r4
        L7a:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DECIMAL128_LIST
            return r4
        L7d:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.OBJECT_ID_LIST
            return r4
        L80:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.MIXED_LIST
            return r4
        L83:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.LINKING_OBJECTS
            return r4
        L86:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.LIST
            return r4
        L89:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DOUBLE_LIST
            return r4
        L8c:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.FLOAT_LIST
            return r4
        L8f:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DATE_LIST
            return r4
        L92:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BINARY_LIST
            return r4
        L95:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING_LIST
            return r4
        L98:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BOOLEAN_LIST
            return r4
        L9b:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.INTEGER_LIST
            return r4
        L9e:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.UUID
            return r4
        La1:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DECIMAL128
            return r4
        La4:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.OBJECT_ID
            return r4
        La7:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.MIXED
            return r4
        Laa:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.OBJECT
            return r4
        Lad:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DOUBLE
            return r4
        Lb0:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.FLOAT
            return r4
        Lb3:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.DATE
            return r4
        Lb6:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BINARY
            return r4
        Lb9:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.STRING
            return r4
        Lbc:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BOOLEAN
            return r4
        Lbf:
            io.realm.RealmFieldType r4 = io.realm.RealmFieldType.INTEGER
            return r4
    }

    public static native long nativeCreateComputedLinkProperty(java.lang.String r0, java.lang.String r1, java.lang.String r2);

    public static native long nativeCreatePersistedLinkProperty(java.lang.String r0, java.lang.String r1, int r2, java.lang.String r3);

    public static native long nativeCreatePersistedProperty(java.lang.String r0, java.lang.String r1, int r2, boolean r3, boolean r4);

    private static native long nativeGetColumnKey(long r0);

    private static native long nativeGetFinalizerPtr();

    private static native java.lang.String nativeGetLinkedObjectName(long r0);

    private static native int nativeGetType(long r0);

    public long getColumnKey() {
            r2 = this;
            long r0 = r2.nativePtr
            long r0 = nativeGetColumnKey(r0)
            return r0
    }

    public java.lang.String getLinkedObjectName() {
            r2 = this;
            long r0 = r2.nativePtr
            java.lang.String r0 = nativeGetLinkedObjectName(r0)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.Property.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativePtr
            return r0
    }

    public io.realm.RealmFieldType getType() {
            r2 = this;
            long r0 = r2.nativePtr
            int r0 = nativeGetType(r0)
            io.realm.RealmFieldType r0 = convertToRealmFieldType(r0)
            return r0
    }
}
