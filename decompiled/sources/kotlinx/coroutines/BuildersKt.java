package kotlinx.coroutines;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
public final class BuildersKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.Deferred<T> async(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineDispatcher r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.invoke(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.Job launch(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineStart r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final <T> T runBlocking(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1) throws java.lang.InterruptedException {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object runBlocking$default(kotlin.coroutines.CoroutineContext r0, kotlin.jvm.functions.Function2 r1, int r2, java.lang.Object r3) throws java.lang.InterruptedException {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object withContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2) {
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.withContext(r0, r1, r2)
            return r0
    }
}
