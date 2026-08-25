package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class MappingTrackSelector extends com.google.android.exoplayer2.trackselection.TrackSelector {

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final java.lang.String[] rendererNames;
        private final com.google.android.exoplayer2.source.TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final com.google.android.exoplayer2.source.TrackGroupArray unmappedTrackGroups;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        @androidx.annotation.VisibleForTesting
        public MappedTrackInfo(java.lang.String[] r1, int[] r2, com.google.android.exoplayer2.source.TrackGroupArray[] r3, int[] r4, int[][][] r5, com.google.android.exoplayer2.source.TrackGroupArray r6) {
                r0 = this;
                r0.<init>()
                r0.rendererNames = r1
                r0.rendererTrackTypes = r2
                r0.rendererTrackGroups = r3
                r0.rendererFormatSupports = r5
                r0.rendererMixedMimeTypeAdaptiveSupports = r4
                r0.unmappedTrackGroups = r6
                int r1 = r2.length
                r0.rendererCount = r1
                return
        }

        public int getAdaptiveSupport(int r7, int r8, boolean r9) {
                r6 = this;
                com.google.android.exoplayer2.source.TrackGroupArray[] r0 = r6.rendererTrackGroups
                r0 = r0[r7]
                com.google.android.exoplayer2.source.TrackGroup r0 = r0.get(r8)
                int r0 = r0.length
                int[] r1 = new int[r0]
                r2 = 0
                r3 = 0
            Le:
                if (r2 >= r0) goto L24
                int r4 = r6.getTrackSupport(r7, r8, r2)
                r5 = 4
                if (r4 == r5) goto L1c
                if (r9 == 0) goto L21
                r5 = 3
                if (r4 != r5) goto L21
            L1c:
                int r4 = r3 + 1
                r1[r3] = r2
                r3 = r4
            L21:
                int r2 = r2 + 1
                goto Le
            L24:
                int[] r9 = java.util.Arrays.copyOf(r1, r3)
                int r7 = r6.getAdaptiveSupport(r7, r8, r9)
                return r7
        }

        public int getAdaptiveSupport(int r8, int r9, int[] r10) {
                r7 = this;
                r0 = 0
                r1 = 16
                r2 = 0
                r4 = r2
                r1 = 0
                r2 = 0
                r3 = 16
            L9:
                int r5 = r10.length
                if (r0 >= r5) goto L3d
                r5 = r10[r0]
                com.google.android.exoplayer2.source.TrackGroupArray[] r6 = r7.rendererTrackGroups
                r6 = r6[r8]
                com.google.android.exoplayer2.source.TrackGroup r6 = r6.get(r9)
                com.google.android.exoplayer2.Format r5 = r6.getFormat(r5)
                java.lang.String r5 = r5.sampleMimeType
                int r6 = r2 + 1
                if (r2 != 0) goto L22
                r4 = r5
                goto L29
            L22:
                boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r4, r5)
                r2 = r2 ^ 1
                r1 = r1 | r2
            L29:
                int[][][] r2 = r7.rendererFormatSupports
                r2 = r2[r8]
                r2 = r2[r9]
                r2 = r2[r0]
                int r2 = com.google.android.exoplayer2.RendererCapabilities.CC.getAdaptiveSupport(r2)
                int r3 = java.lang.Math.min(r3, r2)
                int r0 = r0 + 1
                r2 = r6
                goto L9
            L3d:
                if (r1 == 0) goto L47
                int[] r9 = r7.rendererMixedMimeTypeAdaptiveSupports
                r8 = r9[r8]
                int r3 = java.lang.Math.min(r3, r8)
            L47:
                return r3
        }

        public int getCapabilities(int r2, int r3, int r4) {
                r1 = this;
                int[][][] r0 = r1.rendererFormatSupports
                r2 = r0[r2]
                r2 = r2[r3]
                r2 = r2[r4]
                return r2
        }

        public int getRendererCount() {
                r1 = this;
                int r0 = r1.rendererCount
                return r0
        }

        public java.lang.String getRendererName(int r2) {
                r1 = this;
                java.lang.String[] r0 = r1.rendererNames
                r2 = r0[r2]
                return r2
        }

        public int getRendererSupport(int r11) {
                r10 = this;
                int[][][] r0 = r10.rendererFormatSupports
                r11 = r0[r11]
                int r0 = r11.length
                r1 = 0
                r2 = 0
                r3 = 0
            L8:
                if (r2 >= r0) goto L36
                r4 = r11[r2]
                int r5 = r4.length
                r6 = 0
            Le:
                if (r6 >= r5) goto L33
                r7 = r4[r6]
                int r7 = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(r7)
                r8 = 2
                r9 = 1
                if (r7 == 0) goto L2b
                if (r7 == r9) goto L2b
                if (r7 == r8) goto L2b
                r9 = 3
                if (r7 == r9) goto L2c
                r11 = 4
                if (r7 != r11) goto L25
                return r9
            L25:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r11.<init>()
                throw r11
            L2b:
                r8 = 1
            L2c:
                int r3 = java.lang.Math.max(r3, r8)
                int r6 = r6 + 1
                goto Le
            L33:
                int r2 = r2 + 1
                goto L8
            L36:
                return r3
        }

        public int getRendererType(int r2) {
                r1 = this;
                int[] r0 = r1.rendererTrackTypes
                r2 = r0[r2]
                return r2
        }

        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups(int r2) {
                r1 = this;
                com.google.android.exoplayer2.source.TrackGroupArray[] r0 = r1.rendererTrackGroups
                r2 = r0[r2]
                return r2
        }

        public int getTrackSupport(int r1, int r2, int r3) {
                r0 = this;
                int r1 = r0.getCapabilities(r1, r2, r3)
                int r1 = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(r1)
                return r1
        }

        public int getTypeSupport(int r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                int r2 = r3.rendererCount
                if (r0 >= r2) goto L17
                int[] r2 = r3.rendererTrackTypes
                r2 = r2[r0]
                if (r2 != r4) goto L14
                int r2 = r3.getRendererSupport(r0)
                int r1 = java.lang.Math.max(r1, r2)
            L14:
                int r0 = r0 + 1
                goto L2
            L17:
                return r1
        }

        public com.google.android.exoplayer2.source.TrackGroupArray getUnmappedTrackGroups() {
                r1 = this;
                com.google.android.exoplayer2.source.TrackGroupArray r0 = r1.unmappedTrackGroups
                return r0
        }
    }

    public MappingTrackSelector() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int findRenderer(com.google.android.exoplayer2.RendererCapabilities[] r10, com.google.android.exoplayer2.source.TrackGroup r11, int[] r12, boolean r13) throws com.google.android.exoplayer2.ExoPlaybackException {
            int r0 = r10.length
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
        L6:
            int r6 = r10.length
            if (r3 >= r6) goto L3b
            r6 = r10[r3]
            r7 = 0
            r8 = 0
        Ld:
            int r9 = r11.length
            if (r7 >= r9) goto L24
            com.google.android.exoplayer2.Format r9 = r11.getFormat(r7)
            int r9 = r6.supportsFormat(r9)
            int r9 = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(r9)
            int r8 = java.lang.Math.max(r8, r9)
            int r7 = r7 + 1
            goto Ld
        L24:
            r6 = r12[r3]
            if (r6 != 0) goto L2a
            r6 = 1
            goto L2b
        L2a:
            r6 = 0
        L2b:
            if (r8 > r4) goto L35
            if (r8 != r4) goto L38
            if (r13 == 0) goto L38
            if (r5 != 0) goto L38
            if (r6 == 0) goto L38
        L35:
            r0 = r3
            r5 = r6
            r4 = r8
        L38:
            int r3 = r3 + 1
            goto L6
        L3b:
            return r0
    }

    private static int[] getFormatSupport(com.google.android.exoplayer2.RendererCapabilities r3, com.google.android.exoplayer2.source.TrackGroup r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            int r0 = r4.length
            int[] r0 = new int[r0]
            r1 = 0
        L5:
            int r2 = r4.length
            if (r1 >= r2) goto L16
            com.google.android.exoplayer2.Format r2 = r4.getFormat(r1)
            int r2 = r3.supportsFormat(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5
        L16:
            return r0
    }

    private static int[] getMixedMimeTypeAdaptationSupports(com.google.android.exoplayer2.RendererCapabilities[] r4) throws com.google.android.exoplayer2.ExoPlaybackException {
            int r0 = r4.length
            int[] r1 = new int[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L11
            r3 = r4[r2]
            int r3 = r3.supportsMixedMimeTypeAdaptation()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L11:
            return r1
    }

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo getCurrentMappedTrackInfo() {
            r1 = this;
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = r1.currentMappedTrackInfo
            return r0
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r1 = (com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) r1
            r0.currentMappedTrackInfo = r1
            return
    }

    public abstract android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> selectTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r1, int[][][] r2, int[] r3, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4, com.google.android.exoplayer2.Timeline r5) throws com.google.android.exoplayer2.ExoPlaybackException;

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks(com.google.android.exoplayer2.RendererCapabilities[] r15, com.google.android.exoplayer2.source.TrackGroupArray r16, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r17, com.google.android.exoplayer2.Timeline r18) throws com.google.android.exoplayer2.ExoPlaybackException {
            r14 = this;
            r0 = r15
            r1 = r16
            int r2 = r0.length
            r3 = 1
            int r2 = r2 + r3
            int[] r2 = new int[r2]
            int r4 = r0.length
            int r4 = r4 + r3
            com.google.android.exoplayer2.source.TrackGroup[][] r5 = new com.google.android.exoplayer2.source.TrackGroup[r4][]
            int r6 = r0.length
            int r6 = r6 + r3
            int[][][] r6 = new int[r6][][]
            r7 = 0
            r8 = 0
        L12:
            if (r8 >= r4) goto L21
            int r9 = r1.length
            com.google.android.exoplayer2.source.TrackGroup[] r10 = new com.google.android.exoplayer2.source.TrackGroup[r9]
            r5[r8] = r10
            int[][] r9 = new int[r9][]
            r6[r8] = r9
            int r8 = r8 + 1
            goto L12
        L21:
            int[] r4 = getMixedMimeTypeAdaptationSupports(r15)
            r8 = 0
        L26:
            int r9 = r1.length
            if (r8 >= r9) goto L5a
            com.google.android.exoplayer2.source.TrackGroup r9 = r1.get(r8)
            int r10 = r9.type
            r11 = 5
            if (r10 != r11) goto L35
            r10 = 1
            goto L36
        L35:
            r10 = 0
        L36:
            int r10 = findRenderer(r15, r9, r2, r10)
            int r11 = r0.length
            if (r10 != r11) goto L42
            int r11 = r9.length
            int[] r11 = new int[r11]
            goto L48
        L42:
            r11 = r0[r10]
            int[] r11 = getFormatSupport(r11, r9)
        L48:
            r12 = r2[r10]
            r13 = r5[r10]
            r13[r12] = r9
            r9 = r6[r10]
            r9[r12] = r11
            r9 = r2[r10]
            int r9 = r9 + r3
            r2[r10] = r9
            int r8 = r8 + 1
            goto L26
        L5a:
            int r1 = r0.length
            com.google.android.exoplayer2.source.TrackGroupArray[] r10 = new com.google.android.exoplayer2.source.TrackGroupArray[r1]
            int r1 = r0.length
            java.lang.String[] r8 = new java.lang.String[r1]
            int r1 = r0.length
            int[] r9 = new int[r1]
        L63:
            int r1 = r0.length
            if (r7 >= r1) goto L94
            r1 = r2[r7]
            com.google.android.exoplayer2.source.TrackGroupArray r3 = new com.google.android.exoplayer2.source.TrackGroupArray
            r11 = r5[r7]
            java.lang.Object[] r11 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r11, r1)
            com.google.android.exoplayer2.source.TrackGroup[] r11 = (com.google.android.exoplayer2.source.TrackGroup[]) r11
            r3.<init>(r11)
            r10[r7] = r3
            r3 = r6[r7]
            java.lang.Object[] r1 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r3, r1)
            int[][] r1 = (int[][]) r1
            r6[r7] = r1
            r1 = r0[r7]
            java.lang.String r1 = r1.getName()
            r8[r7] = r1
            r1 = r0[r7]
            int r1 = r1.getTrackType()
            r9[r7] = r1
            int r7 = r7 + 1
            goto L63
        L94:
            int r1 = r0.length
            r1 = r2[r1]
            com.google.android.exoplayer2.source.TrackGroupArray r13 = new com.google.android.exoplayer2.source.TrackGroupArray
            int r0 = r0.length
            r0 = r5[r0]
            java.lang.Object[] r0 = com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(r0, r1)
            com.google.android.exoplayer2.source.TrackGroup[] r0 = (com.google.android.exoplayer2.source.TrackGroup[]) r0
            r13.<init>(r0)
            com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo r0 = new com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo
            r7 = r0
            r11 = r4
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r7 = r14
            r8 = r0
            r9 = r6
            r10 = r4
            r11 = r17
            r12 = r18
            android.util.Pair r1 = r7.selectTracks(r8, r9, r10, r11, r12)
            java.lang.Object r2 = r1.second
            com.google.android.exoplayer2.trackselection.TrackSelection[] r2 = (com.google.android.exoplayer2.trackselection.TrackSelection[]) r2
            com.google.android.exoplayer2.Tracks r2 = com.google.android.exoplayer2.trackselection.TrackSelectionUtil.buildTracks(r0, r2)
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = new com.google.android.exoplayer2.trackselection.TrackSelectorResult
            java.lang.Object r4 = r1.first
            com.google.android.exoplayer2.RendererConfiguration[] r4 = (com.google.android.exoplayer2.RendererConfiguration[]) r4
            java.lang.Object r1 = r1.second
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r1 = (com.google.android.exoplayer2.trackselection.ExoTrackSelection[]) r1
            r3.<init>(r4, r1, r2, r0)
            return r3
    }
}
