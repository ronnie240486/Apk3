package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
public final class ChannelIterator$next0$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    public kotlinx.coroutines.channels.ChannelIterator L$0;
    public int label;
    public /* synthetic */ java.lang.Object result;

    public ChannelIterator$next0$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelIterator$next0$1> r1) {
            r0 = this;
            r0.<init>(r1)
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
            r2 = 0
            java.lang.Object r2 = kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(r2, r1)
            return r2
    }
}
