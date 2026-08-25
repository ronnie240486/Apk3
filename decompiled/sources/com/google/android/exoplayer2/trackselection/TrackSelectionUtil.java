package com.google.android.exoplayer2.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection createAdaptiveTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition r1);
    }

    private TrackSelectionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.exoplayer2.Tracks buildTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r3, com.google.android.exoplayer2.trackselection.TrackSelection[] r4) {
            int r0 = r4.length
            java.util.List[] r0 = new java.util.List[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            if (r2 == 0) goto L10
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            goto L14
        L10:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
        L14:
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L19:
            com.google.android.exoplayer2.Tracks r3 = buildTracks(r3, r0)
            return r3
    }

    public static com.google.android.exoplayer2.Tracks buildTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r16, java.util.List<? extends com.google.android.exoplayer2.trackselection.TrackSelection>[] r17) {
            r0 = r16
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            r2 = 0
            r3 = 0
        L9:
            int r4 = r16.getRendererCount()
            if (r3 >= r4) goto L70
            com.google.android.exoplayer2.source.TrackGroupArray r4 = r0.getTrackGroups(r3)
            r5 = r17[r3]
            r6 = 0
        L16:
            int r7 = r4.length
            if (r6 >= r7) goto L6d
            com.google.android.exoplayer2.source.TrackGroup r7 = r4.get(r6)
            int r8 = r0.getAdaptiveSupport(r3, r6, r2)
            r9 = 1
            if (r8 == 0) goto L27
            r8 = 1
            goto L28
        L27:
            r8 = 0
        L28:
            int r10 = r7.length
            int[] r11 = new int[r10]
            boolean[] r10 = new boolean[r10]
            r12 = 0
        L2f:
            int r13 = r7.length
            if (r12 >= r13) goto L62
            int r13 = r0.getTrackSupport(r3, r6, r12)
            r11[r12] = r13
            r13 = 0
        L3a:
            int r14 = r5.size()
            if (r13 >= r14) goto L5c
            java.lang.Object r14 = r5.get(r13)
            com.google.android.exoplayer2.trackselection.TrackSelection r14 = (com.google.android.exoplayer2.trackselection.TrackSelection) r14
            com.google.android.exoplayer2.source.TrackGroup r15 = r14.getTrackGroup()
            boolean r15 = r15.equals(r7)
            if (r15 == 0) goto L59
            int r14 = r14.indexOf(r12)
            r15 = -1
            if (r14 == r15) goto L59
            r13 = 1
            goto L5d
        L59:
            int r13 = r13 + 1
            goto L3a
        L5c:
            r13 = 0
        L5d:
            r10[r12] = r13
            int r12 = r12 + 1
            goto L2f
        L62:
            com.google.android.exoplayer2.Tracks$Group r9 = new com.google.android.exoplayer2.Tracks$Group
            r9.<init>(r7, r8, r11, r10)
            r1.add(r9)
            int r6 = r6 + 1
            goto L16
        L6d:
            int r3 = r3 + 1
            goto L9
        L70:
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r16.getUnmappedTrackGroups()
            r3 = 0
        L75:
            int r4 = r0.length
            if (r3 >= r4) goto L93
            com.google.android.exoplayer2.source.TrackGroup r4 = r0.get(r3)
            int r5 = r4.length
            int[] r5 = new int[r5]
            java.util.Arrays.fill(r5, r2)
            int r6 = r4.length
            boolean[] r6 = new boolean[r6]
            com.google.android.exoplayer2.Tracks$Group r7 = new com.google.android.exoplayer2.Tracks$Group
            r7.<init>(r4, r2, r5, r6)
            r1.add(r7)
            int r3 = r3 + 1
            goto L75
        L93:
            com.google.android.exoplayer2.Tracks r0 = new com.google.android.exoplayer2.Tracks
            com.google.common.collect.ImmutableList r1 = r1.build()
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(com.google.android.exoplayer2.trackselection.ExoTrackSelection r7) {
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r7.length()
            r3 = 0
            r4 = 0
            r5 = 0
        Lb:
            if (r4 >= r2) goto L18
            boolean r6 = r7.isBlacklisted(r4, r0)
            if (r6 == 0) goto L15
            int r5 = r5 + 1
        L15:
            int r4 = r4 + 1
            goto Lb
        L18:
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r7 = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions
            r0 = 1
            r7.<init>(r0, r3, r2, r5)
            return r7
    }

    public static com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelectionsForDefinitions(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] r8, com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory r9) {
            int r0 = r8.length
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r0 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L6:
            int r4 = r8.length
            if (r2 >= r4) goto L2e
            r4 = r8[r2]
            r5 = 1
            if (r4 != 0) goto Lf
            goto L2b
        Lf:
            int[] r6 = r4.tracks
            int r7 = r6.length
            if (r7 <= r5) goto L1e
            if (r3 != 0) goto L1e
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r3 = r9.createAdaptiveTrackSelection(r4)
            r0[r2] = r3
            r3 = 1
            goto L2b
        L1e:
            com.google.android.exoplayer2.trackselection.FixedTrackSelection r5 = new com.google.android.exoplayer2.trackselection.FixedTrackSelection
            com.google.android.exoplayer2.source.TrackGroup r7 = r4.group
            r6 = r6[r1]
            int r4 = r4.type
            r5.<init>(r7, r6, r4)
            r0[r2] = r5
        L2b:
            int r2 = r2 + 1
            goto L6
        L2e:
            return r0
    }

    public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters updateParametersWithOverride(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r0, int r1, com.google.android.exoplayer2.source.TrackGroupArray r2, boolean r3, @androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride r4) {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.buildUpon()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.clearSelectionOverrides(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$Builder r0 = r0.setRendererDisabled(r1, r3)
            if (r4 == 0) goto L11
            r0.setSelectionOverride(r1, r2, r4)
        L11:
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r0 = r0.build()
            return r0
    }
}
