package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePeriodTimeline extends com.google.android.exoplayer2.Timeline {
    private static final com.google.android.exoplayer2.MediaItem MEDIA_ITEM = null;
    private static final java.lang.Object UID = null;
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;

    @androidx.annotation.Nullable
    private final java.lang.Object manifest;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.source.SinglePeriodTimeline.UID = r0
            com.google.android.exoplayer2.MediaItem$Builder r0 = new com.google.android.exoplayer2.MediaItem$Builder
            r0.<init>()
            java.lang.String r1 = "SinglePeriodTimeline"
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setMediaId(r1)
            android.net.Uri r1 = android.net.Uri.EMPTY
            com.google.android.exoplayer2.MediaItem$Builder r0 = r0.setUri(r1)
            com.google.android.exoplayer2.MediaItem r0 = r0.build()
            com.google.android.exoplayer2.source.SinglePeriodTimeline.MEDIA_ITEM = r0
            return
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long r22, long r24, long r26, long r28, long r30, long r32, long r34, boolean r36, boolean r37, @androidx.annotation.Nullable java.lang.Object r38, com.google.android.exoplayer2.MediaItem r39, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.LiveConfiguration r40) {
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = r24
            r5 = r26
            r7 = r28
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r36
            r16 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r17 = 0
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16, r17, r18, r19, r20)
            return
    }

    public SinglePeriodTimeline(long r4, long r6, long r8, long r10, long r12, long r14, long r16, boolean r18, boolean r19, boolean r20, @androidx.annotation.Nullable java.lang.Object r21, com.google.android.exoplayer2.MediaItem r22, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem.LiveConfiguration r23) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.presentationStartTimeMs = r1
            r1 = r6
            r0.windowStartTimeMs = r1
            r1 = r8
            r0.elapsedRealtimeEpochOffsetMs = r1
            r1 = r10
            r0.periodDurationUs = r1
            r1 = r12
            r0.windowDurationUs = r1
            r1 = r14
            r0.windowPositionInPeriodUs = r1
            r1 = r16
            r0.windowDefaultStartPositionUs = r1
            r1 = r18
            r0.isSeekable = r1
            r1 = r19
            r0.isDynamic = r1
            r1 = r20
            r0.suppressPositionProjection = r1
            r1 = r21
            r0.manifest = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r22)
            com.google.android.exoplayer2.MediaItem r1 = (com.google.android.exoplayer2.MediaItem) r1
            r0.mediaItem = r1
            r1 = r23
            r0.liveConfiguration = r1
            return
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long r24, long r26, long r28, long r30, long r32, long r34, long r36, boolean r38, boolean r39, boolean r40, @androidx.annotation.Nullable java.lang.Object r41, @androidx.annotation.Nullable java.lang.Object r42) {
            r23 = this;
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.SinglePeriodTimeline.MEDIA_ITEM
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.buildUpon()
            r2 = r42
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setTag(r2)
            com.google.android.exoplayer2.MediaItem r21 = r1.build()
            if (r40 == 0) goto L15
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r0.liveConfiguration
            goto L16
        L15:
            r0 = 0
        L16:
            r22 = r0
            r19 = 0
            r2 = r23
            r3 = r24
            r5 = r26
            r7 = r28
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r36
            r17 = r38
            r18 = r39
            r20 = r41
            r2.<init>(r3, r5, r7, r9, r11, r13, r15, r17, r18, r19, r20, r21, r22)
            return
    }

    public SinglePeriodTimeline(long r22, long r24, long r26, long r28, boolean r30, boolean r31, boolean r32, @androidx.annotation.Nullable java.lang.Object r33, com.google.android.exoplayer2.MediaItem r34) {
            r21 = this;
            r15 = r34
            if (r32 == 0) goto L7
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r15.liveConfiguration
            goto L8
        L7:
            r0 = 0
        L8:
            r20 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            r0 = r21
            r7 = r22
            r9 = r24
            r11 = r26
            r13 = r28
            r15 = r30
            r16 = r31
            r18 = r33
            r19 = r34
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16, r17, r18, r19, r20)
            return
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long r21, long r23, long r25, long r27, boolean r29, boolean r30, boolean r31, @androidx.annotation.Nullable java.lang.Object r32, @androidx.annotation.Nullable java.lang.Object r33) {
            r20 = this;
            r0 = r20
            r7 = r21
            r9 = r23
            r11 = r25
            r13 = r27
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
            r19 = r33
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16, r17, r18, r19)
            return
    }

    public SinglePeriodTimeline(long r15, boolean r17, boolean r18, boolean r19, @androidx.annotation.Nullable java.lang.Object r20, com.google.android.exoplayer2.MediaItem r21) {
            r14 = this;
            r5 = 0
            r7 = 0
            r0 = r14
            r1 = r15
            r3 = r15
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r0.<init>(r1, r3, r5, r7, r9, r10, r11, r12, r13)
            return
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long r15, boolean r17, boolean r18, boolean r19, @androidx.annotation.Nullable java.lang.Object r20, @androidx.annotation.Nullable java.lang.Object r21) {
            r14 = this;
            r5 = 0
            r7 = 0
            r0 = r14
            r1 = r15
            r3 = r15
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r0.<init>(r1, r3, r5, r7, r9, r10, r11, r12, r13)
            return
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = com.google.android.exoplayer2.source.SinglePeriodTimeline.UID
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La
            r2 = 0
            goto Lb
        La:
            r2 = -1
        Lb:
            return r2
    }

    @Override // com.google.android.exoplayer2.Timeline
    public com.google.android.exoplayer2.Timeline.Period getPeriod(int r9, com.google.android.exoplayer2.Timeline.Period r10, boolean r11) {
            r8 = this;
            r0 = 0
            r1 = 1
            com.google.android.exoplayer2.util.Assertions.checkIndex(r9, r0, r1)
            if (r11 == 0) goto La
            java.lang.Object r9 = com.google.android.exoplayer2.source.SinglePeriodTimeline.UID
            goto Lb
        La:
            r9 = 0
        Lb:
            r2 = r9
            r1 = 0
            r3 = 0
            long r4 = r8.periodDurationUs
            long r6 = r8.windowPositionInPeriodUs
            long r6 = -r6
            r0 = r10
            com.google.android.exoplayer2.Timeline$Period r9 = r0.set(r1, r2, r3, r4, r6)
            return r9
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.exoplayer2.Timeline
    public java.lang.Object getUidOfPeriod(int r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r0, r1)
            java.lang.Object r3 = com.google.android.exoplayer2.source.SinglePeriodTimeline.UID
            return r3
    }

    @Override // com.google.android.exoplayer2.Timeline
    public com.google.android.exoplayer2.Timeline.Window getWindow(int r25, com.google.android.exoplayer2.Timeline.Window r26, long r27) {
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r1, r2)
            long r1 = r0.windowDefaultStartPositionUs
            boolean r14 = r0.isDynamic
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.suppressPositionProjection
            if (r5 != 0) goto L2e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r5 = r0.windowDurationUs
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            com.google.android.exoplayer2.MediaItem r5 = r0.mediaItem
            java.lang.Object r6 = r0.manifest
            long r7 = r0.presentationStartTimeMs
            long r9 = r0.windowStartTimeMs
            long r11 = r0.elapsedRealtimeEpochOffsetMs
            boolean r13 = r0.isSeekable
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r15 = r0.liveConfiguration
            long r1 = r0.windowDurationUs
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.windowPositionInPeriodUs
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.Timeline$Window r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
            r1 = this;
            r0 = 1
            return r0
    }
}
