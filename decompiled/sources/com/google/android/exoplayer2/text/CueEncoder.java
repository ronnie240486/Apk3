package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueEncoder {
    public CueEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public byte[] encode(java.util.List<com.google.android.exoplayer2.text.Cue> r3) {
            r2 = this;
            java.util.ArrayList r3 = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "c"
            r0.putParcelableArrayList(r1, r3)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r3.writeBundle(r0)
            byte[] r0 = r3.marshall()
            r3.recycle()
            return r0
    }
}
