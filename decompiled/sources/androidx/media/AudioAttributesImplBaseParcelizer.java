package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public AudioAttributesImplBaseParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesImplBase read(androidx.versionedparcelable.VersionedParcel r3) {
            androidx.media.AudioAttributesImplBase r0 = new androidx.media.AudioAttributesImplBase
            r0.<init>()
            int r1 = r0.mUsage
            r2 = 1
            int r1 = r3.readInt(r1, r2)
            r0.mUsage = r1
            int r1 = r0.mContentType
            r2 = 2
            int r1 = r3.readInt(r1, r2)
            r0.mContentType = r1
            int r1 = r0.mFlags
            r2 = 3
            int r1 = r3.readInt(r1, r2)
            r0.mFlags = r1
            int r1 = r0.mLegacyStream
            r2 = 4
            int r3 = r3.readInt(r1, r2)
            r0.mLegacyStream = r3
            return r0
    }

    public static void write(androidx.media.AudioAttributesImplBase r2, androidx.versionedparcelable.VersionedParcel r3) {
            r0 = 0
            r3.setSerializationFlags(r0, r0)
            int r0 = r2.mUsage
            r1 = 1
            r3.writeInt(r0, r1)
            int r0 = r2.mContentType
            r1 = 2
            r3.writeInt(r0, r1)
            int r0 = r2.mFlags
            r1 = 3
            r3.writeInt(r0, r1)
            int r2 = r2.mLegacyStream
            r0 = 4
            r3.writeInt(r2, r0)
            return
    }
}
