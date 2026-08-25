package okhttp3.internal.http;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", "message", "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class StatusLine {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.StatusLine.Companion Companion = null;
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;

    @kotlin.jvm.JvmField
    public final int code;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String message;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Protocol protocol;

    /* JADX INFO: compiled from: StatusLine.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "HTTP_CONTINUE", "", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp"}, k = 1, mv = {1, 4, 1})
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

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http.StatusLine get(@org.jetbrains.annotations.NotNull okhttp3.Response r4) {
                r3 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.internal.http.StatusLine r0 = new okhttp3.internal.http.StatusLine
                okhttp3.Protocol r1 = r4.protocol()
                int r2 = r4.code()
                java.lang.String r4 = r4.message()
                r0.<init>(r1, r2, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.http.StatusLine parse(@org.jetbrains.annotations.NotNull java.lang.String r8) throws java.io.IOException {
                r7 = this;
                java.lang.String r0 = "statusLine"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "HTTP/1."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r8, r0)
                r1 = 32
                r2 = 9
                java.lang.String r3 = "Unexpected status line: "
                if (r0 == 0) goto L48
                int r0 = r8.length()
                if (r0 < r2) goto L3e
                r0 = 8
                char r0 = r8.charAt(r0)
                if (r0 != r1) goto L3e
                r0 = 7
                char r0 = r8.charAt(r0)
                int r0 = r0 + (-48)
                if (r0 != 0) goto L2e
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                goto L53
            L2e:
                r4 = 1
                if (r0 != r4) goto L34
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                goto L53
            L34:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8)
                r0.<init>(r8)
                throw r0
            L3e:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8)
                r0.<init>(r8)
                throw r0
            L48:
                java.lang.String r0 = "ICY "
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r8, r0)
                if (r0 == 0) goto La6
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                r2 = 4
            L53:
                int r4 = r8.length()
                int r5 = r2 + 3
                if (r4 < r5) goto L9c
                java.lang.String r4 = r8.substring(r2, r5)     // Catch: java.lang.NumberFormatException -> L92
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch: java.lang.NumberFormatException -> L92
                int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L92
                int r6 = r8.length()
                if (r6 <= r5) goto L8a
                char r5 = r8.charAt(r5)
                if (r5 != r1) goto L80
                int r2 = r2 + 4
                java.lang.String r8 = r8.substring(r2)
                java.lang.String r1 = "(this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                goto L8c
            L80:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8)
                r0.<init>(r8)
                throw r0
            L8a:
                java.lang.String r8 = ""
            L8c:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
                r1.<init>(r0, r4, r8)
                return r1
            L92:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8)
                r0.<init>(r8)
                throw r0
            L9c:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8)
                r0.<init>(r8)
                throw r0
            La6:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r8 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r8)
                r0.<init>(r8)
                throw r0
        }
    }

    static {
            okhttp3.internal.http.StatusLine$Companion r0 = new okhttp3.internal.http.StatusLine$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.StatusLine.Companion = r0
            return
    }

    public StatusLine(@org.jetbrains.annotations.NotNull okhttp3.Protocol r2, int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.protocol = r2
            r1.code = r3
            r1.message = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Protocol r1 = r3.protocol
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_0
            if (r1 != r2) goto L11
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L16
        L11:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L16:
            r1 = 32
            r0.append(r1)
            int r2 = r3.code
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.message
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
