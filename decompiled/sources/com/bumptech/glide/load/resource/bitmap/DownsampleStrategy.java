package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DownsampleStrategy {
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy AT_LEAST = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy AT_MOST = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy CENTER_INSIDE = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy CENTER_OUTSIDE = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy DEFAULT = null;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy FIT_CENTER = null;
    public static final boolean IS_BITMAP_FACTORY_SCALING_SUPPORTED = false;
    public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy NONE = null;
    public static final com.bumptech.glide.load.Option<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> OPTION = null;

    /* JADX INFO: loaded from: classes2.dex */
    public static class AtLeast extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        public AtLeast() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int r1, int r2, int r3, int r4) {
                r0 = this;
                int r2 = r2 / r4
                int r1 = r1 / r3
                int r1 = java.lang.Math.min(r2, r1)
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 != 0) goto Lb
                goto L11
            Lb:
                int r1 = java.lang.Integer.highestOneBit(r1)
                float r1 = (float) r1
                float r2 = r2 / r1
            L11:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class AtMost extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        public AtMost() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int r1, int r2, int r3, int r4) {
                r0 = this;
                float r2 = (float) r2
                float r4 = (float) r4
                float r2 = r2 / r4
                float r1 = (float) r1
                float r3 = (float) r3
                float r1 = r1 / r3
                float r1 = java.lang.Math.max(r2, r1)
                double r1 = (double) r1
                double r1 = java.lang.Math.ceil(r1)
                int r1 = (int) r1
                int r2 = java.lang.Integer.highestOneBit(r1)
                r3 = 1
                int r2 = java.lang.Math.max(r3, r2)
                if (r2 >= r1) goto L1c
                goto L1d
            L1c:
                r3 = 0
            L1d:
                int r1 = r2 << r3
                r2 = 1065353216(0x3f800000, float:1.0)
                float r1 = (float) r1
                float r2 = r2 / r1
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CenterInside extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        public CenterInside() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r3, int r4, int r5, int r6) {
                r2 = this;
                float r0 = r2.getScaleFactor(r3, r4, r5, r6)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Ld
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r3 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                goto L13
            Ld:
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.FIT_CENTER
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r3 = r0.getSampleSizeRounding(r3, r4, r5, r6)
            L13:
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int r2, int r3, int r4, int r5) {
                r1 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.FIT_CENTER
                float r2 = r0.getScaleFactor(r2, r3, r4, r5)
                r3 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.min(r3, r2)
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class CenterOutside extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        public CenterOutside() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int r1, int r2, int r3, int r4) {
                r0 = this;
                float r3 = (float) r3
                float r1 = (float) r1
                float r3 = r3 / r1
                float r1 = (float) r4
                float r2 = (float) r2
                float r1 = r1 / r2
                float r1 = java.lang.Math.max(r3, r1)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class FitCenter extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        public FitCenter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r1, int r2, int r3, int r4) {
                r0 = this;
                boolean r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.IS_BITMAP_FACTORY_SCALING_SUPPORTED
                if (r1 == 0) goto L7
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
            L7:
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.IS_BITMAP_FACTORY_SCALING_SUPPORTED
                if (r0 == 0) goto Lf
                float r4 = (float) r4
                float r2 = (float) r2
                float r4 = r4 / r2
                float r2 = (float) r5
                float r3 = (float) r3
                float r2 = r2 / r3
                float r2 = java.lang.Math.min(r4, r2)
                return r2
            Lf:
                int r3 = r3 / r5
                int r2 = r2 / r4
                int r2 = java.lang.Math.max(r3, r2)
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 != 0) goto L1a
                goto L20
            L1a:
                int r2 = java.lang.Integer.highestOneBit(r2)
                float r2 = (float) r2
                float r3 = r3 / r2
            L20:
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class None extends com.bumptech.glide.load.resource.bitmap.DownsampleStrategy {
        public None() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r1, int r2, int r3, int r4) {
                r0 = this;
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY
                return r1
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float getScaleFactor(int r1, int r2, int r3, int r4) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum SampleSizeRounding extends java.lang.Enum<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding> {
        private static final /* synthetic */ com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[] $VALUES = null;
        public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding MEMORY = null;
        public static final com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding QUALITY = null;

        static {
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding
                java.lang.String r1 = "MEMORY"
                r2 = 0
                r0.<init>(r1, r2)
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.MEMORY = r0
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding
                java.lang.String r3 = "QUALITY"
                r4 = 1
                r1.<init>(r3, r4)
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.QUALITY = r1
                r3 = 2
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding[] r3 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.$VALUES = r3
                return
        }

        private SampleSizeRounding(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding valueOf(java.lang.String r1) {
                java.lang.Class<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding r1 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding) r1
                return r1
        }

        public static com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[] values() {
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding[] r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding.$VALUES
                java.lang.Object r0 = r0.clone()
                com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding[] r0 = (com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding[]) r0
                return r0
        }
    }

    static {
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$AtLeast r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$AtLeast
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.AT_LEAST = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$AtMost r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$AtMost
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.AT_MOST = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$FitCenter r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$FitCenter
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.FIT_CENTER = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$CenterInside r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$CenterInside
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_INSIDE = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$CenterOutside r0 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$CenterOutside
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.CENTER_OUTSIDE = r0
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$None r1 = new com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$None
            r1.<init>()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.NONE = r1
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.DEFAULT = r0
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"
            com.bumptech.glide.load.Option r0 = com.bumptech.glide.load.Option.memory(r1, r0)
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.OPTION = r0
            r0 = 1
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.IS_BITMAP_FACTORY_SCALING_SUPPORTED = r0
            return
    }

    public DownsampleStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding getSampleSizeRounding(int r1, int r2, int r3, int r4);

    public abstract float getScaleFactor(int r1, int r2, int r3, int r4);
}
