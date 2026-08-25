package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext.Element;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B8\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "B", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "safeCast", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "topmostKey", "isSubKey", "", "key", "isSubKey$kotlin_stdlib", "tryCast", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.ExperimentalStdlibApi
public abstract class AbstractCoroutineContextKey<B extends kotlin.coroutines.CoroutineContext.Element, E extends B> implements kotlin.coroutines.CoroutineContext.Key<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext.Element, E> safeCast;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext.Key<?> topmostKey;

    public AbstractCoroutineContextKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<B> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext.Element, ? extends E> r3) {
            r1 = this;
            java.lang.String r0 = "baseKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "safeCast"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.safeCast = r3
            boolean r3 = r2 instanceof kotlin.coroutines.AbstractCoroutineContextKey
            if (r3 == 0) goto L18
            kotlin.coroutines.AbstractCoroutineContextKey r2 = (kotlin.coroutines.AbstractCoroutineContextKey) r2
            kotlin.coroutines.CoroutineContext$Key<?> r2 = r2.topmostKey
        L18:
            r1.topmostKey = r2
            return
    }

    public final boolean isSubKey$kotlin_stdlib(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r2 == r1) goto Le
            kotlin.coroutines.CoroutineContext$Key<?> r0 = r1.topmostKey
            if (r0 != r2) goto Lc
            goto Le
        Lc:
            r2 = 0
            goto Lf
        Le:
            r2 = 1
        Lf:
            return r2
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.CoroutineContext.Element tryCast$kotlin_stdlib(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B> r0 = r1.safeCast
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.coroutines.CoroutineContext$Element r2 = (kotlin.coroutines.CoroutineContext.Element) r2
            return r2
    }
}
