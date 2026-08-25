package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"BroadcastChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "capacity", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BroadcastChannelKt {
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> BroadcastChannel(int r1) {
            r0 = -2
            if (r1 == r0) goto L29
            r0 = -1
            if (r1 == r0) goto L23
            if (r1 == 0) goto L1b
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L13
            kotlinx.coroutines.channels.ArrayBroadcastChannel r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel
            r0.<init>(r1)
            goto L34
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported UNLIMITED capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported 0 capacity for BroadcastChannel"
            r1.<init>(r0)
            throw r1
        L23:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel
            r0.<init>()
            goto L34
        L29:
            kotlinx.coroutines.channels.ArrayBroadcastChannel r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel
            kotlinx.coroutines.channels.Channel$Factory r1 = kotlinx.coroutines.channels.Channel.Factory
            int r1 = r1.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            r0.<init>(r1)
        L34:
            return r0
    }
}
