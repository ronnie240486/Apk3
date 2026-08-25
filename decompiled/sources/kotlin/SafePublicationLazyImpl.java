package kotlin;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class SafePublicationLazyImpl<T> implements kotlin.Lazy<T>, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.SafePublicationLazyImpl.Companion Companion = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.SafePublicationLazyImpl<?>, java.lang.Object> valueUpdater = null;

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object f0final;

    @org.jetbrains.annotations.Nullable
    private volatile kotlin.jvm.functions.Function0<? extends T> initializer;

    /* JADX INFO: compiled from: LazyJVM.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R^\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/SafePublicationLazyImpl$Companion;", "", "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
    }

    static {
            kotlin.SafePublicationLazyImpl$Companion r0 = new kotlin.SafePublicationLazyImpl$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.SafePublicationLazyImpl.Companion = r0
            java.lang.Class<kotlin.SafePublicationLazyImpl> r0 = kotlin.SafePublicationLazyImpl.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlin.SafePublicationLazyImpl.valueUpdater = r0
            return
    }

    public SafePublicationLazyImpl(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.initializer = r2
            kotlin.UNINITIALIZED_VALUE r2 = kotlin.UNINITIALIZED_VALUE.INSTANCE
            r1._value = r2
            r1.f0final = r2
            return
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            kotlin.InitializedLazyImpl r0 = new kotlin.InitializedLazyImpl
            java.lang.Object r1 = r2.getValue()
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.Lazy
    public T getValue() {
            r4 = this;
            java.lang.Object r0 = r4._value
            kotlin.UNINITIALIZED_VALUE r1 = kotlin.UNINITIALIZED_VALUE.INSTANCE
            if (r0 == r1) goto L7
            return r0
        L7:
            kotlin.jvm.functions.Function0<? extends T> r0 = r4.initializer
            if (r0 == 0) goto L26
            java.lang.Object r0 = r0.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.SafePublicationLazyImpl<?>, java.lang.Object> r2 = kotlin.SafePublicationLazyImpl.valueUpdater
        L11:
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L19
            r1 = 1
            goto L20
        L19:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r1) goto L11
            r1 = 0
        L20:
            if (r1 == 0) goto L26
            r1 = 0
            r4.initializer = r1
            return r0
        L26:
            java.lang.Object r0 = r4._value
            return r0
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2._value
            kotlin.UNINITIALIZED_VALUE r1 = kotlin.UNINITIALIZED_VALUE.INSTANCE
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L11
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
        L11:
            return r0
    }
}
