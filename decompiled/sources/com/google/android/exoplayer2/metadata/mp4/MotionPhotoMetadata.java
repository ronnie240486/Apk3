package com.google.android.exoplayer2.metadata.mp4;

/* JADX INFO: loaded from: classes3.dex */
public final class MotionPhotoMetadata implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata> CREATOR = null;
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;


    static {
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata$1 r0 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.CREATOR = r0
            return
    }

    public MotionPhotoMetadata(long r1, long r3, long r5, long r7, long r9) {
            r0 = this;
            r0.<init>()
            r0.photoStartPosition = r1
            r0.photoSize = r3
            r0.photoPresentationTimestampUs = r5
            r0.videoStartPosition = r7
            r0.videoSize = r9
            return
    }

    private MotionPhotoMetadata(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            long r0 = r3.readLong()
            r2.photoStartPosition = r0
            long r0 = r3.readLong()
            r2.photoSize = r0
            long r0 = r3.readLong()
            r2.photoPresentationTimestampUs = r0
            long r0 = r3.readLong()
            r2.videoStartPosition = r0
            long r0 = r3.readLong()
            r2.videoSize = r0
            return
    }

    public /* synthetic */ MotionPhotoMetadata(android.os.Parcel r1, com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L3d
            java.lang.Class<com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata> r2 = com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r8 = (com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata) r8
            long r2 = r7.photoStartPosition
            long r4 = r8.photoStartPosition
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.photoSize
            long r4 = r8.photoSize
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.photoPresentationTimestampUs
            long r4 = r8.photoPresentationTimestampUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.videoStartPosition
            long r4 = r8.videoStartPosition
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.videoSize
            long r4 = r8.videoSize
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L3b
            goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
        L3d:
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
            r1 = this;
            byte[] r0 = com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataBytes(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
            r1 = this;
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataFormat(r1)
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.photoStartPosition
            int r0 = com.google.common.primitives.Longs.hashCode(r0)
            int r0 = r0 + 527
            int r0 = r0 * 31
            long r1 = r4.photoSize
            int r1 = com.google.common.primitives.Longs.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.photoPresentationTimestampUs
            int r0 = com.google.common.primitives.Longs.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r4.videoStartPosition
            int r1 = com.google.common.primitives.Longs.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.videoSize
            int r0 = com.google.common.primitives.Longs.hashCode(r2)
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1) {
            r0 = this;
            com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(r0, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Motion photo metadata: photoStartPosition="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r3.photoStartPosition
            r0.append(r1)
            java.lang.String r1 = ", photoSize="
            r0.append(r1)
            long r1 = r3.photoSize
            r0.append(r1)
            java.lang.String r1 = ", photoPresentationTimestampUs="
            r0.append(r1)
            long r1 = r3.photoPresentationTimestampUs
            r0.append(r1)
            java.lang.String r1 = ", videoStartPosition="
            r0.append(r1)
            long r1 = r3.videoStartPosition
            r0.append(r1)
            java.lang.String r1 = ", videoSize="
            r0.append(r1)
            long r1 = r3.videoSize
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.photoStartPosition
            r3.writeLong(r0)
            long r0 = r2.photoSize
            r3.writeLong(r0)
            long r0 = r2.photoPresentationTimestampUs
            r3.writeLong(r0)
            long r0 = r2.videoStartPosition
            r3.writeLong(r0)
            long r0 = r2.videoSize
            r3.writeLong(r0)
            return
    }
}
