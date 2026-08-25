package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private androidx.media.VolumeProviderCompat.Callback mCallback;
    private final java.lang.String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private android.media.VolumeProvider mVolumeProviderFwk;



    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setCurrentVolume(android.media.VolumeProvider r0, int r1) {
                r0.setCurrentVolume(r1)
                return
        }
    }

    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onVolumeChanged(androidx.media.VolumeProviderCompat r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ControlType {
    }

    public VolumeProviderCompat(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public VolumeProviderCompat(int r1, int r2, int r3, @androidx.annotation.Nullable java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.mControlType = r1
            r0.mMaxVolume = r2
            r0.mCurrentVolume = r3
            r0.mControlId = r4
            return
    }

    public final int getCurrentVolume() {
            r1 = this;
            int r0 = r1.mCurrentVolume
            return r0
    }

    public final int getMaxVolume() {
            r1 = this;
            int r0 = r1.mMaxVolume
            return r0
    }

    public final int getVolumeControl() {
            r1 = this;
            int r0 = r1.mControlType
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final java.lang.String getVolumeControlId() {
            r1 = this;
            java.lang.String r0 = r1.mControlId
            return r0
    }

    public java.lang.Object getVolumeProvider() {
            r8 = this;
            android.media.VolumeProvider r0 = r8.mVolumeProviderFwk
            if (r0 != 0) goto L29
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            androidx.media.VolumeProviderCompat$1 r0 = new androidx.media.VolumeProviderCompat$1
            int r4 = r8.mControlType
            int r5 = r8.mMaxVolume
            int r6 = r8.mCurrentVolume
            java.lang.String r7 = r8.mControlId
            r2 = r0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r8.mVolumeProviderFwk = r0
            goto L29
        L1c:
            androidx.media.VolumeProviderCompat$2 r0 = new androidx.media.VolumeProviderCompat$2
            int r1 = r8.mControlType
            int r2 = r8.mMaxVolume
            int r3 = r8.mCurrentVolume
            r0.<init>(r8, r1, r2, r3)
            r8.mVolumeProviderFwk = r0
        L29:
            android.media.VolumeProvider r0 = r8.mVolumeProviderFwk
            return r0
    }

    public void onAdjustVolume(int r1) {
            r0 = this;
            return
    }

    public void onSetVolumeTo(int r1) {
            r0 = this;
            return
    }

    public void setCallback(androidx.media.VolumeProviderCompat.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public final void setCurrentVolume(int r2) {
            r1 = this;
            r1.mCurrentVolume = r2
            java.lang.Object r0 = r1.getVolumeProvider()
            android.media.VolumeProvider r0 = (android.media.VolumeProvider) r0
            androidx.media.VolumeProviderCompat.Api21Impl.setCurrentVolume(r0, r2)
            androidx.media.VolumeProviderCompat$Callback r2 = r1.mCallback
            if (r2 == 0) goto L12
            r2.onVolumeChanged(r1)
        L12:
            return
    }
}
