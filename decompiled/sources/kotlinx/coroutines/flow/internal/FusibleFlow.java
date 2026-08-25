package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/FusibleFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "fuse", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FusibleFlow<T> extends kotlinx.coroutines.flow.Flow<T> {

    /* JADX INFO: compiled from: ChannelFlow.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ kotlinx.coroutines.flow.Flow fuse$default(kotlinx.coroutines.flow.internal.FusibleFlow r0, kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L18
                r5 = r4 & 1
                if (r5 == 0) goto L8
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L8:
                r5 = r4 & 2
                if (r5 == 0) goto Ld
                r2 = -3
            Ld:
                r4 = r4 & 4
                if (r4 == 0) goto L13
                kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            L13:
                kotlinx.coroutines.flow.Flow r0 = r0.fuse(r1, r2, r3)
                return r0
            L18:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: fuse"
                r0.<init>(r1)
                throw r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<T> fuse(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3);
}
