package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000bH\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/ClassValueCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cache", "kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "Lkotlinx/coroutines/internal/ClassValueCtorCache$cache$1;", "get", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "key", "Ljava/lang/Class;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
final class ClassValueCtorCache extends kotlinx.coroutines.internal.CtorCache {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.ClassValueCtorCache INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.ClassValueCtorCache$cache$1 cache = null;

    static {
            kotlinx.coroutines.internal.ClassValueCtorCache r0 = new kotlinx.coroutines.internal.ClassValueCtorCache
            r0.<init>()
            kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE = r0
            kotlinx.coroutines.internal.ClassValueCtorCache$cache$1 r0 = new kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
            r0.<init>()
            kotlinx.coroutines.internal.ClassValueCtorCache.cache = r0
            return
    }

    private ClassValueCtorCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(@org.jetbrains.annotations.NotNull java.lang.Class<? extends java.lang.Throwable> r2) {
            r1 = this;
            kotlinx.coroutines.internal.ClassValueCtorCache$cache$1 r0 = kotlinx.coroutines.internal.ClassValueCtorCache.cache
            java.lang.Object r2 = r0.get(r2)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            return r2
    }
}
