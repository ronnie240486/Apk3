package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 %*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003$%&B\u0016\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0005J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "T", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHolder$annotations", "()V", "isClosed", "", "isClosed-impl", "(Ljava/lang/Object;)Z", "isFailure", "isFailure-impl", "isSuccess", "isSuccess-impl", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "getOrThrow", "getOrThrow-impl", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Closed", "Companion", "Failed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class ChannelResult<T> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.ChannelResult.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.channels.ChannelResult.Failed failed = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object holder;

    /* JADX INFO: compiled from: Channel.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "cause", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Closed extends kotlinx.coroutines.channels.ChannelResult.Failed {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable cause;

        public Closed(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.cause = r1
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.cause
                kotlinx.coroutines.channels.ChannelResult$Closed r2 = (kotlinx.coroutines.channels.ChannelResult.Closed) r2
                java.lang.Throwable r2 = r2.cause
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.cause
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                return r0
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Closed("
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.Throwable r1 = r2.cause
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlinx.coroutines.InternalCoroutinesApi
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0001\u0010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0001\u0010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0010\u001a\u0002H\u0007H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "()V", "failed", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "closed", "Lkotlinx/coroutines/channels/ChannelResult;", "E", "cause", "", "closed-JP2dKIU", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "failure", "failure-PtdJZtk", "()Ljava/lang/Object;", "success", "value", "success-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m1839closedJP2dKIU(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.channels.ChannelResult$Closed r0 = new kotlinx.coroutines.channels.ChannelResult$Closed
                r0.<init>(r2)
                java.lang.Object r2 = kotlinx.coroutines.channels.ChannelResult.m1827constructorimpl(r0)
                return r2
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> java.lang.Object m1840failurePtdJZtk() {
                r1 = this;
                kotlinx.coroutines.channels.ChannelResult$Failed r0 = kotlinx.coroutines.channels.ChannelResult.access$getFailed$cp()
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelResult.m1827constructorimpl(r0)
                return r0
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.NotNull
        /* JADX INFO: renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> java.lang.Object m1841successJP2dKIU(E r1) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.ChannelResult.m1827constructorimpl(r1)
                return r1
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "()V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class Failed {
        public Failed() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Failed"
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = new kotlinx.coroutines.channels.ChannelResult$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.channels.ChannelResult.Companion = r0
            kotlinx.coroutines.channels.ChannelResult$Failed r0 = new kotlinx.coroutines.channels.ChannelResult$Failed
            r0.<init>()
            kotlinx.coroutines.channels.ChannelResult.failed = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ ChannelResult(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.holder = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelResult.Failed access$getFailed$cp() {
            kotlinx.coroutines.channels.ChannelResult$Failed r0 = kotlinx.coroutines.channels.ChannelResult.failed
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelResult m1826boximpl(java.lang.Object r1) {
            kotlinx.coroutines.channels.ChannelResult r0 = new kotlinx.coroutines.channels.ChannelResult
            r0.<init>(r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> java.lang.Object m1827constructorimpl(@org.jetbrains.annotations.Nullable java.lang.Object r0) {
            return r0
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1828equalsimpl(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.ChannelResult
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
            java.lang.Object r3 = r3.m1838unboximpl()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1829equalsimpl0(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final java.lang.Throwable m1830exceptionOrNullimpl(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = (kotlinx.coroutines.channels.ChannelResult.Closed) r2
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 != 0) goto Lc
            goto Le
        Lc:
            java.lang.Throwable r1 = r2.cause
        Le:
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void getHolder$annotations() {
            return
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m1831getOrNullimpl(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 != 0) goto L5
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    /* JADX INFO: renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m1832getOrThrowimpl(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r0 != 0) goto L5
            return r2
        L5:
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto L11
            r0 = r2
            kotlinx.coroutines.channels.ChannelResult$Closed r0 = (kotlinx.coroutines.channels.ChannelResult.Closed) r0
            java.lang.Throwable r0 = r0.cause
            if (r0 == 0) goto L11
            throw r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to call 'getOrThrow' on a failed channel result: "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1833hashCodeimpl(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            return r0
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m1834isClosedimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            return r0
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m1835isFailureimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            return r0
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m1836isSuccessimpl(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            r0 = r0 ^ 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1837toStringimpl(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto Lb
            kotlinx.coroutines.channels.ChannelResult$Closed r2 = (kotlinx.coroutines.channels.ChannelResult.Closed) r2
            java.lang.String r2 = r2.toString()
            goto L21
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value("
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L21:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.holder
            boolean r2 = m1828equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            int r0 = m1833hashCodeimpl(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            java.lang.String r0 = m1837toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.Object m1838unboximpl() {
            r1 = this;
            java.lang.Object r0 = r1.holder
            return r0
    }
}
