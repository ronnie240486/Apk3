package okhttp3.internal.http2;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "()V", "NAME_TO_FIRST_INDEX", "", "Lokio/ByteString;", "", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", "", "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Hpack {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Hpack INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX = null;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    @org.jetbrains.annotations.NotNull
    private static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE = null;

    /* JADX INFO: compiled from: Hpack.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010!\u001a\u00020\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "source", "Lokio/Source;", "headerTableSizeSetting", "", "maxDynamicTableByteCount", "(Lokio/Source;II)V", "dynamicTable", "", "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "headerCount", "headerList", "", "nextHeaderIndex", "Lokio/BufferedSource;", "adjustDynamicTableByteCount", "", "clearDynamicTable", "dynamicTableIndex", "index", "evictToRecoverBytes", "bytesToRecover", "getAndResetHeaderList", "", "getName", "Lokio/ByteString;", "insertIntoDynamicTable", "entry", "isStaticHeader", "", "readByte", "readByteString", "readHeaders", "readIndexedHeader", "readInt", "firstByte", "prefixMask", "readLiteralHeaderWithIncrementalIndexingIndexedName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Reader {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public okhttp3.internal.http2.Header[] dynamicTable;

        @kotlin.jvm.JvmField
        public int dynamicTableByteCount;

        @kotlin.jvm.JvmField
        public int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.BufferedSource source;

        @kotlin.jvm.JvmOverloads
        public Reader(@org.jetbrains.annotations.NotNull okio.Source r7, int r8) {
                r6 = this;
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Reader(@org.jetbrains.annotations.NotNull okio.Source r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.headerTableSizeSetting = r3
                r1.maxDynamicTableByteCount = r4
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.headerList = r3
                okio.BufferedSource r2 = okio.Okio.buffer(r2)
                r1.source = r2
                r2 = 8
                okhttp3.internal.http2.Header[] r2 = new okhttp3.internal.http2.Header[r2]
                r1.dynamicTable = r2
                int r2 = r2.length
                int r2 = r2 + (-1)
                r1.nextHeaderIndex = r2
                return
        }

        public /* synthetic */ Reader(okio.Source r1, int r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
                r0 = this;
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = r2
            L5:
                r0.<init>(r1, r2, r3)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                goto L10
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private final void clearDynamicTable() {
                r2 = this;
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                r1 = 0
                kotlin.collections.ArraysKt.fill$default(r0, r1)
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r2.nextHeaderIndex = r0
                r0 = 0
                r2.headerCount = r0
                r2.dynamicTableByteCount = r0
                return
        }

        private final int dynamicTableIndex(int r2) {
                r1 = this;
                int r0 = r1.nextHeaderIndex
                int r0 = r0 + 1
                int r0 = r0 + r2
                return r0
        }

        private final int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L39
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L28
                if (r5 <= 0) goto L28
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r3 = r4.dynamicTableByteCount
                int r3 = r3 - r2
                r4.dynamicTableByteCount = r3
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L28:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L39:
                return r0
        }

        private final okio.ByteString getName(int r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L11
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r4 = r0[r4]
                okio.ByteString r4 = r4.name
                goto L2c
            L11:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L2d
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L2d
                r4 = r1[r0]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                okio.ByteString r4 = r4.name
            L2c:
                return r4
            L2d:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Header index too large "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final void insertIntoDynamicTable(int r6, okhttp3.internal.http2.Header r7) {
                r5 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r5.headerList
                r0.add(r7)
                int r0 = r7.hpackSize
                r1 = -1
                if (r6 == r1) goto L18
                okhttp3.internal.http2.Header[] r2 = r5.dynamicTable
                int r3 = r5.dynamicTableIndex(r6)
                r2 = r2[r3]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r2 = r2.hpackSize
                int r0 = r0 - r2
            L18:
                int r2 = r5.maxDynamicTableByteCount
                if (r0 <= r2) goto L20
                r5.clearDynamicTable()
                return
            L20:
                int r3 = r5.dynamicTableByteCount
                int r3 = r3 + r0
                int r3 = r3 - r2
                int r2 = r5.evictToRecoverBytes(r3)
                if (r6 != r1) goto L58
                int r6 = r5.headerCount
                int r6 = r6 + 1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r2 = r1.length
                if (r6 <= r2) goto L47
                int r6 = r1.length
                int r6 = r6 * 2
                okhttp3.internal.http2.Header[] r6 = new okhttp3.internal.http2.Header[r6]
                r2 = 0
                int r3 = r1.length
                int r4 = r1.length
                java.lang.System.arraycopy(r1, r2, r6, r3, r4)
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
                r5.nextHeaderIndex = r1
                r5.dynamicTable = r6
            L47:
                int r6 = r5.nextHeaderIndex
                int r1 = r6 + (-1)
                r5.nextHeaderIndex = r1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                r1[r6] = r7
                int r6 = r5.headerCount
                int r6 = r6 + 1
                r5.headerCount = r6
                goto L62
            L58:
                int r1 = r5.dynamicTableIndex(r6)
                int r1 = r1 + r2
                int r1 = r1 + r6
                okhttp3.internal.http2.Header[] r6 = r5.dynamicTable
                r6[r1] = r7
            L62:
                int r6 = r5.dynamicTableByteCount
                int r6 = r6 + r0
                r5.dynamicTableByteCount = r6
                return
        }

        private final boolean isStaticHeader(int r3) {
                r2 = this;
                r0 = 1
                if (r3 < 0) goto Le
                okhttp3.internal.http2.Hpack r1 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r1 = r1.getSTATIC_HEADER_TABLE()
                int r1 = r1.length
                int r1 = r1 - r0
                if (r3 > r1) goto Le
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        private final int readByte() throws java.io.IOException {
                r2 = this;
                okio.BufferedSource r0 = r2.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal.Util.and(r0, r1)
                return r0
        }

        private final void readIndexedHeader(int r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L14
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                r4 = r0[r4]
                java.util.List<okhttp3.internal.http2.Header> r0 = r3.headerList
                r0.add(r4)
                goto L32
            L14:
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r0 = r0.getSTATIC_HEADER_TABLE()
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L33
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L33
                java.util.List<okhttp3.internal.http2.Header> r4 = r3.headerList
                r0 = r1[r0]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r4.add(r0)
            L32:
                return
            L33:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Header index too large "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int r3) throws java.io.IOException {
                r2 = this;
                okio.ByteString r3 = r2.getName(r3)
                okio.ByteString r0 = r2.readByteString()
                okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
                r1.<init>(r3, r0)
                r3 = -1
                r2.insertIntoDynamicTable(r3, r1)
                return
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
                r3 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r3.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r3.readByteString()
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r0, r1)
                r0 = -1
                r3.insertIntoDynamicTable(r0, r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int r4) throws java.io.IOException {
                r3 = this;
                okio.ByteString r4 = r3.getName(r4)
                okio.ByteString r0 = r3.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r1 = r3.headerList
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r4, r0)
                r1.add(r2)
                return
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.http2.Hpack r0 = okhttp3.internal.http2.Hpack.INSTANCE
                okio.ByteString r1 = r4.readByteString()
                okio.ByteString r0 = r0.checkLowercase(r1)
                okio.ByteString r1 = r4.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r2 = r4.headerList
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                r3.<init>(r0, r1)
                r2.add(r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
                r2 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r2.headerList
                java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
                java.util.List<okhttp3.internal.http2.Header> r1 = r2.headerList
                r1.clear()
                return r0
        }

        public final int maxDynamicTableByteCount() {
                r1 = this;
                int r0 = r1.maxDynamicTableByteCount
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.ByteString readByteString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 128(0x80, float:1.8E-43)
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                r2 = 127(0x7f, float:1.78E-43)
                int r0 = r5.readInt(r0, r2)
                long r2 = (long) r0
                if (r1 == 0) goto L27
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okhttp3.internal.http2.Huffman r1 = okhttp3.internal.http2.Huffman.INSTANCE
                okio.BufferedSource r4 = r5.source
                r1.decode(r4, r2, r0)
                okio.ByteString r0 = r0.readByteString()
                goto L2d
            L27:
                okio.BufferedSource r0 = r5.source
                okio.ByteString r0 = r0.readByteString(r2)
            L2d:
                return r0
        }

        public final void readHeaders() throws java.io.IOException {
                r3 = this;
            L0:
                okio.BufferedSource r0 = r3.source
                boolean r0 = r0.exhausted()
                if (r0 != 0) goto L8d
                okio.BufferedSource r0 = r3.source
                byte r0 = r0.readByte()
                r1 = 255(0xff, float:3.57E-43)
                int r0 = okhttp3.internal.Util.and(r0, r1)
                r1 = 128(0x80, float:1.8E-43)
                if (r0 == r1) goto L85
                r2 = r0 & 128(0x80, float:1.8E-43)
                if (r2 != r1) goto L28
                r1 = 127(0x7f, float:1.78E-43)
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readIndexedHeader(r0)
                goto L0
            L28:
                r1 = 64
                if (r0 != r1) goto L30
                r3.readLiteralHeaderWithIncrementalIndexingNewName()
                goto L0
            L30:
                r2 = r0 & 64
                if (r2 != r1) goto L40
                r1 = 63
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithIncrementalIndexingIndexedName(r0)
                goto L0
            L40:
                r1 = r0 & 32
                r2 = 32
                if (r1 != r2) goto L6d
                r1 = 31
                int r0 = r3.readInt(r0, r1)
                r3.maxDynamicTableByteCount = r0
                if (r0 < 0) goto L58
                int r1 = r3.headerTableSizeSetting
                if (r0 > r1) goto L58
                r3.adjustDynamicTableByteCount()
                goto L0
            L58:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid dynamic table size update "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r3.maxDynamicTableByteCount
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L6d:
                r1 = 16
                if (r0 == r1) goto L80
                if (r0 != 0) goto L74
                goto L80
            L74:
                r1 = 15
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithoutIndexingIndexedName(r0)
                goto L0
            L80:
                r3.readLiteralHeaderWithoutIndexingNewName()
                goto L0
            L85:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "index == 0"
                r0.<init>(r1)
                throw r0
            L8d:
                return
        }

        public final int readInt(int r3, int r4) throws java.io.IOException {
                r2 = this;
                r3 = r3 & r4
                if (r3 >= r4) goto L4
                return r3
            L4:
                r3 = 0
            L5:
                int r0 = r2.readByte()
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L14
                r0 = r0 & 127(0x7f, float:1.78E-43)
                int r0 = r0 << r3
                int r4 = r4 + r0
                int r3 = r3 + 7
                goto L5
            L14:
                int r3 = r0 << r3
                int r4 = r4 + r3
                return r4
        }
    }

    /* JADX INFO: compiled from: Hpack.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "headerTableSizeSetting", "", "useCompression", "", "out", "Lokio/Buffer;", "(IZLokio/Buffer;)V", "dynamicTable", "", "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "emitDynamicTableSizeUpdate", "headerCount", "maxDynamicTableByteCount", "nextHeaderIndex", "smallestHeaderTableSizeSetting", "adjustDynamicTableByteCount", "", "clearDynamicTable", "evictToRecoverBytes", "bytesToRecover", "insertIntoDynamicTable", "entry", "resizeHeaderTable", "writeByteString", "data", "Lokio/ByteString;", "writeHeaders", "headerBlock", "", "writeInt", "value", "prefixMask", "bits", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Writer {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public okhttp3.internal.http2.Header[] dynamicTable;

        @kotlin.jvm.JvmField
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;

        @kotlin.jvm.JvmField
        public int headerCount;

        @kotlin.jvm.JvmField
        public int headerTableSizeSetting;

        @kotlin.jvm.JvmField
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        @kotlin.jvm.JvmOverloads
        public Writer(int r7, @org.jetbrains.annotations.NotNull okio.Buffer r8) {
                r6 = this;
                r2 = 0
                r4 = 2
                r5 = 0
                r0 = r6
                r1 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Writer(int r2, boolean r3, @org.jetbrains.annotations.NotNull okio.Buffer r4) {
                r1 = this;
                java.lang.String r0 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.headerTableSizeSetting = r2
                r1.useCompression = r3
                r1.out = r4
                r3 = 2147483647(0x7fffffff, float:NaN)
                r1.smallestHeaderTableSizeSetting = r3
                r1.maxDynamicTableByteCount = r2
                r2 = 8
                okhttp3.internal.http2.Header[] r2 = new okhttp3.internal.http2.Header[r2]
                r1.dynamicTable = r2
                int r2 = r2.length
                int r2 = r2 + (-1)
                r1.nextHeaderIndex = r2
                return
        }

        public /* synthetic */ Writer(int r1, boolean r2, okio.Buffer r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
                r0 = this;
                r5 = r4 & 1
                if (r5 == 0) goto L6
                r1 = 4096(0x1000, float:5.74E-42)
            L6:
                r4 = r4 & 2
                if (r4 == 0) goto Lb
                r2 = 1
            Lb:
                r0.<init>(r1, r2, r3)
                return
        }

        @kotlin.jvm.JvmOverloads
        public Writer(@org.jetbrains.annotations.NotNull okio.Buffer r7) {
                r6 = this;
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r0 = r6
                r3 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private final void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                goto L10
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private final void clearDynamicTable() {
                r2 = this;
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                r1 = 0
                kotlin.collections.ArraysKt.fill$default(r0, r1)
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r2.nextHeaderIndex = r0
                r0 = 0
                r2.headerCount = r0
                r2.dynamicTableByteCount = r0
                return
        }

        private final int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L4f
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L31
                if (r5 <= 0) goto L31
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r2 = r4.dynamicTableByteCount
                okhttp3.internal.http2.Header[] r3 = r4.dynamicTable
                r3 = r3[r1]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r3.hpackSize
                int r2 = r2 - r3
                r4.dynamicTableByteCount = r2
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L31:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r4.nextHeaderIndex
                int r2 = r1 + 1
                int r1 = r1 + 1
                int r1 = r1 + r0
                r3 = 0
                java.util.Arrays.fill(r5, r2, r1, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L4f:
                return r0
        }

        private final void insertIntoDynamicTable(okhttp3.internal.http2.Header r7) {
                r6 = this;
                int r0 = r7.hpackSize
                int r1 = r6.maxDynamicTableByteCount
                if (r0 <= r1) goto La
                r6.clearDynamicTable()
                return
            La:
                int r2 = r6.dynamicTableByteCount
                int r2 = r2 + r0
                int r2 = r2 - r1
                r6.evictToRecoverBytes(r2)
                int r1 = r6.headerCount
                int r1 = r1 + 1
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r3 = r2.length
                if (r1 <= r3) goto L2e
                int r1 = r2.length
                int r1 = r1 * 2
                okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
                r3 = 0
                int r4 = r2.length
                int r5 = r2.length
                java.lang.System.arraycopy(r2, r3, r1, r4, r5)
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r2 = r2.length
                int r2 = r2 + (-1)
                r6.nextHeaderIndex = r2
                r6.dynamicTable = r1
            L2e:
                int r1 = r6.nextHeaderIndex
                int r2 = r1 + (-1)
                r6.nextHeaderIndex = r2
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                r2[r1] = r7
                int r7 = r6.headerCount
                int r7 = r7 + 1
                r6.headerCount = r7
                int r7 = r6.dynamicTableByteCount
                int r7 = r7 + r0
                r6.dynamicTableByteCount = r7
                return
        }

        public final void resizeHeaderTable(int r2) {
                r1 = this;
                r1.headerTableSizeSetting = r2
                r0 = 16384(0x4000, float:2.2959E-41)
                int r2 = java.lang.Math.min(r2, r0)
                int r0 = r1.maxDynamicTableByteCount
                if (r0 != r2) goto Ld
                return
            Ld:
                if (r2 >= r0) goto L17
                int r0 = r1.smallestHeaderTableSizeSetting
                int r0 = java.lang.Math.min(r0, r2)
                r1.smallestHeaderTableSizeSetting = r0
            L17:
                r0 = 1
                r1.emitDynamicTableSizeUpdate = r0
                r1.maxDynamicTableByteCount = r2
                r1.adjustDynamicTableByteCount()
                return
        }

        public final void writeByteString(@org.jetbrains.annotations.NotNull okio.ByteString r5) throws java.io.IOException {
                r4 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r0 = r4.useCompression
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L32
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.INSTANCE
                int r2 = r0.encodedLength(r5)
                int r3 = r5.size()
                if (r2 >= r3) goto L32
                okio.Buffer r2 = new okio.Buffer
                r2.<init>()
                r0.encode(r5, r2)
                okio.ByteString r5 = r2.readByteString()
                int r0 = r5.size()
                r2 = 128(0x80, float:1.8E-43)
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
                goto L3f
            L32:
                int r0 = r5.size()
                r2 = 0
                r4.writeInt(r0, r1, r2)
                okio.Buffer r0 = r4.out
                r0.write(r5)
            L3f:
                return
        }

        public final void writeHeaders(@org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r14) throws java.io.IOException {
                r13 = this;
                java.lang.String r0 = "headerBlock"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                boolean r0 = r13.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L23
                int r0 = r13.smallestHeaderTableSizeSetting
                int r2 = r13.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L17
                r13.writeInt(r0, r4, r3)
            L17:
                r13.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.smallestHeaderTableSizeSetting = r0
                int r0 = r13.maxDynamicTableByteCount
                r13.writeInt(r0, r4, r3)
            L23:
                int r0 = r14.size()
                r2 = 0
            L28:
                if (r2 >= r0) goto L10b
                java.lang.Object r3 = r14.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                okio.ByteString r4 = r3.name
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.value
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r7 = r6.getNAME_TO_FIRST_INDEX()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L7c
                int r7 = r7.intValue()
                int r7 = r7 + 1
                r9 = 7
                r10 = 2
                if (r10 <= r7) goto L52
                goto L7a
            L52:
                if (r9 < r7) goto L7a
                okhttp3.internal.http2.Header[] r9 = r6.getSTATIC_HEADER_TABLE()
                int r10 = r7 + (-1)
                r9 = r9[r10]
                okio.ByteString r9 = r9.value
                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r5)
                if (r9 == 0) goto L66
                r6 = r7
                goto L7e
            L66:
                okhttp3.internal.http2.Header[] r6 = r6.getSTATIC_HEADER_TABLE()
                r6 = r6[r7]
                okio.ByteString r6 = r6.value
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r5)
                if (r6 == 0) goto L7a
                int r6 = r7 + 1
                r12 = r7
                r7 = r6
                r6 = r12
                goto L7e
            L7a:
                r6 = r7
                goto L7d
            L7c:
                r6 = -1
            L7d:
                r7 = -1
            L7e:
                if (r7 != r8) goto Lc4
                int r9 = r13.nextHeaderIndex
                int r9 = r9 + 1
                okhttp3.internal.http2.Header[] r10 = r13.dynamicTable
                int r10 = r10.length
            L87:
                if (r9 >= r10) goto Lc4
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r9]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                okio.ByteString r11 = r11.name
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r4)
                if (r11 == 0) goto Lc1
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r9]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
                okio.ByteString r11 = r11.value
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r5)
                if (r11 == 0) goto Lb3
                int r7 = r13.nextHeaderIndex
                int r9 = r9 - r7
                okhttp3.internal.http2.Hpack r7 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r7 = r7.getSTATIC_HEADER_TABLE()
                int r7 = r7.length
                int r7 = r7 + r9
                goto Lc4
            Lb3:
                if (r6 != r8) goto Lc1
                int r6 = r13.nextHeaderIndex
                int r6 = r9 - r6
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r11 = r11.getSTATIC_HEADER_TABLE()
                int r11 = r11.length
                int r6 = r6 + r11
            Lc1:
                int r9 = r9 + 1
                goto L87
            Lc4:
                if (r7 == r8) goto Lce
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.8E-43)
                r13.writeInt(r7, r3, r4)
                goto L107
            Lce:
                r7 = 64
                if (r6 != r8) goto Le1
                okio.Buffer r6 = r13.out
                r6.writeByte(r7)
                r13.writeByteString(r4)
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
                goto L107
            Le1:
                okio.ByteString r8 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r8 = r4.startsWith(r8)
                if (r8 == 0) goto Lfc
                okio.ByteString r8 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto Lfc
                r3 = 15
                r13.writeInt(r6, r3, r1)
                r13.writeByteString(r5)
                goto L107
            Lfc:
                r4 = 63
                r13.writeInt(r6, r4, r7)
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
            L107:
                int r2 = r2 + 1
                goto L28
            L10b:
                return
        }

        public final void writeInt(int r2, int r3, int r4) {
                r1 = this;
                if (r2 >= r3) goto L9
                okio.Buffer r3 = r1.out
                r2 = r2 | r4
                r3.writeByte(r2)
                return
            L9:
                okio.Buffer r0 = r1.out
                r4 = r4 | r3
                r0.writeByte(r4)
                int r2 = r2 - r3
            L10:
                r3 = 128(0x80, float:1.8E-43)
                if (r2 < r3) goto L1f
                r4 = r2 & 127(0x7f, float:1.78E-43)
                okio.Buffer r0 = r1.out
                r3 = r3 | r4
                r0.writeByte(r3)
                int r2 = r2 >>> 7
                goto L10
            L1f:
                okio.Buffer r3 = r1.out
                r3.writeByte(r2)
                return
        }
    }

    static {
            okhttp3.internal.http2.Hpack r0 = new okhttp3.internal.http2.Hpack
            r0.<init>()
            okhttp3.internal.http2.Hpack.INSTANCE = r0
            r1 = 61
            okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
            java.lang.String r4 = ""
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r5 = "GET"
            r2.<init>(r3, r5)
            r5 = 1
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "POST"
            r2.<init>(r3, r5)
            r3 = 2
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r5 = "/"
            r2.<init>(r3, r5)
            r5 = 3
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "/index.html"
            r2.<init>(r3, r5)
            r3 = 4
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r3 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r5 = "http"
            r2.<init>(r3, r5)
            r5 = 5
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "https"
            r2.<init>(r3, r5)
            r3 = 6
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            okio.ByteString r3 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r5 = "200"
            r2.<init>(r3, r5)
            r5 = 7
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "204"
            r2.<init>(r3, r5)
            r5 = 8
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "206"
            r2.<init>(r3, r5)
            r5 = 9
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "304"
            r2.<init>(r3, r5)
            r5 = 10
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "400"
            r2.<init>(r3, r5)
            r5 = 11
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "404"
            r2.<init>(r3, r5)
            r5 = 12
            r1[r5] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r5 = "500"
            r2.<init>(r3, r5)
            r3 = 13
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "accept-charset"
            r2.<init>(r3, r4)
            r3 = 14
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "accept-encoding"
            java.lang.String r5 = "gzip, deflate"
            r2.<init>(r3, r5)
            r3 = 15
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "accept-language"
            r2.<init>(r3, r4)
            r3 = 16
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "accept-ranges"
            r2.<init>(r3, r4)
            r3 = 17
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "accept"
            r2.<init>(r3, r4)
            r3 = 18
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "access-control-allow-origin"
            r2.<init>(r3, r4)
            r3 = 19
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "age"
            r2.<init>(r3, r4)
            r3 = 20
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "allow"
            r2.<init>(r3, r4)
            r3 = 21
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "authorization"
            r2.<init>(r3, r4)
            r3 = 22
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "cache-control"
            r2.<init>(r3, r4)
            r3 = 23
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-disposition"
            r2.<init>(r3, r4)
            r3 = 24
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-encoding"
            r2.<init>(r3, r4)
            r3 = 25
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-language"
            r2.<init>(r3, r4)
            r3 = 26
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-length"
            r2.<init>(r3, r4)
            r3 = 27
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-location"
            r2.<init>(r3, r4)
            r3 = 28
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-range"
            r2.<init>(r3, r4)
            r3 = 29
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "content-type"
            r2.<init>(r3, r4)
            r3 = 30
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "cookie"
            r2.<init>(r3, r4)
            r3 = 31
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "date"
            r2.<init>(r3, r4)
            r3 = 32
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "etag"
            r2.<init>(r3, r4)
            r3 = 33
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "expect"
            r2.<init>(r3, r4)
            r3 = 34
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "expires"
            r2.<init>(r3, r4)
            r3 = 35
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "from"
            r2.<init>(r3, r4)
            r3 = 36
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "host"
            r2.<init>(r3, r4)
            r3 = 37
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "if-match"
            r2.<init>(r3, r4)
            r3 = 38
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "if-modified-since"
            r2.<init>(r3, r4)
            r3 = 39
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "if-none-match"
            r2.<init>(r3, r4)
            r3 = 40
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "if-range"
            r2.<init>(r3, r4)
            r3 = 41
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "if-unmodified-since"
            r2.<init>(r3, r4)
            r3 = 42
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "last-modified"
            r2.<init>(r3, r4)
            r3 = 43
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "link"
            r2.<init>(r3, r4)
            r3 = 44
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "location"
            r2.<init>(r3, r4)
            r3 = 45
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "max-forwards"
            r2.<init>(r3, r4)
            r3 = 46
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "proxy-authenticate"
            r2.<init>(r3, r4)
            r3 = 47
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "proxy-authorization"
            r2.<init>(r3, r4)
            r3 = 48
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "range"
            r2.<init>(r3, r4)
            r3 = 49
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "referer"
            r2.<init>(r3, r4)
            r3 = 50
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "refresh"
            r2.<init>(r3, r4)
            r3 = 51
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "retry-after"
            r2.<init>(r3, r4)
            r3 = 52
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "server"
            r2.<init>(r3, r4)
            r3 = 53
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "set-cookie"
            r2.<init>(r3, r4)
            r3 = 54
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "strict-transport-security"
            r2.<init>(r3, r4)
            r3 = 55
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "transfer-encoding"
            r2.<init>(r3, r4)
            r3 = 56
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "user-agent"
            r2.<init>(r3, r4)
            r3 = 57
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "vary"
            r2.<init>(r3, r4)
            r3 = 58
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "via"
            r2.<init>(r3, r4)
            r3 = 59
            r1[r3] = r2
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = "www-authenticate"
            r2.<init>(r3, r4)
            r3 = 60
            r1[r3] = r2
            okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE = r1
            java.util.Map r0 = r0.nameToFirstIndex()
            okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX = r0
            return
    }

    private Hpack() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r2 = r1.length
            r0.<init>(r2)
            int r1 = r1.length
            r2 = 0
        La:
            if (r2 >= r1) goto L26
            okhttp3.internal.http2.Header[] r3 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            r4 = r3[r2]
            okio.ByteString r4 = r4.name
            boolean r4 = r0.containsKey(r4)
            if (r4 != 0) goto L23
            r3 = r3[r2]
            okio.ByteString r3 = r3.name
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r4)
        L23:
            int r2 = r2 + 1
            goto La
        L26:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r1 = "Collections.unmodifiableMap(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString checkLowercase(@org.jetbrains.annotations.NotNull okio.ByteString r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L35
            r2 = 65
            byte r2 = (byte) r2
            r3 = 90
            byte r3 = (byte) r3
            byte r4 = r6.getByte(r1)
            if (r2 <= r4) goto L19
            goto L1b
        L19:
            if (r3 >= r4) goto L1e
        L1b:
            int r1 = r1 + 1
            goto La
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "PROTOCOL_ERROR response malformed: mixed case name: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r6 = r6.utf8()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L35:
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<okio.ByteString, java.lang.Integer> getNAME_TO_FIRST_INDEX() {
            r1 = this;
            java.util.Map<okio.ByteString, java.lang.Integer> r0 = okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Header[] getSTATIC_HEADER_TABLE() {
            r1 = this;
            okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            return r0
    }
}
