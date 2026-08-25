package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueDecoder {
    public CueDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> decode(byte[] r4) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r4.length
            r2 = 0
            r0.unmarshall(r4, r2, r1)
            r0.setDataPosition(r2)
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Bundle r4 = r0.readBundle(r4)
            r0.recycle()
            java.lang.String r0 = "c"
            java.util.ArrayList r4 = r4.getParcelableArrayList(r0)
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.text.Cue> r0 = com.google.android.exoplayer2.text.Cue.CREATOR
            com.google.common.collect.ImmutableList r4 = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(r0, r4)
            return r4
    }
}
