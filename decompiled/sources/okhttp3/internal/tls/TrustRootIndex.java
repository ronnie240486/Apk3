package okhttp3.internal.tls;

/* JADX INFO: compiled from: TrustRootIndex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/tls/TrustRootIndex;", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "okhttp"}, k = 1, mv = {1, 4, 1})
public interface TrustRootIndex {
    @org.jetbrains.annotations.Nullable
    java.security.cert.X509Certificate findByIssuerAndSignature(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r1);
}
