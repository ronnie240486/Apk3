package okhttp3.internal.http2;

/* JADX INFO: compiled from: Huffman.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "()V", "CODES", "", "CODE_BIT_COUNTS", "", "root", "Lokhttp3/internal/http2/Huffman$Node;", "addCode", "", "symbol", "", "code", "codeBitCount", "decode", "source", "Lokio/BufferedSource;", "byteCount", "", "sink", "Lokio/BufferedSink;", "encode", "Lokio/ByteString;", "encodedLength", "bytes", "Node", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Huffman {
    private static final int[] CODES = null;
    private static final byte[] CODE_BIT_COUNTS = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Huffman INSTANCE = null;
    private static final okhttp3.internal.http2.Huffman.Node root = null;

    /* JADX INFO: compiled from: Huffman.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "()V", "symbol", "", "bits", "(II)V", "children", "", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "[Lokhttp3/internal/http2/Huffman$Node;", "getSymbol", "()I", "terminalBitCount", "getTerminalBitCount", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Node {

        @org.jetbrains.annotations.Nullable
        private final okhttp3.internal.http2.Huffman.Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
                r1 = this;
                r1.<init>()
                r0 = 256(0x100, float:3.59E-43)
                okhttp3.internal.http2.Huffman$Node[] r0 = new okhttp3.internal.http2.Huffman.Node[r0]
                r1.children = r0
                r0 = 0
                r1.symbol = r0
                r1.terminalBitCount = r0
                return
        }

        public Node(int r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.children = r0
                r1.symbol = r2
                r2 = r3 & 7
                if (r2 != 0) goto Le
                r2 = 8
            Le:
                r1.terminalBitCount = r2
                return
        }

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.http2.Huffman.Node[] getChildren() {
                r1 = this;
                okhttp3.internal.http2.Huffman$Node[] r0 = r1.children
                return r0
        }

        public final int getSymbol() {
                r1 = this;
                int r0 = r1.symbol
                return r0
        }

        public final int getTerminalBitCount() {
                r1 = this;
                int r0 = r1.terminalBitCount
                return r0
        }
    }

    static {
            okhttp3.internal.http2.Huffman r0 = new okhttp3.internal.http2.Huffman
            r0.<init>()
            okhttp3.internal.http2.Huffman.INSTANCE = r0
            r1 = 256(0x100, float:3.59E-43)
            int[] r2 = new int[r1]
            r2 = {x0032: FILL_ARRAY_DATA , data: [8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846} // fill-array
            okhttp3.internal.http2.Huffman.CODES = r2
            byte[] r1 = new byte[r1]
            r1 = {x0236: FILL_ARRAY_DATA , data: [13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26} // fill-array
            okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS = r1
            okhttp3.internal.http2.Huffman$Node r2 = new okhttp3.internal.http2.Huffman$Node
            r2.<init>()
            okhttp3.internal.http2.Huffman.root = r2
            int r1 = r1.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L30
            int[] r3 = okhttp3.internal.http2.Huffman.CODES
            r3 = r3[r2]
            byte[] r4 = okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS
            r4 = r4[r2]
            r0.addCode(r2, r3, r4)
            int r2 = r2 + 1
            goto L20
        L30:
            return
    }

    private Huffman() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void addCode(int r4, int r5, int r6) {
            r3 = this;
            okhttp3.internal.http2.Huffman$Node r0 = new okhttp3.internal.http2.Huffman$Node
            r0.<init>(r4, r6)
            okhttp3.internal.http2.Huffman$Node r4 = okhttp3.internal.http2.Huffman.root
        L7:
            r1 = 8
            if (r6 <= r1) goto L25
            int r6 = r6 + (-8)
            int r1 = r5 >>> r6
            r1 = r1 & 255(0xff, float:3.57E-43)
            okhttp3.internal.http2.Huffman$Node[] r4 = r4.getChildren()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r2 = r4[r1]
            if (r2 != 0) goto L23
            okhttp3.internal.http2.Huffman$Node r2 = new okhttp3.internal.http2.Huffman$Node
            r2.<init>()
            r4[r1] = r2
        L23:
            r4 = r2
            goto L7
        L25:
            int r1 = r1 - r6
            int r5 = r5 << r1
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 1
            int r6 = r6 << r1
            okhttp3.internal.http2.Huffman$Node[] r4 = r4.getChildren()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r6 = r6 + r5
            kotlin.collections.ArraysKt.fill(r4, r0, r5, r6)
            return
    }

    public final void decode(@org.jetbrains.annotations.NotNull okio.BufferedSource r9, long r10, @org.jetbrains.annotations.NotNull okio.BufferedSink r12) {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.http2.Huffman$Node r0 = okhttp3.internal.http2.Huffman.root
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L13:
            r5 = 255(0xff, float:3.57E-43)
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 >= 0) goto L56
            byte r6 = r9.readByte()
            int r6 = okhttp3.internal.Util.and(r6, r5)
            int r1 = r1 << 8
            r1 = r1 | r6
            int r2 = r2 + 8
        L26:
            r6 = 8
            if (r2 < r6) goto L52
            int r6 = r2 + (-8)
            int r7 = r1 >>> r6
            r7 = r7 & r5
            okhttp3.internal.http2.Huffman$Node[] r0 = r0.getChildren()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0 = r0[r7]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.internal.http2.Huffman$Node[] r7 = r0.getChildren()
            if (r7 != 0) goto L50
            int r6 = r0.getSymbol()
            r12.writeByte(r6)
            int r0 = r0.getTerminalBitCount()
            int r2 = r2 - r0
            okhttp3.internal.http2.Huffman$Node r0 = okhttp3.internal.http2.Huffman.root
            goto L26
        L50:
            r2 = r6
            goto L26
        L52:
            r5 = 1
            long r3 = r3 + r5
            goto L13
        L56:
            if (r2 <= 0) goto L85
            int r9 = 8 - r2
            int r9 = r1 << r9
            r9 = r9 & r5
            okhttp3.internal.http2.Huffman$Node[] r10 = r0.getChildren()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r9 = r10[r9]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            okhttp3.internal.http2.Huffman$Node[] r10 = r9.getChildren()
            if (r10 != 0) goto L85
            int r10 = r9.getTerminalBitCount()
            if (r10 <= r2) goto L76
            goto L85
        L76:
            int r10 = r9.getSymbol()
            r12.writeByte(r10)
            int r9 = r9.getTerminalBitCount()
            int r2 = r2 - r9
            okhttp3.internal.http2.Huffman$Node r0 = okhttp3.internal.http2.Huffman.root
            goto L56
        L85:
            return
    }

    public final void encode(@org.jetbrains.annotations.NotNull okio.ByteString r9, @org.jetbrains.annotations.NotNull okio.BufferedSink r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = 0
        L15:
            if (r1 >= r0) goto L3d
            byte r5 = r9.getByte(r1)
            r6 = 255(0xff, float:3.57E-43)
            int r5 = okhttp3.internal.Util.and(r5, r6)
            int[] r6 = okhttp3.internal.http2.Huffman.CODES
            r6 = r6[r5]
            byte[] r7 = okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS
            r5 = r7[r5]
            long r3 = r3 << r5
            long r6 = (long) r6
            long r3 = r3 | r6
            int r2 = r2 + r5
        L2d:
            r5 = 8
            if (r2 < r5) goto L3a
            int r2 = r2 + (-8)
            long r5 = r3 >> r2
            int r6 = (int) r5
            r10.writeByte(r6)
            goto L2d
        L3a:
            int r1 = r1 + 1
            goto L15
        L3d:
            if (r2 <= 0) goto L4c
            int r9 = 8 - r2
            long r0 = r3 << r9
            r3 = 255(0xff, double:1.26E-321)
            long r2 = r3 >>> r2
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.writeByte(r9)
        L4c:
            return
    }

    public final int encodedLength(@org.jetbrains.annotations.NotNull okio.ByteString r7) {
            r6 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.size()
            r1 = 0
            r3 = 0
        Lc:
            if (r3 >= r0) goto L21
            byte r4 = r7.getByte(r3)
            r5 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal.Util.and(r4, r5)
            byte[] r5 = okhttp3.internal.http2.Huffman.CODE_BIT_COUNTS
            r4 = r5[r4]
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto Lc
        L21:
            r7 = 7
            long r3 = (long) r7
            long r1 = r1 + r3
            r7 = 3
            long r0 = r1 >> r7
            int r7 = (int) r0
            return r7
    }
}
