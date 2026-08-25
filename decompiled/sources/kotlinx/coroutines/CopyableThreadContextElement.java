package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "copyForChild", "mergeForChild", "Lkotlin/coroutines/CoroutineContext;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext$Element;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlinx.coroutines.DelicateCoroutinesApi
@kotlinx.coroutines.ExperimentalCoroutinesApi
public interface CopyableThreadContextElement<S> extends kotlinx.coroutines.ThreadContextElement<S> {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S, R> R fold(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CopyableThreadContextElement<S> r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
                java.lang.Object r0 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.fold(r0, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public static <S, E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CopyableThreadContextElement<S> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1) {
                kotlin.coroutines.CoroutineContext$Element r0 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.get(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static <S> kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CopyableThreadContextElement<S> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.minusKey(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static <S> kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CopyableThreadContextElement<S> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.plus(r0, r1)
                return r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CopyableThreadContextElement<S> copyForChild();

    @org.jetbrains.annotations.NotNull
    kotlin.coroutines.CoroutineContext mergeForChild(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r1);
}
