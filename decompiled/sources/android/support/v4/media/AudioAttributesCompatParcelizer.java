package android.support.v4.media;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesCompat read(androidx.versionedparcelable.VersionedParcel r0) {
            androidx.media.AudioAttributesCompat r0 = androidx.media.AudioAttributesCompatParcelizer.read(r0)
            return r0
    }

    public static void write(androidx.media.AudioAttributesCompat r0, androidx.versionedparcelable.VersionedParcel r1) {
            androidx.media.AudioAttributesCompatParcelizer.write(r0, r1)
            return
    }
}
