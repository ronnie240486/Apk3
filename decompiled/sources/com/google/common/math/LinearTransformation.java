package com.google.common.math;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
public abstract class LinearTransformation {

    /* JADX INFO: renamed from: com.google.common.math.LinearTransformation$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class LinearTransformationBuilder {
        private final double x1;
        private final double y1;

        private LinearTransformationBuilder(double r1, double r3) {
                r0 = this;
                r0.<init>()
                r0.x1 = r1
                r0.y1 = r3
                return
        }

        public /* synthetic */ LinearTransformationBuilder(double r1, double r3, com.google.common.math.LinearTransformation.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r3)
                return
        }

        public com.google.common.math.LinearTransformation and(double r6, double r8) {
                r5 = this;
                boolean r0 = com.google.common.math.DoubleUtils.isFinite(r6)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L10
                boolean r0 = com.google.common.math.DoubleUtils.isFinite(r8)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.common.base.Preconditions.checkArgument(r0)
                double r3 = r5.x1
                int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r0 != 0) goto L2d
                double r6 = r5.y1
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 == 0) goto L21
                goto L22
            L21:
                r1 = 0
            L22:
                com.google.common.base.Preconditions.checkArgument(r1)
                com.google.common.math.LinearTransformation$VerticalLinearTransformation r6 = new com.google.common.math.LinearTransformation$VerticalLinearTransformation
                double r7 = r5.x1
                r6.<init>(r7)
                return r6
            L2d:
                double r0 = r5.y1
                double r8 = r8 - r0
                double r6 = r6 - r3
                double r8 = r8 / r6
                com.google.common.math.LinearTransformation r6 = r5.withSlope(r8)
                return r6
        }

        public com.google.common.math.LinearTransformation withSlope(double r5) {
                r4 = this;
                boolean r0 = java.lang.Double.isNaN(r5)
                r0 = r0 ^ 1
                com.google.common.base.Preconditions.checkArgument(r0)
                boolean r0 = com.google.common.math.DoubleUtils.isFinite(r5)
                if (r0 == 0) goto L1c
                double r0 = r4.y1
                double r2 = r4.x1
                double r2 = r2 * r5
                double r0 = r0 - r2
                com.google.common.math.LinearTransformation$RegularLinearTransformation r2 = new com.google.common.math.LinearTransformation$RegularLinearTransformation
                r2.<init>(r5, r0)
                return r2
            L1c:
                com.google.common.math.LinearTransformation$VerticalLinearTransformation r5 = new com.google.common.math.LinearTransformation$VerticalLinearTransformation
                double r0 = r4.x1
                r5.<init>(r0)
                return r5
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class NaNLinearTransformation extends com.google.common.math.LinearTransformation {
        public static final com.google.common.math.LinearTransformation.NaNLinearTransformation INSTANCE = null;

        static {
                com.google.common.math.LinearTransformation$NaNLinearTransformation r0 = new com.google.common.math.LinearTransformation$NaNLinearTransformation
                r0.<init>()
                com.google.common.math.LinearTransformation.NaNLinearTransformation.INSTANCE = r0
                return
        }

        private NaNLinearTransformation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.math.LinearTransformation
        public com.google.common.math.LinearTransformation inverse() {
                r0 = this;
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
                r2 = this;
                r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "NaN"
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double r1) {
                r0 = this;
                r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
                return r1
        }
    }

    public static final class RegularLinearTransformation extends com.google.common.math.LinearTransformation {

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public com.google.common.math.LinearTransformation inverse;
        public final double slope;
        public final double yIntercept;

        public RegularLinearTransformation(double r1, double r3) {
                r0 = this;
                r0.<init>()
                r0.slope = r1
                r0.yIntercept = r3
                r1 = 0
                r0.inverse = r1
                return
        }

        public RegularLinearTransformation(double r1, double r3, com.google.common.math.LinearTransformation r5) {
                r0 = this;
                r0.<init>()
                r0.slope = r1
                r0.yIntercept = r3
                r0.inverse = r5
                return
        }

        private com.google.common.math.LinearTransformation createInverse() {
                r11 = this;
                double r0 = r11.slope
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1b
                com.google.common.math.LinearTransformation$RegularLinearTransformation r2 = new com.google.common.math.LinearTransformation$RegularLinearTransformation
                r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r6 = r3 / r0
                r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                double r8 = r11.yIntercept
                double r8 = r8 * r3
                double r8 = r8 / r0
                r5 = r2
                r10 = r11
                r5.<init>(r6, r8, r10)
                return r2
            L1b:
                com.google.common.math.LinearTransformation$VerticalLinearTransformation r0 = new com.google.common.math.LinearTransformation$VerticalLinearTransformation
                double r1 = r11.yIntercept
                r0.<init>(r1, r11)
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public com.google.common.math.LinearTransformation inverse() {
                r1 = this;
                com.google.common.math.LinearTransformation r0 = r1.inverse
                if (r0 != 0) goto La
                com.google.common.math.LinearTransformation r0 = r1.createInverse()
                r1.inverse = r0
            La:
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
                r5 = this;
                double r0 = r5.slope
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
                r2 = this;
                double r0 = r2.slope
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                double r1 = r3.slope
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                double r1 = r3.yIntercept
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = "y = %g * x + %g"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double r3) {
                r2 = this;
                double r0 = r2.slope
                double r3 = r3 * r0
                double r0 = r2.yIntercept
                double r3 = r3 + r0
                return r3
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class VerticalLinearTransformation extends com.google.common.math.LinearTransformation {

        @javax.annotation.CheckForNull
        @com.google.errorprone.annotations.concurrent.LazyInit
        public com.google.common.math.LinearTransformation inverse;
        public final double x;

        public VerticalLinearTransformation(double r1) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r1 = 0
                r0.inverse = r1
                return
        }

        public VerticalLinearTransformation(double r1, com.google.common.math.LinearTransformation r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.inverse = r3
                return
        }

        private com.google.common.math.LinearTransformation createInverse() {
                r7 = this;
                com.google.common.math.LinearTransformation$RegularLinearTransformation r6 = new com.google.common.math.LinearTransformation$RegularLinearTransformation
                double r3 = r7.x
                r1 = 0
                r0 = r6
                r5 = r7
                r0.<init>(r1, r3, r5)
                return r6
        }

        @Override // com.google.common.math.LinearTransformation
        public com.google.common.math.LinearTransformation inverse() {
                r1 = this;
                com.google.common.math.LinearTransformation r0 = r1.inverse
                if (r0 != 0) goto La
                com.google.common.math.LinearTransformation r0 = r1.createInverse()
                r1.inverse = r0
            La:
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                double r1 = r3.x
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = "x = %g"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double r1) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }
    }

    public LinearTransformation() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.math.LinearTransformation forNaN() {
            com.google.common.math.LinearTransformation$NaNLinearTransformation r0 = com.google.common.math.LinearTransformation.NaNLinearTransformation.INSTANCE
            return r0
    }

    public static com.google.common.math.LinearTransformation horizontal(double r3) {
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r3)
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.math.LinearTransformation$RegularLinearTransformation r0 = new com.google.common.math.LinearTransformation$RegularLinearTransformation
            r1 = 0
            r0.<init>(r1, r3)
            return r0
    }

    public static com.google.common.math.LinearTransformation.LinearTransformationBuilder mapping(double r7, double r9) {
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r7)
            if (r0 == 0) goto Le
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r9)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.math.LinearTransformation$LinearTransformationBuilder r0 = new com.google.common.math.LinearTransformation$LinearTransformationBuilder
            r6 = 0
            r1 = r0
            r2 = r7
            r4 = r9
            r1.<init>(r2, r4, r6)
            return r0
    }

    public static com.google.common.math.LinearTransformation vertical(double r1) {
            boolean r0 = com.google.common.math.DoubleUtils.isFinite(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.math.LinearTransformation$VerticalLinearTransformation r0 = new com.google.common.math.LinearTransformation$VerticalLinearTransformation
            r0.<init>(r1)
            return r0
    }

    public abstract com.google.common.math.LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double r1);
}
