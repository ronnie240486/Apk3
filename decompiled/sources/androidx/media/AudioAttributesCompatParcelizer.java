package androidx.media;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesCompat read(androidx.versionedparcelable.VersionedParcel r3) {
            androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
            r0.<init>()
            androidx.media.AudioAttributesImpl r1 = r0.mImpl
            r2 = 1
            androidx.versionedparcelable.VersionedParcelable r3 = r3.readVersionedParcelable(r1, r2)
            androidx.media.AudioAttributesImpl r3 = (androidx.media.AudioAttributesImpl) r3
            r0.mImpl = r3
            return r0
    }

    public static void write(androidx.media.AudioAttributesCompat r1, androidx.versionedparcelable.VersionedParcel r2) {
            r0 = 0
            r2.setSerializationFlags(r0, r0)
            androidx.media.AudioAttributesImpl r1 = r1.mImpl
            r0 = 1
            r2.writeVersionedParcelable(r1, r0)
            return
    }
}
