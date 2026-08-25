package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u001a\u0010\fR>\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00058\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "<set-?>", "slots", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "getSlots$annotations", "()V", "", "nCollectors", "I", "getNCollectors", "()I", "nextIndex", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class AbstractSharedFlow<S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>> {

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;

    @org.jetbrains.annotations.Nullable
    private S[] slots;

    public AbstractSharedFlow() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$getNCollectors(kotlinx.coroutines.flow.internal.AbstractSharedFlow r0) {
            int r0 = r0.nCollectors
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots(kotlinx.coroutines.flow.internal.AbstractSharedFlow r0) {
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r0.slots
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final S allocateSlot() {
            r4 = this;
            monitor-enter(r4)
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r4.slots     // Catch: java.lang.Throwable -> L4f
            r1 = 2
            if (r0 != 0) goto Ld
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = r4.createSlotArray(r1)     // Catch: java.lang.Throwable -> L4f
            r4.slots = r0     // Catch: java.lang.Throwable -> L4f
            goto L25
        Ld:
            int r2 = r4.nCollectors     // Catch: java.lang.Throwable -> L4f
            int r3 = r0.length     // Catch: java.lang.Throwable -> L4f
            if (r2 < r3) goto L25
            int r2 = r0.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L4f
            r1 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r1     // Catch: java.lang.Throwable -> L4f
            r4.slots = r1     // Catch: java.lang.Throwable -> L4f
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0     // Catch: java.lang.Throwable -> L4f
        L25:
            int r1 = r4.nextIndex     // Catch: java.lang.Throwable -> L4f
        L27:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L4f
            if (r2 != 0) goto L31
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r2 = r4.createSlot()     // Catch: java.lang.Throwable -> L4f
            r0[r1] = r2     // Catch: java.lang.Throwable -> L4f
        L31:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> L4f
            if (r1 < r3) goto L37
            r1 = 0
        L37:
            boolean r3 = r2.allocateLocked(r4)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L27
            r4.nextIndex = r1     // Catch: java.lang.Throwable -> L4f
            int r0 = r4.nCollectors     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            int r0 = r0 + r1
            r4.nCollectors = r0     // Catch: java.lang.Throwable -> L4f
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r0 = r4._subscriptionCount     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)
            if (r0 != 0) goto L4b
            goto L4e
        L4b:
            r0.increment(r1)
        L4e:
            return r2
        L4f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract S createSlot();

    @org.jetbrains.annotations.NotNull
    public abstract S[] createSlotArray(int r1);

    public final void freeSlot(@org.jetbrains.annotations.NotNull S r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.nCollectors     // Catch: java.lang.Throwable -> L30
            r1 = -1
            int r0 = r0 + r1
            r6.nCollectors = r0     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r2 = r6._subscriptionCount     // Catch: java.lang.Throwable -> L30
            r3 = 0
            if (r0 != 0) goto Le
            r6.nextIndex = r3     // Catch: java.lang.Throwable -> L30
        Le:
            kotlin.coroutines.Continuation[] r7 = r7.freeLocked(r6)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r6)
            int r0 = r7.length
        L14:
            if (r3 >= r0) goto L29
            r4 = r7[r3]
            int r3 = r3 + 1
            if (r4 != 0) goto L1d
            goto L14
        L1d:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m333constructorimpl(r5)
            r4.resumeWith(r5)
            goto L14
        L29:
            if (r2 != 0) goto L2c
            goto L2f
        L2c:
            r2.increment(r1)
        L2f:
            return
        L30:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final int getNCollectors() {
            r1 = this;
            int r0 = r1.nCollectors
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final S[] getSlots() {
            r1 = this;
            S extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<?>[] r0 = r1.slots
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
            r2 = this;
            monitor-enter(r2)
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r0 = r2._subscriptionCount     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow r0 = new kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow     // Catch: java.lang.Throwable -> L10
            int r1 = r2.nCollectors     // Catch: java.lang.Throwable -> L10
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10
            r2._subscriptionCount = r0     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
