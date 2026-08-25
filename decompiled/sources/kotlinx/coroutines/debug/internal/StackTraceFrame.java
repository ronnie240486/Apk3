package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: StackTraceFrame.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "stackTraceElement", "Ljava/lang/StackTraceElement;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/StackTraceElement;)V", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StackTraceFrame implements kotlin.coroutines.jvm.internal.CoroutineStackFrame {

    @org.jetbrains.annotations.Nullable
    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame callerFrame;

    @org.jetbrains.annotations.NotNull
    private final java.lang.StackTraceElement stackTraceElement;

    public StackTraceFrame(@org.jetbrains.annotations.Nullable kotlin.coroutines.jvm.internal.CoroutineStackFrame r1, @org.jetbrains.annotations.NotNull java.lang.StackTraceElement r2) {
            r0 = this;
            r0.<init>()
            r0.callerFrame = r1
            r0.stackTraceElement = r2
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r1 = this;
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.callerFrame
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @org.jetbrains.annotations.NotNull
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = r1.stackTraceElement
            return r0
    }
}
