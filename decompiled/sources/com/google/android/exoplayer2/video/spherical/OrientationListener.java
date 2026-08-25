package com.google.android.exoplayer2.video.spherical;

/* JADX INFO: loaded from: classes2.dex */
final class OrientationListener implements android.hardware.SensorEventListener {
    private final float[] angles;
    private final float[] deviceOrientationMatrix4x4;
    private final android.view.Display display;
    private final com.google.android.exoplayer2.video.spherical.OrientationListener.Listener[] listeners;
    private final float[] recenterMatrix4x4;
    private boolean recenterMatrixComputed;
    private final float[] tempMatrix4x4;

    /* JADX INFO: loaded from: classes3.dex */
    public interface Listener {
        void onOrientationChange(float[] r1, float r2);
    }

    public OrientationListener(android.view.Display r3, com.google.android.exoplayer2.video.spherical.OrientationListener.Listener... r4) {
            r2 = this;
            r2.<init>()
            r0 = 16
            float[] r1 = new float[r0]
            r2.deviceOrientationMatrix4x4 = r1
            float[] r1 = new float[r0]
            r2.tempMatrix4x4 = r1
            float[] r0 = new float[r0]
            r2.recenterMatrix4x4 = r0
            r0 = 3
            float[] r0 = new float[r0]
            r2.angles = r0
            r2.display = r3
            r2.listeners = r4
            return
    }

    private float extractRoll(float[] r4) {
            r3 = this;
            float[] r0 = r3.tempMatrix4x4
            r1 = 1
            r2 = 131(0x83, float:1.84E-43)
            android.hardware.SensorManager.remapCoordinateSystem(r4, r1, r2, r0)
            float[] r4 = r3.tempMatrix4x4
            float[] r0 = r3.angles
            android.hardware.SensorManager.getOrientation(r4, r0)
            float[] r4 = r3.angles
            r0 = 2
            r4 = r4[r0]
            return r4
    }

    private void notifyListeners(float[] r5, float r6) {
            r4 = this;
            com.google.android.exoplayer2.video.spherical.OrientationListener$Listener[] r0 = r4.listeners
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r3.onOrientationChange(r5, r6)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    private void recenter(float[] r10) {
            r9 = this;
            boolean r0 = r9.recenterMatrixComputed
            if (r0 != 0) goto Lc
            float[] r0 = r9.recenterMatrix4x4
            com.google.android.exoplayer2.video.spherical.FrameRotationQueue.computeRecenterMatrix(r0, r10)
            r0 = 1
            r9.recenterMatrixComputed = r0
        Lc:
            float[] r0 = r9.tempMatrix4x4
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r10, r2, r0, r2, r1)
            r4 = 0
            float[] r5 = r9.tempMatrix4x4
            r6 = 0
            float[] r7 = r9.recenterMatrix4x4
            r8 = 0
            r3 = r10
            android.opengl.Matrix.multiplyMM(r3, r4, r5, r6, r7, r8)
            return
    }

    private void rotateAroundZ(float[] r5, int r6) {
            r4 = this;
            if (r6 == 0) goto L29
            r0 = 130(0x82, float:1.82E-43)
            r1 = 129(0x81, float:1.81E-43)
            r2 = 2
            r3 = 1
            if (r6 == r3) goto L1c
            if (r6 == r2) goto L17
            r1 = 3
            if (r6 != r1) goto L11
            r1 = 1
            goto L1d
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L17:
            r0 = 129(0x81, float:1.81E-43)
            r1 = 130(0x82, float:1.82E-43)
            goto L1d
        L1c:
            r0 = 2
        L1d:
            float[] r6 = r4.tempMatrix4x4
            int r2 = r6.length
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r6, r3, r2)
            float[] r6 = r4.tempMatrix4x4
            android.hardware.SensorManager.remapCoordinateSystem(r6, r0, r1, r5)
        L29:
            return
    }

    private static void rotateYtoSky(float[] r6) {
            r1 = 0
            r2 = 1119092736(0x42b40000, float:90.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 0
            r0 = r6
            android.opengl.Matrix.rotateM(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    @androidx.annotation.BinderThread
    public void onSensorChanged(android.hardware.SensorEvent r2) {
            r1 = this;
            float[] r0 = r1.deviceOrientationMatrix4x4
            float[] r2 = r2.values
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r2)
            float[] r2 = r1.deviceOrientationMatrix4x4
            android.view.Display r0 = r1.display
            int r0 = r0.getRotation()
            r1.rotateAroundZ(r2, r0)
            float[] r2 = r1.deviceOrientationMatrix4x4
            float r2 = r1.extractRoll(r2)
            float[] r0 = r1.deviceOrientationMatrix4x4
            rotateYtoSky(r0)
            float[] r0 = r1.deviceOrientationMatrix4x4
            r1.recenter(r0)
            float[] r0 = r1.deviceOrientationMatrix4x4
            r1.notifyListeners(r0, r2)
            return
    }
}
