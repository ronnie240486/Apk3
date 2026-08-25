package okio;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/Segment;", "", "()V", "data", "", "pos", "", "limit", "shared", "", "owner", "([BIIZZ)V", "next", "prev", "compact", "", "pop", "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "okio"}, k = 1, mv = {1, 4, 1})
public final class Segment {

    @org.jetbrains.annotations.NotNull
    public static final okio.Segment.Companion Companion = null;
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final byte[] data;

    @kotlin.jvm.JvmField
    public int limit;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public okio.Segment next;

    @kotlin.jvm.JvmField
    public boolean owner;

    @kotlin.jvm.JvmField
    public int pos;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public okio.Segment prev;

    @kotlin.jvm.JvmField
    public boolean shared;

    /* JADX INFO: compiled from: Segment.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokio/Segment$Companion;", "", "()V", "SHARE_MINIMUM", "", "SIZE", "okio"}, k = 1, mv = {1, 4, 1})
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
    }

    static {
            okio.Segment$Companion r0 = new okio.Segment$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Segment.Companion = r0
            return
    }

    public Segment() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.data = r0
            r0 = 1
            r1.owner = r0
            r0 = 0
            r1.shared = r0
            return
    }

    public Segment(@org.jetbrains.annotations.NotNull byte[] r2, int r3, int r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.data = r2
            r1.pos = r3
            r1.limit = r4
            r1.shared = r5
            r1.owner = r6
            return
    }

    public final void compact() {
            r4 = this;
            okio.Segment r0 = r4.prev
            r1 = 0
            if (r0 == r4) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 == 0) goto L44
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.owner
            if (r0 != 0) goto L12
            return
        L12:
            int r0 = r4.limit
            int r2 = r4.pos
            int r0 = r0 - r2
            okio.Segment r2 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.limit
            int r2 = 8192 - r2
            okio.Segment r3 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            boolean r3 = r3.shared
            if (r3 == 0) goto L2a
            goto L31
        L2a:
            okio.Segment r1 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.pos
        L31:
            int r2 = r2 + r1
            if (r0 <= r2) goto L35
            return
        L35:
            okio.Segment r1 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r4.writeTo(r1, r0)
            r4.pop()
            okio.SegmentPool.recycle(r4)
            return
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot compact"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Segment pop() {
            r4 = this;
            okio.Segment r0 = r4.next
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            okio.Segment r2 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r3 = r4.next
            r2.next = r3
            okio.Segment r2 = r4.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r3 = r4.prev
            r2.prev = r3
            r4.next = r1
            r4.prev = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment push(@org.jetbrains.annotations.NotNull okio.Segment r2) {
            r1 = this;
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2.prev = r1
            okio.Segment r0 = r1.next
            r2.next = r0
            okio.Segment r0 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.prev = r2
            r1.next = r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment sharedCopy() {
            r7 = this;
            r0 = 1
            r7.shared = r0
            okio.Segment r0 = new okio.Segment
            byte[] r2 = r7.data
            int r3 = r7.pos
            int r4 = r7.limit
            r5 = 1
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment split(int r6) {
            r5 = this;
            if (r6 <= 0) goto Lb
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            if (r6 > r0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L39
            r0 = 1024(0x400, float:1.435E-42)
            if (r6 < r0) goto L17
            okio.Segment r0 = r5.sharedCopy()
            goto L26
        L17:
            okio.Segment r0 = okio.SegmentPool.take()
            byte[] r1 = r5.data
            byte[] r2 = r0.data
            int r3 = r5.pos
            int r4 = r3 + r6
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4)
        L26:
            int r1 = r0.pos
            int r1 = r1 + r6
            r0.limit = r1
            int r1 = r5.pos
            int r1 = r1 + r6
            r5.pos = r1
            okio.Segment r6 = r5.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r6.push(r0)
            return r0
        L39:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount out of range"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Segment unsharedCopy() {
            r7 = this;
            okio.Segment r6 = new okio.Segment
            byte[] r0 = r7.data
            int r1 = r0.length
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            int r2 = r7.pos
            int r3 = r7.limit
            r4 = 0
            r5 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public final void writeTo(@org.jetbrains.annotations.NotNull okio.Segment r6, int r7) {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r6.owner
            if (r0 == 0) goto L4f
            int r0 = r6.limit
            int r1 = r0 + r7
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 <= r2) goto L37
            boolean r3 = r6.shared
            if (r3 != 0) goto L31
            int r3 = r6.pos
            int r1 = r1 - r3
            if (r1 > r2) goto L2b
            byte[] r1 = r6.data
            kotlin.collections.ArraysKt.copyInto$default(r1, r1, r3, r0)
            int r0 = r6.limit
            int r1 = r6.pos
            int r0 = r0 - r1
            r6.limit = r0
            r0 = 0
            r6.pos = r0
            goto L37
        L2b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L31:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L37:
            byte[] r0 = r5.data
            byte[] r1 = r6.data
            int r2 = r6.limit
            int r3 = r5.pos
            int r4 = r3 + r7
            kotlin.collections.ArraysKt.copyInto(r0, r1, r2, r3, r4)
            int r0 = r6.limit
            int r0 = r0 + r7
            r6.limit = r0
            int r6 = r5.pos
            int r6 = r6 + r7
            r5.pos = r6
            return
        L4f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "only owner can write"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }
}
