package com.google.android.exoplayer2.extractor.jpeg;

/* JADX INFO: loaded from: classes2.dex */
final class MotionPhotoDescription {
    public final java.util.List<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription.ContainerItem> items;
    public final long photoPresentationTimestampUs;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ContainerItem {
        public final long length;
        public final java.lang.String mime;
        public final long padding;
        public final java.lang.String semantic;

        public ContainerItem(java.lang.String r1, java.lang.String r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.mime = r1
                r0.semantic = r2
                r0.length = r3
                r0.padding = r5
                return
        }
    }

    public MotionPhotoDescription(long r1, java.util.List<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription.ContainerItem> r3) {
            r0 = this;
            r0.<init>()
            r0.photoPresentationTimestampUs = r1
            r0.items = r3
            return
    }

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata getMotionPhotoMetadata(long r24) {
            r23 = this;
            r0 = r23
            java.util.List<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem> r1 = r0.items
            int r1 = r1.size()
            r2 = 0
            r3 = 2
            if (r1 >= r3) goto Ld
            return r2
        Ld:
            java.util.List<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem> r1 = r0.items
            int r1 = r1.size()
            int r1 = r1 + (-1)
            r4 = -1
            r6 = r24
            r9 = r4
            r11 = r9
            r15 = r11
            r17 = r15
            r8 = 0
        L1f:
            if (r1 < 0) goto L5a
            java.util.List<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem> r13 = r0.items
            java.lang.Object r13 = r13.get(r1)
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem r13 = (com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription.ContainerItem) r13
            java.lang.String r14 = r13.mime
            java.lang.String r3 = "video/mp4"
            boolean r3 = r3.equals(r14)
            r3 = r3 | r8
            if (r1 != 0) goto L3e
            r19 = 0
            long r13 = r13.padding
            long r6 = r6 - r13
            r13 = r6
            r6 = r19
            goto L47
        L3e:
            long r13 = r13.length
            long r13 = r6 - r13
            r21 = r6
            r6 = r13
            r13 = r21
        L47:
            if (r3 == 0) goto L52
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 == 0) goto L52
            long r17 = r13 - r6
            r15 = r6
            r8 = 0
            goto L53
        L52:
            r8 = r3
        L53:
            if (r1 != 0) goto L57
            r9 = r6
            r11 = r13
        L57:
            int r1 = r1 + (-1)
            goto L1f
        L5a:
            int r1 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto L6b
            goto L74
        L6b:
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r1 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata
            long r13 = r0.photoPresentationTimestampUs
            r8 = r1
            r8.<init>(r9, r11, r13, r15, r17)
            return r1
        L74:
            return r2
    }
}
