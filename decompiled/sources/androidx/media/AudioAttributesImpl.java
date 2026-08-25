package androidx.media;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public interface AudioAttributesImpl extends androidx.versionedparcelable.VersionedParcelable {

    /* JADX INFO: loaded from: classes3.dex */
    public interface Builder {
        @androidx.annotation.NonNull
        androidx.media.AudioAttributesImpl build();

        @androidx.annotation.NonNull
        androidx.media.AudioAttributesImpl.Builder setContentType(int r1);

        @androidx.annotation.NonNull
        androidx.media.AudioAttributesImpl.Builder setFlags(int r1);

        @androidx.annotation.NonNull
        androidx.media.AudioAttributesImpl.Builder setLegacyStreamType(int r1);

        @androidx.annotation.NonNull
        androidx.media.AudioAttributesImpl.Builder setUsage(int r1);
    }

    @androidx.annotation.Nullable
    java.lang.Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();
}
