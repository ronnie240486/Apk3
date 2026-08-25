package kotlin;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/LazyKt")
class LazyKt__LazyJVMKt {

    /* JADX INFO: compiled from: LazyJVM.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlin.LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public LazyKt__LazyJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.Lazy<T> lazy(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.SynchronizedLazyImpl r0 = new kotlin.SynchronizedLazyImpl
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.Lazy<T> lazy(@org.jetbrains.annotations.NotNull kotlin.LazyThreadSafetyMode r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int[] r0 = kotlin.LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 2
            if (r2 == r0) goto L2d
            if (r2 == r1) goto L27
            r0 = 3
            if (r2 != r0) goto L21
            kotlin.UnsafeLazyImpl r2 = new kotlin.UnsafeLazyImpl
            r2.<init>(r3)
            goto L33
        L21:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L27:
            kotlin.SafePublicationLazyImpl r2 = new kotlin.SafePublicationLazyImpl
            r2.<init>(r3)
            goto L33
        L2d:
            kotlin.SynchronizedLazyImpl r2 = new kotlin.SynchronizedLazyImpl
            r0 = 0
            r2.<init>(r3, r0, r1, r0)
        L33:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static <T> kotlin.Lazy<T> lazy(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "initializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.SynchronizedLazyImpl r0 = new kotlin.SynchronizedLazyImpl
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2, r1)
            return r0
    }
}
