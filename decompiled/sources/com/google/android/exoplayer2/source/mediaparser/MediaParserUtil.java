package com.google.android.exoplayer2.source.mediaparser;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserUtil {
    public static final java.lang.String PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE = "android.media.mediaparser.eagerlyExposeTrackType";
    public static final java.lang.String PARAMETER_EXPOSE_CAPTION_FORMATS = "android.media.mediaParser.exposeCaptionFormats";
    public static final java.lang.String PARAMETER_EXPOSE_CHUNK_INDEX_AS_MEDIA_FORMAT = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";
    public static final java.lang.String PARAMETER_EXPOSE_DUMMY_SEEK_MAP = "android.media.mediaparser.exposeDummySeekMap";
    public static final java.lang.String PARAMETER_IGNORE_TIMESTAMP_OFFSET = "android.media.mediaparser.ignoreTimestampOffset";
    public static final java.lang.String PARAMETER_INCLUDE_SUPPLEMENTAL_DATA = "android.media.mediaparser.includeSupplementalData";
    public static final java.lang.String PARAMETER_IN_BAND_CRYPTO_INFO = "android.media.mediaparser.inBandCryptoInfo";
    public static final java.lang.String PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(31)
    public static final class Api31 {
        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLogSessionIdOnMediaParser(android.media.MediaParser r1, com.google.android.exoplayer2.analytics.PlayerId r2) {
                android.media.metrics.LogSessionId r2 = r2.getLogSessionId()
                android.media.metrics.LogSessionId r0 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto Lf
                r1.setLogSessionId(r2)
            Lf:
                return
        }
    }

    private MediaParserUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(31)
    public static void setLogSessionIdOnMediaParser(android.media.MediaParser r0, com.google.android.exoplayer2.analytics.PlayerId r1) {
            com.google.android.exoplayer2.source.mediaparser.MediaParserUtil.Api31.setLogSessionIdOnMediaParser(r0, r1)
            return
    }

    public static android.media.MediaFormat toCaptionsMediaFormat(com.google.android.exoplayer2.Format r3) {
            android.media.MediaFormat r0 = new android.media.MediaFormat
            r0.<init>()
            java.lang.String r1 = r3.sampleMimeType
            java.lang.String r2 = "mime"
            r0.setString(r2, r1)
            int r3 = r3.accessibilityChannel
            r1 = -1
            if (r3 == r1) goto L16
            java.lang.String r1 = "caption-service-number"
            r0.setInteger(r1, r3)
        L16:
            return r0
    }
}
