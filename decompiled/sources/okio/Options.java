package okio;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
public final class Options extends kotlin.collections.AbstractList<okio.ByteString> implements java.util.RandomAccess {

    @org.jetbrains.annotations.NotNull
    public static final okio.Options.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okio.ByteString[] byteStrings;

    @org.jetbrains.annotations.NotNull
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 4, 1})
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

        private final void buildTrieRecursive(long r20, okio.Buffer r22, int r23, java.util.List<? extends okio.ByteString> r24, int r25, int r26, java.util.List<java.lang.Integer> r27) {
                r19 = this;
                r9 = r19
                r10 = r22
                r11 = r23
                r12 = r24
                r0 = r25
                r13 = r26
                r14 = r27
                if (r0 >= r13) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                java.lang.String r4 = "Failed requirement."
                if (r3 == 0) goto L1ce
                r3 = r0
            L18:
                if (r3 >= r13) goto L38
                java.lang.Object r5 = r12.get(r3)
                okio.ByteString r5 = (okio.ByteString) r5
                int r5 = r5.size()
                if (r5 < r11) goto L28
                r5 = 1
                goto L29
            L28:
                r5 = 0
            L29:
                if (r5 == 0) goto L2e
                int r3 = r3 + 1
                goto L18
            L2e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r4.toString()
                r0.<init>(r1)
                throw r0
            L38:
                java.lang.Object r3 = r24.get(r25)
                okio.ByteString r3 = (okio.ByteString) r3
                int r4 = r13 + (-1)
                java.lang.Object r4 = r12.get(r4)
                okio.ByteString r4 = (okio.ByteString) r4
                int r5 = r3.size()
                r15 = -1
                if (r11 != r5) goto L63
                java.lang.Object r3 = r14.get(r0)
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                int r0 = r0 + 1
                java.lang.Object r5 = r12.get(r0)
                okio.ByteString r5 = (okio.ByteString) r5
                r6 = r0
                r0 = r3
                r3 = r5
                goto L65
            L63:
                r6 = r0
                r0 = -1
            L65:
                byte r5 = r3.getByte(r11)
                byte r7 = r4.getByte(r11)
                r8 = 2
                if (r5 == r7) goto L13b
                int r1 = r6 + 1
                r2 = 1
            L73:
                if (r1 >= r13) goto L92
                int r3 = r1 + (-1)
                java.lang.Object r3 = r12.get(r3)
                okio.ByteString r3 = (okio.ByteString) r3
                byte r3 = r3.getByte(r11)
                java.lang.Object r4 = r12.get(r1)
                okio.ByteString r4 = (okio.ByteString) r4
                byte r4 = r4.getByte(r11)
                if (r3 == r4) goto L8f
                int r2 = r2 + 1
            L8f:
                int r1 = r1 + 1
                goto L73
            L92:
                long r3 = r9.getIntCount(r10)
                long r3 = r20 + r3
                long r7 = (long) r8
                long r3 = r3 + r7
                int r1 = r2 * 2
                long r7 = (long) r1
                long r16 = r3 + r7
                r10.writeInt(r2)
                r10.writeInt(r0)
                r0 = r6
            La6:
                if (r0 >= r13) goto Lca
                java.lang.Object r1 = r12.get(r0)
                okio.ByteString r1 = (okio.ByteString) r1
                byte r1 = r1.getByte(r11)
                if (r0 == r6) goto Lc2
                int r2 = r0 + (-1)
                java.lang.Object r2 = r12.get(r2)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r11)
                if (r1 == r2) goto Lc7
            Lc2:
                r1 = r1 & 255(0xff, float:3.57E-43)
                r10.writeInt(r1)
            Lc7:
                int r0 = r0 + 1
                goto La6
            Lca:
                okio.Buffer r8 = new okio.Buffer
                r8.<init>()
            Lcf:
                if (r6 >= r13) goto L135
                java.lang.Object r0 = r12.get(r6)
                okio.ByteString r0 = (okio.ByteString) r0
                byte r0 = r0.getByte(r11)
                int r1 = r6 + 1
                r2 = r1
            Lde:
                if (r2 >= r13) goto Lf1
                java.lang.Object r3 = r12.get(r2)
                okio.ByteString r3 = (okio.ByteString) r3
                byte r3 = r3.getByte(r11)
                if (r0 == r3) goto Lee
                r7 = r2
                goto Lf2
            Lee:
                int r2 = r2 + 1
                goto Lde
            Lf1:
                r7 = r13
            Lf2:
                if (r1 != r7) goto L113
                int r0 = r11 + 1
                java.lang.Object r1 = r12.get(r6)
                okio.ByteString r1 = (okio.ByteString) r1
                int r1 = r1.size()
                if (r0 != r1) goto L113
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.writeInt(r0)
                r18 = r7
                r15 = r8
                goto L130
            L113:
                long r0 = r9.getIntCount(r8)
                long r0 = r16 + r0
                int r1 = (int) r0
                int r1 = r1 * (-1)
                r10.writeInt(r1)
                int r4 = r11 + 1
                r0 = r19
                r1 = r16
                r3 = r8
                r5 = r24
                r18 = r7
                r15 = r8
                r8 = r27
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
            L130:
                r8 = r15
                r6 = r18
                r15 = -1
                goto Lcf
            L135:
                r15 = r8
                r10.writeAll(r15)
                goto L1cd
            L13b:
                int r5 = r3.size()
                int r7 = r4.size()
                int r5 = java.lang.Math.min(r5, r7)
                r7 = r11
                r15 = 0
            L149:
                if (r7 >= r5) goto L15a
                byte r1 = r3.getByte(r7)
                byte r2 = r4.getByte(r7)
                if (r1 != r2) goto L15a
                int r15 = r15 + 1
                int r7 = r7 + 1
                goto L149
            L15a:
                long r1 = r9.getIntCount(r10)
                long r1 = r20 + r1
                long r4 = (long) r8
                long r1 = r1 + r4
                long r4 = (long) r15
                long r1 = r1 + r4
                r4 = 1
                long r1 = r1 + r4
                int r4 = -r15
                r10.writeInt(r4)
                r10.writeInt(r0)
                int r4 = r11 + r15
            L170:
                if (r11 >= r4) goto L17e
                byte r0 = r3.getByte(r11)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r10.writeInt(r0)
                int r11 = r11 + 1
                goto L170
            L17e:
                int r0 = r6 + 1
                if (r0 != r13) goto L1ad
                java.lang.Object r0 = r12.get(r6)
                okio.ByteString r0 = (okio.ByteString) r0
                int r0 = r0.size()
                if (r4 != r0) goto L190
                r1 = 1
                goto L191
            L190:
                r1 = 0
            L191:
                if (r1 == 0) goto L1a1
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.writeInt(r0)
                goto L1cd
            L1a1:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L1ad:
                okio.Buffer r11 = new okio.Buffer
                r11.<init>()
                long r7 = r9.getIntCount(r11)
                long r7 = r7 + r1
                int r0 = (int) r7
                r3 = -1
                int r0 = r0 * (-1)
                r10.writeInt(r0)
                r0 = r19
                r3 = r11
                r5 = r24
                r7 = r26
                r8 = r27
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                r10.writeAll(r11)
            L1cd:
                return
            L1ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r4.toString()
                r0.<init>(r1)
                throw r0
        }

        private final long getIntCount(okio.Buffer r5) {
                r4 = this;
                long r0 = r5.size()
                r5 = 4
                long r2 = (long) r5
                long r0 = r0 / r2
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r14) {
                r13 = this;
                java.lang.String r0 = "byteStrings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                int r0 = r14.length
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                r3 = 0
                if (r0 == 0) goto L1e
                okio.Options r14 = new okio.Options
                okio.ByteString[] r0 = new okio.ByteString[r1]
                r1 = 2
                int[] r1 = new int[r1]
                r1 = {x0134: FILL_ARRAY_DATA , data: [0, -1} // fill-array
                r14.<init>(r0, r1, r3)
                return r14
            L1e:
                java.util.List r9 = kotlin.collections.ArraysKt.toMutableList(r14)
                kotlin.collections.CollectionsKt.sort(r9)
                java.util.ArrayList r0 = new java.util.ArrayList
                int r4 = r14.length
                r0.<init>(r4)
                int r4 = r14.length
                r5 = 0
            L2d:
                if (r5 >= r4) goto L3c
                r6 = r14[r5]
                r6 = -1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.add(r6)
                int r5 = r5 + 1
                goto L2d
            L3c:
                java.lang.Integer[] r4 = new java.lang.Integer[r1]
                java.lang.Object[] r0 = r0.toArray(r4)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r0, r4)
                java.lang.Integer[] r0 = (java.lang.Integer[]) r0
                int r4 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                java.lang.Integer[] r0 = (java.lang.Integer[]) r0
                java.util.List r12 = kotlin.collections.CollectionsKt.mutableListOf(r0)
                int r0 = r14.length
                r4 = 0
                r5 = 0
            L57:
                if (r4 >= r0) goto L6c
                r6 = r14[r4]
                int r7 = r5 + 1
                int r6 = kotlin.collections.CollectionsKt.binarySearch$default(r9, r6)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r12.set(r6, r5)
                int r4 = r4 + 1
                r5 = r7
                goto L57
            L6c:
                java.lang.Object r0 = r9.get(r1)
                okio.ByteString r0 = (okio.ByteString) r0
                int r0 = r0.size()
                if (r0 <= 0) goto L7a
                r0 = 1
                goto L7b
            L7a:
                r0 = 0
            L7b:
                if (r0 == 0) goto L127
                r0 = 0
            L7e:
                int r4 = r9.size()
                if (r0 >= r4) goto Lec
                java.lang.Object r4 = r9.get(r0)
                okio.ByteString r4 = (okio.ByteString) r4
                int r5 = r0 + 1
                r6 = r5
            L8d:
                int r7 = r9.size()
                if (r6 >= r7) goto Lea
                java.lang.Object r7 = r9.get(r6)
                okio.ByteString r7 = (okio.ByteString) r7
                boolean r8 = r7.startsWith(r4)
                if (r8 != 0) goto La0
                goto Lea
            La0:
                int r8 = r7.size()
                int r10 = r4.size()
                if (r8 == r10) goto Lac
                r8 = 1
                goto Lad
            Lac:
                r8 = 0
            Lad:
                if (r8 == 0) goto Lcf
                java.lang.Object r7 = r12.get(r6)
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                java.lang.Object r8 = r12.get(r0)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                if (r7 <= r8) goto Lcc
                r9.remove(r6)
                r12.remove(r6)
                goto L8d
            Lcc:
                int r6 = r6 + 1
                goto L8d
            Lcf:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = "duplicate option: "
                r14.append(r0)
                r14.append(r7)
                java.lang.String r14 = r14.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            Lea:
                r0 = r5
                goto L7e
            Lec:
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r5 = 0
                r8 = 0
                r10 = 0
                int r11 = r9.size()
                r4 = r13
                r7 = r0
                r4.buildTrieRecursive(r5, r7, r8, r9, r10, r11, r12)
                long r4 = r13.getIntCount(r0)
                int r2 = (int) r4
                int[] r2 = new int[r2]
            L105:
                boolean r4 = r0.exhausted()
                if (r4 != 0) goto L115
                int r4 = r1 + 1
                int r5 = r0.readInt()
                r2[r1] = r5
                r1 = r4
                goto L105
            L115:
                okio.Options r0 = new okio.Options
                int r1 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r1)
                java.lang.String r1 = "java.util.Arrays.copyOf(this, size)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
                okio.ByteString[] r14 = (okio.ByteString[]) r14
                r0.<init>(r14, r2, r3)
                return r0
            L127:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "the empty byte string is not a supported option"
                java.lang.String r0 = r0.toString()
                r14.<init>(r0)
                throw r14
        }
    }

    static {
            okio.Options$Companion r0 = new okio.Options$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Options.Companion = r0
            return
    }

    private Options(okio.ByteString[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.byteStrings = r1
            r0.trie = r2
            return
    }

    public /* synthetic */ Options(okio.ByteString[] r1, int[] r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r1) {
            okio.Options$Companion r0 = okio.Options.Companion
            okio.Options r1 = r0.of(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 == 0) goto Lb
            okio.ByteString r2 = (okio.ByteString) r2
            boolean r2 = r1.contains(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public /* bridge */ boolean contains(okio.ByteString r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            okio.ByteString r1 = r0.get(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @org.jetbrains.annotations.NotNull
    public okio.ByteString get(int r2) {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            r2 = r0[r2]
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString[] getByteStrings$okio() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            int r0 = r0.length
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getTrie$okio() {
            r1 = this;
            int[] r0 = r1.trie
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 == 0) goto Lb
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.indexOf(r2)
            return r2
        Lb:
            r2 = -1
            return r2
    }

    public /* bridge */ int indexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 == 0) goto Lb
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
        Lb:
            r2 = -1
            return r2
    }

    public /* bridge */ int lastIndexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }
}
