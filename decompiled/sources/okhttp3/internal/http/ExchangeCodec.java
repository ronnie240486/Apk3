package okhttp3.internal.http;

/* JADX INFO: compiled from: ExchangeCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", "", "finishRequest", "flushRequest", "openResponseBodySource", "Lokio/Source;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "", "reportedContentLength", "trailers", "Lokhttp3/Headers;", "writeRequestHeaders", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public interface ExchangeCodec {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.ExchangeCodec.Companion Companion = null;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* JADX INFO: compiled from: ExchangeCodec.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "()V", "DISCARD_STREAM_TIMEOUT_MILLIS", "", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public static final /* synthetic */ okhttp3.internal.http.ExchangeCodec.Companion $$INSTANCE = null;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        static {
                okhttp3.internal.http.ExchangeCodec$Companion r0 = new okhttp3.internal.http.ExchangeCodec$Companion
                r0.<init>()
                okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http.ExchangeCodec$Companion r0 = okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE
            okhttp3.internal.http.ExchangeCodec.Companion = r0
            return
    }

    void cancel();

    @org.jetbrains.annotations.NotNull
    okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r1, long r2) throws java.io.IOException;

    void finishRequest() throws java.io.IOException;

    void flushRequest() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okhttp3.internal.connection.RealConnection getConnection();

    @org.jetbrains.annotations.NotNull
    okio.Source openResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.Response r1) throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    okhttp3.Response.Builder readResponseHeaders(boolean r1) throws java.io.IOException;

    long reportedContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okhttp3.Headers trailers() throws java.io.IOException;

    void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r1) throws java.io.IOException;
}
