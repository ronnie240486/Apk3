package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u001aX\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u000b0\bH\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a^\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0016\u0010\u0013\u001a^\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\\\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u001a\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Channel", "Lkotlinx/coroutines/channels/Channel;", "E", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "getOrElse", "T", "Lkotlinx/coroutines/channels/ChannelResult;", "onFailure", "", "Lkotlin/ParameterName;", "name", "exception", "getOrElse-WpGqRn0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "onClosed", "action", "onClosed-WpGqRn0", "onFailure-WpGqRn0", "onSuccess", "value", "onSuccess-WpGqRn0", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ChannelKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.channels.Channel Channel(int r2) {
            r0 = 0
            r1 = 6
            kotlinx.coroutines.channels.Channel r2 = Channel$default(r2, r0, r0, r1, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> kotlinx.coroutines.channels.Channel<E> Channel(int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r4) {
            r0 = -2
            r1 = 1
            if (r2 == r0) goto L51
            r0 = -1
            if (r2 == r0) goto L37
            if (r2 == 0) goto L27
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L21
            if (r2 != r1) goto L1a
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r3 != r0) goto L1a
            kotlinx.coroutines.channels.ConflatedChannel r2 = new kotlinx.coroutines.channels.ConflatedChannel
            r2.<init>(r4)
            goto L60
        L1a:
            kotlinx.coroutines.channels.ArrayChannel r0 = new kotlinx.coroutines.channels.ArrayChannel
            r0.<init>(r2, r3, r4)
            r2 = r0
            goto L60
        L21:
            kotlinx.coroutines.channels.LinkedListChannel r2 = new kotlinx.coroutines.channels.LinkedListChannel
            r2.<init>(r4)
            goto L60
        L27:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r2) goto L31
            kotlinx.coroutines.channels.RendezvousChannel r2 = new kotlinx.coroutines.channels.RendezvousChannel
            r2.<init>(r4)
            goto L60
        L31:
            kotlinx.coroutines.channels.ArrayChannel r2 = new kotlinx.coroutines.channels.ArrayChannel
            r2.<init>(r1, r3, r4)
            goto L60
        L37:
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r2) goto L3c
            goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 == 0) goto L45
            kotlinx.coroutines.channels.ConflatedChannel r2 = new kotlinx.coroutines.channels.ConflatedChannel
            r2.<init>(r4)
            goto L60
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L51:
            kotlinx.coroutines.channels.ArrayChannel r2 = new kotlinx.coroutines.channels.ArrayChannel
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r3 != r0) goto L5d
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r1 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
        L5d:
            r2.<init>(r1, r3, r4)
        L60:
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.channels.Channel r0 = Channel(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int r0, kotlinx.coroutines.channels.BufferOverflow r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r0 = 0
        L5:
            r4 = r3 & 2
            if (r4 == 0) goto Lb
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        Lb:
            r3 = r3 & 4
            if (r3 == 0) goto L10
            r2 = 0
        L10:
            kotlinx.coroutines.channels.Channel r0 = Channel(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m1822getOrElseWpGqRn0(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends T> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 == 0) goto Lc
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m1830exceptionOrNullimpl(r1)
            java.lang.Object r1 = r2.invoke(r1)
        Lc:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m1823onClosedWpGqRn0(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.m1830exceptionOrNullimpl(r1)
            r2.invoke(r0)
        Lb:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m1824onFailureWpGqRn0(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = kotlinx.coroutines.channels.ChannelResult.m1830exceptionOrNullimpl(r1)
            r2.invoke(r0)
        Lb:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m1825onSuccessWpGqRn0(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r2) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 != 0) goto L7
            r2.invoke(r1)
        L7:
            return r1
    }
}
