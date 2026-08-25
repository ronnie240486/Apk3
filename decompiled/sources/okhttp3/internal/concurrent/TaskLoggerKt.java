package okhttp3.internal.concurrent;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"formatDuration", "", "ns", "", "log", "", "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "message", "logElapsed", "T", "block", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "messageBlock", "okhttp"}, k = 2, mv = {1, 4, 1})
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(okhttp3.internal.concurrent.Task r0, okhttp3.internal.concurrent.TaskQueue r1, java.lang.String r2) {
            log(r0, r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String formatDuration(long r12) {
            r0 = -999500000(0xffffffffc46cd720, float:-947.3613)
            long r0 = (long) r0
            java.lang.String r2 = " s "
            r3 = 1000000000(0x3b9aca00, float:0.0047237873)
            r4 = 500000000(0x1dcd6500, float:5.436748E-21)
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 > 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = (long) r4
            long r12 = r12 - r4
            long r3 = (long) r3
            long r12 = r12 / r3
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            goto Lb4
        L25:
            r0 = -999500(0xfffffffffff0bfb4, float:NaN)
            long r0 = (long) r0
            java.lang.String r5 = " ms"
            r6 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 500000(0x7a120, float:7.00649E-40)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 > 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r7
            long r12 = r12 - r1
            long r1 = (long) r6
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            goto Lb4
        L49:
            r0 = 0
            java.lang.String r8 = " µs"
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 500(0x1f4, float:7.0E-43)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r10
            long r12 = r12 - r1
            long r1 = (long) r9
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = r0.toString()
            goto Lb4
        L69:
            r0 = 999500(0xf404c, float:1.400598E-39)
            long r0 = (long) r0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L85
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r10
            long r12 = r12 + r1
            long r1 = (long) r9
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = r0.toString()
            goto Lb4
        L85:
            r0 = 999500000(0x3b9328e0, float:0.0044909567)
            long r0 = (long) r0
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 >= 0) goto La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r7
            long r12 = r12 + r1
            long r1 = (long) r6
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            goto Lb4
        La1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = (long) r4
            long r12 = r12 + r4
            long r3 = (long) r3
            long r12 = r12 / r3
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
        Lb4:
            kotlin.jvm.internal.StringCompanionObject r13 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r1 = 0
            r0[r1] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r13 = "%6s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            java.lang.String r13 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            return r12
    }

    private static final void log(okhttp3.internal.concurrent.Task r4, okhttp3.internal.concurrent.TaskQueue r5, java.lang.String r6) {
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r5.getName$okhttp()
            r1.append(r5)
            r5 = 32
            r1.append(r5)
            kotlin.jvm.internal.StringCompanionObject r5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3 = 0
            r2[r3] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r6 = "%-22s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.fine(r4)
            return
    }

    public static final <T> T logElapsed(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r6, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r8) {
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L31
            okhttp3.internal.concurrent.TaskRunner r1 = r7.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r1 = r1.getBackend()
            long r1 = r1.nanoTime()
            java.lang.String r3 = "starting"
            access$log(r6, r7, r3)
            goto L33
        L31:
            r1 = -1
        L33:
            r3 = 1
            java.lang.Object r8 = r8.invoke()     // Catch: java.lang.Throwable -> L62
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L5e
            okhttp3.internal.concurrent.TaskRunner r0 = r7.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r4 = r0.nanoTime()
            long r4 = r4 - r1
            java.lang.String r0 = "finished run in "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = formatDuration(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            access$log(r6, r7, r0)
        L5e:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r8
        L62:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L89
            okhttp3.internal.concurrent.TaskRunner r0 = r7.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r4 = r0.nanoTime()
            long r4 = r4 - r1
            java.lang.String r0 = "failed a run in "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = formatDuration(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            access$log(r6, r7, r0)
        L89:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r8
    }

    public static final void taskLog(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r2, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.String> r4) {
            java.lang.String r0 = "task"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "messageBlock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.concurrent.TaskRunner$Companion r0 = okhttp3.internal.concurrent.TaskRunner.Companion
            java.util.logging.Logger r0 = r0.getLogger()
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L27
            java.lang.Object r4 = r4.invoke()
            java.lang.String r4 = (java.lang.String) r4
            access$log(r2, r3, r4)
        L27:
            return
    }
}
