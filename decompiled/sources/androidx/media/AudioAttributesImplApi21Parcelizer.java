package androidx.media;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public AudioAttributesImplApi21Parcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesImplApi21 read(androidx.versionedparcelable.VersionedParcel r3) {
            androidx.media.AudioAttributesImplApi21 r0 = new androidx.media.AudioAttributesImplApi21
            r0.<init>()
            android.media.AudioAttributes r1 = r0.mAudioAttributes
            r2 = 1
            android.os.Parcelable r1 = r3.readParcelable(r1, r2)
            android.media.AudioAttributes r1 = (android.media.AudioAttributes) r1
            r0.mAudioAttributes = r1
            int r1 = r0.mLegacyStreamType
            r2 = 2
            int r3 = r3.readInt(r1, r2)
            r0.mLegacyStreamType = r3
            return r0
    }

    public static void write(androidx.media.AudioAttributesImplApi21 r2, androidx.versionedparcelable.VersionedParcel r3) {
            r0 = 0
            r3.setSerializationFlags(r0, r0)
            android.media.AudioAttributes r0 = r2.mAudioAttributes
            r1 = 1
            r3.writeParcelable(r0, r1)
            int r2 = r2.mLegacyStreamType
            r0 = 2
            r3.writeInt(r2, r0)
            return
    }
}
