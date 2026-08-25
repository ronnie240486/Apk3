package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public class DrawableCrossFadeFactory implements com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> {
    private final int duration;
    private final boolean isCrossFadeEnabled;
    private com.bumptech.glide.request.transition.DrawableCrossFadeTransition resourceTransition;

    public static class Builder {
        private static final int DEFAULT_DURATION_MS = 300;
        private final int durationMillis;
        private boolean isCrossFadeEnabled;

        public Builder() {
                r1 = this;
                r0 = 300(0x12c, float:4.2E-43)
                r1.<init>(r0)
                return
        }

        public Builder(int r1) {
                r0 = this;
                r0.<init>()
                r0.durationMillis = r1
                return
        }

        public com.bumptech.glide.request.transition.DrawableCrossFadeFactory build() {
                r3 = this;
                com.bumptech.glide.request.transition.DrawableCrossFadeFactory r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory
                int r1 = r3.durationMillis
                boolean r2 = r3.isCrossFadeEnabled
                r0.<init>(r1, r2)
                return r0
        }

        public com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder setCrossFadeEnabled(boolean r1) {
                r0 = this;
                r0.isCrossFadeEnabled = r1
                return r0
        }
    }

    public DrawableCrossFadeFactory(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.duration = r1
            r0.isCrossFadeEnabled = r2
            return
    }

    private com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> getResourceTransition() {
            r3 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeTransition r0 = r3.resourceTransition
            if (r0 != 0) goto Lf
            com.bumptech.glide.request.transition.DrawableCrossFadeTransition r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeTransition
            int r1 = r3.duration
            boolean r2 = r3.isCrossFadeEnabled
            r0.<init>(r1, r2)
            r3.resourceTransition = r0
        Lf:
            com.bumptech.glide.request.transition.DrawableCrossFadeTransition r0 = r3.resourceTransition
            return r0
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> build(com.bumptech.glide.load.DataSource r1, boolean r2) {
            r0 = this;
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            if (r1 != r2) goto L9
            com.bumptech.glide.request.transition.Transition r1 = com.bumptech.glide.request.transition.NoTransition.get()
            goto Ld
        L9:
            com.bumptech.glide.request.transition.Transition r1 = r0.getResourceTransition()
        Ld:
            return r1
    }
}
