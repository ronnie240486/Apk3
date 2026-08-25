package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
public final class AbstractChannel$receiveCatching$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    public int label;
    public /* synthetic */ java.lang.Object result;
    public final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel<E> this$0;

    public AbstractChannel$receiveCatching$1(kotlinx.coroutines.channels.AbstractChannel<E> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            kotlinx.coroutines.channels.AbstractChannel<E> r2 = r1.this$0
            java.lang.Object r2 = r2.mo1819receiveCatchingJP2dKIU(r1)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L16
            return r2
        L16:
            kotlinx.coroutines.channels.ChannelResult r2 = kotlinx.coroutines.channels.ChannelResult.m1826boximpl(r2)
            return r2
    }
}
