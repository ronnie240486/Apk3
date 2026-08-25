package okhttp3;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lokhttp3/Dns;", "", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public interface Dns {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Dns.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Dns SYSTEM = null;

    /* JADX INFO: compiled from: Dns.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/Dns$Companion;", "", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: compiled from: Dns.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "()V", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "okhttp"}, k = 1, mv = {1, 4, 1})
        public static final class DnsSystem implements okhttp3.Dns {
            public DnsSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.Dns
            @org.jetbrains.annotations.NotNull
            public java.util.List<java.net.InetAddress> lookup(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                    r3 = this;
                    java.lang.String r0 = "hostname"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.net.InetAddress[] r0 = java.net.InetAddress.getAllByName(r4)     // Catch: java.lang.NullPointerException -> L13
                    java.lang.String r1 = "InetAddress.getAllByName(hostname)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.NullPointerException -> L13
                    java.util.List r4 = kotlin.collections.ArraysKt.toList(r0)     // Catch: java.lang.NullPointerException -> L13
                    return r4
                L13:
                    r0 = move-exception
                    java.net.UnknownHostException r1 = new java.net.UnknownHostException
                    java.lang.String r2 = "Broken system behaviour for dns lookup of "
                    java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4)
                    r1.<init>(r4)
                    r1.initCause(r0)
                    throw r1
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
            okhttp3.Dns$Companion r0 = new okhttp3.Dns$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Dns.Companion = r0
            okhttp3.Dns$Companion$DnsSystem r0 = new okhttp3.Dns$Companion$DnsSystem
            r0.<init>()
            okhttp3.Dns.SYSTEM = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    java.util.List<java.net.InetAddress> lookup(@org.jetbrains.annotations.NotNull java.lang.String r1) throws java.net.UnknownHostException;
}
