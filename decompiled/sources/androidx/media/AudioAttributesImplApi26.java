package androidx.media;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(26)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26 extends androidx.media.AudioAttributesImplApi21 {

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Builder extends androidx.media.AudioAttributesImplApi21.Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public Builder(java.lang.Object r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImpl build() {
                r2 = this;
                androidx.media.AudioAttributesImplApi26 r0 = new androidx.media.AudioAttributesImplApi26
                android.media.AudioAttributes$Builder r1 = r2.mFwkBuilder
                android.media.AudioAttributes r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setUsage(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplApi26$Builder r1 = r0.setUsage(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImplApi21.Builder setUsage(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplApi26$Builder r1 = r0.setUsage(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplApi26.Builder setUsage(int r2) {
                r1 = this;
                android.media.AudioAttributes$Builder r0 = r1.mFwkBuilder
                r0.setUsage(r2)
                return r1
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi26() {
            r0 = this;
            r0.<init>()
            return
    }

    public AudioAttributesImplApi26(android.media.AudioAttributes r2) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getVolumeControlStream()
            return r0
    }
}
