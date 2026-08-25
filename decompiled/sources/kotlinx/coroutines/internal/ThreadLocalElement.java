package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0001\u0010\r*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\r0\bH\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", "T", "Lkotlinx/coroutines/ThreadContextElement;", "value", "threadLocal", "Ljava/lang/ThreadLocal;", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Ljava/lang/Object;", "get", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "restoreThreadContext", "", "context", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "toString", "", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ThreadLocalElement<T> implements kotlinx.coroutines.ThreadContextElement<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext.Key<?> key;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T r1, @org.jetbrains.annotations.NotNull java.lang.ThreadLocal<T> r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.threadLocal = r2
            kotlinx.coroutines.internal.ThreadLocalKey r1 = new kotlinx.coroutines.internal.ThreadLocalKey
            r1.<init>(r2)
            r0.key = r1
            return
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.fold(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key<?> r0 = r1.key
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto Ld
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            goto Le
        Ld:
            r2 = r1
        Le:
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.plus(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, T r2) {
            r0 = this;
            java.lang.ThreadLocal<T> r1 = r0.threadLocal
            r1.set(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ThreadLocal(value="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            T r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = ", threadLocal = "
            r0.append(r1)
            java.lang.ThreadLocal<T> r1 = r2.threadLocal
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3) {
            r2 = this;
            java.lang.ThreadLocal<T> r3 = r2.threadLocal
            java.lang.Object r3 = r3.get()
            java.lang.ThreadLocal<T> r0 = r2.threadLocal
            T r1 = r2.value
            r0.set(r1)
            return r3
    }
}
