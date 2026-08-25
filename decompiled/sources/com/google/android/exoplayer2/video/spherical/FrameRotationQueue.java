package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes3.dex */
final class FrameRotationQueue {
    private final float[] recenterMatrix;
    private boolean recenterMatrixComputed;
    private final float[] rotationMatrix;
    private final com.google.android.exoplayer2.util.TimedValueQueue<float[]> rotations;

    public FrameRotationQueue() {
            r2 = this;
            r2.<init>()
            r0 = 16
            float[] r1 = new float[r0]
            r2.recenterMatrix = r1
            float[] r0 = new float[r0]
            r2.rotationMatrix = r0
            com.google.android.exoplayer2.util.TimedValueQueue r0 = new com.google.android.exoplayer2.util.TimedValueQueue
            r0.<init>()
            r2.rotations = r0
            return
    }

    public static void computeRecenterMatrix(float[] r5, float[] r6) {
            com.google.android.exoplayer2.util.GlUtil.setToIdentity(r5)
            r0 = 10
            r1 = r6[r0]
            r2 = r6[r0]
            float r1 = r1 * r2
            r2 = 8
            r3 = r6[r2]
            r4 = r6[r2]
            float r3 = r3 * r4
            float r3 = r3 + r1
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r1 = (float) r3
            r3 = r6[r0]
            float r3 = r3 / r1
            r4 = 0
            r5[r4] = r3
            r3 = r6[r2]
            float r3 = r3 / r1
            r4 = 2
            r5[r4] = r3
            r3 = r6[r2]
            float r3 = -r3
            float r3 = r3 / r1
            r5[r2] = r3
            r6 = r6[r0]
            float r6 = r6 / r1
            r5[r0] = r6
            return
    }

    private static void getRotationMatrixFromAngleAxis(float[] r11, float[] r12) {
            r0 = 0
            r0 = r12[r0]
            r1 = 1
            r1 = r12[r1]
            float r1 = -r1
            r2 = 2
            r12 = r12[r2]
            float r12 = -r12
            float r2 = android.opengl.Matrix.length(r0, r1, r12)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L26
            double r3 = (double) r2
            double r3 = java.lang.Math.toDegrees(r3)
            float r7 = (float) r3
            r6 = 0
            float r8 = r0 / r2
            float r9 = r1 / r2
            float r10 = r12 / r2
            r5 = r11
            android.opengl.Matrix.setRotateM(r5, r6, r7, r8, r9, r10)
            goto L29
        L26:
            com.google.android.exoplayer2.util.GlUtil.setToIdentity(r11)
        L29:
            return
    }

    public boolean pollRotationMatrix(float[] r8, long r9) {
            r7 = this;
            com.google.android.exoplayer2.util.TimedValueQueue<float[]> r0 = r7.rotations
            java.lang.Object r9 = r0.pollFloor(r9)
            float[] r9 = (float[]) r9
            if (r9 != 0) goto Lc
            r8 = 0
            return r8
        Lc:
            float[] r10 = r7.rotationMatrix
            getRotationMatrixFromAngleAxis(r10, r9)
            boolean r9 = r7.recenterMatrixComputed
            r10 = 1
            if (r9 != 0) goto L1f
            float[] r9 = r7.recenterMatrix
            float[] r0 = r7.rotationMatrix
            computeRecenterMatrix(r9, r0)
            r7.recenterMatrixComputed = r10
        L1f:
            r2 = 0
            float[] r3 = r7.recenterMatrix
            r4 = 0
            float[] r5 = r7.rotationMatrix
            r6 = 0
            r1 = r8
            android.opengl.Matrix.multiplyMM(r1, r2, r3, r4, r5, r6)
            return r10
    }

    public void reset() {
            r1 = this;
            com.google.android.exoplayer2.util.TimedValueQueue<float[]> r0 = r1.rotations
            r0.clear()
            r0 = 0
            r1.recenterMatrixComputed = r0
            return
    }

    public void setRotation(long r2, float[] r4) {
            r1 = this;
            com.google.android.exoplayer2.util.TimedValueQueue<float[]> r0 = r1.rotations
            r0.add(r2, r4)
            return
    }
}
