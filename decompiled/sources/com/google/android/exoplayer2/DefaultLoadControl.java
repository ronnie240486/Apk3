package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultLoadControl implements com.google.android.exoplayer2.LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final com.google.android.exoplayer2.upstream.DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isLoading;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private int targetBufferBytes;
    private final int targetBufferBytesOverwrite;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.upstream.DefaultAllocator allocator;
        private int backBufferDurationMs;
        private int bufferForPlaybackAfterRebufferMs;
        private int bufferForPlaybackMs;
        private boolean buildCalled;
        private int maxBufferMs;
        private int minBufferMs;
        private boolean prioritizeTimeOverSizeThresholds;
        private boolean retainBackBufferFromKeyframe;
        private int targetBufferBytes;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 50000(0xc350, float:7.0065E-41)
                r1.minBufferMs = r0
                r1.maxBufferMs = r0
                r0 = 2500(0x9c4, float:3.503E-42)
                r1.bufferForPlaybackMs = r0
                r0 = 5000(0x1388, float:7.006E-42)
                r1.bufferForPlaybackAfterRebufferMs = r0
                r0 = -1
                r1.targetBufferBytes = r0
                r0 = 0
                r1.prioritizeTimeOverSizeThresholds = r0
                r1.backBufferDurationMs = r0
                r1.retainBackBufferFromKeyframe = r0
                return
        }

        public com.google.android.exoplayer2.DefaultLoadControl build() {
                r13 = this;
                boolean r0 = r13.buildCalled
                r1 = 1
                r0 = r0 ^ r1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r13.buildCalled = r1
                com.google.android.exoplayer2.upstream.DefaultAllocator r0 = r13.allocator
                if (r0 != 0) goto L16
                com.google.android.exoplayer2.upstream.DefaultAllocator r0 = new com.google.android.exoplayer2.upstream.DefaultAllocator
                r2 = 65536(0x10000, float:9.1835E-41)
                r0.<init>(r1, r2)
                r13.allocator = r0
            L16:
                com.google.android.exoplayer2.DefaultLoadControl r0 = new com.google.android.exoplayer2.DefaultLoadControl
                com.google.android.exoplayer2.upstream.DefaultAllocator r4 = r13.allocator
                int r5 = r13.minBufferMs
                int r6 = r13.maxBufferMs
                int r7 = r13.bufferForPlaybackMs
                int r8 = r13.bufferForPlaybackAfterRebufferMs
                int r9 = r13.targetBufferBytes
                boolean r10 = r13.prioritizeTimeOverSizeThresholds
                int r11 = r13.backBufferDurationMs
                boolean r12 = r13.retainBackBufferFromKeyframe
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.DefaultLoadControl createDefaultLoadControl() {
                r1 = this;
                com.google.android.exoplayer2.DefaultLoadControl r0 = r1.build()
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLoadControl.Builder setAllocator(com.google.android.exoplayer2.upstream.DefaultAllocator r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.allocator = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLoadControl.Builder setBackBuffer(int r4, boolean r5) {
                r3 = this;
                boolean r0 = r3.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r0 = 0
                java.lang.String r1 = "backBufferDurationMs"
                java.lang.String r2 = "0"
                com.google.android.exoplayer2.DefaultLoadControl.access$000(r4, r0, r1, r2)
                r3.backBufferDurationMs = r4
                r3.retainBackBufferFromKeyframe = r5
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLoadControl.Builder setBufferDurationsMs(int r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r0 = r4.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r0 = 0
                java.lang.String r1 = "bufferForPlaybackMs"
                java.lang.String r2 = "0"
                com.google.android.exoplayer2.DefaultLoadControl.access$000(r7, r0, r1, r2)
                java.lang.String r3 = "bufferForPlaybackAfterRebufferMs"
                com.google.android.exoplayer2.DefaultLoadControl.access$000(r8, r0, r3, r2)
                java.lang.String r0 = "minBufferMs"
                com.google.android.exoplayer2.DefaultLoadControl.access$000(r5, r7, r0, r1)
                com.google.android.exoplayer2.DefaultLoadControl.access$000(r5, r8, r0, r3)
                java.lang.String r1 = "maxBufferMs"
                com.google.android.exoplayer2.DefaultLoadControl.access$000(r6, r5, r1, r0)
                r4.minBufferMs = r5
                r4.maxBufferMs = r6
                r4.bufferForPlaybackMs = r7
                r4.bufferForPlaybackAfterRebufferMs = r8
                return r4
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLoadControl.Builder setPrioritizeTimeOverSizeThresholds(boolean r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.prioritizeTimeOverSizeThresholds = r2
                return r1
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.DefaultLoadControl.Builder setTargetBufferBytes(int r2) {
                r1 = this;
                boolean r0 = r1.buildCalled
                r0 = r0 ^ 1
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r1.targetBufferBytes = r2
                return r1
        }
    }

    public DefaultLoadControl() {
            r10 = this;
            com.google.android.exoplayer2.upstream.DefaultAllocator r1 = new com.google.android.exoplayer2.upstream.DefaultAllocator
            r0 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r0, r2)
            r2 = 50000(0xc350, float:7.0065E-41)
            r3 = 50000(0xc350, float:7.0065E-41)
            r4 = 2500(0x9c4, float:3.503E-42)
            r5 = 5000(0x1388, float:7.006E-42)
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public DefaultLoadControl(com.google.android.exoplayer2.upstream.DefaultAllocator r6, int r7, int r8, int r9, int r10, int r11, boolean r12, int r13, boolean r14) {
            r5 = this;
            r5.<init>()
            r0 = 0
            java.lang.String r1 = "bufferForPlaybackMs"
            java.lang.String r2 = "0"
            assertGreaterOrEqual(r9, r0, r1, r2)
            java.lang.String r3 = "bufferForPlaybackAfterRebufferMs"
            assertGreaterOrEqual(r10, r0, r3, r2)
            java.lang.String r4 = "minBufferMs"
            assertGreaterOrEqual(r7, r9, r4, r1)
            assertGreaterOrEqual(r7, r10, r4, r3)
            java.lang.String r1 = "maxBufferMs"
            assertGreaterOrEqual(r8, r7, r1, r4)
            java.lang.String r1 = "backBufferDurationMs"
            assertGreaterOrEqual(r13, r0, r1, r2)
            r5.allocator = r6
            long r6 = (long) r7
            long r6 = com.google.android.exoplayer2.util.Util.msToUs(r6)
            r5.minBufferUs = r6
            long r6 = (long) r8
            long r6 = com.google.android.exoplayer2.util.Util.msToUs(r6)
            r5.maxBufferUs = r6
            long r6 = (long) r9
            long r6 = com.google.android.exoplayer2.util.Util.msToUs(r6)
            r5.bufferForPlaybackUs = r6
            long r6 = (long) r10
            long r6 = com.google.android.exoplayer2.util.Util.msToUs(r6)
            r5.bufferForPlaybackAfterRebufferUs = r6
            r5.targetBufferBytesOverwrite = r11
            r6 = -1
            if (r11 == r6) goto L46
            goto L48
        L46:
            r11 = 13107200(0xc80000, float:1.8367099E-38)
        L48:
            r5.targetBufferBytes = r11
            r5.prioritizeTimeOverSizeThresholds = r12
            long r6 = (long) r13
            long r6 = com.google.android.exoplayer2.util.Util.msToUs(r6)
            r5.backBufferDurationUs = r6
            r5.retainBackBufferFromKeyframe = r14
            return
    }

    public static /* synthetic */ void access$000(int r0, int r1, java.lang.String r2, java.lang.String r3) {
            assertGreaterOrEqual(r0, r1, r2, r3)
            return
    }

    private static void assertGreaterOrEqual(int r0, int r1, java.lang.String r2, java.lang.String r3) {
            if (r0 < r1) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " cannot be less than "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r1)
            return
    }

    private static int getDefaultBufferSize(int r1) {
            r0 = 131072(0x20000, float:1.83671E-40)
            switch(r1) {
                case -2: goto L15;
                case -1: goto L5;
                case 0: goto L12;
                case 1: goto Lf;
                case 2: goto Lc;
                case 3: goto Lb;
                case 4: goto Lb;
                case 5: goto Lb;
                case 6: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        Lb:
            return r0
        Lc:
            r1 = 131072000(0x7d00000, float:3.1296362E-34)
            return r1
        Lf:
            r1 = 13107200(0xc80000, float:1.8367099E-38)
            return r1
        L12:
            r1 = 144310272(0x89a0000, float:9.268538E-34)
            return r1
        L15:
            r1 = 0
            return r1
    }

    private void reset(boolean r3) {
            r2 = this;
            int r0 = r2.targetBufferBytesOverwrite
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 13107200(0xc80000, float:1.8367099E-38)
        L7:
            r2.targetBufferBytes = r0
            r0 = 0
            r2.isLoading = r0
            if (r3 == 0) goto L13
            com.google.android.exoplayer2.upstream.DefaultAllocator r3 = r2.allocator
            r3.reset()
        L13:
            return
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public com.google.android.exoplayer2.upstream.Allocator getAllocator() {
            r1 = this;
            com.google.android.exoplayer2.upstream.DefaultAllocator r0 = r1.allocator
            return r0
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
            r2 = this;
            long r0 = r2.backBufferDurationUs
            return r0
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
            r1 = this;
            r0 = 0
            r1.reset(r0)
            return
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
            r1 = this;
            r0 = 1
            r1.reset(r0)
            return
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
            r1 = this;
            r0 = 1
            r1.reset(r0)
            return
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(com.google.android.exoplayer2.Renderer[] r3, com.google.android.exoplayer2.source.TrackGroupArray r4, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5) {
            r2 = this;
            int r4 = r2.targetBufferBytesOverwrite
            r0 = -1
            if (r4 != r0) goto L22
            r4 = 0
            r0 = 0
        L7:
            int r1 = r3.length
            if (r4 >= r1) goto L1c
            r1 = r5[r4]
            if (r1 == 0) goto L19
            r1 = r3[r4]
            int r1 = r1.getTrackType()
            int r1 = getDefaultBufferSize(r1)
            int r0 = r0 + r1
        L19:
            int r4 = r4 + 1
            goto L7
        L1c:
            r3 = 13107200(0xc80000, float:1.8367099E-38)
            int r4 = java.lang.Math.max(r3, r0)
        L22:
            r2.targetBufferBytes = r4
            com.google.android.exoplayer2.upstream.DefaultAllocator r3 = r2.allocator
            r3.setTargetBufferSize(r4)
            return
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
            r1 = this;
            boolean r0 = r1.retainBackBufferFromKeyframe
            return r0
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long r7, long r9, float r11) {
            r6 = this;
            com.google.android.exoplayer2.upstream.DefaultAllocator r7 = r6.allocator
            int r7 = r7.getTotalBytesAllocated()
            int r8 = r6.targetBufferBytes
            r0 = 1
            r1 = 0
            if (r7 < r8) goto Le
            r7 = 1
            goto Lf
        Le:
            r7 = 0
        Lf:
            long r2 = r6.minBufferUs
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 <= 0) goto L21
            long r2 = com.google.android.exoplayer2.util.Util.getMediaDurationForPlayoutDuration(r2, r11)
            long r4 = r6.maxBufferUs
            long r2 = java.lang.Math.min(r2, r4)
        L21:
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = java.lang.Math.max(r2, r4)
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L44
            boolean r8 = r6.prioritizeTimeOverSizeThresholds
            if (r8 != 0) goto L34
            if (r7 != 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            r6.isLoading = r0
            if (r0 != 0) goto L4e
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 >= 0) goto L4e
            java.lang.String r7 = "DefaultLoadControl"
            java.lang.String r8 = "Target buffer size reached with less than 500ms of buffered media data."
            com.google.android.exoplayer2.util.Log.w(r7, r8)
            goto L4e
        L44:
            long r2 = r6.maxBufferUs
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L4c
            if (r7 == 0) goto L4e
        L4c:
            r6.isLoading = r1
        L4e:
            boolean r7 = r6.isLoading
            return r7
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long r4, float r6, boolean r7, long r8) {
            r3 = this;
            long r4 = com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(r4, r6)
            if (r7 == 0) goto L9
            long r6 = r3.bufferForPlaybackAfterRebufferUs
            goto Lb
        L9:
            long r6 = r3.bufferForPlaybackUs
        Lb:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L1b
            r0 = 2
            long r8 = r8 / r0
            long r6 = java.lang.Math.min(r8, r6)
        L1b:
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L36
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L36
            boolean r4 = r3.prioritizeTimeOverSizeThresholds
            if (r4 != 0) goto L34
            com.google.android.exoplayer2.upstream.DefaultAllocator r4 = r3.allocator
            int r4 = r4.getTotalBytesAllocated()
            int r5 = r3.targetBufferBytes
            if (r4 < r5) goto L34
            goto L36
        L34:
            r4 = 0
            goto L37
        L36:
            r4 = 1
        L37:
            return r4
    }
}
