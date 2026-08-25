package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\u000b\u001aC\u0010\f\u001a\u0004\u0018\u00010\r\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0004\"\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0011"}, d2 = {"bindCancellationFun", "Lkotlin/Function1;", "", "", "E", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;", "callUndeliveredElement", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "callUndeliveredElementCatchingException", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OnUndeliveredElementKt {


    @org.jetbrains.annotations.NotNull
    public static final <E> kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> bindCancellationFun(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1 r0 = new kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static final <E> void callUndeliveredElement(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3) {
            r0 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = callUndeliveredElementCatchingException(r1, r2, r0)
            if (r1 != 0) goto L8
            goto Lb
        L8:
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r1)
        Lb:
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1, E r2, @org.jetbrains.annotations.Nullable kotlinx.coroutines.internal.UndeliveredElementException r3) {
            r1.invoke(r2)     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r1 = move-exception
            if (r3 == 0) goto L11
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == r1) goto L11
            kotlin.ExceptionsKt.addSuppressed(r3, r1)
        L10:
            return r3
        L11:
            kotlinx.coroutines.internal.UndeliveredElementException r3 = new kotlinx.coroutines.internal.UndeliveredElementException
            java.lang.String r0 = "Exception in undelivered element handler for "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            r3.<init>(r2, r1)
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default(kotlin.jvm.functions.Function1 r0, java.lang.Object r1, kotlinx.coroutines.internal.UndeliveredElementException r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.internal.UndeliveredElementException r0 = callUndeliveredElementCatchingException(r0, r1, r2)
            return r0
    }
}
