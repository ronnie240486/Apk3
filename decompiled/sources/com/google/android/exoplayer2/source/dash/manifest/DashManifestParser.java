package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: loaded from: classes2.dex */
public class DashManifestParser extends org.xml.sax.helpers.DefaultHandler implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.dash.manifest.DashManifest> {
    private static final java.util.regex.Pattern CEA_608_ACCESSIBILITY_PATTERN = null;
    private static final java.util.regex.Pattern CEA_708_ACCESSIBILITY_PATTERN = null;
    private static final java.util.regex.Pattern FRAME_RATE_PATTERN = null;
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = null;
    private static final java.lang.String TAG = "MpdParser";
    private final org.xmlpull.v1.XmlPullParserFactory xmlParserFactory;

    public static final class RepresentationInfo {
        public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> baseUrls;
        public final java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> drmSchemeDatas;

        @androidx.annotation.Nullable
        public final java.lang.String drmSchemeType;
        public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> essentialProperties;
        public final com.google.android.exoplayer2.Format format;
        public final java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.Descriptor> inbandEventStreams;
        public final long revisionId;
        public final com.google.android.exoplayer2.source.dash.manifest.SegmentBase segmentBase;
        public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> supplementalProperties;

        public RepresentationInfo(com.google.android.exoplayer2.Format r1, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r2, com.google.android.exoplayer2.source.dash.manifest.SegmentBase r3, @androidx.annotation.Nullable java.lang.String r4, java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r5, java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r6, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r7, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r8, long r9) {
                r0 = this;
                r0.<init>()
                r0.format = r1
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r2)
                r0.baseUrls = r1
                r0.segmentBase = r3
                r0.drmSchemeType = r4
                r0.drmSchemeDatas = r5
                r0.inbandEventStreams = r6
                r0.essentialProperties = r7
                r0.supplementalProperties = r8
                r0.revisionId = r9
                return
        }
    }

    static {
            java.lang.String r0 = "(\\d+)(?:/(\\d+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.FRAME_RATE_PATTERN = r0
            java.lang.String r0 = "CC([1-4])=.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.CEA_608_ACCESSIBILITY_PATTERN = r0
            java.lang.String r0 = "([1-9]|[1-5][0-9]|6[0-3])=.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.CEA_708_ACCESSIBILITY_PATTERN = r0
            r0 = 21
            int[] r0 = new int[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14} // fill-array
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.MPEG_CHANNEL_CONFIGURATION_MAPPING = r0
            return
    }

    public DashManifestParser() {
            r3 = this;
            r3.<init>()
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> La
            r3.xmlParserFactory = r0     // Catch: org.xmlpull.v1.XmlPullParserException -> La
            return
        La:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't create XmlPullParserFactory instance"
            r1.<init>(r2, r0)
            throw r1
    }

    private long addSegmentTimelineElementsToList(java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement> r1, long r2, long r4, int r6, long r7) {
            r0 = this;
            if (r6 < 0) goto L5
            int r6 = r6 + 1
            goto Lb
        L5:
            long r7 = r7 - r2
            long r6 = com.google.android.exoplayer2.util.Util.ceilDivide(r7, r4)
            int r6 = (int) r6
        Lb:
            r7 = 0
        Lc:
            if (r7 >= r6) goto L1a
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement r8 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement
            r8.<init>(r2, r4)
            r1.add(r8)
            long r2 = r2 + r4
            int r7 = r7 + 1
            goto Lc
        L1a:
            return r2
    }

    private static int checkContentTypeConsistency(int r1, int r2) {
            r0 = -1
            if (r1 != r0) goto L4
            return r2
        L4:
            if (r2 != r0) goto L7
            return r1
        L7:
            if (r1 != r2) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            com.google.android.exoplayer2.util.Assertions.checkState(r2)
            return r1
    }

    @androidx.annotation.Nullable
    private static java.lang.String checkLanguageConsistency(@androidx.annotation.Nullable java.lang.String r0, @androidx.annotation.Nullable java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            if (r1 != 0) goto L6
            return r0
        L6:
            boolean r1 = r0.equals(r1)
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            return r0
    }

    private static void fillInClearKeyInformation(java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L23
            java.lang.Object r2 = r6.get(r1)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r2
            java.util.UUID r3 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            java.util.UUID r4 = r2.uuid
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L20
            java.lang.String r2 = r2.licenseServerUrl
            if (r2 == 0) goto L20
            r6.remove(r1)
            goto L24
        L20:
            int r1 = r1 + 1
            goto L2
        L23:
            r2 = 0
        L24:
            if (r2 != 0) goto L27
            return
        L27:
            int r1 = r6.size()
            if (r0 >= r1) goto L52
            java.lang.Object r1 = r6.get(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
            java.util.UUID r3 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            java.util.UUID r4 = r1.uuid
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4f
            java.lang.String r3 = r1.licenseServerUrl
            if (r3 != 0) goto L4f
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r3 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r4 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            java.lang.String r5 = r1.mimeType
            byte[] r1 = r1.data
            r3.<init>(r4, r2, r5, r1)
            r6.set(r0, r3)
        L4f:
            int r0 = r0 + 1
            goto L27
        L52:
            return
    }

    private static void filterRedundantIncompleteSchemeDatas(java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r4) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L31
            java.lang.Object r1 = r4.get(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r1 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r1
            boolean r2 = r1.hasData()
            if (r2 != 0) goto L2e
            r2 = 0
        L15:
            int r3 = r4.size()
            if (r2 >= r3) goto L2e
            java.lang.Object r3 = r4.get(r2)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r3
            boolean r3 = r3.canReplace(r1)
            if (r3 == 0) goto L2b
            r4.remove(r0)
            goto L2e
        L2b:
            int r2 = r2 + 1
            goto L15
        L2e:
            int r0 = r0 + (-1)
            goto L6
        L31:
            return
    }

    private static long getFinalAvailabilityTimeOffset(long r3, long r5) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto Lb
        La:
            r3 = r5
        Lb:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L15
            goto L16
        L15:
            r0 = r3
        L16:
            return r0
    }

    @androidx.annotation.Nullable
    private static java.lang.String getSampleMimeType(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2) {
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r1)
            if (r0 == 0) goto Lb
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.getAudioMediaMimeType(r2)
            return r1
        Lb:
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r1)
            if (r0 == 0) goto L16
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.getVideoMediaMimeType(r2)
            return r1
        L16:
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isText(r1)
            if (r0 == 0) goto L1d
            return r1
        L1d:
            boolean r0 = com.google.android.exoplayer2.util.MimeTypes.isImage(r1)
            if (r0 == 0) goto L24
            return r1
        L24:
            java.lang.String r0 = "application/mp4"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r2)
            java.lang.String r2 = "text/vtt"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3b
            java.lang.String r1 = "application/x-mp4-vtt"
        L3b:
            return r1
        L3c:
            r1 = 0
            return r1
    }

    private boolean isDvbProfileDeclared(java.lang.String[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            java.lang.String r4 = "urn:dvb:dash:profile:dvb-dash:"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L12
            r6 = 1
            return r6
        L12:
            int r2 = r2 + 1
            goto L3
        L15:
            return r1
    }

    public static void maybeSkipTag(org.xmlpull.v1.XmlPullParser r2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
        L8:
            if (r0 == 0) goto L1f
            r2.next()
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2)
            if (r1 == 0) goto L16
            int r0 = r0 + 1
            goto L8
        L16:
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r2)
            if (r1 == 0) goto L8
            int r0 = r0 + (-1)
            goto L8
        L1f:
            return
    }

    public static com.google.android.exoplayer2.source.dash.manifest.Descriptor parseDescriptor(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r4.getAttributeValue(r0, r1)
            if (r1 != 0) goto Lc
            java.lang.String r1 = ""
        Lc:
            java.lang.String r2 = "value"
            java.lang.String r2 = r4.getAttributeValue(r0, r2)
            if (r2 != 0) goto L16
            r2 = r0
        L16:
            java.lang.String r3 = "id"
            java.lang.String r3 = r4.getAttributeValue(r0, r3)
            if (r3 != 0) goto L1f
            goto L20
        L1f:
            r0 = r3
        L20:
            r4.next()
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r4, r5)
            if (r3 == 0) goto L20
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r4 = new com.google.android.exoplayer2.source.dash.manifest.Descriptor
            r4.<init>(r1, r2, r0)
            return r4
    }

    public static long parseDuration(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, long r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            return r3
        L8:
            long r1 = com.google.android.exoplayer2.util.Util.parseXsDuration(r1)
            return r1
    }

    public static float parseFrameRate(org.xmlpull.v1.XmlPullParser r2, float r3) {
            r0 = 0
            java.lang.String r1 = "frameRate"
            java.lang.String r2 = r2.getAttributeValue(r0, r1)
            if (r2 == 0) goto L32
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.FRAME_RATE_PATTERN
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L32
            r3 = 1
            java.lang.String r3 = r2.group(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            r0 = 2
            java.lang.String r2 = r2.group(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L31
            float r3 = (float) r3
            int r2 = java.lang.Integer.parseInt(r2)
            float r2 = (float) r2
            float r3 = r3 / r2
            goto L32
        L31:
            float r3 = (float) r3
        L32:
            return r3
    }

    public static int parseInt(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            goto Lc
        L8:
            int r3 = java.lang.Integer.parseInt(r1)
        Lc:
            return r3
    }

    public static long parseLong(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, long r3) {
            r0 = 0
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 != 0) goto L8
            goto Lc
        L8:
            long r3 = java.lang.Long.parseLong(r1)
        Lc:
            return r3
    }

    public static java.lang.String parseText(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            java.lang.String r0 = ""
        L2:
            r3.next()
            int r1 = r3.getEventType()
            r2 = 4
            if (r1 != r2) goto L11
            java.lang.String r0 = r3.getText()
            goto L14
        L11:
            maybeSkipTag(r3)
        L14:
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r3, r4)
            if (r1 == 0) goto L2
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public com.google.android.exoplayer2.source.dash.manifest.DashManifest parse(android.net.Uri r4, java.io.InputStream r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
            org.xmlpull.v1.XmlPullParserFactory r1 = r3.xmlParserFactory     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            r1.setInput(r5, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            int r5 = r1.next()     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            r2 = 2
            if (r5 != r2) goto L22
            java.lang.String r5 = "MPD"
            java.lang.String r2 = r1.getName()     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            boolean r5 = r5.equals(r2)     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            if (r5 == 0) goto L22
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r4 = r3.parseMediaPresentationDescription(r1, r4)     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            return r4
        L22:
            java.lang.String r4 = "inputStream does not contain a valid media presentation description"
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r4, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
            throw r4     // Catch: org.xmlpull.v1.XmlPullParserException -> L29
        L29:
            r4 = move-exception
            com.google.android.exoplayer2.ParserException r4 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r4)
            throw r4
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.dash.manifest.DashManifest parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r1 = r0.parse(r1, r2)
            return r1
    }

    public final int parseAudioChannelConfiguration(org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r9 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            if (r1 != 0) goto Lb
            r1 = r0
        Lb:
            java.util.Objects.requireNonNull(r1)
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 6
            r5 = 3
            r6 = -1
            r7 = 1
            r8 = 2
            switch(r2) {
                case -2128649360: goto L64;
                case -1352850286: goto L58;
                case -1138141449: goto L4c;
                case -986633423: goto L40;
                case -79006963: goto L34;
                case 312179081: goto L28;
                case 2036691300: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L70
        L1c:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L26
            goto L70
        L26:
            r1 = 6
            goto L71
        L28:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L32
            goto L70
        L32:
            r1 = 5
            goto L71
        L34:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
            goto L70
        L3e:
            r1 = 4
            goto L71
        L40:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4a
            goto L70
        L4a:
            r1 = 3
            goto L71
        L4c:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L70
        L56:
            r1 = 2
            goto L71
        L58:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L62
            goto L70
        L62:
            r1 = 1
            goto L71
        L64:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            goto L70
        L6e:
            r1 = 0
            goto L71
        L70:
            r1 = -1
        L71:
            java.lang.String r2 = "value"
            switch(r1) {
                case 0: goto Lf8;
                case 1: goto Lf3;
                case 2: goto La1;
                case 3: goto L92;
                case 4: goto Lf8;
                case 5: goto L79;
                case 6: goto La1;
                default: goto L77;
            }
        L77:
            goto L103
        L79:
            java.lang.String r0 = r10.getAttributeValue(r0, r2)
            if (r0 != 0) goto L81
            goto L103
        L81:
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 != 0) goto L8f
            goto L103
        L8f:
            r6 = r0
            goto L103
        L92:
            int r0 = parseInt(r10, r2, r6)
            if (r0 < 0) goto L103
            int[] r1 = com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.MPEG_CHANNEL_CONFIGURATION_MAPPING
            int r2 = r1.length
            if (r0 >= r2) goto L103
            r6 = r1[r0]
            goto L103
        La1:
            java.lang.String r0 = r10.getAttributeValue(r0, r2)
            if (r0 != 0) goto La8
            goto Le9
        La8:
            java.lang.String r0 = com.google.common.base.Ascii.toLowerCase(r0)
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto Ld8;
                case 2937391: goto Lcd;
                case 3094035: goto Lc2;
                case 3133436: goto Lb7;
                default: goto Lb6;
            }
        Lb6:
            goto Le0
        Lb7:
            java.lang.String r1 = "fa01"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc0
            goto Le0
        Lc0:
            r3 = 3
            goto Le1
        Lc2:
            java.lang.String r1 = "f801"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lcb
            goto Le0
        Lcb:
            r3 = 2
            goto Le1
        Lcd:
            java.lang.String r1 = "a000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld6
            goto Le0
        Ld6:
            r3 = 1
            goto Le1
        Ld8:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le1
        Le0:
            r3 = -1
        Le1:
            if (r3 == 0) goto Lf0
            if (r3 == r7) goto Lee
            if (r3 == r8) goto Lf1
            if (r3 == r5) goto Leb
        Le9:
            r4 = -1
            goto Lf1
        Leb:
            r4 = 8
            goto Lf1
        Lee:
            r4 = 2
            goto Lf1
        Lf0:
            r4 = 1
        Lf1:
            r6 = r4
            goto L103
        Lf3:
            int r6 = parseInt(r10, r2, r6)
            goto L103
        Lf8:
            int r0 = parseInt(r10, r2, r6)
            if (r0 <= 0) goto L103
            r1 = 33
            if (r0 >= r1) goto L103
            goto L8f
        L103:
            r10.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r10, r0)
            if (r0 == 0) goto L103
            return r6
    }

    public final long parseAvailabilityTimeOffsetUs(org.xmlpull.v1.XmlPullParser r3, long r4) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "availabilityTimeOffset"
            java.lang.String r3 = r3.getAttributeValue(r0, r1)
            if (r3 != 0) goto La
            return r4
        La:
            java.lang.String r4 = "INF"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L18
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r3
        L18:
            float r3 = java.lang.Float.parseFloat(r3)
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 * r4
            long r3 = (long) r3
            return r3
    }

    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> parseBaseUrl(org.xmlpull.v1.XmlPullParser r9, java.util.List<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r10, boolean r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r8 = this;
            r0 = 0
            java.lang.String r1 = "dvb:priority"
            java.lang.String r1 = r9.getAttributeValue(r0, r1)
            r2 = 1
            if (r1 == 0) goto Lf
            int r1 = java.lang.Integer.parseInt(r1)
            goto L15
        Lf:
            if (r11 == 0) goto L13
            r1 = 1
            goto L15
        L13:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L15:
            java.lang.String r3 = "dvb:weight"
            java.lang.String r3 = r9.getAttributeValue(r0, r3)
            if (r3 == 0) goto L22
            int r3 = java.lang.Integer.parseInt(r3)
            goto L23
        L22:
            r3 = 1
        L23:
            java.lang.String r4 = "serviceLocation"
            java.lang.String r0 = r9.getAttributeValue(r0, r4)
            java.lang.String r4 = "BaseURL"
            java.lang.String r9 = parseText(r9, r4)
            boolean r4 = com.google.android.exoplayer2.util.UriUtil.isAbsolute(r9)
            r5 = 0
            if (r4 == 0) goto L48
            if (r0 != 0) goto L3a
            r0 = r9
        L3a:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl[] r10 = new com.google.android.exoplayer2.source.dash.manifest.BaseUrl[r2]
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r11 = new com.google.android.exoplayer2.source.dash.manifest.BaseUrl
            r11.<init>(r9, r0, r1, r3)
            r10[r5] = r11
            java.util.ArrayList r9 = com.google.common.collect.Lists.newArrayList(r10)
            return r9
        L48:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4d:
            int r4 = r10.size()
            if (r5 >= r4) goto L77
            java.lang.Object r4 = r10.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r4
            java.lang.String r6 = r4.url
            java.lang.String r6 = com.google.android.exoplayer2.util.UriUtil.resolve(r6, r9)
            if (r0 != 0) goto L63
            r7 = r6
            goto L64
        L63:
            r7 = r0
        L64:
            if (r11 == 0) goto L6c
            int r1 = r4.priority
            int r3 = r4.weight
            java.lang.String r7 = r4.serviceLocation
        L6c:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = new com.google.android.exoplayer2.source.dash.manifest.BaseUrl
            r4.<init>(r6, r7, r1, r3)
            r2.add(r4)
            int r5 = r5 + 1
            goto L4d
        L77:
            return r2
    }

    public final android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r10 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L94
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            java.util.Objects.requireNonNull(r1)
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1980789791: goto L3f;
                case 489446379: goto L33;
                case 755418770: goto L27;
                case 1812765994: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L4a
        L1b:
            java.lang.String r4 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L25
            goto L4a
        L25:
            r3 = 3
            goto L4a
        L27:
            java.lang.String r4 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L31
            goto L4a
        L31:
            r3 = 2
            goto L4a
        L33:
            java.lang.String r4 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L3d
            goto L4a
        L3d:
            r3 = 1
            goto L4a
        L3f:
            java.lang.String r4 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L49
            goto L4a
        L49:
            r3 = 0
        L4a:
            switch(r3) {
                case 0: goto L8f;
                case 1: goto L8c;
                case 2: goto L89;
                case 3: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L94
        L4e:
            java.lang.String r1 = "value"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            java.lang.String r3 = "default_KID"
            java.lang.String r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValueIgnorePrefix(r11, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L95
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L95
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L73:
            int r6 = r3.length
            if (r5 >= r6) goto L81
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L73
        L81:
            java.util.UUID r3 = com.google.android.exoplayer2.C.COMMON_PSSH_UUID
            byte[] r4 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r3, r4, r0)
            r5 = r0
            goto L98
        L89:
            java.util.UUID r1 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            goto L91
        L8c:
            java.util.UUID r1 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            goto L91
        L8f:
            java.util.UUID r1 = com.google.android.exoplayer2.C.CLEARKEY_UUID
        L91:
            r3 = r1
            r1 = r0
            goto L96
        L94:
            r1 = r0
        L95:
            r3 = r0
        L96:
            r4 = r0
            r5 = r4
        L98:
            r11.next()
            java.lang.String r6 = "clearkey:Laurl"
            boolean r6 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r11, r6)
            r7 = 4
            if (r6 == 0) goto Lb0
            int r6 = r11.next()
            if (r6 != r7) goto Lb0
            java.lang.String r5 = r11.getText()
            goto L114
        Lb0:
            java.lang.String r6 = "ms:laurl"
            boolean r6 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r11, r6)
            if (r6 == 0) goto Lbf
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r0, r5)
            goto L114
        Lbf:
            if (r4 != 0) goto Lec
            java.lang.String r6 = "pssh"
            boolean r6 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTagIgnorePrefix(r11, r6)
            if (r6 == 0) goto Lec
            int r6 = r11.next()
            if (r6 != r7) goto Lec
            java.lang.String r3 = r11.getText()
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.util.UUID r4 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.parseUuid(r3)
            if (r4 != 0) goto Le8
            java.lang.String r3 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            com.google.android.exoplayer2.util.Log.w(r3, r6)
            r3 = r4
            r4 = r0
            goto L114
        Le8:
            r9 = r4
            r4 = r3
            r3 = r9
            goto L114
        Lec:
            if (r4 != 0) goto L111
            java.util.UUID r6 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            boolean r8 = r6.equals(r3)
            if (r8 == 0) goto L111
            java.lang.String r8 = "mspr:pro"
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r11, r8)
            if (r8 == 0) goto L111
            int r8 = r11.next()
            if (r8 != r7) goto L111
            java.lang.String r4 = r11.getText()
            byte[] r4 = android.util.Base64.decode(r4, r2)
            byte[] r4 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r6, r4)
            goto L114
        L111:
            maybeSkipTag(r11)
        L114:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r11, r6)
            if (r6 == 0) goto L98
            if (r3 == 0) goto L126
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r11 = "video/mp4"
            r0.<init>(r3, r5, r11, r4)
        L126:
            android.util.Pair r11 = android.util.Pair.create(r1, r0)
            return r11
    }

    public final int parseContentType(org.xmlpull.v1.XmlPullParser r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "contentType"
            java.lang.String r3 = r3.getAttributeValue(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            goto L38
        Le:
            java.lang.String r0 = "audio"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L18
            r3 = 1
            goto L39
        L18:
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L23
            r3 = 2
            goto L39
        L23:
            java.lang.String r0 = "text"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2e
            r3 = 3
            goto L39
        L2e:
            java.lang.String r0 = "image"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L38
            r3 = 4
            goto L39
        L38:
            r3 = -1
        L39:
            return r3
    }

    public final com.google.android.exoplayer2.source.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser r145, android.net.Uri r146) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r144 = this;
            r14 = r144
            r15 = r145
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "profiles"
            java.lang.String r3 = r15.getAttributeValue(r2, r3)
            if (r3 != 0) goto L12
            goto L18
        L12:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r3.split(r1)
        L18:
            boolean r13 = r14.isDvbProfileDeclared(r1)
            java.lang.String r1 = "availabilityStartTime"
            java.lang.String r1 = r15.getAttributeValue(r2, r1)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2c
            r16 = r3
            goto L32
        L2c:
            long r5 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r1)
            r16 = r5
        L32:
            java.lang.String r1 = "mediaPresentationDuration"
            long r18 = parseDuration(r15, r1, r3)
            java.lang.String r1 = "minBufferTime"
            long r20 = parseDuration(r15, r1, r3)
            java.lang.String r1 = "type"
            java.lang.String r1 = r15.getAttributeValue(r2, r1)
            java.lang.String r5 = "dynamic"
            boolean r22 = r5.equals(r1)
            if (r22 == 0) goto L56
            java.lang.String r1 = "minimumUpdatePeriod"
            long r5 = parseDuration(r15, r1, r3)
            r23 = r5
            goto L58
        L56:
            r23 = r3
        L58:
            if (r22 == 0) goto L64
            java.lang.String r1 = "timeShiftBufferDepth"
            long r5 = parseDuration(r15, r1, r3)
            r25 = r5
            goto L66
        L64:
            r25 = r3
        L66:
            if (r22 == 0) goto L72
            java.lang.String r1 = "suggestedPresentationDelay"
            long r5 = parseDuration(r15, r1, r3)
            r27 = r5
            goto L74
        L72:
            r27 = r3
        L74:
            java.lang.String r1 = "publishTime"
            java.lang.String r1 = r15.getAttributeValue(r2, r1)
            if (r1 != 0) goto L80
            r29 = r3
            goto L86
        L80:
            long r5 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r1)
            r29 = r5
        L86:
            if (r22 == 0) goto L8b
            r5 = 0
            goto L8c
        L8b:
            r5 = r3
        L8c:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = new com.google.android.exoplayer2.source.dash.manifest.BaseUrl
            java.lang.String r7 = r146.toString()
            java.lang.String r8 = r146.toString()
            r9 = 1
            if (r13 == 0) goto L9b
            r10 = 1
            goto L9d
        L9b:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L9d:
            r1.<init>(r7, r8, r10, r9)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl[] r7 = new com.google.android.exoplayer2.source.dash.manifest.BaseUrl[r9]
            r7[r0] = r1
            java.util.ArrayList r11 = com.google.common.collect.Lists.newArrayList(r7)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r22 == 0) goto Lb5
            goto Lb7
        Lb5:
            r3 = 0
        Lb7:
            r0 = 0
            r1 = 0
            r33 = r2
            r34 = r33
            r35 = r34
            r36 = r35
            r7 = r3
            r0 = r14
            r31 = 0
            r32 = 0
        Lc7:
            r145.next()
            java.lang.String r10 = "BaseURL"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r10)
            if (r1 == 0) goto Le3
            if (r31 != 0) goto Lda
            long r5 = r0.parseAvailabilityTimeOffsetUs(r15, r5)
            r31 = 1
        Lda:
            java.util.List r1 = r0.parseBaseUrl(r15, r11, r13)
            r9.addAll(r1)
            goto L17e
        Le3:
            java.lang.String r1 = "ProgramInformation"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r1)
            java.lang.String r3 = "lang"
            if (r2 == 0) goto L148
            java.lang.String r2 = "moreInformationURL"
            r4 = 0
            java.lang.String r2 = r15.getAttributeValue(r4, r2)
            if (r2 != 0) goto Lf9
            r41 = r4
            goto Lfb
        Lf9:
            r41 = r2
        Lfb:
            java.lang.String r2 = r15.getAttributeValue(r4, r3)
            if (r2 != 0) goto L102
            r2 = 0
        L102:
            r42 = r2
            r2 = 0
            r3 = 0
            r4 = 0
        L107:
            r145.next()
            java.lang.String r10 = "Title"
            boolean r10 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r10)
            if (r10 == 0) goto L117
            java.lang.String r2 = r145.nextText()
            goto L134
        L117:
            java.lang.String r10 = "Source"
            boolean r10 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r10)
            if (r10 == 0) goto L124
            java.lang.String r3 = r145.nextText()
            goto L134
        L124:
            java.lang.String r10 = "Copyright"
            boolean r10 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r10)
            if (r10 == 0) goto L131
            java.lang.String r4 = r145.nextText()
            goto L134
        L131:
            maybeSkipTag(r145)
        L134:
            boolean r10 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r15, r1)
            if (r10 == 0) goto L107
            com.google.android.exoplayer2.source.dash.manifest.ProgramInformation r33 = new com.google.android.exoplayer2.source.dash.manifest.ProgramInformation
            r37 = r33
            r38 = r2
            r39 = r3
            r40 = r4
            r37.<init>(r38, r39, r40, r41, r42)
            goto L17e
        L148:
            java.lang.String r1 = "UTCTiming"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r1)
            java.lang.String r4 = "value"
            java.lang.String r2 = "schemeIdUri"
            if (r1 == 0) goto L16a
            r1 = 0
            java.lang.String r2 = r15.getAttributeValue(r1, r2)
            java.lang.String r1 = r15.getAttributeValue(r1, r4)
            com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement r3 = new com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement
            r3.<init>(r2, r1)
            r43 = r0
            r36 = r3
            goto L226
        L16a:
            java.lang.String r1 = "Location"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r1)
            if (r1 == 0) goto L182
            java.lang.String r1 = r146.toString()
            java.lang.String r2 = r145.nextText()
            android.net.Uri r34 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r1, r2)
        L17e:
            r43 = r0
            goto L226
        L182:
            java.lang.String r1 = "ServiceDescription"
            boolean r37 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r1)
            if (r37 == 0) goto L244
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r37 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r39 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r41 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L19f:
            r145.next()
            java.lang.String r4 = "Latency"
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r4)
            java.lang.String r10 = "max"
            r43 = r0
            java.lang.String r0 = "min"
            if (r4 == 0) goto L1d3
            java.lang.String r4 = "target"
            r35 = r2
            r44 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r37 = parseLong(r15, r4, r2)
            long r39 = parseLong(r15, r0, r2)
            long r2 = parseLong(r15, r10, r2)
            r49 = r2
            r51 = r35
            r45 = r37
            r47 = r39
            r52 = r44
            goto L217
        L1d3:
            r35 = r2
            r44 = r3
            java.lang.String r2 = "PlaybackRate"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r2)
            if (r2 == 0) goto L209
            r2 = 0
            java.lang.String r0 = r15.getAttributeValue(r2, r0)
            if (r0 != 0) goto L1ea
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L1ee
        L1ea:
            float r0 = java.lang.Float.parseFloat(r0)
        L1ee:
            java.lang.String r2 = r15.getAttributeValue(r2, r10)
            if (r2 != 0) goto L203
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r51 = r0
            r45 = r37
            r47 = r39
            r49 = r41
            r52 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L217
        L203:
            float r3 = java.lang.Float.parseFloat(r2)
            r2 = r0
            goto L20d
        L209:
            r2 = r35
            r3 = r44
        L20d:
            r51 = r2
            r52 = r3
            r45 = r37
            r47 = r39
            r49 = r41
        L217:
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r15, r1)
            if (r0 == 0) goto L236
            com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement r0 = new com.google.android.exoplayer2.source.dash.manifest.ServiceDescriptionElement
            r44 = r0
            r44.<init>(r45, r47, r49, r51, r52)
            r35 = r0
        L226:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r69 = r5
            r75 = r9
            r53 = r11
            r6 = r12
            r76 = r13
            goto L1148
        L236:
            r0 = r43
            r37 = r45
            r39 = r47
            r41 = r49
            r2 = r51
            r3 = r52
            goto L19f
        L244:
            r43 = r0
            java.lang.String r1 = "Period"
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r1)
            if (r0 == 0) goto L112b
            if (r32 != 0) goto L112b
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L258
            r0 = r9
            goto L259
        L258:
            r0 = r11
        L259:
            java.lang.String r14 = "id"
            r37 = r1
            r1 = 0
            java.lang.String r39 = r15.getAttributeValue(r1, r14)
            java.lang.String r1 = "start"
            long r40 = parseDuration(r15, r1, r7)
            r38 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r42 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r42 == 0) goto L279
            long r42 = r16 + r40
            r44 = r42
            goto L27b
        L279:
            r44 = r1
        L27b:
            r42 = r11
            java.lang.String r11 = "duration"
            long r46 = parseDuration(r15, r11, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r43 = 0
            r48 = 0
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r51 = 0
            r55 = r1
            r52 = r2
            r54 = r11
            r53 = r12
            r1 = r144
            r2 = r145
            r11 = r5
        L2aa:
            r145.next()
            boolean r56 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r10)
            if (r56 == 0) goto L2ef
            if (r51 != 0) goto L2bb
            long r11 = r1.parseAvailabilityTimeOffsetUs(r2, r11)
            r51 = 1
        L2bb:
            r56 = r4
            java.util.List r4 = r1.parseBaseUrl(r2, r0, r13)
            r15.addAll(r4)
            r57 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r99 = r0
            r69 = r5
            r132 = r7
            r75 = r9
            r101 = r10
            r76 = r13
            r0 = r43
            r60 = r52
            r135 = r54
            r52 = r3
            r3 = r37
            r54 = r53
            r37 = r14
            r53 = r42
            r42 = r15
            r15 = r55
            r55 = r38
            r38 = r56
            goto L10a2
        L2ef:
            r56 = r4
            java.lang.String r4 = "AdaptationSet"
            boolean r57 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r4)
            r58 = r11
            java.lang.String r11 = "SegmentTemplate"
            java.lang.String r12 = "SegmentList"
            r60 = r11
            java.lang.String r11 = "SegmentBase"
            if (r57 == 0) goto Lde7
            boolean r57 = r15.isEmpty()
            r61 = r0
            if (r57 != 0) goto L30e
            r57 = r15
            goto L312
        L30e:
            r57 = r15
            r15 = r61
        L312:
            r0 = -1
            int r63 = parseInt(r2, r14, r0)
            int r0 = r144.parseContentType(r145)
            r62 = r9
            java.lang.String r9 = "mimeType"
            r64 = r0
            r0 = 0
            java.lang.String r65 = r2.getAttributeValue(r0, r9)
            r66 = r7
            java.lang.String r7 = "codecs"
            java.lang.String r68 = r2.getAttributeValue(r0, r7)
            java.lang.String r8 = "width"
            r0 = -1
            r69 = r5
            int r5 = parseInt(r2, r8, r0)
            java.lang.String r6 = "height"
            int r0 = parseInt(r2, r6, r0)
            r71 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = parseFrameRate(r2, r1)
            r72 = r4
            java.lang.String r4 = "audioSamplingRate"
            r73 = r12
            r12 = -1
            int r12 = parseInt(r2, r4, r12)
            r74 = r11
            r11 = 0
            java.lang.String r75 = r2.getAttributeValue(r11, r3)
            r76 = r4
            java.lang.String r4 = "label"
            java.lang.String r2 = r2.getAttributeValue(r11, r4)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r77 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r78 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r79 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r80 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r81 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r82 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r83 = -1
            r84 = 0
            r85 = 0
            r88 = r1
            r87 = r2
            r86 = r6
            r91 = r48
            r89 = r49
            r1 = r58
            r6 = r64
            r64 = r5
            r5 = r71
            r71 = r8
            r8 = r75
            r75 = r7
            r7 = r145
        L3b4:
            r145.next()
            boolean r92 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r10)
            if (r92 == 0) goto L3cf
            if (r85 != 0) goto L3c5
            long r1 = r5.parseAvailabilityTimeOffsetUs(r7, r1)
            r85 = 1
        L3c5:
            java.util.List r5 = r5.parseBaseUrl(r7, r15, r13)
            r0.addAll(r5)
            r92 = r15
            goto L40c
        L3cf:
            r92 = r15
            java.lang.String r15 = "ContentProtection"
            boolean r93 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r15)
            if (r93 == 0) goto L3ef
            android.util.Pair r5 = r144.parseContentProtection(r145)
            java.lang.Object r15 = r5.first
            if (r15 == 0) goto L3e5
            r84 = r15
            java.lang.String r84 = (java.lang.String) r84
        L3e5:
            java.lang.Object r5 = r5.second
            if (r5 == 0) goto L40c
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r5 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r5
            r11.add(r5)
            goto L40c
        L3ef:
            r93 = r1
            java.lang.String r1 = "ContentComponent"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r1 == 0) goto L411
            r1 = 0
            java.lang.String r1 = r7.getAttributeValue(r1, r3)
            java.lang.String r8 = checkLanguageConsistency(r8, r1)
            int r1 = r144.parseContentType(r145)
            int r6 = checkContentTypeConsistency(r6, r1)
            r1 = r93
        L40c:
            r93 = r1
            r2 = r87
            goto L432
        L411:
            java.lang.String r1 = "Role"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r2 == 0) goto L424
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r7, r1)
            r2 = r87
            r2.add(r1)
            goto L4a5
        L424:
            r2 = r87
            java.lang.String r1 = "AudioChannelConfiguration"
            boolean r87 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r87 == 0) goto L484
            int r83 = r144.parseAudioChannelConfiguration(r145)
        L432:
            r15 = r145
            r101 = r10
            r138 = r11
            r103 = r14
            r123 = r37
            r125 = r38
            r126 = r52
            r135 = r54
            r124 = r55
            r127 = r56
            r141 = r60
            r99 = r61
            r132 = r66
            r66 = r71
            r136 = r73
            r14 = r74
            r56 = r76
            r60 = r79
            r37 = r80
            r74 = r81
            r55 = r88
            r67 = r2
            r52 = r3
            r38 = r4
            r61 = r12
            r76 = r13
            r54 = r53
            r71 = r64
            r4 = r72
            r64 = r75
            r3 = r77
            r72 = r82
            r77 = r86
            r1 = r93
            r82 = r0
            r53 = r42
            r42 = r57
            r75 = r62
            r0 = r78
            r62 = r9
            goto Lcfc
        L484:
            r87 = r2
            java.lang.String r2 = "Accessibility"
            boolean r95 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r2)
            if (r95 == 0) goto L496
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r7, r2)
            r4.add(r1)
            goto L4a5
        L496:
            java.lang.String r2 = "EssentialProperty"
            boolean r95 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r2)
            if (r95 == 0) goto L4a8
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r7, r2)
            r12.add(r1)
        L4a5:
            r2 = r88
            goto L4bb
        L4a8:
            r95 = r15
            java.lang.String r15 = "SupplementalProperty"
            boolean r96 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r15)
            if (r96 == 0) goto L50f
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r1 = parseDescriptor(r7, r15)
            r2 = r88
            r2.add(r1)
        L4bb:
            r15 = r145
            r101 = r10
            r138 = r11
            r103 = r14
            r123 = r37
            r125 = r38
            r126 = r52
            r135 = r54
            r124 = r55
            r127 = r56
            r141 = r60
            r99 = r61
            r132 = r66
            r66 = r71
            r128 = r72
            r136 = r73
            r14 = r74
            r56 = r76
            r60 = r79
            r37 = r80
            r74 = r81
            r72 = r82
            r67 = r87
            r82 = r0
            r55 = r2
            r52 = r3
            r38 = r4
            r73 = r6
            r61 = r12
            r76 = r13
            r54 = r53
            r71 = r64
            r64 = r75
            r3 = r77
            r77 = r86
            r1 = r89
            r53 = r42
            r42 = r57
            r75 = r62
            r57 = r8
            r62 = r9
            goto Lcf0
        L50f:
            r96 = r15
            r142 = r88
            r88 = r2
            r2 = r142
            java.lang.String r15 = "Representation"
            boolean r97 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r15)
            r98 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r97 == 0) goto Lbeb
            boolean r97 = r0.isEmpty()
            if (r97 != 0) goto L536
            r97 = 0
            r99 = r0
            r100 = r11
            r0 = r97
            r97 = r15
            r15 = r99
            goto L542
        L536:
            r97 = 0
            r99 = r0
            r100 = r11
            r0 = r97
            r97 = r15
            r15 = r92
        L542:
            java.lang.String r11 = r7.getAttributeValue(r0, r14)
            r101 = r3
            java.lang.String r3 = "bandwidth"
            r102 = r4
            r4 = -1
            int r3 = parseInt(r7, r3, r4)
            java.lang.String r4 = r7.getAttributeValue(r0, r9)
            if (r4 != 0) goto L559
            r4 = r65
        L559:
            r142 = r75
            r75 = r8
            r8 = r142
            java.lang.String r0 = r7.getAttributeValue(r0, r8)
            r103 = r14
            if (r0 != 0) goto L569
            r0 = r68
        L569:
            r142 = r71
            r71 = r6
            r6 = r64
            r64 = r8
            r8 = r142
            int r14 = parseInt(r7, r8, r6)
            r104 = r6
            r6 = r86
            r86 = r14
            r142 = r81
            r81 = r0
            r0 = r142
            int r14 = parseInt(r7, r6, r0)
            r105 = r3
            r3 = r80
            r80 = r14
            float r14 = parseFrameRate(r7, r3)
            r106 = r3
            r3 = r76
            r76 = r11
            r11 = r79
            r79 = r14
            int r14 = parseInt(r7, r3, r11)
            r107 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r112 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r113 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r12)
            r114 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r2)
            r115 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r108 = 0
            r109 = 0
            r117 = r2
            r118 = r3
            r111 = r11
            r110 = r12
            r119 = r83
            r2 = r89
            r116 = r91
            r11 = r93
        L5d6:
            r145.next()
            boolean r120 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r10)
            if (r120 == 0) goto L5f1
            if (r109 != 0) goto L5e7
            long r11 = r5.parseAvailabilityTimeOffsetUs(r7, r11)
            r109 = 1
        L5e7:
            r120 = r0
            java.util.List r0 = r5.parseBaseUrl(r7, r15, r13)
            r14.addAll(r0)
            goto L610
        L5f1:
            r120 = r0
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r0 == 0) goto L5fe
            int r119 = r144.parseAudioChannelConfiguration(r145)
            goto L610
        L5fe:
            r0 = r74
            boolean r74 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r0)
            if (r74 == 0) goto L67d
            r74 = r0
            r0 = r116
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r0
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r116 = r5.parseSegmentBase(r7, r0)
        L610:
            r0 = 0
            r123 = r37
            r125 = r38
            r126 = r52
            r135 = r54
            r124 = r55
            r127 = r56
            r140 = r60
            r132 = r66
            r131 = r71
            r128 = r72
            r136 = r73
            r137 = r74
            r134 = r75
            r139 = r76
            r129 = r77
            r130 = r81
            r38 = r82
            r82 = r99
            r138 = r100
            r52 = r101
            r71 = r104
            r37 = r106
            r60 = r111
            r55 = r117
            r56 = r118
            r74 = r120
            r106 = r1
            r77 = r6
            r66 = r8
            r101 = r10
            r76 = r13
            r72 = r14
            r81 = r15
            r54 = r53
            r99 = r61
            r75 = r62
            r6 = r88
            r1 = r95
            r8 = r96
            r13 = r98
            r10 = r108
            r61 = r110
            r88 = r4
            r14 = r5
            r15 = r7
            r62 = r9
            r110 = r11
            r53 = r42
            r4 = r97
            r5 = r112
        L673:
            r7 = r113
            r9 = r114
            r11 = r115
        L679:
            r12 = r119
            goto L814
        L67d:
            r74 = r0
            r0 = r73
            boolean r73 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r0)
            if (r73 == 0) goto L70c
            long r121 = r5.parseAvailabilityTimeOffsetUs(r7, r2)
            r2 = r116
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r2 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList) r2
            r73 = r74
            r3 = r81
            r74 = r120
            r81 = r15
            r15 = r82
            r82 = r99
            r99 = r61
            r61 = r0
            r0 = r144
            r123 = r37
            r124 = r55
            r37 = r106
            r55 = r117
            r106 = r1
            r1 = r145
            r125 = r38
            r126 = r52
            r38 = r15
            r15 = r88
            r130 = r3
            r127 = r56
            r128 = r72
            r129 = r77
            r52 = r101
            r56 = r118
            r72 = r14
            r14 = r4
            r3 = r44
            r77 = r6
            r88 = r14
            r131 = r71
            r71 = r104
            r14 = r5
            r5 = r46
            r132 = r66
            r134 = r75
            r66 = r8
            r67 = r15
            r15 = r7
            r7 = r11
            r101 = r10
            r75 = r62
            r62 = r9
            r9 = r121
            r135 = r54
            r136 = r61
            r137 = r73
            r139 = r76
            r138 = r100
            r61 = r110
            r54 = r53
            r53 = r42
            r42 = r13
            r13 = r60
            r60 = r111
            r110 = r11
            r11 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = r0.parseSegmentList(r1, r2, r3, r5, r7, r9, r11)
            r1 = 0
            r116 = r0
            r140 = r13
            r76 = r42
            r2 = r121
            goto L78f
        L70c:
            r136 = r0
            r123 = r37
            r125 = r38
            r126 = r52
            r135 = r54
            r124 = r55
            r127 = r56
            r132 = r66
            r131 = r71
            r128 = r72
            r137 = r74
            r134 = r75
            r139 = r76
            r129 = r77
            r130 = r81
            r38 = r82
            r67 = r88
            r82 = r99
            r138 = r100
            r52 = r101
            r71 = r104
            r37 = r106
            r55 = r117
            r56 = r118
            r74 = r120
            r106 = r1
            r88 = r4
            r77 = r6
            r66 = r8
            r101 = r10
            r72 = r14
            r81 = r15
            r54 = r53
            r99 = r61
            r75 = r62
            r61 = r110
            r14 = r5
            r15 = r7
            r62 = r9
            r53 = r42
            r42 = r13
            r13 = r60
            r60 = r111
            r110 = r11
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r13)
            if (r0 == 0) goto L795
            long r117 = r14.parseAvailabilityTimeOffsetUs(r15, r2)
            r2 = r116
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r2 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate) r2
            r73 = 0
            r0 = r144
            r1 = r145
            r3 = r55
            r4 = r44
            r6 = r46
            r8 = r110
            r10 = r117
            r140 = r13
            r76 = r42
            r12 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r0 = r0.parseSegmentTemplate(r1, r2, r3, r4, r6, r8, r10, r12)
            r116 = r0
            r2 = r117
            r1 = 0
        L78f:
            r0 = r1
            r1 = r95
        L792:
            r5 = r112
            goto L7b9
        L795:
            r140 = r13
            r76 = r42
            r0 = 0
            r1 = r95
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r1)
            if (r4 == 0) goto L7c5
            android.util.Pair r4 = r144.parseContentProtection(r145)
            java.lang.Object r5 = r4.first
            if (r5 == 0) goto L7ae
            r108 = r5
            java.lang.String r108 = (java.lang.String) r108
        L7ae:
            java.lang.Object r4 = r4.second
            if (r4 == 0) goto L792
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r4 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) r4
            r5 = r112
            r5.add(r4)
        L7b9:
            r6 = r67
            r8 = r96
            r4 = r97
            r13 = r98
            r10 = r108
            goto L673
        L7c5:
            r4 = r97
            r5 = r112
            boolean r6 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r4)
            if (r6 == 0) goto L7dd
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r6 = parseDescriptor(r15, r4)
            r7 = r113
            r7.add(r6)
            r6 = r67
            r9 = r114
            goto L7f0
        L7dd:
            r6 = r67
            r7 = r113
            boolean r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r6)
            if (r8 == 0) goto L7f5
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r8 = parseDescriptor(r15, r6)
            r9 = r114
            r9.add(r8)
        L7f0:
            r8 = r96
            r11 = r115
            goto L80e
        L7f5:
            r8 = r96
            r9 = r114
            boolean r10 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r8)
            if (r10 == 0) goto L809
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r10 = parseDescriptor(r15, r8)
            r11 = r115
            r11.add(r10)
            goto L80e
        L809:
            r11 = r115
            maybeSkipTag(r145)
        L80e:
            r13 = r98
            r10 = r108
            goto L679
        L814:
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r15, r13)
            if (r15 == 0) goto Lb6e
            r15 = r88
            r1 = r130
            java.lang.String r2 = getSampleMimeType(r15, r1)
            java.lang.String r3 = "audio/eac3"
            boolean r4 = r3.equals(r2)
            java.lang.String r6 = "ec+3"
            if (r4 == 0) goto L87e
            r2 = 0
        L82d:
            int r4 = r11.size()
            java.lang.String r8 = "audio/eac3-joc"
            if (r2 >= r4) goto L871
            java.lang.Object r4 = r11.get(r2)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r4 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r4
            java.lang.String r13 = r4.schemeIdUri
            r130 = r1
            java.lang.String r1 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L855
            java.lang.String r1 = r4.value
            r42 = r3
            java.lang.String r3 = "JOC"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L868
            goto L857
        L855:
            r42 = r3
        L857:
            java.lang.String r1 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L86a
            java.lang.String r1 = r4.value
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L86a
        L868:
            r2 = r8
            goto L877
        L86a:
            int r2 = r2 + 1
            r3 = r42
            r1 = r130
            goto L82d
        L871:
            r130 = r1
            r42 = r3
            r2 = r42
        L877:
            boolean r1 = r8.equals(r2)
            if (r1 == 0) goto L880
            goto L882
        L87e:
            r130 = r1
        L880:
            r6 = r130
        L882:
            r1 = 0
            r3 = 0
        L884:
            int r4 = r87.size()
            java.lang.String r8 = "urn:mpeg:dash:role:2011"
            if (r3 >= r4) goto L8bf
            r4 = r87
            java.lang.Object r13 = r4.get(r3)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r13 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r13
            r113 = r7
            java.lang.String r7 = r13.schemeIdUri
            boolean r7 = com.google.common.base.Ascii.equalsIgnoreCase(r8, r7)
            if (r7 == 0) goto L8b8
            java.lang.String r7 = r13.value
            if (r7 != 0) goto L8a4
            goto L8b4
        L8a4:
            java.lang.String r8 = "forced_subtitle"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L8b6
            java.lang.String r8 = "forced-subtitle"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L8b6
        L8b4:
            r7 = 0
            goto L8b7
        L8b6:
            r7 = 2
        L8b7:
            r1 = r1 | r7
        L8b8:
            int r3 = r3 + 1
            r87 = r4
            r7 = r113
            goto L884
        L8bf:
            r113 = r7
            r4 = r87
            r3 = 0
            r7 = 0
        L8c5:
            int r13 = r4.size()
            if (r7 >= r13) goto L8e7
            java.lang.Object r13 = r4.get(r7)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r13 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r13
            r87 = r4
            java.lang.String r4 = r13.schemeIdUri
            boolean r4 = com.google.common.base.Ascii.equalsIgnoreCase(r8, r4)
            if (r4 == 0) goto L8e2
            java.lang.String r4 = r13.value
            int r4 = r14.parseRoleFlagsFromDashRoleScheme(r4)
            r3 = r3 | r4
        L8e2:
            int r7 = r7 + 1
            r4 = r87
            goto L8c5
        L8e7:
            r87 = r4
            r4 = 0
            r7 = 0
        L8eb:
            int r13 = r102.size()
            if (r7 >= r13) goto L98d
            r13 = r102
            java.lang.Object r42 = r13.get(r7)
            r112 = r5
            r5 = r42
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r5 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r5
            r42 = r10
            java.lang.String r10 = r5.schemeIdUri
            boolean r10 = com.google.common.base.Ascii.equalsIgnoreCase(r8, r10)
            if (r10 == 0) goto L912
            java.lang.String r5 = r5.value
            int r5 = r14.parseRoleFlagsFromDashRoleScheme(r5)
            r4 = r4 | r5
            r67 = r8
            goto L981
        L912:
            java.lang.String r10 = r5.schemeIdUri
            r67 = r8
            java.lang.String r8 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            boolean r8 = com.google.common.base.Ascii.equalsIgnoreCase(r8, r10)
            if (r8 == 0) goto L981
            java.lang.String r5 = r5.value
            if (r5 != 0) goto L924
            goto L972
        L924:
            int r8 = r5.hashCode()
            r10 = 3
            switch(r8) {
                case 49: goto L959;
                case 50: goto L94e;
                case 51: goto L943;
                case 52: goto L938;
                case 53: goto L92c;
                case 54: goto L92d;
                default: goto L92c;
            }
        L92c:
            goto L964
        L92d:
            java.lang.String r8 = "6"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L936
            goto L964
        L936:
            r5 = 4
            goto L965
        L938:
            java.lang.String r8 = "4"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L941
            goto L964
        L941:
            r5 = 3
            goto L965
        L943:
            java.lang.String r8 = "3"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L94c
            goto L964
        L94c:
            r5 = 2
            goto L965
        L94e:
            java.lang.String r8 = "2"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L957
            goto L964
        L957:
            r5 = 1
            goto L965
        L959:
            java.lang.String r8 = "1"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L962
            goto L964
        L962:
            r5 = 0
            goto L965
        L964:
            r5 = -1
        L965:
            if (r5 == 0) goto L97e
            r8 = 1
            if (r5 == r8) goto L97b
            r8 = 2
            if (r5 == r8) goto L979
            if (r5 == r10) goto L976
            r8 = 4
            if (r5 == r8) goto L974
        L972:
            r5 = 0
            goto L980
        L974:
            r5 = 1
            goto L980
        L976:
            r5 = 8
            goto L980
        L979:
            r5 = 4
            goto L980
        L97b:
            r5 = 2048(0x800, float:2.87E-42)
            goto L980
        L97e:
            r5 = 512(0x200, float:7.17E-43)
        L980:
            r4 = r4 | r5
        L981:
            int r7 = r7 + 1
            r102 = r13
            r10 = r42
            r8 = r67
            r5 = r112
            goto L8eb
        L98d:
            r112 = r5
            r42 = r10
            r13 = r102
            r3 = r3 | r4
            int r4 = r14.parseRoleFlagsFromProperties(r9)
            r3 = r3 | r4
            int r4 = r14.parseRoleFlagsFromProperties(r11)
            r3 = r3 | r4
            r4 = 0
        L99f:
            int r5 = r9.size()
            if (r4 >= r5) goto L9ec
            java.lang.Object r5 = r9.get(r4)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r5 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r5
            java.lang.String r7 = r5.schemeIdUri
            java.lang.String r8 = "http://dashif.org/thumbnail_tile"
            boolean r7 = com.google.common.base.Ascii.equalsIgnoreCase(r8, r7)
            if (r7 != 0) goto L9bf
            java.lang.String r7 = r5.schemeIdUri
            java.lang.String r8 = "http://dashif.org/guidelines/thumbnail_tile"
            boolean r7 = com.google.common.base.Ascii.equalsIgnoreCase(r8, r7)
            if (r7 == 0) goto L9e9
        L9bf:
            java.lang.String r5 = r5.value
            if (r5 == 0) goto L9e9
            java.lang.String r7 = "x"
            java.lang.String[] r5 = com.google.android.exoplayer2.util.Util.split(r5, r7)
            int r7 = r5.length
            r8 = 2
            if (r7 == r8) goto L9cf
            goto L9e9
        L9cf:
            r7 = r5[r0]     // Catch: java.lang.NumberFormatException -> L9e9
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L9e9
            r8 = 1
            r5 = r5[r8]     // Catch: java.lang.NumberFormatException -> L9e9
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L9e9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L9e9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L9e9
            android.util.Pair r0 = android.util.Pair.create(r7, r5)     // Catch: java.lang.NumberFormatException -> L9e9
            goto L9ed
        L9e9:
            int r4 = r4 + 1
            goto L99f
        L9ec:
            r0 = 0
        L9ed:
            com.google.android.exoplayer2.Format$Builder r4 = new com.google.android.exoplayer2.Format$Builder
            r4.<init>()
            r5 = r139
            com.google.android.exoplayer2.Format$Builder r4 = r4.setId(r5)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setContainerMimeType(r15)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r4 = r4.setCodecs(r6)
            r7 = r105
            com.google.android.exoplayer2.Format$Builder r4 = r4.setPeakBitrate(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r4.setSelectionFlags(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRoleFlags(r3)
            r10 = r134
            com.google.android.exoplayer2.Format$Builder r1 = r1.setLanguage(r10)
            if (r0 == 0) goto La23
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto La24
        La23:
            r3 = -1
        La24:
            com.google.android.exoplayer2.Format$Builder r1 = r1.setTileCountHorizontal(r3)
            if (r0 == 0) goto La33
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto La34
        La33:
            r0 = -1
        La34:
            com.google.android.exoplayer2.Format$Builder r0 = r1.setTileCountVertical(r0)
            boolean r1 = com.google.android.exoplayer2.util.MimeTypes.isVideo(r2)
            if (r1 == 0) goto La51
            r1 = r86
            com.google.android.exoplayer2.Format$Builder r1 = r0.setWidth(r1)
            r3 = r80
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r3)
            r2 = r79
            r1.setFrameRate(r2)
            goto Lb1e
        La51:
            r3 = r80
            r1 = r86
            boolean r4 = com.google.android.exoplayer2.util.MimeTypes.isAudio(r2)
            if (r4 == 0) goto La66
            com.google.android.exoplayer2.Format$Builder r1 = r0.setChannelCount(r12)
            r2 = r107
            r1.setSampleRate(r2)
            goto Lb1e
        La66:
            boolean r4 = com.google.android.exoplayer2.util.MimeTypes.isText(r2)
            if (r4 == 0) goto Lb11
            java.lang.String r1 = "application/cea-608"
            boolean r1 = r1.equals(r2)
            java.lang.String r3 = "MpdParser"
            if (r1 == 0) goto Labd
            r1 = 0
        La77:
            int r2 = r13.size()
            if (r1 >= r2) goto Lb0c
            java.lang.Object r2 = r13.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r2 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r2
            java.lang.String r4 = r2.schemeIdUri
            java.lang.String r5 = "urn:scte:dash:cc:cea-608:2015"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Laba
            java.lang.String r4 = r2.value
            if (r4 == 0) goto Laba
            java.util.regex.Pattern r5 = com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.CEA_608_ACCESSIBILITY_PATTERN
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 == 0) goto Laa8
            r1 = 1
            java.lang.String r1 = r4.group(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            goto Lb0d
        Laa8:
            java.lang.String r4 = "Unable to parse CEA-608 channel number from: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r2 = r2.value
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.exoplayer2.util.Log.w(r3, r2)
        Laba:
            int r1 = r1 + 1
            goto La77
        Labd:
            java.lang.String r1 = "application/cea-708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb0c
            r1 = 0
        Lac6:
            int r2 = r13.size()
            if (r1 >= r2) goto Lb0c
            java.lang.Object r2 = r13.get(r1)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r2 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r2
            java.lang.String r4 = r2.schemeIdUri
            java.lang.String r5 = "urn:scte:dash:cc:cea-708:2015"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lb09
            java.lang.String r4 = r2.value
            if (r4 == 0) goto Lb09
            java.util.regex.Pattern r5 = com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.CEA_708_ACCESSIBILITY_PATTERN
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 == 0) goto Laf7
            r1 = 1
            java.lang.String r1 = r4.group(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            goto Lb0d
        Laf7:
            java.lang.String r4 = "Unable to parse CEA-708 service block number from: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r2 = r2.value
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.exoplayer2.util.Log.w(r3, r2)
        Lb09:
            int r1 = r1 + 1
            goto Lac6
        Lb0c:
            r1 = -1
        Lb0d:
            r0.setAccessibilityChannel(r1)
            goto Lb1e
        Lb11:
            boolean r2 = com.google.android.exoplayer2.util.MimeTypes.isImage(r2)
            if (r2 == 0) goto Lb1e
            com.google.android.exoplayer2.Format$Builder r1 = r0.setWidth(r1)
            r1.setHeight(r3)
        Lb1e:
            com.google.android.exoplayer2.Format r108 = r0.build()
            if (r116 == 0) goto Lb27
            r110 = r116
            goto Lb2e
        Lb27:
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase
            r0.<init>()
            r110 = r0
        Lb2e:
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r0 = new com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo
            boolean r1 = r72.isEmpty()
            if (r1 != 0) goto Lb39
            r109 = r72
            goto Lb3b
        Lb39:
            r109 = r81
        Lb3b:
            r116 = -1
            r107 = r0
            r111 = r42
            r114 = r9
            r115 = r11
            r107.<init>(r108, r109, r110, r111, r112, r113, r114, r115, r116)
            com.google.android.exoplayer2.Format r1 = r0.format
            java.lang.String r1 = r1.sampleMimeType
            int r1 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r1)
            r2 = r131
            int r1 = checkContentTypeConsistency(r2, r1)
            r2 = r38
            r2.add(r0)
            r15 = r145
            r6 = r1
            r72 = r2
            r38 = r13
            r42 = r57
            r67 = r87
            r14 = r137
            r141 = r140
            r57 = r10
            goto Lcbc
        Lb6e:
            r95 = r1
            r112 = r5
            r113 = r7
            r42 = r10
            r1 = r86
            r142 = r80
            r80 = r79
            r79 = r142
            r7 = r145
            r97 = r4
            r96 = r8
            r114 = r9
            r115 = r11
            r119 = r12
            r98 = r13
            r5 = r14
            r108 = r42
            r42 = r53
            r53 = r54
            r117 = r55
            r118 = r56
            r9 = r62
            r8 = r66
            r104 = r71
            r14 = r72
            r0 = r74
            r62 = r75
            r13 = r76
            r15 = r81
            r4 = r88
            r10 = r101
            r1 = r106
            r11 = r110
            r55 = r124
            r56 = r127
            r72 = r128
            r81 = r130
            r71 = r131
            r66 = r132
            r75 = r134
            r54 = r135
            r73 = r136
            r74 = r137
            r100 = r138
            r76 = r139
            r88 = r6
            r106 = r37
            r101 = r52
            r111 = r60
            r110 = r61
            r6 = r77
            r61 = r99
            r37 = r123
            r52 = r126
            r77 = r129
            r60 = r140
            r99 = r82
            r82 = r38
            r38 = r125
            r142 = r80
            r80 = r79
            r79 = r142
            goto L5d6
        Lbeb:
            r101 = r10
            r138 = r11
            r103 = r14
            r123 = r37
            r125 = r38
            r126 = r52
            r135 = r54
            r124 = r55
            r127 = r56
            r140 = r60
            r99 = r61
            r132 = r66
            r66 = r71
            r128 = r72
            r136 = r73
            r56 = r76
            r129 = r77
            r60 = r79
            r37 = r80
            r77 = r86
            r67 = r87
            r55 = r2
            r52 = r3
            r38 = r4
            r14 = r5
            r73 = r6
            r10 = r8
            r61 = r12
            r76 = r13
            r4 = r15
            r54 = r53
            r71 = r64
            r3 = r74
            r64 = r75
            r74 = r81
            r12 = r145
            r53 = r42
            r42 = r57
            r75 = r62
            r62 = r9
            r142 = r82
            r82 = r0
            r0 = r142
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r12, r3)
            if (r1 == 0) goto Lc52
            r1 = r91
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r1 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase) r1
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r1 = r14.parseSegmentBase(r12, r1)
            r13 = r0
            r14 = r3
            r57 = r10
            r15 = r12
            goto Lc7d
        Lc52:
            r15 = r136
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r12, r15)
            if (r1 == 0) goto Lc84
            r1 = r89
            long r89 = r14.parseAvailabilityTimeOffsetUs(r12, r1)
            r2 = r91
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r2 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList) r2
            r13 = r0
            r0 = r144
            r1 = r145
            r14 = r3
            r3 = r44
            r5 = r46
            r7 = r93
            r57 = r10
            r9 = r89
            r136 = r15
            r15 = r12
            r11 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r1 = r0.parseSegmentList(r1, r2, r3, r5, r7, r9, r11)
        Lc7d:
            r91 = r1
            r72 = r13
            r141 = r140
            goto Lcba
        Lc84:
            r13 = r0
            r57 = r10
            r136 = r15
            r1 = r89
            r10 = r3
            r15 = r12
            r12 = r140
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r12)
            if (r0 == 0) goto Lcc0
            long r79 = r14.parseAvailabilityTimeOffsetUs(r15, r1)
            r2 = r91
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r2 = (com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate) r2
            r0 = r144
            r1 = r145
            r3 = r55
            r4 = r44
            r6 = r46
            r8 = r93
            r14 = r10
            r10 = r79
            r141 = r12
            r72 = r13
            r12 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r0 = r0.parseSegmentTemplate(r1, r2, r3, r4, r6, r8, r10, r12)
            r91 = r0
            r89 = r79
        Lcba:
            r6 = r73
        Lcbc:
            r7 = r15
            r3 = r129
            goto Lcf4
        Lcc0:
            r14 = r10
            r141 = r12
            r72 = r13
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r4)
            if (r0 == 0) goto Lcd5
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r0 = parseDescriptor(r15, r4)
            r3 = r129
            r3.add(r0)
            goto Lcef
        Lcd5:
            r3 = r129
            java.lang.String r0 = "Label"
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r15, r0)
            if (r4 == 0) goto Lce6
            java.lang.String r0 = parseText(r15, r0)
            r78 = r0
            goto Lcef
        Lce6:
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r145)
            if (r0 == 0) goto Lcef
            maybeSkipTag(r145)
        Lcef:
            r7 = r15
        Lcf0:
            r89 = r1
            r6 = r73
        Lcf4:
            r8 = r57
            r0 = r78
            r1 = r93
            r4 = r128
        Lcfc:
            boolean r5 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r7, r4)
            if (r5 == 0) goto Ld95
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r72.size()
            r1.<init>(r2)
            r2 = 0
        Ld0c:
            int r4 = r72.size()
            if (r2 >= r4) goto Ld75
            r5 = r72
            java.lang.Object r4 = r5.get(r2)
            com.google.android.exoplayer2.source.dash.manifest.DashManifestParser$RepresentationInfo r4 = (com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo) r4
            com.google.android.exoplayer2.Format r7 = r4.format
            com.google.android.exoplayer2.Format$Builder r7 = r7.buildUpon()
            if (r0 == 0) goto Ld25
            r7.setLabel(r0)
        Ld25:
            java.lang.String r8 = r4.drmSchemeType
            if (r8 != 0) goto Ld2b
            r8 = r84
        Ld2b:
            java.util.ArrayList<com.google.android.exoplayer2.drm.DrmInitData$SchemeData> r9 = r4.drmSchemeDatas
            r10 = r138
            r9.addAll(r10)
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto Ld46
            fillInClearKeyInformation(r9)
            filterRedundantIncompleteSchemeDatas(r9)
            com.google.android.exoplayer2.drm.DrmInitData r11 = new com.google.android.exoplayer2.drm.DrmInitData
            r11.<init>(r8, r9)
            r7.setDrmInitData(r11)
        Ld46:
            java.util.ArrayList<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r8 = r4.inbandEventStreams
            r8.addAll(r3)
            long r11 = r4.revisionId
            com.google.android.exoplayer2.Format r87 = r7.build()
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r7 = r4.baseUrls
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase r9 = r4.segmentBase
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r13 = r4.essentialProperties
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r4 = r4.supplementalProperties
            r93 = 0
            r85 = r11
            r88 = r7
            r89 = r9
            r90 = r8
            r91 = r13
            r92 = r4
            com.google.android.exoplayer2.source.dash.manifest.Representation r4 = com.google.android.exoplayer2.source.dash.manifest.Representation.newInstance(r85, r87, r88, r89, r90, r91, r92, r93)
            r1.add(r4)
            int r2 = r2 + 1
            r72 = r5
            r138 = r10
            goto Ld0c
        Ld75:
            com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r0 = new com.google.android.exoplayer2.source.dash.manifest.AdaptationSet
            r62 = r0
            r64 = r6
            r65 = r1
            r66 = r38
            r67 = r61
            r68 = r55
            r62.<init>(r63, r64, r65, r66, r67, r68)
            r13 = r126
            r13.add(r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = r15
            r15 = r124
            goto Lfcf
        Ld95:
            r5 = r144
            r78 = r0
            r80 = r37
            r57 = r42
            r42 = r53
            r53 = r54
            r88 = r55
            r79 = r60
            r12 = r61
            r9 = r62
            r87 = r67
            r81 = r74
            r62 = r75
            r13 = r76
            r86 = r77
            r0 = r82
            r15 = r92
            r61 = r99
            r10 = r101
            r37 = r123
            r55 = r124
            r54 = r135
            r73 = r136
            r11 = r138
            r60 = r141
            r77 = r3
            r74 = r14
            r3 = r52
            r76 = r56
            r75 = r64
            r64 = r71
            r82 = r72
            r14 = r103
            r52 = r126
            r56 = r127
            r72 = r4
            r4 = r38
            r71 = r66
            r38 = r125
            r66 = r132
            goto L3b4
        Lde7:
            r99 = r0
            r69 = r5
            r132 = r7
            r75 = r9
            r101 = r10
            r136 = r12
            r76 = r13
            r103 = r14
            r123 = r37
            r125 = r38
            r13 = r52
            r135 = r54
            r124 = r55
            r127 = r56
            r141 = r60
            r52 = r3
            r14 = r11
            r54 = r53
            r53 = r42
            r42 = r15
            r15 = r145
            java.lang.String r0 = "EventStream"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r0)
            if (r1 == 0) goto Lfe7
            r1 = 0
            r11 = r125
            java.lang.String r3 = r2.getAttributeValue(r1, r11)
            java.lang.String r4 = ""
            if (r3 != 0) goto Le24
            r3 = r4
        Le24:
            r12 = r127
            java.lang.String r1 = r2.getAttributeValue(r1, r12)
            if (r1 != 0) goto Le2d
            r1 = r4
        Le2d:
            r4 = 1
            java.lang.String r6 = "timescale"
            long r4 = parseLong(r2, r6, r4)
            java.lang.String r6 = "presentationTimeOffset"
            r7 = 0
            long r6 = parseLong(r2, r6, r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r10 = 512(0x200, float:7.17E-43)
            r9.<init>(r10)
        Le4b:
            r145.next()
            java.lang.String r10 = "Event"
            boolean r14 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r10)
            if (r14 == 0) goto Lf74
            r125 = r11
            r127 = r12
            r11 = 0
            r14 = r103
            long r11 = parseLong(r2, r14, r11)
            r126 = r13
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = r135
            long r60 = parseLong(r2, r15, r13)
            java.lang.String r13 = "presentationTime"
            r14 = 0
            long r13 = parseLong(r2, r13, r14)
            r62 = 1000(0x3e8, double:4.94E-321)
            r64 = r4
            long r37 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r60, r62, r64)
            long r60 = r13 - r6
            r62 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r60, r62, r64)
            java.lang.String r15 = "messageData"
            r55 = r6
            r6 = 0
            java.lang.String r6 = r2.getAttributeValue(r6, r15)
            if (r6 != 0) goto Le95
            r6 = 0
        Le95:
            r9.reset()
            org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
            java.nio.charset.Charset r15 = com.google.common.base.Charsets.UTF_8
            java.lang.String r15 = r15.name()
            r7.setOutput(r9, r15)
            r145.nextToken()
        Lea8:
            boolean r15 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r2, r10)
            if (r15 != 0) goto Lf47
            int r15 = r145.getEventType()
            switch(r15) {
                case 0: goto Lf34;
                case 1: goto Lf2c;
                case 2: goto Lf02;
                case 3: goto Lef2;
                case 4: goto Lee6;
                case 5: goto Lede;
                case 6: goto Led6;
                case 7: goto Lece;
                case 8: goto Lec6;
                case 9: goto Lebe;
                case 10: goto Leb6;
                default: goto Leb5;
            }
        Leb5:
            goto Leed
        Leb6:
            java.lang.String r15 = r145.getText()
            r7.docdecl(r15)
            goto Leed
        Lebe:
            java.lang.String r15 = r145.getText()
            r7.comment(r15)
            goto Leed
        Lec6:
            java.lang.String r15 = r145.getText()
            r7.processingInstruction(r15)
            goto Leed
        Lece:
            java.lang.String r15 = r145.getText()
            r7.ignorableWhitespace(r15)
            goto Leed
        Led6:
            java.lang.String r15 = r145.getText()
            r7.entityRef(r15)
            goto Leed
        Lede:
            java.lang.String r15 = r145.getText()
            r7.cdsect(r15)
            goto Leed
        Lee6:
            java.lang.String r15 = r145.getText()
            r7.text(r15)
        Leed:
            r71 = r4
            r57 = r10
            goto Lf3e
        Lef2:
            java.lang.String r15 = r145.getNamespace()
            r57 = r10
            java.lang.String r10 = r145.getName()
            r7.endTag(r15, r10)
        Leff:
            r71 = r4
            goto Lf3e
        Lf02:
            r57 = r10
            java.lang.String r10 = r145.getNamespace()
            java.lang.String r15 = r145.getName()
            r7.startTag(r10, r15)
            r10 = 0
        Lf10:
            int r15 = r145.getAttributeCount()
            if (r10 >= r15) goto Leff
            java.lang.String r15 = r2.getAttributeNamespace(r10)
            r71 = r4
            java.lang.String r4 = r2.getAttributeName(r10)
            java.lang.String r5 = r2.getAttributeValue(r10)
            r7.attribute(r15, r4, r5)
            int r10 = r10 + 1
            r4 = r71
            goto Lf10
        Lf2c:
            r71 = r4
            r57 = r10
            r7.endDocument()
            goto Lf3e
        Lf34:
            r71 = r4
            r57 = r10
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5 = 0
            r7.startDocument(r5, r4)
        Lf3e:
            r145.nextToken()
            r10 = r57
            r4 = r71
            goto Lea8
        Lf47:
            r71 = r4
            r7.flush()
            byte[] r4 = r9.toByteArray()
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            if (r6 != 0) goto Lf57
            goto Lf5b
        Lf57:
            byte[] r4 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r6)
        Lf5b:
            r67 = r4
            com.google.android.exoplayer2.metadata.emsg.EventMessage r4 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r60 = r4
            r61 = r3
            r62 = r1
            r63 = r37
            r65 = r11
            r60.<init>(r61, r62, r63, r65, r67)
            android.util.Pair r4 = android.util.Pair.create(r5, r4)
            r8.add(r4)
            goto Lf81
        Lf74:
            r71 = r4
            r55 = r6
            r125 = r11
            r127 = r12
            r126 = r13
            maybeSkipTag(r145)
        Lf81:
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r2, r0)
            if (r4 == 0) goto Lfd9
            int r0 = r8.size()
            long[] r0 = new long[r0]
            int r4 = r8.size()
            com.google.android.exoplayer2.metadata.emsg.EventMessage[] r4 = new com.google.android.exoplayer2.metadata.emsg.EventMessage[r4]
            r5 = 0
        Lf94:
            int r6 = r8.size()
            if (r5 >= r6) goto Lfb3
            java.lang.Object r6 = r8.get(r5)
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r7 = r6.first
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            r0[r5] = r9
            java.lang.Object r6 = r6.second
            com.google.android.exoplayer2.metadata.emsg.EventMessage r6 = (com.google.android.exoplayer2.metadata.emsg.EventMessage) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto Lf94
        Lfb3:
            com.google.android.exoplayer2.source.dash.manifest.EventStream r5 = new com.google.android.exoplayer2.source.dash.manifest.EventStream
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r60 = r5
            r61 = r3
            r62 = r1
            r63 = r71
            r65 = r0
            r66 = r4
            r60.<init>(r61, r62, r63, r65, r66)
            r15 = r124
            r15.add(r5)
            r0 = r6
        Lfcf:
            r37 = r103
            r55 = r125
            r60 = r126
            r38 = r127
            goto L1094
        Lfd9:
            r15 = r145
            r6 = r55
            r4 = r71
            r11 = r125
            r13 = r126
            r12 = r127
            goto Le4b
        Lfe7:
            r126 = r13
            r4 = r103
            r15 = r124
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r14)
            if (r3 == 0) goto L1009
            r3 = 0
            r14 = r144
            r37 = r4
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r3 = r14.parseSegmentBase(r2, r3)
            r55 = r125
            r60 = r126
            r38 = r127
            goto L1096
        L1009:
            r14 = r144
            r37 = r4
            r3 = r136
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r2, r3)
            if (r3 == 0) goto L1040
            long r48 = r14.parseAvailabilityTimeOffsetUs(r2, r0)
            r3 = 0
            r0 = r144
            r1 = r145
            r13 = r2
            r2 = r3
            r3 = r44
            r5 = r46
            r7 = r58
            r9 = r48
            r55 = r125
            r38 = r127
            r11 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = r0.parseSegmentList(r1, r2, r3, r5, r7, r9, r11)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = r13
            r60 = r126
            r142 = r1
            r2 = r0
            r0 = r142
            goto L1075
        L1040:
            r13 = r2
            r55 = r125
            r38 = r127
            r0 = r141
            boolean r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r13, r0)
            if (r0 == 0) goto L107b
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r48 = r14.parseAvailabilityTimeOffsetUs(r13, r10)
            r2 = 0
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            r0 = r144
            r1 = r145
            r4 = r44
            r6 = r46
            r8 = r58
            r56 = r10
            r10 = r48
            r14 = r13
            r60 = r126
            r12 = r25
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r0 = r0.parseSegmentTemplate(r1, r2, r3, r4, r6, r8, r10, r12)
            r2 = r0
            r0 = r56
        L1075:
            r49 = r48
            r48 = r2
        L1079:
            r2 = r14
            goto L1094
        L107b:
            r14 = r13
            r60 = r126
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r2 = "AssetIdentifier"
            boolean r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r14, r2)
            if (r3 == 0) goto L1090
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r43 = parseDescriptor(r14, r2)
            goto L1079
        L1090:
            maybeSkipTag(r145)
            goto L1079
        L1094:
            r3 = r48
        L1096:
            r48 = r3
            r11 = r58
            r3 = r123
            r57 = r0
            r0 = r43
            r1 = r144
        L10a2:
            boolean r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r2, r3)
            if (r4 == 0) goto L1105
            com.google.android.exoplayer2.source.dash.manifest.Period r1 = new com.google.android.exoplayer2.source.dash.manifest.Period
            r38 = r1
            r42 = r60
            r43 = r15
            r44 = r0
            r38.<init>(r39, r40, r42, r43, r44)
            java.lang.Long r0 = java.lang.Long.valueOf(r46)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            java.lang.Object r1 = r0.first
            com.google.android.exoplayer2.source.dash.manifest.Period r1 = (com.google.android.exoplayer2.source.dash.manifest.Period) r1
            long r2 = r1.startMs
            int r4 = (r2 > r57 ? 1 : (r2 == r57 ? 0 : -1))
            if (r4 != 0) goto L10e8
            if (r22 == 0) goto L10d1
            r0 = 1
            r6 = r54
            r7 = r132
            r32 = 1
            goto L1102
        L10d1:
            java.lang.String r0 = "Unable to determine start of period "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r54.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r1)
            throw r0
        L10e8:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r57 ? 1 : (r2 == r57 ? 0 : -1))
            if (r0 != 0) goto L10f9
            r6 = r54
            r4 = r57
            goto L10fe
        L10f9:
            long r4 = r1.startMs
            long r4 = r4 + r2
            r6 = r54
        L10fe:
            r6.add(r1)
            r7 = r4
        L1102:
            r0 = r144
            goto L1144
        L1105:
            r43 = r0
            r14 = r37
            r4 = r38
            r38 = r55
            r5 = r69
            r9 = r75
            r13 = r76
            r0 = r99
            r10 = r101
            r7 = r132
            r37 = r3
            r55 = r15
            r15 = r42
            r3 = r52
            r42 = r53
            r53 = r54
            r52 = r60
            r54 = r135
            goto L2aa
        L112b:
            r69 = r5
            r132 = r7
            r75 = r9
            r53 = r11
            r6 = r12
            r76 = r13
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            maybeSkipTag(r145)
            r57 = r0
            r0 = r43
            r7 = r132
        L1144:
            r43 = r0
            r0 = r57
        L1148:
            java.lang.String r2 = "MPD"
            r3 = r145
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r3, r2)
            if (r2 == 0) goto L1185
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 != 0) goto L1168
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L115d
            r18 = r7
            goto L1168
        L115d:
            if (r22 == 0) goto L1160
            goto L1168
        L1160:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r1)
            throw r0
        L1168:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L117d
            com.google.android.exoplayer2.source.dash.manifest.DashManifest r0 = new com.google.android.exoplayer2.source.dash.manifest.DashManifest
            r15 = r0
            r31 = r33
            r32 = r36
            r33 = r35
            r35 = r6
            r15.<init>(r16, r18, r20, r22, r23, r25, r27, r29, r31, r32, r33, r34, r35)
            return r0
        L117d:
            java.lang.String r0 = "No periods found."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r1)
            throw r0
        L1185:
            r14 = r144
            r15 = r3
            r12 = r6
            r0 = r43
            r11 = r53
            r5 = r69
            r9 = r75
            r13 = r76
            goto Lc7
    }

    public final com.google.android.exoplayer2.source.dash.manifest.RangedUri parseRangedUrl(org.xmlpull.v1.XmlPullParser r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = 0
            java.lang.String r2 = r8.getAttributeValue(r0, r9)
            java.lang.String r8 = r8.getAttributeValue(r0, r10)
            if (r8 == 0) goto L28
            java.lang.String r9 = "-"
            java.lang.String[] r8 = r8.split(r9)
            r9 = 0
            r9 = r8[r9]
            long r9 = java.lang.Long.parseLong(r9)
            int r0 = r8.length
            r1 = 2
            if (r0 != r1) goto L2a
            r0 = 1
            r8 = r8[r0]
            long r0 = java.lang.Long.parseLong(r8)
            long r0 = r0 - r9
            r3 = 1
            long r0 = r0 + r3
            goto L2c
        L28:
            r9 = 0
        L2a:
            r0 = -1
        L2c:
            r3 = r9
            r5 = r0
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r8 = new com.google.android.exoplayer2.source.dash.manifest.RangedUri
            r1 = r8
            r1.<init>(r2, r3, r5)
            return r8
    }

    public final int parseRoleFlagsFromDashRoleScheme(@androidx.annotation.Nullable java.lang.String r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = -1
            int r2 = r8.hashCode()
            r3 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            switch(r2) {
                case -2060497896: goto La8;
                case -1724546052: goto L9d;
                case -1580883024: goto L92;
                case -1574842690: goto L87;
                case -1408024454: goto L7c;
                case -1396432756: goto L71;
                case 99825: goto L66;
                case 3343801: goto L5b;
                case 3530173: goto L4c;
                case 552573414: goto L3e;
                case 899152809: goto L30;
                case 1629013393: goto L22;
                case 1855372047: goto L13;
                default: goto L11;
            }
        L11:
            goto Lb3
        L13:
            java.lang.String r2 = "supplementary"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L1e
            goto Lb3
        L1e:
            r1 = 12
            goto Lb3
        L22:
            java.lang.String r2 = "emergency"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L2c
            goto Lb3
        L2c:
            r1 = 11
            goto Lb3
        L30:
            java.lang.String r2 = "commentary"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L3a
            goto Lb3
        L3a:
            r1 = 10
            goto Lb3
        L3e:
            java.lang.String r2 = "caption"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L48
            goto Lb3
        L48:
            r1 = 9
            goto Lb3
        L4c:
            java.lang.String r2 = "sign"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L57
            goto Lb3
        L57:
            r1 = 8
            goto Lb3
        L5b:
            java.lang.String r2 = "main"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L64
            goto Lb3
        L64:
            r1 = 7
            goto Lb3
        L66:
            java.lang.String r2 = "dub"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L6f
            goto Lb3
        L6f:
            r1 = 6
            goto Lb3
        L71:
            java.lang.String r2 = "forced-subtitle"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L7a
            goto Lb3
        L7a:
            r1 = 5
            goto Lb3
        L7c:
            java.lang.String r2 = "alternate"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L85
            goto Lb3
        L85:
            r1 = 4
            goto Lb3
        L87:
            java.lang.String r2 = "forced_subtitle"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L90
            goto Lb3
        L90:
            r1 = 3
            goto Lb3
        L92:
            java.lang.String r2 = "enhanced-audio-intelligibility"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L9b
            goto Lb3
        L9b:
            r1 = 2
            goto Lb3
        L9d:
            java.lang.String r2 = "description"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto La6
            goto Lb3
        La6:
            r1 = 1
            goto Lb3
        La8:
            java.lang.String r2 = "subtitle"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Lb2
            goto Lb3
        Lb2:
            r1 = 0
        Lb3:
            switch(r1) {
                case 0: goto Lcd;
                case 1: goto Lca;
                case 2: goto Lc7;
                case 3: goto Lcd;
                case 4: goto Lc6;
                case 5: goto Lcd;
                case 6: goto Lc3;
                case 7: goto Lc2;
                case 8: goto Lbf;
                case 9: goto Lbc;
                case 10: goto Lbb;
                case 11: goto Lb8;
                case 12: goto Lb7;
                default: goto Lb6;
            }
        Lb6:
            return r0
        Lb7:
            return r4
        Lb8:
            r8 = 32
            return r8
        Lbb:
            return r3
        Lbc:
            r8 = 64
            return r8
        Lbf:
            r8 = 256(0x100, float:3.59E-43)
            return r8
        Lc2:
            return r6
        Lc3:
            r8 = 16
            return r8
        Lc6:
            return r5
        Lc7:
            r8 = 2048(0x800, float:2.87E-42)
            return r8
        Lca:
            r8 = 512(0x200, float:7.17E-43)
            return r8
        Lcd:
            r8 = 128(0x80, float:1.8E-43)
            return r8
    }

    public final int parseRoleFlagsFromProperties(java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.size()
            if (r0 >= r2) goto L1d
            java.lang.Object r2 = r5.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r2 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r2
            java.lang.String r2 = r2.schemeIdUri
            java.lang.String r3 = "http://dashif.org/guidelines/trickmode"
            boolean r2 = com.google.common.base.Ascii.equalsIgnoreCase(r3, r2)
            if (r2 == 0) goto L1a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L1a:
            int r0 = r0 + 1
            goto L2
        L1d:
            return r1
    }

    public final com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase parseSegmentBase(org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 == 0) goto Lb
            long r4 = r1.timescale
            goto Lc
        Lb:
            r4 = r2
        Lc:
            java.lang.String r6 = "timescale"
            long r9 = parseLong(r0, r6, r4)
            r4 = 0
            if (r1 == 0) goto L1a
            long r6 = r1.presentationTimeOffset
            goto L1b
        L1a:
            r6 = r4
        L1b:
            java.lang.String r8 = "presentationTimeOffset"
            long r11 = parseLong(r0, r8, r6)
            if (r1 == 0) goto L27
            long r6 = r1.indexStart
            goto L28
        L27:
            r6 = r4
        L28:
            if (r1 == 0) goto L2c
            long r4 = r1.indexLength
        L2c:
            r8 = 0
            java.lang.String r13 = "indexRange"
            java.lang.String r13 = r0.getAttributeValue(r8, r13)
            if (r13 == 0) goto L4e
            java.lang.String r4 = "-"
            java.lang.String[] r4 = r13.split(r4)
            r5 = 0
            r5 = r4[r5]
            long r5 = java.lang.Long.parseLong(r5)
            r7 = 1
            r4 = r4[r7]
            long r13 = java.lang.Long.parseLong(r4)
            long r13 = r13 - r5
            long r13 = r13 + r2
            r15 = r13
            r13 = r5
            goto L50
        L4e:
            r15 = r4
            r13 = r6
        L50:
            if (r1 == 0) goto L54
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r8 = r1.initialization
        L54:
            r18.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r1)
            if (r1 == 0) goto L6d
            java.lang.String r1 = "sourceURL"
            java.lang.String r2 = "range"
            r3 = r17
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r3.parseRangedUrl(r0, r1, r2)
            r8 = r1
            goto L72
        L6d:
            r3 = r17
            maybeSkipTag(r18)
        L72:
            java.lang.String r1 = "SegmentBase"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r1)
            if (r1 == 0) goto L54
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase r0 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SingleSegmentBase
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
    }

    public final com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList parseSegmentList(org.xmlpull.v1.XmlPullParser r26, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList r27, long r28, long r30, long r32, long r34, long r36) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r25 = this;
            r6 = r25
            r7 = r26
            r8 = r27
            r0 = 1
            if (r8 == 0) goto Ld
            long r2 = r8.timescale
            goto Le
        Ld:
            r2 = r0
        Le:
            java.lang.String r4 = "timescale"
            long r9 = parseLong(r7, r4, r2)
            if (r8 == 0) goto L1a
            long r2 = r8.presentationTimeOffset
            goto L1c
        L1a:
            r2 = 0
        L1c:
            java.lang.String r4 = "presentationTimeOffset"
            long r11 = parseLong(r7, r4, r2)
            if (r8 == 0) goto L28
            long r2 = r8.duration
            goto L2d
        L28:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2d:
            java.lang.String r4 = "duration"
            long r15 = parseLong(r7, r4, r2)
            if (r8 == 0) goto L37
            long r0 = r8.startNumber
        L37:
            java.lang.String r2 = "startNumber"
            long r13 = parseLong(r7, r2, r0)
            long r18 = getFinalAvailabilityTimeOffset(r32, r34)
            r0 = 0
            r17 = r0
            r20 = r17
        L47:
            r26.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r1 == 0) goto L5f
            java.lang.String r1 = "sourceURL"
            java.lang.String r2 = "range"
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r6.parseRangedUrl(r7, r1, r2)
            r20 = r1
            goto L95
        L5f:
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r1 == 0) goto L73
            r0 = r25
            r1 = r26
            r2 = r9
            r4 = r30
            java.util.List r0 = r0.parseSegmentTimeline(r1, r2, r4)
            goto L95
        L73:
            java.lang.String r1 = "SegmentURL"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r7, r1)
            if (r1 == 0) goto L92
            if (r17 != 0) goto L82
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
        L82:
            r1 = r17
            java.lang.String r2 = "media"
            java.lang.String r3 = "mediaRange"
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r2 = r6.parseRangedUrl(r7, r2, r3)
            r1.add(r2)
            r17 = r1
            goto L95
        L92:
            maybeSkipTag(r26)
        L95:
            java.lang.String r1 = "SegmentList"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r7, r1)
            if (r1 == 0) goto L47
            if (r8 == 0) goto Lb7
            if (r20 == 0) goto La2
            goto La6
        La2:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r8.initialization
            r20 = r1
        La6:
            if (r0 == 0) goto La9
            goto Lab
        La9:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r8.segmentTimeline
        Lab:
            if (r17 == 0) goto Lae
            goto Lb7
        Lae:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.RangedUri> r1 = r8.mediaSegments
            r17 = r0
            r8 = r20
            r20 = r1
            goto Lbd
        Lb7:
            r8 = r20
            r20 = r17
            r17 = r0
        Lbd:
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList r0 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentList
            r7 = r0
            long r21 = com.google.android.exoplayer2.util.Util.msToUs(r36)
            long r23 = com.google.android.exoplayer2.util.Util.msToUs(r28)
            r7.<init>(r8, r9, r11, r13, r15, r17, r18, r20, r21, r23)
            return r0
    }

    public final com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate parseSegmentTemplate(org.xmlpull.v1.XmlPullParser r28, @androidx.annotation.Nullable com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate r29, java.util.List<com.google.android.exoplayer2.source.dash.manifest.Descriptor> r30, long r31, long r33, long r35, long r37, long r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r27 = this;
            r6 = r28
            r7 = r29
            r0 = 1
            if (r7 == 0) goto Lb
            long r2 = r7.timescale
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.lang.String r4 = "timescale"
            long r8 = parseLong(r6, r4, r2)
            if (r7 == 0) goto L18
            long r2 = r7.presentationTimeOffset
            goto L1a
        L18:
            r2 = 0
        L1a:
            java.lang.String r4 = "presentationTimeOffset"
            long r10 = parseLong(r6, r4, r2)
            if (r7 == 0) goto L26
            long r2 = r7.duration
            goto L2b
        L26:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2b:
            java.lang.String r4 = "duration"
            long r15 = parseLong(r6, r4, r2)
            if (r7 == 0) goto L35
            long r0 = r7.startNumber
        L35:
            java.lang.String r2 = "startNumber"
            long r12 = parseLong(r6, r2, r0)
            r0 = 0
        L3d:
            int r1 = r30.size()
            if (r0 >= r1) goto L5f
            r1 = r30
            java.lang.Object r2 = r1.get(r0)
            com.google.android.exoplayer2.source.dash.manifest.Descriptor r2 = (com.google.android.exoplayer2.source.dash.manifest.Descriptor) r2
            java.lang.String r3 = r2.schemeIdUri
            java.lang.String r4 = "http://dashif.org/guidelines/last-segment-number"
            boolean r3 = com.google.common.base.Ascii.equalsIgnoreCase(r4, r3)
            if (r3 == 0) goto L5c
            java.lang.String r0 = r2.value
            long r0 = java.lang.Long.parseLong(r0)
            goto L61
        L5c:
            int r0 = r0 + 1
            goto L3d
        L5f:
            r0 = -1
        L61:
            r17 = r0
            long r19 = getFinalAvailabilityTimeOffset(r35, r37)
            r0 = 0
            if (r7 == 0) goto L6d
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r1 = r7.mediaTemplate
            goto L6e
        L6d:
            r1 = r0
        L6e:
            java.lang.String r2 = "media"
            java.lang.String r2 = r6.getAttributeValue(r0, r2)
            if (r2 == 0) goto L7a
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r1 = com.google.android.exoplayer2.source.dash.manifest.UrlTemplate.compile(r2)
        L7a:
            r21 = r1
            if (r7 == 0) goto L81
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r1 = r7.initializationTemplate
            goto L82
        L81:
            r1 = r0
        L82:
            java.lang.String r2 = "initialization"
            java.lang.String r2 = r6.getAttributeValue(r0, r2)
            if (r2 == 0) goto L8e
            com.google.android.exoplayer2.source.dash.manifest.UrlTemplate r1 = com.google.android.exoplayer2.source.dash.manifest.UrlTemplate.compile(r2)
        L8e:
            r26 = r1
            r14 = r0
        L91:
            r28.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r6, r1)
            if (r1 == 0) goto Laa
            java.lang.String r1 = "sourceURL"
            java.lang.String r2 = "range"
            r4 = r27
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r1 = r4.parseRangedUrl(r6, r1, r2)
            r14 = r1
            goto Lc3
        Laa:
            r4 = r27
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r6, r1)
            if (r1 == 0) goto Lc0
            r0 = r27
            r1 = r28
            r2 = r8
            r4 = r33
            java.util.List r0 = r0.parseSegmentTimeline(r1, r2, r4)
            goto Lc3
        Lc0:
            maybeSkipTag(r28)
        Lc3:
            java.lang.String r1 = "SegmentTemplate"
            boolean r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r6, r1)
            if (r1 == 0) goto L91
            if (r7 == 0) goto Ld7
            if (r14 == 0) goto Ld0
            goto Ld2
        Ld0:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r14 = r7.initialization
        Ld2:
            if (r0 == 0) goto Ld5
            goto Ld7
        Ld5:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTimelineElement> r0 = r7.segmentTimeline
        Ld7:
            r6 = r14
            com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate r1 = new com.google.android.exoplayer2.source.dash.manifest.SegmentBase$SegmentTemplate
            r5 = r1
            long r22 = com.google.android.exoplayer2.util.Util.msToUs(r39)
            long r24 = com.google.android.exoplayer2.util.Util.msToUs(r31)
            r7 = r8
            r9 = r10
            r11 = r12
            r13 = r17
            r17 = r0
            r18 = r19
            r20 = r26
            r5.<init>(r6, r7, r9, r11, r13, r15, r17, r18, r20, r21, r22, r24)
            return r1
    }

    public final java.util.List<com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTimelineElement> parseSegmentTimeline(org.xmlpull.v1.XmlPullParser r21, long r22, long r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r20 = this;
            r0 = r21
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = 0
            r3 = r1
            r5 = r12
            r1 = 0
            r7 = 0
        L13:
            r21.next()
            java.lang.String r2 = "S"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(r0, r2)
            if (r2 == 0) goto L48
            java.lang.String r2 = "t"
            long r14 = parseLong(r0, r2, r12)
            if (r1 == 0) goto L2f
            r1 = r20
            r2 = r10
            r8 = r14
            long r3 = r1.addSegmentTimelineElementsToList(r2, r3, r5, r7, r8)
        L2f:
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L34
            goto L35
        L34:
            r14 = r3
        L35:
            java.lang.String r1 = "d"
            long r1 = parseLong(r0, r1, r12)
            java.lang.String r3 = "r"
            int r3 = parseInt(r0, r3, r11)
            r4 = 1
            r5 = r1
            r7 = r3
            r3 = r14
            r1 = 1
            goto L4b
        L48:
            maybeSkipTag(r21)
        L4b:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(r0, r2)
            if (r2 == 0) goto L13
            if (r1 == 0) goto L69
            r18 = 1000(0x3e8, double:4.94E-321)
            r14 = r24
            r16 = r22
            long r8 = com.google.android.exoplayer2.util.Util.scaleLargeTimestamp(r14, r16, r18)
            r0 = r20
            r1 = r10
            r2 = r3
            r4 = r5
            r6 = r7
            r7 = r8
            r0.addSegmentTimelineElementsToList(r1, r2, r4, r6, r7)
        L69:
            return r10
    }
}
