package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/SendElement;", "E", "Lkotlinx/coroutines/channels/Send;", "pollResult", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SendElement<E> extends kotlinx.coroutines.channels.Send {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
    private final E pollResult;

    public SendElement(E r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.<init>()
            r0.pollResult = r1
            r0.cont = r2
            return
    }

    @Override // kotlinx.coroutines.channels.Send
    public void completeResumeSend() {
            r2 = this;
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r2.cont
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            r0.completeResume(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.Send
    public E getPollResult() {
            r1 = this;
            E r0 = r1.pollResult
            return r0
    }

    @Override // kotlinx.coroutines.channels.Send
    public void resumeSendClosed(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Closed<?> r3) {
            r2 = this;
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r2.cont
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Throwable r3 = r3.getSendException()
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m333constructorimpl(r3)
            r0.resumeWith(r3)
            return
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Object r1 = r2.getPollResult()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.Send
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.internal.Symbol tryResumeSend(@org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r5) {
            r4 = this;
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r4.cont
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r2 = 0
            if (r5 != 0) goto L9
            r3 = r2
            goto Lb
        L9:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r3 = r5.desc
        Lb:
            java.lang.Object r0 = r0.tryResume(r1, r3)
            if (r0 != 0) goto L12
            return r2
        L12:
            if (r5 != 0) goto L15
            goto L18
        L15:
            r5.finishPrepare()
        L18:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r5
    }
}
