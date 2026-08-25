package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Lint.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u001a\"\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00022\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0007\u001am\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132D\b\b\u0010\u0015\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0002\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u001fH\u0007\u001a!\u0010 \u001a\u00020!\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u001e\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u001fH\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010%\u001a\u00020\u0001H\u0007\u001af\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\b\b\u0002\u0010'\u001a\u00020(23\b\n\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0*H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0082\u0001\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132Y\b\b\u0010)\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0002\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110(¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0-¢\u0006\u0002\b\u001cH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001a'\u00100\u001a\b\u0012\u0004\u0012\u0002H\u001201\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\"\u001a'\u00102\u001a\b\u0012\u0004\u0012\u0002H\u001203\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\"\"\"\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\u0007\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/flow/FlowCollector;", "getCoroutineContext$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getCoroutineContext", "(Lkotlinx/coroutines/flow/FlowCollector;)Lkotlin/coroutines/CoroutineContext;", "isActive", "", "isActive$annotations", "(Lkotlinx/coroutines/flow/FlowCollector;)Z", "cancel", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellable", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "catch", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "conflate", "Lkotlinx/coroutines/flow/StateFlow;", "count", "", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distinctUntilChanged", "flowOn", "context", "retry", "retries", "", "predicate", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/SharedFlow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "toList", "", "toSet", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LintKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.LintKt$retry$1, reason: invalid class name */
    /* JADX INFO: compiled from: Lint.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        public AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.LintKt.AnonymousClass1> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r2) {
                r0 = this;
                kotlinx.coroutines.flow.LintKt$retry$1 r1 = new kotlinx.coroutines.flow.LintKt$retry$1
                r1.<init>(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Throwable r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.LintKt$retry$1 r1 = (kotlinx.coroutines.flow.LintKt.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                kotlin.ResultKt.throwOnFailure(r1)
                r1 = 1
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                return r1
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void cancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<?> r0, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.flow.FlowCollector r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            cancel(r0, r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @kotlin.internal.InlineOnly
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    private static final <T> kotlinx.coroutines.flow.Flow<T> m1852catch(kotlinx.coroutines.flow.SharedFlow<? extends T> r0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.m1844catch(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object count(kotlinx.coroutines.flow.SharedFlow<? extends T> r1, kotlin.coroutines.Continuation<? super java.lang.Integer> r2) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.count(r1, r2)
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> distinctUntilChanged(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.StateFlow<? extends T> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.coroutines.CoroutineContext getCoroutineContext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<?> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void getCoroutineContext$annotations(kotlinx.coroutines.flow.FlowCollector r0) {
            return
    }

    public static final boolean isActive(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<?> r0) {
            kotlin.KotlinNothingValueException r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @kotlin.ReplaceWith(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void isActive$annotations(kotlinx.coroutines.flow.FlowCollector r0) {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> kotlinx.coroutines.flow.Flow<T> retry(kotlinx.coroutines.flow.SharedFlow<? extends T> r0, long r1, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.retry(r0, r1, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    @kotlin.internal.InlineOnly
    private static final <T> kotlinx.coroutines.flow.Flow<T> retryWhen(kotlinx.coroutines.flow.SharedFlow<? extends T> r0, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.retryWhen(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object toList(kotlinx.coroutines.flow.SharedFlow<? extends T> r2, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r3) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.toList$default(r2, r0, r3, r1, r0)
            kotlin.jvm.internal.InlineMarker.mark(r1)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object toSet(kotlinx.coroutines.flow.SharedFlow<? extends T> r2, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> r3) {
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.toSet$default(r2, r0, r3, r1, r0)
            kotlin.jvm.internal.InlineMarker.mark(r1)
            return r2
    }
}
