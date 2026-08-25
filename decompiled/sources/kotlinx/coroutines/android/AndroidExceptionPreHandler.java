package kotlinx.coroutines.android;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "_preHandler", "", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "preHandler", "Ljava/lang/reflect/Method;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidExceptionPreHandler extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _preHandler;

    public AndroidExceptionPreHandler() {
            r1 = this;
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    private final java.lang.reflect.Method preHandler() {
            r5 = this;
            java.lang.Object r0 = r5._preHandler
            if (r0 == r5) goto L7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L7:
            r0 = 0
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L28
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L28
            r3 = 1
        L28:
            if (r3 == 0) goto L2b
            r0 = r1
        L2b:
            r5._preHandler = r0
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 26
            if (r1 > r3) goto Ld
            r1 = 28
            if (r3 >= r1) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L30
            java.lang.reflect.Method r3 = r2.preHandler()
            r1 = 0
            if (r3 != 0) goto L19
            r3 = r1
            goto L1f
        L19:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r3.invoke(r1, r0)
        L1f:
            boolean r0 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r0 == 0) goto L26
            r1 = r3
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1
        L26:
            if (r1 != 0) goto L29
            goto L30
        L29:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r1.uncaughtException(r3, r4)
        L30:
            return
    }
}
