package com.google.common.net;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class MediaType {
    public static final com.google.common.net.MediaType AAC_AUDIO = null;
    public static final com.google.common.net.MediaType ANY_APPLICATION_TYPE = null;
    public static final com.google.common.net.MediaType ANY_AUDIO_TYPE = null;
    public static final com.google.common.net.MediaType ANY_FONT_TYPE = null;
    public static final com.google.common.net.MediaType ANY_IMAGE_TYPE = null;
    public static final com.google.common.net.MediaType ANY_TEXT_TYPE = null;
    public static final com.google.common.net.MediaType ANY_TYPE = null;
    public static final com.google.common.net.MediaType ANY_VIDEO_TYPE = null;
    public static final com.google.common.net.MediaType APPLE_MOBILE_CONFIG = null;
    public static final com.google.common.net.MediaType APPLE_PASSBOOK = null;
    public static final com.google.common.net.MediaType APPLICATION_BINARY = null;
    private static final java.lang.String APPLICATION_TYPE = "application";
    public static final com.google.common.net.MediaType APPLICATION_XML_UTF_8 = null;
    public static final com.google.common.net.MediaType ATOM_UTF_8 = null;
    private static final java.lang.String AUDIO_TYPE = "audio";
    public static final com.google.common.net.MediaType BASIC_AUDIO = null;
    public static final com.google.common.net.MediaType BMP = null;
    public static final com.google.common.net.MediaType BZIP2 = null;
    public static final com.google.common.net.MediaType CACHE_MANIFEST_UTF_8 = null;
    private static final java.lang.String CHARSET_ATTRIBUTE = "charset";
    public static final com.google.common.net.MediaType CRW = null;
    public static final com.google.common.net.MediaType CSS_UTF_8 = null;
    public static final com.google.common.net.MediaType CSV_UTF_8 = null;
    public static final com.google.common.net.MediaType DART_UTF_8 = null;
    public static final com.google.common.net.MediaType EOT = null;
    public static final com.google.common.net.MediaType EPUB = null;
    public static final com.google.common.net.MediaType FLV_VIDEO = null;
    public static final com.google.common.net.MediaType FONT_COLLECTION = null;
    public static final com.google.common.net.MediaType FONT_OTF = null;
    public static final com.google.common.net.MediaType FONT_SFNT = null;
    public static final com.google.common.net.MediaType FONT_TTF = null;
    private static final java.lang.String FONT_TYPE = "font";
    public static final com.google.common.net.MediaType FONT_WOFF = null;
    public static final com.google.common.net.MediaType FONT_WOFF2 = null;
    public static final com.google.common.net.MediaType FORM_DATA = null;
    public static final com.google.common.net.MediaType GEO_JSON = null;
    public static final com.google.common.net.MediaType GIF = null;
    public static final com.google.common.net.MediaType GZIP = null;
    public static final com.google.common.net.MediaType HAL_JSON = null;
    public static final com.google.common.net.MediaType HEIF = null;
    public static final com.google.common.net.MediaType HTML_UTF_8 = null;
    public static final com.google.common.net.MediaType ICO = null;
    private static final java.lang.String IMAGE_TYPE = "image";
    public static final com.google.common.net.MediaType I_CALENDAR_UTF_8 = null;
    public static final com.google.common.net.MediaType JAVASCRIPT_UTF_8 = null;
    public static final com.google.common.net.MediaType JOSE = null;
    public static final com.google.common.net.MediaType JOSE_JSON = null;
    public static final com.google.common.net.MediaType JP2K = null;
    public static final com.google.common.net.MediaType JPEG = null;
    public static final com.google.common.net.MediaType JSON_UTF_8 = null;
    public static final com.google.common.net.MediaType KEY_ARCHIVE = null;
    public static final com.google.common.net.MediaType KML = null;
    public static final com.google.common.net.MediaType KMZ = null;
    private static final java.util.Map<com.google.common.net.MediaType, com.google.common.net.MediaType> KNOWN_TYPES = null;
    public static final com.google.common.net.MediaType L16_AUDIO = null;
    public static final com.google.common.net.MediaType L24_AUDIO = null;
    private static final com.google.common.base.CharMatcher LINEAR_WHITE_SPACE = null;
    public static final com.google.common.net.MediaType MANIFEST_JSON_UTF_8 = null;
    public static final com.google.common.net.MediaType MBOX = null;
    public static final com.google.common.net.MediaType MEDIA_PRESENTATION_DESCRIPTION = null;
    public static final com.google.common.net.MediaType MICROSOFT_EXCEL = null;
    public static final com.google.common.net.MediaType MICROSOFT_OUTLOOK = null;
    public static final com.google.common.net.MediaType MICROSOFT_POWERPOINT = null;
    public static final com.google.common.net.MediaType MICROSOFT_WORD = null;
    public static final com.google.common.net.MediaType MP4_AUDIO = null;
    public static final com.google.common.net.MediaType MP4_VIDEO = null;
    public static final com.google.common.net.MediaType MPEG_AUDIO = null;
    public static final com.google.common.net.MediaType MPEG_VIDEO = null;
    public static final com.google.common.net.MediaType NACL_APPLICATION = null;
    public static final com.google.common.net.MediaType NACL_PORTABLE_APPLICATION = null;
    public static final com.google.common.net.MediaType OCTET_STREAM = null;
    public static final com.google.common.net.MediaType OGG_AUDIO = null;
    public static final com.google.common.net.MediaType OGG_CONTAINER = null;
    public static final com.google.common.net.MediaType OGG_VIDEO = null;
    public static final com.google.common.net.MediaType OOXML_DOCUMENT = null;
    public static final com.google.common.net.MediaType OOXML_PRESENTATION = null;
    public static final com.google.common.net.MediaType OOXML_SHEET = null;
    public static final com.google.common.net.MediaType OPENDOCUMENT_GRAPHICS = null;
    public static final com.google.common.net.MediaType OPENDOCUMENT_PRESENTATION = null;
    public static final com.google.common.net.MediaType OPENDOCUMENT_SPREADSHEET = null;
    public static final com.google.common.net.MediaType OPENDOCUMENT_TEXT = null;
    public static final com.google.common.net.MediaType OPENSEARCH_DESCRIPTION_UTF_8 = null;
    private static final com.google.common.base.Joiner.MapJoiner PARAMETER_JOINER = null;
    public static final com.google.common.net.MediaType PDF = null;
    public static final com.google.common.net.MediaType PLAIN_TEXT_UTF_8 = null;
    public static final com.google.common.net.MediaType PNG = null;
    public static final com.google.common.net.MediaType POSTSCRIPT = null;
    public static final com.google.common.net.MediaType PROTOBUF = null;
    public static final com.google.common.net.MediaType PSD = null;
    public static final com.google.common.net.MediaType QUICKTIME = null;
    private static final com.google.common.base.CharMatcher QUOTED_TEXT_MATCHER = null;
    public static final com.google.common.net.MediaType RDF_XML_UTF_8 = null;
    public static final com.google.common.net.MediaType RTF_UTF_8 = null;
    public static final com.google.common.net.MediaType SFNT = null;
    public static final com.google.common.net.MediaType SHOCKWAVE_FLASH = null;
    public static final com.google.common.net.MediaType SKETCHUP = null;
    public static final com.google.common.net.MediaType SOAP_XML_UTF_8 = null;
    public static final com.google.common.net.MediaType SVG_UTF_8 = null;
    public static final com.google.common.net.MediaType TAR = null;
    public static final com.google.common.net.MediaType TEXT_JAVASCRIPT_UTF_8 = null;
    private static final java.lang.String TEXT_TYPE = "text";
    public static final com.google.common.net.MediaType THREE_GPP2_VIDEO = null;
    public static final com.google.common.net.MediaType THREE_GPP_VIDEO = null;
    public static final com.google.common.net.MediaType TIFF = null;
    private static final com.google.common.base.CharMatcher TOKEN_MATCHER = null;
    public static final com.google.common.net.MediaType TSV_UTF_8 = null;
    private static final com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> UTF_8_CONSTANT_PARAMETERS = null;
    public static final com.google.common.net.MediaType VCARD_UTF_8 = null;
    private static final java.lang.String VIDEO_TYPE = "video";
    public static final com.google.common.net.MediaType VND_REAL_AUDIO = null;
    public static final com.google.common.net.MediaType VND_WAVE_AUDIO = null;
    public static final com.google.common.net.MediaType VORBIS_AUDIO = null;
    public static final com.google.common.net.MediaType VTT_UTF_8 = null;
    public static final com.google.common.net.MediaType WASM_APPLICATION = null;
    public static final com.google.common.net.MediaType WAX_AUDIO = null;
    public static final com.google.common.net.MediaType WEBM_AUDIO = null;
    public static final com.google.common.net.MediaType WEBM_VIDEO = null;
    public static final com.google.common.net.MediaType WEBP = null;
    private static final java.lang.String WILDCARD = "*";
    public static final com.google.common.net.MediaType WMA_AUDIO = null;
    public static final com.google.common.net.MediaType WML_UTF_8 = null;
    public static final com.google.common.net.MediaType WMV = null;
    public static final com.google.common.net.MediaType WOFF = null;
    public static final com.google.common.net.MediaType WOFF2 = null;
    public static final com.google.common.net.MediaType XHTML_UTF_8 = null;
    public static final com.google.common.net.MediaType XML_UTF_8 = null;
    public static final com.google.common.net.MediaType XRD_UTF_8 = null;
    public static final com.google.common.net.MediaType ZIP = null;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private int hashCode;
    private final com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> parameters;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private com.google.common.base.Optional<java.nio.charset.Charset> parsedCharset;
    private final java.lang.String subtype;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private java.lang.String toString;
    private final java.lang.String type;



    public static final class Tokenizer {
        public final java.lang.String input;
        public int position;

        public Tokenizer(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.position = r0
                r1.input = r2
                return
        }

        public final char consumeCharacter(char r3) {
                r2 = this;
                boolean r0 = r2.hasMore()
                com.google.common.base.Preconditions.checkState(r0)
                char r0 = r2.previewChar()
                r1 = 1
                if (r0 != r3) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.common.base.Preconditions.checkState(r0)
                int r0 = r2.position
                int r0 = r0 + r1
                r2.position = r0
                return r3
        }

        public final java.lang.String consumeToken(com.google.common.base.CharMatcher r3) {
                r2 = this;
                int r0 = r2.position
                java.lang.String r3 = r2.consumeTokenIfPresent(r3)
                int r1 = r2.position
                if (r1 == r0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                com.google.common.base.Preconditions.checkState(r0)
                return r3
        }

        public final java.lang.String consumeTokenIfPresent(com.google.common.base.CharMatcher r3) {
                r2 = this;
                boolean r0 = r2.hasMore()
                com.google.common.base.Preconditions.checkState(r0)
                int r0 = r2.position
                com.google.common.base.CharMatcher r3 = r3.negate()
                java.lang.String r1 = r2.input
                int r3 = r3.indexIn(r1, r0)
                r2.position = r3
                boolean r3 = r2.hasMore()
                if (r3 == 0) goto L24
                java.lang.String r3 = r2.input
                int r1 = r2.position
                java.lang.String r3 = r3.substring(r0, r1)
                goto L2a
            L24:
                java.lang.String r3 = r2.input
                java.lang.String r3 = r3.substring(r0)
            L2a:
                return r3
        }

        public final boolean hasMore() {
                r2 = this;
                int r0 = r2.position
                if (r0 < 0) goto Le
                java.lang.String r1 = r2.input
                int r1 = r1.length()
                if (r0 >= r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public final char previewChar() {
                r2 = this;
                boolean r0 = r2.hasMore()
                com.google.common.base.Preconditions.checkState(r0)
                java.lang.String r0 = r2.input
                int r1 = r2.position
                char r0 = r0.charAt(r1)
                return r0
        }
    }

    static {
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            java.lang.String r0 = r0.name()
            java.lang.String r0 = com.google.common.base.Ascii.toLowerCase(r0)
            java.lang.String r1 = "charset"
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of(r1, r0)
            com.google.common.net.MediaType.UTF_8_CONSTANT_PARAMETERS = r0
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.ascii()
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.javaIsoControl()
            com.google.common.base.CharMatcher r1 = r1.negate()
            com.google.common.base.CharMatcher r0 = r0.and(r1)
            r1 = 32
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.isNot(r1)
            com.google.common.base.CharMatcher r0 = r0.and(r1)
            java.lang.String r1 = "()<>@,;:\\\"/[]?="
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.noneOf(r1)
            com.google.common.base.CharMatcher r0 = r0.and(r1)
            com.google.common.net.MediaType.TOKEN_MATCHER = r0
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.ascii()
            java.lang.String r1 = "\"\\\r"
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.noneOf(r1)
            com.google.common.base.CharMatcher r0 = r0.and(r1)
            com.google.common.net.MediaType.QUOTED_TEXT_MATCHER = r0
            java.lang.String r0 = " \t\r\n"
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.anyOf(r0)
            com.google.common.net.MediaType.LINEAR_WHITE_SPACE = r0
            java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
            com.google.common.net.MediaType.KNOWN_TYPES = r0
            java.lang.String r0 = "*"
            com.google.common.net.MediaType r1 = createConstant(r0, r0)
            com.google.common.net.MediaType.ANY_TYPE = r1
            java.lang.String r1 = "text"
            com.google.common.net.MediaType r2 = createConstant(r1, r0)
            com.google.common.net.MediaType.ANY_TEXT_TYPE = r2
            java.lang.String r2 = "image"
            com.google.common.net.MediaType r3 = createConstant(r2, r0)
            com.google.common.net.MediaType.ANY_IMAGE_TYPE = r3
            java.lang.String r3 = "audio"
            com.google.common.net.MediaType r4 = createConstant(r3, r0)
            com.google.common.net.MediaType.ANY_AUDIO_TYPE = r4
            java.lang.String r4 = "video"
            com.google.common.net.MediaType r5 = createConstant(r4, r0)
            com.google.common.net.MediaType.ANY_VIDEO_TYPE = r5
            java.lang.String r5 = "application"
            com.google.common.net.MediaType r6 = createConstant(r5, r0)
            com.google.common.net.MediaType.ANY_APPLICATION_TYPE = r6
            java.lang.String r6 = "font"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.ANY_FONT_TYPE = r0
            java.lang.String r0 = "cache-manifest"
            com.google.common.net.MediaType r0 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.CACHE_MANIFEST_UTF_8 = r0
            java.lang.String r0 = "css"
            com.google.common.net.MediaType r0 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.CSS_UTF_8 = r0
            java.lang.String r0 = "csv"
            com.google.common.net.MediaType r0 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.CSV_UTF_8 = r0
            java.lang.String r0 = "html"
            com.google.common.net.MediaType r0 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.HTML_UTF_8 = r0
            java.lang.String r0 = "calendar"
            com.google.common.net.MediaType r0 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.I_CALENDAR_UTF_8 = r0
            java.lang.String r0 = "plain"
            com.google.common.net.MediaType r0 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.PLAIN_TEXT_UTF_8 = r0
            java.lang.String r0 = "javascript"
            com.google.common.net.MediaType r7 = createConstantUtf8(r1, r0)
            com.google.common.net.MediaType.TEXT_JAVASCRIPT_UTF_8 = r7
            java.lang.String r7 = "tab-separated-values"
            com.google.common.net.MediaType r7 = createConstantUtf8(r1, r7)
            com.google.common.net.MediaType.TSV_UTF_8 = r7
            java.lang.String r7 = "vcard"
            com.google.common.net.MediaType r7 = createConstantUtf8(r1, r7)
            com.google.common.net.MediaType.VCARD_UTF_8 = r7
            java.lang.String r7 = "vnd.wap.wml"
            com.google.common.net.MediaType r7 = createConstantUtf8(r1, r7)
            com.google.common.net.MediaType.WML_UTF_8 = r7
            java.lang.String r7 = "xml"
            com.google.common.net.MediaType r8 = createConstantUtf8(r1, r7)
            com.google.common.net.MediaType.XML_UTF_8 = r8
            java.lang.String r8 = "vtt"
            com.google.common.net.MediaType r1 = createConstantUtf8(r1, r8)
            com.google.common.net.MediaType.VTT_UTF_8 = r1
            java.lang.String r1 = "bmp"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.BMP = r1
            java.lang.String r1 = "x-canon-crw"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.CRW = r1
            java.lang.String r1 = "gif"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.GIF = r1
            java.lang.String r1 = "vnd.microsoft.icon"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.ICO = r1
            java.lang.String r1 = "jpeg"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.JPEG = r1
            java.lang.String r1 = "png"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.PNG = r1
            java.lang.String r1 = "vnd.adobe.photoshop"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.PSD = r1
            java.lang.String r1 = "svg+xml"
            com.google.common.net.MediaType r1 = createConstantUtf8(r2, r1)
            com.google.common.net.MediaType.SVG_UTF_8 = r1
            java.lang.String r1 = "tiff"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.TIFF = r1
            java.lang.String r1 = "webp"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.WEBP = r1
            java.lang.String r1 = "heif"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.HEIF = r1
            java.lang.String r1 = "jp2"
            com.google.common.net.MediaType r1 = createConstant(r2, r1)
            com.google.common.net.MediaType.JP2K = r1
            java.lang.String r1 = "mp4"
            com.google.common.net.MediaType r2 = createConstant(r3, r1)
            com.google.common.net.MediaType.MP4_AUDIO = r2
            java.lang.String r2 = "mpeg"
            com.google.common.net.MediaType r8 = createConstant(r3, r2)
            com.google.common.net.MediaType.MPEG_AUDIO = r8
            java.lang.String r8 = "ogg"
            com.google.common.net.MediaType r9 = createConstant(r3, r8)
            com.google.common.net.MediaType.OGG_AUDIO = r9
            java.lang.String r9 = "webm"
            com.google.common.net.MediaType r10 = createConstant(r3, r9)
            com.google.common.net.MediaType.WEBM_AUDIO = r10
            java.lang.String r10 = "l16"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.L16_AUDIO = r10
            java.lang.String r10 = "l24"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.L24_AUDIO = r10
            java.lang.String r10 = "basic"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.BASIC_AUDIO = r10
            java.lang.String r10 = "aac"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.AAC_AUDIO = r10
            java.lang.String r10 = "vorbis"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.VORBIS_AUDIO = r10
            java.lang.String r10 = "x-ms-wma"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.WMA_AUDIO = r10
            java.lang.String r10 = "x-ms-wax"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.WAX_AUDIO = r10
            java.lang.String r10 = "vnd.rn-realaudio"
            com.google.common.net.MediaType r10 = createConstant(r3, r10)
            com.google.common.net.MediaType.VND_REAL_AUDIO = r10
            java.lang.String r10 = "vnd.wave"
            com.google.common.net.MediaType r3 = createConstant(r3, r10)
            com.google.common.net.MediaType.VND_WAVE_AUDIO = r3
            com.google.common.net.MediaType r1 = createConstant(r4, r1)
            com.google.common.net.MediaType.MP4_VIDEO = r1
            com.google.common.net.MediaType r1 = createConstant(r4, r2)
            com.google.common.net.MediaType.MPEG_VIDEO = r1
            com.google.common.net.MediaType r1 = createConstant(r4, r8)
            com.google.common.net.MediaType.OGG_VIDEO = r1
            java.lang.String r1 = "quicktime"
            com.google.common.net.MediaType r1 = createConstant(r4, r1)
            com.google.common.net.MediaType.QUICKTIME = r1
            com.google.common.net.MediaType r1 = createConstant(r4, r9)
            com.google.common.net.MediaType.WEBM_VIDEO = r1
            java.lang.String r1 = "x-ms-wmv"
            com.google.common.net.MediaType r1 = createConstant(r4, r1)
            com.google.common.net.MediaType.WMV = r1
            java.lang.String r1 = "x-flv"
            com.google.common.net.MediaType r1 = createConstant(r4, r1)
            com.google.common.net.MediaType.FLV_VIDEO = r1
            java.lang.String r1 = "3gpp"
            com.google.common.net.MediaType r1 = createConstant(r4, r1)
            com.google.common.net.MediaType.THREE_GPP_VIDEO = r1
            java.lang.String r1 = "3gpp2"
            com.google.common.net.MediaType r1 = createConstant(r4, r1)
            com.google.common.net.MediaType.THREE_GPP2_VIDEO = r1
            com.google.common.net.MediaType r1 = createConstantUtf8(r5, r7)
            com.google.common.net.MediaType.APPLICATION_XML_UTF_8 = r1
            java.lang.String r1 = "atom+xml"
            com.google.common.net.MediaType r1 = createConstantUtf8(r5, r1)
            com.google.common.net.MediaType.ATOM_UTF_8 = r1
            java.lang.String r1 = "x-bzip2"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.BZIP2 = r1
            java.lang.String r1 = "dart"
            com.google.common.net.MediaType r1 = createConstantUtf8(r5, r1)
            com.google.common.net.MediaType.DART_UTF_8 = r1
            java.lang.String r1 = "vnd.apple.pkpass"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.APPLE_PASSBOOK = r1
            java.lang.String r1 = "vnd.ms-fontobject"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.EOT = r1
            java.lang.String r1 = "epub+zip"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.EPUB = r1
            java.lang.String r1 = "x-www-form-urlencoded"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.FORM_DATA = r1
            java.lang.String r1 = "pkcs12"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.KEY_ARCHIVE = r1
            java.lang.String r1 = "binary"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.APPLICATION_BINARY = r1
            java.lang.String r1 = "geo+json"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.GEO_JSON = r1
            java.lang.String r1 = "x-gzip"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.GZIP = r1
            java.lang.String r1 = "hal+json"
            com.google.common.net.MediaType r1 = createConstant(r5, r1)
            com.google.common.net.MediaType.HAL_JSON = r1
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.JAVASCRIPT_UTF_8 = r0
            java.lang.String r0 = "jose"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.JOSE = r0
            java.lang.String r0 = "jose+json"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.JOSE_JSON = r0
            java.lang.String r0 = "json"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.JSON_UTF_8 = r0
            java.lang.String r0 = "manifest+json"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.MANIFEST_JSON_UTF_8 = r0
            java.lang.String r0 = "vnd.google-earth.kml+xml"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.KML = r0
            java.lang.String r0 = "vnd.google-earth.kmz"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.KMZ = r0
            java.lang.String r0 = "mbox"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.MBOX = r0
            java.lang.String r0 = "x-apple-aspen-config"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.APPLE_MOBILE_CONFIG = r0
            java.lang.String r0 = "vnd.ms-excel"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.MICROSOFT_EXCEL = r0
            java.lang.String r0 = "vnd.ms-outlook"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.MICROSOFT_OUTLOOK = r0
            java.lang.String r0 = "vnd.ms-powerpoint"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.MICROSOFT_POWERPOINT = r0
            java.lang.String r0 = "msword"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.MICROSOFT_WORD = r0
            java.lang.String r0 = "dash+xml"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.MEDIA_PRESENTATION_DESCRIPTION = r0
            java.lang.String r0 = "wasm"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.WASM_APPLICATION = r0
            java.lang.String r0 = "x-nacl"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.NACL_APPLICATION = r0
            java.lang.String r0 = "x-pnacl"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.NACL_PORTABLE_APPLICATION = r0
            java.lang.String r0 = "octet-stream"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OCTET_STREAM = r0
            com.google.common.net.MediaType r0 = createConstant(r5, r8)
            com.google.common.net.MediaType.OGG_CONTAINER = r0
            java.lang.String r0 = "vnd.openxmlformats-officedocument.wordprocessingml.document"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OOXML_DOCUMENT = r0
            java.lang.String r0 = "vnd.openxmlformats-officedocument.presentationml.presentation"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OOXML_PRESENTATION = r0
            java.lang.String r0 = "vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OOXML_SHEET = r0
            java.lang.String r0 = "vnd.oasis.opendocument.graphics"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OPENDOCUMENT_GRAPHICS = r0
            java.lang.String r0 = "vnd.oasis.opendocument.presentation"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OPENDOCUMENT_PRESENTATION = r0
            java.lang.String r0 = "vnd.oasis.opendocument.spreadsheet"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OPENDOCUMENT_SPREADSHEET = r0
            java.lang.String r0 = "vnd.oasis.opendocument.text"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.OPENDOCUMENT_TEXT = r0
            java.lang.String r0 = "opensearchdescription+xml"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.OPENSEARCH_DESCRIPTION_UTF_8 = r0
            java.lang.String r0 = "pdf"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.PDF = r0
            java.lang.String r0 = "postscript"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.POSTSCRIPT = r0
            java.lang.String r0 = "protobuf"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.PROTOBUF = r0
            java.lang.String r0 = "rdf+xml"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.RDF_XML_UTF_8 = r0
            java.lang.String r0 = "rtf"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.RTF_UTF_8 = r0
            java.lang.String r0 = "font-sfnt"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.SFNT = r0
            java.lang.String r0 = "x-shockwave-flash"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.SHOCKWAVE_FLASH = r0
            java.lang.String r0 = "vnd.sketchup.skp"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.SKETCHUP = r0
            java.lang.String r0 = "soap+xml"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.SOAP_XML_UTF_8 = r0
            java.lang.String r0 = "x-tar"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.TAR = r0
            java.lang.String r0 = "font-woff"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.WOFF = r0
            java.lang.String r0 = "font-woff2"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.WOFF2 = r0
            java.lang.String r0 = "xhtml+xml"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.XHTML_UTF_8 = r0
            java.lang.String r0 = "xrd+xml"
            com.google.common.net.MediaType r0 = createConstantUtf8(r5, r0)
            com.google.common.net.MediaType.XRD_UTF_8 = r0
            java.lang.String r0 = "zip"
            com.google.common.net.MediaType r0 = createConstant(r5, r0)
            com.google.common.net.MediaType.ZIP = r0
            java.lang.String r0 = "collection"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.FONT_COLLECTION = r0
            java.lang.String r0 = "otf"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.FONT_OTF = r0
            java.lang.String r0 = "sfnt"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.FONT_SFNT = r0
            java.lang.String r0 = "ttf"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.FONT_TTF = r0
            java.lang.String r0 = "woff"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.FONT_WOFF = r0
            java.lang.String r0 = "woff2"
            com.google.common.net.MediaType r0 = createConstant(r6, r0)
            com.google.common.net.MediaType.FONT_WOFF2 = r0
            java.lang.String r0 = "; "
            com.google.common.base.Joiner r0 = com.google.common.base.Joiner.on(r0)
            java.lang.String r1 = "="
            com.google.common.base.Joiner$MapJoiner r0 = r0.withKeyValueSeparator(r1)
            com.google.common.net.MediaType.PARAMETER_JOINER = r0
            return
    }

    private MediaType(java.lang.String r1, java.lang.String r2, com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r3) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.subtype = r2
            r0.parameters = r3
            return
    }

    public static /* synthetic */ com.google.common.base.CharMatcher access$000() {
            com.google.common.base.CharMatcher r0 = com.google.common.net.MediaType.TOKEN_MATCHER
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(java.lang.String r0) {
            java.lang.String r0 = escapeAndQuote(r0)
            return r0
    }

    private static com.google.common.net.MediaType addKnownType(com.google.common.net.MediaType r1) {
            java.util.Map<com.google.common.net.MediaType, com.google.common.net.MediaType> r0 = com.google.common.net.MediaType.KNOWN_TYPES
            r0.put(r1, r1)
            return r1
    }

    private java.lang.String computeToString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.type
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            java.lang.String r1 = r3.subtype
            r0.append(r1)
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r1 = r3.parameters
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L35
            java.lang.String r1 = "; "
            r0.append(r1)
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r1 = r3.parameters
            com.google.common.net.MediaType$2 r2 = new com.google.common.net.MediaType$2
            r2.<init>()
            com.google.common.collect.ListMultimap r1 = com.google.common.collect.Multimaps.transformValues(r1, r2)
            com.google.common.base.Joiner$MapJoiner r2 = com.google.common.net.MediaType.PARAMETER_JOINER
            java.util.Collection r1 = r1.entries()
            r2.appendTo(r0, r1)
        L35:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static com.google.common.net.MediaType create(java.lang.String r1, java.lang.String r2) {
            com.google.common.collect.ImmutableListMultimap r0 = com.google.common.collect.ImmutableListMultimap.of()
            com.google.common.net.MediaType r1 = create(r1, r2, r0)
            com.google.common.base.Optional r2 = com.google.common.base.Optional.absent()
            r1.parsedCharset = r2
            return r1
    }

    private static com.google.common.net.MediaType create(java.lang.String r3, java.lang.String r4, com.google.common.collect.Multimap<java.lang.String, java.lang.String> r5) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.String r3 = normalizeToken(r3)
            java.lang.String r4 = normalizeToken(r4)
            java.lang.String r0 = "*"
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L22
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L20
            goto L22
        L20:
            r0 = 0
            goto L23
        L22:
            r0 = 1
        L23:
            java.lang.String r1 = "A wildcard type cannot be used with a non-wildcard subtype"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            com.google.common.collect.ImmutableListMultimap$Builder r0 = com.google.common.collect.ImmutableListMultimap.builder()
            java.util.Collection r5 = r5.entries()
            java.util.Iterator r5 = r5.iterator()
        L34:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = normalizeToken(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = normalizeParameterValue(r2, r1)
            r0.put(r2, r1)
            goto L34
        L58:
            com.google.common.net.MediaType r5 = new com.google.common.net.MediaType
            com.google.common.collect.ImmutableListMultimap r0 = r0.build()
            r5.<init>(r3, r4, r0)
            java.util.Map<com.google.common.net.MediaType, com.google.common.net.MediaType> r3 = com.google.common.net.MediaType.KNOWN_TYPES
            java.lang.Object r3 = r3.get(r5)
            com.google.common.net.MediaType r3 = (com.google.common.net.MediaType) r3
            java.lang.Object r3 = com.google.common.base.MoreObjects.firstNonNull(r3, r5)
            com.google.common.net.MediaType r3 = (com.google.common.net.MediaType) r3
            return r3
    }

    private static com.google.common.net.MediaType createConstant(java.lang.String r2, java.lang.String r3) {
            com.google.common.net.MediaType r0 = new com.google.common.net.MediaType
            com.google.common.collect.ImmutableListMultimap r1 = com.google.common.collect.ImmutableListMultimap.of()
            r0.<init>(r2, r3, r1)
            com.google.common.net.MediaType r2 = addKnownType(r0)
            com.google.common.base.Optional r3 = com.google.common.base.Optional.absent()
            r2.parsedCharset = r3
            return r2
    }

    private static com.google.common.net.MediaType createConstantUtf8(java.lang.String r2, java.lang.String r3) {
            com.google.common.net.MediaType r0 = new com.google.common.net.MediaType
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r1 = com.google.common.net.MediaType.UTF_8_CONSTANT_PARAMETERS
            r0.<init>(r2, r3, r1)
            com.google.common.net.MediaType r2 = addKnownType(r0)
            java.nio.charset.Charset r3 = com.google.common.base.Charsets.UTF_8
            com.google.common.base.Optional r3 = com.google.common.base.Optional.of(r3)
            r2.parsedCharset = r3
            return r2
    }

    private static java.lang.String escapeAndQuote(java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            int r1 = r1 + 16
            r0.<init>(r1)
            r1 = 34
            r0.append(r1)
            r2 = 0
        L11:
            int r3 = r6.length()
            if (r2 >= r3) goto L2e
            char r3 = r6.charAt(r2)
            r4 = 13
            r5 = 92
            if (r3 == r4) goto L25
            if (r3 == r5) goto L25
            if (r3 != r1) goto L28
        L25:
            r0.append(r5)
        L28:
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L2e:
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            return r6
    }

    private static java.lang.String normalizeParameterValue(java.lang.String r2, java.lang.String r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.CharMatcher r0 = com.google.common.base.CharMatcher.ascii()
            boolean r0 = r0.matchesAllOf(r3)
            java.lang.String r1 = "parameter values must be ASCII: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r3)
            java.lang.String r0 = "charset"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1c
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
        L1c:
            return r3
    }

    private static java.lang.String normalizeToken(java.lang.String r1) {
            com.google.common.base.CharMatcher r0 = com.google.common.net.MediaType.TOKEN_MATCHER
            boolean r0 = r0.matchesAllOf(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            return r1
    }

    private java.util.Map<java.lang.String, com.google.common.collect.ImmutableMultiset<java.lang.String>> parametersAsMap() {
            r2 = this;
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r0 = r2.parameters
            com.google.common.collect.ImmutableMap r0 = r0.asMap()
            com.google.common.net.MediaType$1 r1 = new com.google.common.net.MediaType$1
            r1.<init>()
            java.util.Map r0 = com.google.common.collect.Maps.transformValues(r0, r1)
            return r0
    }

    public static com.google.common.net.MediaType parse(java.lang.String r9) {
            com.google.common.base.Preconditions.checkNotNull(r9)
            com.google.common.net.MediaType$Tokenizer r0 = new com.google.common.net.MediaType$Tokenizer
            r0.<init>(r9)
            com.google.common.base.CharMatcher r1 = com.google.common.net.MediaType.TOKEN_MATCHER     // Catch: java.lang.IllegalStateException -> L9d
            java.lang.String r2 = r0.consumeToken(r1)     // Catch: java.lang.IllegalStateException -> L9d
            r3 = 47
            r0.consumeCharacter(r3)     // Catch: java.lang.IllegalStateException -> L9d
            java.lang.String r1 = r0.consumeToken(r1)     // Catch: java.lang.IllegalStateException -> L9d
            com.google.common.collect.ImmutableListMultimap$Builder r3 = com.google.common.collect.ImmutableListMultimap.builder()     // Catch: java.lang.IllegalStateException -> L9d
        L1b:
            boolean r4 = r0.hasMore()     // Catch: java.lang.IllegalStateException -> L9d
            if (r4 == 0) goto L94
            com.google.common.base.CharMatcher r4 = com.google.common.net.MediaType.LINEAR_WHITE_SPACE     // Catch: java.lang.IllegalStateException -> L9d
            r0.consumeTokenIfPresent(r4)     // Catch: java.lang.IllegalStateException -> L9d
            r5 = 59
            r0.consumeCharacter(r5)     // Catch: java.lang.IllegalStateException -> L9d
            r0.consumeTokenIfPresent(r4)     // Catch: java.lang.IllegalStateException -> L9d
            com.google.common.base.CharMatcher r4 = com.google.common.net.MediaType.TOKEN_MATCHER     // Catch: java.lang.IllegalStateException -> L9d
            java.lang.String r5 = r0.consumeToken(r4)     // Catch: java.lang.IllegalStateException -> L9d
            r6 = 61
            r0.consumeCharacter(r6)     // Catch: java.lang.IllegalStateException -> L9d
            char r6 = r0.previewChar()     // Catch: java.lang.IllegalStateException -> L9d
            r7 = 34
            if (r7 != r6) goto L8c
            r0.consumeCharacter(r7)     // Catch: java.lang.IllegalStateException -> L9d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L9d
            r4.<init>()     // Catch: java.lang.IllegalStateException -> L9d
        L49:
            char r6 = r0.previewChar()     // Catch: java.lang.IllegalStateException -> L9d
            if (r7 == r6) goto L84
            char r6 = r0.previewChar()     // Catch: java.lang.IllegalStateException -> L9d
            r8 = 92
            if (r8 != r6) goto L7a
            r0.consumeCharacter(r8)     // Catch: java.lang.IllegalStateException -> L9d
            com.google.common.base.CharMatcher r6 = com.google.common.base.CharMatcher.ascii()     // Catch: java.lang.IllegalStateException -> L9d
            boolean r8 = r0.hasMore()     // Catch: java.lang.IllegalStateException -> L9d
            com.google.common.base.Preconditions.checkState(r8)     // Catch: java.lang.IllegalStateException -> L9d
            char r8 = r0.previewChar()     // Catch: java.lang.IllegalStateException -> L9d
            boolean r6 = r6.matches(r8)     // Catch: java.lang.IllegalStateException -> L9d
            com.google.common.base.Preconditions.checkState(r6)     // Catch: java.lang.IllegalStateException -> L9d
            int r6 = r0.position     // Catch: java.lang.IllegalStateException -> L9d
            int r6 = r6 + 1
            r0.position = r6     // Catch: java.lang.IllegalStateException -> L9d
            r4.append(r8)     // Catch: java.lang.IllegalStateException -> L9d
            goto L49
        L7a:
            com.google.common.base.CharMatcher r6 = com.google.common.net.MediaType.QUOTED_TEXT_MATCHER     // Catch: java.lang.IllegalStateException -> L9d
            java.lang.String r6 = r0.consumeToken(r6)     // Catch: java.lang.IllegalStateException -> L9d
            r4.append(r6)     // Catch: java.lang.IllegalStateException -> L9d
            goto L49
        L84:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.IllegalStateException -> L9d
            r0.consumeCharacter(r7)     // Catch: java.lang.IllegalStateException -> L9d
            goto L90
        L8c:
            java.lang.String r4 = r0.consumeToken(r4)     // Catch: java.lang.IllegalStateException -> L9d
        L90:
            r3.put(r5, r4)     // Catch: java.lang.IllegalStateException -> L9d
            goto L1b
        L94:
            com.google.common.collect.ImmutableListMultimap r0 = r3.build()     // Catch: java.lang.IllegalStateException -> L9d
            com.google.common.net.MediaType r9 = create(r2, r1, r0)     // Catch: java.lang.IllegalStateException -> L9d
            return r9
        L9d:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = 18
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r9, r2)
            java.lang.String r3 = "Could not parse '"
            java.lang.String r4 = "'"
            java.lang.String r9 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r3, r9, r4)
            r1.<init>(r9, r0)
            throw r1
    }

    public com.google.common.base.Optional<java.nio.charset.Charset> charset() {
            r7 = this;
            com.google.common.base.Optional<java.nio.charset.Charset> r0 = r7.parsedCharset
            if (r0 != 0) goto L51
            r0 = 0
            com.google.common.base.Optional r1 = com.google.common.base.Optional.absent()
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r2 = r7.parameters
            java.lang.String r3 = "charset"
            com.google.common.collect.ImmutableList r2 = r2.get(r3)
            com.google.common.collect.UnmodifiableIterator r2 = r2.iterator()
            r6 = r1
            r1 = r0
            r0 = r6
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r1 != 0) goto L30
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r3)
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)
            r1 = r3
            goto L18
        L30:
            boolean r4 = r1.equals(r3)
            if (r4 == 0) goto L37
            goto L18
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r2 = r1.length()
            int r2 = r2 + 35
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r2)
            java.lang.String r4 = "Multiple charset values defined: "
            java.lang.String r5 = ", "
            java.lang.String r1 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r4, r1, r5, r3)
            r0.<init>(r1)
            throw r0
        L4f:
            r7.parsedCharset = r0
        L51:
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.net.MediaType
            r2 = 0
            if (r1 == 0) goto L30
            com.google.common.net.MediaType r5 = (com.google.common.net.MediaType) r5
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            java.lang.String r1 = r4.subtype
            java.lang.String r3 = r5.subtype
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            java.util.Map r1 = r4.parametersAsMap()
            java.util.Map r5 = r5.parametersAsMap()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        L30:
            return r2
    }

    public boolean hasWildcard() {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = "*"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = r2.subtype
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.hashCode
            if (r0 != 0) goto L1e
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = r3.type
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = r3.subtype
            r0[r1] = r2
            r1 = 2
            java.util.Map r2 = r3.parametersAsMap()
            r0[r1] = r2
            int r0 = com.google.common.base.Objects.hashCode(r0)
            r3.hashCode = r0
        L1e:
            return r0
    }

    public boolean is(com.google.common.net.MediaType r4) {
            r3 = this;
            java.lang.String r0 = r4.type
            java.lang.String r1 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = r4.type
            java.lang.String r2 = r3.type
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3a
        L14:
            java.lang.String r0 = r4.subtype
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            java.lang.String r0 = r4.subtype
            java.lang.String r1 = r3.subtype
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
        L26:
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r0 = r3.parameters
            com.google.common.collect.ImmutableCollection r0 = r0.entries()
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r4 = r4.parameters
            com.google.common.collect.ImmutableCollection r4 = r4.entries()
            boolean r4 = r0.containsAll(r4)
            if (r4 == 0) goto L3a
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            return r4
    }

    public com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> parameters() {
            r1 = this;
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r0 = r1.parameters
            return r0
    }

    public java.lang.String subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            if (r0 != 0) goto La
            java.lang.String r0 = r1.computeToString()
            r1.toString = r0
        La:
            return r0
    }

    public java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public com.google.common.net.MediaType withCharset(java.nio.charset.Charset r3) {
            r2 = this;
            com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.String r0 = r3.name()
            java.lang.String r1 = "charset"
            com.google.common.net.MediaType r0 = r2.withParameter(r1, r0)
            com.google.common.base.Optional r3 = com.google.common.base.Optional.of(r3)
            r0.parsedCharset = r3
            return r0
    }

    public com.google.common.net.MediaType withParameter(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.google.common.collect.ImmutableSet r2 = com.google.common.collect.ImmutableSet.of(r2)
            com.google.common.net.MediaType r1 = r0.withParameters(r1, r2)
            return r1
    }

    public com.google.common.net.MediaType withParameters(com.google.common.collect.Multimap<java.lang.String, java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = r2.type
            java.lang.String r1 = r2.subtype
            com.google.common.net.MediaType r3 = create(r0, r1, r3)
            return r3
    }

    public com.google.common.net.MediaType withParameters(java.lang.String r6, java.lang.Iterable<java.lang.String> r7) {
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6)
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.lang.String r6 = normalizeToken(r6)
            com.google.common.collect.ImmutableListMultimap$Builder r0 = com.google.common.collect.ImmutableListMultimap.builder()
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r1 = r5.parameters
            com.google.common.collect.ImmutableCollection r1 = r1.entries()
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r6.equals(r3)
            if (r4 != 0) goto L18
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r3, r2)
            goto L18
        L3a:
            java.util.Iterator r7 = r7.iterator()
        L3e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = normalizeParameterValue(r6, r1)
            r0.put(r6, r1)
            goto L3e
        L52:
            com.google.common.net.MediaType r7 = new com.google.common.net.MediaType
            java.lang.String r1 = r5.type
            java.lang.String r2 = r5.subtype
            com.google.common.collect.ImmutableListMultimap r0 = r0.build()
            r7.<init>(r1, r2, r0)
            java.lang.String r0 = "charset"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6b
            com.google.common.base.Optional<java.nio.charset.Charset> r6 = r5.parsedCharset
            r7.parsedCharset = r6
        L6b:
            java.util.Map<com.google.common.net.MediaType, com.google.common.net.MediaType> r6 = com.google.common.net.MediaType.KNOWN_TYPES
            java.lang.Object r6 = r6.get(r7)
            com.google.common.net.MediaType r6 = (com.google.common.net.MediaType) r6
            java.lang.Object r6 = com.google.common.base.MoreObjects.firstNonNull(r6, r7)
            com.google.common.net.MediaType r6 = (com.google.common.net.MediaType) r6
            return r6
    }

    public com.google.common.net.MediaType withoutParameters() {
            r2 = this;
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> r0 = r2.parameters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = r2
            goto L12
        La:
            java.lang.String r0 = r2.type
            java.lang.String r1 = r2.subtype
            com.google.common.net.MediaType r0 = create(r0, r1)
        L12:
            return r0
    }
}
