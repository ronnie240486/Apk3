package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"NO_DECISION", "", "getNO_DECISION$annotations", "()V", "RETRY_ATOMIC", "getRETRY_ATOMIC$annotations", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AtomicKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object NO_DECISION = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object RETRY_ATOMIC = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_DECISION"
            r0.<init>(r1)
            kotlinx.coroutines.internal.AtomicKt.NO_DECISION = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "RETRY_ATOMIC"
            r0.<init>(r1)
            kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC = r0
            return
    }

    public static /* synthetic */ void getNO_DECISION$annotations() {
            return
    }

    public static /* synthetic */ void getRETRY_ATOMIC$annotations() {
            return
    }
}
