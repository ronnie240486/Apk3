package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioRendererEventListener {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioRendererEventListener$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static void $default$onAudioCodecError(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, java.lang.Exception r1) {
                return
        }

        public static void $default$onAudioDecoderInitialized(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, java.lang.String r1, long r2, long r4) {
                return
        }

        public static void $default$onAudioDecoderReleased(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, java.lang.String r1) {
                return
        }

        public static void $default$onAudioDisabled(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                return
        }

        public static void $default$onAudioEnabled(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, com.google.android.exoplayer2.Format r1) {
                return
        }

        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2) {
                return
        }

        public static void $default$onAudioPositionAdvancing(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, long r1) {
                return
        }

        public static void $default$onAudioSinkError(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, java.lang.Exception r1) {
                return
        }

        public static void $default$onAudioUnderrun(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, int r1, long r2, long r4) {
                return
        }

        public static void $default$onSkipSilenceEnabledChanged(com.google.android.exoplayer2.audio.AudioRendererEventListener r0, boolean r1) {
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class EventDispatcher {

        @androidx.annotation.Nullable
        private final android.os.Handler handler;

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.audio.AudioRendererEventListener listener;

        public static /* synthetic */ void $r8$lambda$4hBzbL1TL33Atjl04akedeXljUY(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, boolean r1) {
                r0.lambda$skipSilenceEnabledChanged$7(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$SvVOQmSfq3q1LJUN9SDh9d7q0YA(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                r0.lambda$disabled$6(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$U50ysTRNBEuoHspHobE2jeZXB_I(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, java.lang.Exception r1) {
                r0.lambda$audioCodecError$9(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$bleGgwMcLNB0ceG2coTQZmt9LKU(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, java.lang.Exception r1) {
                r0.lambda$audioSinkError$8(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$enhPTF1JVF9YZZj3tQrmMkRorOk(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.Format r1, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2) {
                r0.lambda$inputFormatChanged$2(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$q590SjkvmhHa8kO2_7jSOgj6fck(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, java.lang.String r1, long r2, long r4) {
                r0.lambda$decoderInitialized$1(r1, r2, r4)
                return
        }

        public static /* synthetic */ void $r8$lambda$qVO9pa_4YLmYUz_tomYMJyAcdFw(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, java.lang.String r1) {
                r0.lambda$decoderReleased$5(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$rPQMIEv1TAC9H3aCdAImF6IA5GE(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, long r1) {
                r0.lambda$positionAdvancing$3(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$uL_LqpyqiRNhztolJvOX8mV20h4(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, int r1, long r2, long r4) {
                r0.lambda$underrun$4(r1, r2, r4)
                return
        }

        public static /* synthetic */ void $r8$lambda$wM6x2yOc7LSRokkOnoNaLS7ezfU(com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher r0, com.google.android.exoplayer2.decoder.DecoderCounters r1) {
                r0.lambda$enabled$0(r1)
                return
        }

        public EventDispatcher(@androidx.annotation.Nullable android.os.Handler r1, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioRendererEventListener r2) {
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

        private /* synthetic */ void lambda$audioCodecError$9(java.lang.Exception r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioCodecError(r2)
                return
        }

        private /* synthetic */ void lambda$audioSinkError$8(java.lang.Exception r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioSinkError(r2)
                return
        }

        private /* synthetic */ void lambda$decoderInitialized$1(java.lang.String r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r7.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                r1 = r0
                com.google.android.exoplayer2.audio.AudioRendererEventListener r1 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r1
                r2 = r8
                r3 = r9
                r5 = r11
                r1.onAudioDecoderInitialized(r2, r3, r5)
                return
        }

        private /* synthetic */ void lambda$decoderReleased$5(java.lang.String r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioDecoderReleased(r2)
                return
        }

        private /* synthetic */ void lambda$disabled$6(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                r2.ensureUpdated()
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioDisabled(r2)
                return
        }

        private /* synthetic */ void lambda$enabled$0(com.google.android.exoplayer2.decoder.DecoderCounters r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioEnabled(r2)
                return
        }

        private /* synthetic */ void lambda$inputFormatChanged$2(com.google.android.exoplayer2.Format r2, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioInputFormatChanged(r2)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioInputFormatChanged(r2, r3)
                return
        }

        private /* synthetic */ void lambda$positionAdvancing$3(long r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onAudioPositionAdvancing(r2)
                return
        }

        private /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r1.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r0
                r0.onSkipSilenceEnabledChanged(r2)
                return
        }

        private /* synthetic */ void lambda$underrun$4(int r8, long r9, long r11) {
                r7 = this;
                com.google.android.exoplayer2.audio.AudioRendererEventListener r0 = r7.listener
                java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
                r1 = r0
                com.google.android.exoplayer2.audio.AudioRendererEventListener r1 = (com.google.android.exoplayer2.audio.AudioRendererEventListener) r1
                r2 = r8
                r3 = r9
                r5 = r11
                r1.onAudioUnderrun(r2, r3, r5)
                return
        }

        public void audioCodecError(java.lang.Exception r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                r2 = 1
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Ld:
                return
        }

        public void audioSinkError(java.lang.Exception r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Ld:
                return
        }

        public void decoderInitialized(java.lang.String r11, long r12, long r14) {
                r10 = this;
                android.os.Handler r0 = r10.handler
                if (r0 == 0) goto L12
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2 r9 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda2
                r8 = 0
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
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
                r2 = 7
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Ld:
                return
        }

        public void disabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
                r3 = this;
                r4.ensureUpdated()
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto L10
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            L10:
                return
        }

        public void enabled(com.google.android.exoplayer2.decoder.DecoderCounters r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0
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
                r2 = 1
                r1.<init>(r3, r4, r5, r2)
                r0.post(r1)
            Ld:
                return
        }

        public void positionAdvancing(long r3) {
                r2 = this;
                android.os.Handler r0 = r2.handler
                if (r0 == 0) goto Lc
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4 r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4
                r1.<init>(r2, r3)
                r0.post(r1)
            Lc:
                return
        }

        public void skipSilenceEnabledChanged(boolean r3) {
                r2 = this;
                android.os.Handler r0 = r2.handler
                if (r0 == 0) goto Lc
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5 r1 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5
                r1.<init>(r2, r3)
                r0.post(r1)
            Lc:
                return
        }

        public void underrun(int r10, long r11, long r13) {
                r9 = this;
                android.os.Handler r0 = r9.handler
                if (r0 == 0) goto L11
                com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3 r8 = new com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda3
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r6 = r13
                r1.<init>(r2, r3, r4, r6)
                r0.post(r8)
            L11:
                return
        }
    }

    void onAudioCodecError(java.lang.Exception r1);

    void onAudioDecoderInitialized(java.lang.String r1, long r2, long r4);

    void onAudioDecoderReleased(java.lang.String r1);

    void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters r1);

    @java.lang.Deprecated
    void onAudioInputFormatChanged(com.google.android.exoplayer2.Format r1);

    void onAudioInputFormatChanged(com.google.android.exoplayer2.Format r1, @androidx.annotation.Nullable com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r2);

    void onAudioPositionAdvancing(long r1);

    void onAudioSinkError(java.lang.Exception r1);

    void onAudioUnderrun(int r1, long r2, long r4);

    void onSkipSilenceEnabledChanged(boolean r1);
}
