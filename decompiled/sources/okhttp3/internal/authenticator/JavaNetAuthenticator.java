package okhttp3.internal.authenticator;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "defaultDns", "Lokhttp3/Dns;", "(Lokhttp3/Dns;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "dns", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns defaultDns;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0 = r0
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                return
        }
    }

    public JavaNetAuthenticator() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public JavaNetAuthenticator(@org.jetbrains.annotations.NotNull okhttp3.Dns r2) {
            r1 = this;
            java.lang.String r0 = "defaultDns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.defaultDns = r2
            return
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.Dns r1 = okhttp3.Dns.SYSTEM
        L6:
            r0.<init>(r1)
            return
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy r3, okhttp3.HttpUrl r4, okhttp3.Dns r5) throws java.io.IOException {
            r2 = this;
            java.net.Proxy$Type r0 = r3.type()
            if (r0 != 0) goto L7
            goto L12
        L7:
            int[] r1 = okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L27
        L12:
            java.net.SocketAddress r3 = r3.address()
            java.lang.String r4 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            java.util.Objects.requireNonNull(r3, r4)
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            java.net.InetAddress r3 = r3.getAddress()
            java.lang.String r4 = "(address() as InetSocketAddress).address"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            goto L35
        L27:
            java.lang.String r3 = r4.host()
            java.util.List r3 = r5.lookup(r3)
            java.lang.Object r3 = kotlin.collections.CollectionsKt.first(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
        L35:
            return r3
    }

    @Override // okhttp3.Authenticator
    @org.jetbrains.annotations.Nullable
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable okhttp3.Route r19, @org.jetbrains.annotations.NotNull okhttp3.Response r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "response"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.util.List r1 = r20.challenges()
            okhttp3.Request r3 = r20.request()
            okhttp3.HttpUrl r4 = r3.url()
            int r2 = r20.code()
            r5 = 407(0x197, float:5.7E-43)
            if (r2 != r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r19 == 0) goto L29
            java.net.Proxy r5 = r19.proxy()
            if (r5 == 0) goto L29
            goto L2b
        L29:
            java.net.Proxy r5 = java.net.Proxy.NO_PROXY
        L2b:
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lea
            java.lang.Object r6 = r1.next()
            okhttp3.Challenge r6 = (okhttp3.Challenge) r6
            java.lang.String r7 = r6.scheme()
            java.lang.String r8 = "Basic"
            boolean r7 = kotlin.text.StringsKt.equals(r8, r7)
            if (r7 != 0) goto L48
            goto L2f
        L48:
            if (r19 == 0) goto L57
            okhttp3.Address r7 = r19.address()
            if (r7 == 0) goto L57
            okhttp3.Dns r7 = r7.dns()
            if (r7 == 0) goto L57
            goto L59
        L57:
            okhttp3.Dns r7 = r0.defaultDns
        L59:
            java.lang.String r8 = "proxy"
            if (r2 == 0) goto L8e
            java.net.SocketAddress r9 = r5.address()
            java.lang.String r10 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            java.util.Objects.requireNonNull(r9, r10)
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = r9.getHostName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            java.net.InetAddress r11 = r0.connectToInetAddress(r5, r4, r7)
            int r12 = r9.getPort()
            java.lang.String r13 = r4.scheme()
            java.lang.String r14 = r6.realm()
            java.lang.String r15 = r6.scheme()
            java.net.URL r16 = r4.url()
            java.net.Authenticator$RequestorType r17 = java.net.Authenticator.RequestorType.PROXY
            java.net.PasswordAuthentication r7 = java.net.Authenticator.requestPasswordAuthentication(r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lb5
        L8e:
            java.lang.String r9 = r4.host()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            java.net.InetAddress r7 = r0.connectToInetAddress(r5, r4, r7)
            int r10 = r4.port()
            java.lang.String r11 = r4.scheme()
            java.lang.String r12 = r6.realm()
            java.lang.String r13 = r6.scheme()
            java.net.URL r14 = r4.url()
            java.net.Authenticator$RequestorType r15 = java.net.Authenticator.RequestorType.SERVER
            r8 = r9
            r9 = r7
            java.net.PasswordAuthentication r7 = java.net.Authenticator.requestPasswordAuthentication(r8, r9, r10, r11, r12, r13, r14, r15)
        Lb5:
            if (r7 == 0) goto L2f
            if (r2 == 0) goto Lbc
            java.lang.String r1 = "Proxy-Authorization"
            goto Lbe
        Lbc:
            java.lang.String r1 = "Authorization"
        Lbe:
            java.lang.String r2 = r7.getUserName()
            java.lang.String r4 = "auth.userName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            char[] r4 = r7.getPassword()
            java.lang.String r5 = "auth.password"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            java.nio.charset.Charset r4 = r6.charset()
            java.lang.String r2 = okhttp3.Credentials.basic(r2, r5, r4)
            okhttp3.Request$Builder r3 = r3.newBuilder()
            okhttp3.Request$Builder r1 = r3.header(r1, r2)
            okhttp3.Request r1 = r1.build()
            return r1
        Lea:
            r1 = 0
            return r1
    }
}
