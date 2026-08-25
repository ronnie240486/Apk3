package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class DynamicRealmObject extends io.realm.RealmObject implements io.realm.internal.RealmObjectProxy {
    private final io.realm.ProxyState<io.realm.DynamicRealmObject> proxyState;

    /* JADX INFO: renamed from: io.realm.DynamicRealmObject$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$DynamicRealmObject$CollectionType = null;
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType = null;

        static {
                io.realm.DynamicRealmObject$CollectionType[] r0 = io.realm.DynamicRealmObject.CollectionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$DynamicRealmObject$CollectionType = r0
                r1 = 1
                io.realm.DynamicRealmObject$CollectionType r2 = io.realm.DynamicRealmObject.CollectionType.SET     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$DynamicRealmObject$CollectionType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.DynamicRealmObject$CollectionType r3 = io.realm.DynamicRealmObject.CollectionType.DICTIONARY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$DynamicRealmObject$CollectionType     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.DynamicRealmObject$CollectionType r4 = io.realm.DynamicRealmObject.CollectionType.LIST     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                io.realm.RealmFieldType[] r3 = io.realm.RealmFieldType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType = r3
                io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L43
                io.realm.RealmFieldType r3 = io.realm.RealmFieldType.INTEGER     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L4d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L58
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L63
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
            L63:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L6e
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L79
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L79:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L85
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L85:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L91
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L91
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L91
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L91
            L91:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L9d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L9d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> La9
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
            La9:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lb5
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT     // Catch: java.lang.NoSuchFieldError -> Lb5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb5
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb5
            Lb5:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lc1
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch: java.lang.NoSuchFieldError -> Lc1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            Lc1:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lcd
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP     // Catch: java.lang.NoSuchFieldError -> Lcd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcd
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcd
            Lcd:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Ld9
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP     // Catch: java.lang.NoSuchFieldError -> Ld9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld9
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld9
            Ld9:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Le5
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_STRING_MAP     // Catch: java.lang.NoSuchFieldError -> Le5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le5
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le5
            Le5:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lf1
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP     // Catch: java.lang.NoSuchFieldError -> Lf1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf1
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf1
            Lf1:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> Lfd
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DATE_MAP     // Catch: java.lang.NoSuchFieldError -> Lfd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfd
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfd
            Lfd:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L109
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP     // Catch: java.lang.NoSuchFieldError -> L109
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L109
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L109
            L109:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L115
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP     // Catch: java.lang.NoSuchFieldError -> L115
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L115
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L115
            L115:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L121
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP     // Catch: java.lang.NoSuchFieldError -> L121
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L121
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L121
            L121:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L12d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP     // Catch: java.lang.NoSuchFieldError -> L12d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12d
                r2 = 22
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12d
            L12d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L139
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_UUID_MAP     // Catch: java.lang.NoSuchFieldError -> L139
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L139
                r2 = 23
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L139
            L139:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L145
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP     // Catch: java.lang.NoSuchFieldError -> L145
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L145
                r2 = 24
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L145
            L145:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L151
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_LINK_MAP     // Catch: java.lang.NoSuchFieldError -> L151
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L151
                r2 = 25
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L151
            L151:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L15d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_SET     // Catch: java.lang.NoSuchFieldError -> L15d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15d
                r2 = 26
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15d
            L15d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L169
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_SET     // Catch: java.lang.NoSuchFieldError -> L169
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L169
                r2 = 27
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L169
            L169:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L175
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_SET     // Catch: java.lang.NoSuchFieldError -> L175
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L175
                r2 = 28
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L175
            L175:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L181
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_SET     // Catch: java.lang.NoSuchFieldError -> L181
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L181
                r2 = 29
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L181
            L181:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L18d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_SET     // Catch: java.lang.NoSuchFieldError -> L18d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L18d
                r2 = 30
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L18d
            L18d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L199
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_SET     // Catch: java.lang.NoSuchFieldError -> L199
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L199
                r2 = 31
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L199
            L199:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1a5
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_SET     // Catch: java.lang.NoSuchFieldError -> L1a5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1a5
                r2 = 32
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1a5
            L1a5:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1b1
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_SET     // Catch: java.lang.NoSuchFieldError -> L1b1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1b1
                r2 = 33
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1b1
            L1b1:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1bd
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_SET     // Catch: java.lang.NoSuchFieldError -> L1bd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1bd
                r2 = 34
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1bd
            L1bd:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1c9
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_SET     // Catch: java.lang.NoSuchFieldError -> L1c9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c9
                r2 = 35
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c9
            L1c9:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1d5
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINK_SET     // Catch: java.lang.NoSuchFieldError -> L1d5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d5
                r2 = 36
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d5
            L1d5:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1e1
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_SET     // Catch: java.lang.NoSuchFieldError -> L1e1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1e1
                r2 = 37
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1e1
            L1e1:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1ed
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINKING_OBJECTS     // Catch: java.lang.NoSuchFieldError -> L1ed
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ed
                r2 = 38
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ed
            L1ed:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L1f9
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch: java.lang.NoSuchFieldError -> L1f9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f9
                r2 = 39
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1f9
            L1f9:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L205
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch: java.lang.NoSuchFieldError -> L205
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L205
                r2 = 40
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L205
            L205:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L211
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch: java.lang.NoSuchFieldError -> L211
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L211
                r2 = 41
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L211
            L211:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L21d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch: java.lang.NoSuchFieldError -> L21d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L21d
                r2 = 42
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L21d
            L21d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L229
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch: java.lang.NoSuchFieldError -> L229
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L229
                r2 = 43
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L229
            L229:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L235
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch: java.lang.NoSuchFieldError -> L235
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L235
                r2 = 44
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L235
            L235:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L241
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch: java.lang.NoSuchFieldError -> L241
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L241
                r2 = 45
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L241
            L241:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L24d
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch: java.lang.NoSuchFieldError -> L24d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24d
                r2 = 46
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24d
            L24d:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L259
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch: java.lang.NoSuchFieldError -> L259
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L259
                r2 = 47
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L259
            L259:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L265
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch: java.lang.NoSuchFieldError -> L265
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L265
                r2 = 48
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L265
            L265:
                int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType     // Catch: java.lang.NoSuchFieldError -> L271
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_LIST     // Catch: java.lang.NoSuchFieldError -> L271
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L271
                r2 = 49
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L271
            L271:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final enum CollectionType extends java.lang.Enum<io.realm.DynamicRealmObject.CollectionType> {
        private static final /* synthetic */ io.realm.DynamicRealmObject.CollectionType[] $VALUES = null;
        public static final io.realm.DynamicRealmObject.CollectionType DICTIONARY = null;
        public static final io.realm.DynamicRealmObject.CollectionType LIST = null;
        public static final io.realm.DynamicRealmObject.CollectionType SET = null;

        static {
                io.realm.DynamicRealmObject$CollectionType r0 = new io.realm.DynamicRealmObject$CollectionType
                java.lang.String r1 = "LIST"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.DynamicRealmObject.CollectionType.LIST = r0
                io.realm.DynamicRealmObject$CollectionType r1 = new io.realm.DynamicRealmObject$CollectionType
                java.lang.String r3 = "DICTIONARY"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.DynamicRealmObject.CollectionType.DICTIONARY = r1
                io.realm.DynamicRealmObject$CollectionType r3 = new io.realm.DynamicRealmObject$CollectionType
                java.lang.String r5 = "SET"
                r6 = 2
                r3.<init>(r5, r6)
                io.realm.DynamicRealmObject.CollectionType.SET = r3
                r5 = 3
                io.realm.DynamicRealmObject$CollectionType[] r5 = new io.realm.DynamicRealmObject.CollectionType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.realm.DynamicRealmObject.CollectionType.$VALUES = r5
                return
        }

        private CollectionType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.DynamicRealmObject.CollectionType valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.DynamicRealmObject$CollectionType> r0 = io.realm.DynamicRealmObject.CollectionType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.DynamicRealmObject$CollectionType r1 = (io.realm.DynamicRealmObject.CollectionType) r1
                return r1
        }

        public static io.realm.DynamicRealmObject.CollectionType[] values() {
                io.realm.DynamicRealmObject$CollectionType[] r0 = io.realm.DynamicRealmObject.CollectionType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.DynamicRealmObject$CollectionType[] r0 = (io.realm.DynamicRealmObject.CollectionType[]) r0
                return r0
        }
    }

    public DynamicRealmObject(io.realm.BaseRealm r2, io.realm.internal.Row r3) {
            r1 = this;
            r1.<init>()
            io.realm.ProxyState r0 = new io.realm.ProxyState
            r0.<init>(r1)
            r1.proxyState = r0
            r0.setRealm$realm(r2)
            r0.setRow$realm(r3)
            r0.setConstructionFinished()
            return
    }

    public DynamicRealmObject(io.realm.RealmModel r4) {
            r3 = this;
            r3.<init>()
            io.realm.ProxyState r0 = new io.realm.ProxyState
            r0.<init>(r3)
            r3.proxyState = r0
            if (r4 == 0) goto L65
            boolean r1 = r4 instanceof io.realm.DynamicRealmObject
            if (r1 != 0) goto L4e
            boolean r1 = io.realm.RealmObject.isManaged(r4)
            if (r1 == 0) goto L46
            boolean r1 = io.realm.RealmObject.isValid(r4)
            if (r1 == 0) goto L3e
            io.realm.internal.RealmObjectProxy r4 = (io.realm.internal.RealmObjectProxy) r4
            io.realm.ProxyState r1 = r4.realmGet$proxyState()
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.ProxyState r4 = r4.realmGet$proxyState()
            io.realm.BaseRealm r4 = r4.getRealm$realm()
            r0.setRealm$realm(r4)
            io.realm.internal.UncheckedRow r1 = (io.realm.internal.UncheckedRow) r1
            io.realm.internal.CheckedRow r4 = r1.convertToChecked()
            r0.setRow$realm(r4)
            r0.setConstructionFinished()
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A valid object managed by Realm must be provided. This object was deleted."
            r4.<init>(r0)
            throw r4
        L46:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "An object managed by Realm must be provided. This is an unmanaged object."
            r4.<init>(r0)
            throw r4
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The object is already a DynamicRealmObject: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L65:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A non-null object must be provided."
            r4.<init>(r0)
            throw r4
    }

    private void checkFieldType(java.lang.String r6, long r7, io.realm.RealmFieldType r9) {
            r5 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r5.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.RealmFieldType r7 = r0.getColumnType(r7)
            if (r7 == r9) goto L44
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.INTEGER
            java.lang.String r0 = "n"
            java.lang.String r1 = ""
            if (r9 == r8) goto L1b
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.OBJECT
            if (r9 != r2) goto L19
            goto L1b
        L19:
            r2 = r1
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r7 == r8) goto L24
            io.realm.RealmFieldType r8 = io.realm.RealmFieldType.OBJECT
            if (r7 != r8) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            r3[r6] = r2
            r6 = 2
            r3[r6] = r9
            r6 = 3
            r3[r6] = r0
            r6 = 4
            r3[r6] = r7
            java.lang.String r6 = "'%s' is not a%s '%s', but a%s '%s'."
            java.lang.String r6 = java.lang.String.format(r1, r6, r3)
            r8.<init>(r6)
            throw r8
        L44:
            return
    }

    private void checkIsPrimaryKey(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            io.realm.RealmSchema r0 = r0.getSchema()
            java.lang.String r1 = r4.getType()
            io.realm.RealmObjectSchema r0 = r0.getSchemaForClass(r1)
            boolean r1 = r0.hasPrimaryKey()
            if (r1 == 0) goto L37
            java.lang.String r0 = r0.getPrimaryKey()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L23
            goto L37
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Primary key field '%s' cannot be changed after object was created."
            java.lang.String r5 = java.lang.String.format(r1, r5, r2)
            r0.<init>(r5)
            throw r0
        L37:
            return
    }

    private <E> io.realm.ManagedListOperator<E> getOperator(io.realm.BaseRealm r2, io.realm.internal.OsList r3, io.realm.RealmFieldType r4, java.lang.Class<E> r5) {
            r1 = this;
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.STRING_LIST
            if (r4 != r0) goto La
            io.realm.StringListOperator r4 = new io.realm.StringListOperator
            r4.<init>(r2, r3, r5)
            return r4
        La:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.INTEGER_LIST
            if (r4 != r0) goto L14
            io.realm.LongListOperator r4 = new io.realm.LongListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L14:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.BOOLEAN_LIST
            if (r4 != r0) goto L1e
            io.realm.BooleanListOperator r4 = new io.realm.BooleanListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L1e:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.BINARY_LIST
            if (r4 != r0) goto L28
            io.realm.BinaryListOperator r4 = new io.realm.BinaryListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L28:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.DOUBLE_LIST
            if (r4 != r0) goto L32
            io.realm.DoubleListOperator r4 = new io.realm.DoubleListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L32:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.FLOAT_LIST
            if (r4 != r0) goto L3c
            io.realm.FloatListOperator r4 = new io.realm.FloatListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L3c:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.DATE_LIST
            if (r4 != r0) goto L46
            io.realm.DateListOperator r4 = new io.realm.DateListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L46:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.DECIMAL128_LIST
            if (r4 != r0) goto L50
            io.realm.Decimal128ListOperator r4 = new io.realm.Decimal128ListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L50:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.OBJECT_ID_LIST
            if (r4 != r0) goto L5a
            io.realm.ObjectIdListOperator r4 = new io.realm.ObjectIdListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L5a:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.UUID_LIST
            if (r4 != r0) goto L64
            io.realm.UUIDListOperator r4 = new io.realm.UUIDListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L64:
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.MIXED_LIST
            if (r4 != r0) goto L6e
            io.realm.RealmAnyListOperator r4 = new io.realm.RealmAnyListOperator
            r4.<init>(r2, r3, r5)
            return r4
        L6e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unexpected list type: "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r4 = r4.name()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private io.realm.RealmAny getRealmAny(long r2) {
            r1 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.core.NativeRealmAny r2 = r0.getNativeRealmAny(r2)
            io.realm.RealmAny r3 = new io.realm.RealmAny
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            io.realm.RealmAnyOperator r2 = io.realm.RealmAnyOperator.fromNativeRealmAny(r0, r2)
            r3.<init>(r2)
            return r3
    }

    private <E> int primitiveTypeToCoreType(java.lang.Class<E> r4) {
            r3 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La3
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La3
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La3
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L22
            goto La3
        L22:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2c
            r4 = 1
            return r4
        L2c:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L36
            r4 = 2
            return r4
        L36:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L40
            r4 = 4
            return r4
        L40:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L4b
            r4 = 8
            return r4
        L4b:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L56
            r4 = 9
            return r4
        L56:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L61
            r4 = 10
            return r4
        L61:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6c
            r4 = 11
            return r4
        L6c:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L77
            r4 = 15
            return r4
        L77:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L82
            r4 = 17
            return r4
        L82:
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8c
            r4 = 6
            return r4
        L8c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported element type. Only primitive types supported. Yours was: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        La3:
            r4 = 0
            return r4
    }

    private <E> io.realm.RealmFieldType primitiveTypeToRealmFieldType(io.realm.DynamicRealmObject.CollectionType r3, java.lang.Class<E> r4) {
            r2 = this;
            int r4 = r2.primitiveTypeToCoreType(r4)
            int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$DynamicRealmObject$CollectionType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L2f
            r1 = 3
            if (r0 != r1) goto L18
            int r4 = r4 + 128
            goto L34
        L18:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Type not supported: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L2f:
            int r4 = r4 + 512
            goto L34
        L32:
            int r4 = r4 + 256
        L34:
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.fromNativeValue(r4)
            return r3
    }

    private void setModelDictionary(java.lang.String r12, io.realm.RealmDictionary<io.realm.DynamicRealmObject> r13) {
            r11 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r11.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r12)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r12 = r11.proxyState
            io.realm.internal.Row r12 = r12.getRow$realm()
            io.realm.internal.OsMap r12 = r12.getModelMap(r0)
            io.realm.internal.Table r0 = r12.getTargetTable()
            java.lang.String r1 = r0.getClassName()
            boolean r2 = r13.isManaged()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L27
            r2 = 0
            goto L55
        L27:
            io.realm.RealmMap$MapStrategy<K, V> r2 = r13.mapStrategy
            java.lang.String r2 = r2.getValueClassName()
            if (r2 == 0) goto L36
            io.realm.RealmMap$MapStrategy<K, V> r2 = r13.mapStrategy
            java.lang.String r2 = r2.getValueClassName()
            goto L4e
        L36:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r11.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.RealmSchema r2 = r2.getSchema()
            io.realm.RealmMap$MapStrategy<K, V> r6 = r13.mapStrategy
            java.lang.Class r6 = r6.getValueClass()
            io.realm.internal.Table r2 = r2.getTable(r6)
            java.lang.String r2 = r2.getClassName()
        L4e:
            boolean r6 = r1.equals(r2)
            if (r6 == 0) goto L110
            r2 = 1
        L55:
            io.realm.RealmDictionary r6 = new io.realm.RealmDictionary
            r6.<init>()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L62:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto Le6
            java.lang.Object r7 = r13.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            io.realm.internal.RealmObjectProxy r8 = (io.realm.internal.RealmObjectProxy) r8
            io.realm.ProxyState r9 = r8.realmGet$proxyState()
            io.realm.BaseRealm r9 = r9.getRealm$realm()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r11.proxyState
            io.realm.BaseRealm r10 = r10.getRealm$realm()
            if (r9 != r10) goto Lde
            if (r2 != 0) goto Lc4
            io.realm.ProxyState r9 = r8.realmGet$proxyState()
            io.realm.internal.Row r9 = r9.getRow$realm()
            io.realm.internal.Table r9 = r9.getTable()
            boolean r9 = r0.hasSameSchema(r9)
            if (r9 == 0) goto L99
            goto Lc4
        L99:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.util.Locale r13 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = r7.getKey()
            r0[r5] = r2
            io.realm.ProxyState r2 = r8.realmGet$proxyState()
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getClassName()
            r0[r4] = r2
            r0[r3] = r1
            java.lang.String r1 = "Element with key %s is not the proper type. Was '%s' expected '%s'."
            java.lang.String r13 = java.lang.String.format(r13, r1, r0)
            r12.<init>(r13)
            throw r12
        Lc4:
            io.realm.ProxyState r8 = r8.realmGet$proxyState()
            io.realm.internal.Row r8 = r8.getRow$realm()
            long r8 = r8.getObjectKey()
            java.lang.Object r7 = r7.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.put(r7, r8)
            goto L62
        Lde:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Each element in 'dictionary' must belong to the same Realm instance."
            r12.<init>(r13)
            throw r12
        Le6:
            r12.clear()
            java.util.Set r13 = r6.entrySet()
            java.util.Iterator r13 = r13.iterator()
        Lf1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L10f
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r12.putRow(r1, r2)
            goto Lf1
        L10f:
            return
        L110:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.util.Locale r13 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r2
            r0[r4] = r1
            java.lang.String r1 = "The elements in the dictionary are not the proper type. Was %s expected %s."
            java.lang.String r13 = java.lang.String.format(r13, r1, r0)
            r12.<init>(r13)
            throw r12
    }

    private void setModelList(java.lang.String r13, io.realm.RealmList<io.realm.DynamicRealmObject> r14) {
            r12 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r12.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r13)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            io.realm.internal.OsList r13 = r13.getModelList(r0)
            io.realm.internal.Table r0 = r13.getTargetTable()
            java.lang.String r1 = r0.getClassName()
            java.lang.String r2 = r14.className
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L29
            java.lang.Class<E> r6 = r14.clazz
            if (r6 != 0) goto L29
            r2 = 0
            goto L47
        L29:
            if (r2 == 0) goto L2c
            goto L40
        L2c:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r12.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.RealmSchema r2 = r2.getSchema()
            java.lang.Class<E> r6 = r14.clazz
            io.realm.internal.Table r2 = r2.getTable(r6)
            java.lang.String r2 = r2.getClassName()
        L40:
            boolean r6 = r1.equals(r2)
            if (r6 == 0) goto Lcd
            r2 = 1
        L47:
            int r6 = r14.size()
            long[] r7 = new long[r6]
            r8 = 0
        L4e:
            if (r8 >= r6) goto Lbf
            java.lang.Object r9 = r14.get(r8)
            io.realm.internal.RealmObjectProxy r9 = (io.realm.internal.RealmObjectProxy) r9
            io.realm.ProxyState r10 = r9.realmGet$proxyState()
            io.realm.BaseRealm r10 = r10.getRealm$realm()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r11 = r12.proxyState
            io.realm.BaseRealm r11 = r11.getRealm$realm()
            if (r10 != r11) goto Lb7
            if (r2 != 0) goto La6
            io.realm.ProxyState r10 = r9.realmGet$proxyState()
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.Table r10 = r10.getTable()
            boolean r10 = r0.hasSameSchema(r10)
            if (r10 == 0) goto L7b
            goto La6
        L7b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.util.Locale r14 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0[r5] = r2
            io.realm.ProxyState r2 = r9.realmGet$proxyState()
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getClassName()
            r0[r4] = r2
            r0[r3] = r1
            java.lang.String r1 = "Element at index %d is not the proper type. Was '%s' expected '%s'."
            java.lang.String r14 = java.lang.String.format(r14, r1, r0)
            r13.<init>(r14)
            throw r13
        La6:
            io.realm.ProxyState r9 = r9.realmGet$proxyState()
            io.realm.internal.Row r9 = r9.getRow$realm()
            long r9 = r9.getObjectKey()
            r7[r8] = r9
            int r8 = r8 + 1
            goto L4e
        Lb7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Each element in 'list' must belong to the same Realm instance."
            r13.<init>(r14)
            throw r13
        Lbf:
            r13.removeAll()
        Lc2:
            if (r5 >= r6) goto Lcc
            r0 = r7[r5]
            r13.addRow(r0)
            int r5 = r5 + 1
            goto Lc2
        Lcc:
            return
        Lcd:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.util.Locale r14 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r2
            r0[r4] = r1
            java.lang.String r1 = "The elements in the list are not the proper type. Was %s expected %s."
            java.lang.String r14 = java.lang.String.format(r14, r1, r0)
            r13.<init>(r14)
            throw r13
    }

    private void setModelSet(java.lang.String r11, io.realm.RealmSet<io.realm.DynamicRealmObject> r12) {
            r10 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r10.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r11)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r11 = r10.proxyState
            io.realm.internal.Row r11 = r11.getRow$realm()
            io.realm.internal.OsSet r11 = r11.getModelSet(r0)
            io.realm.internal.Table r0 = r11.getTargetTable()
            java.lang.String r1 = r0.getClassName()
            boolean r2 = r12.isManaged()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L27
            r2 = 0
            goto L4f
        L27:
            java.lang.String r2 = r12.getValueClassName()
            if (r2 == 0) goto L32
            java.lang.String r2 = r12.getValueClassName()
            goto L48
        L32:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r10.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            io.realm.RealmSchema r2 = r2.getSchema()
            java.lang.Class r6 = r12.getValueClass()
            io.realm.internal.Table r2 = r2.getTable(r6)
            java.lang.String r2 = r2.getClassName()
        L48:
            boolean r6 = r1.equals(r2)
            if (r6 == 0) goto Le5
            r2 = 1
        L4f:
            io.realm.RealmSet r6 = new io.realm.RealmSet
            r6.<init>()
            java.util.Iterator r12 = r12.iterator()
        L58:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto Lc9
            java.lang.Object r7 = r12.next()
            io.realm.DynamicRealmObject r7 = (io.realm.DynamicRealmObject) r7
            io.realm.ProxyState r8 = r7.realmGet$proxyState()
            io.realm.BaseRealm r8 = r8.getRealm$realm()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r9 = r10.proxyState
            io.realm.BaseRealm r9 = r9.getRealm$realm()
            if (r8 != r9) goto Lc1
            if (r2 != 0) goto Lad
            io.realm.ProxyState r8 = r7.realmGet$proxyState()
            io.realm.internal.Row r8 = r8.getRow$realm()
            io.realm.internal.Table r8 = r8.getTable()
            boolean r8 = r0.hasSameSchema(r8)
            if (r8 == 0) goto L89
            goto Lad
        L89:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.util.Locale r12 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            io.realm.ProxyState r2 = r7.realmGet$proxyState()
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getClassName()
            r0[r5] = r2
            r0[r4] = r1
            java.lang.String r1 = "Set contains an element with not the proper type. Was '%s' expected '%s'."
            java.lang.String r12 = java.lang.String.format(r12, r1, r0)
            r11.<init>(r12)
            throw r11
        Lad:
            io.realm.ProxyState r7 = r7.realmGet$proxyState()
            io.realm.internal.Row r7 = r7.getRow$realm()
            long r7 = r7.getObjectKey()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.add(r7)
            goto L58
        Lc1:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Each element in 'set' must belong to the same Realm instance."
            r11.<init>(r12)
            throw r11
        Lc9:
            r11.clear()
            java.util.Iterator r12 = r6.iterator()
        Ld0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r12.next()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r11.addRow(r0)
            goto Ld0
        Le4:
            return
        Le5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.util.Locale r12 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r2
            r0[r4] = r1
            java.lang.String r1 = "The elements in the set are not the proper type. Was %s expected %s."
            java.lang.String r12 = java.lang.String.format(r12, r1, r0)
            r11.<init>(r12)
            throw r11
    }

    private void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != r1) goto L13
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.setBoolean(r3, r4)
            goto Lc5
        L13:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto L22
            java.lang.Short r4 = (java.lang.Short) r4
            short r4 = r4.shortValue()
            r2.setShort(r3, r4)
            goto Lc5
        L22:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto L31
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setInt(r3, r4)
            goto Lc5
        L31:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L40
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2.setLong(r3, r0)
            goto Lc5
        L40:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto L4f
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            r2.setByte(r3, r4)
            goto Lc5
        L4f:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L5e
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.setFloat(r3, r4)
            goto Lc5
        L5e:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L6c
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r2.setDouble(r3, r0)
            goto Lc5
        L6c:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L76
            java.lang.String r4 = (java.lang.String) r4
            r2.setString(r3, r4)
            goto Lc5
        L76:
            boolean r1 = r4 instanceof java.util.Date
            if (r1 == 0) goto L80
            java.util.Date r4 = (java.util.Date) r4
            r2.setDate(r3, r4)
            goto Lc5
        L80:
            boolean r1 = r4 instanceof byte[]
            if (r1 == 0) goto L8a
            byte[] r4 = (byte[]) r4
            r2.setBlob(r3, r4)
            goto Lc5
        L8a:
            java.lang.Class<io.realm.DynamicRealmObject> r1 = io.realm.DynamicRealmObject.class
            if (r0 != r1) goto L94
            io.realm.DynamicRealmObject r4 = (io.realm.DynamicRealmObject) r4
            r2.setObject(r3, r4)
            goto Lc5
        L94:
            java.lang.Class<io.realm.RealmList> r1 = io.realm.RealmList.class
            if (r0 != r1) goto L9e
            io.realm.RealmList r4 = (io.realm.RealmList) r4
            r2.setList(r3, r4)
            goto Lc5
        L9e:
            java.lang.Class<org.bson.types.Decimal128> r1 = org.bson.types.Decimal128.class
            if (r0 != r1) goto La8
            org.bson.types.Decimal128 r4 = (org.bson.types.Decimal128) r4
            r2.setDecimal128(r3, r4)
            goto Lc5
        La8:
            java.lang.Class<org.bson.types.ObjectId> r1 = org.bson.types.ObjectId.class
            if (r0 != r1) goto Lb2
            org.bson.types.ObjectId r4 = (org.bson.types.ObjectId) r4
            r2.setObjectId(r3, r4)
            goto Lc5
        Lb2:
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            if (r0 != r1) goto Lbc
            java.util.UUID r4 = (java.util.UUID) r4
            r2.setUUID(r3, r4)
            goto Lc5
        Lbc:
            java.lang.Class<io.realm.RealmAny> r1 = io.realm.RealmAny.class
            if (r0 != r1) goto Lc6
            io.realm.RealmAny r4 = (io.realm.RealmAny) r4
            r2.setRealmAny(r3, r4)
        Lc5:
            return
        Lc6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Value is of an type not supported: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class r4 = r4.getClass()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    private <E> void setValueDictionary(java.lang.String r4, io.realm.RealmDictionary<E> r5, io.realm.RealmFieldType r6) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.internal.OsMap r4 = r4.getValueMap(r0, r6)
            int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r1 = r6.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 14: goto L54;
                case 15: goto L51;
                case 16: goto L4e;
                case 17: goto L4b;
                case 18: goto L48;
                case 19: goto L45;
                case 20: goto L42;
                case 21: goto L3f;
                case 22: goto L3c;
                case 23: goto L39;
                case 24: goto L36;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported type: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Class<io.realm.RealmAny> r6 = io.realm.RealmAny.class
            goto L56
        L39:
            java.lang.Class<java.util.UUID> r6 = java.util.UUID.class
            goto L56
        L3c:
            java.lang.Class<org.bson.types.ObjectId> r6 = org.bson.types.ObjectId.class
            goto L56
        L3f:
            java.lang.Class<org.bson.types.Decimal128> r6 = org.bson.types.Decimal128.class
            goto L56
        L42:
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            goto L56
        L45:
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            goto L56
        L48:
            java.lang.Class<java.util.Date> r6 = java.util.Date.class
            goto L56
        L4b:
            java.lang.Class<byte[]> r6 = byte[].class
            goto L56
        L4e:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            goto L56
        L51:
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            goto L56
        L54:
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
        L56:
            io.realm.RealmDictionary r0 = new io.realm.RealmDictionary
            io.realm.ProxyState<io.realm.DynamicRealmObject> r1 = r3.proxyState
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            r0.<init>(r1, r4, r6)
            io.realm.RealmDictionary r6 = new io.realm.RealmDictionary
            r6.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r6.put(r2, r1)
            goto L6e
        L88:
            r4.clear()
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L93:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            r0.put(r6, r5)
            goto L93
        Lad:
            return
    }

    private <E> void setValueList(java.lang.String r6, io.realm.RealmList<E> r7, io.realm.RealmFieldType r8) {
            r5 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r5.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r6)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r5.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.OsList r6 = r6.getValueList(r0, r8)
            int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 39: goto L54;
                case 40: goto L51;
                case 41: goto L4e;
                case 42: goto L4b;
                case 43: goto L48;
                case 44: goto L45;
                case 45: goto L42;
                case 46: goto L3f;
                case 47: goto L3c;
                case 48: goto L39;
                case 49: goto L36;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unsupported type: "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            goto L56
        L39:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            goto L56
        L3c:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            goto L56
        L3f:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            goto L56
        L42:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            goto L56
        L45:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            goto L56
        L48:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            goto L56
        L4b:
            java.lang.Class<byte[]> r0 = byte[].class
            goto L56
        L4e:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            goto L56
        L51:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            goto L56
        L54:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
        L56:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r1 = r5.proxyState
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            io.realm.ManagedListOperator r8 = r5.getOperator(r1, r6, r8, r0)
            boolean r0 = r7.isManaged()
            if (r0 == 0) goto L88
            long r0 = r6.size()
            int r2 = r7.size()
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L88
            int r6 = r7.size()
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L7c:
            if (r0 >= r6) goto L9d
            java.lang.Object r1 = r7.next()
            r8.set(r0, r1)
            int r0 = r0 + 1
            goto L7c
        L88:
            r6.removeAll()
            java.util.Iterator r6 = r7.iterator()
        L8f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9d
            java.lang.Object r7 = r6.next()
            r8.append(r7)
            goto L8f
        L9d:
            return
    }

    private <E> void setValueSet(java.lang.String r3, io.realm.RealmSet<E> r4, io.realm.RealmFieldType r5) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            io.realm.internal.OsSet r3 = r3.getValueSet(r0, r5)
            int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 26: goto L54;
                case 27: goto L51;
                case 28: goto L4e;
                case 29: goto L4b;
                case 30: goto L48;
                case 31: goto L45;
                case 32: goto L42;
                case 33: goto L3f;
                case 34: goto L3c;
                case 35: goto L39;
                case 36: goto L1f;
                case 37: goto L36;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unsupported type: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L36:
            java.lang.Class<io.realm.RealmAny> r5 = io.realm.RealmAny.class
            goto L56
        L39:
            java.lang.Class<java.util.UUID> r5 = java.util.UUID.class
            goto L56
        L3c:
            java.lang.Class<org.bson.types.ObjectId> r5 = org.bson.types.ObjectId.class
            goto L56
        L3f:
            java.lang.Class<org.bson.types.Decimal128> r5 = org.bson.types.Decimal128.class
            goto L56
        L42:
            java.lang.Class<java.lang.Double> r5 = java.lang.Double.class
            goto L56
        L45:
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            goto L56
        L48:
            java.lang.Class<java.util.Date> r5 = java.util.Date.class
            goto L56
        L4b:
            java.lang.Class<byte[]> r5 = byte[].class
            goto L56
        L4e:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            goto L56
        L51:
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            goto L56
        L54:
            java.lang.Class<java.lang.Number> r5 = java.lang.Number.class
        L56:
            io.realm.RealmSet r0 = new io.realm.RealmSet
            io.realm.ProxyState<io.realm.DynamicRealmObject> r1 = r2.proxyState
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            r0.<init>(r1, r3, r5)
            io.realm.RealmSet r5 = new io.realm.RealmSet
            r5.<init>()
            r5.addAll(r4)
            r3.clear()
            r0.addAll(r5)
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            r0 = 1
            if (r6 != r7) goto Ld
            return r0
        Ld:
            r1 = 0
            if (r7 == 0) goto L80
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L1b
            goto L80
        L1b:
            io.realm.DynamicRealmObject r7 = (io.realm.DynamicRealmObject) r7
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            java.lang.String r2 = r2.getPath()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r7.proxyState
            io.realm.BaseRealm r3 = r3.getRealm$realm()
            java.lang.String r3 = r3.getPath()
            if (r2 == 0) goto L3a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3d
            goto L3c
        L3a:
            if (r3 == 0) goto L3d
        L3c:
            return r1
        L3d:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            java.lang.String r2 = r2.getName()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r7.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            io.realm.internal.Table r3 = r3.getTable()
            java.lang.String r3 = r3.getName()
            if (r2 == 0) goto L62
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L65
            goto L64
        L62:
            if (r3 == 0) goto L65
        L64:
            return r1
        L65:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r7 = r7.proxyState
            io.realm.internal.Row r7 = r7.getRow$realm()
            long r4 = r7.getObjectKey()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            r0 = 0
        L7f:
            return r0
        L80:
            return r1
    }

    public <E> E get(java.lang.String r13) {
            r12 = this;
            java.lang.Class<io.realm.RealmAny> r0 = io.realm.RealmAny.class
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            io.realm.ProxyState<io.realm.DynamicRealmObject> r7 = r12.proxyState
            io.realm.BaseRealm r7 = r7.getRealm$realm()
            r7.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r7 = r12.proxyState
            io.realm.internal.Row r7 = r7.getRow$realm()
            long r7 = r7.getColumnKey(r13)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r9 = r12.proxyState
            io.realm.internal.Row r9 = r9.getRow$realm()
            boolean r9 = r9.isNull(r7)
            if (r9 == 0) goto L2f
            r13 = 0
            return r13
        L2f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r9 = r12.proxyState
            io.realm.internal.Row r9 = r9.getRow$realm()
            io.realm.RealmFieldType r9 = r9.getColumnType(r7)
            int[] r10 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r11 = r9.ordinal()
            r10 = r10[r11]
            switch(r10) {
                case 1: goto L161;
                case 2: goto L152;
                case 3: goto L143;
                case 4: goto L134;
                case 5: goto L129;
                case 6: goto L11e;
                case 7: goto L113;
                case 8: goto L108;
                case 9: goto Lfd;
                case 10: goto Lf8;
                case 11: goto Led;
                case 12: goto Le8;
                case 13: goto Le3;
                case 14: goto Lde;
                case 15: goto Ld9;
                case 16: goto Ld4;
                case 17: goto Lcf;
                case 18: goto Lc8;
                case 19: goto Lc3;
                case 20: goto Lbe;
                case 21: goto Lb7;
                case 22: goto Lb0;
                case 23: goto La9;
                case 24: goto La4;
                case 25: goto L9f;
                case 26: goto L9a;
                case 27: goto L95;
                case 28: goto L90;
                case 29: goto L8b;
                case 30: goto L84;
                case 31: goto L7f;
                case 32: goto L7a;
                case 33: goto L73;
                case 34: goto L6c;
                case 35: goto L65;
                case 36: goto L60;
                case 37: goto L5b;
                default: goto L44;
            }
        L44:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field type not supported: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L5b:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r0)
            return r13
        L60:
            io.realm.RealmSet r13 = r12.getRealmSet(r13)
            return r13
        L65:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r0)
            return r13
        L6c:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r0)
            return r13
        L73:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r0)
            return r13
        L7a:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r1)
            return r13
        L7f:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r2)
            return r13
        L84:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r0)
            return r13
        L8b:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r3)
            return r13
        L90:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r4)
            return r13
        L95:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r5)
            return r13
        L9a:
            io.realm.RealmSet r13 = r12.getRealmSet(r13, r6)
            return r13
        L9f:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13)
            return r13
        La4:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r0)
            return r13
        La9:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r0)
            return r13
        Lb0:
            java.lang.Class<org.bson.types.ObjectId> r0 = org.bson.types.ObjectId.class
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r0)
            return r13
        Lb7:
            java.lang.Class<org.bson.types.Decimal128> r0 = org.bson.types.Decimal128.class
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r0)
            return r13
        Lbe:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r1)
            return r13
        Lc3:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r2)
            return r13
        Lc8:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r0)
            return r13
        Lcf:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r3)
            return r13
        Ld4:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r4)
            return r13
        Ld9:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r5)
            return r13
        Lde:
            io.realm.RealmDictionary r13 = r12.getDictionary(r13, r6)
            return r13
        Le3:
            io.realm.RealmList r13 = r12.getList(r13)
            return r13
        Le8:
            io.realm.DynamicRealmObject r13 = r12.getObject(r13)
            return r13
        Led:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            java.util.UUID r13 = r13.getUUID(r7)
            return r13
        Lf8:
            io.realm.RealmAny r13 = r12.getRealmAny(r7)
            return r13
        Lfd:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            org.bson.types.ObjectId r13 = r13.getObjectId(r7)
            return r13
        L108:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            org.bson.types.Decimal128 r13 = r13.getDecimal128(r7)
            return r13
        L113:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            java.util.Date r13 = r13.getDate(r7)
            return r13
        L11e:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            byte[] r13 = r13.getBinaryByteArray(r7)
            return r13
        L129:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            java.lang.String r13 = r13.getString(r7)
            return r13
        L134:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            double r0 = r13.getDouble(r7)
            java.lang.Double r13 = java.lang.Double.valueOf(r0)
            return r13
        L143:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            float r13 = r13.getFloat(r7)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            return r13
        L152:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            long r0 = r13.getLong(r7)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            return r13
        L161:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r13 = r12.proxyState
            io.realm.internal.Row r13 = r13.getRow$realm()
            boolean r13 = r13.getBoolean(r7)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
    }

    public byte[] getBlob(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState     // Catch: java.lang.IllegalArgumentException -> L1e
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L1e
            byte[] r5 = r2.getBinaryByteArray(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return r5
        L1e:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.BINARY
            r4.checkFieldType(r5, r0, r3)
            throw r2
    }

    public boolean getBoolean(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState     // Catch: java.lang.IllegalArgumentException -> L1e
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L1e
            boolean r5 = r2.getBoolean(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return r5
        L1e:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.BOOLEAN
            r4.checkFieldType(r5, r0, r3)
            throw r2
    }

    public byte getByte(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            int r3 = (int) r0
            byte r3 = (byte) r3
            return r3
    }

    public java.util.Date getDate(java.lang.String r4) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.DATE
            r3.checkFieldType(r4, r0, r2)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            boolean r4 = r4.isNull(r0)
            if (r4 == 0) goto L26
            r4 = 0
            return r4
        L26:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            java.util.Date r4 = r4.getDate(r0)
            return r4
    }

    public org.bson.types.Decimal128 getDecimal128(java.lang.String r4) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.DECIMAL128
            r3.checkFieldType(r4, r0, r2)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            boolean r4 = r4.isNull(r0)
            if (r4 == 0) goto L26
            r4 = 0
            return r4
        L26:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            org.bson.types.Decimal128 r4 = r4.getDecimal128(r0)
            return r4
    }

    public io.realm.RealmDictionary<io.realm.DynamicRealmObject> getDictionary(java.lang.String r7) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r7)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.OsMap r2 = r2.getModelMap(r0)     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Table r3 = r2.getTargetTable()     // Catch: java.lang.IllegalArgumentException -> L31
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.RealmDictionary r4 = new io.realm.RealmDictionary     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.BaseRealm r5 = r5.getRealm$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r5, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L31
            return r4
        L31:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING_TO_LINK_MAP
            r6.checkFieldType(r7, r0, r3)
            throw r2
    }

    public <E> io.realm.RealmDictionary<E> getDictionary(java.lang.String r7, java.lang.Class<E> r8) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r8 == 0) goto L36
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r7)
            io.realm.DynamicRealmObject$CollectionType r2 = io.realm.DynamicRealmObject.CollectionType.DICTIONARY
            io.realm.RealmFieldType r2 = r6.primitiveTypeToRealmFieldType(r2, r8)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Row r3 = r3.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.OsMap r3 = r3.getValueMap(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.RealmDictionary r4 = new io.realm.RealmDictionary     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.BaseRealm r5 = r5.getRealm$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r5, r3, r8)     // Catch: java.lang.IllegalArgumentException -> L31
            return r4
        L31:
            r8 = move-exception
            r6.checkFieldType(r7, r0, r2)
            throw r8
        L36:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Non-null 'primitiveType' required."
            r7.<init>(r8)
            throw r7
    }

    public double getDouble(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState     // Catch: java.lang.IllegalArgumentException -> L1e
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L1e
            double r0 = r2.getDouble(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return r0
        L1e:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.DOUBLE
            r4.checkFieldType(r5, r0, r3)
            throw r2
    }

    public io.realm.DynamicRealm getDynamicRealm() {
            r2 = this;
            io.realm.ProxyState r0 = r2.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            boolean r1 = r2.isValid()
            if (r1 == 0) goto L14
            io.realm.DynamicRealm r0 = (io.realm.DynamicRealm) r0
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the object is already deleted."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String[] getFieldNames() {
            r1 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            java.lang.String[] r0 = r0.getColumnNames()
            return r0
    }

    public io.realm.RealmFieldType getFieldType(java.lang.String r3) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            io.realm.RealmFieldType r3 = r3.getColumnType(r0)
            return r3
    }

    public float getFloat(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState     // Catch: java.lang.IllegalArgumentException -> L1e
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L1e
            float r5 = r2.getFloat(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return r5
        L1e:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.FLOAT
            r4.checkFieldType(r5, r0, r3)
            throw r2
    }

    public int getInt(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            int r3 = (int) r0
            return r3
    }

    public io.realm.RealmList<io.realm.DynamicRealmObject> getList(java.lang.String r7) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r7)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.OsList r2 = r2.getModelList(r0)     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Table r3 = r2.getTargetTable()     // Catch: java.lang.IllegalArgumentException -> L31
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.RealmList r4 = new io.realm.RealmList     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.BaseRealm r5 = r5.getRealm$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r3, r2, r5)     // Catch: java.lang.IllegalArgumentException -> L31
            return r4
        L31:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.LIST
            r6.checkFieldType(r7, r0, r3)
            throw r2
    }

    public <E> io.realm.RealmList<E> getList(java.lang.String r7, java.lang.Class<E> r8) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r8 == 0) goto L36
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r7)
            io.realm.DynamicRealmObject$CollectionType r2 = io.realm.DynamicRealmObject.CollectionType.LIST
            io.realm.RealmFieldType r2 = r6.primitiveTypeToRealmFieldType(r2, r8)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Row r3 = r3.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.OsList r3 = r3.getValueList(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.RealmList r4 = new io.realm.RealmList     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.BaseRealm r5 = r5.getRealm$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r8, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L31
            return r4
        L31:
            r8 = move-exception
            r6.checkFieldType(r7, r0, r2)
            throw r8
        L36:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Non-null 'primitiveType' required."
            r7.<init>(r8)
            throw r7
    }

    public long getLong(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState     // Catch: java.lang.IllegalArgumentException -> L1e
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L1e
            long r0 = r2.getLong(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return r0
        L1e:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.INTEGER
            r4.checkFieldType(r5, r0, r3)
            throw r2
    }

    @javax.annotation.Nullable
    public io.realm.DynamicRealmObject getObject(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.OBJECT
            r4.checkFieldType(r5, r0, r2)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNullLink(r0)
            if (r5 == 0) goto L26
            r5 = 0
            return r5
        L26:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            long r2 = r5.getLink(r0)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            io.realm.internal.Table r5 = r5.getTable()
            io.realm.internal.Table r5 = r5.getLinkTarget(r0)
            io.realm.internal.CheckedRow r5 = r5.getCheckedRow(r2)
            io.realm.DynamicRealmObject r0 = new io.realm.DynamicRealmObject
            io.realm.ProxyState<io.realm.DynamicRealmObject> r1 = r4.proxyState
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            r0.<init>(r1, r5)
            return r0
    }

    public org.bson.types.ObjectId getObjectId(java.lang.String r4) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.OBJECT_ID
            r3.checkFieldType(r4, r0, r2)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            boolean r4 = r4.isNull(r0)
            if (r4 == 0) goto L26
            r4 = 0
            return r4
        L26:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            org.bson.types.ObjectId r4 = r4.getObjectId(r0)
            return r4
    }

    public io.realm.RealmAny getRealmAny(java.lang.String r4) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.MIXED
            r3.checkFieldType(r4, r0, r2)
            io.realm.RealmAny r4 = r3.getRealmAny(r0)
            return r4
    }

    public io.realm.RealmSet<io.realm.DynamicRealmObject> getRealmSet(java.lang.String r7) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r7)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.OsSet r2 = r2.getModelSet(r0)     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Table r3 = r2.getTargetTable()     // Catch: java.lang.IllegalArgumentException -> L31
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.RealmSet r4 = new io.realm.RealmSet     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.BaseRealm r5 = r5.getRealm$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r5, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L31
            return r4
        L31:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.LINK_SET
            r6.checkFieldType(r7, r0, r3)
            throw r2
    }

    public <E> io.realm.RealmSet<E> getRealmSet(java.lang.String r7, java.lang.Class<E> r8) {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r8 == 0) goto L36
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r7)
            io.realm.DynamicRealmObject$CollectionType r2 = io.realm.DynamicRealmObject.CollectionType.SET
            io.realm.RealmFieldType r2 = r6.primitiveTypeToRealmFieldType(r2, r8)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.Row r3 = r3.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.internal.OsSet r3 = r3.getValueSet(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.RealmSet r4 = new io.realm.RealmSet     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState     // Catch: java.lang.IllegalArgumentException -> L31
            io.realm.BaseRealm r5 = r5.getRealm$realm()     // Catch: java.lang.IllegalArgumentException -> L31
            r4.<init>(r5, r3, r8)     // Catch: java.lang.IllegalArgumentException -> L31
            return r4
        L31:
            r8 = move-exception
            r6.checkFieldType(r7, r0, r2)
            throw r8
        L36:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Non-null 'primitiveType' required."
            r7.<init>(r8)
            throw r7
    }

    public short getShort(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            int r3 = (int) r0
            short r3 = (short) r3
            return r3
    }

    public java.lang.String getString(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState     // Catch: java.lang.IllegalArgumentException -> L1e
            io.realm.internal.Row r2 = r2.getRow$realm()     // Catch: java.lang.IllegalArgumentException -> L1e
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L1e
            return r5
        L1e:
            r2 = move-exception
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.STRING
            r4.checkFieldType(r5, r0, r3)
            throw r2
    }

    public java.lang.String getType() {
            r1 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r0 = r0.getTable()
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public java.util.UUID getUUID(java.lang.String r4) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.UUID
            r3.checkFieldType(r4, r0, r2)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            boolean r4 = r4.isNull(r0)
            if (r4 == 0) goto L26
            r4 = 0
            return r4
        L26:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            java.util.UUID r4 = r4.getUUID(r0)
            return r4
    }

    public boolean hasField(java.lang.String r2) {
            r1 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r2 == 0) goto L1d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            goto L1d
        L12:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            boolean r2 = r0.hasColumn(r2)
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r6 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r6.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            java.lang.String r0 = r0.getPath()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r1 = r6.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.Table r1 = r1.getTable()
            java.lang.String r1 = r1.getName()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getObjectKey()
            r4 = 0
            if (r0 == 0) goto L33
            int r0 = r0.hashCode()
            goto L34
        L33:
            r0 = 0
        L34:
            r5 = 527(0x20f, float:7.38E-43)
            int r5 = r5 + r0
            int r5 = r5 * 31
            if (r1 == 0) goto L3f
            int r4 = r1.hashCode()
        L3f:
            int r5 = r5 + r4
            int r5 = r5 * 31
            r0 = 32
            long r0 = r2 >>> r0
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r5 = r5 + r1
            return r5
    }

    public boolean isNull(java.lang.String r4) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.RealmFieldType r4 = r4.getColumnType(r0)
            int[] r2 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r4 = r4.ordinal()
            r4 = r2[r4]
            switch(r4) {
                case 1: goto L35;
                case 2: goto L35;
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L35;
                case 9: goto L35;
                case 10: goto L35;
                case 11: goto L35;
                case 12: goto L2a;
                default: goto L28;
            }
        L28:
            r4 = 0
            return r4
        L2a:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            boolean r4 = r4.isNullLink(r0)
            return r4
        L35:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r3.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            boolean r4 = r4.isNull(r0)
            return r4
    }

    public io.realm.RealmResults<io.realm.DynamicRealmObject> linkingObjects(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r5.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            io.realm.DynamicRealm r0 = (io.realm.DynamicRealm) r0
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r1 = r5.proxyState
            io.realm.internal.Row r1 = r1.getRow$realm()
            r1.checkIfAttached()
            io.realm.RealmSchema r1 = r0.getSchema()
            io.realm.RealmObjectSchema r1 = r1.get(r6)
            if (r1 == 0) goto L90
            if (r7 == 0) goto L88
            java.lang.String r6 = "."
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L80
            io.realm.RealmFieldType r6 = r1.getFieldType(r7)
            io.realm.RealmFieldType r2 = io.realm.RealmFieldType.OBJECT
            if (r6 == r2) goto L60
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.LIST
            if (r6 != r3) goto L35
            goto L60
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            java.lang.String r6 = r6.name()
            r1[r4] = r6
            r6 = 1
            java.lang.String r4 = "RealmFieldType"
            r1[r6] = r4
            r6 = 2
            java.lang.String r2 = r2.name()
            r1[r6] = r2
            r6 = 3
            java.lang.String r2 = r3.name()
            r1[r6] = r2
            java.lang.String r6 = "Unexpected field type: %1$s. Field type should be either %2$s.%3$s or %2$s.%4$s."
            java.lang.String r6 = java.lang.String.format(r0, r6, r1)
            r7.<init>(r6)
            throw r7
        L60:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r5.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.UncheckedRow r6 = (io.realm.internal.UncheckedRow) r6
            io.realm.internal.Table r1 = r1.table
            int r2 = io.realm.RealmResults.$r8$clinit
            java.lang.String r2 = r1.getName()
            java.lang.String r2 = io.realm.internal.Table.getClassNameForTable(r2)
            io.realm.RealmResults r3 = new io.realm.RealmResults
            io.realm.internal.OsSharedRealm r4 = r0.sharedRealm
            io.realm.internal.OsResults r6 = io.realm.internal.OsResults.createForBacklinks(r4, r6, r1, r7)
            r3.<init>(r0, r6, r2)
            return r3
        L80:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Queries across relationships are not supported"
            r6.<init>(r7)
            throw r6
        L88:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Non-null 'srcFieldName' required."
            r6.<init>(r7)
            throw r6
        L90:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Class not found: "
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
            r0 = this;
            return
    }

    @Override // io.realm.internal.RealmObjectProxy
    public io.realm.ProxyState realmGet$proxyState() {
            r1 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r1.proxyState
            return r0
    }

    public void set(java.lang.String r6, java.lang.Object r7) {
            r5 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r5.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L11
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            goto L12
        L11:
            r1 = 0
        L12:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r5.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            long r2 = r2.getColumnKey(r6)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r4 = r5.proxyState
            io.realm.internal.Row r4 = r4.getRow$realm()
            io.realm.RealmFieldType r2 = r4.getColumnType(r2)
            if (r0 == 0) goto L8b
            io.realm.RealmFieldType r0 = io.realm.RealmFieldType.STRING
            if (r2 == r0) goto L8b
            int[] r0 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L83;
                case 2: goto L7a;
                case 3: goto L71;
                case 4: goto L68;
                case 5: goto L37;
                case 6: goto L37;
                case 7: goto L63;
                case 8: goto L5e;
                case 9: goto L58;
                case 10: goto L53;
                case 11: goto L4e;
                default: goto L37;
            }
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r7
            java.lang.String r6 = "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead"
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
        L4e:
            java.util.UUID r7 = java.util.UUID.fromString(r1)
            goto L8b
        L53:
            io.realm.RealmAny r7 = io.realm.RealmAny.valueOf(r1)
            goto L8b
        L58:
            org.bson.types.ObjectId r7 = new org.bson.types.ObjectId
            r7.<init>(r1)
            goto L8b
        L5e:
            org.bson.types.Decimal128 r7 = org.bson.types.Decimal128.parse(r1)
            goto L8b
        L63:
            java.util.Date r7 = io.realm.internal.android.JsonUtils.stringToDate(r1)
            goto L8b
        L68:
            double r0 = java.lang.Double.parseDouble(r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            goto L8b
        L71:
            float r7 = java.lang.Float.parseFloat(r1)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L8b
        L7a:
            long r0 = java.lang.Long.parseLong(r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L8b
        L83:
            boolean r7 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L8b:
            if (r7 != 0) goto L91
            r5.setNull(r6)
            goto L94
        L91:
            r5.setValue(r6, r7)
        L94:
            return
    }

    public void setBlob(java.lang.String r3, @javax.annotation.Nullable byte[] r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setBinaryByteArray(r0, r4)
            return
    }

    public void setBoolean(java.lang.String r3, boolean r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setBoolean(r0, r4)
            return
    }

    public void setByte(java.lang.String r5, byte r6) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            r4.checkIsPrimaryKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            long r2 = (long) r6
            r5.setLong(r0, r2)
            return
    }

    public void setDate(java.lang.String r3, @javax.annotation.Nullable java.util.Date r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            if (r4 != 0) goto L1f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setNull(r0)
            goto L28
        L1f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setDate(r0, r4)
        L28:
            return
    }

    public void setDecimal128(java.lang.String r3, @javax.annotation.Nullable org.bson.types.Decimal128 r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            if (r4 != 0) goto L1f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setNull(r0)
            goto L28
        L1f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setDecimal128(r0, r4)
        L28:
            return
    }

    public <E> void setDictionary(java.lang.String r4, io.realm.RealmDictionary<E> r5) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r5 == 0) goto L47
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r3.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.RealmFieldType r0 = r2.getColumnType(r0)
            int[] r1 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 14: goto L43;
                case 15: goto L43;
                case 16: goto L43;
                case 17: goto L43;
                case 18: goto L43;
                case 19: goto L43;
                case 20: goto L43;
                case 21: goto L43;
                case 22: goto L43;
                case 23: goto L43;
                case 24: goto L43;
                case 25: goto L3f;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            java.lang.String r4 = "Field '%s' is not a dictionary but a %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r5.<init>(r4)
            throw r5
        L3f:
            r3.setModelDictionary(r4, r5)
            goto L46
        L43:
            r3.setValueDictionary(r4, r5, r0)
        L46:
            return
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Non-null 'dictionary' required"
            r4.<init>(r5)
            throw r4
    }

    public void setDouble(java.lang.String r3, double r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setDouble(r0, r4)
            return
    }

    public void setFloat(java.lang.String r3, float r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setFloat(r0, r4)
            return
    }

    public void setInt(java.lang.String r5, int r6) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            r4.checkIsPrimaryKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            long r2 = (long) r6
            r5.setLong(r0, r2)
            return
    }

    public <E> void setList(java.lang.String r4, io.realm.RealmList<E> r5) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r5 == 0) goto L6e
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r3.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.RealmFieldType r0 = r2.getColumnType(r0)
            int[] r1 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 13
            if (r1 == r2) goto L47
            switch(r1) {
                case 39: goto L43;
                case 40: goto L43;
                case 41: goto L43;
                case 42: goto L43;
                case 43: goto L43;
                case 44: goto L43;
                case 45: goto L43;
                case 46: goto L43;
                case 47: goto L43;
                case 48: goto L43;
                case 49: goto L43;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            java.lang.String r4 = "Field '%s' is not a list but a %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r5.<init>(r4)
            throw r5
        L43:
            r3.setValueList(r4, r5, r0)
            goto L6d
        L47:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L6a
            java.lang.Object r0 = r5.first()
            boolean r1 = r0 instanceof io.realm.DynamicRealmObject
            if (r1 != 0) goto L6a
            java.lang.Class<io.realm.RealmModel> r1 = io.realm.RealmModel.class
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L62
            goto L6a
        L62:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "RealmList must contain `DynamicRealmObject's, not Java model classes."
            r4.<init>(r5)
            throw r4
        L6a:
            r3.setModelList(r4, r5)
        L6d:
            return
        L6e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Non-null 'list' required"
            r4.<init>(r5)
            throw r4
    }

    public void setLong(java.lang.String r3, long r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            r2.checkIsPrimaryKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setLong(r0, r4)
            return
    }

    public void setNull(java.lang.String r5) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r4.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.RealmFieldType r2 = r2.getColumnType(r0)
            io.realm.RealmFieldType r3 = io.realm.RealmFieldType.OBJECT
            if (r2 != r3) goto L2b
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            r5.nullifyLink(r0)
            goto L37
        L2b:
            r4.checkIsPrimaryKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            r5.setNull(r0)
        L37:
            return
    }

    public void setObject(java.lang.String r5, @javax.annotation.Nullable io.realm.DynamicRealmObject r6) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            if (r6 != 0) goto L1f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            r5.nullifyLink(r0)
            goto L6e
        L1f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState
            io.realm.BaseRealm r5 = r5.getRealm$realm()
            if (r5 == 0) goto L96
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r6.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            if (r5 == 0) goto L96
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.BaseRealm r5 = r5.getRealm$realm()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState
            io.realm.BaseRealm r2 = r2.getRealm$realm()
            if (r5 != r2) goto L8e
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            io.realm.internal.Table r5 = r5.getTable()
            io.realm.internal.Table r5 = r5.getLinkTarget(r0)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r6.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.Table r2 = r2.getTable()
            boolean r3 = r5.hasSameSchema(r2)
            if (r3 == 0) goto L6f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r6.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            long r2 = r6.getObjectKey()
            r5.setLink(r0, r2)
        L6e:
            return
        L6f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            java.lang.String r2 = r2.getName()
            r1[r3] = r2
            r2 = 1
            java.lang.String r5 = r5.getName()
            r1[r2] = r5
            java.lang.String r5 = "Type of object is wrong. Was %s, expected %s"
            java.lang.String r5 = java.lang.String.format(r0, r5, r1)
            r6.<init>(r5)
            throw r6
        L8e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Cannot add an object from another Realm instance."
            r5.<init>(r6)
            throw r5
        L96:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Cannot link to objects that are not part of the Realm."
            r5.<init>(r6)
            throw r5
    }

    public void setObjectId(java.lang.String r3, @javax.annotation.Nullable org.bson.types.ObjectId r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            if (r4 != 0) goto L1f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setNull(r0)
            goto L28
        L1f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setObjectId(r0, r4)
        L28:
            return
    }

    public void setRealmAny(java.lang.String r5, @javax.annotation.Nullable io.realm.RealmAny r6) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            if (r6 != 0) goto L1f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            r5.setNull(r0)
            goto L2c
        L1f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            long r2 = r6.getNativePtr()
            r5.setRealmAny(r0, r2)
        L2c:
            return
    }

    public <E> void setRealmSet(java.lang.String r4, io.realm.RealmSet<E> r5) {
            r3 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            if (r5 == 0) goto L47
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r3.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r4)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r2 = r3.proxyState
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.RealmFieldType r0 = r2.getColumnType(r0)
            int[] r1 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 26: goto L43;
                case 27: goto L43;
                case 28: goto L43;
                case 29: goto L43;
                case 30: goto L43;
                case 31: goto L43;
                case 32: goto L43;
                case 33: goto L43;
                case 34: goto L43;
                case 35: goto L43;
                case 36: goto L3f;
                case 37: goto L43;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            java.lang.String r4 = "Field '%s' is not a set but a %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r5.<init>(r4)
            throw r5
        L3f:
            r3.setModelSet(r4, r5)
            goto L46
        L43:
            r3.setValueSet(r4, r5, r0)
        L46:
            return
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Non-null 'set' required"
            r4.<init>(r5)
            throw r4
    }

    public void setShort(java.lang.String r5, short r6) {
            r4 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            r4.checkIsPrimaryKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r4.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r5)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r4.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            long r2 = (long) r6
            r5.setLong(r0, r2)
            return
    }

    public void setString(java.lang.String r3, @javax.annotation.Nullable java.lang.String r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            r2.checkIsPrimaryKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setString(r0, r4)
            return
    }

    public void setUUID(java.lang.String r3, @javax.annotation.Nullable java.util.UUID r4) {
            r2 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r2.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            long r0 = r0.getColumnKey(r3)
            if (r4 != 0) goto L1f
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setNull(r0)
            goto L28
        L1f:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r3 = r2.proxyState
            io.realm.internal.Row r3 = r3.getRow$realm()
            r3.setUUID(r0, r4)
        L28:
            return
    }

    public java.lang.String toString() {
            r12 = this;
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r12.proxyState
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            r0.checkIfValid()
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r12.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L18
            java.lang.String r0 = "Invalid object"
            return r0
        L18:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r0 = r12.proxyState
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.Table r0 = r0.getTable()
            java.lang.String r0 = r0.getClassName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " = dynamic["
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            r1.<init>(r0)
            java.lang.String[] r0 = r12.getFieldNames()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L38:
            r5 = 1
            if (r4 >= r2) goto L6ed
            r6 = r0[r4]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r7 = r12.proxyState
            io.realm.internal.Row r7 = r7.getRow$realm()
            long r7 = r7.getColumnKey(r6)
            io.realm.ProxyState<io.realm.DynamicRealmObject> r9 = r12.proxyState
            io.realm.internal.Row r9 = r9.getRow$realm()
            io.realm.RealmFieldType r9 = r9.getColumnType(r7)
            java.lang.String r10 = "{"
            r1.append(r10)
            r1.append(r6)
            java.lang.String r6 = ":"
            r1.append(r6)
            int[] r6 = io.realm.DynamicRealmObject.AnonymousClass1.$SwitchMap$io$realm$RealmFieldType
            int r10 = r9.ordinal()
            r6 = r6[r10]
            r10 = 2
            java.lang.String r11 = "null"
            switch(r6) {
                case 1: goto L6c5;
                case 2: goto L6a6;
                case 3: goto L687;
                case 4: goto L668;
                case 5: goto L659;
                case 6: goto L646;
                case 7: goto L62a;
                case 8: goto L60e;
                case 9: goto L5f2;
                case 10: goto L5dc;
                case 11: goto L5c0;
                case 12: goto L59c;
                case 13: goto L565;
                case 14: goto L542;
                case 15: goto L51f;
                case 16: goto L4fc;
                case 17: goto L4d9;
                case 18: goto L4b6;
                case 19: goto L493;
                case 20: goto L470;
                case 21: goto L44d;
                case 22: goto L42a;
                case 23: goto L407;
                case 24: goto L3e4;
                case 25: goto L3ad;
                case 26: goto L38a;
                case 27: goto L367;
                case 28: goto L344;
                case 29: goto L321;
                case 30: goto L2fe;
                case 31: goto L2db;
                case 32: goto L2b8;
                case 33: goto L295;
                case 34: goto L272;
                case 35: goto L24f;
                case 36: goto L218;
                case 37: goto L1f5;
                case 38: goto L6d;
                case 39: goto L1d2;
                case 40: goto L1af;
                case 41: goto L18c;
                case 42: goto L169;
                case 43: goto L146;
                case 44: goto L123;
                case 45: goto L100;
                case 46: goto Ldd;
                case 47: goto Lba;
                case 48: goto L97;
                case 49: goto L74;
                default: goto L6d;
            }
        L6d:
            java.lang.String r5 = "?"
            r1.append(r5)
            goto L6e3
        L74:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<RealmAny>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L97:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<UUID>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        Lba:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<ObjectId>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        Ldd:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Decimal128>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L100:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Double>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L123:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Float>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L146:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Date>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L169:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<byte[]>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L18c:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<String>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L1af:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Boolean>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L1d2:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsList r7 = r10.getValueList(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Long>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L1f5:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<RealmAny>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L218:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r12.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.Table r6 = r6.getTable()
            io.realm.internal.Table r6 = r6.getLinkTarget(r7)
            java.lang.String r6 = r6.getClassName()
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r6
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r12.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.OsSet r6 = r6.getModelSet(r7)
            long r6 = r6.size()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r10[r5] = r6
            java.lang.String r5 = "RealmSet<%s>[%s]"
            java.lang.String r5 = java.lang.String.format(r9, r5, r10)
            r1.append(r5)
            goto L6e3
        L24f:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<UUID>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L272:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<ObjectId>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L295:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<Decimal128>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L2b8:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<Double>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L2db:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<Float>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L2fe:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<Date>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L321:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<byte[]>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L344:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<String>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L367:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<Boolean>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L38a:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsSet r7 = r10.getValueSet(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmSet<Long>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L3ad:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r12.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.Table r6 = r6.getTable()
            io.realm.internal.Table r6 = r6.getLinkTarget(r7)
            java.lang.String r6 = r6.getClassName()
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r6
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r12.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.OsMap r6 = r6.getModelMap(r7)
            long r6 = r6.size()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r10[r5] = r6
            java.lang.String r5 = "RealmDictionary<%s>[%s]"
            java.lang.String r5 = java.lang.String.format(r9, r5, r10)
            r1.append(r5)
            goto L6e3
        L3e4:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<RealmAny>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L407:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<UUID>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L42a:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<ObjectId>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L44d:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<Decimal128>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L470:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<Double>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L493:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<Float>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L4b6:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<Date>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L4d9:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<byte[]>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L4fc:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<String>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L51f:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<Boolean>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L542:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.ProxyState<io.realm.DynamicRealmObject> r10 = r12.proxyState
            io.realm.internal.Row r10 = r10.getRow$realm()
            io.realm.internal.OsMap r7 = r10.getValueMap(r7, r9)
            long r7 = r7.size()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmDictionary<Long>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            r1.append(r5)
            goto L6e3
        L565:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r12.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.Table r6 = r6.getTable()
            io.realm.internal.Table r6 = r6.getLinkTarget(r7)
            java.lang.String r6 = r6.getClassName()
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r6
            io.realm.ProxyState<io.realm.DynamicRealmObject> r6 = r12.proxyState
            io.realm.internal.Row r6 = r6.getRow$realm()
            io.realm.internal.OsList r6 = r6.getModelList(r7)
            long r6 = r6.size()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r10[r5] = r6
            java.lang.String r5 = "RealmList<%s>[%s]"
            java.lang.String r5 = java.lang.String.format(r9, r5, r10)
            r1.append(r5)
            goto L6e3
        L59c:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNullLink(r7)
            if (r5 == 0) goto L5a9
            goto L5bb
        L5a9:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            io.realm.internal.Table r5 = r5.getTable()
            io.realm.internal.Table r5 = r5.getLinkTarget(r7)
            java.lang.String r11 = r5.getClassName()
        L5bb:
            r1.append(r11)
            goto L6e3
        L5c0:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L5cd
            goto L5d7
        L5cd:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            java.util.UUID r11 = r5.getUUID(r7)
        L5d7:
            r1.append(r11)
            goto L6e3
        L5dc:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L5e9
            goto L5ed
        L5e9:
            io.realm.RealmAny r11 = r12.getRealmAny(r7)
        L5ed:
            r1.append(r11)
            goto L6e3
        L5f2:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L5ff
            goto L609
        L5ff:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            org.bson.types.ObjectId r11 = r5.getObjectId(r7)
        L609:
            r1.append(r11)
            goto L6e3
        L60e:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L61b
            goto L625
        L61b:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            org.bson.types.Decimal128 r11 = r5.getDecimal128(r7)
        L625:
            r1.append(r11)
            goto L6e3
        L62a:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L637
            goto L641
        L637:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            java.util.Date r11 = r5.getDate(r7)
        L641:
            r1.append(r11)
            goto L6e3
        L646:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            byte[] r5 = r5.getBinaryByteArray(r7)
            java.lang.String r5 = java.util.Arrays.toString(r5)
            r1.append(r5)
            goto L6e3
        L659:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            java.lang.String r5 = r5.getString(r7)
            r1.append(r5)
            goto L6e3
        L668:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L675
            goto L683
        L675:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            double r5 = r5.getDouble(r7)
            java.lang.Double r11 = java.lang.Double.valueOf(r5)
        L683:
            r1.append(r11)
            goto L6e3
        L687:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L694
            goto L6a2
        L694:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            float r5 = r5.getFloat(r7)
            java.lang.Float r11 = java.lang.Float.valueOf(r5)
        L6a2:
            r1.append(r11)
            goto L6e3
        L6a6:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L6b3
            goto L6c1
        L6b3:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            long r5 = r5.getLong(r7)
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
        L6c1:
            r1.append(r11)
            goto L6e3
        L6c5:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.isNull(r7)
            if (r5 == 0) goto L6d2
            goto L6e0
        L6d2:
            io.realm.ProxyState<io.realm.DynamicRealmObject> r5 = r12.proxyState
            io.realm.internal.Row r5 = r5.getRow$realm()
            boolean r5 = r5.getBoolean(r7)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
        L6e0:
            r1.append(r11)
        L6e3:
            java.lang.String r5 = "},"
            r1.append(r5)
            int r4 = r4 + 1
            goto L38
        L6ed:
            int r0 = r1.length()
            int r0 = r0 - r5
            int r2 = r1.length()
            java.lang.String r3 = ""
            r1.replace(r0, r2, r3)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
