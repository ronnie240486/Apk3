package android.support.v4.media;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public AudioAttributesImplBaseParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesImplBase read(androidx.versionedparcelable.VersionedParcel r0) {
            androidx.media.AudioAttributesImplBase r0 = androidx.media.AudioAttributesImplBaseParcelizer.read(r0)
            return r0
    }

    public static void write(androidx.media.AudioAttributesImplBase r0, androidx.versionedparcelable.VersionedParcel r1) {
            androidx.media.AudioAttributesImplBaseParcelizer.write(r0, r1)
            return
    }
}
