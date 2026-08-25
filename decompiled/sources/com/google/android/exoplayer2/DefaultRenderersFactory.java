package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultRenderersFactory implements com.google.android.exoplayer2.RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final java.lang.String TAG = "DefaultRenderersFactory";
    private long allowedVideoJoiningTimeMs;
    private final com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final android.content.Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableOffload;
    private int extensionRendererMode;
    private com.google.android.exoplayer2.mediacodec.MediaCodecSelector mediaCodecSelector;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r2.context = r3
            com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r3 = new com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory
            r3.<init>()
            r2.codecAdapterFactory = r3
            r3 = 0
            r2.extensionRendererMode = r3
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.allowedVideoJoiningTimeMs = r0
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r3 = com.google.android.exoplayer2.mediacodec.MediaCodecSelector.DEFAULT
            r2.mediaCodecSelector = r3
            return
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public com.google.android.exoplayer2.Renderer[] createRenderers(android.os.Handler r19, com.google.android.exoplayer2.video.VideoRendererEventListener r20, com.google.android.exoplayer2.audio.AudioRendererEventListener r21, com.google.android.exoplayer2.text.TextOutput r22, com.google.android.exoplayer2.metadata.MetadataOutput r23) {
            r18 = this;
            r1 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r3 = r1.context
            int r12 = r1.extensionRendererMode
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r5 = r1.mediaCodecSelector
            boolean r8 = r1.enableDecoderFallback
            long r13 = r1.allowedVideoJoiningTimeMs
            java.lang.Class<com.google.android.exoplayer2.video.VideoRendererEventListener> r15 = com.google.android.exoplayer2.video.VideoRendererEventListener.class
            com.google.android.exoplayer2.video.MediaCodecVideoRenderer r11 = new com.google.android.exoplayer2.video.MediaCodecVideoRenderer
            com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r4 = r1.codecAdapterFactory
            r16 = 50
            r2 = r11
            r6 = r13
            r9 = r19
            r10 = r20
            r1 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11)
            r0.add(r1)
            r1 = 3
            r10 = 2
            java.lang.String r11 = "DefaultRenderersFactory"
            r9 = 0
            r16 = 1
            if (r12 != 0) goto L33
            goto Lcb
        L33:
            int r2 = r0.size()
            if (r12 != r10) goto L3b
            int r2 = r2 + (-1)
        L3b:
            r3 = 50
            r4 = 4
            java.lang.String r5 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r9] = r7     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r16] = r7     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r10] = r15     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r1] = r7     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Long r7 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r9] = r7     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r16] = r19     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r10] = r20     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r6[r1] = r7     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            com.google.android.exoplayer2.Renderer r5 = (com.google.android.exoplayer2.Renderer) r5     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            int r6 = r2 + 1
            r0.add(r2, r5)     // Catch: java.lang.ClassNotFoundException -> L7b java.lang.Exception -> L7d
            java.lang.String r2 = "Loaded LibvpxVideoRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r2)     // Catch: java.lang.ClassNotFoundException -> L7b java.lang.Exception -> L7d
            goto L87
        L7b:
            r2 = r6
            goto L86
        L7d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L86:
            r6 = r2
        L87:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r5[r9] = r7     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r16] = r7     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r5[r10] = r15     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r5[r1] = r7     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r4[r9] = r5     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r4[r16] = r19     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r4[r10] = r20     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r4[r1] = r3     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            com.google.android.exoplayer2.Renderer r2 = (com.google.android.exoplayer2.Renderer) r2     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            r0.add(r6, r2)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            java.lang.String r2 = "Loaded Libgav1VideoRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r2)     // Catch: java.lang.Exception -> Lc2 java.lang.ClassNotFoundException -> Lcb
            goto Lcb
        Lc2:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        Lcb:
            r12 = r18
            android.content.Context r2 = r12.context
            boolean r3 = r12.enableFloatOutput
            boolean r4 = r12.enableAudioTrackPlaybackParams
            boolean r5 = r12.enableOffload
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r6 = new com.google.android.exoplayer2.audio.DefaultAudioSink$Builder
            r6.<init>()
            com.google.android.exoplayer2.audio.AudioCapabilities r2 = com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(r2)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r2 = r6.setAudioCapabilities(r2)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r2 = r2.setEnableFloatOutput(r3)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r2 = r2.setEnableAudioTrackPlaybackParams(r4)
            com.google.android.exoplayer2.audio.DefaultAudioSink$Builder r2 = r2.setOffloadMode(r5)
            com.google.android.exoplayer2.audio.DefaultAudioSink r13 = r2.build()
            if (r13 == 0) goto L1f2
            android.content.Context r3 = r12.context
            int r14 = r12.extensionRendererMode
            com.google.android.exoplayer2.mediacodec.MediaCodecSelector r5 = r12.mediaCodecSelector
            boolean r6 = r12.enableDecoderFallback
            java.lang.Class<com.google.android.exoplayer2.audio.AudioSink> r15 = com.google.android.exoplayer2.audio.AudioSink.class
            java.lang.Class<com.google.android.exoplayer2.audio.AudioRendererEventListener> r17 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class
            com.google.android.exoplayer2.audio.MediaCodecAudioRenderer r8 = new com.google.android.exoplayer2.audio.MediaCodecAudioRenderer
            com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r4 = r12.codecAdapterFactory
            r2 = r8
            r7 = r19
            r1 = r8
            r8 = r21
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.add(r1)
            if (r14 != 0) goto L115
            goto L1f2
        L115:
            int r1 = r0.size()
            if (r14 != r10) goto L11d
            int r1 = r1 + (-1)
        L11d:
            java.lang.String r2 = "com.google.android.exoplayer2.decoder.midi.MidiRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L13f java.lang.ClassNotFoundException -> L148
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L13f java.lang.ClassNotFoundException -> L149
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.Exception -> L13f java.lang.ClassNotFoundException -> L149
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L13f java.lang.ClassNotFoundException -> L149
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L13f java.lang.ClassNotFoundException -> L149
            com.google.android.exoplayer2.Renderer r2 = (com.google.android.exoplayer2.Renderer) r2     // Catch: java.lang.Exception -> L13f java.lang.ClassNotFoundException -> L149
            int r4 = r1 + 1
            r0.add(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L13d java.lang.Exception -> L13f
            java.lang.String r1 = "Loaded MidiRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r1)     // Catch: java.lang.ClassNotFoundException -> L13d java.lang.Exception -> L13f
            goto L14a
        L13d:
            r1 = r4
            goto L149
        L13f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating MIDI extension"
            r1.<init>(r2, r0)
            throw r1
        L148:
            r3 = 0
        L149:
            r4 = r1
        L14a:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r2 = 3
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            r5[r3] = r2     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r5[r16] = r17     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r5[r10] = r15     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r2 = 3
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r5[r3] = r19     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r5[r16] = r21     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            r5[r10] = r13     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            java.lang.Object r1 = r1.newInstance(r5)     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            com.google.android.exoplayer2.Renderer r1 = (com.google.android.exoplayer2.Renderer) r1     // Catch: java.lang.Exception -> L17b java.lang.ClassNotFoundException -> L184
            int r2 = r4 + 1
            r0.add(r4, r1)     // Catch: java.lang.ClassNotFoundException -> L179 java.lang.Exception -> L17b
            java.lang.String r1 = "Loaded LibopusAudioRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r1)     // Catch: java.lang.ClassNotFoundException -> L179 java.lang.Exception -> L17b
            goto L185
        L179:
            r4 = r2
            goto L184
        L17b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L184:
            r2 = r4
        L185:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            java.lang.Class<android.os.Handler> r4 = android.os.Handler.class
            r5[r3] = r4     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r5[r16] = r17     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r5[r10] = r15     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r5[r3] = r19     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r5[r16] = r21     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            r5[r10] = r13     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            java.lang.Object r1 = r1.newInstance(r5)     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            com.google.android.exoplayer2.Renderer r1 = (com.google.android.exoplayer2.Renderer) r1     // Catch: java.lang.Exception -> L1b6 java.lang.ClassNotFoundException -> L1bf
            int r4 = r2 + 1
            r0.add(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L1b4 java.lang.Exception -> L1b6
            java.lang.String r1 = "Loaded LibflacAudioRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r1)     // Catch: java.lang.ClassNotFoundException -> L1b4 java.lang.Exception -> L1b6
            goto L1c0
        L1b4:
            r2 = r4
            goto L1bf
        L1b6:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L1bf:
            r4 = r2
        L1c0:
            java.lang.Class<com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer> r1 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer.class
            r2 = 3
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            r5[r3] = r2     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r5[r16] = r17     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r5[r10] = r15     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r2[r3] = r19     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r2[r16] = r21     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r2[r10] = r13     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            com.google.android.exoplayer2.Renderer r1 = (com.google.android.exoplayer2.Renderer) r1     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            r0.add(r4, r1)     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            java.lang.String r1 = "Loaded FfmpegAudioRenderer."
            com.google.android.exoplayer2.util.Log.i(r11, r1)     // Catch: java.lang.Exception -> L1e9 java.lang.ClassNotFoundException -> L1f3
            goto L1f3
        L1e9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L1f2:
            r3 = 0
        L1f3:
            android.os.Looper r1 = r19.getLooper()
            com.google.android.exoplayer2.text.TextRenderer r2 = new com.google.android.exoplayer2.text.TextRenderer
            r4 = r22
            r2.<init>(r4, r1)
            r0.add(r2)
            android.os.Looper r1 = r19.getLooper()
            com.google.android.exoplayer2.metadata.MetadataRenderer r2 = new com.google.android.exoplayer2.metadata.MetadataRenderer
            r4 = r23
            r2.<init>(r4, r1)
            r0.add(r2)
            com.google.android.exoplayer2.video.spherical.CameraMotionRenderer r1 = new com.google.android.exoplayer2.video.spherical.CameraMotionRenderer
            r1.<init>()
            r0.add(r1)
            com.google.android.exoplayer2.Renderer[] r1 = new com.google.android.exoplayer2.Renderer[r3]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.exoplayer2.Renderer[] r0 = (com.google.android.exoplayer2.Renderer[]) r0
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean r2) {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r0 = r1.codecAdapterFactory
            r0.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r0 = r1.codecAdapterFactory
            r0.forceDisableAsynchronous()
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
            r1 = this;
            com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory r0 = r1.codecAdapterFactory
            r0.forceEnableAsynchronous()
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long r1) {
            r0 = this;
            r0.allowedVideoJoiningTimeMs = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableAudioFloatOutput(boolean r1) {
            r0 = this;
            r0.enableFloatOutput = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableAudioOffload(boolean r1) {
            r0 = this;
            r0.enableOffload = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean r1) {
            r0 = this;
            r0.enableAudioTrackPlaybackParams = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setEnableDecoderFallback(boolean r1) {
            r0 = this;
            r0.enableDecoderFallback = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setExtensionRendererMode(int r1) {
            r0 = this;
            r0.extensionRendererMode = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.exoplayer2.DefaultRenderersFactory setMediaCodecSelector(com.google.android.exoplayer2.mediacodec.MediaCodecSelector r1) {
            r0 = this;
            r0.mediaCodecSelector = r1
            return r0
    }
}
