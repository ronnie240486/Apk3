package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00020\u0001H\u0001\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u001c\u0010\t\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\u0016\u0010\f\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u0016\u0010\u000e\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003*\n\u0010\u0013\"\u00020\u00142\u00020\u0014*\u001c\u0010\u0015\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u0002H\u00160\u00172\b\u0012\u0004\u0012\u0002H\u00160\u0017*\f\b\u0002\u0010\u0018\"\u00020\u00112\u00020\u0011*\n\u0010\u0019\"\u00020\u001a2\u00020\u001a*\u001c\u0010\u001b\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u0002H\u00160\u001c2\b\u0012\u0004\u0012\u0002H\u00160\u001c¨\u0006\u001d"}, d2 = {"CONDITION_FALSE", "", "getCONDITION_FALSE$annotations", "()V", "getCONDITION_FALSE", "()Ljava/lang/Object;", "FAILURE", "", "getFAILURE$annotations", "LIST_EMPTY", "getLIST_EMPTY$annotations", "getLIST_EMPTY", "SUCCESS", "getSUCCESS$annotations", "UNDECIDED", "getUNDECIDED$annotations", "unwrap", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "AbstractAtomicDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "AddLastDesc", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Node", "PrepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "RemoveFirstDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LockFreeLinkedListKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object CONDITION_FALSE = null;
    public static final int FAILURE = 2;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Object LIST_EMPTY = null;
    public static final int SUCCESS = 1;
    public static final int UNDECIDED = 0;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CONDITION_FALSE"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListKt.CONDITION_FALSE = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "LIST_EMPTY"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListKt.LIST_EMPTY = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object getCONDITION_FALSE() {
            java.lang.Object r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.CONDITION_FALSE
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getCONDITION_FALSE$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getFAILURE$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object getLIST_EMPTY() {
            java.lang.Object r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.LIST_EMPTY
            return r0
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getLIST_EMPTY$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getSUCCESS$annotations() {
            return
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getUNDECIDED$annotations() {
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.LockFreeLinkedListNode unwrap(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.Removed
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r2
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.ref
        Lf:
            if (r1 != 0) goto L14
            r1 = r2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
        L14:
            return r1
    }
}
