package okhttp3;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lokhttp3/WebSocketListener;", "", "()V", "onClosed", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onClosing", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "okhttp"}, k = 1, mv = {1, 4, 1})
public abstract class WebSocketListener {
    public WebSocketListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onClosed(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r1, int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = this;
            java.lang.String r2 = "webSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            return
    }

    public void onClosing(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r1, int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = this;
            java.lang.String r2 = "webSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            return
    }

    public void onFailure(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.Nullable okhttp3.Response r3) {
            r0 = this;
            java.lang.String r3 = "webSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r1 = "t"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            return
    }

    public void onMessage(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "webSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            return
    }

    public void onMessage(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r1 = this;
            java.lang.String r0 = "webSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            return
    }

    public void onOpen(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "webSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            return
    }
}
