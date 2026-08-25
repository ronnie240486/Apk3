package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
public final class ChannelFlowMerge$collectTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    public java.lang.Object L$0;
    public kotlinx.coroutines.flow.Flow L$1;
    public int label;
    public /* synthetic */ java.lang.Object result;
    public final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2<T> this$0;

    public ChannelFlowMerge$collectTo$2$emit$1(kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1> r2) {
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
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
    }
}
