package okhttp3.internal.http2;

/* JADX INFO: compiled from: ErrorCode.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http2/ErrorCode;", "", "httpCode", "", "(Ljava/lang/String;II)V", "getHttpCode", "()I", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final enum ErrorCode extends java.lang.Enum<okhttp3.internal.http2.ErrorCode> {
    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $VALUES = null;
    public static final okhttp3.internal.http2.ErrorCode CANCEL = null;
    public static final okhttp3.internal.http2.ErrorCode COMPRESSION_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode CONNECT_ERROR = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.ErrorCode.Companion Companion = null;
    public static final okhttp3.internal.http2.ErrorCode ENHANCE_YOUR_CALM = null;
    public static final okhttp3.internal.http2.ErrorCode FLOW_CONTROL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode FRAME_SIZE_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode HTTP_1_1_REQUIRED = null;
    public static final okhttp3.internal.http2.ErrorCode INADEQUATE_SECURITY = null;
    public static final okhttp3.internal.http2.ErrorCode INTERNAL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode NO_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode PROTOCOL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode REFUSED_STREAM = null;
    public static final okhttp3.internal.http2.ErrorCode SETTINGS_TIMEOUT = null;
    public static final okhttp3.internal.http2.ErrorCode STREAM_CLOSED = null;
    private final int httpCode;

    /* JADX INFO: compiled from: ErrorCode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/ErrorCode$Companion;", "", "()V", "fromHttp2", "Lokhttp3/internal/http2/ErrorCode;", "code", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.http2.ErrorCode fromHttp2(int r7) {
                r6 = this;
                okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.values()
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L7:
                if (r3 >= r1) goto L1a
                r4 = r0[r3]
                int r5 = r4.getHttpCode()
                if (r5 != r7) goto L13
                r5 = 1
                goto L14
            L13:
                r5 = 0
            L14:
                if (r5 == 0) goto L17
                goto L1b
            L17:
                int r3 = r3 + 1
                goto L7
            L1a:
                r4 = 0
            L1b:
                return r4
        }
    }

    static {
            r0 = 14
            okhttp3.internal.http2.ErrorCode[] r0 = new okhttp3.internal.http2.ErrorCode[r0]
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "NO_ERROR"
            r3 = 0
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.NO_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "PROTOCOL_ERROR"
            r3 = 1
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "INTERNAL_ERROR"
            r3 = 2
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "FLOW_CONTROL_ERROR"
            r3 = 3
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "SETTINGS_TIMEOUT"
            r3 = 4
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.SETTINGS_TIMEOUT = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "STREAM_CLOSED"
            r3 = 5
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.STREAM_CLOSED = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "FRAME_SIZE_ERROR"
            r3 = 6
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.FRAME_SIZE_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "REFUSED_STREAM"
            r3 = 7
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.REFUSED_STREAM = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "CANCEL"
            r3 = 8
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.CANCEL = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "COMPRESSION_ERROR"
            r3 = 9
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.COMPRESSION_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "CONNECT_ERROR"
            r3 = 10
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.CONNECT_ERROR = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "ENHANCE_YOUR_CALM"
            r3 = 11
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.ENHANCE_YOUR_CALM = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "INADEQUATE_SECURITY"
            r3 = 12
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.INADEQUATE_SECURITY = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r2 = "HTTP_1_1_REQUIRED"
            r3 = 13
            r1.<init>(r2, r3, r3)
            okhttp3.internal.http2.ErrorCode.HTTP_1_1_REQUIRED = r1
            r0[r3] = r1
            okhttp3.internal.http2.ErrorCode.$VALUES = r0
            okhttp3.internal.http2.ErrorCode$Companion r0 = new okhttp3.internal.http2.ErrorCode$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.ErrorCode.Companion = r0
            return
    }

    private ErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.httpCode = r3
            return
    }

    public static okhttp3.internal.http2.ErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.internal.http2.ErrorCode> r0 = okhttp3.internal.http2.ErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.internal.http2.ErrorCode r1 = (okhttp3.internal.http2.ErrorCode) r1
            return r1
    }

    public static okhttp3.internal.http2.ErrorCode[] values() {
            okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.internal.http2.ErrorCode[] r0 = (okhttp3.internal.http2.ErrorCode[]) r0
            return r0
    }

    public final int getHttpCode() {
            r1 = this;
            int r0 = r1.httpCode
            return r0
    }
}
