package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class SimpleTarget<Z> extends com.bumptech.glide.request.target.BaseTarget<Z> {
    private final int height;
    private final int width;

    public SimpleTarget() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.<init>(r0, r0)
            return
    }

    public SimpleTarget(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r4) {
            r3 = this;
            int r0 = r3.width
            int r1 = r3.height
            boolean r0 = com.bumptech.glide.util.Util.isValidDimensions(r0, r1)
            if (r0 == 0) goto L12
            int r0 = r3.width
            int r1 = r3.height
            r4.onSizeReady(r0, r1)
            return
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.width
            r0.append(r1)
            java.lang.String r1 = " and height: "
            r0.append(r1)
            int r1 = r3.height
            java.lang.String r2 = ", either provide dimensions in the constructor or call override()"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r4.<init>(r0)
            throw r4
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@androidx.annotation.NonNull com.bumptech.glide.request.target.SizeReadyCallback r1) {
            r0 = this;
            return
    }
}
