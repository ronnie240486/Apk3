package kotlinx.coroutines.test;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"withTestContext", "", "testContext", "Lkotlinx/coroutines/test/TestCoroutineContext;", "testBody", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TestCoroutineContextKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @kotlin.ReplaceWith(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    public static final void withTestContext(@org.jetbrains.annotations.NotNull kotlinx.coroutines.test.TestCoroutineContext r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.test.TestCoroutineContext, kotlin.Unit> r3) {
            r3.invoke(r2)
            java.util.List r3 = r2.getExceptions()
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L13
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L13
            goto L28
        L13:
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L17
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            return
        L2b:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.util.List r2 = r2.getExceptions()
            java.lang.String r0 = "Coroutine encountered unhandled exceptions:\n"
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            r3.<init>(r2)
            throw r3
    }

    public static /* synthetic */ void withTestContext$default(kotlinx.coroutines.test.TestCoroutineContext r0, kotlin.jvm.functions.Function1 r1, int r2, java.lang.Object r3) {
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto La
            kotlinx.coroutines.test.TestCoroutineContext r0 = new kotlinx.coroutines.test.TestCoroutineContext
            r2 = 0
            r0.<init>(r2, r3, r2)
        La:
            withTestContext(r0, r1)
            return
    }
}
