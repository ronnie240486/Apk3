package kotlin.jvm.internal;

/* JADX INFO: compiled from: localVariableReferences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"notSupportedError", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LocalVariableReferencesKt {
    public static final /* synthetic */ java.lang.Void access$notSupportedError() {
            java.lang.Void r0 = notSupportedError()
            return r0
    }

    private static final java.lang.Void notSupportedError() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not supported for local property reference."
            r0.<init>(r1)
            throw r0
    }
}
