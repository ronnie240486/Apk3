package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {1, 4, 1})
final class SocketAsyncTimeout extends okio.AsyncTimeout {
    private final java.net.Socket socket;

    public SocketAsyncTimeout(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.socket = r2
            return
    }

    @Override // okio.AsyncTimeout
    @org.jetbrains.annotations.NotNull
    public final java.io.IOException newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r2 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Ld
            r0.initCause(r3)
        Ld:
            return r0
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.socket     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L27
            r1.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L27
            goto L3e
        L8:
            r1 = move-exception
            boolean r2 = okio.Okio.isAndroidGetsocknameError(r1)
            if (r2 == 0) goto L26
            java.util.logging.Logger r2 = okio.Okio__JvmOkioKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.net.Socket r4 = r5.socket
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.log(r3, r0, r1)
            goto L3e
        L26:
            throw r1
        L27:
            r1 = move-exception
            java.util.logging.Logger r2 = okio.Okio__JvmOkioKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.net.Socket r4 = r5.socket
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.log(r3, r0, r1)
        L3e:
            return
    }
}
