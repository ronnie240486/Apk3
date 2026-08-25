package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class AuxEffectInfo {
    public static final int NO_AUX_EFFECT_ID = 0;
    public final int effectId;
    public final float sendLevel;

    public AuxEffectInfo(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.effectId = r1
            r0.sendLevel = r2
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<com.google.android.exoplayer2.audio.AuxEffectInfo> r2 = com.google.android.exoplayer2.audio.AuxEffectInfo.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.exoplayer2.audio.AuxEffectInfo r5 = (com.google.android.exoplayer2.audio.AuxEffectInfo) r5
            int r2 = r4.effectId
            int r3 = r5.effectId
            if (r2 != r3) goto L23
            float r5 = r5.sendLevel
            float r2 = r4.sendLevel
            int r5 = java.lang.Float.compare(r5, r2)
            if (r5 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.effectId
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            float r0 = r2.sendLevel
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 + r1
            return r0
    }
}
