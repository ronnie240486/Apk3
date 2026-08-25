package io.realm.internal.objectstore;

/* JADX INFO: loaded from: classes.dex */
public class OsObjectBuilder implements java.io.Closeable {
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, byte[]>> binaryMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<byte[]> binarySetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Boolean> booleanItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Boolean>> booleanMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Boolean> booleanSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<byte[]> byteArrayItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Byte> byteItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Byte>> byteMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Byte> byteSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Date> dateItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.util.Date>> dateMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Date> dateSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<org.bson.types.Decimal128> decimal128ItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, org.bson.types.Decimal128>> decimal128MapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<org.bson.types.Decimal128> decimal128SetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Double> doubleItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Double>> doubleMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Double> doubleSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Float> floatItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Float>> floatMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Float> floatSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Integer> integerItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Integer>> integerMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Integer> integerSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Long> longItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Long>> longMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Long> longSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<io.realm.MutableRealmInteger> mutableRealmIntegerItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<org.bson.types.ObjectId> objectIdItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, org.bson.types.ObjectId>> objectIdMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<org.bson.types.ObjectId> objectIdSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<? extends io.realm.RealmModel> objectItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<io.realm.RealmAny> realmAnyItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, io.realm.RealmAny>> realmAnyMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<io.realm.RealmAny> realmAnySetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Short> shortItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.Short>> shortMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.Short> shortSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.String> stringItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.lang.String>> stringMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.lang.String> stringSetItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.UUID> uuidItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, java.util.UUID>> uuidMapItemCallback;
    private static io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.UUID> uuidSetItemCallback;
    private final long builderPtr;
    private final io.realm.internal.NativeContext context;
    private final boolean ignoreFieldsWithSameValue;
    private final long sharedRealmPtr;
    private final io.realm.internal.Table table;
    private final long tablePtr;













































    public interface ItemCallback<T> {
        void handleItem(long r1, T r3);
    }

    static {
            io.realm.internal.objectstore.OsObjectBuilder$1 r0 = new io.realm.internal.objectstore.OsObjectBuilder$1
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.objectItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$2 r0 = new io.realm.internal.objectstore.OsObjectBuilder$2
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.stringItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$3 r0 = new io.realm.internal.objectstore.OsObjectBuilder$3
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.byteItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$4 r0 = new io.realm.internal.objectstore.OsObjectBuilder$4
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.shortItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$5 r0 = new io.realm.internal.objectstore.OsObjectBuilder$5
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.integerItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$6 r0 = new io.realm.internal.objectstore.OsObjectBuilder$6
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.longItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$7 r0 = new io.realm.internal.objectstore.OsObjectBuilder$7
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.booleanItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$8 r0 = new io.realm.internal.objectstore.OsObjectBuilder$8
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.floatItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$9 r0 = new io.realm.internal.objectstore.OsObjectBuilder$9
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.doubleItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$10 r0 = new io.realm.internal.objectstore.OsObjectBuilder$10
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.dateItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$11 r0 = new io.realm.internal.objectstore.OsObjectBuilder$11
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.byteArrayItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$12 r0 = new io.realm.internal.objectstore.OsObjectBuilder$12
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.mutableRealmIntegerItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$13 r0 = new io.realm.internal.objectstore.OsObjectBuilder$13
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.decimal128ItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$14 r0 = new io.realm.internal.objectstore.OsObjectBuilder$14
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.objectIdItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$15 r0 = new io.realm.internal.objectstore.OsObjectBuilder$15
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.uuidItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$16 r0 = new io.realm.internal.objectstore.OsObjectBuilder$16
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.booleanMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$17 r0 = new io.realm.internal.objectstore.OsObjectBuilder$17
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.stringMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$18 r0 = new io.realm.internal.objectstore.OsObjectBuilder$18
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.integerMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$19 r0 = new io.realm.internal.objectstore.OsObjectBuilder$19
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.floatMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$20 r0 = new io.realm.internal.objectstore.OsObjectBuilder$20
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.longMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$21 r0 = new io.realm.internal.objectstore.OsObjectBuilder$21
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.shortMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$22 r0 = new io.realm.internal.objectstore.OsObjectBuilder$22
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.byteMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$23 r0 = new io.realm.internal.objectstore.OsObjectBuilder$23
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.doubleMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$24 r0 = new io.realm.internal.objectstore.OsObjectBuilder$24
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.binaryMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$25 r0 = new io.realm.internal.objectstore.OsObjectBuilder$25
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.dateMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$26 r0 = new io.realm.internal.objectstore.OsObjectBuilder$26
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.decimal128MapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$27 r0 = new io.realm.internal.objectstore.OsObjectBuilder$27
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.objectIdMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$28 r0 = new io.realm.internal.objectstore.OsObjectBuilder$28
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.uuidMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$29 r0 = new io.realm.internal.objectstore.OsObjectBuilder$29
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.realmAnyMapItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$30 r0 = new io.realm.internal.objectstore.OsObjectBuilder$30
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.realmAnyItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$31 r0 = new io.realm.internal.objectstore.OsObjectBuilder$31
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.stringSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$32 r0 = new io.realm.internal.objectstore.OsObjectBuilder$32
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.booleanSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$33 r0 = new io.realm.internal.objectstore.OsObjectBuilder$33
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.integerSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$34 r0 = new io.realm.internal.objectstore.OsObjectBuilder$34
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.longSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$35 r0 = new io.realm.internal.objectstore.OsObjectBuilder$35
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.shortSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$36 r0 = new io.realm.internal.objectstore.OsObjectBuilder$36
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.byteSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$37 r0 = new io.realm.internal.objectstore.OsObjectBuilder$37
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.floatSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$38 r0 = new io.realm.internal.objectstore.OsObjectBuilder$38
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.doubleSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$39 r0 = new io.realm.internal.objectstore.OsObjectBuilder$39
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.binarySetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$40 r0 = new io.realm.internal.objectstore.OsObjectBuilder$40
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.dateSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$41 r0 = new io.realm.internal.objectstore.OsObjectBuilder$41
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.decimal128SetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$42 r0 = new io.realm.internal.objectstore.OsObjectBuilder$42
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.objectIdSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$43 r0 = new io.realm.internal.objectstore.OsObjectBuilder$43
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.uuidSetItemCallback = r0
            io.realm.internal.objectstore.OsObjectBuilder$44 r0 = new io.realm.internal.objectstore.OsObjectBuilder$44
            r0.<init>()
            io.realm.internal.objectstore.OsObjectBuilder.realmAnySetItemCallback = r0
            return
    }

