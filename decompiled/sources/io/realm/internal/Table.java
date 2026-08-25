package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class Table implements io.realm.internal.NativeObject {
    public static final int CLASS_NAME_MAX_LENGTH = 0;
    public static final long INFINITE = -1;
    public static final int MAX_BINARY_SIZE = 16777200;
    public static final int MAX_STRING_SIZE = 16777199;
    public static final boolean NOT_NULLABLE = false;
    public static final int NO_MATCH = -1;
    public static final boolean NULLABLE = true;
    private static final int TABLE_NAME_MAX_LENGTH = 63;
    private static final java.lang.String TABLE_PREFIX = null;
    private static final long nativeFinalizerPtr = 0;
    private final io.realm.internal.NativeContext context;
    private final long nativeTableRefPtr;
    private final io.realm.internal.OsSharedRealm sharedRealm;

    /* JADX INFO: renamed from: io.realm.internal.Table$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L49
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L54
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L60
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L78
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L84
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L90
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> La8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Ld8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Le4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lf0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lfc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L108
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_LIST     // Catch: java.lang.NoSuchFieldError -> L108
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L108
                r2 = 22
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L108
            L108:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L114
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP     // Catch: java.lang.NoSuchFieldError -> L114
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
                r2 = 23
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            L114:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L120
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP     // Catch: java.lang.NoSuchFieldError -> L120
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L120
                r2 = 24
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L120
            L120:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L12c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_STRING_MAP     // Catch: java.lang.NoSuchFieldError -> L12c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12c
                r2 = 25
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12c
            L12c:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L138
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP     // Catch: java.lang.NoSuchFieldError -> L138
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L138
                r2 = 26
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L138
            L138:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L144
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DATE_MAP     // Catch: java.lang.NoSuchFieldError -> L144
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L144
                r2 = 27
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L144
            L144:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L150
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP     // Catch: java.lang.NoSuchFieldError -> L150
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L150
                r2 = 28
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L150
            L150:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L15c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP     // Catch: java.lang.NoSuchFieldError -> L15c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15c
                r2 = 29
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15c
            L15c:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L168
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP     // Catch: java.lang.NoSuchFieldError -> L168
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L168
                r2 = 30
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L168
            L168:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L174
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP     // Catch: java.lang.NoSuchFieldError -> L174
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L174
                r2 = 31
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L174
            L174:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L180
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_UUID_MAP     // Catch: java.lang.NoSuchFieldError -> L180
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L180
                r2 = 32
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L180
            L180:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L18c
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP     // Catch: java.lang.NoSuchFieldError -> L18c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L18c
                r2 = 33
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L18c
            L18c:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L198
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_SET     // Catch: java.lang.NoSuchFieldError -> L198
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L198
                r2 = 34
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L198
            L198:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1a4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_SET     // Catch: java.lang.NoSuchFieldError -> L1a4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1a4
                r2 = 35
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1a4
            L1a4:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1b0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_SET     // Catch: java.lang.NoSuchFieldError -> L1b0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1b0
                r2 = 36
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1b0
            L1b0:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1bc
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_SET     // Catch: java.lang.NoSuchFieldError -> L1bc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1bc
                r2 = 37
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1bc
            L1bc:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1c8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_SET     // Catch: java.lang.NoSuchFieldError -> L1c8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c8
                r2 = 38
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c8
            L1c8:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d4
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_SET     // Catch: java.lang.NoSuchFieldError -> L1d4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d4
                r2 = 39
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d4
            L1d4:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1e0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_SET     // Catch: java.lang.NoSuchFieldError -> L1e0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1e0
                r2 = 40
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1e0
            L1e0:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1ec
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_SET     // Catch: java.lang.NoSuchFieldError -> L1ec
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ec
                r2 = 41
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ec
            L1ec:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1f8
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_SET     // Catch: java.lang.NoSuchFieldError -> L1f8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f8
                r2 = 42
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1f8
            L1f8:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L204
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_SET     // Catch: java.lang.NoSuchFieldError -> L204
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L204
                r2 = 43
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L204
            L204:
                int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L210
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_SET     // Catch: java.lang.NoSuchFieldError -> L210
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L210
                r2 = 44
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L210
            L210:
                return
        }
    }

    static {
            java.lang.String r0 = io.realm.internal.Util.getTablePrefix()
            io.realm.internal.Table.TABLE_PREFIX = r0
            int r0 = r0.length()
            int r0 = 63 - r0
            io.realm.internal.Table.CLASS_NAME_MAX_LENGTH = r0
            long r0 = nativeGetFinalizerPtr()
            io.realm.internal.Table.nativeFinalizerPtr = r0
            return
    }

    public Table(io.realm.internal.OsSharedRealm r2, long r3) {
            r1 = this;
            r1.<init>()
            io.realm.internal.NativeContext r0 = r2.context
            r1.context = r0
            r1.sharedRealm = r2
            r1.nativeTableRefPtr = r3
            r0.addReference(r1)
            return
    }

    @javax.annotation.Nullable
    public static java.lang.String getClassNameForTable(@javax.annotation.Nullable java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = io.realm.internal.Table.TABLE_PREFIX
            boolean r1 = r2.startsWith(r0)
            if (r1 != 0) goto Ld
            return r2
        Ld:
            int r0 = r0.length()
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    public static java.lang.String getTableNameForClass(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.realm.internal.Table.TABLE_PREFIX
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r2
    }

    private boolean isPrimaryKey(long r2) {
            r1 = this;
            java.lang.String r2 = r1.getColumnName(r2)
            io.realm.internal.OsSharedRealm r3 = r1.sharedRealm
            java.lang.String r0 = r1.getClassName()
            java.lang.String r3 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r3, r0)
            boolean r2 = r2.equals(r3)
            return r2
    }

    private native long nativeAddColumn(long r1, int r3, java.lang.String r4, boolean r5);

    private native long nativeAddColumnDictionaryLink(long r1, int r3, java.lang.String r4, long r5);

    private native long nativeAddColumnLink(long r1, int r3, java.lang.String r4, long r5);

    private native long nativeAddColumnSetLink(long r1, int r3, java.lang.String r4, long r5);

    private native long nativeAddPrimitiveDictionaryColumn(long r1, int r3, java.lang.String r4, boolean r5);

    private native long nativeAddPrimitiveListColumn(long r1, int r3, java.lang.String r4, boolean r5);

    private native long nativeAddPrimitiveSetColumn(long r1, int r3, java.lang.String r4, boolean r5);

    private native void nativeAddSearchIndex(long r1, long r3);

    private native void nativeClear(long r1);

    private native void nativeConvertColumnToNotNullable(long r1, long r3, boolean r5);

    private native void nativeConvertColumnToNullable(long r1, long r3, boolean r5);

    private native long nativeCountDouble(long r1, long r3, double r5);

    private native long nativeCountFloat(long r1, long r3, float r5);

    private native long nativeCountLong(long r1, long r3, long r5);

    private native long nativeCountString(long r1, long r3, java.lang.String r5);

    private native long nativeFindFirstBool(long r1, long r3, boolean r5);

    public static native long nativeFindFirstDecimal128(long r0, long r2, long r4, long r6);

    private native long nativeFindFirstDouble(long r1, long r3, double r5);

    private native long nativeFindFirstFloat(long r1, long r3, float r5);

    public static native long nativeFindFirstInt(long r0, long r2, long r4);

    public static native long nativeFindFirstNull(long r0, long r2);

    public static native long nativeFindFirstObjectId(long r0, long r2, java.lang.String r4);

    public static native long nativeFindFirstString(long r0, long r2, java.lang.String r4);

    private native long nativeFindFirstTimestamp(long r1, long r3, long r5);

    public static native long nativeFindFirstUUID(long r0, long r2, java.lang.String r4);

    private static native long nativeFreeze(long r0, long r2);

    private native boolean nativeGetBoolean(long r1, long r3, long r5);

    private native byte[] nativeGetByteArray(long r1, long r3, long r5);

    private native long nativeGetColumnCount(long r1);

    private native long nativeGetColumnKey(long r1, java.lang.String r3);

    private native java.lang.String nativeGetColumnName(long r1, long r3);

    private native java.lang.String[] nativeGetColumnNames(long r1);

    private native int nativeGetColumnType(long r1, long r3);

    private native long[] nativeGetDecimal128(long r1, long r3, long r5);

    private native double nativeGetDouble(long r1, long r3, long r5);

    private static native long nativeGetFinalizerPtr();

    private native float nativeGetFloat(long r1, long r3, long r5);

    private native long nativeGetLink(long r1, long r3, long r5);

    private native long nativeGetLinkTarget(long r1, long r3);

    private native long nativeGetLong(long r1, long r3, long r5);

    private native java.lang.String nativeGetName(long r1);

    private native java.lang.String nativeGetObjectId(long r1, long r3, long r5);

    private native java.lang.String nativeGetString(long r1, long r3, long r5);

    private native long nativeGetTimestamp(long r1, long r3, long r5);

    private native boolean nativeHasSameSchema(long r1, long r3);

    private native boolean nativeHasSearchIndex(long r1, long r3);

    public static native void nativeIncrementLong(long r0, long r2, long r4, long r6);

    private native boolean nativeIsColumnNullable(long r1, long r3);

    private static native boolean nativeIsEmbedded(long r0);

    private native boolean nativeIsNull(long r1, long r3, long r5);

    private native boolean nativeIsNullLink(long r1, long r3, long r5);

    private native boolean nativeIsValid(long r1);

    private native void nativeMoveLastOver(long r1, long r3);

    public static native void nativeNullifyLink(long r0, long r2, long r4);

    private native void nativeRemoveColumn(long r1, long r3);

    private native void nativeRemoveSearchIndex(long r1, long r3);

    private native void nativeRenameColumn(long r1, long r3, java.lang.String r5);

    public static native void nativeSetBoolean(long r0, long r2, long r4, boolean r6, boolean r7);

    public static native void nativeSetByteArray(long r0, long r2, long r4, byte[] r6, boolean r7);

    public static native void nativeSetDecimal128(long r0, long r2, long r4, long r6, long r8, boolean r10);

    public static native void nativeSetDouble(long r0, long r2, long r4, double r6, boolean r8);

    private static native boolean nativeSetEmbedded(long r0, boolean r2);

    public static native void nativeSetFloat(long r0, long r2, long r4, float r6, boolean r7);

    public static native void nativeSetLink(long r0, long r2, long r4, long r6, boolean r8);

    public static native void nativeSetLong(long r0, long r2, long r4, long r6, boolean r8);

    public static native void nativeSetNull(long r0, long r2, long r4, boolean r6);

    public static native void nativeSetObjectId(long r0, long r2, long r4, java.lang.String r6, boolean r7);

    public static native void nativeSetRealmAny(long r0, long r2, long r4, long r6, boolean r8);

    public static native void nativeSetString(long r0, long r2, long r4, java.lang.String r6, boolean r7);

    public static native void nativeSetTimestamp(long r0, long r2, long r4, long r6, boolean r8);

    public static native void nativeSetUUID(long r0, long r2, long r4, java.lang.String r6, boolean r7);

    private native long nativeSize(long r1);

    private native long nativeWhere(long r1);

    public static void throwDuplicatePrimaryKeyException(java.lang.Object r3) {
            io.realm.exceptions.RealmPrimaryKeyConstraintException r0 = new io.realm.exceptions.RealmPrimaryKeyConstraintException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value already exists: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void throwImmutable() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot modify managed objects outside of a write transaction."
            r0.<init>(r1)
            throw r0
    }

    private void verifyColumnName(java.lang.String r2) {
            r1 = this;
            int r2 = r2.length()
            r0 = 63
            if (r2 > r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Column names are currently limited to max 63 characters."
            r2.<init>(r0)
            throw r2
    }

    public long addColumn(io.realm.RealmFieldType r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            long r2 = r1.addColumn(r2, r3, r0)
            return r2
    }

    public long addColumn(io.realm.RealmFieldType r8, java.lang.String r9, boolean r10) {
            r7 = this;
            r7.verifyColumnName(r9)
            int[] r0 = io.realm.internal.Table.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                case 4: goto L55;
                case 5: goto L55;
                case 6: goto L55;
                case 7: goto L55;
                case 8: goto L55;
                case 9: goto L55;
                case 10: goto L55;
                case 11: goto L55;
                case 12: goto L45;
                case 13: goto L45;
                case 14: goto L45;
                case 15: goto L45;
                case 16: goto L45;
                case 17: goto L45;
                case 18: goto L45;
                case 19: goto L45;
                case 20: goto L45;
                case 21: goto L45;
                case 22: goto L45;
                case 23: goto L35;
                case 24: goto L35;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L35;
                case 28: goto L35;
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L25;
                case 35: goto L25;
                case 36: goto L25;
                case 37: goto L25;
                case 38: goto L25;
                case 39: goto L25;
                case 40: goto L25;
                case 41: goto L25;
                case 42: goto L25;
                case 43: goto L25;
                case 44: goto L25;
                default: goto Le;
            }
        Le:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unsupported type: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L25:
            long r2 = r7.nativeTableRefPtr
            int r8 = r8.getNativeValue()
            int r4 = r8 + (-256)
            r1 = r7
            r5 = r9
            r6 = r10
            long r8 = r1.nativeAddPrimitiveSetColumn(r2, r4, r5, r6)
            return r8
        L35:
            long r1 = r7.nativeTableRefPtr
            int r8 = r8.getNativeValue()
            int r3 = r8 + (-512)
            r0 = r7
            r4 = r9
            r5 = r10
            long r8 = r0.nativeAddPrimitiveDictionaryColumn(r1, r3, r4, r5)
            return r8
        L45:
            long r1 = r7.nativeTableRefPtr
            int r8 = r8.getNativeValue()
            int r3 = r8 + (-128)
            r0 = r7
            r4 = r9
            r5 = r10
            long r8 = r0.nativeAddPrimitiveListColumn(r1, r3, r4, r5)
            return r8
        L55:
            long r1 = r7.nativeTableRefPtr
            int r3 = r8.getNativeValue()
            r0 = r7
            r4 = r9
            r5 = r10
            long r8 = r0.nativeAddColumn(r1, r3, r4, r5)
            return r8
    }

    public long addColumnDictionaryLink(io.realm.RealmFieldType r8, java.lang.String r9, io.realm.internal.Table r10) {
            r7 = this;
            r7.verifyColumnName(r9)
            long r1 = r7.nativeTableRefPtr
            int r3 = r8.getNativeValue()
            long r5 = r10.nativeTableRefPtr
            r0 = r7
            r4 = r9
            long r8 = r0.nativeAddColumnDictionaryLink(r1, r3, r4, r5)
            return r8
    }

    public long addColumnLink(io.realm.RealmFieldType r8, java.lang.String r9, io.realm.internal.Table r10) {
            r7 = this;
            r7.verifyColumnName(r9)
            long r1 = r7.nativeTableRefPtr
            int r3 = r8.getNativeValue()
            long r5 = r10.nativeTableRefPtr
            r0 = r7
            r4 = r9
            long r8 = r0.nativeAddColumnLink(r1, r3, r4, r5)
            return r8
    }

    public long addColumnSetLink(io.realm.RealmFieldType r8, java.lang.String r9, io.realm.internal.Table r10) {
            r7 = this;
            r7.verifyColumnName(r9)
            long r1 = r7.nativeTableRefPtr
            int r3 = r8.getNativeValue()
            long r5 = r10.nativeTableRefPtr
            r0 = r7
            r4 = r9
            long r8 = r0.nativeAddColumnSetLink(r1, r3, r4, r5)
            return r8
    }

    public void addSearchIndex(long r3) {
            r2 = this;
            r2.checkImmutable()
            long r0 = r2.nativeTableRefPtr
            r2.nativeAddSearchIndex(r0, r3)
            return
    }

    public final void checkImmutable() {
            r1 = this;
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            if (r0 == 0) goto Lc
            boolean r0 = r0.isInTransaction()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            throwImmutable()
        L12:
            return
    }

    public void clear() {
            r2 = this;
            r2.checkImmutable()
            long r0 = r2.nativeTableRefPtr
            r2.nativeClear(r0)
            return
    }

    public void convertColumnToNotNullable(long r8) {
            r7 = this;
            io.realm.internal.OsSharedRealm r0 = r7.sharedRealm
            boolean r0 = r0.isSyncRealm()
            if (r0 != 0) goto L14
            long r2 = r7.nativeTableRefPtr
            boolean r6 = r7.isPrimaryKey(r8)
            r1 = r7
            r4 = r8
            r1.nativeConvertColumnToNotNullable(r2, r4, r6)
            return
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This method is only available for non-synchronized Realms"
            r8.<init>(r9)
            throw r8
    }

    public void convertColumnToNullable(long r8) {
            r7 = this;
            io.realm.internal.OsSharedRealm r0 = r7.sharedRealm
            boolean r0 = r0.isSyncRealm()
            if (r0 != 0) goto L14
            long r2 = r7.nativeTableRefPtr
            boolean r6 = r7.isPrimaryKey(r8)
            r1 = r7
            r4 = r8
            r1.nativeConvertColumnToNullable(r2, r4, r6)
            return
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This method is only available for non-synchronized Realms"
            r8.<init>(r9)
            throw r8
    }

    public long count(long r8, double r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            long r8 = r0.nativeCountDouble(r1, r3, r5)
            return r8
    }

    public long count(long r7, float r9) {
            r6 = this;
            long r1 = r6.nativeTableRefPtr
            r0 = r6
            r3 = r7
            r5 = r9
            long r7 = r0.nativeCountFloat(r1, r3, r5)
            return r7
    }

    public long count(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            long r8 = r0.nativeCountLong(r1, r3, r5)
            return r8
    }

    public long count(long r7, java.lang.String r9) {
            r6 = this;
            long r1 = r6.nativeTableRefPtr
            r0 = r6
            r3 = r7
            r5 = r9
            long r7 = r0.nativeCountString(r1, r3, r5)
            return r7
    }

    public long findFirstBoolean(long r7, boolean r9) {
            r6 = this;
            long r1 = r6.nativeTableRefPtr
            r0 = r6
            r3 = r7
            r5 = r9
            long r7 = r0.nativeFindFirstBool(r1, r3, r5)
            return r7
    }

    public long findFirstDate(long r8, java.util.Date r10) {
            r7 = this;
            if (r10 == 0) goto Lf
            long r1 = r7.nativeTableRefPtr
            long r5 = r10.getTime()
            r0 = r7
            r3 = r8
            long r8 = r0.nativeFindFirstTimestamp(r1, r3, r5)
            return r8
        Lf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "null is not supported"
            r8.<init>(r9)
            throw r8
    }

    public long findFirstDecimal128(long r9, org.bson.types.Decimal128 r11) {
            r8 = this;
            if (r11 == 0) goto L12
            long r0 = r8.nativeTableRefPtr
            long r4 = r11.getLow()
            long r6 = r11.getHigh()
            r2 = r9
            long r9 = nativeFindFirstDecimal128(r0, r2, r4, r6)
            return r9
        L12:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "null is not supported"
            r9.<init>(r10)
            throw r9
    }

    public long findFirstDouble(long r8, double r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            long r8 = r0.nativeFindFirstDouble(r1, r3, r5)
            return r8
    }

    public long findFirstFloat(long r7, float r9) {
            r6 = this;
            long r1 = r6.nativeTableRefPtr
            r0 = r6
            r3 = r7
            r5 = r9
            long r7 = r0.nativeFindFirstFloat(r1, r3, r5)
            return r7
    }

    public long findFirstLong(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativeTableRefPtr
            r2 = r7
            r4 = r9
            long r7 = nativeFindFirstInt(r0, r2, r4)
            return r7
    }

    public long findFirstNull(long r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            long r3 = nativeFindFirstNull(r0, r3)
            return r3
    }

    public long findFirstObjectId(long r3, org.bson.types.ObjectId r5) {
            r2 = this;
            if (r5 == 0) goto Ld
            long r0 = r2.nativeTableRefPtr
            java.lang.String r5 = r5.toString()
            long r3 = nativeFindFirstObjectId(r0, r3, r5)
            return r3
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "null is not supported"
            r3.<init>(r4)
            throw r3
    }

    public long findFirstString(long r3, java.lang.String r5) {
            r2 = this;
            if (r5 == 0) goto L9
            long r0 = r2.nativeTableRefPtr
            long r3 = nativeFindFirstString(r0, r3, r5)
            return r3
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "null is not supported"
            r3.<init>(r4)
            throw r3
    }

    public long findFirstUUID(long r3, java.util.UUID r5) {
            r2 = this;
            if (r5 == 0) goto Ld
            long r0 = r2.nativeTableRefPtr
            java.lang.String r5 = r5.toString()
            long r3 = nativeFindFirstUUID(r0, r3, r5)
            return r3
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "null is not supported"
            r3.<init>(r4)
            throw r3
    }

    public io.realm.internal.Table freeze(io.realm.internal.OsSharedRealm r6) {
            r5 = this;
            boolean r0 = r6.isFrozen()
            if (r0 == 0) goto L16
            io.realm.internal.Table r0 = new io.realm.internal.Table
            long r1 = r6.getNativePtr()
            long r3 = r5.nativeTableRefPtr
            long r1 = nativeFreeze(r1, r3)
            r0.<init>(r6, r1)
            return r0
        L16:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Frozen Realm required"
            r6.<init>(r0)
            throw r6
    }

    public byte[] getBinaryByteArray(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            byte[] r8 = r0.nativeGetByteArray(r1, r3, r5)
            return r8
    }

    public boolean getBoolean(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            boolean r8 = r0.nativeGetBoolean(r1, r3, r5)
            return r8
    }

    public io.realm.internal.CheckedRow getCheckedRow(long r2) {
            r1 = this;
            io.realm.internal.NativeContext r0 = r1.context
            io.realm.internal.CheckedRow r2 = io.realm.internal.CheckedRow.get(r0, r1, r2)
            return r2
    }

    public java.lang.String getClassName() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = getClassNameForTable(r0)
            boolean r1 = io.realm.internal.Util.isEmptyString(r0)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name."
            r0.<init>(r1)
            throw r0
    }

    public long getColumnCount() {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            long r0 = r2.nativeGetColumnCount(r0)
            return r0
    }

    public long getColumnKey(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L9
            long r0 = r2.nativeTableRefPtr
            long r0 = r2.nativeGetColumnKey(r0, r3)
            return r0
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Column name can not be null."
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String getColumnName(long r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            java.lang.String r3 = r2.nativeGetColumnName(r0, r3)
            return r3
    }

    public java.lang.String[] getColumnNames() {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            java.lang.String[] r0 = r2.nativeGetColumnNames(r0)
            return r0
    }

    public io.realm.RealmFieldType getColumnType(long r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            int r3 = r2.nativeGetColumnType(r0, r3)
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.fromNativeValue(r3)
            return r3
    }

    public java.util.Date getDate(long r9, long r11) {
            r8 = this;
            java.util.Date r0 = new java.util.Date
            long r2 = r8.nativeTableRefPtr
            r1 = r8
            r4 = r9
            r6 = r11
            long r9 = r1.nativeGetTimestamp(r2, r4, r6)
            r0.<init>(r9)
            return r0
    }

    public double getDouble(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            double r8 = r0.nativeGetDouble(r1, r3, r5)
            return r8
    }

    public float getFloat(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            float r8 = r0.nativeGetFloat(r1, r3, r5)
            return r8
    }

    public long getLink(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            long r8 = r0.nativeGetLink(r1, r3, r5)
            return r8
    }

    public io.realm.internal.Table getLinkTarget(long r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            long r3 = r2.nativeGetLinkTarget(r0, r3)
            io.realm.internal.Table r0 = new io.realm.internal.Table
            io.realm.internal.OsSharedRealm r1 = r2.sharedRealm
            r0.<init>(r1, r3)
            return r0
    }

    public long getLong(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            long r8 = r0.nativeGetLong(r1, r3, r5)
            return r8
    }

    @javax.annotation.Nullable
    public java.lang.String getName() {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            java.lang.String r0 = r2.nativeGetName(r0)
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
            r2 = this;
            long r0 = io.realm.internal.Table.nativeFinalizerPtr
            return r0
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            return r0
    }

    public io.realm.internal.OsSharedRealm getSharedRealm() {
            r1 = this;
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            return r0
    }

    public java.lang.String getString(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            java.lang.String r8 = r0.nativeGetString(r1, r3, r5)
            return r8
    }

    public io.realm.internal.Table getTable() {
            r0 = this;
            return r0
    }

    public io.realm.internal.UncheckedRow getUncheckedRow(long r4) {
            r3 = this;
            io.realm.internal.NativeContext r0 = r3.context
            int r1 = io.realm.internal.UncheckedRow.$r8$clinit
            long r1 = r3.getNativePtr()
            long r4 = r3.nativeGetRowPtr(r1, r4)
            io.realm.internal.UncheckedRow r1 = new io.realm.internal.UncheckedRow
            r1.<init>(r0, r3, r4)
            return r1
    }

    public io.realm.internal.UncheckedRow getUncheckedRowByPointer(long r3) {
            r2 = this;
            io.realm.internal.NativeContext r0 = r2.context
            io.realm.internal.UncheckedRow r1 = new io.realm.internal.UncheckedRow
            r1.<init>(r0, r2, r3)
            return r1
    }

    public boolean hasSameSchema(io.realm.internal.Table r5) {
            r4 = this;
            if (r5 == 0) goto Lb
            long r0 = r4.nativeTableRefPtr
            long r2 = r5.nativeTableRefPtr
            boolean r5 = r4.nativeHasSameSchema(r0, r2)
            return r5
        Lb:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The argument cannot be null"
            r5.<init>(r0)
            throw r5
    }

    public boolean hasSearchIndex(long r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            boolean r3 = r2.nativeHasSearchIndex(r0, r3)
            return r3
    }

    public void incrementLong(long r9, long r11, long r13) {
            r8 = this;
            r8.checkImmutable()
            long r0 = r8.nativeTableRefPtr
            r2 = r9
            r4 = r11
            r6 = r13
            nativeIncrementLong(r0, r2, r4, r6)
            return
    }

    public boolean isColumnNullable(long r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            boolean r3 = r2.nativeIsColumnNullable(r0, r3)
            return r3
    }

    public boolean isEmbedded() {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            boolean r0 = nativeIsEmbedded(r0)
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final boolean isImmutable() {
            r1 = this;
            io.realm.internal.OsSharedRealm r0 = r1.sharedRealm
            if (r0 == 0) goto Lc
            boolean r0 = r0.isInTransaction()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isNullLink(long r8, long r10) {
            r7 = this;
            long r1 = r7.nativeTableRefPtr
            r0 = r7
            r3 = r8
            r5 = r10
            boolean r8 = r0.nativeIsNullLink(r1, r3, r5)
            return r8
    }

    public boolean isValid() {
            r5 = this;
            long r0 = r5.nativeTableRefPtr
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            boolean r0 = r5.nativeIsValid(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public void moveLastOver(long r3) {
            r2 = this;
            r2.checkImmutable()
            long r0 = r2.nativeTableRefPtr
            r2.nativeMoveLastOver(r0, r3)
            return
    }

    public native long nativeGetRowPtr(long r1, long r3);

    public void nullifyLink(long r7, long r9) {
            r6 = this;
            long r0 = r6.nativeTableRefPtr
            r2 = r7
            r4 = r9
            nativeNullifyLink(r0, r2, r4)
            return
    }

    public void removeColumn(long r6) {
            r5 = this;
            java.lang.String r0 = r5.getClassName()
            java.lang.String r1 = r5.getColumnName(r6)
            io.realm.internal.OsSharedRealm r2 = r5.sharedRealm
            java.lang.String r3 = r5.getClassName()
            java.lang.String r2 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r2, r3)
            long r3 = r5.nativeTableRefPtr
            r5.nativeRemoveColumn(r3, r6)
            boolean r6 = r1.equals(r2)
            if (r6 == 0) goto L23
            io.realm.internal.OsSharedRealm r6 = r5.sharedRealm
            r7 = 0
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r6, r0, r7)
        L23:
            return
    }

    public void removeSearchIndex(long r3) {
            r2 = this;
            r2.checkImmutable()
            long r0 = r2.nativeTableRefPtr
            r2.nativeRemoveSearchIndex(r0, r3)
            return
    }

    public void renameColumn(long r9, java.lang.String r11) {
            r8 = this;
            r8.verifyColumnName(r11)
            long r0 = r8.nativeTableRefPtr
            java.lang.String r7 = r8.nativeGetColumnName(r0, r9)
            io.realm.internal.OsSharedRealm r0 = r8.sharedRealm
            java.lang.String r1 = r8.getClassName()
            java.lang.String r0 = io.realm.internal.OsObjectStore.getPrimaryKeyForObject(r0, r1)
            long r2 = r8.nativeTableRefPtr
            r1 = r8
            r4 = r9
            r6 = r11
            r1.nativeRenameColumn(r2, r4, r6)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L39
            io.realm.internal.OsSharedRealm r0 = r8.sharedRealm     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r8.getClassName()     // Catch: java.lang.Exception -> L2b
            io.realm.internal.OsObjectStore.setPrimaryKeyForObject(r0, r1, r11)     // Catch: java.lang.Exception -> L2b
            goto L39
        L2b:
            r11 = move-exception
            long r3 = r8.nativeTableRefPtr
            r2 = r8
            r5 = r9
            r2.nativeRenameColumn(r3, r5, r7)
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r11)
            throw r9
        L39:
            return
    }

    public void setBinaryByteArray(long r9, long r11, byte[] r13, boolean r14) {
            r8 = this;
            r8.checkImmutable()
            long r0 = r8.nativeTableRefPtr
            r2 = r9
            r4 = r11
            r6 = r13
            r7 = r14
            nativeSetByteArray(r0, r2, r4, r6, r7)
            return
    }

    public void setBoolean(long r9, long r11, boolean r13, boolean r14) {
            r8 = this;
            r8.checkImmutable()
            long r0 = r8.nativeTableRefPtr
            r2 = r9
            r4 = r11
            r6 = r13
            r7 = r14
            nativeSetBoolean(r0, r2, r4, r6, r7)
            return
    }

    public void setDate(long r10, long r12, java.util.Date r14, boolean r15) {
            r9 = this;
            if (r14 == 0) goto L12
            r9.checkImmutable()
            long r0 = r9.nativeTableRefPtr
            long r6 = r14.getTime()
            r2 = r10
            r4 = r12
            r8 = r15
            nativeSetTimestamp(r0, r2, r4, r6, r8)
            return
        L12:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Null Date is not allowed."
            r10.<init>(r11)
            throw r10
    }

    public void setDecimal128(long r15, long r17, @javax.annotation.Nullable org.bson.types.Decimal128 r19, boolean r20) {
            r14 = this;
            r0 = r14
            r14.checkImmutable()
            if (r19 != 0) goto L11
            long r1 = r0.nativeTableRefPtr
            r3 = r15
            r5 = r17
            r7 = r20
            nativeSetNull(r1, r3, r5, r7)
            goto L23
        L11:
            long r3 = r0.nativeTableRefPtr
            long r9 = r19.getLow()
            long r11 = r19.getHigh()
            r5 = r15
            r7 = r17
            r13 = r20
            nativeSetDecimal128(r3, r5, r7, r9, r11, r13)
        L23:
            return
    }

    public void setDouble(long r11, long r13, double r15, boolean r17) {
            r10 = this;
            r10.checkImmutable()
            r0 = r10
            long r1 = r0.nativeTableRefPtr
            r3 = r11
            r5 = r13
            r7 = r15
            r9 = r17
            nativeSetDouble(r1, r3, r5, r7, r9)
            return
    }

    public boolean setEmbedded(boolean r3) {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            boolean r3 = nativeSetEmbedded(r0, r3)
            return r3
    }

    public void setFloat(long r9, long r11, float r13, boolean r14) {
            r8 = this;
            r8.checkImmutable()
            long r0 = r8.nativeTableRefPtr
            r2 = r9
            r4 = r11
            r6 = r13
            r7 = r14
            nativeSetFloat(r0, r2, r4, r6, r7)
            return
    }

    public void setLink(long r11, long r13, long r15, boolean r17) {
            r10 = this;
            r10.checkImmutable()
            r0 = r10
            long r1 = r0.nativeTableRefPtr
            r3 = r11
            r5 = r13
            r7 = r15
            r9 = r17
            nativeSetLink(r1, r3, r5, r7, r9)
            return
    }

    public void setLong(long r11, long r13, long r15, boolean r17) {
            r10 = this;
            r10.checkImmutable()
            r0 = r10
            long r1 = r0.nativeTableRefPtr
            r3 = r11
            r5 = r13
            r7 = r15
            r9 = r17
            nativeSetLong(r1, r3, r5, r7, r9)
            return
    }

    public void setNull(long r8, long r10, boolean r12) {
            r7 = this;
            r7.checkImmutable()
            long r0 = r7.nativeTableRefPtr
            r2 = r8
            r4 = r10
            r6 = r12
            nativeSetNull(r0, r2, r4, r6)
            return
    }

    public void setObjectId(long r12, long r14, @javax.annotation.Nullable org.bson.types.ObjectId r16, boolean r17) {
            r11 = this;
            r0 = r11
            r11.checkImmutable()
            if (r16 != 0) goto L10
            long r1 = r0.nativeTableRefPtr
            r3 = r12
            r5 = r14
            r7 = r17
            nativeSetNull(r1, r3, r5, r7)
            goto L1d
        L10:
            long r3 = r0.nativeTableRefPtr
            java.lang.String r9 = r16.toString()
            r5 = r12
            r7 = r14
            r10 = r17
            nativeSetObjectId(r3, r5, r7, r9, r10)
        L1d:
            return
    }

    public void setRealmAny(long r11, long r13, long r15, boolean r17) {
            r10 = this;
            r10.checkImmutable()
            r0 = r10
            long r1 = r0.nativeTableRefPtr
            r3 = r11
            r5 = r13
            r7 = r15
            r9 = r17
            nativeSetRealmAny(r1, r3, r5, r7, r9)
            return
    }

    public void setString(long r9, long r11, @javax.annotation.Nullable java.lang.String r13, boolean r14) {
            r8 = this;
            r8.checkImmutable()
            if (r13 != 0) goto Le
            long r0 = r8.nativeTableRefPtr
            r2 = r9
            r4 = r11
            r6 = r14
            nativeSetNull(r0, r2, r4, r6)
            goto L17
        Le:
            long r0 = r8.nativeTableRefPtr
            r2 = r9
            r4 = r11
            r6 = r13
            r7 = r14
            nativeSetString(r0, r2, r4, r6, r7)
        L17:
            return
    }

    public void setUUID(long r12, long r14, @javax.annotation.Nullable java.util.UUID r16, boolean r17) {
            r11 = this;
            r0 = r11
            r11.checkImmutable()
            if (r16 != 0) goto L10
            long r1 = r0.nativeTableRefPtr
            r3 = r12
            r5 = r14
            r7 = r17
            nativeSetNull(r1, r3, r5, r7)
            goto L1d
        L10:
            long r3 = r0.nativeTableRefPtr
            java.lang.String r9 = r16.toString()
            r5 = r12
            r7 = r14
            r10 = r17
            nativeSetUUID(r3, r5, r7, r9, r10)
        L1d:
            return
    }

    public long size() {
            r2 = this;
            long r0 = r2.nativeTableRefPtr
            long r0 = r2.nativeSize(r0)
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            long r0 = r7.getColumnCount()
            java.lang.String r2 = r7.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The Table "
            r3.<init>(r4)
            if (r2 == 0) goto L23
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L23
            java.lang.String r2 = r7.getName()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
        L23:
            java.lang.String r2 = "contains "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " columns: "
            r3.append(r0)
            java.lang.String[] r0 = r7.getColumnNames()
            int r1 = r0.length
            r2 = 0
            r4 = 1
            r5 = 0
        L38:
            if (r5 >= r1) goto L4a
            r6 = r0[r5]
            if (r4 != 0) goto L43
            java.lang.String r4 = ", "
            r3.append(r4)
        L43:
            r3.append(r6)
            int r5 = r5 + 1
            r4 = 0
            goto L38
        L4a:
            java.lang.String r0 = "."
            r3.append(r0)
            java.lang.String r0 = " And "
            r3.append(r0)
            long r0 = r7.size()
            r3.append(r0)
            java.lang.String r0 = " rows."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public io.realm.internal.TableQuery where() {
            r4 = this;
            long r0 = r4.nativeTableRefPtr
            long r0 = r4.nativeWhere(r0)
            io.realm.internal.TableQuery r2 = new io.realm.internal.TableQuery
            io.realm.internal.NativeContext r3 = r4.context
            r2.<init>(r3, r4, r0)
            return r2
    }
}
