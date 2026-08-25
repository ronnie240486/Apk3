package okhttp3.internal;

/* JADX INFO: compiled from: NativeImageTestsAccessors.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bR\u00020\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"(\u0010\u000b\u001a\u00020\n*\u00020\u00012\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"connection", "Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/Exchange;", "getConnection", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/connection/RealConnection;", "exchange", "Lokhttp3/Response;", "getExchange", "(Lokhttp3/Response;)Lokhttp3/internal/connection/Exchange;", "value", "", "idleAtNsAccessor", "getIdleAtNsAccessor", "(Lokhttp3/internal/connection/RealConnection;)J", "setIdleAtNsAccessor", "(Lokhttp3/internal/connection/RealConnection;J)V", "buildCache", "Lokhttp3/Cache;", "file", "Ljava/io/File;", "maxSize", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "finished", "", "Lokhttp3/Dispatcher;", "call", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, k = 2, mv = {1, 4, 1})
public final class NativeImageTestsAccessorsKt {
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Cache buildCache(@org.jetbrains.annotations.NotNull java.io.File r1, long r2, @org.jetbrains.annotations.NotNull okhttp3.internal.io.FileSystem r4) {
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.Cache r0 = new okhttp3.Cache
            r0.<init>(r1, r2, r4)
            return r0
    }

    public static final void finished(@org.jetbrains.annotations.NotNull okhttp3.Dispatcher r1, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r2) {
            java.lang.String r0 = "$this$finished"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.finished$okhttp(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RealConnection getConnection(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r1) {
            java.lang.String r0 = "$this$connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.connection.RealConnection r1 = r1.getConnection$okhttp()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final okhttp3.internal.connection.Exchange getExchange(@org.jetbrains.annotations.NotNull okhttp3.Response r1) {
            java.lang.String r0 = "$this$exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okhttp3.internal.connection.Exchange r1 = r1.exchange()
            return r1
    }

    public static final long getIdleAtNsAccessor(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r2) {
            java.lang.String r0 = "$this$idleAtNsAccessor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.getIdleAtNs()
            return r0
    }

    public static final void setIdleAtNsAccessor(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r1, long r2) {
            java.lang.String r0 = "$this$idleAtNsAccessor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setIdleAtNs(r2)
            return
    }
}
