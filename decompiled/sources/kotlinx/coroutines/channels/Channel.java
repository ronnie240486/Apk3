package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/Channel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Factory", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Channel<E> extends kotlinx.coroutines.channels.SendChannel<E>, kotlinx.coroutines.channels.ReceiveChannel<E> {
    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.Channel.Factory Factory = null;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = Integer.MAX_VALUE;

    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void cancel(kotlinx.coroutines.channels.Channel r0) {
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static <E> kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Channel<E> r0) {
                kotlinx.coroutines.selects.SelectClause1 r0 = kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.getOnReceiveOrNull(r0)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Channel<E> r0, E r1) {
                boolean r0 = kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(r0, r1)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @org.jetbrains.annotations.Nullable
        public static <E> E poll(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Channel<E> r0) {
                java.lang.Object r0 = kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.poll(r0)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @kotlin.internal.LowPriorityInOverloadResolution
        @org.jetbrains.annotations.Nullable
        public static <E> java.lang.Object receiveOrNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.Channel<E> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super E> r1) {
                java.lang.Object r0 = kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/Channel$Factory;", "", "()V", "BUFFERED", "", "CHANNEL_DEFAULT_CAPACITY", "getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core", "()I", "CONFLATED", "DEFAULT_BUFFER_PROPERTY_NAME", "", "OPTIONAL_CHANNEL", "RENDEZVOUS", "UNLIMITED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Factory {
        public static final /* synthetic */ kotlinx.coroutines.channels.Channel.Factory $$INSTANCE = null;
        public static final int BUFFERED = -2;
        private static final int CHANNEL_DEFAULT_CAPACITY = 0;
        public static final int CONFLATED = -1;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = Integer.MAX_VALUE;

        static {
                kotlinx.coroutines.channels.Channel$Factory r0 = new kotlinx.coroutines.channels.Channel$Factory
                r0.<init>()
                kotlinx.coroutines.channels.Channel.Factory.$$INSTANCE = r0
                java.lang.String r0 = "kotlinx.coroutines.channels.defaultBuffer"
                r1 = 64
                r2 = 1
                r3 = 2147483646(0x7ffffffe, float:NaN)
                int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r2, r3)
                kotlinx.coroutines.channels.Channel.Factory.CHANNEL_DEFAULT_CAPACITY = r0
                return
        }

        private Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
                r1 = this;
                int r0 = kotlinx.coroutines.channels.Channel.Factory.CHANNEL_DEFAULT_CAPACITY
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory.$$INSTANCE
            kotlinx.coroutines.channels.Channel.Factory = r0
            return
    }
}
