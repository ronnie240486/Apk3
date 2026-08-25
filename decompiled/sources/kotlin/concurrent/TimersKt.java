package kotlin.concurrent;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aM\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a'\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", "period", "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "TimersKt")
public final class TimersKt {

    /* JADX INFO: renamed from: kotlin.concurrent.TimersKt$timerTask$1, reason: invalid class name */
    /* JADX INFO: compiled from: Timer.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 176)
    public static final class AnonymousClass1 extends java.util.TimerTask {
        public final /* synthetic */ kotlin.jvm.functions.Function1<java.util.TimerTask, kotlin.Unit> $action;

        public AnonymousClass1(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r1) {
                r0 = this;
                r0.$action = r1
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r1 = this;
                kotlin.jvm.functions.Function1<java.util.TimerTask, kotlin.Unit> r0 = r1.$action
                r0.invoke(r1)
                return
        }
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer fixedRateTimer(java.lang.String r7, boolean r8, long r9, long r11, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r13) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.Timer r7 = timer(r7, r8)
            kotlin.concurrent.TimersKt$timerTask$1 r2 = new kotlin.concurrent.TimersKt$timerTask$1
            r2.<init>(r13)
            r1 = r7
            r3 = r9
            r5 = r11
            r1.scheduleAtFixedRate(r2, r3, r5)
            return r7
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer fixedRateTimer(java.lang.String r1, boolean r2, java.util.Date r3, long r4, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r6) {
            java.lang.String r0 = "startAt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Timer r1 = timer(r1, r2)
            kotlin.concurrent.TimersKt$timerTask$1 r2 = new kotlin.concurrent.TimersKt$timerTask$1
            r2.<init>(r6)
            r1.scheduleAtFixedRate(r2, r3, r4)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask schedule(java.util.Timer r7, long r8, long r10, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r12)
            r1 = r7
            r2 = r0
            r3 = r8
            r5 = r10
            r1.schedule(r2, r3, r5)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask schedule(java.util.Timer r1, long r2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r4)
            r1.schedule(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask schedule(java.util.Timer r1, java.util.Date r2, long r3, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r5)
            r1.schedule(r0, r2, r3)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask schedule(java.util.Timer r1, java.util.Date r2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r3)
            r1.schedule(r0, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask scheduleAtFixedRate(java.util.Timer r7, long r8, long r10, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r12)
            r1 = r7
            r2 = r0
            r3 = r8
            r5 = r10
            r1.scheduleAtFixedRate(r2, r3, r5)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask scheduleAtFixedRate(java.util.Timer r1, java.util.Date r2, long r3, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "time"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r5)
            r1.scheduleAtFixedRate(r0, r2, r3)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final java.util.Timer timer(@org.jetbrains.annotations.Nullable java.lang.String r1, boolean r2) {
            if (r1 != 0) goto L8
            java.util.Timer r1 = new java.util.Timer
            r1.<init>(r2)
            goto Le
        L8:
            java.util.Timer r0 = new java.util.Timer
            r0.<init>(r1, r2)
            r1 = r0
        Le:
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer timer(java.lang.String r7, boolean r8, long r9, long r11, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r13) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.Timer r7 = timer(r7, r8)
            kotlin.concurrent.TimersKt$timerTask$1 r2 = new kotlin.concurrent.TimersKt$timerTask$1
            r2.<init>(r13)
            r1 = r7
            r3 = r9
            r5 = r11
            r1.schedule(r2, r3, r5)
            return r7
    }

    @kotlin.internal.InlineOnly
    private static final java.util.Timer timer(java.lang.String r1, boolean r2, java.util.Date r3, long r4, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r6) {
            java.lang.String r0 = "startAt"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Timer r1 = timer(r1, r2)
            kotlin.concurrent.TimersKt$timerTask$1 r2 = new kotlin.concurrent.TimersKt$timerTask$1
            r2.<init>(r6)
            r1.schedule(r2, r3, r4)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.util.TimerTask timerTask(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> r1) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.concurrent.TimersKt$timerTask$1 r0 = new kotlin.concurrent.TimersKt$timerTask$1
            r0.<init>(r1)
            return r0
    }
}
