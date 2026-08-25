package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceInfo implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.DeviceInfo> CREATOR = null;
    private static final java.lang.String FIELD_MAX_VOLUME = null;
    private static final java.lang.String FIELD_MIN_VOLUME = null;
    private static final java.lang.String FIELD_PLAYBACK_TYPE = null;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public static final com.google.android.exoplayer2.DeviceInfo UNKNOWN = null;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    /* JADX INFO: renamed from: $r8$lambda$iQsloj_4D2Wt-i6kKeGf2fATGb0, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.DeviceInfo m147$r8$lambda$iQsloj_4D2Wti6kKeGf2fATGb0(android.os.Bundle r0) {
            com.google.android.exoplayer2.DeviceInfo r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.DeviceInfo r0 = new com.google.android.exoplayer2.DeviceInfo
            r1 = 0
            r0.<init>(r1, r1, r1)
            com.google.android.exoplayer2.DeviceInfo.UNKNOWN = r0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r1)
            com.google.android.exoplayer2.DeviceInfo.FIELD_PLAYBACK_TYPE = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.DeviceInfo.FIELD_MIN_VOLUME = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.DeviceInfo.FIELD_MAX_VOLUME = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$2
            com.google.android.exoplayer2.DeviceInfo.CREATOR = r0
            return
    }

    public DeviceInfo(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.playbackType = r1
            r0.minVolume = r2
            r0.maxVolume = r3
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.DeviceInfo lambda$static$0(android.os.Bundle r4) {
            java.lang.String r0 = com.google.android.exoplayer2.DeviceInfo.FIELD_PLAYBACK_TYPE
            r1 = 0
            int r0 = r4.getInt(r0, r1)
            java.lang.String r2 = com.google.android.exoplayer2.DeviceInfo.FIELD_MIN_VOLUME
            int r2 = r4.getInt(r2, r1)
            java.lang.String r3 = com.google.android.exoplayer2.DeviceInfo.FIELD_MAX_VOLUME
            int r4 = r4.getInt(r3, r1)
            com.google.android.exoplayer2.DeviceInfo r1 = new com.google.android.exoplayer2.DeviceInfo
            r1.<init>(r0, r2, r4)
            return r1
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.exoplayer2.DeviceInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.exoplayer2.DeviceInfo r5 = (com.google.android.exoplayer2.DeviceInfo) r5
            int r1 = r4.playbackType
            int r3 = r5.playbackType
            if (r1 != r3) goto L1f
            int r1 = r4.minVolume
            int r3 = r5.minVolume
            if (r1 != r3) goto L1f
            int r1 = r4.maxVolume
            int r5 = r5.maxVolume
            if (r1 != r5) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.playbackType
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.minVolume
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.maxVolume
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.DeviceInfo.FIELD_PLAYBACK_TYPE
            int r2 = r3.playbackType
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.DeviceInfo.FIELD_MIN_VOLUME
            int r2 = r3.minVolume
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.DeviceInfo.FIELD_MAX_VOLUME
            int r2 = r3.maxVolume
            r0.putInt(r1, r2)
            return r0
    }
}
