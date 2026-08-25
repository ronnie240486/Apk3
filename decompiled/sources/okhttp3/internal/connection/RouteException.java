package okhttp3.internal.connection;

/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "firstConnectException", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getFirstConnectException", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "getLastConnectException", "addConnectException", "", "e", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class RouteException extends java.lang.RuntimeException {

    @org.jetbrains.annotations.NotNull
    private final java.io.IOException firstConnectException;

    @org.jetbrains.annotations.NotNull
    private java.io.IOException lastConnectException;

    public RouteException(@org.jetbrains.annotations.NotNull java.io.IOException r2) {
            r1 = this;
            java.lang.String r0 = "firstConnectException"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            r1.firstConnectException = r2
            r1.lastConnectException = r2
            return
    }

    public final void addConnectException(@org.jetbrains.annotations.NotNull java.io.IOException r2) {
            r1 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.IOException r0 = r1.firstConnectException
            kotlin.ExceptionsKt.addSuppressed(r0, r2)
            r1.lastConnectException = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.IOException getFirstConnectException() {
            r1 = this;
            java.io.IOException r0 = r1.firstConnectException
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.IOException getLastConnectException() {
            r1 = this;
            java.io.IOException r0 = r1.lastConnectException
            return r0
    }
}
