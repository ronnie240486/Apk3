package okhttp3.internal.proxy;

/* JADX INFO: compiled from: NullProxySelector.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "()V", "connectFailed", "", "uri", "Ljava/net/URI;", "sa", "Ljava/net/SocketAddress;", "ioe", "Ljava/io/IOException;", "select", "", "Ljava/net/Proxy;", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class NullProxySelector extends java.net.ProxySelector {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.proxy.NullProxySelector INSTANCE = null;

    static {
            okhttp3.internal.proxy.NullProxySelector r0 = new okhttp3.internal.proxy.NullProxySelector
            r0.<init>()
            okhttp3.internal.proxy.NullProxySelector.INSTANCE = r0
            return
    }

    private NullProxySelector() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@org.jetbrains.annotations.Nullable java.net.URI r1, @org.jetbrains.annotations.Nullable java.net.SocketAddress r2, @org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.net.Proxy> select(@org.jetbrains.annotations.Nullable java.net.URI r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri must not be null"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
