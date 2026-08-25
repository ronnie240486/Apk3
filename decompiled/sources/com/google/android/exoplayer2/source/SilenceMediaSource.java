package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes3.dex */
public final class SilenceMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final com.google.android.exoplayer2.Format FORMAT = null;
    public static final java.lang.String MEDIA_ID = "SilenceMediaSource";
    private static final com.google.android.exoplayer2.MediaItem MEDIA_ITEM = null;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE = null;
    private final long durationUs;
    private final com.google.android.exoplayer2.MediaItem mediaItem;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.SilenceMediaSource$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Factory {
        private long durationUs;

        @androidx.annotation.Nullable
        private java.lang.Object tag;

        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.exoplayer2.source.SilenceMediaSource createMediaSource() {
                r5 = this;
                long r0 = r5.durationUs
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                com.google.android.exoplayer2.source.SilenceMediaSource r0 = new com.google.android.exoplayer2.source.SilenceMediaSource
                long r1 = r5.durationUs
                com.google.android.exoplayer2.MediaItem r3 = com.google.android.exoplayer2.source.SilenceMediaSource.access$000()
                com.google.android.exoplayer2.MediaItem$Builder r3 = r3.buildUpon()
                java.lang.Object r4 = r5.tag
                com.google.android.exoplayer2.MediaItem$Builder r3 = r3.setTag(r4)
                com.google.android.exoplayer2.MediaItem r3 = r3.build()
                r4 = 0
                r0.<init>(r1, r3, r4)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.SilenceMediaSource.Factory setDurationUs(@androidx.annotation.IntRange(from = 1) long r1) {
                r0 = this;
                r0.durationUs = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.source.SilenceMediaSource.Factory setTag(@androidx.annotation.Nullable java.lang.Object r1) {
                r0 = this;
                r0.tag = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SilenceMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod {
        private static final com.google.android.exoplayer2.source.TrackGroupArray TRACKS = null;
        private final long durationUs;
        private final java.util.ArrayList<com.google.android.exoplayer2.source.SampleStream> sampleStreams;

        static {
                com.google.android.exoplayer2.source.TrackGroupArray r0 = new com.google.android.exoplayer2.source.TrackGroupArray
                r1 = 1
                com.google.android.exoplayer2.source.TrackGroup[] r2 = new com.google.android.exoplayer2.source.TrackGroup[r1]
                com.google.android.exoplayer2.source.TrackGroup r3 = new com.google.android.exoplayer2.source.TrackGroup
                com.google.android.exoplayer2.Format[] r1 = new com.google.android.exoplayer2.Format[r1]
                com.google.android.exoplayer2.Format r4 = com.google.android.exoplayer2.source.SilenceMediaSource.access$200()
                r5 = 0
                r1[r5] = r4
                r3.<init>(r1)
                r2[r5] = r3
                r0.<init>(r2)
                com.google.android.exoplayer2.source.SilenceMediaSource.SilenceMediaPeriod.TRACKS = r0
                return
        }

        public SilenceMediaPeriod(long r1) {
                r0 = this;
                r0.<init>()
                r0.durationUs = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.sampleStreams = r1
                return
        }

        private long constrainSeekPosition(long r7) {
                r6 = this;
                long r4 = r6.durationUs
                r2 = 0
                r0 = r7
                long r7 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r2, r4)
                return r7
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long r1, boolean r3) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long r1, com.google.android.exoplayer2.SeekParameters r3) {
                r0 = this;
                long r1 = r0.constrainSeekPosition(r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
                r2 = this;
                r0 = -9223372036854775808
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
                r2 = this;
                r0 = -9223372036854775808
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final /* synthetic */ java.util.List getStreamKeys(java.util.List r1) {
                r0 = this;
                java.util.List r1 = com.google.android.exoplayer2.source.MediaPeriod.CC.$default$getStreamKeys(r0, r1)
                return r1
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
                r1 = this;
                com.google.android.exoplayer2.source.TrackGroupArray r0 = com.google.android.exoplayer2.source.SilenceMediaSource.SilenceMediaPeriod.TRACKS
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback r1, long r2) {
                r0 = this;
                r1.onPrepared(r0)
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
                r2 = this;
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r0
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long r3) {
                r2 = this;
                long r3 = r2.constrainSeekPosition(r3)
                r0 = 0
            L5:
                java.util.ArrayList<com.google.android.exoplayer2.source.SampleStream> r1 = r2.sampleStreams
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<com.google.android.exoplayer2.source.SampleStream> r1 = r2.sampleStreams
                java.lang.Object r1 = r1.get(r0)
                com.google.android.exoplayer2.source.SilenceMediaSource$SilenceSampleStream r1 = (com.google.android.exoplayer2.source.SilenceMediaSource.SilenceSampleStream) r1
                r1.seekTo(r3)
                int r0 = r0 + 1
                goto L5
            L1b:
                return r3
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5, boolean[] r6, com.google.android.exoplayer2.source.SampleStream[] r7, boolean[] r8, long r9) {
                r4 = this;
                long r9 = r4.constrainSeekPosition(r9)
                r0 = 0
            L5:
                int r1 = r5.length
                if (r0 >= r1) goto L3d
                r1 = r7[r0]
                if (r1 == 0) goto L1e
                r1 = r5[r0]
                if (r1 == 0) goto L14
                boolean r1 = r6[r0]
                if (r1 != 0) goto L1e
            L14:
                java.util.ArrayList<com.google.android.exoplayer2.source.SampleStream> r1 = r4.sampleStreams
                r2 = r7[r0]
                r1.remove(r2)
                r1 = 0
                r7[r0] = r1
            L1e:
                r1 = r7[r0]
                if (r1 != 0) goto L3a
                r1 = r5[r0]
                if (r1 == 0) goto L3a
                com.google.android.exoplayer2.source.SilenceMediaSource$SilenceSampleStream r1 = new com.google.android.exoplayer2.source.SilenceMediaSource$SilenceSampleStream
                long r2 = r4.durationUs
                r1.<init>(r2)
                r1.seekTo(r9)
                java.util.ArrayList<com.google.android.exoplayer2.source.SampleStream> r2 = r4.sampleStreams
                r2.add(r1)
                r7[r0] = r1
                r1 = 1
                r8[r0] = r1
            L3a:
                int r0 = r0 + 1
                goto L5
            L3d:
                return r9
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SilenceSampleStream implements com.google.android.exoplayer2.source.SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        public SilenceSampleStream(long r1) {
                r0 = this;
                r0.<init>()
                long r1 = com.google.android.exoplayer2.source.SilenceMediaSource.access$300(r1)
                r0.durationBytes = r1
                r1 = 0
                r0.seekTo(r1)
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder r9, com.google.android.exoplayer2.decoder.DecoderInputBuffer r10, int r11) {
                r8 = this;
                boolean r0 = r8.sentFormat
                r1 = 1
                if (r0 == 0) goto L4b
                r0 = r11 & 2
                if (r0 == 0) goto La
                goto L4b
            La:
                long r2 = r8.durationBytes
                long r4 = r8.positionBytes
                long r2 = r2 - r4
                r6 = 0
                r9 = -4
                int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r0 != 0) goto L1b
                r11 = 4
                r10.addFlag(r11)
                return r9
            L1b:
                long r4 = com.google.android.exoplayer2.source.SilenceMediaSource.access$400(r4)
                r10.timeUs = r4
                r10.addFlag(r1)
                byte[] r0 = com.google.android.exoplayer2.source.SilenceMediaSource.access$500()
                int r0 = r0.length
                long r4 = (long) r0
                long r2 = java.lang.Math.min(r4, r2)
                int r0 = (int) r2
                r2 = r11 & 4
                if (r2 != 0) goto L40
                r10.ensureSpaceForWrite(r0)
                java.nio.ByteBuffer r10 = r10.data
                byte[] r2 = com.google.android.exoplayer2.source.SilenceMediaSource.access$500()
                r3 = 0
                r10.put(r2, r3, r0)
            L40:
                r10 = r11 & 1
                if (r10 != 0) goto L4a
                long r10 = r8.positionBytes
                long r0 = (long) r0
                long r10 = r10 + r0
                r8.positionBytes = r10
            L4a:
                return r9
            L4b:
                com.google.android.exoplayer2.Format r10 = com.google.android.exoplayer2.source.SilenceMediaSource.access$200()
                r9.format = r10
                r8.sentFormat = r1
                r9 = -5
                return r9
        }

        public void seekTo(long r7) {
                r6 = this;
                long r0 = com.google.android.exoplayer2.source.SilenceMediaSource.access$300(r7)
                long r4 = r6.durationBytes
                r2 = 0
                long r7 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r2, r4)
                r6.positionBytes = r7
                return
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long r3) {
                r2 = this;
                long r0 = r2.positionBytes
                r2.seekTo(r3)
                long r3 = r2.positionBytes
                long r3 = r3 - r0
                byte[] r0 = com.google.android.exoplayer2.source.SilenceMediaSource.access$500()
                int r0 = r0.length
                long r0 = (long) r0
                long r3 = r3 / r0
                int r4 = (int) r3
                return r4
        }
    }

    static {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "audio/raw"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            r1 = 2
            com.google.android.exoplayer2.Format$Builder r0 = r0.setChannelCount(r1)
            r2 = 44100(0xac44, float:6.1797E-41)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleRate(r2)
            com.google.android.exoplayer2.Format$Builder r0 = r0.setPcmEncoding(r1)
            com.google.android.exoplayer2.Format r0 = r0.build()
            com.google.android.exoplayer2.source.SilenceMediaSource.FORMAT = r0
            com.google.android.exoplayer2.MediaItem$Builder r2 = new com.google.android.exoplayer2.MediaItem$Builder
            r2.<init>()
            java.lang.String r3 = "SilenceMediaSource"
            com.google.android.exoplayer2.MediaItem$Builder r2 = r2.setMediaId(r3)
            android.net.Uri r3 = android.net.Uri.EMPTY
            com.google.android.exoplayer2.MediaItem$Builder r2 = r2.setUri(r3)
            java.lang.String r0 = r0.sampleMimeType
            com.google.android.exoplayer2.MediaItem$Builder r0 = r2.setMimeType(r0)
            com.google.android.exoplayer2.MediaItem r0 = r0.build()
            com.google.android.exoplayer2.source.SilenceMediaSource.MEDIA_ITEM = r0
            int r0 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r1, r1)
            int r0 = r0 * 1024
            byte[] r0 = new byte[r0]
            com.google.android.exoplayer2.source.SilenceMediaSource.SILENCE_SAMPLE = r0
            return
    }

    public SilenceMediaSource(long r2) {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.SilenceMediaSource.MEDIA_ITEM
            r1.<init>(r2, r0)
            return
    }

    private SilenceMediaSource(long r4, com.google.android.exoplayer2.MediaItem r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r3.durationUs = r4
            r3.mediaItem = r6
            return
    }

    public /* synthetic */ SilenceMediaSource(long r1, com.google.android.exoplayer2.MediaItem r3, com.google.android.exoplayer2.source.SilenceMediaSource.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaItem access$000() {
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.SilenceMediaSource.MEDIA_ITEM
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Format access$200() {
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.source.SilenceMediaSource.FORMAT
            return r0
    }

    public static /* synthetic */ long access$300(long r0) {
            long r0 = getAudioByteCount(r0)
            return r0
    }

    public static /* synthetic */ long access$400(long r0) {
            long r0 = getAudioPositionUs(r0)
            return r0
    }

    public static /* synthetic */ byte[] access$500() {
            byte[] r0 = com.google.android.exoplayer2.source.SilenceMediaSource.SILENCE_SAMPLE
            return r0
    }

    private static long getAudioByteCount(long r2) {
            r0 = 44100(0xac44, double:2.17883E-319)
            long r2 = r2 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            r0 = 2
            int r0 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r0, r0)
            long r0 = (long) r0
            long r0 = r0 * r2
            return r0
    }

    private static long getAudioPositionUs(long r2) {
            r0 = 2
            int r0 = com.google.android.exoplayer2.util.Util.getPcmFrameSize(r0, r0)
            long r0 = (long) r0
            long r2 = r2 / r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            r0 = 44100(0xac44, double:2.17883E-319)
            long r2 = r2 / r0
            return r2
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r1, com.google.android.exoplayer2.upstream.Allocator r2, long r3) {
            r0 = this;
            com.google.android.exoplayer2.source.SilenceMediaSource$SilenceMediaPeriod r1 = new com.google.android.exoplayer2.source.SilenceMediaSource$SilenceMediaPeriod
            long r2 = r0.durationUs
            r1.<init>(r2)
            return r1
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
            r1 = this;
            com.google.android.exoplayer2.MediaItem r0 = r1.mediaItem
            return r0
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void prepareSourceInternal(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.TransferListener r9) {
            r8 = this;
            com.google.android.exoplayer2.source.SinglePeriodTimeline r9 = new com.google.android.exoplayer2.source.SinglePeriodTimeline
            long r1 = r8.durationUs
            com.google.android.exoplayer2.MediaItem r7 = r8.mediaItem
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.refreshSourceInfo(r9)
            return
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void releaseSourceInternal() {
            r0 = this;
            return
    }
}
