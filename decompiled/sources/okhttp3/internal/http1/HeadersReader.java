package okhttp3.internal.http1;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "headerLimit", "", "getSource", "()Lokio/BufferedSource;", "readHeaders", "Lokhttp3/Headers;", "readLine", "", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class HeadersReader {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http1.HeadersReader.Companion Companion = null;
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: HeadersReader.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http1/HeadersReader$Companion;", "", "()V", "HEADER_LIMIT", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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
            okhttp3.internal.http1.HeadersReader$Companion r0 = new okhttp3.internal.http1.HeadersReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http1.HeadersReader.Companion = r0
            return
    }

    public HeadersReader(@org.jetbrains.annotations.NotNull okio.BufferedSource r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r2.source = r3
            r3 = 262144(0x40000, float:3.67342E-40)
            long r0 = (long) r3
            r2.headerLimit = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.BufferedSource getSource() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers readHeaders() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
        L5:
            java.lang.String r1 = r3.readLine()
            int r2 = r1.length()
            if (r2 != 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L19
            okhttp3.Headers r0 = r0.build()
            return r0
        L19:
            r0.addLenient$okhttp(r1)
            goto L5
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String readLine() {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            long r1 = r5.headerLimit
            java.lang.String r0 = r0.readUtf8LineStrict(r1)
            long r1 = r5.headerLimit
            int r3 = r0.length()
            long r3 = (long) r3
            long r1 = r1 - r3
            r5.headerLimit = r1
            return r0
    }
}
