package okhttp3;

/* JADX INFO: compiled from: ConnectionPool.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0007\b\u0016¢\u0006\u0002\u0010\tB\u000f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0003R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lokhttp3/ConnectionPool;", "", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "delegate", "Lokhttp3/internal/connection/RealConnectionPool;", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "connectionCount", "evictAll", "", "idleConnectionCount", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class ConnectionPool {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool delegate;

    public ConnectionPool() {
            r4 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 5
            r2 = 5
            r4.<init>(r1, r2, r0)
            return
    }

    public ConnectionPool(int r8, long r9, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r11) {
            r7 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            okhttp3.internal.connection.RealConnectionPool r0 = new okhttp3.internal.connection.RealConnectionPool
            okhttp3.internal.concurrent.TaskRunner r2 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r1 = r0
            r3 = r8
            r4 = r9
            r6 = r11
            r1.<init>(r2, r3, r4, r6)
            r7.<init>(r0)
            return
    }

    public ConnectionPool(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnectionPool r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public final int connectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.connectionCount()
            return r0
    }

    public final void evictAll() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            r0.evictAll()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealConnectionPool getDelegate$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            return r0
    }

    public final int idleConnectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.idleConnectionCount()
            return r0
    }
}
