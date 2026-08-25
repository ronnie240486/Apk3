package com.google.android.exoplayer2.extractor.jpeg;

/* JADX INFO: loaded from: classes2.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final java.lang.String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = null;
    private static final java.lang.String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = null;
    private static final java.lang.String[] MOTION_PHOTO_ATTRIBUTE_NAMES = null;
    private static final java.lang.String TAG = "MotionPhotoXmpParser";

    static {
            java.lang.String r0 = "Camera:MotionPhoto"
            java.lang.String r1 = "GCamera:MotionPhoto"
            java.lang.String r2 = "Camera:MicroVideo"
            java.lang.String r3 = "GCamera:MicroVideo"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.MOTION_PHOTO_ATTRIBUTE_NAMES = r0
            java.lang.String r0 = "Camera:MotionPhotoPresentationTimestampUs"
            java.lang.String r1 = "GCamera:MotionPhotoPresentationTimestampUs"
            java.lang.String r2 = "Camera:MicroVideoPresentationTimestampUs"
            java.lang.String r3 = "GCamera:MicroVideoPresentationTimestampUs"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = r0
            java.lang.String r0 = "Camera:MicroVideoOffset"
            java.lang.String r1 = "GCamera:MicroVideoOffset"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = r0
            return
    }

    private XmpMotionPhotoDescriptionParser() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription parse(java.lang.String r1) throws java.io.IOException {
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription r1 = parseInternal(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            java.lang.String r1 = "MotionPhotoXmpParser"
            java.lang.String r0 = "Ignoring unexpected XMP metadata"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription parseInternal(java.lang.String r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r6)
            r0.setInput(r1)
            r0.next()
            java.lang.String r6 = "x:xmpmeta"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r6)
            r2 = 0
            if (r1 == 0) goto L76
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
        L26:
            r0.next()
            java.lang.String r5 = "rdf:Description"
            boolean r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r5)
            if (r5 == 0) goto L42
            boolean r1 = parseMotionPhotoFlagFromDescription(r0)
            if (r1 != 0) goto L39
            return r2
        L39:
            long r3 = parseMotionPhotoPresentationTimestampUsFromDescription(r0)
            com.google.common.collect.ImmutableList r1 = parseMicroVideoOffsetFromDescription(r0)
            goto L63
        L42:
            java.lang.String r5 = "Container:Directory"
            boolean r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r5)
            if (r5 == 0) goto L53
            java.lang.String r1 = "Container"
            java.lang.String r5 = "Item"
            com.google.common.collect.ImmutableList r1 = parseMotionPhotoV1Directory(r0, r1, r5)
            goto L63
        L53:
            java.lang.String r5 = "GContainer:Directory"
            boolean r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r5)
            if (r5 == 0) goto L63
            java.lang.String r1 = "GContainer"
            java.lang.String r5 = "GContainerItem"
            com.google.common.collect.ImmutableList r1 = parseMotionPhotoV1Directory(r0, r1, r5)
        L63:
            boolean r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r6)
            if (r5 == 0) goto L26
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L70
            return r2
        L70:
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription r6 = new com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription
            r6.<init>(r3, r1)
            return r6
        L76:
            java.lang.String r6 = "Couldn't find xmp metadata"
            com.google.android.exoplayer2.ParserException r6 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r6, r2)
            throw r6
    }

    private static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription.ContainerItem> parseMicroVideoOffsetFromDescription(org.xmlpull.v1.XmlPullParser r11) {
            java.lang.String[] r0 = com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L35
            r3 = r0[r2]
            java.lang.String r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r11, r3)
            if (r3 == 0) goto L32
            long r7 = java.lang.Long.parseLong(r3)
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem r11 = new com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem
            r3 = 0
            r5 = 0
            java.lang.String r1 = "image/jpeg"
            java.lang.String r2 = "Primary"
            r0 = r11
            r0.<init>(r1, r2, r3, r5)
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem r0 = new com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem
            r9 = 0
            java.lang.String r5 = "video/mp4"
            java.lang.String r6 = "MotionPhoto"
            r4 = r0
            r4.<init>(r5, r6, r7, r9)
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of(r11, r0)
            return r11
        L32:
            int r2 = r2 + 1
            goto L4
        L35:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
            return r11
    }

    private static boolean parseMotionPhotoFlagFromDescription(org.xmlpull.v1.XmlPullParser r5) {
            java.lang.String[] r0 = com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.MOTION_PHOTO_ATTRIBUTE_NAMES
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            java.lang.String r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r5, r4)
            if (r4 == 0) goto L18
            int r5 = java.lang.Integer.parseInt(r4)
            r0 = 1
            if (r5 != r0) goto L17
            r2 = 1
        L17:
            return r2
        L18:
            int r3 = r3 + 1
            goto L5
        L1b:
            return r2
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(org.xmlpull.v1.XmlPullParser r7) {
            java.lang.String[] r0 = com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser.DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES
            int r1 = r0.length
            r2 = 0
        L4:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 >= r1) goto L23
            r5 = r0[r2]
            java.lang.String r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r7, r5)
            if (r5 == 0) goto L20
            long r0 = java.lang.Long.parseLong(r5)
            r5 = -1
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L1e
            goto L1f
        L1e:
            r3 = r0
        L1f:
            return r3
        L20:
            int r2 = r2 + 1
            goto L4
        L23:
            return r3
    }

    private static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription.ContainerItem> parseMotionPhotoV1Directory(org.xmlpull.v1.XmlPullParser r13, java.lang.String r14, java.lang.String r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            java.lang.String r1 = ":Item"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r1)
            java.lang.String r2 = ":Directory"
            java.lang.String r14 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r14, r2)
        L10:
            r13.next()
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r13, r1)
            if (r2 == 0) goto L68
            java.lang.String r2 = ":Mime"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r15, r2)
            java.lang.String r3 = ":Semantic"
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r15, r3)
            java.lang.String r4 = ":Length"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r15, r4)
            java.lang.String r5 = ":Padding"
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r15, r5)
            java.lang.String r7 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r13, r2)
            java.lang.String r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r13, r3)
            java.lang.String r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r13, r4)
            java.lang.String r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r13, r5)
            if (r7 == 0) goto L63
            if (r8 != 0) goto L46
            goto L63
        L46:
            com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem r4 = new com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription$ContainerItem
            r5 = 0
            if (r2 == 0) goto L51
            long r9 = java.lang.Long.parseLong(r2)
            goto L52
        L51:
            r9 = r5
        L52:
            if (r3 == 0) goto L5a
            long r2 = java.lang.Long.parseLong(r3)
            r11 = r2
            goto L5b
        L5a:
            r11 = r5
        L5b:
            r6 = r4
            r6.<init>(r7, r8, r9, r11)
            r0.add(r4)
            goto L68
        L63:
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of()
            return r13
        L68:
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r13, r14)
            if (r2 == 0) goto L10
            com.google.common.collect.ImmutableList r13 = r0.build()
            return r13
    }
}
