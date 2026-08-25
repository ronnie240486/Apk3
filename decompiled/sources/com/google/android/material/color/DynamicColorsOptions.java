package com.google.android.material.color;

/* JADX INFO: loaded from: classes2.dex */
public class DynamicColorsOptions {
    private static final com.google.android.material.color.DynamicColors.Precondition ALWAYS_ALLOW = null;
    private static final com.google.android.material.color.DynamicColors.OnAppliedCallback NO_OP_CALLBACK = null;

    @androidx.annotation.Nullable
    private java.lang.Integer contentBasedSeedColor;

    @androidx.annotation.NonNull
    private final com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback;

    @androidx.annotation.NonNull
    private final com.google.android.material.color.DynamicColors.Precondition precondition;

    @androidx.annotation.StyleRes
    private final int themeOverlay;



    public static class Builder {

        @androidx.annotation.Nullable
        private android.graphics.Bitmap contentBasedSource;

        @androidx.annotation.NonNull
        private com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback;

        @androidx.annotation.NonNull
        private com.google.android.material.color.DynamicColors.Precondition precondition;

        @androidx.annotation.StyleRes
        private int themeOverlay;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.material.color.DynamicColors$Precondition r0 = com.google.android.material.color.DynamicColorsOptions.access$400()
                r1.precondition = r0
                com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = com.google.android.material.color.DynamicColorsOptions.access$500()
                r1.onAppliedCallback = r0
                return
        }

        public static /* synthetic */ int access$000(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                int r0 = r0.themeOverlay
                return r0
        }

        public static /* synthetic */ com.google.android.material.color.DynamicColors.Precondition access$100(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                com.google.android.material.color.DynamicColors$Precondition r0 = r0.precondition
                return r0
        }

        public static /* synthetic */ com.google.android.material.color.DynamicColors.OnAppliedCallback access$200(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = r0.onAppliedCallback
                return r0
        }

        public static /* synthetic */ android.graphics.Bitmap access$300(com.google.android.material.color.DynamicColorsOptions.Builder r0) {
                android.graphics.Bitmap r0 = r0.contentBasedSource
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.android.material.color.DynamicColorsOptions build() {
                r2 = this;
                com.google.android.material.color.DynamicColorsOptions r0 = new com.google.android.material.color.DynamicColorsOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public com.google.android.material.color.DynamicColorsOptions.Builder setContentBasedSource(@androidx.annotation.NonNull android.graphics.Bitmap r1) {
                r0 = this;
                r0.contentBasedSource = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.DynamicColorsOptions.Builder setOnAppliedCallback(@androidx.annotation.NonNull com.google.android.material.color.DynamicColors.OnAppliedCallback r1) {
                r0 = this;
                r0.onAppliedCallback = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.DynamicColorsOptions.Builder setPrecondition(@androidx.annotation.NonNull com.google.android.material.color.DynamicColors.Precondition r1) {
                r0 = this;
                r0.precondition = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.material.color.DynamicColorsOptions.Builder setThemeOverlay(@androidx.annotation.StyleRes int r1) {
                r0 = this;
                r0.themeOverlay = r1
                return r0
        }
    }

    static {
            com.google.android.material.color.DynamicColorsOptions$1 r0 = new com.google.android.material.color.DynamicColorsOptions$1
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions.ALWAYS_ALLOW = r0
            com.google.android.material.color.DynamicColorsOptions$2 r0 = new com.google.android.material.color.DynamicColorsOptions$2
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions.NO_OP_CALLBACK = r0
            return
    }

    private DynamicColorsOptions(com.google.android.material.color.DynamicColorsOptions.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$000(r2)
            r1.themeOverlay = r0
            com.google.android.material.color.DynamicColors$Precondition r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$100(r2)
            r1.precondition = r0
            com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$200(r2)
            r1.onAppliedCallback = r0
            android.graphics.Bitmap r0 = com.google.android.material.color.DynamicColorsOptions.Builder.access$300(r2)
            if (r0 == 0) goto L29
            android.graphics.Bitmap r2 = com.google.android.material.color.DynamicColorsOptions.Builder.access$300(r2)
            int r2 = extractSeedColorFromImage(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.contentBasedSeedColor = r2
        L29:
            return
    }

    public /* synthetic */ DynamicColorsOptions(com.google.android.material.color.DynamicColorsOptions.Builder r1, com.google.android.material.color.DynamicColorsOptions.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ com.google.android.material.color.DynamicColors.Precondition access$400() {
            com.google.android.material.color.DynamicColors$Precondition r0 = com.google.android.material.color.DynamicColorsOptions.ALWAYS_ALLOW
            return r0
    }

    public static /* synthetic */ com.google.android.material.color.DynamicColors.OnAppliedCallback access$500() {
            com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = com.google.android.material.color.DynamicColorsOptions.NO_OP_CALLBACK
            return r0
    }

    private static int extractSeedColorFromImage(android.graphics.Bitmap r9) {
            int r6 = r9.getWidth()
            int r7 = r9.getHeight()
            int r0 = r6 * r7
            int[] r8 = new int[r0]
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r3 = r6
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            r9 = 128(0x80, float:1.8E-43)
            java.util.Map r9 = com.google.android.material.color.utilities.QuantizerCelebi.quantize(r8, r9)
            java.util.List r9 = com.google.android.material.color.utilities.Score.score(r9)
            r0 = 0
            java.lang.Object r9 = r9.get(r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            return r9
    }

    @androidx.annotation.Nullable
    public java.lang.Integer getContentBasedSeedColor() {
            r1 = this;
            java.lang.Integer r0 = r1.contentBasedSeedColor
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.DynamicColors.OnAppliedCallback getOnAppliedCallback() {
            r1 = this;
            com.google.android.material.color.DynamicColors$OnAppliedCallback r0 = r1.onAppliedCallback
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.color.DynamicColors.Precondition getPrecondition() {
            r1 = this;
            com.google.android.material.color.DynamicColors$Precondition r0 = r1.precondition
            return r0
    }

    @androidx.annotation.StyleRes
    public int getThemeOverlay() {
            r1 = this;
            int r0 = r1.themeOverlay
            return r0
    }
}