    public OsObjectBuilder(io.realm.internal.Table r4, java.util.Set<io.realm.ImportFlag> r5) {
            r3 = this;
            r3.<init>()
            io.realm.internal.OsSharedRealm r0 = r4.getSharedRealm()
            long r1 = r0.getNativePtr()
            r3.sharedRealmPtr = r1
            r3.table = r4
            r4.getColumnNames()
            long r1 = r4.getNativePtr()
            r3.tablePtr = r1
            long r1 = nativeCreateBuilder()
            r3.builderPtr = r1
            io.realm.internal.NativeContext r4 = r0.context
            r3.context = r4
            io.realm.ImportFlag r4 = io.realm.ImportFlag.CHECK_SAME_VALUES_BEFORE_SET
            boolean r4 = r5.contains(r4)
            r3.ignoreFieldsWithSameValue = r4
            return
    }

    public static /* synthetic */ void access$000(long r0, long r2) {
            nativeAddIntegerListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$100(long r0, java.lang.String r2) {
            nativeAddStringListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$1000(long r0, java.lang.String r2) {
            nativeAddUUIDListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$1100(long r0, java.lang.String r2, boolean r3) {
            nativeAddBooleanDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1200(long r0, java.lang.String r2, java.lang.String r3) {
            nativeAddStringDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1300(long r0, java.lang.String r2, long r3) {
            nativeAddIntegerDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1400(long r0, java.lang.String r2, float r3) {
            nativeAddFloatDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1500(long r0, java.lang.String r2, double r3) {
            nativeAddDoubleDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1600(long r0, java.lang.String r2, byte[] r3) {
            nativeAddBinaryDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1700(long r0, java.lang.String r2, long r3) {
            nativeAddDateDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$1800(long r0, java.lang.String r2, long r3, long r5) {
            nativeAddDecimal128DictionaryEntry(r0, r2, r3, r5)
            return
    }

    public static /* synthetic */ void access$1900(long r0, java.lang.String r2, java.lang.String r3) {
            nativeAddObjectIdDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$200(long r0, boolean r2) {
            nativeAddBooleanListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2000(long r0, java.lang.String r2, java.lang.String r3) {
            nativeAddUUIDDictionaryEntry(r0, r2, r3)
            return
    }

    public static /* synthetic */ void access$2100(long r0, java.lang.String r2) {
            nativeAddStringSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2200(long r0, boolean r2) {
            nativeAddBooleanSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2300(long r0, long r2) {
            nativeAddIntegerSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2400(long r0, float r2) {
            nativeAddFloatSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2500(long r0, double r2) {
            nativeAddDoubleSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2600(long r0, byte[] r2) {
            nativeAddByteArraySetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2700(long r0, long r2) {
            nativeAddDateSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$2800(long r0, long r2, long r4) {
            nativeAddDecimal128SetItem(r0, r2, r4)
            return
    }

    public static /* synthetic */ void access$2900(long r0, java.lang.String r2) {
            nativeAddObjectIdSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$300(long r0, float r2) {
            nativeAddFloatListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$3000(long r0, java.lang.String r2) {
            nativeAddUUIDSetItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$400(long r0, double r2) {
            nativeAddDoubleListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$500(long r0, long r2) {
            nativeAddDateListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$600(long r0, byte[] r2) {
            nativeAddByteArrayListItem(r0, r2)
            return
    }

    public static /* synthetic */ void access$700(long r0) {
            nativeAddNullListItem(r0)
            return
    }

    public static /* synthetic */ void access$800(long r0, long r2, long r4) {
            nativeAddDecimal128ListItem(r0, r2, r4)
            return
    }

    public static /* synthetic */ void access$900(long r0, java.lang.String r2) {
            nativeAddObjectIdListItem(r0, r2)
            return
    }

    private <T> void addDictionaryItem(long r7, long r9, @javax.annotation.Nullable io.realm.RealmDictionary<T> r11, io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<java.util.Map.Entry<java.lang.String, T>> r12) {
            r6 = this;
            if (r11 == 0) goto L34
            long r4 = nativeStartDictionary()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Le:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            if (r1 != 0) goto L2a
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            nativeAddNullDictionaryEntry(r4, r0)
            goto Le
        L2a:
            r12.handleItem(r4, r0)
            goto Le
        L2e:
            r0 = r7
            r2 = r9
            nativeStopDictionary(r0, r2, r4)
            goto L37
        L34:
            r6.addEmptyDictionary(r9)
        L37:
            return
    }

    private void addEmptyDictionary(long r7) {
            r6 = this;
            long r0 = r6.builderPtr
            long r4 = nativeStartDictionary()
            r2 = r7
            nativeStopDictionary(r0, r2, r4)
            return
    }

    private void addEmptyList(long r9) {
            r8 = this;
            r0 = 0
            long r6 = nativeStartList(r0)
            long r2 = r8.builderPtr
            r4 = r9
            nativeStopList(r2, r4, r6)
            return
    }

    private void addEmptySet(long r7) {
            r6 = this;
            long r0 = r6.builderPtr
            r2 = 0
            long r4 = nativeStartSet(r2)
            r2 = r7
            nativeStopSet(r0, r2, r4)
            return
    }

    private <T> void addListItem(long r9, long r11, @javax.annotation.Nullable java.util.List<T> r13, io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<T> r14) {
            r8 = this;
            if (r13 == 0) goto L44
            int r0 = r13.size()
            long r0 = (long) r0
            long r6 = nativeStartList(r0)
            r0 = 0
            r2 = 0
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 == 0) goto L1d
            io.realm.internal.Table r0 = r8.table
            boolean r0 = r0.isColumnNullable(r11)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            int r1 = r13.size()
            if (r2 >= r1) goto L3e
            java.lang.Object r1 = r13.get(r2)
            if (r1 != 0) goto L38
            if (r0 == 0) goto L30
            nativeAddNullListItem(r6)
            goto L3b
        L30:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "This 'RealmList' is not nullable. A non-null value is expected."
            r9.<init>(r10)
            throw r9
        L38:
            r14.handleItem(r6, r1)
        L3b:
            int r2 = r2 + 1
            goto L1e
        L3e:
            r2 = r9
            r4 = r11
            nativeStopList(r2, r4, r6)
            goto L47
        L44:
            r8.addEmptyList(r11)
        L47:
            return
    }

    private <T> void addSetItem(long r9, long r11, @javax.annotation.Nullable java.util.Set<T> r13, io.realm.internal.objectstore.OsObjectBuilder.ItemCallback<T> r14) {
            r8 = this;
            if (r13 == 0) goto L45
            int r0 = r13.size()
            long r0 = (long) r0
            long r6 = nativeStartSet(r0)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L1c
            io.realm.internal.Table r0 = r8.table
            boolean r0 = r0.isColumnNullable(r11)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            java.util.Iterator r13 = r13.iterator()
        L21:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r13.next()
            if (r1 != 0) goto L3b
            if (r0 == 0) goto L33
            nativeAddNullSetItem(r6)
            goto L21
        L33:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "This 'RealmSet' is not nullable. A non-null value is expected."
            r9.<init>(r10)
            throw r9
        L3b:
            r14.handleItem(r6, r1)
            goto L21
        L3f:
            r2 = r9
            r4 = r11
            nativeStopSet(r2, r4, r6)
            goto L48
        L45:
            r8.addEmptySet(r11)
        L48:
            return
    }

    private static native void nativeAddBinaryDictionaryEntry(long r0, java.lang.String r2, byte[] r3);

    private static native void nativeAddBoolean(long r0, long r2, boolean r4);

    private static native void nativeAddBooleanDictionaryEntry(long r0, java.lang.String r2, boolean r3);

    private static native void nativeAddBooleanListItem(long r0, boolean r2);

    private static native void nativeAddBooleanSetItem(long r0, boolean r2);

    private static native void nativeAddByteArray(long r0, long r2, byte[] r4);

    private static native void nativeAddByteArrayListItem(long r0, byte[] r2);

    private static native void nativeAddByteArraySetItem(long r0, byte[] r2);

    private static native void nativeAddDate(long r0, long r2, long r4);

    private static native void nativeAddDateDictionaryEntry(long r0, java.lang.String r2, long r3);

    private static native void nativeAddDateListItem(long r0, long r2);

    private static native void nativeAddDateSetItem(long r0, long r2);

    private static native void nativeAddDecimal128(long r0, long r2, long r4, long r6);

    private static native void nativeAddDecimal128DictionaryEntry(long r0, java.lang.String r2, long r3, long r5);

    private static native void nativeAddDecimal128ListItem(long r0, long r2, long r4);

    private static native void nativeAddDecimal128SetItem(long r0, long r2, long r4);

    private static native void nativeAddDouble(long r0, long r2, double r4);

    private static native void nativeAddDoubleDictionaryEntry(long r0, java.lang.String r2, double r3);

    private static native void nativeAddDoubleListItem(long r0, double r2);

    private static native void nativeAddDoubleSetItem(long r0, double r2);

    private static native void nativeAddFloat(long r0, long r2, float r4);

    private static native void nativeAddFloatDictionaryEntry(long r0, java.lang.String r2, float r3);

    private static native void nativeAddFloatListItem(long r0, float r2);

    private static native void nativeAddFloatSetItem(long r0, float r2);

    private static native void nativeAddInteger(long r0, long r2, long r4);

    private static native void nativeAddIntegerDictionaryEntry(long r0, java.lang.String r2, long r3);

    private static native void nativeAddIntegerListItem(long r0, long r2);

    private static native void nativeAddIntegerSetItem(long r0, long r2);

    private static native void nativeAddNull(long r0, long r2);

    private static native void nativeAddNullDictionaryEntry(long r0, java.lang.String r2);

    private static native void nativeAddNullListItem(long r0);

    private static native void nativeAddNullSetItem(long r0);

    private static native void nativeAddObject(long r0, long r2, long r4);

    private static native void nativeAddObjectDictionaryEntry(long r0, java.lang.String r2, long r3);

    private static native void nativeAddObjectId(long r0, long r2, java.lang.String r4);

    private static native void nativeAddObjectIdDictionaryEntry(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativeAddObjectIdListItem(long r0, java.lang.String r2);

    private static native void nativeAddObjectIdSetItem(long r0, java.lang.String r2);

    private static native void nativeAddObjectList(long r0, long r2, long[] r4);

    private static native void nativeAddObjectListItem(long r0, long r2);

    private static native void nativeAddRealmAny(long r0, long r2, long r4);

    public static native void nativeAddRealmAnyDictionaryEntry(long r0, java.lang.String r2, long r3);

    public static native void nativeAddRealmAnyListItem(long r0, long r2);

    private static native void nativeAddString(long r0, long r2, java.lang.String r4);

    private static native void nativeAddStringDictionaryEntry(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativeAddStringListItem(long r0, java.lang.String r2);

    private static native void nativeAddStringSetItem(long r0, java.lang.String r2);

    private static native void nativeAddUUID(long r0, long r2, java.lang.String r4);

    private static native void nativeAddUUIDDictionaryEntry(long r0, java.lang.String r2, java.lang.String r3);

    private static native void nativeAddUUIDListItem(long r0, java.lang.String r2);

    private static native void nativeAddUUIDSetItem(long r0, java.lang.String r2);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long r0, long r2, long r4, boolean r6, boolean r7);

    private static native void nativeDestroyBuilder(long r0);

    private static native long nativeStartDictionary();

    private static native long nativeStartList(long r0);

    private static native long nativeStartSet(long r0);

    private static native void nativeStopDictionary(long r0, long r2, long r4);

    private static native void nativeStopList(long r0, long r2, long r4);

    private static native void nativeStopSet(long r0, long r2, long r4);

    private static native long nativeUpdateEmbeddedObject(long r0, long r2, long r4, long r6, boolean r8);

    public void addBinarySet(long r8, io.realm.RealmSet<byte[]> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<byte[]> r6 = io.realm.internal.objectstore.OsObjectBuilder.binarySetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addBinaryValueDictionary(long r8, io.realm.RealmDictionary<byte[]> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, byte[]>> r6 = io.realm.internal.objectstore.OsObjectBuilder.binaryMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addBoolean(long r3, @javax.annotation.Nullable java.lang.Boolean r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.builderPtr
            boolean r5 = r5.booleanValue()
            nativeAddBoolean(r0, r3, r5)
        L11:
            return
    }

    public void addBooleanList(long r8, io.realm.RealmList<java.lang.Boolean> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Boolean> r6 = io.realm.internal.objectstore.OsObjectBuilder.booleanItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addBooleanSet(long r8, io.realm.RealmSet<java.lang.Boolean> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Boolean> r6 = io.realm.internal.objectstore.OsObjectBuilder.booleanSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addBooleanValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Boolean> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Boolean>> r6 = io.realm.internal.objectstore.OsObjectBuilder.booleanMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addByteArray(long r3, @javax.annotation.Nullable byte[] r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            goto Ld
        L8:
            long r0 = r2.builderPtr
            nativeAddByteArray(r0, r3, r5)
        Ld:
            return
    }

    public void addByteArrayList(long r8, io.realm.RealmList<byte[]> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<byte[]> r6 = io.realm.internal.objectstore.OsObjectBuilder.byteArrayItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addByteList(long r8, io.realm.RealmList<java.lang.Byte> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Byte> r6 = io.realm.internal.objectstore.OsObjectBuilder.byteItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addByteSet(long r8, io.realm.RealmSet<java.lang.Byte> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Byte> r6 = io.realm.internal.objectstore.OsObjectBuilder.byteSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addByteValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Byte> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Byte>> r6 = io.realm.internal.objectstore.OsObjectBuilder.byteMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addDate(long r9, @javax.annotation.Nullable java.util.Date r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.builderPtr
            nativeAddNull(r0, r9)
            goto L12
        L8:
            long r2 = r8.builderPtr
            long r6 = r11.getTime()
            r4 = r9
            nativeAddDate(r2, r4, r6)
        L12:
            return
    }

    public void addDateList(long r8, io.realm.RealmList<java.util.Date> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Date> r6 = io.realm.internal.objectstore.OsObjectBuilder.dateItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addDateSet(long r8, io.realm.RealmSet<java.util.Date> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Date> r6 = io.realm.internal.objectstore.OsObjectBuilder.dateSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addDateValueDictionary(long r8, io.realm.RealmDictionary<java.util.Date> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.util.Date>> r6 = io.realm.internal.objectstore.OsObjectBuilder.dateMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addDecimal128(long r11, @javax.annotation.Nullable org.bson.types.Decimal128 r13) {
            r10 = this;
            if (r13 != 0) goto L8
            long r0 = r10.builderPtr
            nativeAddNull(r0, r11)
            goto L16
        L8:
            long r2 = r10.builderPtr
            long r6 = r13.getLow()
            long r8 = r13.getHigh()
            r4 = r11
            nativeAddDecimal128(r2, r4, r6, r8)
        L16:
            return
    }

    public void addDecimal128List(long r8, io.realm.RealmList<org.bson.types.Decimal128> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<org.bson.types.Decimal128> r6 = io.realm.internal.objectstore.OsObjectBuilder.decimal128ItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addDecimal128Set(long r8, io.realm.RealmSet<org.bson.types.Decimal128> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<org.bson.types.Decimal128> r6 = io.realm.internal.objectstore.OsObjectBuilder.decimal128SetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addDecimal128ValueDictionary(long r8, io.realm.RealmDictionary<org.bson.types.Decimal128> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, org.bson.types.Decimal128>> r6 = io.realm.internal.objectstore.OsObjectBuilder.decimal128MapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addDouble(long r9, @javax.annotation.Nullable java.lang.Double r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.builderPtr
            nativeAddNull(r0, r9)
            goto L12
        L8:
            long r2 = r8.builderPtr
            double r6 = r11.doubleValue()
            r4 = r9
            nativeAddDouble(r2, r4, r6)
        L12:
            return
    }

    public void addDoubleList(long r8, io.realm.RealmList<java.lang.Double> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Double> r6 = io.realm.internal.objectstore.OsObjectBuilder.doubleItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addDoubleSet(long r8, io.realm.RealmSet<java.lang.Double> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Double> r6 = io.realm.internal.objectstore.OsObjectBuilder.doubleSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addDoubleValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Double> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Double>> r6 = io.realm.internal.objectstore.OsObjectBuilder.doubleMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addFloat(long r3, @javax.annotation.Nullable java.lang.Float r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.builderPtr
            float r5 = r5.floatValue()
            nativeAddFloat(r0, r3, r5)
        L11:
            return
    }

    public void addFloatList(long r8, io.realm.RealmList<java.lang.Float> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Float> r6 = io.realm.internal.objectstore.OsObjectBuilder.floatItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addFloatSet(long r8, io.realm.RealmSet<java.lang.Float> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Float> r6 = io.realm.internal.objectstore.OsObjectBuilder.floatSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addFloatValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Float> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Float>> r6 = io.realm.internal.objectstore.OsObjectBuilder.floatMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addInteger(long r9, @javax.annotation.Nullable java.lang.Byte r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.builderPtr
            nativeAddNull(r0, r9)
            goto L13
        L8:
            long r2 = r8.builderPtr
            byte r11 = r11.byteValue()
            long r6 = (long) r11
            r4 = r9
            nativeAddInteger(r2, r4, r6)
        L13:
            return
    }

    public void addInteger(long r9, @javax.annotation.Nullable java.lang.Integer r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.builderPtr
            nativeAddNull(r0, r9)
            goto L13
        L8:
            long r2 = r8.builderPtr
            int r11 = r11.intValue()
            long r6 = (long) r11
            r4 = r9
            nativeAddInteger(r2, r4, r6)
        L13:
            return
    }

    public void addInteger(long r9, @javax.annotation.Nullable java.lang.Long r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.builderPtr
            nativeAddNull(r0, r9)
            goto L12
        L8:
            long r2 = r8.builderPtr
            long r6 = r11.longValue()
            r4 = r9
            nativeAddInteger(r2, r4, r6)
        L12:
            return
    }

    public void addInteger(long r9, @javax.annotation.Nullable java.lang.Short r11) {
            r8 = this;
            if (r11 != 0) goto L8
            long r0 = r8.builderPtr
            nativeAddNull(r0, r9)
            goto L13
        L8:
            long r2 = r8.builderPtr
            short r11 = r11.shortValue()
            long r6 = (long) r11
            r4 = r9
            nativeAddInteger(r2, r4, r6)
        L13:
            return
    }

    public void addIntegerList(long r8, io.realm.RealmList<java.lang.Integer> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Integer> r6 = io.realm.internal.objectstore.OsObjectBuilder.integerItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addIntegerSet(long r8, io.realm.RealmSet<java.lang.Integer> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Integer> r6 = io.realm.internal.objectstore.OsObjectBuilder.integerSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addIntegerValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Integer> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Integer>> r6 = io.realm.internal.objectstore.OsObjectBuilder.integerMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addLongList(long r8, io.realm.RealmList<java.lang.Long> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Long> r6 = io.realm.internal.objectstore.OsObjectBuilder.longItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addLongSet(long r8, io.realm.RealmSet<java.lang.Long> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Long> r6 = io.realm.internal.objectstore.OsObjectBuilder.longSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addLongValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Long> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Long>> r6 = io.realm.internal.objectstore.OsObjectBuilder.longMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addMutableRealmInteger(long r8, @javax.annotation.Nullable io.realm.MutableRealmInteger r10) {
            r7 = this;
            if (r10 == 0) goto L18
            java.lang.Long r0 = r10.get()
            if (r0 != 0) goto L9
            goto L18
        L9:
            long r1 = r7.builderPtr
            java.lang.Long r10 = r10.get()
            long r5 = r10.longValue()
            r3 = r8
            nativeAddInteger(r1, r3, r5)
            goto L1d
        L18:
            long r0 = r7.builderPtr
            nativeAddNull(r0, r8)
        L1d:
            return
    }

    public void addMutableRealmIntegerList(long r8, io.realm.RealmList<io.realm.MutableRealmInteger> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<io.realm.MutableRealmInteger> r6 = io.realm.internal.objectstore.OsObjectBuilder.mutableRealmIntegerItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addNull(long r3) {
            r2 = this;
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            return
    }

    public void addObject(long r7, @javax.annotation.Nullable io.realm.RealmModel r9) {
            r6 = this;
            if (r9 != 0) goto L8
            long r0 = r6.builderPtr
            nativeAddNull(r0, r7)
            goto L1e
        L8:
            io.realm.internal.RealmObjectProxy r9 = (io.realm.internal.RealmObjectProxy) r9
            io.realm.ProxyState r9 = r9.realmGet$proxyState()
            io.realm.internal.Row r9 = r9.getRow$realm()
            io.realm.internal.UncheckedRow r9 = (io.realm.internal.UncheckedRow) r9
            long r0 = r6.builderPtr
            long r4 = r9.getNativePtr()
            r2 = r7
            nativeAddObject(r0, r2, r4)
        L1e:
            return
    }

    public <T extends io.realm.RealmModel> void addObjectDictionary(long r7, @javax.annotation.Nullable io.realm.RealmDictionary<T> r9) {
            r6 = this;
            if (r9 == 0) goto L4f
            long r4 = nativeStartDictionary()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            if (r1 != 0) goto L2a
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            nativeAddNullDictionaryEntry(r4, r0)
            goto Le
        L2a:
            java.lang.Object r1 = r0.getValue()
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            io.realm.ProxyState r1 = r1.realmGet$proxyState()
            io.realm.internal.Row r1 = r1.getRow$realm()
            io.realm.internal.UncheckedRow r1 = (io.realm.internal.UncheckedRow) r1
            long r1 = r1.getNativePtr()
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            nativeAddObjectDictionaryEntry(r4, r0, r1)
            goto Le
        L48:
            long r0 = r6.builderPtr
            r2 = r7
            nativeStopDictionary(r0, r2, r4)
            goto L52
        L4f:
            r6.addEmptyDictionary(r7)
        L52:
            return
    }

    public void addObjectId(long r3, @javax.annotation.Nullable org.bson.types.ObjectId r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.builderPtr
            java.lang.String r5 = r5.toString()
            nativeAddObjectId(r0, r3, r5)
        L11:
            return
    }

    public void addObjectIdList(long r8, io.realm.RealmList<org.bson.types.ObjectId> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<org.bson.types.ObjectId> r6 = io.realm.internal.objectstore.OsObjectBuilder.objectIdItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addObjectIdSet(long r8, io.realm.RealmSet<org.bson.types.ObjectId> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<org.bson.types.ObjectId> r6 = io.realm.internal.objectstore.OsObjectBuilder.objectIdSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addObjectIdValueDictionary(long r8, io.realm.RealmDictionary<org.bson.types.ObjectId> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, org.bson.types.ObjectId>> r6 = io.realm.internal.objectstore.OsObjectBuilder.objectIdMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public <T extends io.realm.RealmModel> void addObjectList(long r5, @javax.annotation.Nullable io.realm.RealmList<T> r7) {
            r4 = this;
            r0 = 0
            if (r7 == 0) goto L38
            int r1 = r7.size()
            long[] r1 = new long[r1]
        L9:
            int r2 = r7.size()
            if (r0 >= r2) goto L32
            java.lang.Object r2 = r7.get(r0)
            io.realm.internal.RealmObjectProxy r2 = (io.realm.internal.RealmObjectProxy) r2
            if (r2 == 0) goto L2a
            io.realm.ProxyState r2 = r2.realmGet$proxyState()
            io.realm.internal.Row r2 = r2.getRow$realm()
            io.realm.internal.UncheckedRow r2 = (io.realm.internal.UncheckedRow) r2
            long r2 = r2.getNativePtr()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L9
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Null values are not allowed in RealmLists containing Realm models"
            r5.<init>(r6)
            throw r5
        L32:
            long r2 = r4.builderPtr
            nativeAddObjectList(r2, r5, r1)
            goto L3f
        L38:
            long r1 = r4.builderPtr
            long[] r7 = new long[r0]
            nativeAddObjectList(r1, r5, r7)
        L3f:
            return
    }

    public <T extends io.realm.RealmModel> void addObjectSet(long r9, @javax.annotation.Nullable io.realm.RealmSet<T> r11) {
            r8 = this;
            if (r11 == 0) goto L40
            int r0 = r11.size()
            long r0 = (long) r0
            long r6 = nativeStartSet(r0)
            java.util.Iterator r11 = r11.iterator()
        Lf:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r11.next()
            io.realm.RealmModel r0 = (io.realm.RealmModel) r0
            if (r0 == 0) goto L31
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.internal.Row r0 = r0.getRow$realm()
            io.realm.internal.UncheckedRow r0 = (io.realm.internal.UncheckedRow) r0
            long r0 = r0.getNativePtr()
            nativeAddObjectListItem(r6, r0)
            goto Lf
        L31:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "This 'RealmSet' is not nullable. A non-null value is expected."
            r9.<init>(r10)
            throw r9
        L39:
            long r2 = r8.builderPtr
            r4 = r9
            nativeStopSet(r2, r4, r6)
            goto L43
        L40:
            r8.addEmptySet(r9)
        L43:
            return
    }

    public void addRealmAny(long r7, long r9) {
            r6 = this;
            long r0 = r6.builderPtr
            r2 = r7
            r4 = r9
            nativeAddRealmAny(r0, r2, r4)
            return
    }

    public void addRealmAnyList(long r8, io.realm.RealmList<io.realm.RealmAny> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<io.realm.RealmAny> r6 = io.realm.internal.objectstore.OsObjectBuilder.realmAnyItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addRealmAnySet(long r8, io.realm.RealmSet<io.realm.RealmAny> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<io.realm.RealmAny> r6 = io.realm.internal.objectstore.OsObjectBuilder.realmAnySetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addRealmAnyValueDictionary(long r8, io.realm.RealmDictionary<io.realm.RealmAny> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, io.realm.RealmAny>> r6 = io.realm.internal.objectstore.OsObjectBuilder.realmAnyMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addShortList(long r8, io.realm.RealmList<java.lang.Short> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Short> r6 = io.realm.internal.objectstore.OsObjectBuilder.shortItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addShortSet(long r8, io.realm.RealmSet<java.lang.Short> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.Short> r6 = io.realm.internal.objectstore.OsObjectBuilder.shortSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addShortValueDictionary(long r8, io.realm.RealmDictionary<java.lang.Short> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.Short>> r6 = io.realm.internal.objectstore.OsObjectBuilder.shortMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addString(long r3, @javax.annotation.Nullable java.lang.String r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            goto Ld
        L8:
            long r0 = r2.builderPtr
            nativeAddString(r0, r3, r5)
        Ld:
            return
    }

    public void addStringList(long r8, io.realm.RealmList<java.lang.String> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.String> r6 = io.realm.internal.objectstore.OsObjectBuilder.stringItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addStringSet(long r8, io.realm.RealmSet<java.lang.String> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.lang.String> r6 = io.realm.internal.objectstore.OsObjectBuilder.stringSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addStringValueDictionary(long r8, io.realm.RealmDictionary<java.lang.String> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.lang.String>> r6 = io.realm.internal.objectstore.OsObjectBuilder.stringMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    public void addUUID(long r3, @javax.annotation.Nullable java.util.UUID r5) {
            r2 = this;
            if (r5 != 0) goto L8
            long r0 = r2.builderPtr
            nativeAddNull(r0, r3)
            goto L11
        L8:
            long r0 = r2.builderPtr
            java.lang.String r5 = r5.toString()
            nativeAddUUID(r0, r3, r5)
        L11:
            return
    }

    public void addUUIDList(long r8, io.realm.RealmList<java.util.UUID> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.UUID> r6 = io.realm.internal.objectstore.OsObjectBuilder.uuidItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addListItem(r1, r3, r5, r6)
            return
    }

    public void addUUIDSet(long r8, io.realm.RealmSet<java.util.UUID> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.UUID> r6 = io.realm.internal.objectstore.OsObjectBuilder.uuidSetItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addSetItem(r1, r3, r5, r6)
            return
    }

    public void addUUIDValueDictionary(long r8, io.realm.RealmDictionary<java.util.UUID> r10) {
            r7 = this;
            long r1 = r7.builderPtr
            io.realm.internal.objectstore.OsObjectBuilder$ItemCallback<java.util.Map$Entry<java.lang.String, java.util.UUID>> r6 = io.realm.internal.objectstore.OsObjectBuilder.uuidMapItemCallback
            r0 = r7
            r3 = r8
            r5 = r10
            r0.addDictionaryItem(r1, r3, r5, r6)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            long r0 = r2.builderPtr
            nativeDestroyBuilder(r0)
            return
    }

    public io.realm.internal.UncheckedRow createNewObject() {
            r8 = this;
            long r0 = r8.sharedRealmPtr     // Catch: java.lang.Throwable -> L19
            long r2 = r8.tablePtr     // Catch: java.lang.Throwable -> L19
            long r4 = r8.builderPtr     // Catch: java.lang.Throwable -> L19
            r6 = 0
            r7 = 0
            long r0 = nativeCreateOrUpdateTopLevelObject(r0, r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L19
            io.realm.internal.UncheckedRow r2 = new io.realm.internal.UncheckedRow     // Catch: java.lang.Throwable -> L19
            io.realm.internal.NativeContext r3 = r8.context     // Catch: java.lang.Throwable -> L19
            io.realm.internal.Table r4 = r8.table     // Catch: java.lang.Throwable -> L19
            r2.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L19
            r8.close()
            return r2
        L19:
            r0 = move-exception
            r8.close()
            throw r0
    }

    public long getNativePtr() {
            r2 = this;
            long r0 = r2.builderPtr
            return r0
    }

    public void updateExistingEmbeddedObject(io.realm.internal.RealmObjectProxy r10) {
            r9 = this;
            io.realm.ProxyState r10 = r10.realmGet$proxyState()     // Catch: java.lang.Throwable -> L1b
            io.realm.internal.Row r10 = r10.getRow$realm()     // Catch: java.lang.Throwable -> L1b
            long r6 = r10.getObjectKey()     // Catch: java.lang.Throwable -> L1b
            long r0 = r9.sharedRealmPtr     // Catch: java.lang.Throwable -> L1b
            long r2 = r9.tablePtr     // Catch: java.lang.Throwable -> L1b
            long r4 = r9.builderPtr     // Catch: java.lang.Throwable -> L1b
            boolean r8 = r9.ignoreFieldsWithSameValue     // Catch: java.lang.Throwable -> L1b
            nativeUpdateEmbeddedObject(r0, r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L1b
            r9.close()
            return
        L1b:
            r10 = move-exception
            r9.close()
            throw r10
    }

    public void updateExistingTopLevelObject() {
            r8 = this;
            long r0 = r8.sharedRealmPtr     // Catch: java.lang.Throwable -> L10
            long r2 = r8.tablePtr     // Catch: java.lang.Throwable -> L10
            long r4 = r8.builderPtr     // Catch: java.lang.Throwable -> L10
            r6 = 1
            boolean r7 = r8.ignoreFieldsWithSameValue     // Catch: java.lang.Throwable -> L10
            nativeCreateOrUpdateTopLevelObject(r0, r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L10
            r8.close()
            return
        L10:
            r0 = move-exception
            r8.close()
            throw r0
    }
}
