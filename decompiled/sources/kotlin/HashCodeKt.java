package kotlin;

/* JADX INFO: compiled from: HashCode.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0087\b¨\u0006\u0003"}, d2 = {"hashCode", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HashCodeKt {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final int hashCode(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }
}
