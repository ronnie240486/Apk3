package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Buffer {
    private int flags;

    public Buffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void addFlag(int r2) {
            r1 = this;
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.flags = r0
            return
    }

    public final void clearFlag(int r2) {
            r1 = this;
            int r0 = r1.flags
            int r2 = ~r2
            r2 = r2 & r0
            r1.flags = r2
            return
    }

    public final boolean getFlag(int r2) {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public final boolean hasSupplementalData() {
            r1 = this;
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r1.getFlag(r0)
            return r0
    }

    public final boolean isDecodeOnly() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = r1.getFlag(r0)
            return r0
    }

    public final boolean isEndOfStream() {
            r1 = this;
            r0 = 4
            boolean r0 = r1.getFlag(r0)
            return r0
    }

    public final boolean isFirstSample() {
            r1 = this;
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r0 = r1.getFlag(r0)
            return r0
    }

    public final boolean isKeyFrame() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.getFlag(r0)
            return r0
    }

    public final void setFlags(int r1) {
            r0 = this;
            r0.flags = r1
            return
    }
}
