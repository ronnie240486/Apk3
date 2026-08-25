package okhttp3.internal.platform;

/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getSelectedProtocol", "AlpnProvider", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Jdk8WithJettyBootPlatform extends okhttp3.internal.platform.Platform {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion Companion = null;
    private final java.lang.Class<?> clientProviderClass;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method putMethod;
    private final java.lang.reflect.Method removeMethod;
    private final java.lang.Class<?> serverProviderClass;

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", "", "", "(Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "unsupported", "", "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class AlpnProvider implements java.lang.reflect.InvocationHandler {
        private final java.util.List<java.lang.String> protocols;

        @org.jetbrains.annotations.Nullable
        private java.lang.String selected;
        private boolean unsupported;

        public AlpnProvider(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.protocols = r2
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSelected() {
                r1 = this;
                java.lang.String r0 = r1.selected
                return r0
        }

        public final boolean getUnsupported() {
                r1 = this;
                boolean r0 = r1.unsupported
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        @org.jetbrains.annotations.Nullable
        public java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.Object r7, @org.jetbrains.annotations.NotNull java.lang.reflect.Method r8, @org.jetbrains.annotations.Nullable java.lang.Object[] r9) throws java.lang.Throwable {
                r6 = this;
                java.lang.String r0 = "proxy"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r7 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
                r7 = 0
                if (r9 == 0) goto Le
                goto L10
            Le:
                java.lang.Object[] r9 = new java.lang.Object[r7]
            L10:
                java.lang.String r0 = r8.getName()
                java.lang.Class r1 = r8.getReturnType()
                java.lang.String r2 = "supports"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L2c
                java.lang.Class r2 = java.lang.Boolean.TYPE
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
                if (r2 == 0) goto L2c
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                return r7
            L2c:
                java.lang.String r2 = "unsupported"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L42
                java.lang.Class r2 = java.lang.Void.TYPE
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
                if (r2 == 0) goto L42
                r6.unsupported = r4
                return r3
            L42:
                java.lang.String r2 = "protocols"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L55
                int r2 = r9.length
                if (r2 != 0) goto L4f
                r2 = 1
                goto L50
            L4f:
                r2 = 0
            L50:
                if (r2 == 0) goto L55
                java.util.List<java.lang.String> r7 = r6.protocols
                return r7
            L55:
                java.lang.String r2 = "selectProtocol"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                if (r2 != 0) goto L69
                java.lang.String r2 = "select"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto Lae
            L69:
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
                if (r1 == 0) goto Lae
                int r1 = r9.length
                if (r1 != r4) goto Lae
                r1 = r9[r7]
                boolean r1 = r1 instanceof java.util.List
                if (r1 == 0) goto Lae
                r8 = r9[r7]
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.collections.List<*>"
                java.util.Objects.requireNonNull(r8, r9)
                java.util.List r8 = (java.util.List) r8
                int r9 = r8.size()
                if (r9 < 0) goto La3
                r0 = 0
            L8a:
                java.lang.Object r1 = r8.get(r0)
                java.util.Objects.requireNonNull(r1, r5)
                java.lang.String r1 = (java.lang.String) r1
                java.util.List<java.lang.String> r2 = r6.protocols
                boolean r2 = r2.contains(r1)
                if (r2 == 0) goto L9e
                r6.selected = r1
                return r1
            L9e:
                if (r0 == r9) goto La3
                int r0 = r0 + 1
                goto L8a
            La3:
                java.util.List<java.lang.String> r8 = r6.protocols
                java.lang.Object r7 = r8.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r6.selected = r7
                return r7
            Lae:
                java.lang.String r1 = "protocolSelected"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 != 0) goto Lbf
                java.lang.String r1 = "selected"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto Lcc
            Lbf:
                int r0 = r9.length
                if (r0 != r4) goto Lcc
                r7 = r9[r7]
                java.util.Objects.requireNonNull(r7, r5)
                java.lang.String r7 = (java.lang.String) r7
                r6.selected = r7
                return r3
            Lcc:
                int r7 = r9.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r9, r7)
                java.lang.Object r7 = r8.invoke(r6, r7)
                return r7
        }

        public final void setSelected(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                r0 = this;
                r0.selected = r1
                return
        }

        public final void setUnsupported(boolean r1) {
                r0 = this;
                r0.unsupported = r1
                return
        }
    }

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 4, 1})
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
        public final okhttp3.internal.platform.Platform buildIfSupported() {
                r11 = this;
                java.lang.String r0 = "java.specification.version"
                java.lang.String r1 = "unknown"
                java.lang.String r0 = java.lang.System.getProperty(r0, r1)
                r1 = 0
                java.lang.String r2 = "jvmVersion"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.NumberFormatException -> L18
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L18
                r2 = 9
                if (r0 < r2) goto L18
                return r1
            L18:
                java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
                r2 = 1
                java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN$Provider"
                java.lang.Class r3 = java.lang.Class.forName(r3, r2, r1)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
                java.lang.Class r9 = java.lang.Class.forName(r4, r2, r1)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
                java.lang.Class r10 = java.lang.Class.forName(r4, r2, r1)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = "put"
                r5 = 2
                java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L7b
                java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
                r7 = 0
                r5[r7] = r6     // Catch: java.lang.Throwable -> L7b
                r5[r2] = r3     // Catch: java.lang.Throwable -> L7b
                java.lang.reflect.Method r6 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r3 = "get"
                java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L7b
                java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
                r4[r7] = r5     // Catch: java.lang.Throwable -> L7b
                java.lang.reflect.Method r3 = r0.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = "remove"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L7b
                java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
                r2[r7] = r5     // Catch: java.lang.Throwable -> L7b
                java.lang.reflect.Method r8 = r0.getMethod(r4, r2)     // Catch: java.lang.Throwable -> L7b
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform r0 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch: java.lang.Throwable -> L7b
                java.lang.String r2 = "putMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r2 = "getMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r2 = "removeMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r2 = "clientProviderClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r2 = "serverProviderClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Throwable -> L7b
                r5 = r0
                r7 = r3
                r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7b
                return r0
            L7b:
                return r1
        }
    }

    static {
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion r0 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion = r0
            return
    }

    public Jdk8WithJettyBootPlatform(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r2, @org.jetbrains.annotations.NotNull java.lang.reflect.Method r3, @org.jetbrains.annotations.NotNull java.lang.reflect.Method r4, @org.jetbrains.annotations.NotNull java.lang.Class<?> r5, @org.jetbrains.annotations.NotNull java.lang.Class<?> r6) {
            r1 = this;
            java.lang.String r0 = "putMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "getMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "removeMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "clientProviderClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "serverProviderClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.putMethod = r2
            r1.getMethod = r3
            r1.removeMethod = r4
            r1.clientProviderClass = r5
            r1.serverProviderClass = r6
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r6) {
            r5 = this;
            java.lang.String r0 = "failed to remove ALPN"
            java.lang.String r1 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.reflect.Method r1 = r5.removeMethod     // Catch: java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L1c
            r2 = 0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L1c
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L1c
            r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L15 java.lang.IllegalAccessException -> L1c
            return
        L15:
            r6 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r6)
            throw r1
        L1c:
            r6 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r6)
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull java.util.List<? extends okhttp3.Protocol> r9) {
            r6 = this;
            java.lang.String r8 = "failed to set ALPN"
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r9 = r0.alpnProtocolNames(r9)
            java.lang.Class<okhttp3.internal.platform.Platform> r0 = okhttp3.internal.platform.Platform.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            java.lang.Class<?> r3 = r6.clientProviderClass     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            java.lang.Class<?> r3 = r6.serverProviderClass     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r3 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r3.<init>(r9)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            java.lang.Object r9 = java.lang.reflect.Proxy.newProxyInstance(r0, r2, r3)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            java.lang.reflect.Method r0 = r6.putMethod     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r1[r4] = r7     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r1[r5] = r9     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            r0.invoke(r2, r1)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L43
            return
        L3c:
            r7 = move-exception
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8, r7)
            throw r9
        L43:
            r7 = move-exception
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8, r7)
            throw r9
    }

    @Override // okhttp3.internal.platform.Platform
    @org.jetbrains.annotations.Nullable
    public java.lang.String getSelectedProtocol(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r10) {
            r9 = this;
            java.lang.String r0 = "failed to get ALPN selected protocol"
            java.lang.String r1 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.reflect.Method r1 = r9.getMethod     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            r3 = 0
            r2[r3] = r10     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            r10 = 0
            java.lang.Object r1 = r1.invoke(r10, r2)     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            if (r1 == 0) goto L40
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r1 = (okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider) r1     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            boolean r2 = r1.getUnsupported()     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            if (r2 != 0) goto L34
            java.lang.String r2 = r1.getSelected()     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            if (r2 != 0) goto L34
            java.lang.String r4 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            okhttp3.internal.platform.Platform.log$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            return r10
        L34:
            boolean r2 = r1.getUnsupported()     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            if (r2 == 0) goto L3b
            goto L3f
        L3b:
            java.lang.String r10 = r1.getSelected()     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
        L3f:
            return r10
        L40:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider"
            r10.<init>(r1)     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
            throw r10     // Catch: java.lang.IllegalAccessException -> L48 java.lang.reflect.InvocationTargetException -> L4f
        L48:
            r10 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r10)
            throw r1
        L4f:
            r10 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r10)
            throw r1
    }
}
