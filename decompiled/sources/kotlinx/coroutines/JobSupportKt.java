package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0016H\u0000\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0016H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0010\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003\"\u0016\u0010\u0012\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003\"\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_RETRY", "getCOMPLETING_RETRY$annotations", "COMPLETING_WAITING_CHILDREN", "getCOMPLETING_WAITING_CHILDREN$annotations", "EMPTY_ACTIVE", "Lkotlinx/coroutines/Empty;", "getEMPTY_ACTIVE$annotations", "EMPTY_NEW", "getEMPTY_NEW$annotations", "FALSE", "", "RETRY", "SEALED", "getSEALED$annotations", "TOO_LATE_TO_CANCEL", "getTOO_LATE_TO_CANCEL$annotations", "TRUE", "boxIncomplete", "", "unboxState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class JobSupportKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_ALREADY = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_RETRY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol COMPLETING_WAITING_CHILDREN = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.Empty EMPTY_ACTIVE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.Empty EMPTY_NEW = null;
    private static final int FALSE = 0;
    private static final int RETRY = -1;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol SEALED = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.Symbol TOO_LATE_TO_CANCEL = null;
    private static final int TRUE = 1;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_ALREADY"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SEALED"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.SEALED = r0
            kotlinx.coroutines.Empty r0 = new kotlinx.coroutines.Empty
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.EMPTY_NEW = r0
            kotlinx.coroutines.Empty r0 = new kotlinx.coroutines.Empty
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCOMPLETING_ALREADY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCOMPLETING_RETRY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Empty access$getEMPTY_ACTIVE$p() {
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Empty access$getEMPTY_NEW$p() {
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.EMPTY_NEW
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSEALED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.SEALED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getTOO_LATE_TO_CANCEL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object boxIncomplete(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto Lc
            kotlinx.coroutines.IncompleteStateBox r0 = new kotlinx.coroutines.IncompleteStateBox
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            r0.<init>(r1)
            r1 = r0
        Lc:
            return r1
    }

    private static /* synthetic */ void getCOMPLETING_ALREADY$annotations() {
            return
    }

    private static /* synthetic */ void getCOMPLETING_RETRY$annotations() {
            return
    }

    public static /* synthetic */ void getCOMPLETING_WAITING_CHILDREN$annotations() {
            return
    }

    private static /* synthetic */ void getEMPTY_ACTIVE$annotations() {
            return
    }

    private static /* synthetic */ void getEMPTY_NEW$annotations() {
            return
    }

    private static /* synthetic */ void getSEALED$annotations() {
            return
    }

    private static /* synthetic */ void getTOO_LATE_TO_CANCEL$annotations() {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object unboxState(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.IncompleteStateBox
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.IncompleteStateBox r0 = (kotlinx.coroutines.IncompleteStateBox) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            kotlinx.coroutines.Incomplete r0 = r0.state
            if (r0 != 0) goto L11
            goto L12
        L11:
            r1 = r0
        L12:
            return r1
    }
}
