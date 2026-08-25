package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public class OperationCanceledException extends java.lang.RuntimeException {
    public OperationCanceledException() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OperationCanceledException(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "The operation has been canceled."
            java.lang.String r2 = androidx.core.util.ObjectsCompat.toString(r2, r0)
            r1.<init>(r2)
            return
    }
}
