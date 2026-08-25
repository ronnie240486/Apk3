package kotlin;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0007\u001a\r\u0010\u0010\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0007\"!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"stackTrace", "", "Ljava/lang/StackTraceElement;", "", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "suppressedExceptions", "", "getSuppressedExceptions$annotations", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "addSuppressed", "", "exception", "printStackTrace", "stream", "Ljava/io/PrintStream;", "writer", "Ljava/io/PrintWriter;", "stackTraceToString", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/ExceptionsKt")
class ExceptionsKt__ExceptionsKt {
    public ExceptionsKt__ExceptionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.HidesMembers
    public static void addSuppressed(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r1 == r2) goto L11
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            r0.addSuppressed(r1, r2)
        L11:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.StackTraceElement[] getStackTrace(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            return r1
    }

    public static /* synthetic */ void getStackTrace$annotations(java.lang.Throwable r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Throwable> getSuppressedExceptions(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            java.util.List r1 = r0.getSuppressed(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static /* synthetic */ void getSuppressedExceptions$annotations(java.lang.Throwable r0) {
            return
    }

    @kotlin.internal.InlineOnly
    private static final void printStackTrace(java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.printStackTrace()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void printStackTrace(java.lang.Throwable r1, java.io.PrintStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "stream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.printStackTrace(r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final void printStackTrace(java.lang.Throwable r1, java.io.PrintWriter r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "writer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.printStackTrace(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String stackTraceToString(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            r1.flush()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "sw.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }
}
