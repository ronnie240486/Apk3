package kotlin.collections.builders;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 {*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\u0007{|}~\u007f\u0080\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00107J\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109J\r\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\b<J\b\u0010=\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020;H\u0002J\u0019\u0010?\u001a\u00020!2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030AH\u0000¢\u0006\u0002\bBJ!\u0010C\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020!2\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010HJ\u0018\u0010K\u001a\u00020!2\u000e\u0010L\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000309H\u0002J\u0010\u0010M\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020\bH\u0002J\u0019\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010QH\u0000¢\u0006\u0002\bRJ\u0013\u0010S\u001a\u00020!2\b\u0010L\u001a\u0004\u0018\u00010TH\u0096\u0002J\u0015\u0010U\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\u0015\u0010V\u001a\u00020\b2\u0006\u0010J\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00105J\u0018\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\b\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020!H\u0016J\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0002\b^J\u001f\u0010_\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010`J\u001e\u0010a\u001a\u00020;2\u0014\u0010b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0016J\"\u0010c\u001a\u00020!2\u0018\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0AH\u0002J\u001c\u0010d\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0002J\u0010\u0010e\u001a\u00020!2\u0006\u0010f\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020;2\u0006\u0010h\u001a\u00020\bH\u0002J\u0017\u0010i\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ!\u0010j\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u00020;2\u0006\u0010m\u001a\u00020\bH\u0002J\u0017\u0010n\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\bo\u00105J\u0010\u0010p\u001a\u00020;2\u0006\u0010q\u001a\u00020\bH\u0002J\u0017\u0010r\u001a\u00020!2\u0006\u0010s\u001a\u00028\u0001H\u0000¢\u0006\u0004\bt\u0010HJ\b\u0010u\u001a\u00020vH\u0016J\u0019\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010xH\u0000¢\u0006\u0002\byJ\b\u0010z\u001a\u00020TH\u0002R\u0014\u0010\u0013\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity", "()I", "entries", "", "", "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "keys", "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", "key", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", "", "checkIsMutable", "", "checkIsMutable$kotlin_stdlib", "clear", "compact", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "contentEquals", "other", "ensureCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", "", "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "putAllEntries", "putEntry", "putRehash", "i", "rehash", "newHashSize", "remove", "removeEntry", "removeEntry$kotlin_stdlib", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeKeyAt", "index", "removeValue", "element", "removeValue$kotlin_stdlib", "toString", "", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapBuilder<K, V> implements java.util.Map<K, V>, java.io.Serializable, kotlin.jvm.internal.markers.KMutableMap {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.collections.builders.MapBuilder.Companion Companion = null;

    @java.lang.Deprecated
    private static final int INITIAL_CAPACITY = 8;

    @java.lang.Deprecated
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;

    @java.lang.Deprecated
    private static final int MAGIC = -1640531527;

    @java.lang.Deprecated
    private static final int TOMBSTONE = -1;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.builders.MapBuilderEntries<K, V> entriesView;

    @org.jetbrains.annotations.NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @org.jetbrains.annotations.NotNull
    private K[] keysArray;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.builders.MapBuilderKeys<K> keysView;
    private int length;
    private int maxProbeDistance;

    @org.jetbrains.annotations.NotNull
    private int[] presenceArray;
    private int size;

    @org.jetbrains.annotations.Nullable
    private V[] valuesArray;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.builders.MapBuilderValues<V> valuesView;

    /* JADX INFO: compiled from: MapBuilder.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "()V", "INITIAL_CAPACITY", "", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ int access$computeHashSize(kotlin.collections.builders.MapBuilder.Companion r0, int r1) {
                int r0 = r0.computeHashSize(r1)
                return r0
        }

        public static final /* synthetic */ int access$computeShift(kotlin.collections.builders.MapBuilder.Companion r0, int r1) {
                int r0 = r0.computeShift(r1)
                return r0
        }

        private final int computeHashSize(int r2) {
                r1 = this;
                r0 = 1
                int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r0)
                int r2 = r2 * 3
                int r2 = java.lang.Integer.highestOneBit(r2)
                return r2
        }

        private final int computeShift(int r1) {
                r0 = this;
                int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
                int r1 = r1 + 1
                return r1
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EntriesItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
        public EntriesItr(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                kotlin.collections.builders.MapBuilder$EntryRef r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        @org.jetbrains.annotations.NotNull
        public kotlin.collections.builders.MapBuilder.EntryRef<K, V> next() {
                r3 = this;
                int r0 = r3.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2b
                int r0 = r3.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r3.setIndex$kotlin_stdlib(r1)
                r3.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder$EntryRef r0 = new kotlin.collections.builders.MapBuilder$EntryRef
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                int r2 = r3.getLastIndex$kotlin_stdlib()
                r0.<init>(r1, r2)
                r3.initNext$kotlin_stdlib()
                return r0
            L2b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final void nextAppendString(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r4) {
                r3 = this;
                java.lang.String r0 = "sb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = r3.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L6b
                int r0 = r3.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r3.setIndex$kotlin_stdlib(r1)
                r3.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r3.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r3.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                java.lang.String r2 = "(this Map)"
                if (r1 == 0) goto L3d
                r4.append(r2)
                goto L40
            L3d:
                r4.append(r0)
            L40:
                r0 = 61
                r4.append(r0)
                kotlin.collections.builders.MapBuilder r0 = r3.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r1 = r3.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L64
                r4.append(r2)
                goto L67
            L64:
                r4.append(r0)
            L67:
                r3.initNext$kotlin_stdlib()
                return
            L6b:
                java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
                r4.<init>()
                throw r4
        }

        public final int nextHashCode$kotlin_stdlib() {
                r4 = this;
                int r0 = r4.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r4.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L4d
                int r0 = r4.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r4.setIndex$kotlin_stdlib(r1)
                r4.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r4.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r4.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                r1 = 0
                if (r0 == 0) goto L30
                int r0 = r0.hashCode()
                goto L31
            L30:
                r0 = 0
            L31:
                kotlin.collections.builders.MapBuilder r2 = r4.getMap$kotlin_stdlib()
                java.lang.Object[] r2 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r3 = r4.getLastIndex$kotlin_stdlib()
                r2 = r2[r3]
                if (r2 == 0) goto L48
                int r1 = r2.hashCode()
            L48:
                r0 = r0 ^ r1
                r4.initNext$kotlin_stdlib()
                return r0
            L4d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "(Lkotlin/collections/builders/MapBuilder;I)V", "key", "getKey", "()Ljava/lang/Object;", "value", "getValue", "equals", "", "other", "", "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EntryRef<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
        private final int index;

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.builders.MapBuilder<K, V> map;

        public EntryRef(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.map = r2
                r1.index = r3
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L24
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r0 = r3.getKey()
                java.lang.Object r1 = r2.getKey()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L24
                java.lang.Object r3 = r3.getValue()
                java.lang.Object r0 = r2.getValue()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
                if (r3 == 0) goto L24
                r3 = 1
                goto L25
            L24:
                r3 = 0
            L25:
                return r3
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r2.index
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r1 = r2.index
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.hashCode()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                java.lang.Object r2 = r3.getValue()
                if (r2 == 0) goto L17
                int r1 = r2.hashCode()
            L17:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r4) {
                r3 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                r0.checkIsMutable$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$allocateValuesArray(r0)
                int r1 = r3.index
                r2 = r0[r1]
                r0[r1] = r4
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "index", "", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "hasNext", "", "initNext", "", "initNext$kotlin_stdlib", "remove", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Itr<K, V> {
        private int index;
        private int lastIndex;

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.builders.MapBuilder<K, V> map;

        public Itr(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.map = r2
                r2 = -1
                r1.lastIndex = r2
                r1.initNext$kotlin_stdlib()
                return
        }

        public final int getIndex$kotlin_stdlib() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final int getLastIndex$kotlin_stdlib() {
                r1 = this;
                int r0 = r1.lastIndex
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.collections.builders.MapBuilder<K, V> getMap$kotlin_stdlib() {
                r1 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r1.map
                return r0
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                kotlin.collections.builders.MapBuilder<K, V> r1 = r2.map
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final void initNext$kotlin_stdlib() {
                r2 = this;
            L0:
                int r0 = r2.index
                kotlin.collections.builders.MapBuilder<K, V> r1 = r2.map
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L1b
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                int[] r0 = kotlin.collections.builders.MapBuilder.access$getPresenceArray$p(r0)
                int r1 = r2.index
                r0 = r0[r1]
                if (r0 >= 0) goto L1b
                int r1 = r1 + 1
                r2.index = r1
                goto L0
            L1b:
                return
        }

        public final void remove() {
                r3 = this;
                int r0 = r3.lastIndex
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                if (r0 == 0) goto L19
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                r0.checkIsMutable$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                int r2 = r3.lastIndex
                kotlin.collections.builders.MapBuilder.access$removeKeyAt(r0, r2)
                r3.lastIndex = r1
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() before removing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void setIndex$kotlin_stdlib(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final void setLastIndex$kotlin_stdlib(int r1) {
                r0 = this;
                r0.lastIndex = r1
                return
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class KeysItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<K>, kotlin.jvm.internal.markers.KMutableIterator {
        public KeysItr(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public K next() {
                r2 = this;
                int r0 = r2.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r2.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2c
                int r0 = r2.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r2.setIndex$kotlin_stdlib(r1)
                r2.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r2.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r2.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                r2.initNext$kotlin_stdlib()
                return r0
            L2c:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ValuesItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMutableIterator {
        public ValuesItr(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public V next() {
                r2 = this;
                int r0 = r2.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r2.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2f
                int r0 = r2.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r2.setIndex$kotlin_stdlib(r1)
                r2.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r2.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r1 = r2.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                r2.initNext$kotlin_stdlib()
                return r0
            L2f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            kotlin.collections.builders.MapBuilder$Companion r0 = new kotlin.collections.builders.MapBuilder$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.MapBuilder.Companion = r0
            return
    }

    public MapBuilder() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public MapBuilder(int r8) {
            r7 = this;
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(r8)
            int[] r3 = new int[r8]
            kotlin.collections.builders.MapBuilder$Companion r0 = kotlin.collections.builders.MapBuilder.Companion
            int r8 = kotlin.collections.builders.MapBuilder.Companion.access$computeHashSize(r0, r8)
            int[] r4 = new int[r8]
            r2 = 0
            r5 = 2
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private MapBuilder(K[] r1, V[] r2, int[] r3, int[] r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.keysArray = r1
            r0.valuesArray = r2
            r0.presenceArray = r3
            r0.hashArray = r4
            r0.maxProbeDistance = r5
            r0.length = r6
            kotlin.collections.builders.MapBuilder$Companion r1 = kotlin.collections.builders.MapBuilder.Companion
            int r2 = r0.getHashSize()
            int r1 = kotlin.collections.builders.MapBuilder.Companion.access$computeShift(r1, r2)
            r0.hashShift = r1
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$allocateValuesArray(kotlin.collections.builders.MapBuilder r0) {
            java.lang.Object[] r0 = r0.allocateValuesArray()
            return r0
    }

    public static final /* synthetic */ java.lang.Object[] access$getKeysArray$p(kotlin.collections.builders.MapBuilder r0) {
            K[] r0 = r0.keysArray
            return r0
    }

    public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.MapBuilder r0) {
            int r0 = r0.length
            return r0
    }

    public static final /* synthetic */ int[] access$getPresenceArray$p(kotlin.collections.builders.MapBuilder r0) {
            int[] r0 = r0.presenceArray
            return r0
    }

    public static final /* synthetic */ java.lang.Object[] access$getValuesArray$p(kotlin.collections.builders.MapBuilder r0) {
            V[] r0 = r0.valuesArray
            return r0
    }

    public static final /* synthetic */ void access$removeKeyAt(kotlin.collections.builders.MapBuilder r0, int r1) {
            r0.removeKeyAt(r1)
            return
    }

    private final V[] allocateValuesArray() {
            r1 = this;
            V[] r0 = r1.valuesArray
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.getCapacity()
            java.lang.Object[] r0 = kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(r0)
            r1.valuesArray = r0
            return r0
    }

    private final void compact() {
            r5 = this;
            V[] r0 = r5.valuesArray
            r1 = 0
            r2 = 0
        L4:
            int r3 = r5.length
            if (r1 >= r3) goto L1f
            int[] r3 = r5.presenceArray
            r3 = r3[r1]
            if (r3 < 0) goto L1c
            K[] r3 = r5.keysArray
            r4 = r3[r1]
            r3[r2] = r4
            if (r0 == 0) goto L1a
            r3 = r0[r1]
            r0[r2] = r3
        L1a:
            int r2 = r2 + 1
        L1c:
            int r1 = r1 + 1
            goto L4
        L1f:
            K[] r1 = r5.keysArray
            kotlin.collections.builders.ListBuilderKt.resetRange(r1, r2, r3)
            if (r0 == 0) goto L2b
            int r1 = r5.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r2, r1)
        L2b:
            r5.length = r2
            return
    }

    private final boolean contentEquals(java.util.Map<?, ?> r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r3.size()
            if (r0 != r1) goto L16
            java.util.Set r3 = r3.entrySet()
            boolean r3 = r2.containsAllEntries$kotlin_stdlib(r3)
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    private final void ensureCapacity(int r3) {
            r2 = this;
            if (r3 < 0) goto L5b
            int r0 = r2.getCapacity()
            if (r3 <= r0) goto L45
            int r0 = r2.getCapacity()
            int r0 = r0 * 3
            int r0 = r0 / 2
            if (r3 <= r0) goto L13
            goto L14
        L13:
            r3 = r0
        L14:
            K[] r0 = r2.keysArray
            java.lang.Object[] r0 = kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(r0, r3)
            r2.keysArray = r0
            V[] r0 = r2.valuesArray
            if (r0 == 0) goto L25
            java.lang.Object[] r0 = kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(r0, r3)
            goto L26
        L25:
            r0 = 0
        L26:
            r2.valuesArray = r0
            int[] r0 = r2.presenceArray
            int[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.presenceArray = r0
            kotlin.collections.builders.MapBuilder$Companion r0 = kotlin.collections.builders.MapBuilder.Companion
            int r3 = kotlin.collections.builders.MapBuilder.Companion.access$computeHashSize(r0, r3)
            int r0 = r2.getHashSize()
            if (r3 <= r0) goto L5a
            r2.rehash(r3)
            goto L5a
        L45:
            int r0 = r2.length
            int r0 = r0 + r3
            int r3 = r2.size()
            int r0 = r0 - r3
            int r3 = r2.getCapacity()
            if (r0 <= r3) goto L5a
            int r3 = r2.getHashSize()
            r2.rehash(r3)
        L5a:
            return
        L5b:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError
            r3.<init>()
            throw r3
    }

    private final void ensureExtraCapacity(int r2) {
            r1 = this;
            int r0 = r1.length
            int r0 = r0 + r2
            r1.ensureCapacity(r0)
            return
    }

    private final int findKey(K r6) {
            r5 = this;
            int r0 = r5.hash(r6)
            int r1 = r5.maxProbeDistance
        L6:
            int[] r2 = r5.hashArray
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            if (r2 <= 0) goto L1d
            K[] r4 = r5.keysArray
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r4 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + r3
            if (r1 >= 0) goto L21
            return r3
        L21:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2c
            int r0 = r5.getHashSize()
            int r0 = r0 + (-1)
            goto L6
        L2c:
            r0 = r2
            goto L6
    }

    private final int findValue(V r3) {
            r2 = this;
            int r0 = r2.length
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.presenceArray
            r1 = r1[r0]
            if (r1 < 0) goto L2
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    private final int getCapacity() {
            r1 = this;
            K[] r0 = r1.keysArray
            int r0 = r0.length
            return r0
    }

    private final int getHashSize() {
            r1 = this;
            int[] r0 = r1.hashArray
            int r0 = r0.length
            return r0
    }

    private final int hash(K r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r0 = r1.hashShift
            int r2 = r2 >>> r0
            return r2
    }

    private final boolean putAllEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r3.size()
            r2.ensureExtraCapacity(r0)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r2.putEntry(r0)
            if (r0 == 0) goto L13
            r1 = 1
            goto L13
        L27:
            return r1
    }

    private final boolean putEntry(java.util.Map.Entry<? extends K, ? extends V> r6) {
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            int r0 = r5.addKey$kotlin_stdlib(r0)
            java.lang.Object[] r1 = r5.allocateValuesArray()
            r2 = 1
            if (r0 < 0) goto L16
            java.lang.Object r6 = r6.getValue()
            r1[r0] = r6
            return r2
        L16:
            int r0 = -r0
            int r0 = r0 - r2
            r3 = r1[r0]
            java.lang.Object r4 = r6.getValue()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r3 != 0) goto L2b
            java.lang.Object r6 = r6.getValue()
            r1[r0] = r6
            return r2
        L2b:
            r6 = 0
            return r6
    }

    private final boolean putRehash(int r6) {
            r5 = this;
            K[] r0 = r5.keysArray
            r0 = r0[r6]
            int r0 = r5.hash(r0)
            int r1 = r5.maxProbeDistance
        La:
            int[] r2 = r5.hashArray
            r3 = r2[r0]
            r4 = 1
            if (r3 != 0) goto L1a
            int r1 = r6 + 1
            r2[r0] = r1
            int[] r1 = r5.presenceArray
            r1[r6] = r0
            return r4
        L1a:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L20
            r6 = 0
            return r6
        L20:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2a
            int r0 = r5.getHashSize()
            int r0 = r0 - r4
            goto La
        L2a:
            r0 = r2
            goto La
    }

    private final void rehash(int r3) {
            r2 = this;
            int r0 = r2.length
            int r1 = r2.size()
            if (r0 <= r1) goto Lb
            r2.compact()
        Lb:
            int r0 = r2.getHashSize()
            r1 = 0
            if (r3 == r0) goto L1f
            int[] r0 = new int[r3]
            r2.hashArray = r0
            kotlin.collections.builders.MapBuilder$Companion r0 = kotlin.collections.builders.MapBuilder.Companion
            int r3 = kotlin.collections.builders.MapBuilder.Companion.access$computeShift(r0, r3)
            r2.hashShift = r3
            goto L28
        L1f:
            int[] r3 = r2.hashArray
            int r0 = r2.getHashSize()
            kotlin.collections.ArraysKt.fill(r3, r1, r1, r0)
        L28:
            int r3 = r2.length
            if (r1 >= r3) goto L3e
            int r3 = r1 + 1
            boolean r0 = r2.putRehash(r1)
            if (r0 == 0) goto L36
            r1 = r3
            goto L28
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r3.<init>(r0)
            throw r3
        L3e:
            return
    }

    private final void removeHashAt(int r10) {
            r9 = this;
            int r0 = r9.maxProbeDistance
            int r0 = r0 * 2
            int r1 = r9.getHashSize()
            int r1 = r1 / 2
            int r0 = kotlin.ranges.RangesKt.coerceAtMost(r0, r1)
            r1 = 0
            r2 = r0
            r3 = 0
            r0 = r10
        L12:
            int r4 = r10 + (-1)
            if (r10 != 0) goto L1d
            int r10 = r9.getHashSize()
            int r10 = r10 + (-1)
            goto L1e
        L1d:
            r10 = r4
        L1e:
            int r3 = r3 + 1
            int r4 = r9.maxProbeDistance
            if (r3 <= r4) goto L29
            int[] r10 = r9.hashArray
            r10[r0] = r1
            return
        L29:
            int[] r4 = r9.hashArray
            r5 = r4[r10]
            if (r5 != 0) goto L32
            r4[r0] = r1
            return
        L32:
            r6 = -1
            if (r5 >= 0) goto L3a
            r4[r0] = r6
        L37:
            r0 = r10
            r3 = 0
            goto L57
        L3a:
            K[] r4 = r9.keysArray
            int r7 = r5 + (-1)
            r4 = r4[r7]
            int r4 = r9.hash(r4)
            int r4 = r4 - r10
            int r8 = r9.getHashSize()
            int r8 = r8 + (-1)
            r4 = r4 & r8
            if (r4 < r3) goto L57
            int[] r3 = r9.hashArray
            r3[r0] = r5
            int[] r3 = r9.presenceArray
            r3[r7] = r0
            goto L37
        L57:
            int r2 = r2 + r6
            if (r2 >= 0) goto L12
            int[] r10 = r9.hashArray
            r10[r0] = r6
            return
    }

    private final void removeKeyAt(int r3) {
            r2 = this;
            K[] r0 = r2.keysArray
            kotlin.collections.builders.ListBuilderKt.resetAt(r0, r3)
            int[] r0 = r2.presenceArray
            r0 = r0[r3]
            r2.removeHashAt(r0)
            int[] r0 = r2.presenceArray
            r1 = -1
            r0[r3] = r1
            int r3 = r2.size()
            int r3 = r3 + r1
            r2.size = r3
            return
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            boolean r0 = r2.isReadOnly
            if (r0 == 0) goto La
            kotlin.collections.builders.SerializedMap r0 = new kotlin.collections.builders.SerializedMap
            r0.<init>(r2)
            return r0
        La:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The map cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    public final int addKey$kotlin_stdlib(K r8) {
            r7 = this;
            r7.checkIsMutable$kotlin_stdlib()
        L3:
            int r0 = r7.hash(r8)
            int r1 = r7.maxProbeDistance
            int r1 = r1 * 2
            int r2 = r7.getHashSize()
            int r2 = r2 / 2
            int r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r2)
            r2 = 0
        L16:
            int[] r3 = r7.hashArray
            r3 = r3[r0]
            r4 = 1
            if (r3 > 0) goto L49
            int r1 = r7.length
            int r3 = r7.getCapacity()
            if (r1 < r3) goto L29
            r7.ensureExtraCapacity(r4)
            goto L3
        L29:
            int r1 = r7.length
            int r3 = r1 + 1
            r7.length = r3
            K[] r5 = r7.keysArray
            r5[r1] = r8
            int[] r8 = r7.presenceArray
            r8[r1] = r0
            int[] r8 = r7.hashArray
            r8[r0] = r3
            int r8 = r7.size()
            int r8 = r8 + r4
            r7.size = r8
            int r8 = r7.maxProbeDistance
            if (r2 <= r8) goto L48
            r7.maxProbeDistance = r2
        L48:
            return r1
        L49:
            K[] r5 = r7.keysArray
            int r6 = r3 + (-1)
            r5 = r5[r6]
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r8)
            if (r5 == 0) goto L57
            int r8 = -r3
            return r8
        L57:
            int r2 = r2 + 1
            if (r2 <= r1) goto L65
            int r0 = r7.getHashSize()
            int r0 = r0 * 2
            r7.rehash(r0)
            goto L3
        L65:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L6f
            int r0 = r7.getHashSize()
            int r0 = r0 - r4
            goto L16
        L6f:
            r0 = r3
            goto L16
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<K, V> build() {
            r1 = this;
            r1.checkIsMutable$kotlin_stdlib()
            r0 = 1
            r1.isReadOnly = r0
            return r1
    }

    public final void checkIsMutable$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public void clear() {
            r6 = this;
            r6.checkIsMutable$kotlin_stdlib()
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r6.length
            int r1 = r1 + (-1)
            r2 = 0
            r0.<init>(r2, r1)
            kotlin.collections.IntIterator r0 = r0.iterator2()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            int r1 = r0.nextInt()
            int[] r3 = r6.presenceArray
            r4 = r3[r1]
            if (r4 < 0) goto L11
            int[] r5 = r6.hashArray
            r5[r4] = r2
            r4 = -1
            r3[r1] = r4
            goto L11
        L29:
            K[] r0 = r6.keysArray
            int r1 = r6.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r2, r1)
            V[] r0 = r6.valuesArray
            if (r0 == 0) goto L39
            int r1 = r6.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r2, r1)
        L39:
            r6.size = r2
            r6.length = r2
            return
    }

    public final boolean containsAllEntries$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Collection<?> r3) {
            r2 = this;
            java.lang.String r0 = "m"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L1f
            boolean r0 = r2.containsEntry$kotlin_stdlib(r0)     // Catch: java.lang.ClassCastException -> L1f
            if (r0 != 0) goto L9
        L1f:
            return r1
        L20:
            r3 = 1
            return r3
    }

    public final boolean containsEntry$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Object r0 = r3.getKey()
            int r0 = r2.findKey(r0)
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0 = r1[r0]
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            return r3
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.findKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.findValue(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder.EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$EntriesItr r0 = new kotlin.collections.builders.MapBuilder$EntriesItr
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L11
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Lf
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r1.contentEquals(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.findKey(r2)
            if (r2 >= 0) goto L8
            r2 = 0
            return r2
        L8:
            V[] r0 = r1.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r2 = r0[r2]
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r1 = this;
            kotlin.collections.builders.MapBuilderEntries<K, V> r0 = r1.entriesView
            if (r0 != 0) goto Lb
            kotlin.collections.builders.MapBuilderEntries r0 = new kotlin.collections.builders.MapBuilderEntries
            r0.<init>(r1)
            r1.entriesView = r0
        Lb:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> getKeys() {
            r1 = this;
            kotlin.collections.builders.MapBuilderKeys<K> r0 = r1.keysView
            if (r0 != 0) goto Lb
            kotlin.collections.builders.MapBuilderKeys r0 = new kotlin.collections.builders.MapBuilderKeys
            r0.<init>(r1)
            r1.keysView = r0
        Lb:
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<V> getValues() {
            r1 = this;
            kotlin.collections.builders.MapBuilderValues<V> r0 = r1.valuesView
            if (r0 != 0) goto Lb
            kotlin.collections.builders.MapBuilderValues r0 = new kotlin.collections.builders.MapBuilderValues
            r0.<init>(r1)
            r1.valuesView = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r3 = this;
            kotlin.collections.builders.MapBuilder$EntriesItr r0 = r3.entriesIterator$kotlin_stdlib()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L11
            int r2 = r0.nextHashCode$kotlin_stdlib()
            int r1 = r1 + r2
            goto L5
        L11:
            return r1
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean isReadOnly$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder.KeysItr<K, V> keysIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$KeysItr r0 = new kotlin.collections.builders.MapBuilder$KeysItr
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V put(K r3, V r4) {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            int r3 = r2.addKey$kotlin_stdlib(r3)
            java.lang.Object[] r0 = r2.allocateValuesArray()
            if (r3 >= 0) goto L15
            int r3 = -r3
            int r3 = r3 + (-1)
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L15:
            r0[r3] = r4
            r3 = 0
            return r3
    }

    @Override // java.util.Map
    public void putAll(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.checkIsMutable$kotlin_stdlib()
            java.util.Set r2 = r2.entrySet()
            r1.putAllEntries(r2)
            return
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V remove(java.lang.Object r3) {
            r2 = this;
            int r3 = r2.removeKey$kotlin_stdlib(r3)
            if (r3 >= 0) goto L8
            r3 = 0
            return r3
        L8:
            V[] r0 = r2.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0[r3]
            kotlin.collections.builders.ListBuilderKt.resetAt(r0, r3)
            return r1
    }

    public final boolean removeEntry$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r4) {
            r3 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.checkIsMutable$kotlin_stdlib()
            java.lang.Object r0 = r4.getKey()
            int r0 = r3.findKey(r0)
            r1 = 0
            if (r0 >= 0) goto L14
            return r1
        L14:
            V[] r2 = r3.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2 = r2[r0]
            java.lang.Object r4 = r4.getValue()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 != 0) goto L26
            return r1
        L26:
            r3.removeKeyAt(r0)
            r4 = 1
            return r4
    }

    public final int removeKey$kotlin_stdlib(K r1) {
            r0 = this;
            r0.checkIsMutable$kotlin_stdlib()
            int r1 = r0.findKey(r1)
            if (r1 >= 0) goto Lb
            r1 = -1
            return r1
        Lb:
            r0.removeKeyAt(r1)
            return r1
    }

    public final boolean removeValue$kotlin_stdlib(V r1) {
            r0 = this;
            r0.checkIsMutable$kotlin_stdlib()
            int r1 = r0.findValue(r1)
            if (r1 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r0.removeKeyAt(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size()
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            kotlin.collections.builders.MapBuilder$EntriesItr r1 = r4.entriesIterator$kotlin_stdlib()
            r2 = 0
        L18:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2b
            if (r2 <= 0) goto L25
            java.lang.String r3 = ", "
            r0.append(r3)
        L25:
            r1.nextAppendString(r0)
            int r2 = r2 + 1
            goto L18
        L2b:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder.ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$ValuesItr r0 = new kotlin.collections.builders.MapBuilder$ValuesItr
            r0.<init>(r1)
            return r0
    }
}
