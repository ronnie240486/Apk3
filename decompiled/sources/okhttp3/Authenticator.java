package okhttp3;

/* JADX INFO: compiled from: Authenticator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lokhttp3/Authenticator;", "", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public interface Authenticator {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Authenticator.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Authenticator JAVA_NET_AUTHENTICATOR = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Authenticator NONE = null;

    /* JADX INFO: compiled from: Authenticator.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/Authenticator$Companion;", "", "()V", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/Authenticator;", "NONE", "AuthenticatorNone", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: compiled from: Authenticator.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "()V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "okhttp"}, k = 1, mv = {1, 4, 1})
        public static final class AuthenticatorNone implements okhttp3.Authenticator {
            public AuthenticatorNone() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Authenticator
            @org.jetbrains.annotations.Nullable
            public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable okhttp3.Route r1, @org.jetbrains.annotations.NotNull okhttp3.Response r2) {
                    r0 = this;
                    java.lang.String r1 = "response"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    r1 = 0
                    return r1
            }
        }

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
    }

    static {
            okhttp3.Authenticator$Companion r0 = new okhttp3.Authenticator$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Authenticator.Companion = r0
            okhttp3.Authenticator$Companion$AuthenticatorNone r0 = new okhttp3.Authenticator$Companion$AuthenticatorNone
            r0.<init>()
            okhttp3.Authenticator.NONE = r0
            okhttp3.internal.authenticator.JavaNetAuthenticator r0 = new okhttp3.internal.authenticator.JavaNetAuthenticator
            r2 = 1
            r0.<init>(r1, r2, r1)
            okhttp3.Authenticator.JAVA_NET_AUTHENTICATOR = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable okhttp3.Route r1, @org.jetbrains.annotations.NotNull okhttp3.Response r2) throws java.io.IOException;
}
