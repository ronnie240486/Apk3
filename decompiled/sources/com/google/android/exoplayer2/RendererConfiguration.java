package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
public final class RendererConfiguration {
    public static final com.google.android.exoplayer2.RendererConfiguration DEFAULT = null;
    public final boolean tunneling;

    static {
            com.google.android.exoplayer2.RendererConfiguration r0 = new com.google.android.exoplayer2.RendererConfiguration
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.RendererConfiguration.DEFAULT = r0
            return
    }

    public RendererConfiguration(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.tunneling = r1
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1b
            java.lang.Class<com.google.android.exoplayer2.RendererConfiguration> r2 = com.google.android.exoplayer2.RendererConfiguration.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1b
        L10:
            com.google.android.exoplayer2.RendererConfiguration r5 = (com.google.android.exoplayer2.RendererConfiguration) r5
            boolean r2 = r4.tunneling
            boolean r5 = r5.tunneling
            if (r2 != r5) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            return r1
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.tunneling
            r0 = r0 ^ 1
            return r0
    }
}
