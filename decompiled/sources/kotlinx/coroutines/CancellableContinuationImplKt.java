package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"RESUMED", "", "RESUME_TOKEN", "Lkotlinx/coroutines/internal/Symbol;", "getRESUME_TOKEN$annotations", "()V", "SUSPENDED", "UNDECIDED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CancellableContinuationImplKt {
    private static final int RESUMED = 2;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol RESUME_TOKEN = null;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "RESUME_TOKEN"
            r0.<init>(r1)
            kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN = r0
            return
    }

    public static /* synthetic */ void getRESUME_TOKEN$annotations() {
            return
    }
}
