package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
public class ShapePath {
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @java.lang.Deprecated
    public float currentShadowAngle;

    @java.lang.Deprecated
    public float endShadowAngle;

    @java.lang.Deprecated
    public float endX;

    @java.lang.Deprecated
    public float endY;
    private final java.util.List<com.google.android.material.shape.ShapePath.PathOperation> operations;
    private final java.util.List<com.google.android.material.shape.ShapePath.ShadowCompatOperation> shadowCompatOperations;

    @java.lang.Deprecated
    public float startX;

    @java.lang.Deprecated
    public float startY;


    public static class ArcShadowOperation extends com.google.android.material.shape.ShapePath.ShadowCompatOperation {
        private final com.google.android.material.shape.ShapePath.PathArcOperation operation;

        public ArcShadowOperation(com.google.android.material.shape.ShapePath.PathArcOperation r1) {
                r0 = this;
                r0.<init>()
                r0.operation = r1
                return
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(android.graphics.Matrix r9, @androidx.annotation.NonNull com.google.android.material.shadow.ShadowRenderer r10, int r11, @androidx.annotation.NonNull android.graphics.Canvas r12) {
                r8 = this;
                com.google.android.material.shape.ShapePath$PathArcOperation r0 = r8.operation
                float r6 = com.google.android.material.shape.ShapePath.PathArcOperation.access$800(r0)
                com.google.android.material.shape.ShapePath$PathArcOperation r0 = r8.operation
                float r7 = com.google.android.material.shape.ShapePath.PathArcOperation.access$900(r0)
                android.graphics.RectF r4 = new android.graphics.RectF
                com.google.android.material.shape.ShapePath$PathArcOperation r0 = r8.operation
                float r0 = com.google.android.material.shape.ShapePath.PathArcOperation.access$1000(r0)
                com.google.android.material.shape.ShapePath$PathArcOperation r1 = r8.operation
                float r1 = com.google.android.material.shape.ShapePath.PathArcOperation.access$1100(r1)
                com.google.android.material.shape.ShapePath$PathArcOperation r2 = r8.operation
                float r2 = com.google.android.material.shape.ShapePath.PathArcOperation.access$1200(r2)
                com.google.android.material.shape.ShapePath$PathArcOperation r3 = r8.operation
                float r3 = com.google.android.material.shape.ShapePath.PathArcOperation.access$1300(r3)
                r4.<init>(r0, r1, r2, r3)
                r1 = r10
                r2 = r12
                r3 = r9
                r5 = r11
                r1.drawCornerShadow(r2, r3, r4, r5, r6, r7)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class InnerCornerShadowOperation extends com.google.android.material.shape.ShapePath.ShadowCompatOperation {
        private final com.google.android.material.shape.ShapePath.PathLineOperation operation1;
        private final com.google.android.material.shape.ShapePath.PathLineOperation operation2;
        private final float startX;
        private final float startY;

        public InnerCornerShadowOperation(com.google.android.material.shape.ShapePath.PathLineOperation r1, com.google.android.material.shape.ShapePath.PathLineOperation r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.operation1 = r1
                r0.operation2 = r2
                r0.startX = r3
                r0.startY = r4
                return
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(android.graphics.Matrix r19, com.google.android.material.shadow.ShadowRenderer r20, int r21, android.graphics.Canvas r22) {
                r18 = this;
                r0 = r18
                r1 = r19
                r10 = r20
                r11 = r21
                r12 = r22
                float r8 = r18.getSweepAngle()
                r13 = 0
                int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r2 <= 0) goto L14
                return
            L14:
                com.google.android.material.shape.ShapePath$PathLineOperation r2 = r0.operation1
                float r2 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r2)
                float r3 = r0.startX
                float r2 = r2 - r3
                double r2 = (double) r2
                com.google.android.material.shape.ShapePath$PathLineOperation r4 = r0.operation1
                float r4 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r4)
                float r5 = r0.startY
                float r4 = r4 - r5
                double r4 = (double) r4
                double r2 = java.lang.Math.hypot(r2, r4)
                com.google.android.material.shape.ShapePath$PathLineOperation r4 = r0.operation2
                float r4 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r4)
                com.google.android.material.shape.ShapePath$PathLineOperation r5 = r0.operation1
                float r5 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r5)
                float r4 = r4 - r5
                double r4 = (double) r4
                com.google.android.material.shape.ShapePath$PathLineOperation r6 = r0.operation2
                float r6 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r6)
                com.google.android.material.shape.ShapePath$PathLineOperation r7 = r0.operation1
                float r7 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r7)
                float r6 = r6 - r7
                double r6 = (double) r6
                double r14 = java.lang.Math.hypot(r4, r6)
                double r4 = (double) r11
                double r6 = java.lang.Math.min(r2, r14)
                double r4 = java.lang.Math.min(r4, r6)
                float r4 = (float) r4
                double r5 = (double) r4
                float r7 = -r8
                r9 = 1073741824(0x40000000, float:2.0)
                float r7 = r7 / r9
                double r9 = (double) r7
                double r9 = java.lang.Math.toRadians(r9)
                double r9 = java.lang.Math.tan(r9)
                double r9 = r9 * r5
                int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r7 <= 0) goto L90
                android.graphics.RectF r7 = new android.graphics.RectF
                double r2 = r2 - r9
                float r2 = (float) r2
                r7.<init>(r13, r13, r2, r13)
                android.graphics.Matrix r2 = r0.renderMatrix
                r2.set(r1)
                android.graphics.Matrix r2 = r0.renderMatrix
                float r3 = r0.startX
                float r13 = r0.startY
                r2.preTranslate(r3, r13)
                android.graphics.Matrix r2 = r0.renderMatrix
                float r3 = r18.getStartAngle()
                r2.preRotate(r3)
                android.graphics.Matrix r2 = r0.renderMatrix
                r13 = r20
                r13.drawEdgeShadow(r12, r2, r7, r11)
                goto L92
            L90:
                r13 = r20
            L92:
                android.graphics.RectF r7 = new android.graphics.RectF
                r2 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 * r4
                r3 = 0
                r7.<init>(r3, r3, r2, r2)
                android.graphics.Matrix r3 = r0.renderMatrix
                r3.set(r1)
                android.graphics.Matrix r3 = r0.renderMatrix
                com.google.android.material.shape.ShapePath$PathLineOperation r11 = r0.operation1
                float r11 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r11)
                com.google.android.material.shape.ShapePath$PathLineOperation r12 = r0.operation1
                float r12 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r12)
                r3.preTranslate(r11, r12)
                android.graphics.Matrix r3 = r0.renderMatrix
                float r11 = r18.getStartAngle()
                r3.preRotate(r11)
                android.graphics.Matrix r3 = r0.renderMatrix
                double r11 = -r9
                double r11 = r11 - r5
                float r11 = (float) r11
                r12 = -1073741824(0xffffffffc0000000, float:-2.0)
                float r12 = r12 * r4
                r3.preTranslate(r11, r12)
                android.graphics.Matrix r11 = r0.renderMatrix
                int r12 = (int) r4
                r16 = 1138819072(0x43e10000, float:450.0)
                r3 = 2
                float[] r4 = new float[r3]
                r3 = 0
                double r5 = r5 + r9
                float r5 = (float) r5
                r4[r3] = r5
                r3 = 1
                r4[r3] = r2
                r2 = r20
                r3 = r22
                r17 = r4
                r4 = r11
                r5 = r7
                r6 = r12
                r7 = r16
                r10 = r9
                r9 = r17
                r2.drawInnerCornerShadow(r3, r4, r5, r6, r7, r8, r9)
                int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r2 <= 0) goto L123
                android.graphics.RectF r2 = new android.graphics.RectF
                double r14 = r14 - r10
                float r3 = (float) r14
                r4 = 0
                r2.<init>(r4, r4, r3, r4)
                android.graphics.Matrix r3 = r0.renderMatrix
                r3.set(r1)
                android.graphics.Matrix r1 = r0.renderMatrix
                com.google.android.material.shape.ShapePath$PathLineOperation r3 = r0.operation1
                float r3 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r3)
                com.google.android.material.shape.ShapePath$PathLineOperation r4 = r0.operation1
                float r4 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r4)
                r1.preTranslate(r3, r4)
                android.graphics.Matrix r1 = r0.renderMatrix
                float r3 = r18.getEndAngle()
                r1.preRotate(r3)
                android.graphics.Matrix r1 = r0.renderMatrix
                float r3 = (float) r10
                r4 = 0
                r1.preTranslate(r3, r4)
                android.graphics.Matrix r1 = r0.renderMatrix
                r3 = r21
                r4 = r22
                r13.drawEdgeShadow(r4, r1, r2, r3)
            L123:
                return
        }

        public final float getEndAngle() {
                r3 = this;
                com.google.android.material.shape.ShapePath$PathLineOperation r0 = r3.operation2
                float r0 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r0)
                com.google.android.material.shape.ShapePath$PathLineOperation r1 = r3.operation1
                float r1 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r1)
                float r0 = r0 - r1
                com.google.android.material.shape.ShapePath$PathLineOperation r1 = r3.operation2
                float r1 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r1)
                com.google.android.material.shape.ShapePath$PathLineOperation r2 = r3.operation1
                float r2 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r2)
                float r1 = r1 - r2
                float r0 = r0 / r1
                double r0 = (double) r0
                double r0 = java.lang.Math.atan(r0)
                double r0 = java.lang.Math.toDegrees(r0)
                float r0 = (float) r0
                return r0
        }

        public final float getStartAngle() {
                r3 = this;
                com.google.android.material.shape.ShapePath$PathLineOperation r0 = r3.operation1
                float r0 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r0)
                float r1 = r3.startY
                float r0 = r0 - r1
                com.google.android.material.shape.ShapePath$PathLineOperation r1 = r3.operation1
                float r1 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r1)
                float r2 = r3.startX
                float r1 = r1 - r2
                float r0 = r0 / r1
                double r0 = (double) r0
                double r0 = java.lang.Math.atan(r0)
                double r0 = java.lang.Math.toDegrees(r0)
                float r0 = (float) r0
                return r0
        }

        public final float getSweepAngle() {
                r3 = this;
                float r0 = r3.getEndAngle()
                float r1 = r3.getStartAngle()
                float r0 = r0 - r1
                r1 = 1135869952(0x43b40000, float:360.0)
                float r0 = r0 + r1
                float r0 = r0 % r1
                r2 = 1127481344(0x43340000, float:180.0)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 > 0) goto L14
                return r0
            L14:
                float r0 = r0 - r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LineShadowOperation extends com.google.android.material.shape.ShapePath.ShadowCompatOperation {
        private final com.google.android.material.shape.ShapePath.PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(com.google.android.material.shape.ShapePath.PathLineOperation r1, float r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.operation = r1
                r0.startX = r2
                r0.startY = r3
                return
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(android.graphics.Matrix r6, @androidx.annotation.NonNull com.google.android.material.shadow.ShadowRenderer r7, int r8, @androidx.annotation.NonNull android.graphics.Canvas r9) {
                r5 = this;
                com.google.android.material.shape.ShapePath$PathLineOperation r0 = r5.operation
                float r0 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r0)
                float r1 = r5.startY
                float r0 = r0 - r1
                com.google.android.material.shape.ShapePath$PathLineOperation r1 = r5.operation
                float r1 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r1)
                float r2 = r5.startX
                float r1 = r1 - r2
                android.graphics.RectF r2 = new android.graphics.RectF
                double r3 = (double) r0
                double r0 = (double) r1
                double r0 = java.lang.Math.hypot(r3, r0)
                float r0 = (float) r0
                r1 = 0
                r2.<init>(r1, r1, r0, r1)
                android.graphics.Matrix r0 = r5.renderMatrix
                r0.set(r6)
                android.graphics.Matrix r6 = r5.renderMatrix
                float r0 = r5.startX
                float r1 = r5.startY
                r6.preTranslate(r0, r1)
                android.graphics.Matrix r6 = r5.renderMatrix
                float r0 = r5.getAngle()
                r6.preRotate(r0)
                android.graphics.Matrix r6 = r5.renderMatrix
                r7.drawEdgeShadow(r9, r6, r2, r8)
                return
        }

        public final float getAngle() {
                r3 = this;
                com.google.android.material.shape.ShapePath$PathLineOperation r0 = r3.operation
                float r0 = com.google.android.material.shape.ShapePath.PathLineOperation.access$100(r0)
                float r1 = r3.startY
                float r0 = r0 - r1
                com.google.android.material.shape.ShapePath$PathLineOperation r1 = r3.operation
                float r1 = com.google.android.material.shape.ShapePath.PathLineOperation.access$000(r1)
                float r2 = r3.startX
                float r1 = r1 - r2
                float r0 = r0 / r1
                double r0 = (double) r0
                double r0 = java.lang.Math.atan(r0)
                double r0 = java.lang.Math.toDegrees(r0)
                float r0 = (float) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class PathArcOperation extends com.google.android.material.shape.ShapePath.PathOperation {
        private static final android.graphics.RectF rectF = null;

        @java.lang.Deprecated
        public float bottom;

        @java.lang.Deprecated
        public float left;

        @java.lang.Deprecated
        public float right;

        @java.lang.Deprecated
        public float startAngle;

        @java.lang.Deprecated
        public float sweepAngle;

        @java.lang.Deprecated
        public float top;

        static {
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>()
                com.google.android.material.shape.ShapePath.PathArcOperation.rectF = r0
                return
        }

        public PathArcOperation(float r1, float r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.setLeft(r1)
                r0.setTop(r2)
                r0.setRight(r3)
                r0.setBottom(r4)
                return
        }

        public static /* synthetic */ float access$1000(com.google.android.material.shape.ShapePath.PathArcOperation r0) {
                float r0 = r0.getLeft()
                return r0
        }

        public static /* synthetic */ float access$1100(com.google.android.material.shape.ShapePath.PathArcOperation r0) {
                float r0 = r0.getTop()
                return r0
        }

        public static /* synthetic */ float access$1200(com.google.android.material.shape.ShapePath.PathArcOperation r0) {
                float r0 = r0.getRight()
                return r0
        }

        public static /* synthetic */ float access$1300(com.google.android.material.shape.ShapePath.PathArcOperation r0) {
                float r0 = r0.getBottom()
                return r0
        }

        public static /* synthetic */ void access$600(com.google.android.material.shape.ShapePath.PathArcOperation r0, float r1) {
                r0.setStartAngle(r1)
                return
        }

        public static /* synthetic */ void access$700(com.google.android.material.shape.ShapePath.PathArcOperation r0, float r1) {
                r0.setSweepAngle(r1)
                return
        }

        public static /* synthetic */ float access$800(com.google.android.material.shape.ShapePath.PathArcOperation r0) {
                float r0 = r0.getStartAngle()
                return r0
        }

        public static /* synthetic */ float access$900(com.google.android.material.shape.ShapePath.PathArcOperation r0) {
                float r0 = r0.getSweepAngle()
                return r0
        }

        private float getBottom() {
                r1 = this;
                float r0 = r1.bottom
                return r0
        }

        private float getLeft() {
                r1 = this;
                float r0 = r1.left
                return r0
        }

        private float getRight() {
                r1 = this;
                float r0 = r1.right
                return r0
        }

        private float getStartAngle() {
                r1 = this;
                float r0 = r1.startAngle
                return r0
        }

        private float getSweepAngle() {
                r1 = this;
                float r0 = r1.sweepAngle
                return r0
        }

        private float getTop() {
                r1 = this;
                float r0 = r1.top
                return r0
        }

        private void setBottom(float r1) {
                r0 = this;
                r0.bottom = r1
                return
        }

        private void setLeft(float r1) {
                r0 = this;
                r0.left = r1
                return
        }

        private void setRight(float r1) {
                r0 = this;
                r0.right = r1
                return
        }

        private void setStartAngle(float r1) {
                r0 = this;
                r0.startAngle = r1
                return
        }

        private void setSweepAngle(float r1) {
                r0 = this;
                r0.sweepAngle = r1
                return
        }

        private void setTop(float r1) {
                r0 = this;
                r0.top = r1
                return
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@androidx.annotation.NonNull android.graphics.Matrix r6, @androidx.annotation.NonNull android.graphics.Path r7) {
                r5 = this;
                android.graphics.Matrix r0 = r5.matrix
                r6.invert(r0)
                r7.transform(r0)
                android.graphics.RectF r0 = com.google.android.material.shape.ShapePath.PathArcOperation.rectF
                float r1 = r5.getLeft()
                float r2 = r5.getTop()
                float r3 = r5.getRight()
                float r4 = r5.getBottom()
                r0.set(r1, r2, r3, r4)
                float r1 = r5.getStartAngle()
                float r2 = r5.getSweepAngle()
                r3 = 0
                r7.arcTo(r0, r1, r2, r3)
                r7.transform(r6)
                return
        }
    }

    public static class PathCubicOperation extends com.google.android.material.shape.ShapePath.PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float r1, float r2, float r3, float r4, float r5, float r6) {
                r0 = this;
                r0.<init>()
                r0.setControlX1(r1)
                r0.setControlY1(r2)
                r0.setControlX2(r3)
                r0.setControlY2(r4)
                r0.setEndX(r5)
                r0.setEndY(r6)
                return
        }

        private float getControlX1() {
                r1 = this;
                float r0 = r1.controlX1
                return r0
        }

        private float getControlX2() {
                r1 = this;
                float r0 = r1.controlX2
                return r0
        }

        private float getControlY1() {
                r1 = this;
                float r0 = r1.controlY1
                return r0
        }

        private float getControlY2() {
                r1 = this;
                float r0 = r1.controlY1
                return r0
        }

        private float getEndX() {
                r1 = this;
                float r0 = r1.endX
                return r0
        }

        private float getEndY() {
                r1 = this;
                float r0 = r1.endY
                return r0
        }

        private void setControlX1(float r1) {
                r0 = this;
                r0.controlX1 = r1
                return
        }

        private void setControlX2(float r1) {
                r0 = this;
                r0.controlX2 = r1
                return
        }

        private void setControlY1(float r1) {
                r0 = this;
                r0.controlY1 = r1
                return
        }

        private void setControlY2(float r1) {
                r0 = this;
                r0.controlY2 = r1
                return
        }

        private void setEndX(float r1) {
                r0 = this;
                r0.endX = r1
                return
        }

        private void setEndY(float r1) {
                r0 = this;
                r0.endY = r1
                return
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@androidx.annotation.NonNull android.graphics.Matrix r9, @androidx.annotation.NonNull android.graphics.Path r10) {
                r8 = this;
                android.graphics.Matrix r0 = r8.matrix
                r9.invert(r0)
                r10.transform(r0)
                float r2 = r8.controlX1
                float r3 = r8.controlY1
                float r4 = r8.controlX2
                float r5 = r8.controlY2
                float r6 = r8.endX
                float r7 = r8.endY
                r1 = r10
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r10.transform(r9)
                return
        }
    }

    public static class PathLineOperation extends com.google.android.material.shape.ShapePath.PathOperation {
        private float x;
        private float y;

        public PathLineOperation() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ float access$000(com.google.android.material.shape.ShapePath.PathLineOperation r0) {
                float r0 = r0.x
                return r0
        }

        public static /* synthetic */ float access$002(com.google.android.material.shape.ShapePath.PathLineOperation r0, float r1) {
                r0.x = r1
                return r1
        }

        public static /* synthetic */ float access$100(com.google.android.material.shape.ShapePath.PathLineOperation r0) {
                float r0 = r0.y
                return r0
        }

        public static /* synthetic */ float access$102(com.google.android.material.shape.ShapePath.PathLineOperation r0, float r1) {
                r0.y = r1
                return r1
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@androidx.annotation.NonNull android.graphics.Matrix r3, @androidx.annotation.NonNull android.graphics.Path r4) {
                r2 = this;
                android.graphics.Matrix r0 = r2.matrix
                r3.invert(r0)
                r4.transform(r0)
                float r0 = r2.x
                float r1 = r2.y
                r4.lineTo(r0, r1)
                r4.transform(r3)
                return
        }
    }

    public static abstract class PathOperation {
        public final android.graphics.Matrix matrix;

        public PathOperation() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.matrix = r0
                return
        }

        public abstract void applyToPath(android.graphics.Matrix r1, android.graphics.Path r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class PathQuadOperation extends com.google.android.material.shape.ShapePath.PathOperation {

        @java.lang.Deprecated
        public float controlX;

        @java.lang.Deprecated
        public float controlY;

        @java.lang.Deprecated
        public float endX;

        @java.lang.Deprecated
        public float endY;

        public PathQuadOperation() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void access$200(com.google.android.material.shape.ShapePath.PathQuadOperation r0, float r1) {
                r0.setControlX(r1)
                return
        }

        public static /* synthetic */ void access$300(com.google.android.material.shape.ShapePath.PathQuadOperation r0, float r1) {
                r0.setControlY(r1)
                return
        }

        public static /* synthetic */ void access$400(com.google.android.material.shape.ShapePath.PathQuadOperation r0, float r1) {
                r0.setEndX(r1)
                return
        }

        public static /* synthetic */ void access$500(com.google.android.material.shape.ShapePath.PathQuadOperation r0, float r1) {
                r0.setEndY(r1)
                return
        }

        private float getControlX() {
                r1 = this;
                float r0 = r1.controlX
                return r0
        }

        private float getControlY() {
                r1 = this;
                float r0 = r1.controlY
                return r0
        }

        private float getEndX() {
                r1 = this;
                float r0 = r1.endX
                return r0
        }

        private float getEndY() {
                r1 = this;
                float r0 = r1.endY
                return r0
        }

        private void setControlX(float r1) {
                r0 = this;
                r0.controlX = r1
                return
        }

        private void setControlY(float r1) {
                r0 = this;
                r0.controlY = r1
                return
        }

        private void setEndX(float r1) {
                r0 = this;
                r0.endX = r1
                return
        }

        private void setEndY(float r1) {
                r0 = this;
                r0.endY = r1
                return
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@androidx.annotation.NonNull android.graphics.Matrix r5, @androidx.annotation.NonNull android.graphics.Path r6) {
                r4 = this;
                android.graphics.Matrix r0 = r4.matrix
                r5.invert(r0)
                r6.transform(r0)
                float r0 = r4.getControlX()
                float r1 = r4.getControlY()
                float r2 = r4.getEndX()
                float r3 = r4.getEndY()
                r6.quadTo(r0, r1, r2, r3)
                r6.transform(r5)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class ShadowCompatOperation {
        public static final android.graphics.Matrix IDENTITY_MATRIX = null;
        public final android.graphics.Matrix renderMatrix;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                com.google.android.material.shape.ShapePath.ShadowCompatOperation.IDENTITY_MATRIX = r0
                return
        }

        public ShadowCompatOperation() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.renderMatrix = r0
                return
        }

        public abstract void draw(android.graphics.Matrix r1, com.google.android.material.shadow.ShadowRenderer r2, int r3, android.graphics.Canvas r4);

        public final void draw(com.google.android.material.shadow.ShadowRenderer r2, int r3, android.graphics.Canvas r4) {
                r1 = this;
                android.graphics.Matrix r0 = com.google.android.material.shape.ShapePath.ShadowCompatOperation.IDENTITY_MATRIX
                r1.draw(r0, r2, r3, r4)
                return
        }
    }

    public ShapePath() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.operations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.shadowCompatOperations = r0
            r0 = 0
            r1.reset(r0, r0)
            return
    }

    public ShapePath(float r2, float r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.operations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.shadowCompatOperations = r0
            r1.reset(r2, r3)
            return
    }

    private void addConnectingShadowIfNecessary(float r5) {
            r4 = this;
            float r0 = r4.getCurrentShadowAngle()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            float r0 = r4.getCurrentShadowAngle()
            float r0 = r5 - r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 + r1
            float r0 = r0 % r1
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1a
            return
        L1a:
            com.google.android.material.shape.ShapePath$PathArcOperation r1 = new com.google.android.material.shape.ShapePath$PathArcOperation
            float r2 = r4.endX
            float r3 = r4.endY
            r1.<init>(r2, r3, r2, r3)
            float r2 = r4.getCurrentShadowAngle()
            com.google.android.material.shape.ShapePath.PathArcOperation.access$600(r1, r2)
            com.google.android.material.shape.ShapePath.PathArcOperation.access$700(r1, r0)
            java.util.List<com.google.android.material.shape.ShapePath$ShadowCompatOperation> r0 = r4.shadowCompatOperations
            com.google.android.material.shape.ShapePath$ArcShadowOperation r2 = new com.google.android.material.shape.ShapePath$ArcShadowOperation
            r2.<init>(r1)
            r0.add(r2)
            r4.setCurrentShadowAngle(r5)
            return
    }

    private void addShadowCompatOperation(com.google.android.material.shape.ShapePath.ShadowCompatOperation r1, float r2, float r3) {
            r0 = this;
            r0.addConnectingShadowIfNecessary(r2)
            java.util.List<com.google.android.material.shape.ShapePath$ShadowCompatOperation> r2 = r0.shadowCompatOperations
            r2.add(r1)
            r0.setCurrentShadowAngle(r3)
            return
    }

    private float getCurrentShadowAngle() {
            r1 = this;
            float r0 = r1.currentShadowAngle
            return r0
    }

    private float getEndShadowAngle() {
            r1 = this;
            float r0 = r1.endShadowAngle
            return r0
    }

    private void setCurrentShadowAngle(float r1) {
            r0 = this;
            r0.currentShadowAngle = r1
            return
    }

    private void setEndShadowAngle(float r1) {
            r0 = this;
            r0.endShadowAngle = r1
            return
    }

    private void setEndX(float r1) {
            r0 = this;
            r0.endX = r1
            return
    }

    private void setEndY(float r1) {
            r0 = this;
            r0.endY = r1
            return
    }

    private void setStartX(float r1) {
            r0 = this;
            r0.startX = r1
            return
    }

    private void setStartY(float r1) {
            r0 = this;
            r0.startY = r1
            return
    }

    public void addArc(float r5, float r6, float r7, float r8, float r9, float r10) {
            r4 = this;
            com.google.android.material.shape.ShapePath$PathArcOperation r0 = new com.google.android.material.shape.ShapePath$PathArcOperation
            r0.<init>(r5, r6, r7, r8)
            com.google.android.material.shape.ShapePath.PathArcOperation.access$600(r0, r9)
            com.google.android.material.shape.ShapePath.PathArcOperation.access$700(r0, r10)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r1 = r4.operations
            r1.add(r0)
            com.google.android.material.shape.ShapePath$ArcShadowOperation r1 = new com.google.android.material.shape.ShapePath$ArcShadowOperation
            r1.<init>(r0)
            float r0 = r9 + r10
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L1e
            r10 = 1
            goto L1f
        L1e:
            r10 = 0
        L1f:
            r2 = 1135869952(0x43b40000, float:360.0)
            r3 = 1127481344(0x43340000, float:180.0)
            if (r10 == 0) goto L27
            float r9 = r9 + r3
            float r9 = r9 % r2
        L27:
            if (r10 == 0) goto L2c
            float r3 = r3 + r0
            float r3 = r3 % r2
            goto L2d
        L2c:
            r3 = r0
        L2d:
            r4.addShadowCompatOperation(r1, r9, r3)
            float r9 = r5 + r7
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            float r7 = r7 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r5
            double r0 = (double) r0
            double r2 = java.lang.Math.toRadians(r0)
            double r2 = java.lang.Math.cos(r2)
            float r2 = (float) r2
            float r7 = r7 * r2
            float r7 = r7 + r9
            r4.setEndX(r7)
            float r7 = r6 + r8
            float r7 = r7 * r10
            float r8 = r8 - r6
            float r8 = r8 / r5
            double r5 = java.lang.Math.toRadians(r0)
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r8 = r8 * r5
            float r8 = r8 + r7
            r4.setEndY(r8)
            return
    }

    public void applyToPath(android.graphics.Matrix r4, android.graphics.Path r5) {
            r3 = this;
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r0 = r3.operations
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r2 = r3.operations
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.shape.ShapePath$PathOperation r2 = (com.google.android.material.shape.ShapePath.PathOperation) r2
            r2.applyToPath(r4, r5)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    public final boolean containsIncompatibleShadowOp() {
            r1 = this;
            boolean r0 = r1.containsIncompatibleShadowOp
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.material.shape.ShapePath.ShadowCompatOperation createShadowCompatOperation(android.graphics.Matrix r3) {
            r2 = this;
            float r0 = r2.getEndShadowAngle()
            r2.addConnectingShadowIfNecessary(r0)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.google.android.material.shape.ShapePath$ShadowCompatOperation> r1 = r2.shadowCompatOperations
            r3.<init>(r1)
            com.google.android.material.shape.ShapePath$1 r1 = new com.google.android.material.shape.ShapePath$1
            r1.<init>(r3, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    public void cubicToPoint(float r9, float r10, float r11, float r12, float r13, float r14) {
            r8 = this;
            com.google.android.material.shape.ShapePath$PathCubicOperation r7 = new com.google.android.material.shape.ShapePath$PathCubicOperation
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r9 = r8.operations
            r9.add(r7)
            r9 = 1
            r8.containsIncompatibleShadowOp = r9
            r8.setEndX(r13)
            r8.setEndY(r14)
            return
    }

    public void lineTo(float r5, float r6) {
            r4 = this;
            com.google.android.material.shape.ShapePath$PathLineOperation r0 = new com.google.android.material.shape.ShapePath$PathLineOperation
            r0.<init>()
            com.google.android.material.shape.ShapePath.PathLineOperation.access$002(r0, r5)
            com.google.android.material.shape.ShapePath.PathLineOperation.access$102(r0, r6)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r1 = r4.operations
            r1.add(r0)
            com.google.android.material.shape.ShapePath$LineShadowOperation r1 = new com.google.android.material.shape.ShapePath$LineShadowOperation
            float r2 = r4.endX
            float r3 = r4.endY
            r1.<init>(r0, r2, r3)
            float r0 = r1.getAngle()
            r2 = 1132920832(0x43870000, float:270.0)
            float r0 = r0 + r2
            float r3 = r1.getAngle()
            float r3 = r3 + r2
            r4.addShadowCompatOperation(r1, r0, r3)
            r4.setEndX(r5)
            r4.setEndY(r6)
            return
    }

    public void lineTo(float r6, float r7, float r8, float r9) {
            r5 = this;
            float r0 = r5.endX
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1b
            float r0 = r5.endY
            float r0 = r7 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2f
        L1b:
            float r0 = r6 - r8
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            float r0 = r7 - r9
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
        L2f:
            r5.lineTo(r8, r9)
            return
        L33:
            com.google.android.material.shape.ShapePath$PathLineOperation r0 = new com.google.android.material.shape.ShapePath$PathLineOperation
            r0.<init>()
            com.google.android.material.shape.ShapePath.PathLineOperation.access$002(r0, r6)
            com.google.android.material.shape.ShapePath.PathLineOperation.access$102(r0, r7)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r1 = r5.operations
            r1.add(r0)
            com.google.android.material.shape.ShapePath$PathLineOperation r1 = new com.google.android.material.shape.ShapePath$PathLineOperation
            r1.<init>()
            com.google.android.material.shape.ShapePath.PathLineOperation.access$002(r1, r8)
            com.google.android.material.shape.ShapePath.PathLineOperation.access$102(r1, r9)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r2 = r5.operations
            r2.add(r1)
            com.google.android.material.shape.ShapePath$InnerCornerShadowOperation r2 = new com.google.android.material.shape.ShapePath$InnerCornerShadowOperation
            float r3 = r5.endX
            float r4 = r5.endY
            r2.<init>(r0, r1, r3, r4)
            float r0 = r2.getSweepAngle()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6c
            r5.lineTo(r6, r7)
            r5.lineTo(r8, r9)
            return
        L6c:
            float r6 = r2.getStartAngle()
            r7 = 1132920832(0x43870000, float:270.0)
            float r6 = r6 + r7
            float r0 = r2.getEndAngle()
            float r0 = r0 + r7
            r5.addShadowCompatOperation(r2, r6, r0)
            r5.setEndX(r8)
            r5.setEndY(r9)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public void quadToPoint(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.google.android.material.shape.ShapePath$PathQuadOperation r0 = new com.google.android.material.shape.ShapePath$PathQuadOperation
            r0.<init>()
            com.google.android.material.shape.ShapePath.PathQuadOperation.access$200(r0, r2)
            com.google.android.material.shape.ShapePath.PathQuadOperation.access$300(r0, r3)
            com.google.android.material.shape.ShapePath.PathQuadOperation.access$400(r0, r4)
            com.google.android.material.shape.ShapePath.PathQuadOperation.access$500(r0, r5)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r2 = r1.operations
            r2.add(r0)
            r2 = 1
            r1.containsIncompatibleShadowOp = r2
            r1.setEndX(r4)
            r1.setEndY(r5)
            return
    }

    public void reset(float r3, float r4) {
            r2 = this;
            r0 = 1132920832(0x43870000, float:270.0)
            r1 = 0
            r2.reset(r3, r4, r0, r1)
            return
    }

    public void reset(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.setStartX(r1)
            r0.setStartY(r2)
            r0.setEndX(r1)
            r0.setEndY(r2)
            r0.setCurrentShadowAngle(r3)
            float r3 = r3 + r4
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            r0.setEndShadowAngle(r3)
            java.util.List<com.google.android.material.shape.ShapePath$PathOperation> r1 = r0.operations
            r1.clear()
            java.util.List<com.google.android.material.shape.ShapePath$ShadowCompatOperation> r1 = r0.shadowCompatOperations
            r1.clear()
            r1 = 0
            r0.containsIncompatibleShadowOp = r1
            return
    }
}
