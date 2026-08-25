package com.google.android.material.color;

/* JADX INFO: loaded from: classes2.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final com.google.android.material.color.ColorResourcesTableCreator.PackageInfo ANDROID_PACKAGE_INFO = null;
    private static final byte APPLICATION_PACKAGE_ID = 127;
    private static final java.util.Comparator<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> COLOR_RESOURCE_COMPARATOR = null;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final java.lang.String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;


    public static class ColorResource {
        private final short entryId;
        private final java.lang.String name;
        private final byte packageId;
        private final byte typeId;

        @androidx.annotation.ColorInt
        private final int value;

        public ColorResource(int r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r2
                r0.value = r3
                r2 = 65535(0xffff, float:9.1834E-41)
                r2 = r2 & r1
                short r2 = (short) r2
                r0.entryId = r2
                int r2 = r1 >> 16
                r2 = r2 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r0.typeId = r2
                int r1 = r1 >> 24
                r1 = r1 & 255(0xff, float:3.57E-43)
                byte r1 = (byte) r1
                r0.packageId = r1
                return
        }

        public static /* synthetic */ short access$000(com.google.android.material.color.ColorResourcesTableCreator.ColorResource r0) {
                short r0 = r0.entryId
                return r0
        }

        public static /* synthetic */ java.lang.String access$100(com.google.android.material.color.ColorResourcesTableCreator.ColorResource r0) {
                java.lang.String r0 = r0.name
                return r0
        }

        public static /* synthetic */ int access$1400(com.google.android.material.color.ColorResourcesTableCreator.ColorResource r0) {
                int r0 = r0.value
                return r0
        }

        public static /* synthetic */ byte access$200(com.google.android.material.color.ColorResourcesTableCreator.ColorResource r0) {
                byte r0 = r0.typeId
                return r0
        }

        public static /* synthetic */ byte access$300(com.google.android.material.color.ColorResourcesTableCreator.ColorResource r0) {
                byte r0 = r0.packageId
                return r0
        }
    }

    public static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk keyStrings;
        private final com.google.android.material.color.ColorResourcesTableCreator.PackageInfo packageInfo;
        private final com.google.android.material.color.ColorResourcesTableCreator.TypeSpecChunk typeSpecChunk;
        private final com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk typeStrings;

        public PackageChunk(com.google.android.material.color.ColorResourcesTableCreator.PackageInfo r7, java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> r8) {
                r6 = this;
                r6.<init>()
                r6.packageInfo = r7
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r7 = new com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk
                java.lang.String r0 = "?1"
                java.lang.String r1 = "?2"
                java.lang.String r2 = "?3"
                java.lang.String r3 = "?4"
                java.lang.String r4 = "?5"
                java.lang.String r5 = "color"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
                r1 = 0
                r7.<init>(r1, r0)
                r6.typeStrings = r7
                int r7 = r8.size()
                java.lang.String[] r7 = new java.lang.String[r7]
            L23:
                int r0 = r8.size()
                if (r1 >= r0) goto L38
                java.lang.Object r0 = r8.get(r1)
                com.google.android.material.color.ColorResourcesTableCreator$ColorResource r0 = (com.google.android.material.color.ColorResourcesTableCreator.ColorResource) r0
                java.lang.String r0 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$100(r0)
                r7[r1] = r0
                int r1 = r1 + 1
                goto L23
            L38:
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = new com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk
                r1 = 1
                r0.<init>(r1, r7)
                r6.keyStrings = r0
                com.google.android.material.color.ColorResourcesTableCreator$TypeSpecChunk r7 = new com.google.android.material.color.ColorResourcesTableCreator$TypeSpecChunk
                r7.<init>(r8)
                r6.typeSpecChunk = r7
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r7 = new com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader
                r8 = 512(0x200, float:7.17E-43)
                r0 = 288(0x120, float:4.04E-43)
                int r1 = r6.getChunkSize()
                r7.<init>(r8, r0, r1)
                r6.header = r7
                return
        }

        public final int getChunkSize() {
                r2 = this;
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = r2.typeStrings
                int r0 = r0.getChunkSize()
                int r0 = r0 + 288
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r1 = r2.keyStrings
                int r1 = r1.getChunkSize()
                int r0 = r0 + r1
                com.google.android.material.color.ColorResourcesTableCreator$TypeSpecChunk r1 = r2.typeSpecChunk
                int r1 = r1.getChunkSizeWithTypeChunk()
                int r0 = r0 + r1
                return r0
        }

        public final void writeTo(java.io.ByteArrayOutputStream r5) throws java.io.IOException {
                r4 = this;
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r0 = r4.header
                r0.writeTo(r5)
                com.google.android.material.color.ColorResourcesTableCreator$PackageInfo r0 = r4.packageInfo
                int r0 = com.google.android.material.color.ColorResourcesTableCreator.PackageInfo.access$1000(r0)
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r5.write(r0)
                com.google.android.material.color.ColorResourcesTableCreator$PackageInfo r0 = r4.packageInfo
                java.lang.String r0 = com.google.android.material.color.ColorResourcesTableCreator.PackageInfo.access$1100(r0)
                char[] r0 = r0.toCharArray()
                r1 = 0
                r2 = 0
            L1e:
                r3 = 128(0x80, float:1.8E-43)
                if (r2 >= r3) goto L39
                int r3 = r0.length
                if (r2 >= r3) goto L2f
                char r3 = r0[r2]
                byte[] r3 = com.google.android.material.color.ColorResourcesTableCreator.access$1200(r3)
                r5.write(r3)
                goto L36
            L2f:
                byte[] r3 = com.google.android.material.color.ColorResourcesTableCreator.access$1200(r1)
                r5.write(r3)
            L36:
                int r2 = r2 + 1
                goto L1e
            L39:
                r0 = 288(0x120, float:4.04E-43)
                byte[] r2 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r5.write(r2)
                byte[] r2 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r1)
                r5.write(r2)
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r2 = r4.typeStrings
                int r2 = r2.getChunkSize()
                int r2 = r2 + r0
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r2)
                r5.write(r0)
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r1)
                r5.write(r0)
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r1)
                r5.write(r0)
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = r4.typeStrings
                r0.writeTo(r5)
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = r4.keyStrings
                r0.writeTo(r5)
                com.google.android.material.color.ColorResourcesTableCreator$TypeSpecChunk r0 = r4.typeSpecChunk
                r0.writeTo(r5)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class PackageInfo {
        private final int id;
        private final java.lang.String name;

        public PackageInfo(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.name = r2
                return
        }

        public static /* synthetic */ int access$1000(com.google.android.material.color.ColorResourcesTableCreator.PackageInfo r0) {
                int r0 = r0.id
                return r0
        }

        public static /* synthetic */ java.lang.String access$1100(com.google.android.material.color.ColorResourcesTableCreator.PackageInfo r0) {
                java.lang.String r0 = r0.name
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        public ResChunkHeader(short r1, short r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.headerSize = r2
                r0.chunkSize = r3
                return
        }

        public final void writeTo(java.io.ByteArrayOutputStream r2) throws java.io.IOException {
                r1 = this;
                short r0 = r1.type
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$600(r0)
                r2.write(r0)
                short r0 = r1.headerSize
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$600(r0)
                r2.write(r0)
                int r0 = r1.chunkSize
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r2.write(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        public ResEntry(int r1, @androidx.annotation.ColorInt int r2) {
                r0 = this;
                r0.<init>()
                r0.keyStringIndex = r1
                r0.data = r2
                return
        }

        public final void writeTo(java.io.ByteArrayOutputStream r4) throws java.io.IOException {
                r3 = this;
                r0 = 8
                byte[] r1 = com.google.android.material.color.ColorResourcesTableCreator.access$600(r0)
                r4.write(r1)
                r1 = 2
                byte[] r2 = com.google.android.material.color.ColorResourcesTableCreator.access$600(r1)
                r4.write(r2)
                int r2 = r3.keyStringIndex
                byte[] r2 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r2)
                r4.write(r2)
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$600(r0)
                r4.write(r0)
                byte[] r0 = new byte[r1]
                r0 = {x0034: FILL_ARRAY_DATA , data: [0, 28} // fill-array
                r4.write(r0)
                int r0 = r3.data
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r4.write(r0)
                return
        }
    }

    public static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final java.util.List<com.google.android.material.color.ColorResourcesTableCreator.PackageChunk> packageChunks;
        private final int packageCount;
        private final com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk stringPool;

        public ResTable(java.util.Map<com.google.android.material.color.ColorResourcesTableCreator.PackageInfo, java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource>> r5) {
                r4 = this;
                r4.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.packageChunks = r0
                int r0 = r5.size()
                r4.packageCount = r0
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = new com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk
                r1 = 0
                java.lang.String[] r2 = new java.lang.String[r1]
                r0.<init>(r1, r2)
                r4.stringPool = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L22:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L4c
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                java.util.List r1 = (java.util.List) r1
                java.util.Comparator r2 = com.google.android.material.color.ColorResourcesTableCreator.access$400()
                java.util.Collections.sort(r1, r2)
                java.util.List<com.google.android.material.color.ColorResourcesTableCreator$PackageChunk> r2 = r4.packageChunks
                com.google.android.material.color.ColorResourcesTableCreator$PackageChunk r3 = new com.google.android.material.color.ColorResourcesTableCreator$PackageChunk
                java.lang.Object r0 = r0.getKey()
                com.google.android.material.color.ColorResourcesTableCreator$PackageInfo r0 = (com.google.android.material.color.ColorResourcesTableCreator.PackageInfo) r0
                r3.<init>(r0, r1)
                r2.add(r3)
                goto L22
            L4c:
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r5 = new com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader
                r0 = 2
                r1 = 12
                int r2 = r4.getOverallSize()
                r5.<init>(r0, r1, r2)
                r4.header = r5
                return
        }

        private int getOverallSize() {
                r3 = this;
                java.util.List<com.google.android.material.color.ColorResourcesTableCreator$PackageChunk> r0 = r3.packageChunks
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L19
                java.lang.Object r2 = r0.next()
                com.google.android.material.color.ColorResourcesTableCreator$PackageChunk r2 = (com.google.android.material.color.ColorResourcesTableCreator.PackageChunk) r2
                int r2 = r2.getChunkSize()
                int r1 = r1 + r2
                goto L7
            L19:
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = r3.stringPool
                int r0 = r0.getChunkSize()
                int r0 = r0 + 12
                int r0 = r0 + r1
                return r0
        }

        public final void writeTo(java.io.ByteArrayOutputStream r3) throws java.io.IOException {
                r2 = this;
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r0 = r2.header
                r0.writeTo(r3)
                int r0 = r2.packageCount
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r3.write(r0)
                com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk r0 = r2.stringPool
                r0.writeTo(r3)
                java.util.List<com.google.android.material.color.ColorResourcesTableCreator$PackageChunk> r0 = r2.packageChunks
                java.util.Iterator r0 = r0.iterator()
            L19:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L29
                java.lang.Object r1 = r0.next()
                com.google.android.material.color.ColorResourcesTableCreator$PackageChunk r1 = (com.google.android.material.color.ColorResourcesTableCreator.PackageChunk) r1
                r1.writeTo(r3)
                goto L19
            L29:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final int stringCount;
        private final java.util.List<java.lang.Integer> stringIndex;
        private final java.util.List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final java.util.List<java.lang.Integer> styledSpanIndex;
        private final java.util.List<java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        public StringPoolChunk(boolean r9, java.lang.String... r10) {
                r8 = this;
                r8.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r8.stringIndex = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r8.styledSpanIndex = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r8.strings = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r8.styledSpans = r0
                r8.utf8Encode = r9
                int r9 = r10.length
                r0 = 0
                r1 = 0
                r2 = 0
            L25:
                if (r1 >= r9) goto L4d
                r3 = r10[r1]
                android.util.Pair r3 = r8.processString(r3)
                java.util.List<java.lang.Integer> r4 = r8.stringIndex
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r4.add(r5)
                java.lang.Object r4 = r3.first
                byte[] r4 = (byte[]) r4
                int r5 = r4.length
                int r2 = r2 + r5
                java.util.List<byte[]> r5 = r8.strings
                r5.add(r4)
                java.util.List<java.util.List<com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan>> r4 = r8.styledSpans
                java.lang.Object r3 = r3.second
                java.util.List r3 = (java.util.List) r3
                r4.add(r3)
                int r1 = r1 + 1
                goto L25
            L4d:
                java.util.List<java.util.List<com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan>> r9 = r8.styledSpans
                java.util.Iterator r9 = r9.iterator()
                r1 = 0
            L54:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L9c
                java.lang.Object r3 = r9.next()
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r4 = r3.iterator()
            L64:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L89
                java.lang.Object r5 = r4.next()
                com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan r5 = (com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan) r5
                java.util.List<java.lang.Integer> r6 = r8.stringIndex
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                r6.add(r7)
                byte[] r6 = com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan.access$700(r5)
                int r6 = r6.length
                int r2 = r2 + r6
                java.util.List<byte[]> r6 = r8.strings
                byte[] r5 = com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan.access$700(r5)
                r6.add(r5)
                goto L64
            L89:
                java.util.List<java.lang.Integer> r4 = r8.styledSpanIndex
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                r4.add(r5)
                int r3 = r3.size()
                int r3 = r3 * 12
                int r3 = r3 + 4
                int r1 = r1 + r3
                goto L54
            L9c:
                int r9 = r2 % 4
                if (r9 != 0) goto La2
                r9 = 0
                goto La4
            La2:
                int r9 = 4 - r9
            La4:
                r8.stringsPaddingSize = r9
                java.util.List<byte[]> r3 = r8.strings
                int r3 = r3.size()
                r8.stringCount = r3
                java.util.List<byte[]> r4 = r8.strings
                int r4 = r4.size()
                int r5 = r10.length
                int r4 = r4 - r5
                r8.styledSpanCount = r4
                java.util.List<byte[]> r4 = r8.strings
                int r4 = r4.size()
                int r10 = r10.length
                int r4 = r4 - r10
                r10 = 1
                if (r4 <= 0) goto Lc5
                r4 = 1
                goto Lc6
            Lc5:
                r4 = 0
            Lc6:
                if (r4 != 0) goto Ld2
                java.util.List<java.lang.Integer> r5 = r8.styledSpanIndex
                r5.clear()
                java.util.List<java.util.List<com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan>> r5 = r8.styledSpans
                r5.clear()
            Ld2:
                int r3 = r3 * 4
                r5 = 28
                int r3 = r3 + r5
                java.util.List<java.lang.Integer> r6 = r8.styledSpanIndex
                int r6 = r6.size()
                int r6 = r6 * 4
                int r6 = r6 + r3
                r8.stringsStart = r6
                int r2 = r2 + r9
                if (r4 == 0) goto Le8
                int r9 = r6 + r2
                goto Le9
            Le8:
                r9 = 0
            Le9:
                r8.styledSpansStart = r9
                int r6 = r6 + r2
                if (r4 == 0) goto Lef
                r0 = r1
            Lef:
                int r6 = r6 + r0
                r8.chunkSize = r6
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r9 = new com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader
                r9.<init>(r10, r5, r6)
                r8.header = r9
                return
        }

        private android.util.Pair<byte[], java.util.List<com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan>> processString(java.lang.String r3) {
                r2 = this;
                android.util.Pair r0 = new android.util.Pair
                boolean r1 = r2.utf8Encode
                if (r1 == 0) goto Lb
                byte[] r3 = com.google.android.material.color.ColorResourcesTableCreator.access$800(r3)
                goto Lf
            Lb:
                byte[] r3 = com.google.android.material.color.ColorResourcesTableCreator.access$900(r3)
            Lf:
                java.util.List r1 = java.util.Collections.emptyList()
                r0.<init>(r3, r1)
                return r0
        }

        public final int getChunkSize() {
                r1 = this;
                int r0 = r1.chunkSize
                return r0
        }

        public final void writeTo(java.io.ByteArrayOutputStream r4) throws java.io.IOException {
                r3 = this;
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r0 = r3.header
                r0.writeTo(r4)
                int r0 = r3.stringCount
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r4.write(r0)
                int r0 = r3.styledSpanCount
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r4.write(r0)
                boolean r0 = r3.utf8Encode
                if (r0 == 0) goto L1e
                r0 = 256(0x100, float:3.59E-43)
                goto L1f
            L1e:
                r0 = 0
            L1f:
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r4.write(r0)
                int r0 = r3.stringsStart
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r4.write(r0)
                int r0 = r3.styledSpansStart
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r4.write(r0)
                java.util.List<java.lang.Integer> r0 = r3.stringIndex
                java.util.Iterator r0 = r0.iterator()
            L3e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                byte[] r1 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r1)
                r4.write(r1)
                goto L3e
            L56:
                java.util.List<java.lang.Integer> r0 = r3.styledSpanIndex
                java.util.Iterator r0 = r0.iterator()
            L5c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L74
                java.lang.Object r1 = r0.next()
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                byte[] r1 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r1)
                r4.write(r1)
                goto L5c
            L74:
                java.util.List<byte[]> r0 = r3.strings
                java.util.Iterator r0 = r0.iterator()
            L7a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L8a
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                r4.write(r1)
                goto L7a
            L8a:
                int r0 = r3.stringsPaddingSize
                if (r0 <= 0) goto L93
                byte[] r0 = new byte[r0]
                r4.write(r0)
            L93:
                java.util.List<java.util.List<com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan>> r0 = r3.styledSpans
                java.util.Iterator r0 = r0.iterator()
            L99:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lc2
                java.lang.Object r1 = r0.next()
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            La9:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lb9
                java.lang.Object r2 = r1.next()
                com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan r2 = (com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan) r2
                r2.writeTo(r4)
                goto La9
            Lb9:
                r1 = -1
                byte[] r1 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r1)
                r4.write(r1)
                goto L99
            Lc2:
                return
        }
    }

    public static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ byte[] access$700(com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan r0) {
                byte[] r0 = r0.styleString
                return r0
        }

        public final void writeTo(java.io.ByteArrayOutputStream r2) throws java.io.IOException {
                r1 = this;
                int r0 = r1.nameReference
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r2.write(r0)
                int r0 = r1.firstCharacterIndex
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r2.write(r0)
                int r0 = r1.lastCharacterIndex
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r2.write(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final int[] offsetTable;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResEntry[] resEntries;

        public TypeChunk(java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> r6, java.util.Set<java.lang.Short> r7, int r8) {
                r5 = this;
                r5.<init>()
                r0 = 64
                byte[] r1 = new byte[r0]
                r5.config = r1
                r5.entryCount = r8
                r2 = 0
                r1[r2] = r0
                int r0 = r6.size()
                com.google.android.material.color.ColorResourcesTableCreator$ResEntry[] r0 = new com.google.android.material.color.ColorResourcesTableCreator.ResEntry[r0]
                r5.resEntries = r0
                r0 = 0
            L17:
                int r1 = r6.size()
                if (r0 >= r1) goto L33
                java.lang.Object r1 = r6.get(r0)
                com.google.android.material.color.ColorResourcesTableCreator$ColorResource r1 = (com.google.android.material.color.ColorResourcesTableCreator.ColorResource) r1
                com.google.android.material.color.ColorResourcesTableCreator$ResEntry[] r3 = r5.resEntries
                com.google.android.material.color.ColorResourcesTableCreator$ResEntry r4 = new com.google.android.material.color.ColorResourcesTableCreator$ResEntry
                int r1 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$1400(r1)
                r4.<init>(r0, r1)
                r3[r0] = r4
                int r0 = r0 + 1
                goto L17
            L33:
                int[] r6 = new int[r8]
                r5.offsetTable = r6
                r6 = 0
            L38:
                if (r2 >= r8) goto L54
                java.lang.Short r0 = java.lang.Short.valueOf(r2)
                boolean r0 = r7.contains(r0)
                if (r0 == 0) goto L4b
                int[] r0 = r5.offsetTable
                r0[r2] = r6
                int r6 = r6 + 16
                goto L50
            L4b:
                int[] r0 = r5.offsetTable
                r1 = -1
                r0[r2] = r1
            L50:
                int r2 = r2 + 1
                short r2 = (short) r2
                goto L38
            L54:
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r6 = new com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader
                r7 = 513(0x201, float:7.19E-43)
                r8 = 84
                int r0 = r5.getEntryStart()
                com.google.android.material.color.ColorResourcesTableCreator$ResEntry[] r1 = r5.resEntries
                int r1 = r1.length
                int r1 = r1 * 16
                int r1 = r1 + r0
                r6.<init>(r7, r8, r1)
                r5.header = r6
                return
        }

        private int getEntryStart() {
                r1 = this;
                int r0 = r1.getOffsetTableSize()
                int r0 = r0 + 84
                return r0
        }

        private int getOffsetTableSize() {
                r1 = this;
                int[] r0 = r1.offsetTable
                int r0 = r0.length
                int r0 = r0 * 4
                return r0
        }

        public final int getChunkSize() {
                r2 = this;
                int r0 = r2.getEntryStart()
                com.google.android.material.color.ColorResourcesTableCreator$ResEntry[] r1 = r2.resEntries
                int r1 = r1.length
                int r1 = r1 * 16
                int r1 = r1 + r0
                return r1
        }

        public final void writeTo(java.io.ByteArrayOutputStream r6) throws java.io.IOException {
                r5 = this;
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r0 = r5.header
                r0.writeTo(r6)
                r0 = 4
                byte[] r0 = new byte[r0]
                byte r1 = com.google.android.material.color.ColorResourcesTableCreator.access$1300()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                r0[r1] = r2
                r1 = 2
                r0[r1] = r2
                r1 = 3
                r0[r1] = r2
                r6.write(r0)
                int r0 = r5.entryCount
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r6.write(r0)
                int r0 = r5.getEntryStart()
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r6.write(r0)
                byte[] r0 = r5.config
                r6.write(r0)
                int[] r0 = r5.offsetTable
                int r1 = r0.length
                r3 = 0
            L38:
                if (r3 >= r1) goto L46
                r4 = r0[r3]
                byte[] r4 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r4)
                r6.write(r4)
                int r3 = r3 + 1
                goto L38
            L46:
                com.google.android.material.color.ColorResourcesTableCreator$ResEntry[] r0 = r5.resEntries
                int r1 = r0.length
            L49:
                if (r2 >= r1) goto L53
                r3 = r0[r2]
                r3.writeTo(r6)
                int r2 = r2 + 1
                goto L49
            L53:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader header;
        private final com.google.android.material.color.ColorResourcesTableCreator.TypeChunk typeChunk;

        public TypeSpecChunk(java.util.List<com.google.android.material.color.ColorResourcesTableCreator.ColorResource> r6) {
                r5 = this;
                r5.<init>()
                int r0 = r6.size()
                int r0 = r0 + (-1)
                java.lang.Object r0 = r6.get(r0)
                com.google.android.material.color.ColorResourcesTableCreator$ColorResource r0 = (com.google.android.material.color.ColorResourcesTableCreator.ColorResource) r0
                short r0 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$000(r0)
                int r0 = r0 + 1
                r5.entryCount = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Iterator r1 = r6.iterator()
            L20:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L38
                java.lang.Object r2 = r1.next()
                com.google.android.material.color.ColorResourcesTableCreator$ColorResource r2 = (com.google.android.material.color.ColorResourcesTableCreator.ColorResource) r2
                short r2 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$000(r2)
                java.lang.Short r2 = java.lang.Short.valueOf(r2)
                r0.add(r2)
                goto L20
            L38:
                int r1 = r5.entryCount
                int[] r1 = new int[r1]
                r5.entryFlags = r1
                r1 = 0
            L3f:
                int r2 = r5.entryCount
                if (r1 >= r2) goto L57
                java.lang.Short r2 = java.lang.Short.valueOf(r1)
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L53
                int[] r2 = r5.entryFlags
                r3 = 1073741824(0x40000000, float:2.0)
                r2[r1] = r3
            L53:
                int r1 = r1 + 1
                short r1 = (short) r1
                goto L3f
            L57:
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r1 = new com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader
                r2 = 514(0x202, float:7.2E-43)
                r3 = 16
                int r4 = r5.getChunkSize()
                r1.<init>(r2, r3, r4)
                r5.header = r1
                com.google.android.material.color.ColorResourcesTableCreator$TypeChunk r1 = new com.google.android.material.color.ColorResourcesTableCreator$TypeChunk
                int r2 = r5.entryCount
                r1.<init>(r6, r0, r2)
                r5.typeChunk = r1
                return
        }

        private int getChunkSize() {
                r1 = this;
                int r0 = r1.entryCount
                int r0 = r0 * 4
                int r0 = r0 + 16
                return r0
        }

        public final int getChunkSizeWithTypeChunk() {
                r2 = this;
                int r0 = r2.getChunkSize()
                com.google.android.material.color.ColorResourcesTableCreator$TypeChunk r1 = r2.typeChunk
                int r1 = r1.getChunkSize()
                int r0 = r0 + r1
                return r0
        }

        public final void writeTo(java.io.ByteArrayOutputStream r5) throws java.io.IOException {
                r4 = this;
                com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader r0 = r4.header
                r0.writeTo(r5)
                r0 = 4
                byte[] r0 = new byte[r0]
                byte r1 = com.google.android.material.color.ColorResourcesTableCreator.access$1300()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                r0[r1] = r2
                r1 = 2
                r0[r1] = r2
                r1 = 3
                r0[r1] = r2
                r5.write(r0)
                int r0 = r4.entryCount
                byte[] r0 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r0)
                r5.write(r0)
                int[] r0 = r4.entryFlags
                int r1 = r0.length
            L27:
                if (r2 >= r1) goto L35
                r3 = r0[r2]
                byte[] r3 = com.google.android.material.color.ColorResourcesTableCreator.access$500(r3)
                r5.write(r3)
                int r2 = r2 + 1
                goto L27
            L35:
                com.google.android.material.color.ColorResourcesTableCreator$TypeChunk r0 = r4.typeChunk
                r0.writeTo(r5)
                return
        }
    }

    static {
            com.google.android.material.color.ColorResourcesTableCreator$PackageInfo r0 = new com.google.android.material.color.ColorResourcesTableCreator$PackageInfo
            r1 = 1
            java.lang.String r2 = "android"
            r0.<init>(r1, r2)
            com.google.android.material.color.ColorResourcesTableCreator.ANDROID_PACKAGE_INFO = r0
            com.google.android.material.color.ColorResourcesTableCreator$1 r0 = new com.google.android.material.color.ColorResourcesTableCreator$1
            r0.<init>()
            com.google.android.material.color.ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR = r0
            return
    }

    private ColorResourcesTableCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ byte[] access$1200(char r0) {
            byte[] r0 = charToByteArray(r0)
            return r0
    }

    public static /* synthetic */ byte access$1300() {
            byte r0 = com.google.android.material.color.ColorResourcesTableCreator.typeIdColor
            return r0
    }

    public static /* synthetic */ java.util.Comparator access$400() {
            java.util.Comparator<com.google.android.material.color.ColorResourcesTableCreator$ColorResource> r0 = com.google.android.material.color.ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR
            return r0
    }

    public static /* synthetic */ byte[] access$500(int r0) {
            byte[] r0 = intToByteArray(r0)
            return r0
    }

    public static /* synthetic */ byte[] access$600(short r0) {
            byte[] r0 = shortToByteArray(r0)
            return r0
    }

    public static /* synthetic */ byte[] access$800(java.lang.String r0) {
            byte[] r0 = stringToByteArrayUtf8(r0)
            return r0
    }

    public static /* synthetic */ byte[] access$900(java.lang.String r0) {
            byte[] r0 = stringToByteArray(r0)
            return r0
    }

    private static byte[] charToByteArray(char r3) {
            r0 = 2
            byte[] r0 = new byte[r0]
            r1 = r3 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 1
            r0[r1] = r3
            return r0
    }

    public static byte[] create(android.content.Context r8, java.util.Map<java.lang.Integer, java.lang.Integer> r9) throws java.io.IOException {
            java.util.Set r0 = r9.entrySet()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L100
            com.google.android.material.color.ColorResourcesTableCreator$PackageInfo r0 = new com.google.android.material.color.ColorResourcesTableCreator$PackageInfo
            java.lang.String r1 = r8.getPackageName()
            r2 = 127(0x7f, float:1.78E-43)
            r0.<init>(r2, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3 = 0
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L23:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lde
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            com.google.android.material.color.ColorResourcesTableCreator$ColorResource r4 = new com.google.android.material.color.ColorResourcesTableCreator$ColorResource
            java.lang.Object r5 = r3.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            android.content.res.Resources r6 = r8.getResources()
            java.lang.Object r7 = r3.getKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r6 = r6.getResourceName(r7)
            java.lang.Object r7 = r3.getValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r5 = r8.getResources()
            java.lang.Object r3 = r3.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = r5.getResourceTypeName(r3)
            java.lang.String r5 = "color"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lb5
            byte r3 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$300(r4)
            r5 = 1
            if (r3 != r5) goto L7e
            com.google.android.material.color.ColorResourcesTableCreator$PackageInfo r3 = com.google.android.material.color.ColorResourcesTableCreator.ANDROID_PACKAGE_INFO
            goto L85
        L7e:
            byte r3 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$300(r4)
            if (r3 != r2) goto L9e
            r3 = r0
        L85:
            boolean r5 = r1.containsKey(r3)
            if (r5 != 0) goto L93
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r3, r5)
        L93:
            java.lang.Object r3 = r1.get(r3)
            java.util.List r3 = (java.util.List) r3
            r3.add(r4)
            r3 = r4
            goto L23
        L9e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Not supported with unknown package id: "
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            byte r0 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$300(r4)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lb5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Non color resource found: name="
            java.lang.StringBuilder r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9)
            java.lang.String r0 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$100(r4)
            r9.append(r0)
            java.lang.String r0 = ", typeId="
            r9.append(r0)
            byte r0 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$200(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lde:
            byte r8 = com.google.android.material.color.ColorResourcesTableCreator.ColorResource.access$200(r3)
            com.google.android.material.color.ColorResourcesTableCreator.typeIdColor = r8
            if (r8 == 0) goto Lf8
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
            r8.<init>()
            com.google.android.material.color.ColorResourcesTableCreator$ResTable r9 = new com.google.android.material.color.ColorResourcesTableCreator$ResTable
            r9.<init>(r1)
            r9.writeTo(r8)
            byte[] r8 = r8.toByteArray()
            return r8
        Lf8:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "No color resources found for harmonization."
            r8.<init>(r9)
            throw r8
        L100:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "No color resources provided for harmonization."
            r8.<init>(r9)
            throw r8
    }

    private static byte[] intToByteArray(int r3) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r1 = r3 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            int r1 = r3 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 1
            r0[r2] = r1
            int r1 = r3 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 2
            r0[r2] = r1
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 3
            r0[r1] = r3
            return r0
    }

    private static byte[] shortToByteArray(short r3) {
            r0 = 2
            byte[] r0 = new byte[r0]
            r1 = r3 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 1
            r0[r1] = r3
            return r0
    }

    private static byte[] stringToByteArray(java.lang.String r9) {
            char[] r9 = r9.toCharArray()
            int r0 = r9.length
            int r0 = r0 * 2
            int r0 = r0 + 4
            byte[] r1 = new byte[r0]
            int r2 = r9.length
            short r2 = (short) r2
            byte[] r2 = shortToByteArray(r2)
            r3 = 0
            r4 = r2[r3]
            r1[r3] = r4
            r4 = 1
            r2 = r2[r4]
            r1[r4] = r2
            r2 = 0
        L1c:
            int r5 = r9.length
            if (r2 >= r5) goto L36
            char r5 = r9[r2]
            byte[] r5 = charToByteArray(r5)
            int r6 = r2 * 2
            int r7 = r6 + 2
            r8 = r5[r3]
            r1[r7] = r8
            int r6 = r6 + 3
            r5 = r5[r4]
            r1[r6] = r5
            int r2 = r2 + 1
            goto L1c
        L36:
            int r9 = r0 + (-2)
            r1[r9] = r3
            int r0 = r0 - r4
            r1[r0] = r3
            return r1
    }

    private static byte[] stringToByteArrayUtf8(java.lang.String r5) {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r5 = r5.getBytes(r0)
            int r0 = r5.length
            byte r0 = (byte) r0
            int r1 = r5.length
            int r1 = r1 + 3
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 2
            java.lang.System.arraycopy(r5, r3, r2, r4, r0)
            r5 = 1
            r2[r5] = r0
            r2[r3] = r0
            int r1 = r1 - r5
            r2[r1] = r3
            return r2
    }
}
