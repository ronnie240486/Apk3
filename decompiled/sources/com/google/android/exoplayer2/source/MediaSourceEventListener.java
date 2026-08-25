package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes.dex */
public interface MediaSourceEventListener {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.MediaSourceEventListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDownstreamFormatChanged(com.google.android.exoplayer2.source.MediaSourceEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                return
        }

        public static void $default$onLoadCanceled(com.google.android.exoplayer2.source.MediaSourceEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                return
        }

        public static void $default$onLoadCompleted(com.google.android.exoplayer2.source.MediaSourceEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                return
        }

        public static void $default$onLoadError(com.google.android.exoplayer2.source.MediaSourceEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4, java.io.IOException r5, boolean r6) {
                return
        }

        public static void $default$onLoadStarted(com.google.android.exoplayer2.source.MediaSourceEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                return
        }

        public static void $default$onUpstreamDiscarded(com.google.android.exoplayer2.source.MediaSourceEventListener r0, int r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class ListenerAndHandler {
            public android.os.Handler handler;
            public com.google.android.exoplayer2.source.MediaSourceEventListener listener;

            public ListenerAndHandler(android.os.Handler r1, com.google.android.exoplayer2.source.MediaSourceEventListener r2) {
                    r0 = this;
                    r0.<init>()
                    r0.handler = r1
                    r0.listener = r2
                    return
            }
        }

        /* JADX INFO: renamed from: $r8$lambda$5lz-pM1dMbFPdD3-6ygE1o2Peoo, reason: not valid java name */
        public static /* synthetic */ void m241$r8$lambda$5lzpM1dMbFPdD36ygE1o2Peoo(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r0, com.google.android.exoplayer2.source.MediaSourceEventListener r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$upstreamDiscarded$4(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$V35Zn-5S_m01j34HOB0CqRWw6cI, reason: not valid java name */
        public static /* synthetic */ void m242$r8$lambda$V35Zn5S_m01j34HOB0CqRWw6cI(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r0, com.google.android.exoplayer2.source.MediaSourceEventListener r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3, java.io.IOException r4, boolean r5) {
                r0.lambda$loadError$3(r1, r2, r3, r4, r5)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$ZuTEoXsbK3i0dfIxRwW-S0zQ6UA, reason: not valid java name */
        public static /* synthetic */ void m243$r8$lambda$ZuTEoXsbK3i0dfIxRwWS0zQ6UA(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r0, com.google.android.exoplayer2.source.MediaSourceEventListener r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$loadCompleted$1(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$ksQLx11TblSbVRe1SW5K2we0-i4, reason: not valid java name */
        public static /* synthetic */ void m244$r8$lambda$ksQLx11TblSbVRe1SW5K2we0i4(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r0, com.google.android.exoplayer2.source.MediaSourceEventListener r1, com.google.android.exoplayer2.source.MediaLoadData r2) {
                r0.lambda$downstreamFormatChanged$5(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$zLkfePuP-iorbhHzeTveZMzGk3U, reason: not valid java name */
        public static /* synthetic */ void m245$r8$lambda$zLkfePuPiorbhHzeTveZMzGk3U(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r0, com.google.android.exoplayer2.source.MediaSourceEventListener r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$loadStarted$0(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$zyM9BzrtZr4LqwCssdpE8mIFjiM(com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher r0, com.google.android.exoplayer2.source.MediaSourceEventListener r1, com.google.android.exoplayer2.source.LoadEventInfo r2, com.google.android.exoplayer2.source.MediaLoadData r3) {
                r0.lambda$loadCanceled$2(r1, r2, r3)
                return
        }

        public EventDispatcher() {
                r6 = this;
                java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
                r1.<init>()
                r2 = 0
                r3 = 0
                r4 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> r1, int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.listenerAndHandlers = r1
                r0.windowIndex = r2
                r0.mediaPeriodId = r3
                r0.mediaTimeOffsetMs = r4
                return
        }

        private long adjustMediaTime(long r4) {
                r3 = this;
                long r4 = com.google.android.exoplayer2.util.Util.usToMs(r4)
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto Le
                goto L11
            Le:
                long r0 = r3.mediaTimeOffsetMs
                long r0 = r0 + r4
            L11:
                return r0
        }

        private /* synthetic */ void lambda$downstreamFormatChanged$5(com.google.android.exoplayer2.source.MediaSourceEventListener r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDownstreamFormatChanged(r0, r1, r4)
                return
        }

        private /* synthetic */ void lambda$loadCanceled$2(com.google.android.exoplayer2.source.MediaSourceEventListener r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onLoadCanceled(r0, r1, r4, r5)
                return
        }

        private /* synthetic */ void lambda$loadCompleted$1(com.google.android.exoplayer2.source.MediaSourceEventListener r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onLoadCompleted(r0, r1, r4, r5)
                return
        }

        private /* synthetic */ void lambda$loadError$3(com.google.android.exoplayer2.source.MediaSourceEventListener r8, com.google.android.exoplayer2.source.LoadEventInfo r9, com.google.android.exoplayer2.source.MediaLoadData r10, java.io.IOException r11, boolean r12) {
                r7 = this;
                int r1 = r7.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r7.mediaPeriodId
                r0 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.onLoadError(r1, r2, r3, r4, r5, r6)
                return
        }

        private /* synthetic */ void lambda$loadStarted$0(com.google.android.exoplayer2.source.MediaSourceEventListener r3, com.google.android.exoplayer2.source.LoadEventInfo r4, com.google.android.exoplayer2.source.MediaLoadData r5) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onLoadStarted(r0, r1, r4, r5)
                return
        }

        private /* synthetic */ void lambda$upstreamDiscarded$4(com.google.android.exoplayer2.source.MediaSourceEventListener r2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3, com.google.android.exoplayer2.source.MediaLoadData r4) {
                r1 = this;
                int r0 = r1.windowIndex
                r2.onUpstreamDiscarded(r0, r3, r4)
                return
        }

        public void addEventListener(android.os.Handler r3, com.google.android.exoplayer2.source.MediaSourceEventListener r4) {
                r2 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r2.listenerAndHandlers
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler
                r1.<init>(r3, r4)
                r0.add(r1)
                return
        }

        public void downstreamFormatChanged(int r13, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r14, int r15, @androidx.annotation.Nullable java.lang.Object r16, long r17) {
                r12 = this;
                r0 = r12
                com.google.android.exoplayer2.source.MediaLoadData r11 = new com.google.android.exoplayer2.source.MediaLoadData
                r1 = r17
                long r7 = r12.adjustMediaTime(r1)
                r2 = 1
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r1 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                r12.downstreamFormatChanged(r11)
                return
        }

        public void downstreamFormatChanged(com.google.android.exoplayer2.source.MediaLoadData r6) {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r5.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1
                r4 = 3
                r3.<init>(r5, r2, r6, r4)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L20:
                return
        }

        public void loadCanceled(com.google.android.exoplayer2.source.LoadEventInfo r12, int r13) {
                r11 = this;
                r3 = -1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r11
                r1 = r12
                r2 = r13
                r0.loadCanceled(r1, r2, r3, r4, r5, r6, r7, r9)
                return
        }

        public void loadCanceled(com.google.android.exoplayer2.source.LoadEventInfo r13, int r14, int r15, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r16, int r17, @androidx.annotation.Nullable java.lang.Object r18, long r19, long r21) {
                r12 = this;
                r0 = r12
                com.google.android.exoplayer2.source.MediaLoadData r11 = new com.google.android.exoplayer2.source.MediaLoadData
                r1 = r19
                long r7 = r12.adjustMediaTime(r1)
                r1 = r21
                long r9 = r12.adjustMediaTime(r1)
                r1 = r11
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                r1 = r13
                r12.loadCanceled(r13, r11)
                return
        }

        public void loadCanceled(com.google.android.exoplayer2.source.LoadEventInfo r10, com.google.android.exoplayer2.source.MediaLoadData r11) {
                r9 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r9.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r4 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0 r8 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r7 = 2
                r2 = r8
                r3 = r9
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r8)
                goto L6
            L24:
                return
        }

        public void loadCompleted(com.google.android.exoplayer2.source.LoadEventInfo r12, int r13) {
                r11 = this;
                r3 = -1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r11
                r1 = r12
                r2 = r13
                r0.loadCompleted(r1, r2, r3, r4, r5, r6, r7, r9)
                return
        }

        public void loadCompleted(com.google.android.exoplayer2.source.LoadEventInfo r13, int r14, int r15, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r16, int r17, @androidx.annotation.Nullable java.lang.Object r18, long r19, long r21) {
                r12 = this;
                r0 = r12
                com.google.android.exoplayer2.source.MediaLoadData r11 = new com.google.android.exoplayer2.source.MediaLoadData
                r1 = r19
                long r7 = r12.adjustMediaTime(r1)
                r1 = r21
                long r9 = r12.adjustMediaTime(r1)
                r1 = r11
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                r1 = r13
                r12.loadCompleted(r13, r11)
                return
        }

        public void loadCompleted(com.google.android.exoplayer2.source.LoadEventInfo r10, com.google.android.exoplayer2.source.MediaLoadData r11) {
                r9 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r9.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r4 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0 r8 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r7 = 1
                r2 = r8
                r3 = r9
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r8)
                goto L6
            L24:
                return
        }

        public void loadError(com.google.android.exoplayer2.source.LoadEventInfo r13, int r14, int r15, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r16, int r17, @androidx.annotation.Nullable java.lang.Object r18, long r19, long r21, java.io.IOException r23, boolean r24) {
                r12 = this;
                r0 = r12
                com.google.android.exoplayer2.source.MediaLoadData r11 = new com.google.android.exoplayer2.source.MediaLoadData
                r1 = r19
                long r7 = r12.adjustMediaTime(r1)
                r1 = r21
                long r9 = r12.adjustMediaTime(r1)
                r1 = r11
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                r1 = r13
                r2 = r23
                r3 = r24
                r12.loadError(r13, r11, r2, r3)
                return
        }

        public void loadError(com.google.android.exoplayer2.source.LoadEventInfo r14, int r15, java.io.IOException r16, boolean r17) {
                r13 = this;
                r3 = -1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r13
                r1 = r14
                r2 = r15
                r11 = r16
                r12 = r17
                r0.loadError(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
                return
        }

        public void loadError(com.google.android.exoplayer2.source.LoadEventInfo r11, com.google.android.exoplayer2.source.MediaLoadData r12, java.io.IOException r13, boolean r14) {
                r10 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r10.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r4 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1 r9 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1
                r2 = r9
                r3 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r8 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r9)
                goto L6
            L25:
                return
        }

        public void loadStarted(com.google.android.exoplayer2.source.LoadEventInfo r12, int r13) {
                r11 = this;
                r3 = -1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0 = r11
                r1 = r12
                r2 = r13
                r0.loadStarted(r1, r2, r3, r4, r5, r6, r7, r9)
                return
        }

        public void loadStarted(com.google.android.exoplayer2.source.LoadEventInfo r13, int r14, int r15, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r16, int r17, @androidx.annotation.Nullable java.lang.Object r18, long r19, long r21) {
                r12 = this;
                r0 = r12
                com.google.android.exoplayer2.source.MediaLoadData r11 = new com.google.android.exoplayer2.source.MediaLoadData
                r1 = r19
                long r7 = r12.adjustMediaTime(r1)
                r1 = r21
                long r9 = r12.adjustMediaTime(r1)
                r1 = r11
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                r1 = r13
                r12.loadStarted(r13, r11)
                return
        }

        public void loadStarted(com.google.android.exoplayer2.source.LoadEventInfo r10, com.google.android.exoplayer2.source.MediaLoadData r11) {
                r9 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r9.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r4 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0 r8 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r7 = 0
                r2 = r8
                r3 = r9
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r8)
                goto L6
            L24:
                return
        }

        public void removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener r4) {
                r3 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r0 = r3.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r2 = r1.listener
                if (r2 != r4) goto L6
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r2 = r3.listenerAndHandlers
                r2.remove(r1)
                goto L6
            L1c:
                return
        }

        public void upstreamDiscarded(int r13, long r14, long r16) {
                r12 = this;
                r0 = r12
                com.google.android.exoplayer2.source.MediaLoadData r11 = new com.google.android.exoplayer2.source.MediaLoadData
                r1 = r14
                long r7 = r12.adjustMediaTime(r14)
                r1 = r16
                long r9 = r12.adjustMediaTime(r1)
                r2 = 1
                r4 = 0
                r5 = 3
                r6 = 0
                r1 = r11
                r3 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                r12.upstreamDiscarded(r11)
                return
        }

        public void upstreamDiscarded(com.google.android.exoplayer2.source.MediaLoadData r11) {
                r10 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r10.mediaPeriodId
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r0
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r1 = r10.listenerAndHandlers
                java.util.Iterator r7 = r1.iterator()
            Le:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r7.next()
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.source.MediaSourceEventListener r3 = r1.listener
                android.os.Handler r8 = r1.handler
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0 r9 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r6 = 3
                r1 = r9
                r2 = r10
                r4 = r0
                r5 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                com.google.android.exoplayer2.util.Util.postOrRun(r8, r9)
                goto Le
            L2c:
                return
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher withParameters(int r8, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r9, long r10) {
                r7 = this;
                com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r6 = new com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler> r1 = r7.listenerAndHandlers
                r0 = r6
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return r6
        }
    }

    void onDownstreamFormatChanged(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3);

    void onLoadCanceled(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4);

    void onLoadCompleted(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4);

    void onLoadError(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4, java.io.IOException r5, boolean r6);

    void onLoadStarted(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.LoadEventInfo r3, com.google.android.exoplayer2.source.MediaLoadData r4);

    void onUpstreamDiscarded(int r1, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, com.google.android.exoplayer2.source.MediaLoadData r3);
}
