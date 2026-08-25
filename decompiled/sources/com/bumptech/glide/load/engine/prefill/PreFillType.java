package com.bumptech.glide.load.engine.prefill;

/* JADX INFO: loaded from: classes.dex */
public final class PreFillType {
    private final android.graphics.Bitmap.Config config;
    private final int height;
    private final int weight;
    private final int width;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        private android.graphics.Bitmap.Config config;
        private final int height;
        private int weight;
        private final int width;

        public Builder(int r1) {
                r0 = this;
                r0.<init>(r1, r1)
                return
        }

        public Builder(int r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.weight = r0
                if (r2 <= 0) goto L17
                if (r3 <= 0) goto Lf
                r1.width = r2
                r1.height = r3
                return
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Height must be > 0"
                r2.<init>(r3)
                throw r2
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Width must be > 0"
                r2.<init>(r3)
                throw r2
        }

        public final com.bumptech.glide.load.engine.prefill.PreFillType build() {
                r5 = this;
                com.bumptech.glide.load.engine.prefill.PreFillType r0 = new com.bumptech.glide.load.engine.prefill.PreFillType
                int r1 = r5.width
                int r2 = r5.height
                android.graphics.Bitmap$Config r3 = r5.config
                int r4 = r5.weight
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public final android.graphics.Bitmap.Config getConfig() {
                r1 = this;
                android.graphics.Bitmap$Config r0 = r1.config
                return r0
        }

        public com.bumptech.glide.load.engine.prefill.PreFillType.Builder setConfig(@androidx.annotation.Nullable android.graphics.Bitmap.Config r1) {
                r0 = this;
                r0.config = r1
                return r0
        }

        public com.bumptech.glide.load.engine.prefill.PreFillType.Builder setWeight(int r2) {
                r1 = this;
                if (r2 <= 0) goto L5
                r1.weight = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Weight must be > 0"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            return
    }

    public PreFillType(int r2, int r3, android.graphics.Bitmap.Config r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Config must not be null"
            java.lang.Object r4 = com.bumptech.glide.util.Preconditions.checkNotNull(r4, r0)
            android.graphics.Bitmap$Config r4 = (android.graphics.Bitmap.Config) r4
            r1.config = r4
            r1.width = r2
            r1.height = r3
            r1.weight = r5
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.engine.prefill.PreFillType
            r1 = 0
            if (r0 == 0) goto L20
            com.bumptech.glide.load.engine.prefill.PreFillType r4 = (com.bumptech.glide.load.engine.prefill.PreFillType) r4
            int r0 = r3.height
            int r2 = r4.height
            if (r0 != r2) goto L20
            int r0 = r3.width
            int r2 = r4.width
            if (r0 != r2) goto L20
            int r0 = r3.weight
            int r2 = r4.weight
            if (r0 != r2) goto L20
            android.graphics.Bitmap$Config r0 = r3.config
            android.graphics.Bitmap$Config r4 = r4.config
            if (r0 != r4) goto L20
            r1 = 1
        L20:
            return r1
    }

    public final android.graphics.Bitmap.Config getConfig() {
            r1 = this;
            android.graphics.Bitmap$Config r0 = r1.config
            return r0
    }

    public final int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public final int getWeight() {
            r1 = this;
            int r0 = r1.weight
            return r0
    }

    public final int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.width
            int r0 = r0 * 31
            int r1 = r2.height
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.graphics.Bitmap$Config r1 = r2.config
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.weight
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PreFillSize{width="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.width
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r3.height
            r0.append(r1)
            java.lang.String r1 = ", config="
            r0.append(r1)
            android.graphics.Bitmap$Config r1 = r3.config
            r0.append(r1)
            java.lang.String r1 = ", weight="
            r0.append(r1)
            int r1 = r3.weight
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
