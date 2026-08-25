package okio;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0010J\r\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0002\b$J\r\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\b%J&\u0010&\u001a\u00020\"*\u00020\u00102\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0(¢\u0006\u0002\b)H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u00108G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u0013\u0010\u001b\u001a\u00020\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006*"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 4, 1})
public final class Pipe {

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer buffer;
    private boolean canceled;

    @org.jetbrains.annotations.Nullable
    private okio.Sink foldedSink;
    private final long maxBufferSize;

    @org.jetbrains.annotations.NotNull
    private final okio.Sink sink;
    private boolean sinkClosed;

    @org.jetbrains.annotations.NotNull
    private final okio.Source source;
    private boolean sourceClosed;



    public Pipe(long r4) {
            r3 = this;
            r3.<init>()
            r3.maxBufferSize = r4
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3.buffer = r0
            r0 = 1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L26
            okio.Pipe$sink$1 r4 = new okio.Pipe$sink$1
            r4.<init>(r3)
            r3.sink = r4
            okio.Pipe$source$1 r4 = new okio.Pipe$source$1
            r4.<init>(r3)
            r3.source = r4
            return
        L26:
            java.lang.String r0 = "maxBufferSize < 1: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static final /* synthetic */ void access$forward(okio.Pipe r0, okio.Sink r1, kotlin.jvm.functions.Function1 r2) {
            r0.forward(r1, r2)
            return
    }

    private final void forward(okio.Sink r14, kotlin.jvm.functions.Function1<? super okio.Sink, kotlin.Unit> r15) {
            r13 = this;
            okio.Timeout r0 = r14.timeout()
            okio.Sink r1 = r13.sink()
            okio.Timeout r1 = r1.timeout()
            long r2 = r0.timeoutNanos()
            okio.Timeout$Companion r4 = okio.Timeout.Companion
            long r5 = r1.timeoutNanos()
            long r7 = r0.timeoutNanos()
            long r4 = r4.minTimeout(r5, r7)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r4, r6)
            boolean r4 = r0.hasDeadline()
            r5 = 1
            if (r4 == 0) goto L6f
            long r7 = r0.deadlineNanoTime()
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L43
            long r9 = r0.deadlineNanoTime()
            long r11 = r1.deadlineNanoTime()
            long r9 = java.lang.Math.min(r9, r11)
            r0.deadlineNanoTime(r9)
        L43:
            r15.invoke(r14)     // Catch: java.lang.Throwable -> L59
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            r0.timeout(r2, r6)
            boolean r14 = r1.hasDeadline()
            if (r14 == 0) goto L55
            r0.deadlineNanoTime(r7)
        L55:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            goto L91
        L59:
            r14 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r15)
            boolean r15 = r1.hasDeadline()
            if (r15 == 0) goto L6b
            r0.deadlineNanoTime(r7)
        L6b:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r14
        L6f:
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L7c
            long r7 = r1.deadlineNanoTime()
            r0.deadlineNanoTime(r7)
        L7c:
            r15.invoke(r14)     // Catch: java.lang.Throwable -> L92
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            r0.timeout(r2, r6)
            boolean r14 = r1.hasDeadline()
            if (r14 == 0) goto L8e
            r0.clearDeadline()
        L8e:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
        L91:
            return
        L92:
            r14 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r15)
            boolean r15 = r1.hasDeadline()
            if (r15 == 0) goto La4
            r0.clearDeadline()
        La4:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r14
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sink", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sink")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final okio.Sink m2033deprecated_sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "source", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_source")
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final okio.Source m2034deprecated_source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }

    public final void cancel() {
            r3 = this;
            okio.Buffer r0 = r3.buffer
            monitor-enter(r0)
            r1 = 1
            r3.canceled = r1     // Catch: java.lang.Throwable -> L1e
            okio.Buffer r1 = r3.buffer     // Catch: java.lang.Throwable -> L1e
            r1.clear()     // Catch: java.lang.Throwable -> L1e
            okio.Buffer r1 = r3.buffer     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L16
            r1.notifyAll()     // Catch: java.lang.Throwable -> L1e
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L1e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void fold(@org.jetbrains.annotations.NotNull okio.Sink r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
        L6:
            okio.Buffer r0 = r7.buffer
            monitor-enter(r0)
            okio.Sink r1 = r7.foldedSink     // Catch: java.lang.Throwable -> L8b
            r2 = 1
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L7e
            boolean r1 = r7.canceled     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L74
            okio.Buffer r1 = r7.buffer     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r1.exhausted()     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L25
            r7.sourceClosed = r2     // Catch: java.lang.Throwable -> L8b
            r7.foldedSink = r8     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            return
        L25:
            boolean r1 = r7.sinkClosed     // Catch: java.lang.Throwable -> L8b
            okio.Buffer r3 = new okio.Buffer     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            okio.Buffer r4 = r7.buffer     // Catch: java.lang.Throwable -> L8b
            long r5 = r4.size()     // Catch: java.lang.Throwable -> L8b
            r3.write(r4, r5)     // Catch: java.lang.Throwable -> L8b
            okio.Buffer r4 = r7.buffer     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L6c
            r4.notifyAll()     // Catch: java.lang.Throwable -> L8b
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L50
            r8.write(r3, r4)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L4c
            r8.close()     // Catch: java.lang.Throwable -> L50
            goto L6
        L4c:
            r8.flush()     // Catch: java.lang.Throwable -> L50
            goto L6
        L50:
            r8 = move-exception
            okio.Buffer r0 = r7.buffer
            monitor-enter(r0)
            r7.sourceClosed = r2     // Catch: java.lang.Throwable -> L69
            okio.Buffer r1 = r7.buffer     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L62
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L62:
            r1.notifyAll()     // Catch: java.lang.Throwable -> L69
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)
            throw r8
        L69:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L6c:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L74:
            r7.foldedSink = r8     // Catch: java.lang.Throwable -> L8b
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "canceled"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
        L7e:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer getBuffer$okio() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    public final boolean getCanceled$okio() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Sink getFoldedSink$okio() {
            r1 = this;
            okio.Sink r0 = r1.foldedSink
            return r0
    }

    public final long getMaxBufferSize$okio() {
            r2 = this;
            long r0 = r2.maxBufferSize
            return r0
    }

    public final boolean getSinkClosed$okio() {
            r1 = this;
            boolean r0 = r1.sinkClosed
            return r0
    }

    public final boolean getSourceClosed$okio() {
            r1 = this;
            boolean r0 = r1.sourceClosed
            return r0
    }

    public final void setCanceled$okio(boolean r1) {
            r0 = this;
            r0.canceled = r1
            return
    }

    public final void setFoldedSink$okio(@org.jetbrains.annotations.Nullable okio.Sink r1) {
            r0 = this;
            r0.foldedSink = r1
            return
    }

    public final void setSinkClosed$okio(boolean r1) {
            r0 = this;
            r0.sinkClosed = r1
            return
    }

    public final void setSourceClosed$okio(boolean r1) {
            r0 = this;
            r0.sourceClosed = r1
            return
    }

    @kotlin.jvm.JvmName(name = "sink")
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @kotlin.jvm.JvmName(name = "source")
    @org.jetbrains.annotations.NotNull
    public final okio.Source source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }
}
