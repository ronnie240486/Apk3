package okhttp3.internal.http2;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u0003H&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/PushObserver;", "", "onData", "", "streamId", "", "source", "Lokio/BufferedSource;", "byteCount", "last", "onHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "onRequest", "requestHeaders", "onReset", "", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public interface PushObserver {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.PushObserver CANCEL = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.PushObserver.Companion Companion = null;

    /* JADX INFO: compiled from: PushObserver.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion;", "", "()V", "CANCEL", "Lokhttp3/internal/http2/PushObserver;", "PushObserverCancel", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: compiled from: PushObserver.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion$PushObserverCancel;", "Lokhttp3/internal/http2/PushObserver;", "()V", "onData", "", "streamId", "", "source", "Lokio/BufferedSource;", "byteCount", "last", "onHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "onRequest", "requestHeaders", "onReset", "", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "okhttp"}, k = 1, mv = {1, 4, 1})
        public static final class PushObserverCancel implements okhttp3.internal.http2.PushObserver {
            public PushObserverCancel() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int r1, @org.jetbrains.annotations.NotNull okio.BufferedSource r2, int r3, boolean r4) throws java.io.IOException {
                    r0 = this;
                    java.lang.String r1 = "source"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    long r3 = (long) r3
                    r2.skip(r3)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) {
                    r0 = this;
                    java.lang.String r1 = "responseHeaders"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2) {
                    r0 = this;
                    java.lang.String r1 = "requestHeaders"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2) {
                    r0 = this;
                    java.lang.String r1 = "errorCode"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    return
            }
        }

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
            okhttp3.internal.http2.PushObserver$Companion r0 = new okhttp3.internal.http2.PushObserver$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.PushObserver.Companion = r0
            okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel r0 = new okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel
            r0.<init>()
            okhttp3.internal.http2.PushObserver.CANCEL = r0
            return
    }

    boolean onData(int r1, @org.jetbrains.annotations.NotNull okio.BufferedSource r2, int r3, boolean r4) throws java.io.IOException;

    boolean onHeaders(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2, boolean r3);

    boolean onRequest(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2);

    void onReset(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2);
}
