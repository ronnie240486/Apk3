package com.google.android.exoplayer2.metadata.vorbis;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisComment extends com.google.android.exoplayer2.metadata.flac.VorbisComment {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.vorbis.VorbisComment> CREATOR = null;


    static {
            com.google.android.exoplayer2.metadata.vorbis.VorbisComment$1 r0 = new com.google.android.exoplayer2.metadata.vorbis.VorbisComment$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.vorbis.VorbisComment.CREATOR = r0
            return
    }

    public VorbisComment(android.os.Parcel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public VorbisComment(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }
}
