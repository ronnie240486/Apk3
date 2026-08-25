package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class DashManifest implements com.google.android.exoplayer2.offline.FilterableManifest<com.google.android.exoplayer2.source.dash.manifest.DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;

    @androidx.annotation.Nullable
    public final android.net.Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> periods;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.dash.manifest.ProgramInformation programInformation;
    public final long publishTimeMs;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement utcTiming;

    public DashManifest(long r4, long r6, long r8, boolean r10, long r11, long r13, long r15, long r17, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.ProgramInformation r19, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r20, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r21, @androidx.annotation.Nullable android.net.Uri r22, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r23) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.availabilityStartTimeMs = r1
            r1 = r6
            r0.durationMs = r1
            r1 = r8
            r0.minBufferTimeMs = r1
            r1 = r10
            r0.dynamic = r1
            r1 = r11
            r0.minUpdatePeriodMs = r1
            r1 = r13
            r0.timeShiftBufferDepthMs = r1
            r1 = r15
            r0.suggestedPresentationDelayMs = r1
            r1 = r17
            r0.publishTimeMs = r1
            r1 = r19
            r0.programInformation = r1
            r1 = r20
            r0.utcTiming = r1
            r1 = r22
            r0.location = r1
            r1 = r21
            r0.serviceDescription = r1
            if (r23 != 0) goto L34
            java.util.List r1 = java.util.Collections.emptyList()
            goto L36
        L34:
            r1 = r23
        L36:
            r0.periods = r1
            return
    }

    private static java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> copyAdaptationSets(java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r13, java.util.LinkedList<com.google.android.exoplayer2.offline.StreamKey> r14) {
            java.lang.Object r0 = r14.poll()
            com.google.android.exoplayer2.offline.StreamKey r0 = (com.google.android.exoplayer2.offline.StreamKey) r0
            int r1 = r0.periodIndex
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Ld:
            int r3 = r0.groupIndex
            java.lang.Object r4 = r13.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r4 = (com.google.android.exoplayer2.source.dash.manifest.AdaptationSet) r4
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r5 = r4.representations
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L1c:
            int r0 = r0.streamIndex
            java.lang.Object r0 = r5.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r0
            r9.add(r0)
            java.lang.Object r0 = r14.poll()
            com.google.android.exoplayer2.offline.StreamKey r0 = (com.google.android.exoplayer2.offline.StreamKey) r0
            int r6 = r0.periodIndex
            if (r6 != r1) goto L35
            int r6 = r0.groupIndex
            if (r6 == r3) goto L1c
        L35:
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r3 = new com.google.android.exoplayer2.source.dash.manifest.AdaptationSet
            int r7 = r4.id
            int r8 = r4.type
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r10 = r4.accessibilityDescriptors
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r11 = r4.essentialProperties
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r12 = r4.supplementalProperties
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.add(r3)
            int r3 = r0.periodIndex
            if (r3 == r1) goto Ld
            r14.addFirst(r0)
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final com.google.android.exoplayer2.source.dash.manifest.DashManifest copy(java.util.List<com.google.android.exoplayer2.offline.StreamKey> r26) {
            r25 = this;
            r0 = r25
            java.util.LinkedList r1 = new java.util.LinkedList
            r2 = r26
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            com.google.android.exoplayer2.offline.StreamKey r2 = new com.google.android.exoplayer2.offline.StreamKey
            r3 = -1
            r2.<init>(r3, r3, r3)
            r1.add(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r5 = 0
        L1d:
            int r6 = r25.getPeriodCount()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= r6) goto L59
            java.lang.Object r6 = r1.peek()
            com.google.android.exoplayer2.offline.StreamKey r6 = (com.google.android.exoplayer2.offline.StreamKey) r6
            int r6 = r6.periodIndex
            if (r6 == r5) goto L3c
            long r9 = r0.getPeriodDurationMs(r5)
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L56
            long r3 = r3 + r9
            goto L56
        L3c:
            com.google.android.exoplayer2.source.dash.manifest.Period r6 = r0.getPeriod(r5)
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.AdaptationSet> r7 = r6.adaptationSets
            java.util.ArrayList r12 = copyAdaptationSets(r7, r1)
            com.google.android.exoplayer2.source.dash.manifest.Period r7 = new com.google.android.exoplayer2.source.dash.manifest.Period
            java.lang.String r9 = r6.id
            long r10 = r6.startMs
            long r10 = r10 - r3
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.EventStream> r13 = r6.eventStreams
            r8 = r7
            r8.<init>(r9, r10, r12, r13)
            r2.add(r7)
        L56:
            int r5 = r5 + 1
            goto L1d
        L59:
            long r5 = r0.durationMs
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L61
            long r5 = r5 - r3
            r7 = r5
        L61:
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = new com.google.android.exoplayer2.source.dash.manifest.DashManifest
            r4 = r1
            long r5 = r0.availabilityStartTimeMs
            long r9 = r0.minBufferTimeMs
            boolean r11 = r0.dynamic
            long r12 = r0.minUpdatePeriodMs
            long r14 = r0.timeShiftBufferDepthMs
            r26 = r4
            long r3 = r0.suggestedPresentationDelayMs
            r16 = r3
            long r3 = r0.publishTimeMs
            r18 = r3
            com.google.android.exoplayer2.source.dash.manifest.ProgramInformation r3 = r0.programInformation
            r20 = r3
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r3 = r0.utcTiming
            r21 = r3
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r3 = r0.serviceDescription
            r22 = r3
            android.net.Uri r3 = r0.location
            r23 = r3
            r24 = r2
            r4 = r26
            r4.<init>(r5, r7, r9, r11, r12, r14, r16, r18, r20, r21, r22, r23, r24)
            return r1
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.dash.manifest.DashManifest copy(java.util.List r1) {
            r0 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.copy(r1)
            return r1
    }

    public final com.google.android.exoplayer2.source.dash.manifest.Period getPeriod(int r2) {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r0 = r1.periods
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.source.dash.manifest.Period r2 = (com.google.android.exoplayer2.source.dash.manifest.Period) r2
            return r2
    }

    public final int getPeriodCount() {
            r1 = this;
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r0 = r1.periods
            int r0 = r0.size()
            return r0
    }

    public final long getPeriodDurationMs(int r6) {
            r5 = this;
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r0 = r5.periods
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 != r0) goto L23
            long r3 = r5.durationMs
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L16
            goto L3b
        L16:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r0 = r5.periods
            java.lang.Object r6 = r0.get(r6)
            com.google.android.exoplayer2.source.dash.manifest.Period r6 = (com.google.android.exoplayer2.source.dash.manifest.Period) r6
            long r0 = r6.startMs
            long r1 = r3 - r0
            goto L3b
        L23:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r0 = r5.periods
            int r1 = r6 + 1
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.Period r0 = (com.google.android.exoplayer2.source.dash.manifest.Period) r0
            long r0 = r0.startMs
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Period> r2 = r5.periods
            java.lang.Object r6 = r2.get(r6)
            com.google.android.exoplayer2.source.dash.manifest.Period r6 = (com.google.android.exoplayer2.source.dash.manifest.Period) r6
            long r2 = r6.startMs
            long r1 = r0 - r2
        L3b:
            return r1
    }

    public final long getPeriodDurationUs(int r3) {
            r2 = this;
            long r0 = r2.getPeriodDurationMs(r3)
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            return r0
    }
}
