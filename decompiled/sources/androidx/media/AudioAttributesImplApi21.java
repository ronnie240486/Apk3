package androidx.media;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public android.media.AudioAttributes mAudioAttributes;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mLegacyStreamType;

    @androidx.annotation.RequiresApi(21)
    public static class Builder implements androidx.media.AudioAttributesImpl.Builder {
        public final android.media.AudioAttributes.Builder mFwkBuilder;

        public Builder() {
                r1 = this;
                r1.<init>()
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1.mFwkBuilder = r0
                return
        }

        public Builder(java.lang.Object r2) {
                r1 = this;
                r1.<init>()
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                android.media.AudioAttributes r2 = (android.media.AudioAttributes) r2
                r0.<init>(r2)
                r1.mFwkBuilder = r0
                return
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImpl build() {
                r2 = this;
                androidx.media.AudioAttributesImplApi21 r0 = new androidx.media.AudioAttributesImplApi21
                android.media.AudioAttributes$Builder r1 = r2.mFwkBuilder
                android.media.AudioAttributes r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setContentType(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplApi21$Builder r1 = r0.setContentType(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplApi21.Builder setContentType(int r2) {
                r1 = this;
                android.media.AudioAttributes$Builder r0 = r1.mFwkBuilder
                r0.setContentType(r2)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setFlags(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplApi21$Builder r1 = r0.setFlags(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplApi21.Builder setFlags(int r2) {
                r1 = this;
                android.media.AudioAttributes$Builder r0 = r1.mFwkBuilder
                r0.setFlags(r2)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setLegacyStreamType(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplApi21$Builder r1 = r0.setLegacyStreamType(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplApi21.Builder setLegacyStreamType(int r2) {
                r1 = this;
                android.media.AudioAttributes$Builder r0 = r1.mFwkBuilder
                r0.setLegacyStreamType(r2)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"WrongConstant"})
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setUsage(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplApi21$Builder r1 = r0.setUsage(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"WrongConstant"})
        public androidx.media.AudioAttributesImplApi21.Builder setUsage(int r2) {
                r1 = this;
                r0 = 16
                if (r2 != r0) goto L6
                r2 = 12
            L6:
                android.media.AudioAttributes$Builder r0 = r1.mFwkBuilder
                r0.setUsage(r2)
                return r1
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi21() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mLegacyStreamType = r0
            return
    }

    public AudioAttributesImplApi21(android.media.AudioAttributes r1) {
            r0 = this;
            r0.<init>()
            r0.mAudioAttributes = r1
            r1 = -1
            r0.mLegacyStreamType = r1
            return
    }

    public AudioAttributesImplApi21(android.media.AudioAttributes r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mAudioAttributes = r1
            r1 = -1
            r0.mLegacyStreamType = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.media.AudioAttributesImplApi21
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.media.AudioAttributesImplApi21 r2 = (androidx.media.AudioAttributesImplApi21) r2
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            android.media.AudioAttributes r2 = r2.mAudioAttributes
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // androidx.media.AudioAttributesImpl
    @androidx.annotation.Nullable
    public java.lang.Object getAudioAttributes() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getContentType()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getFlags()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
            r3 = this;
            int r0 = r3.mLegacyStreamType
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            int r1 = r3.getFlags()
            int r2 = r3.getUsage()
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r0, r1, r2)
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
            r1 = this;
            int r0 = r1.mLegacyStreamType
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.getUsage()
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
            r3 = this;
            int r0 = r3.getFlags()
            int r1 = r3.getUsage()
            r2 = 1
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r2, r0, r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.media.AudioAttributes r0 = r1.mAudioAttributes
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AudioAttributesCompat: audioattributes="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            android.media.AudioAttributes r1 = r2.mAudioAttributes
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
