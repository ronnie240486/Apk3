package okio;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0015"}, d2 = {"Lokio/SegmentPool;", "", "()V", "HASH_BUCKET_COUNT", "", "LOCK", "Lokio/Segment;", "MAX_SIZE", "getMAX_SIZE", "()I", "byteCount", "getByteCount", "hashBuckets", "", "Ljava/util/concurrent/atomic/AtomicReference;", "[Ljava/util/concurrent/atomic/AtomicReference;", "firstRef", "recycle", "", "segment", "take", "okio"}, k = 1, mv = {1, 4, 1})
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT = 0;

    @org.jetbrains.annotations.NotNull
    public static final okio.SegmentPool INSTANCE = null;
    private static final okio.Segment LOCK = null;
    private static final int MAX_SIZE = 0;
    private static final java.util.concurrent.atomic.AtomicReference<okio.Segment>[] hashBuckets = null;

    static {
            okio.SegmentPool r0 = new okio.SegmentPool
            r0.<init>()
            okio.SegmentPool.INSTANCE = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            okio.SegmentPool.MAX_SIZE = r0
            okio.Segment r0 = new okio.Segment
            r7 = 0
            byte[] r2 = new byte[r7]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            okio.SegmentPool.LOCK = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            okio.SegmentPool.HASH_BUCKET_COUNT = r0
            java.util.concurrent.atomic.AtomicReference[] r1 = new java.util.concurrent.atomic.AtomicReference[r0]
        L2e:
            if (r7 >= r0) goto L3a
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1[r7] = r2
            int r7 = r7 + 1
            goto L2e
        L3a:
            okio.SegmentPool.hashBuckets = r1
            return
    }

    private SegmentPool() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.concurrent.atomic.AtomicReference<okio.Segment> firstRef() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            long r0 = r0.getId()
            int r2 = okio.SegmentPool.HASH_BUCKET_COUNT
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r1 = (int) r0
            java.util.concurrent.atomic.AtomicReference<okio.Segment>[] r0 = okio.SegmentPool.hashBuckets
            r0 = r0[r1]
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void recycle(@org.jetbrains.annotations.NotNull okio.Segment r5) {
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.Segment r0 = r5.next
            r1 = 0
            if (r0 != 0) goto L11
            okio.Segment r0 = r5.prev
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L47
            boolean r0 = r5.shared
            if (r0 == 0) goto L19
            return
        L19:
            okio.SegmentPool r0 = okio.SegmentPool.INSTANCE
            java.util.concurrent.atomic.AtomicReference r0 = r0.firstRef()
            java.lang.Object r2 = r0.get()
            okio.Segment r2 = (okio.Segment) r2
            okio.Segment r3 = okio.SegmentPool.LOCK
            if (r2 != r3) goto L2a
            return
        L2a:
            if (r2 == 0) goto L2f
            int r3 = r2.limit
            goto L30
        L2f:
            r3 = 0
        L30:
            int r4 = okio.SegmentPool.MAX_SIZE
            if (r3 < r4) goto L35
            return
        L35:
            r5.next = r2
            r5.pos = r1
            int r3 = r3 + 8192
            r5.limit = r3
            boolean r0 = r0.compareAndSet(r2, r5)
            if (r0 != 0) goto L46
            r0 = 0
            r5.next = r0
        L46:
            return
        L47:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.Segment take() {
            okio.SegmentPool r0 = okio.SegmentPool.INSTANCE
            java.util.concurrent.atomic.AtomicReference r0 = r0.firstRef()
            okio.Segment r1 = okio.SegmentPool.LOCK
            java.lang.Object r2 = r0.getAndSet(r1)
            okio.Segment r2 = (okio.Segment) r2
            if (r2 != r1) goto L16
            okio.Segment r0 = new okio.Segment
            r0.<init>()
            return r0
        L16:
            r1 = 0
            if (r2 != 0) goto L22
            r0.set(r1)
            okio.Segment r0 = new okio.Segment
            r0.<init>()
            return r0
        L22:
            okio.Segment r3 = r2.next
            r0.set(r3)
            r2.next = r1
            r0 = 0
            r2.limit = r0
            return r2
    }

    public final int getByteCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.firstRef()
            java.lang.Object r0 = r0.get()
            okio.Segment r0 = (okio.Segment) r0
            if (r0 == 0) goto Lf
            int r0 = r0.limit
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final int getMAX_SIZE() {
            r1 = this;
            int r0 = okio.SegmentPool.MAX_SIZE
            return r0
    }
}
