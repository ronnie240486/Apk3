package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0087\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\\\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0087\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final enum CoroutineStart extends java.lang.Enum<kotlinx.coroutines.CoroutineStart> {
    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] $VALUES = null;

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static final kotlinx.coroutines.CoroutineStart ATOMIC = null;
    public static final kotlinx.coroutines.CoroutineStart DEFAULT = null;
    public static final kotlinx.coroutines.CoroutineStart LAZY = null;
    public static final kotlinx.coroutines.CoroutineStart UNDISPATCHED = null;

    /* JADX INFO: compiled from: CoroutineStart.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.DEFAULT
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.ATOMIC
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    private static final /* synthetic */ kotlinx.coroutines.CoroutineStart[] $values() {
            r0 = 4
            kotlinx.coroutines.CoroutineStart[] r0 = new kotlinx.coroutines.CoroutineStart[r0]
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.LAZY
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.ATOMIC
            r2 = 2
            r0[r2] = r1
            kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.DEFAULT = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "LAZY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.LAZY = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "ATOMIC"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.ATOMIC = r0
            kotlinx.coroutines.CoroutineStart r0 = new kotlinx.coroutines.CoroutineStart
            java.lang.String r1 = "UNDISPATCHED"
            r2 = 3
            r0.<init>(r1, r2)
            kotlinx.coroutines.CoroutineStart.UNDISPATCHED = r0
            kotlinx.coroutines.CoroutineStart[] r0 = $values()
            kotlinx.coroutines.CoroutineStart.$VALUES = r0
            return
    }

    private CoroutineStart(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static /* synthetic */ void isLazy$annotations() {
            return
    }

    public static kotlinx.coroutines.CoroutineStart valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.CoroutineStart> r0 = kotlinx.coroutines.CoroutineStart.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.CoroutineStart r1 = (kotlinx.coroutines.CoroutineStart) r1
            return r1
    }

    public static kotlinx.coroutines.CoroutineStart[] values() {
            kotlinx.coroutines.CoroutineStart[] r0 = kotlinx.coroutines.CoroutineStart.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.CoroutineStart[] r0 = (kotlinx.coroutines.CoroutineStart[]) r0
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public final <T> void invoke(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
            r2 = this;
            int[] r0 = kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0
            int r1 = r2.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L23
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1b
            r3 = 4
            if (r0 != r3) goto L15
            goto L26
        L15:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L1b:
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUndispatched(r3, r4)
            goto L26
        L1f:
            kotlin.coroutines.ContinuationKt.startCoroutine(r3, r4)
            goto L26
        L23:
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r3, r4)
        L26:
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public final <R, T> void invoke(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, R r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r9) {
            r6 = this;
            int[] r0 = kotlinx.coroutines.CoroutineStart.WhenMappings.$EnumSwitchMapping$0
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L23
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1b
            r7 = 4
            if (r0 != r7) goto L15
            goto L2c
        L15:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L1b:
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUndispatched(r7, r8, r9)
            goto L2c
        L1f:
            kotlin.coroutines.ContinuationKt.startCoroutine(r7, r8, r9)
            goto L2c
        L23:
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
        L2c:
            return
    }

    public final boolean isLazy() {
            r1 = this;
            kotlinx.coroutines.CoroutineStart r0 = kotlinx.coroutines.CoroutineStart.LAZY
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
