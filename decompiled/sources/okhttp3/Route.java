package okhttp3;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", "", "other", "hashCode", "", "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", "", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Route {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Address address;

    @org.jetbrains.annotations.NotNull
    private final java.net.Proxy proxy;

    @org.jetbrains.annotations.NotNull
    private final java.net.InetSocketAddress socketAddress;

    public Route(@org.jetbrains.annotations.NotNull okhttp3.Address r2, @org.jetbrains.annotations.NotNull java.net.Proxy r3, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r4) {
            r1 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "proxy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "socketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.address = r2
            r1.proxy = r3
            r1.socketAddress = r4
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "address", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_address")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name */
    public final okhttp3.Address m2009deprecated_address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_proxy")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m2010deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketAddress", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_socketAddress")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final java.net.InetSocketAddress m2011deprecated_socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.socketAddress
            return r0
    }

    @kotlin.jvm.JvmName(name = "address")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Address address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Route
            if (r0 == 0) goto L26
            okhttp3.Route r3 = (okhttp3.Route) r3
            okhttp3.Address r0 = r3.address
            okhttp3.Address r1 = r2.address
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.proxy
            java.net.Proxy r1 = r2.proxy
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.socketAddress
            java.net.InetSocketAddress r0 = r2.socketAddress
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.proxy
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r0 = r2.socketAddress
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @kotlin.jvm.JvmName(name = "proxy")
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public final boolean requiresTunnel() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 == 0) goto L14
            java.net.Proxy r0 = r2.proxy
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @kotlin.jvm.JvmName(name = "socketAddress")
    @org.jetbrains.annotations.NotNull
    public final java.net.InetSocketAddress socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.socketAddress
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Route{"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.net.InetSocketAddress r1 = r2.socketAddress
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
