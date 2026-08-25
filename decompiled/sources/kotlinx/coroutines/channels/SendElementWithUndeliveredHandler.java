package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016R&\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00028\u0000`\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/SendElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/SendElement;", "pollResult", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "onUndeliveredElement", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)V", "remove", "", "undeliveredElement", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SendElementWithUndeliveredHandler<E> extends kotlinx.coroutines.channels.SendElement<E> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;

    public SendElementWithUndeliveredHandler(E r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.onUndeliveredElement = r3
            return
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: remove */
    public boolean mo1865remove() {
            r1 = this;
            boolean r0 = super.mo1865remove()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r1.undeliveredElement()
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.Send
    public void undeliveredElement() {
            r3 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r3.onUndeliveredElement
            java.lang.Object r1 = r3.getPollResult()
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r2 = r3.cont
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r2)
            return
    }
}
