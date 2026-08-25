package okhttp3.internal.cache2;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(Ljava/nio/channels/FileChannel;)V", "read", "", "pos", "", "sink", "Lokio/Buffer;", "byteCount", "write", "source", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class FileOperator {
    private final java.nio.channels.FileChannel fileChannel;

    public FileOperator(@org.jetbrains.annotations.NotNull java.nio.channels.FileChannel r2) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.fileChannel = r2
            return
    }

    public final void read(long r10, @org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L1c
        Lb:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1b
            java.nio.channels.FileChannel r3 = r9.fileChannel
            r4 = r10
            r6 = r13
            r8 = r12
            long r2 = r3.transferTo(r4, r6, r8)
            long r10 = r10 + r2
            long r13 = r13 - r2
            goto Lb
        L1b:
            return
        L1c:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }

    public final void write(long r15, @org.jetbrains.annotations.NotNull okio.Buffer r17, long r18) throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "source"
            r7 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r8 = 0
            int r0 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r0 < 0) goto L2c
            long r0 = r17.size()
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 > 0) goto L2c
            r10 = r15
            r12 = r18
        L18:
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r0 = r14
            java.nio.channels.FileChannel r1 = r0.fileChannel
            r2 = r17
            r3 = r10
            r5 = r12
            long r1 = r1.transferFrom(r2, r3, r5)
            long r10 = r10 + r1
            long r12 = r12 - r1
            goto L18
        L2a:
            r0 = r14
            return
        L2c:
            r0 = r14
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }
}
