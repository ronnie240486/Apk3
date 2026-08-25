package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes.dex */
public interface VideoRendererEventListener {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.VideoRendererEventListener$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$onDroppedFrames(com.google.android.exoplayer2.video.VideoRendererEventListener r0, int r1, long r2) {
                return
        }

        public static void $default$onRenderedFirstFrame(com.google.android.exoplayer2.video.VideoRendererEventListener r0, java.lang.Object r1, long r2) {
                return
        }

        public static void $default$onVideoCodecError(com.google.android.exoplayer2.video.VideoRendererEventListener r0, java.lang.Exception r1) {
                return
        }

        public static void $default$onVideoDecoderInitialized(com.google.android.exoplayer2.video.VideoRendererEventListener r0, java.lang.String r1, long r2, long r4) {
                return
        }

        public static void $default$onVideoDecoderReleased(com.google.android.exoplayer2.video.VideoRendererEventListener r0, java.lang.String r1) {
                return
        }

        public static void $default$onVideoDisabled(com.google.android.exoplayer2.video.VideoRendererEventListener r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                return
        }

        public static void $default$onVideoEnabled(com.google.android.exoplayer2.video.VideoRendererEventListener r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                return
        }

        public static void $default$onVideoFrameProcessingOffset(com.google.android.exoplayer2.video.VideoRendererEventListener r0, long r1, int r3) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.video.VideoRendererEventListener r0, com.google.android.exoplayer2.Format r1) {
                return
        }

        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.video.VideoRendererEventListener r0, com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2) {
                return
        }

        public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.video.VideoRendererEventListener r0, com.google.android.exoplayer2.video.VideoSize r1) {
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class EventDispatcher {

        @androidx.annotation.Nullable
        private final android.os.Handler handler;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.video.VideoRendererEventListener listener;

        public static /* synthetic */ void $r8$lambda$0wEcYr7ztj3ofEMIi0XdztgAhbs(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                r0.lambda$disabled$8(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$EnBzaqjI2qZeskK6CNmjQNAFjM8(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, java.lang.String r1) {
                r0.lambda$decoderReleased$7(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$Qg02B3kmpoAXTvNOHrUNrrSZ9Nc(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, java.lang.Exception r1) {
                r0.lambda$videoCodecError$9(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$RxBEN-RwvFErOnQM84ZS2H2saCQ, reason: not valid java name */
        public static /* synthetic */ void m275$r8$lambda$RxBENRwvFErOnQM84ZS2H2saCQ(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                r0.lambda$enabled$0(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$azlRGoldwqUJKmR-1C6fL_uzVUo, reason: not valid java name */
        public static /* synthetic */ void m276$r8$lambda$azlRGoldwqUJKmR1C6fL_uzVUo(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, java.lang.Object r1, long r2) {
                r0.lambda$renderedFirstFrame$6(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$b2kGnP5SrIEYRC-Qyhf39twFppI, reason: not valid java name */
        public static /* synthetic */ void m277$r8$lambda$b2kGnP5SrIEYRCQyhf39twFppI(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, int r1, long r2) {
                r0.lambda$droppedFrames$3(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$c5PVgyPI6cEJjS0i6dHp--T5aag, reason: not valid java name */
        public static /* synthetic */ void m278$r8$lambda$c5PVgyPI6cEJjS0i6dHpT5aag(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, java.lang.String r1, long r2, long r4) {
                r0.lambda$decoderInitialized$1(r1, r2, r4)
                return
        }

        public static /* synthetic */ void $r8$lambda$i04wPF7sqeF517haiQJIb2PRkco(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.video.VideoSize r1) {
                r0.lambda$videoSizeChanged$5(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$lRgnwRtINjNzTNR52Sx12shHxOA(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2) {
                r0.lambda$inputFormatChanged$2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$xM5AhFhvkfHyYQYOC6q5mc-L8jg, reason: not valid java name */
        public static /* synthetic */ void m279$r8$lambda$xM5AhFhvkfHyYQYOC6q5mcL8jg(com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher r0, long r1, int r3) {
                r0.lambda$reportVideoFrameProcessingOffset$4(r1, r3)
                return
        }

        public EventDispatcher(@androidx.annotation.Nullable android.os.Handler r1, @androidx.annotation.Nullable com.google.android.exoplayer2.video.VideoRendererEventListener r2) {
                r0 = this;
                r0.<init>()
                if (r2 == 0) goto Lc
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                r0.handler = r1
                r0.listener = r2
                return
        }

        private /* synthetic */ void lambda$decoderInitialized$1(java.lang.String r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r7.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                r1 = r0
                com.google.android.exoplayer2.video.VideoRendererEventListener r1 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r1
                r2 = r8
                r3 = r9
                r5 = r11
                r1.onVideoDecoderInitialized(r2, r3, r5)
                return
        }

        private /* synthetic */ void lambda$decoderReleased$7(java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoDecoderReleased(r2)
                return
        }

        private /* synthetic */ void lambda$disabled$8(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                r2.ensureUpdated()
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoDisabled(r2)
                return
        }

        private /* synthetic */ void lambda$droppedFrames$3(int r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onDroppedFrames(r2, r3)
                return
        }

        private /* synthetic */ void lambda$enabled$0(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoEnabled(r2)
                return
        }

        private /* synthetic */ void lambda$inputFormatChanged$2(com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoInputFormatChanged(r2)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoInputFormatChanged(r2, r3)
                return
        }

        private /* synthetic */ void lambda$renderedFirstFrame$6(java.lang.Object r2, long r3) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onRenderedFirstFrame(r2, r3)
                return
        }

        private /* synthetic */ void lambda$reportVideoFrameProcessingOffset$4(long r2, int r4) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoFrameProcessingOffset(r2, r4)
                return
        }

        private /* synthetic */ void lambda$videoCodecError$9(java.lang.Exception r2) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoCodecError(r2)
                return
        }

        private /* synthetic */ void lambda$videoSizeChanged$5(com.google.android.exoplayer2.video.VideoSize r2) {
                r1 = this;
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.video.VideoRendererEventListener r0 = (com.google.android.exoplayer2.video.VideoRendererEventListener) r0
                r0.onVideoSizeChanged(r2)
                return
        }

        public void decoderInitialized(java.lang.String r11, long r12, long r14) {
                r10 = this;
                android.os.Handler r0 = r10.handler
                if (r0 == 0) goto L12
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2 r9 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                r8 = 1
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r6 = r14
                r1.<init>(r2, r3, r4, r6, r8)
                r0.post(r9)
            L12:
                return
        }

        public void decoderReleased(java.lang.String r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Le
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
                r2 = 10
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Le:
                return
        }

        public void disabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
                r3 = this;
                r4.ensureUpdated()
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto L10
                com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            L10:
                return
        }

        public void droppedFrames(int r3, long r4) {
                r2 = this;
                android.os.Handler r0 = r2.handler
                if (r0 == 0) goto Lc
                com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r4)
                r0.post(r1)
            Lc:
                return
        }

        public void enabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Ld:
                return
        }

        public void inputFormatChanged(com.google.android.exoplayer2.Format r4, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r5) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1
                r2 = 5
                r1.<init>(r3, r4, r5, r2)
                r0.post(r1)
            Ld:
                return
        }

        public void renderedFirstFrame(java.lang.Object r5) {
                r4 = this;
                android.os.Handler r0 = r4.handler
                if (r0 == 0) goto L12
                long r0 = android.os.SystemClock.elapsedRealtime()
                android.os.Handler r2 = r4.handler
                com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2 r3 = new com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                r3.<init>(r4, r5, r0)
                r2.post(r3)
            L12:
                return
        }

        public void reportVideoFrameProcessingOffset(long r3, int r5) {
                r2 = this;
                android.os.Handler r0 = r2.handler
                if (r0 == 0) goto Lc
                com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                r1.<init>(r2, r3, r5)
                r0.post(r1)
            Lc:
                return
        }

        public void videoCodecError(java.lang.Exception r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Le
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
                r2 = 12
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Le:
                return
        }

        public void videoSizeChanged(com.google.android.exoplayer2.video.VideoSize r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Le
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
                r2 = 11
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Le:
                return
        }
    }

    void onDroppedFrames(int r1, long r2);

    void onRenderedFirstFrame(java.lang.Object r1, long r2);

    void onVideoCodecError(java.lang.Exception r1);

    void onVideoDecoderInitialized(java.lang.String r1, long r2, long r4);

    void onVideoDecoderReleased(java.lang.String r1);

    void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onVideoFrameProcessingOffset(long r1, int r3);

    @java.lang.Deprecated
    void onVideoInputFormatChanged(com.google.android.exoplayer2.Format r1);

    void onVideoInputFormatChanged(com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2);

    void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r1);
}
