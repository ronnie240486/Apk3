package okhttp3.internal.http;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "contentTypeString", "", "contentLength", "", "source", "Lokio/BufferedSource;", "(Ljava/lang/String;JLokio/BufferedSource;)V", "contentType", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RealResponseBody extends okhttp3.ResponseBody {
    private final long contentLength;
    private final java.lang.String contentTypeString;
    private final okio.BufferedSource source;

    public RealResponseBody(@org.jetbrains.annotations.Nullable java.lang.String r2, long r3, @org.jetbrains.annotations.NotNull okio.BufferedSource r5) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.contentTypeString = r2
            r1.contentLength = r3
            r1.source = r5
            return
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
            r2 = this;
            long r0 = r2.contentLength
            return r0
    }

    @Override // okhttp3.ResponseBody
    @org.jetbrains.annotations.Nullable
    public okhttp3.MediaType contentType() {
            r2 = this;
            java.lang.String r0 = r2.contentTypeString
            if (r0 == 0) goto Lb
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            okhttp3.MediaType r0 = r1.parse(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // okhttp3.ResponseBody
    @org.jetbrains.annotations.NotNull
    public okio.BufferedSource source() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }
}
