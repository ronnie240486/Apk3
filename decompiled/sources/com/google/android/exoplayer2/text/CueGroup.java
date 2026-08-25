package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.text.CueGroup> CREATOR = null;
    public static final com.google.android.exoplayer2.text.CueGroup EMPTY_TIME_ZERO = null;
    private static final java.lang.String FIELD_CUES = null;
    private static final java.lang.String FIELD_PRESENTATION_TIME_US = null;
    public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> cues;
    public final long presentationTimeUs;

    public static /* synthetic */ com.google.android.exoplayer2.text.CueGroup $r8$lambda$QmrY7VSakfIANItYKyEXt6trkis(android.os.Bundle r0) {
            com.google.android.exoplayer2.text.CueGroup r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.text.CueGroup r0 = new com.google.android.exoplayer2.text.CueGroup
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.exoplayer2.text.CueGroup.EMPTY_TIME_ZERO = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.CueGroup.FIELD_CUES = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.CueGroup.FIELD_PRESENTATION_TIME_US = r0
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$22
            com.google.android.exoplayer2.text.CueGroup.CREATOR = r0
            return
    }

    public CueGroup(java.util.List<com.google.android.exoplayer2.text.Cue> r1, long r2) {
            r0 = this;
            r0.<init>()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            r0.cues = r1
            r0.presentationTimeUs = r2
            return
    }

    private static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> filterOutBitmapCues(java.util.List<com.google.android.exoplayer2.text.Cue> r3) {
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r1 = 0
        L5:
            int r2 = r3.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r3.get(r1)
            com.google.android.exoplayer2.text.Cue r2 = (com.google.android.exoplayer2.text.Cue) r2
            android.graphics.Bitmap r2 = r2.bitmap
            if (r2 == 0) goto L16
            goto L1f
        L16:
            java.lang.Object r2 = r3.get(r1)
            com.google.android.exoplayer2.text.Cue r2 = (com.google.android.exoplayer2.text.Cue) r2
            r0.add(r2)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            com.google.common.collect.ImmutableList r3 = r0.build()
            return r3
    }

    private static final com.google.android.exoplayer2.text.CueGroup fromBundle(android.os.Bundle r3) {
            java.lang.String r0 = com.google.android.exoplayer2.text.CueGroup.FIELD_CUES
            java.util.ArrayList r0 = r3.getParcelableArrayList(r0)
            if (r0 != 0) goto Ld
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L13
        Ld:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.text.Cue> r1 = com.google.android.exoplayer2.text.Cue.CREATOR
            com.google.common.collect.ImmutableList r0 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r1, r0)
        L13:
            java.lang.String r1 = com.google.android.exoplayer2.text.CueGroup.FIELD_PRESENTATION_TIME_US
            long r1 = r3.getLong(r1)
            com.google.android.exoplayer2.text.CueGroup r3 = new com.google.android.exoplayer2.text.CueGroup
            r3.<init>(r0, r1)
            return r3
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.text.CueGroup.FIELD_CUES
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> r2 = r4.cues
            com.google.common.collect.ImmutableList r2 = filterOutBitmapCues(r2)
            java.util.ArrayList r2 = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(r2)
            r0.putParcelableArrayList(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.CueGroup.FIELD_PRESENTATION_TIME_US
            long r2 = r4.presentationTimeUs
            r0.putLong(r1, r2)
            return r0
    }
}
