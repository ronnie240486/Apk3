package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\u001a#\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u0013*\u0004\u0018\u00010\u0014H\u0082\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u0013*\u0006\u0012\u0002\b\u00030\u0016H\u0082\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0016\u0010\f\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000*(\b\u0000\u0010\u0018\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "getEMPTY$annotations", "()V", "ENQUEUE_FAILED", "getENQUEUE_FAILED$annotations", "HANDLER_INVOKED", "getHANDLER_INVOKED$annotations", "OFFER_FAILED", "getOFFER_FAILED$annotations", "OFFER_SUCCESS", "getOFFER_SUCCESS$annotations", "POLL_FAILED", "getPOLL_FAILED$annotations", "RECEIVE_RESULT", "", "RECEIVE_THROWS_ON_CLOSE", "toResult", "Lkotlinx/coroutines/channels/ChannelResult;", "E", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Object;", "Handler", "Lkotlin/Function1;", "", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AbstractChannelKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol EMPTY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol ENQUEUE_FAILED = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol HANDLER_INVOKED = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol OFFER_FAILED = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol OFFER_SUCCESS = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.Symbol POLL_FAILED = null;
    public static final int RECEIVE_RESULT = 1;
    public static final int RECEIVE_THROWS_ON_CLOSE = 0;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "EMPTY"
            r0.<init>(r1)
            kotlinx.coroutines.channels.AbstractChannelKt.EMPTY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "OFFER_SUCCESS"
            r0.<init>(r1)
            kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "OFFER_FAILED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "POLL_FAILED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "ENQUEUE_FAILED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "ON_CLOSE_HANDLER_INVOKED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED = r0
            return
    }

    public static /* synthetic */ void getEMPTY$annotations() {
            return
    }

    public static /* synthetic */ void getENQUEUE_FAILED$annotations() {
            return
    }

    public static /* synthetic */ void getHANDLER_INVOKED$annotations() {
            return
    }

    public static /* synthetic */ void getOFFER_FAILED$annotations() {
            return
    }

    public static /* synthetic */ void getOFFER_SUCCESS$annotations() {
            return
    }

    public static /* synthetic */ void getPOLL_FAILED$annotations() {
            return
    }

    private static final <E> java.lang.Object toResult(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto Lf
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
            java.lang.Throwable r1 = r1.closeCause
            java.lang.Object r1 = r0.m1839closedJP2dKIU(r1)
            goto L15
        Lf:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r1 = r0.m1841successJP2dKIU(r1)
        L15:
            return r1
    }

    private static final <E> java.lang.Object toResult(kotlinx.coroutines.channels.Closed<?> r1) {
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r1.closeCause
            java.lang.Object r1 = r0.m1839closedJP2dKIU(r1)
            return r1
    }
}
