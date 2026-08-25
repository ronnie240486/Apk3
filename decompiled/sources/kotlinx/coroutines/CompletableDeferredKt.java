package kotlinx.coroutines;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a,\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"CompletableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "parent", "Lkotlinx/coroutines/Job;", "completeWith", "", "result", "Lkotlin/Result;", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CompletableDeferredKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(T r2) {
            kotlinx.coroutines.CompletableDeferredImpl r0 = new kotlinx.coroutines.CompletableDeferredImpl
            r1 = 0
            r0.<init>(r1)
            r0.complete(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(@org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.CompletableDeferredImpl r0 = new kotlinx.coroutines.CompletableDeferredImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableDeferred CompletableDeferred$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableDeferred r0 = CompletableDeferred(r0)
            return r0
    }

    public static final <T> boolean completeWith(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CompletableDeferred<T> r1, @org.jetbrains.annotations.NotNull java.lang.Object r2) {
            java.lang.Throwable r0 = kotlin.Result.m336exceptionOrNullimpl(r2)
            if (r0 != 0) goto Lb
            boolean r1 = r1.complete(r2)
            goto Lf
        Lb:
            boolean r1 = r1.completeExceptionally(r0)
        Lf:
            return r1
    }
}
