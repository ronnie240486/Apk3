package com.google.android.exoplayer2.source.hls.playlist;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsPlaylistParser implements com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist> {
    private static final java.lang.String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final java.lang.String BOOLEAN_FALSE = "NO";
    private static final java.lang.String BOOLEAN_TRUE = "YES";
    private static final java.lang.String KEYFORMAT_IDENTITY = "identity";
    private static final java.lang.String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final java.lang.String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final java.lang.String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final java.lang.String LOG_TAG = "HlsPlaylistParser";
    private static final java.lang.String METHOD_AES_128 = "AES-128";
    private static final java.lang.String METHOD_NONE = "NONE";
    private static final java.lang.String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final java.lang.String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final java.lang.String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final java.lang.String PLAYLIST_HEADER = "#EXTM3U";
    private static final java.util.regex.Pattern REGEX_ATTR_BYTERANGE = null;
    private static final java.util.regex.Pattern REGEX_ATTR_DURATION = null;
    private static final java.util.regex.Pattern REGEX_AUDIO = null;
    private static final java.util.regex.Pattern REGEX_AUTOSELECT = null;
    private static final java.util.regex.Pattern REGEX_AVERAGE_BANDWIDTH = null;
    private static final java.util.regex.Pattern REGEX_BANDWIDTH = null;
    private static final java.util.regex.Pattern REGEX_BYTERANGE = null;
    private static final java.util.regex.Pattern REGEX_BYTERANGE_LENGTH = null;
    private static final java.util.regex.Pattern REGEX_BYTERANGE_START = null;
    private static final java.util.regex.Pattern REGEX_CAN_BLOCK_RELOAD = null;
    private static final java.util.regex.Pattern REGEX_CAN_SKIP_DATE_RANGES = null;
    private static final java.util.regex.Pattern REGEX_CAN_SKIP_UNTIL = null;
    private static final java.util.regex.Pattern REGEX_CHANNELS = null;
    private static final java.util.regex.Pattern REGEX_CHARACTERISTICS = null;
    private static final java.util.regex.Pattern REGEX_CLOSED_CAPTIONS = null;
    private static final java.util.regex.Pattern REGEX_CODECS = null;
    private static final java.util.regex.Pattern REGEX_DEFAULT = null;
    private static final java.util.regex.Pattern REGEX_FORCED = null;
    private static final java.util.regex.Pattern REGEX_FRAME_RATE = null;
    private static final java.util.regex.Pattern REGEX_GAP = null;
    private static final java.util.regex.Pattern REGEX_GROUP_ID = null;
    private static final java.util.regex.Pattern REGEX_HOLD_BACK = null;
    private static final java.util.regex.Pattern REGEX_IMPORT = null;
    private static final java.util.regex.Pattern REGEX_INDEPENDENT = null;
    private static final java.util.regex.Pattern REGEX_INSTREAM_ID = null;
    private static final java.util.regex.Pattern REGEX_IV = null;
    private static final java.util.regex.Pattern REGEX_KEYFORMAT = null;
    private static final java.util.regex.Pattern REGEX_KEYFORMATVERSIONS = null;
    private static final java.util.regex.Pattern REGEX_LANGUAGE = null;
    private static final java.util.regex.Pattern REGEX_LAST_MSN = null;
    private static final java.util.regex.Pattern REGEX_LAST_PART = null;
    private static final java.util.regex.Pattern REGEX_MEDIA_DURATION = null;
    private static final java.util.regex.Pattern REGEX_MEDIA_SEQUENCE = null;
    private static final java.util.regex.Pattern REGEX_MEDIA_TITLE = null;
    private static final java.util.regex.Pattern REGEX_METHOD = null;
    private static final java.util.regex.Pattern REGEX_NAME = null;
    private static final java.util.regex.Pattern REGEX_PART_HOLD_BACK = null;
    private static final java.util.regex.Pattern REGEX_PART_TARGET_DURATION = null;
    private static final java.util.regex.Pattern REGEX_PLAYLIST_TYPE = null;
    private static final java.util.regex.Pattern REGEX_PRECISE = null;
    private static final java.util.regex.Pattern REGEX_PRELOAD_HINT_TYPE = null;
    private static final java.util.regex.Pattern REGEX_RESOLUTION = null;
    private static final java.util.regex.Pattern REGEX_SKIPPED_SEGMENTS = null;
    private static final java.util.regex.Pattern REGEX_SUBTITLES = null;
    private static final java.util.regex.Pattern REGEX_TARGET_DURATION = null;
    private static final java.util.regex.Pattern REGEX_TIME_OFFSET = null;
    private static final java.util.regex.Pattern REGEX_TYPE = null;
    private static final java.util.regex.Pattern REGEX_URI = null;
    private static final java.util.regex.Pattern REGEX_VALUE = null;
    private static final java.util.regex.Pattern REGEX_VARIABLE_REFERENCE = null;
    private static final java.util.regex.Pattern REGEX_VERSION = null;
    private static final java.util.regex.Pattern REGEX_VIDEO = null;
    private static final java.lang.String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final java.lang.String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final java.lang.String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final java.lang.String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final java.lang.String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final java.lang.String TAG_GAP = "#EXT-X-GAP";
    private static final java.lang.String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final java.lang.String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final java.lang.String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final java.lang.String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final java.lang.String TAG_KEY = "#EXT-X-KEY";
    private static final java.lang.String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final java.lang.String TAG_MEDIA_DURATION = "#EXTINF";
    private static final java.lang.String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final java.lang.String TAG_PART = "#EXT-X-PART";
    private static final java.lang.String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final java.lang.String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final java.lang.String TAG_PREFIX = "#EXT";
    private static final java.lang.String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final java.lang.String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final java.lang.String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final java.lang.String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final java.lang.String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final java.lang.String TAG_SKIP = "#EXT-X-SKIP";
    private static final java.lang.String TAG_START = "#EXT-X-START";
    private static final java.lang.String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final java.lang.String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final java.lang.String TAG_VERSION = "#EXT-X-VERSION";
    private static final java.lang.String TYPE_AUDIO = "AUDIO";
    private static final java.lang.String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final java.lang.String TYPE_MAP = "MAP";
    private static final java.lang.String TYPE_PART = "PART";
    private static final java.lang.String TYPE_SUBTITLES = "SUBTITLES";
    private static final java.lang.String TYPE_VIDEO = "VIDEO";
    private final com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist previousMediaPlaylist;

    /* JADX INFO: loaded from: classes.dex */
    public static final class DeltaUpdateException extends java.io.IOException {
        public DeltaUpdateException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LineIterator {
        private final java.util.Queue<java.lang.String> extraLines;

        @androidx.annotation.Nullable
        private java.lang.String next;
        private final java.io.BufferedReader reader;

        public LineIterator(java.util.Queue<java.lang.String> r1, java.io.BufferedReader r2) {
                r0 = this;
                r0.<init>()
                r0.extraLines = r1
                r0.reader = r2
                return
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = r2.next
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                java.util.Queue<java.lang.String> r0 = r2.extraLines
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1f
                java.util.Queue<java.lang.String> r0 = r2.extraLines
                java.lang.Object r0 = r0.poll()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                java.lang.String r0 = (java.lang.String) r0
                r2.next = r0
                return r1
            L1f:
                java.io.BufferedReader r0 = r2.reader
                java.lang.String r0 = r0.readLine()
                r2.next = r0
                if (r0 == 0) goto L36
                java.lang.String r0 = r0.trim()
                r2.next = r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1f
                return r1
            L36:
                r0 = 0
                return r0
        }

        public java.lang.String next() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lc
                java.lang.String r0 = r2.next
                r1 = 0
                r2.next = r1
                return r0
            Lc:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            java.lang.String r0 = "AVERAGE-BANDWIDTH=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_AVERAGE_BANDWIDTH = r0
            java.lang.String r0 = "VIDEO=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VIDEO = r0
            java.lang.String r0 = "AUDIO=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_AUDIO = r0
            java.lang.String r0 = "SUBTITLES=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_SUBTITLES = r0
            java.lang.String r0 = "CLOSED-CAPTIONS=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CLOSED_CAPTIONS = r0
            java.lang.String r0 = "[^-]BANDWIDTH=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BANDWIDTH = r0
            java.lang.String r0 = "CHANNELS=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CHANNELS = r0
            java.lang.String r0 = "CODECS=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CODECS = r0
            java.lang.String r0 = "RESOLUTION=(\\d+x\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_RESOLUTION = r0
            java.lang.String r0 = "FRAME-RATE=([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_FRAME_RATE = r0
            java.lang.String r0 = "#EXT-X-TARGETDURATION:(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_TARGET_DURATION = r0
            java.lang.String r0 = "DURATION=([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_ATTR_DURATION = r0
            java.lang.String r0 = "PART-TARGET=([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PART_TARGET_DURATION = r0
            java.lang.String r0 = "#EXT-X-VERSION:(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VERSION = r0
            java.lang.String r0 = "#EXT-X-PLAYLIST-TYPE:(.+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PLAYLIST_TYPE = r0
            java.lang.String r0 = "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CAN_SKIP_UNTIL = r0
            java.lang.String r0 = "CAN-SKIP-DATERANGES"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CAN_SKIP_DATE_RANGES = r0
            java.lang.String r0 = "SKIPPED-SEGMENTS=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_SKIPPED_SEGMENTS = r0
            java.lang.String r0 = "[:|,]HOLD-BACK=([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_HOLD_BACK = r0
            java.lang.String r0 = "PART-HOLD-BACK=([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PART_HOLD_BACK = r0
            java.lang.String r0 = "CAN-BLOCK-RELOAD"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CAN_BLOCK_RELOAD = r0
            java.lang.String r0 = "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_MEDIA_SEQUENCE = r0
            java.lang.String r0 = "#EXTINF:([\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_MEDIA_DURATION = r0
            java.lang.String r0 = "#EXTINF:[\\d\\.]+\\b,(.+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_MEDIA_TITLE = r0
            java.lang.String r0 = "LAST-MSN=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_LAST_MSN = r0
            java.lang.String r0 = "LAST-PART=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_LAST_PART = r0
            java.lang.String r0 = "TIME-OFFSET=(-?[\\d\\.]+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_TIME_OFFSET = r0
            java.lang.String r0 = "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BYTERANGE = r0
            java.lang.String r0 = "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_ATTR_BYTERANGE = r0
            java.lang.String r0 = "BYTERANGE-START=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BYTERANGE_START = r0
            java.lang.String r0 = "BYTERANGE-LENGTH=(\\d+)\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BYTERANGE_LENGTH = r0
            java.lang.String r0 = "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_METHOD = r0
            java.lang.String r0 = "KEYFORMAT=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_KEYFORMAT = r0
            java.lang.String r0 = "KEYFORMATVERSIONS=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_KEYFORMATVERSIONS = r0
            java.lang.String r0 = "URI=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI = r0
            java.lang.String r0 = "IV=([^,.*]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_IV = r0
            java.lang.String r0 = "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_TYPE = r0
            java.lang.String r0 = "TYPE=(PART|MAP)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PRELOAD_HINT_TYPE = r0
            java.lang.String r0 = "LANGUAGE=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_LANGUAGE = r0
            java.lang.String r0 = "NAME=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_NAME = r0
            java.lang.String r0 = "GROUP-ID=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_GROUP_ID = r0
            java.lang.String r0 = "CHARACTERISTICS=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CHARACTERISTICS = r0
            java.lang.String r0 = "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_INSTREAM_ID = r0
            java.lang.String r0 = "AUTOSELECT"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_AUTOSELECT = r0
            java.lang.String r0 = "DEFAULT"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_DEFAULT = r0
            java.lang.String r0 = "FORCED"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_FORCED = r0
            java.lang.String r0 = "INDEPENDENT"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_INDEPENDENT = r0
            java.lang.String r0 = "GAP"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_GAP = r0
            java.lang.String r0 = "PRECISE"
            java.util.regex.Pattern r0 = compileBooleanAttrPattern(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PRECISE = r0
            java.lang.String r0 = "VALUE=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VALUE = r0
            java.lang.String r0 = "IMPORT=\"(.+?)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_IMPORT = r0
            java.lang.String r0 = "\\{\\$([a-zA-Z0-9\\-_]+)\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VARIABLE_REFERENCE = r0
            return
    }

    public HlsPlaylistParser() {
            r2 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r0 = com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.EMPTY
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public HlsPlaylistParser(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2) {
            r0 = this;
            r0.<init>()
            r0.multivariantPlaylist = r1
            r0.previousMediaPlaylist = r2
            return
    }

    private static boolean checkPlaylistHeader(java.io.BufferedReader r5) throws java.io.IOException {
            int r0 = r5.read()
            r1 = 0
            r2 = 239(0xef, float:3.35E-43)
            if (r0 != r2) goto L20
            int r0 = r5.read()
            r2 = 187(0xbb, float:2.62E-43)
            if (r0 != r2) goto L1f
            int r0 = r5.read()
            r2 = 191(0xbf, float:2.68E-43)
            if (r0 == r2) goto L1a
            goto L1f
        L1a:
            int r0 = r5.read()
            goto L20
        L1f:
            return r1
        L20:
            r2 = 1
            int r0 = skipIgnorableWhitespace(r5, r2, r0)
            r2 = 7
            r3 = 0
        L27:
            if (r3 >= r2) goto L39
            java.lang.String r4 = "#EXTM3U"
            char r4 = r4.charAt(r3)
            if (r0 == r4) goto L32
            return r1
        L32:
            int r0 = r5.read()
            int r3 = r3 + 1
            goto L27
        L39:
            int r5 = skipIgnorableWhitespace(r5, r1, r0)
            boolean r5 = com.google.android.exoplayer2.util.Util.isLinebreak(r5)
            return r5
    }

    private static java.util.regex.Pattern compileBooleanAttrPattern(java.lang.String r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "=("
            r0.append(r1)
            java.lang.String r1 = "NO"
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.String r1 = "YES"
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            return r1
    }

    private static com.google.android.exoplayer2.drm.DrmInitData getPlaylistProtectionSchemes(@androidx.annotation.Nullable java.lang.String r4, com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] r5) {
            int r0 = r5.length
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto L13
            r2 = r5[r1]
            r3 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r2 = r2.copyWithData(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            com.google.android.exoplayer2.drm.DrmInitData r5 = new com.google.android.exoplayer2.drm.DrmInitData
            r5.<init>(r4, r0)
            return r5
    }

    @androidx.annotation.Nullable
    private static java.lang.String getSegmentEncryptionIV(long r0, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r3 == 0) goto L7
            return r3
        L7:
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(java.util.ArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant> r3, java.lang.String r4) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r1
            java.lang.String r2 = r1.audioGroupId
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(java.util.ArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant> r3, java.lang.String r4) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r1
            java.lang.String r2 = r1.subtitleGroupId
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(java.util.ArrayList<com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant> r3, java.lang.String r4) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L19
            java.lang.Object r1 = r3.get(r0)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r1 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r1
            java.lang.String r2 = r1.videoGroupId
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r3 = 0
            return r3
    }

    private static double parseDoubleAttr(java.lang.String r1, java.util.regex.Pattern r2) throws com.google.android.exoplayer2.ParserException {
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r1 = parseStringAttr(r1, r2, r0)
            double r1 = java.lang.Double.parseDouble(r1)
            return r1
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.drm.DrmInitData.SchemeData parseDrmSchemeData(java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws com.google.android.exoplayer2.ParserException {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_KEYFORMATVERSIONS
            java.lang.String r1 = "1"
            java.lang.String r0 = parseOptionalStringAttr(r6, r0, r1, r8)
            java.lang.String r2 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r2 = r2.equals(r7)
            r3 = 0
            r4 = 44
            java.lang.String r5 = "video/mp4"
            if (r2 == 0) goto L31
            java.util.regex.Pattern r7 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r6 = parseStringAttr(r6, r7, r8)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r8 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            int r0 = r6.indexOf(r4)
            java.lang.String r6 = r6.substring(r0)
            byte[] r6 = android.util.Base64.decode(r6, r3)
            r7.<init>(r8, r5, r6)
            return r7
        L31:
            java.lang.String r2 = "com.widevine"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L47
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.util.UUID r8 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            byte[] r6 = com.google.android.exoplayer2.util.Util.getUtf8Bytes(r6)
            java.lang.String r0 = "hls"
            r7.<init>(r8, r0, r6)
            return r7
        L47:
            java.lang.String r2 = "com.microsoft.playready"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L73
            boolean r7 = r1.equals(r0)
            if (r7 == 0) goto L73
            java.util.regex.Pattern r7 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r6 = parseStringAttr(r6, r7, r8)
            int r7 = r6.indexOf(r4)
            java.lang.String r6 = r6.substring(r7)
            byte[] r6 = android.util.Base64.decode(r6, r3)
            java.util.UUID r7 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            byte[] r6 = com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.buildPsshAtom(r7, r6)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r8 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            r8.<init>(r7, r5, r6)
            return r8
        L73:
            r6 = 0
            return r6
    }

    private static java.lang.String parseEncryptionScheme(java.lang.String r1) {
            java.lang.String r0 = "SAMPLE-AES-CENC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = "SAMPLE-AES-CTR"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L14
        L11:
            java.lang.String r1 = "cbcs"
            goto L16
        L14:
            java.lang.String r1 = "cenc"
        L16:
            return r1
    }

    private static int parseIntAttr(java.lang.String r1, java.util.regex.Pattern r2) throws com.google.android.exoplayer2.ParserException {
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r1 = parseStringAttr(r1, r2, r0)
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    private static long parseLongAttr(java.lang.String r1, java.util.regex.Pattern r2) throws com.google.android.exoplayer2.ParserException {
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r1 = parseStringAttr(r1, r2, r0)
            long r1 = java.lang.Long.parseLong(r1)
            return r1
    }

    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r93, @androidx.annotation.Nullable com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r94, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r95, java.lang.String r96) throws java.io.IOException {
            r0 = r93
            r1 = r94
            boolean r2 = r0.hasIndependentSegments
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r7 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 0
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r16 = r7
            r16.<init>(r17, r19, r20, r22, r24)
            java.util.TreeMap r9 = new java.util.TreeMap
            r9.<init>()
            java.lang.String r10 = ""
            r18 = 0
            r13 = 0
            r35 = r2
            r56 = r7
            r41 = r10
            r24 = r18
            r28 = r24
            r38 = r28
            r50 = r38
            r81 = r50
            r83 = r81
            r87 = r83
            r89 = r87
            r2 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = 0
            r26 = 0
            r27 = 0
            r30 = 1
            r31 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r36 = 0
            r37 = 0
            r40 = 0
            r54 = 0
            r75 = 0
            r76 = -1
            r78 = 0
            r79 = 0
            r80 = 0
            r85 = 0
            r86 = 0
            r7 = r5
            r5 = 0
        L8e:
            boolean r42 = r95.hasNext()
            if (r42 == 0) goto L6ac
            java.lang.String r12 = r95.next()
            java.lang.String r11 = "#EXT"
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto La3
            r8.add(r12)
        La3:
            java.lang.String r11 = "#EXT-X-PLAYLIST-TYPE"
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto Lc5
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PLAYLIST_TYPE
            java.lang.String r11 = parseStringAttr(r12, r11, r3)
            java.lang.String r12 = "VOD"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto Lbb
            r2 = 1
            goto L8e
        Lbb:
            java.lang.String r12 = "EVENT"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L8e
            r2 = 2
            goto L8e
        Lc5:
            java.lang.String r11 = "#EXT-X-I-FRAMES-ONLY"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto Ld0
            r85 = 1
            goto L8e
        Ld0:
            java.lang.String r11 = "#EXT-X-START"
            boolean r11 = r12.startsWith(r11)
            r43 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r11 == 0) goto Lf3
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_TIME_OFFSET
            double r21 = parseDoubleAttr(r12, r11)
            r91 = r15
            double r14 = r21 * r43
            long r14 = (long) r14
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PRECISE
            boolean r23 = parseOptionalBooleanAttribute(r12, r11, r13)
            r21 = r14
        Lf0:
            r15 = r91
            goto L8e
        Lf3:
            r91 = r15
            java.lang.String r11 = "#EXT-X-SERVER-CONTROL"
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L102
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r56 = parseServerControl(r12)
            goto Lf0
        L102:
            java.lang.String r11 = "#EXT-X-PART-INF"
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L116
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PART_TARGET_DURATION
            double r11 = parseDoubleAttr(r12, r11)
            double r11 = r11 * r43
            long r11 = (long) r11
            r33 = r11
            goto Lf0
        L116:
            java.lang.String r11 = "#EXT-X-MAP"
            boolean r11 = r12.startsWith(r11)
            java.lang.String r14 = "@"
            if (r11 == 0) goto L17a
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r43 = parseStringAttr(r12, r11, r3)
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_ATTR_BYTERANGE
            java.lang.String r11 = parseOptionalStringAttr(r12, r11, r3)
            if (r11 == 0) goto L142
            java.lang.String[] r11 = com.google.android.exoplayer2.util.Util.split(r11, r14)
            r12 = r11[r13]
            long r76 = java.lang.Long.parseLong(r12)
            int r12 = r11.length
            r14 = 1
            if (r12 <= r14) goto L142
            r12 = r11[r14]
            long r38 = java.lang.Long.parseLong(r12)
        L142:
            r14 = -1
            int r12 = (r76 > r14 ? 1 : (r76 == r14 ? 0 : -1))
            if (r12 != 0) goto L14a
            r38 = r18
        L14a:
            r15 = r75
            r14 = r78
            if (r15 == 0) goto L15b
            if (r14 == 0) goto L153
            goto L15b
        L153:
            java.lang.String r0 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r1)
            throw r0
        L15b:
            r20 = 0
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r86 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            r42 = r86
            r44 = r38
            r46 = r76
            r48 = r15
            r49 = r14
            r42.<init>(r43, r44, r46, r48, r49)
            if (r12 == 0) goto L170
            long r38 = r38 + r76
        L170:
            r78 = r14
            r75 = r15
            r15 = r91
            r76 = -1
            goto L8e
        L17a:
            r15 = r75
            r11 = r78
            r20 = 0
            java.lang.String r13 = "#EXT-X-TARGETDURATION"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L19d
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_TARGET_DURATION
            int r12 = parseIntAttr(r12, r13)
            long r12 = (long) r12
            r31 = 1000000(0xf4240, double:4.940656E-318)
            long r31 = r31 * r12
        L194:
            r78 = r11
        L196:
            r75 = r15
        L198:
            r15 = r91
        L19a:
            r13 = 0
            goto L8e
        L19d:
            java.lang.String r13 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L1b2
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_MEDIA_SEQUENCE
            long r83 = parseLongAttr(r12, r13)
            r78 = r11
            r75 = r15
            r28 = r83
            goto L198
        L1b2:
            java.lang.String r13 = "#EXT-X-VERSION"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L1c1
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VERSION
            int r30 = parseIntAttr(r12, r13)
            goto L194
        L1c1:
            java.lang.String r13 = "#EXT-X-DEFINE"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L202
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_IMPORT
            java.lang.String r13 = parseOptionalStringAttr(r12, r13, r3)
            if (r13 == 0) goto L1df
            java.util.Map<java.lang.String, java.lang.String> r12 = r0.variableDefinitions
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L1ee
            r3.put(r13, r12)
            goto L1ee
        L1df:
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_NAME
            java.lang.String r13 = parseStringAttr(r12, r13, r3)
            java.util.regex.Pattern r14 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VALUE
            java.lang.String r12 = parseStringAttr(r12, r14, r3)
            r3.put(r13, r12)
        L1ee:
            r78 = r2
            r59 = r3
            r2 = r6
            r92 = r10
            r10 = r79
            r0 = r83
            r3 = 0
            r83 = r5
            r79 = r8
            r8 = r91
            goto L691
        L202:
            java.lang.String r13 = "#EXTINF"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L218
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_MEDIA_DURATION
            long r87 = parseTimeSecondsToUs(r12, r13)
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_MEDIA_TITLE
            java.lang.String r41 = parseOptionalStringAttr(r12, r13, r10, r3)
            goto L194
        L218:
            java.lang.String r13 = "#EXT-X-SKIP"
            boolean r13 = r12.startsWith(r13)
            r46 = 1
            if (r13 == 0) goto L2cc
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_SKIPPED_SEGMENTS
            int r12 = parseIntAttr(r12, r13)
            if (r1 == 0) goto L232
            boolean r13 = r91.isEmpty()
            if (r13 == 0) goto L232
            r13 = 1
            goto L233
        L232:
            r13 = 0
        L233:
            com.google.android.exoplayer2.util.Assertions.checkState(r13)
            java.lang.Object r13 = com.google.android.exoplayer2.util.Util.castNonNull(r94)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r13 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist) r13
            long r13 = r13.mediaSequence
            long r13 = r28 - r13
            int r14 = (int) r13
            int r12 = r12 + r14
            if (r14 < 0) goto L2c6
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r13 = r1.segments
            int r13 = r13.size()
            if (r12 > r13) goto L2c6
            r13 = r10
            r78 = r11
            r10 = r81
        L251:
            if (r14 >= r12) goto L2bd
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment> r15 = r1.segments
            java.lang.Object r15 = r15.get(r14)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r15 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r15
            r42 = r12
            r92 = r13
            long r12 = r1.mediaSequence
            int r40 = (r28 > r12 ? 1 : (r28 == r12 ? 0 : -1))
            if (r40 == 0) goto L270
            int r12 = r1.discontinuitySequence
            int r12 = r12 - r27
            int r13 = r15.relativeDiscontinuitySequence
            int r12 = r12 + r13
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r15 = r15.copyWith(r10, r12)
        L270:
            r13 = r91
            r13.add(r15)
            long r0 = r15.durationUs
            long r10 = r10 + r0
            long r0 = r15.byteRangeLength
            r43 = -1
            int r12 = (r0 > r43 ? 1 : (r0 == r43 ? 0 : -1))
            r43 = r10
            if (r12 == 0) goto L287
            long r10 = r15.byteRangeOffset
            long r10 = r10 + r0
            r38 = r10
        L287:
            int r0 = r15.relativeDiscontinuitySequence
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r1 = r15.initializationSegment
            com.google.android.exoplayer2.drm.DrmInitData r10 = r15.drmInitData
            java.lang.String r11 = r15.fullSegmentEncryptionKeyUri
            java.lang.String r12 = r15.encryptionIV
            r40 = r0
            if (r12 == 0) goto L29f
            java.lang.String r0 = java.lang.Long.toHexString(r83)
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L2a3
        L29f:
            java.lang.String r0 = r15.encryptionIV
            r78 = r0
        L2a3:
            long r83 = r83 + r46
            int r14 = r14 + 1
            r0 = r93
            r86 = r1
            r15 = r11
            r91 = r13
            r80 = r40
            r12 = r42
            r50 = r43
            r13 = r92
            r1 = r94
            r40 = r10
            r10 = r50
            goto L251
        L2bd:
            r0 = r93
            r1 = r94
            r81 = r10
            r10 = r13
            goto L196
        L2c6:
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException
            r0.<init>()
            throw r0
        L2cc:
            r92 = r10
            r13 = r91
            java.lang.String r0 = "#EXT-X-KEY"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L342
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_METHOD
            java.lang.String r0 = parseStringAttr(r12, r0, r3)
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_KEYFORMAT
            java.lang.String r10 = "identity"
            java.lang.String r1 = parseOptionalStringAttr(r12, r1, r10, r3)
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L2f8
            r9.clear()
            r0 = r20
            r40 = r0
            r78 = r40
            goto L336
        L2f8:
            java.util.regex.Pattern r11 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_IV
            java.lang.String r11 = parseOptionalStringAttr(r12, r11, r3)
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L31a
            java.lang.String r1 = "AES-128"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L315
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r0 = parseStringAttr(r12, r0, r3)
            r78 = r11
            goto L336
        L315:
            r78 = r11
            r0 = r20
            goto L336
        L31a:
            r10 = r79
            if (r10 != 0) goto L325
            java.lang.String r0 = parseEncryptionScheme(r0)
            r79 = r0
            goto L327
        L325:
            r79 = r10
        L327:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = parseDrmSchemeData(r12, r1, r3)
            if (r0 == 0) goto L315
            r9.put(r1, r0)
            r78 = r11
            r0 = r20
            r40 = r0
        L336:
            r1 = r94
            r75 = r0
            r15 = r13
            r10 = r92
            r13 = 0
            r0 = r93
            goto L8e
        L342:
            r10 = r79
            java.lang.String r0 = "#EXT-X-BYTERANGE"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L374
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BYTERANGE
            java.lang.String r0 = parseStringAttr(r12, r0, r3)
            java.lang.String[] r0 = com.google.android.exoplayer2.util.Util.split(r0, r14)
            r1 = 0
            r12 = r0[r1]
            long r76 = java.lang.Long.parseLong(r12)
            int r1 = r0.length
            r12 = 1
            if (r1 <= r12) goto L367
            r0 = r0[r12]
            long r38 = java.lang.Long.parseLong(r0)
        L367:
            r0 = r93
            r1 = r94
            r79 = r10
            r78 = r11
            r75 = r15
            r10 = r92
            goto L39b
        L374:
            r0 = 1
            java.lang.String r1 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r1 = r12.startsWith(r1)
            r0 = 58
            if (r1 == 0) goto L39e
            int r0 = r12.indexOf(r0)
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r0 = r12.substring(r0)
            int r27 = java.lang.Integer.parseInt(r0)
            r0 = r93
            r1 = r94
            r79 = r10
            r78 = r11
            r75 = r15
            r10 = r92
            r26 = 1
        L39b:
            r15 = r13
            goto L19a
        L39e:
            java.lang.String r1 = "#EXT-X-DISCONTINUITY"
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L3a9
            int r80 = r80 + 1
            goto L367
        L3a9:
            java.lang.String r1 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r1 = r12.startsWith(r1)
            if (r1 == 0) goto L3d9
            int r1 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r1 != 0) goto L3ca
            int r0 = r12.indexOf(r0)
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r0 = r12.substring(r0)
            long r24 = com.google.android.exoplayer2.util.Util.parseXsDateTime(r0)
            long r24 = com.google.android.exoplayer2.util.Util.msToUs(r24)
            long r24 = r24 - r81
            goto L367
        L3ca:
            r78 = r2
            r59 = r3
            r2 = r6
            r79 = r8
            r8 = r13
            r0 = r83
        L3d4:
            r3 = 0
            r83 = r5
            goto L691
        L3d9:
            java.lang.String r0 = "#EXT-X-GAP"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L3f0
            r0 = r93
            r1 = r94
            r79 = r10
            r78 = r11
            r75 = r15
            r10 = r92
            r54 = 1
            goto L39b
        L3f0:
            java.lang.String r0 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L407
            r0 = r93
            r1 = r94
            r79 = r10
            r78 = r11
            r75 = r15
            r10 = r92
            r35 = 1
            goto L39b
        L407:
            java.lang.String r0 = "#EXT-X-ENDLIST"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L41f
            r0 = r93
            r1 = r94
            r79 = r10
            r78 = r11
            r75 = r15
            r10 = r92
            r36 = 1
            goto L39b
        L41f:
            java.lang.String r0 = "#EXT-X-RENDITION-REPORT"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L45d
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_LAST_MSN
            r78 = r2
            r91 = r13
            r1 = -1
            long r13 = parseOptionalLongAttr(r12, r0, r1)
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_LAST_PART
            r1 = -1
            int r0 = parseOptionalIntAttr(r12, r0, r1)
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r1 = parseStringAttr(r12, r1, r3)
            r2 = r96
            java.lang.String r1 = com.google.android.exoplayer2.util.UriUtil.resolve(r2, r1)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport r12 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport
            r12.<init>(r1, r13, r0)
            r6.add(r12)
        L452:
            r59 = r3
            r2 = r6
            r79 = r8
            r0 = r83
            r8 = r91
            goto L3d4
        L45d:
            r78 = r2
            r91 = r13
            r2 = r96
            java.lang.String r0 = "#EXT-X-PRELOAD-HINT"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L4fd
            if (r5 == 0) goto L46e
        L46d:
            goto L452
        L46e:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PRELOAD_HINT_TYPE
            java.lang.String r0 = parseStringAttr(r12, r0, r3)
            java.lang.String r1 = "PART"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47d
            goto L46d
        L47d:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r58 = parseStringAttr(r12, r0, r3)
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BYTERANGE_START
            r13 = -1
            long r0 = parseOptionalLongAttr(r12, r0, r13)
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BYTERANGE_LENGTH
            long r70 = parseOptionalLongAttr(r12, r2, r13)
            r12 = r83
            java.lang.String r67 = getSegmentEncryptionIV(r12, r15, r11)
            if (r40 != 0) goto L4bc
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L4bc
            java.util.Collection r2 = r9.values()
            r42 = r12
            r14 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r12 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r14]
            java.lang.Object[] r2 = r2.toArray(r12)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r2 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r2
            com.google.android.exoplayer2.drm.DrmInitData r12 = new com.google.android.exoplayer2.drm.DrmInitData
            r12.<init>(r10, r2)
            if (r37 != 0) goto L4b9
            com.google.android.exoplayer2.drm.DrmInitData r37 = getPlaylistProtectionSchemes(r10, r2)
        L4b9:
            r40 = r12
            goto L4be
        L4bc:
            r42 = r12
        L4be:
            r12 = -1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L4c8
            int r14 = (r70 > r12 ? 1 : (r70 == r12 ? 0 : -1))
            if (r14 == 0) goto L4e8
        L4c8:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r5 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part
            r60 = 0
            if (r2 == 0) goto L4d1
            r68 = r0
            goto L4d3
        L4d1:
            r68 = r18
        L4d3:
            r72 = 0
            r73 = 0
            r74 = 1
            r57 = r5
            r59 = r86
            r62 = r80
            r63 = r50
            r65 = r40
            r66 = r15
            r57.<init>(r58, r59, r60, r62, r63, r65, r66, r67, r68, r70, r72, r73, r74)
        L4e8:
            r0 = r93
            r1 = r94
            r79 = r10
            r75 = r15
            r83 = r42
            r2 = r78
            r15 = r91
            r10 = r92
            r13 = 0
            r78 = r11
            goto L8e
        L4fd:
            r0 = r83
            java.lang.String r2 = "#EXT-X-PART"
            boolean r2 = r12.startsWith(r2)
            if (r2 == 0) goto L5c3
            java.lang.String r67 = getSegmentEncryptionIV(r0, r15, r11)
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r58 = parseStringAttr(r12, r2, r3)
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_ATTR_DURATION
            double r46 = parseDoubleAttr(r12, r2)
            r13 = r5
            r2 = r6
            double r5 = r46 * r43
            long r5 = (long) r5
            r79 = r8
            java.util.regex.Pattern r8 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_INDEPENDENT
            r83 = r13
            r13 = 0
            boolean r8 = parseOptionalBooleanAttribute(r12, r8, r13)
            if (r35 == 0) goto L532
            boolean r42 = r7.isEmpty()
            if (r42 == 0) goto L532
            r42 = 1
            goto L534
        L532:
            r42 = 0
        L534:
            r73 = r8 | r42
            java.util.regex.Pattern r8 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_GAP
            boolean r72 = parseOptionalBooleanAttribute(r12, r8, r13)
            java.util.regex.Pattern r8 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_ATTR_BYTERANGE
            java.lang.String r8 = parseOptionalStringAttr(r12, r8, r3)
            if (r8 == 0) goto L55b
            java.lang.String[] r8 = com.google.android.exoplayer2.util.Util.split(r8, r14)
            r12 = r8[r13]
            long r12 = java.lang.Long.parseLong(r12)
            int r14 = r8.length
            r42 = r12
            r12 = 1
            if (r14 <= r12) goto L55d
            r8 = r8[r12]
            long r89 = java.lang.Long.parseLong(r8)
            goto L55d
        L55b:
            r42 = -1
        L55d:
            r44 = -1
            int r8 = (r42 > r44 ? 1 : (r42 == r44 ? 0 : -1))
            if (r8 != 0) goto L565
            r89 = r18
        L565:
            if (r40 != 0) goto L587
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L587
            java.util.Collection r12 = r9.values()
            r14 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r13 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r14]
            java.lang.Object[] r12 = r12.toArray(r13)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r12 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r12
            com.google.android.exoplayer2.drm.DrmInitData r13 = new com.google.android.exoplayer2.drm.DrmInitData
            r13.<init>(r10, r12)
            if (r37 != 0) goto L585
            com.google.android.exoplayer2.drm.DrmInitData r37 = getPlaylistProtectionSchemes(r10, r12)
        L585:
            r40 = r13
        L587:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part r12 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part
            r57 = r12
            r74 = 0
            r59 = r86
            r60 = r5
            r62 = r80
            r63 = r50
            r65 = r40
            r66 = r15
            r68 = r89
            r70 = r42
            r57.<init>(r58, r59, r60, r62, r63, r65, r66, r67, r68, r70, r72, r73, r74)
            r7.add(r12)
            long r50 = r50 + r5
            if (r8 == 0) goto L5a9
            long r89 = r89 + r42
        L5a9:
            r6 = r2
            r75 = r15
            r2 = r78
            r8 = r79
            r5 = r83
            r15 = r91
            r13 = 0
            r83 = r0
            r79 = r10
            r78 = r11
            r10 = r92
            r0 = r93
            r1 = r94
            goto L8e
        L5c3:
            r83 = r5
            r2 = r6
            r79 = r8
            java.lang.String r5 = "#"
            boolean r5 = r12.startsWith(r5)
            if (r5 != 0) goto L68c
            java.lang.String r5 = getSegmentEncryptionIV(r0, r15, r11)
            long r0 = r0 + r46
            java.lang.String r6 = replaceVariableReferences(r12, r3)
            java.lang.Object r8 = r4.get(r6)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r8 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r8
            r12 = -1
            int r14 = (r76 > r12 ? 1 : (r76 == r12 ? 0 : -1))
            if (r14 != 0) goto L5e9
            r12 = r18
            goto L605
        L5e9:
            if (r85 == 0) goto L603
            if (r86 != 0) goto L603
            if (r8 != 0) goto L603
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r8 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            r44 = 0
            r48 = 0
            r49 = 0
            r42 = r8
            r43 = r6
            r46 = r38
            r42.<init>(r43, r44, r46, r48, r49)
            r4.put(r6, r8)
        L603:
            r12 = r38
        L605:
            if (r40 != 0) goto L62a
            boolean r38 = r9.isEmpty()
            if (r38 != 0) goto L62a
            r57 = r0
            java.util.Collection r0 = r9.values()
            r59 = r3
            r1 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r1]
            java.lang.Object[] r0 = r0.toArray(r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r0
            com.google.android.exoplayer2.drm.DrmInitData r3 = new com.google.android.exoplayer2.drm.DrmInitData
            r3.<init>(r10, r0)
            if (r37 != 0) goto L631
            com.google.android.exoplayer2.drm.DrmInitData r37 = getPlaylistProtectionSchemes(r10, r0)
            goto L631
        L62a:
            r57 = r0
            r59 = r3
            r1 = 0
            r3 = r40
        L631:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment
            if (r86 == 0) goto L638
            r40 = r86
            goto L63a
        L638:
            r40 = r8
        L63a:
            r38 = r0
            r39 = r6
            r42 = r87
            r44 = r80
            r45 = r81
            r47 = r3
            r48 = r15
            r49 = r5
            r50 = r12
            r52 = r76
            r55 = r7
            r38.<init>(r39, r40, r41, r42, r44, r45, r47, r48, r49, r50, r52, r54, r55)
            r8 = r91
            r8.add(r0)
            long r50 = r81 + r87
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r14 == 0) goto L663
            long r12 = r12 + r76
        L663:
            r38 = r12
            r0 = r93
            r1 = r94
            r6 = r2
            r40 = r3
            r75 = r15
            r87 = r18
            r81 = r50
            r3 = r59
            r2 = r78
            r5 = r83
            r41 = r92
            r13 = 0
            r54 = 0
            r76 = -1
            r15 = r8
            r78 = r11
            r83 = r57
            r8 = r79
            r79 = r10
            r10 = r41
            goto L8e
        L68c:
            r59 = r3
            r8 = r91
            r3 = 0
        L691:
            r6 = r2
            r75 = r15
            r3 = r59
            r2 = r78
            r5 = r83
            r13 = 0
            r83 = r0
            r15 = r8
            r78 = r11
            r8 = r79
            r0 = r93
            r1 = r94
            r79 = r10
            r10 = r92
            goto L8e
        L6ac:
            r78 = r2
            r83 = r5
            r2 = r6
            r79 = r8
            r8 = r15
            r3 = 0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        L6bb:
            int r4 = r2.size()
            if (r1 >= r4) goto L710
            java.lang.Object r4 = r2.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport r4 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.RenditionReport) r4
            long r5 = r4.lastMediaSequence
            r9 = -1
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L6dc
            int r5 = r8.size()
            long r5 = (long) r5
            long r5 = r28 + r5
            boolean r11 = r7.isEmpty()
            long r11 = (long) r11
            long r5 = r5 - r11
        L6dc:
            int r11 = r4.lastPartIndex
            r12 = -1
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 != r12) goto L701
            int r15 = (r33 > r13 ? 1 : (r33 == r13 ? 0 : -1))
            if (r15 == 0) goto L701
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L6f9
            java.lang.Object r11 = com.google.common.collect.Iterables.getLast(r8)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment r11 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment) r11
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Part> r11 = r11.parts
            goto L6fa
        L6f9:
            r11 = r7
        L6fa:
            int r11 = r11.size()
            r15 = 1
            int r11 = r11 - r15
            goto L702
        L701:
            r15 = 1
        L702:
            android.net.Uri r4 = r4.playlistUri
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport r3 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$RenditionReport
            r3.<init>(r4, r5, r11)
            r0.put(r4, r3)
            int r1 = r1 + 1
            r3 = 0
            goto L6bb
        L710:
            r15 = 1
            if (r83 == 0) goto L718
            r5 = r83
            r7.add(r5)
        L718:
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist
            int r2 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r2 == 0) goto L721
            r75 = 1
            goto L723
        L721:
            r75 = 0
        L723:
            r5 = r1
            r6 = r78
            r2 = r7
            r7 = r96
            r3 = r8
            r8 = r79
            r9 = r21
            r11 = r23
            r12 = r24
            r14 = r26
            r15 = r27
            r16 = r28
            r18 = r30
            r19 = r31
            r21 = r33
            r23 = r35
            r24 = r36
            r25 = r75
            r26 = r37
            r27 = r3
            r28 = r2
            r29 = r56
            r30 = r0
            r5.<init>(r6, r7, r8, r9, r11, r12, r14, r15, r16, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30)
            return r1
    }

    private static com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist parseMultivariantPlaylist(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.LineIterator r36, java.lang.String r37) throws java.io.IOException {
            r1 = r37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
            r13 = 0
        L36:
            boolean r14 = r36.hasNext()
            java.lang.String r15 = "application/x-mpegURL"
            if (r14 == 0) goto L220
            java.lang.String r14 = r36.next()
            java.lang.String r9 = "#EXT"
            boolean r9 = r14.startsWith(r9)
            if (r9 == 0) goto L4d
            r8.add(r14)
        L4d:
            java.lang.String r9 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r9 = r14.startsWith(r9)
            r19 = r10
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L6d
            java.util.regex.Pattern r9 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_NAME
            java.lang.String r9 = parseStringAttr(r14, r9, r11)
            java.util.regex.Pattern r10 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VALUE
            java.lang.String r10 = parseStringAttr(r14, r10, r11)
            r11.put(r9, r10)
            goto Lce
        L6d:
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L87
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = 1
            goto L205
        L87:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto L93
            r3.add(r14)
            goto Lce
        L93:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)
            if (r10 == 0) goto Lc3
            java.util.regex.Pattern r9 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_KEYFORMAT
            java.lang.String r10 = "identity"
            java.lang.String r9 = parseOptionalStringAttr(r14, r9, r10, r11)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r9 = parseDrmSchemeData(r14, r9, r11)
            if (r9 == 0) goto Lce
            java.util.regex.Pattern r10 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_METHOD
            java.lang.String r10 = parseStringAttr(r14, r10, r11)
            java.lang.String r10 = parseEncryptionScheme(r10)
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            r15 = 1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r15 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r15]
            r16 = 0
            r15[r16] = r9
            r14.<init>(r10, r15)
            r12.add(r14)
            goto Lce
        Lc3:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r14.startsWith(r10)
            if (r10 != 0) goto Le1
            if (r9 == 0) goto Lce
            goto Le1
        Lce:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r28 = r12
            r10 = r19
            goto L205
        Le1:
            java.lang.String r10 = "CLOSED-CAPTIONS=NONE"
            boolean r10 = r14.contains(r10)
            r13 = r13 | r10
            if (r9 == 0) goto Lef
            r10 = 16384(0x4000, float:2.2959E-41)
            r20 = r13
            goto Lf2
        Lef:
            r20 = r13
            r10 = 0
        Lf2:
            java.util.regex.Pattern r13 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_BANDWIDTH
            int r13 = parseIntAttr(r14, r13)
            r28 = r12
            java.util.regex.Pattern r12 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_AVERAGE_BANDWIDTH
            r29 = r7
            r7 = -1
            int r12 = parseOptionalIntAttr(r14, r12, r7)
            java.util.regex.Pattern r7 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CODECS
            java.lang.String r7 = parseOptionalStringAttr(r14, r7, r11)
            r30 = r8
            java.util.regex.Pattern r8 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_RESOLUTION
            java.lang.String r8 = parseOptionalStringAttr(r14, r8, r11)
            if (r8 == 0) goto L13a
            r31 = r6
            java.lang.String r6 = "x"
            java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r8, r6)
            r8 = 0
            r21 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r21)
            r18 = 1
            r6 = r6[r18]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r8 <= 0) goto L133
            if (r6 > 0) goto L130
            goto L133
        L130:
            r17 = r8
            goto L136
        L133:
            r6 = -1
            r17 = -1
        L136:
            r8 = r6
            r6 = r17
            goto L13e
        L13a:
            r31 = r6
            r6 = -1
            r8 = -1
        L13e:
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = r5
            java.util.regex.Pattern r5 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_FRAME_RATE
            java.lang.String r5 = parseOptionalStringAttr(r14, r5, r11)
            if (r5 == 0) goto L153
            float r17 = java.lang.Float.parseFloat(r5)
            r33 = r4
            r5 = r17
            goto L157
        L153:
            r33 = r4
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L157:
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VIDEO
            java.lang.String r4 = parseOptionalStringAttr(r14, r4, r11)
            r34 = r3
            java.util.regex.Pattern r3 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_AUDIO
            java.lang.String r3 = parseOptionalStringAttr(r14, r3, r11)
            r35 = r0
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_SUBTITLES
            java.lang.String r0 = parseOptionalStringAttr(r14, r0, r11)
            r17 = r0
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CLOSED_CAPTIONS
            java.lang.String r0 = parseOptionalStringAttr(r14, r0, r11)
            if (r9 == 0) goto L182
            java.util.regex.Pattern r9 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r9 = parseStringAttr(r14, r9, r11)
            android.net.Uri r9 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r1, r9)
            goto L194
        L182:
            boolean r9 = r36.hasNext()
            if (r9 == 0) goto L218
            java.lang.String r9 = r36.next()
            java.lang.String r9 = replaceVariableReferences(r9, r11)
            android.net.Uri r9 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r1, r9)
        L194:
            com.google.android.exoplayer2.Format$Builder r14 = new com.google.android.exoplayer2.Format$Builder
            r14.<init>()
            int r1 = r2.size()
            com.google.android.exoplayer2.Format$Builder r1 = r14.setId(r1)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setContainerMimeType(r15)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setCodecs(r7)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setAverageBitrate(r12)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setPeakBitrate(r13)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setWidth(r6)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setHeight(r8)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setFrameRate(r5)
            com.google.android.exoplayer2.Format$Builder r1 = r1.setRoleFlags(r10)
            com.google.android.exoplayer2.Format r23 = r1.build()
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant
            r21 = r1
            r22 = r9
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            r1 = r35
            java.lang.Object r5 = r1.get(r9)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L1eb
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r9, r5)
        L1eb:
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo r6 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo
            r21 = r6
            r22 = r12
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r17
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r6)
            r10 = r19
            r13 = r20
        L205:
            r0 = r1
            r12 = r28
            r7 = r29
            r8 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r1 = r37
            goto L36
        L218:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r1)
            throw r0
        L220:
            r1 = r0
            r34 = r3
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r30 = r8
            r19 = r10
            r28 = r12
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4 = 0
        L23c:
            int r5 = r2.size()
            if (r4 >= r5) goto L295
            java.lang.Object r5 = r2.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r5 = (com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist.Variant) r5
            android.net.Uri r6 = r5.url
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L291
            com.google.android.exoplayer2.Format r6 = r5.format
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.metadata
            if (r6 != 0) goto L258
            r6 = 1
            goto L259
        L258:
            r6 = 0
        L259:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r6 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            android.net.Uri r7 = r5.url
            java.lang.Object r7 = r1.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r6.<init>(r8, r8, r7)
            com.google.android.exoplayer2.metadata.Metadata r7 = new com.google.android.exoplayer2.metadata.Metadata
            r9 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r10 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r9]
            r9 = 0
            r10[r9] = r6
            r7.<init>(r10)
            com.google.android.exoplayer2.Format r6 = r5.format
            com.google.android.exoplayer2.Format$Builder r6 = r6.buildUpon()
            com.google.android.exoplayer2.Format$Builder r6 = r6.setMetadata(r7)
            com.google.android.exoplayer2.Format r6 = r6.build()
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r5 = r5.copyWithFormat(r6)
            r3.add(r5)
            goto L292
        L291:
            r8 = 0
        L292:
            int r4 = r4 + 1
            goto L23c
        L295:
            r8 = 0
            r1 = r8
            r9 = r1
            r0 = 0
        L299:
            int r4 = r34.size()
            if (r0 >= r4) goto L4b9
            r4 = r34
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r6 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_GROUP_ID
            java.lang.String r6 = parseStringAttr(r5, r6, r11)
            java.util.regex.Pattern r7 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_NAME
            java.lang.String r7 = parseStringAttr(r5, r7, r11)
            com.google.android.exoplayer2.Format$Builder r10 = new com.google.android.exoplayer2.Format$Builder
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r14 = ":"
            r12.append(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.google.android.exoplayer2.Format$Builder r10 = r10.setId(r12)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setLabel(r7)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setContainerMimeType(r15)
            int r12 = parseSelectionFlags(r5)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setSelectionFlags(r12)
            int r12 = parseRoleFlags(r5, r11)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setRoleFlags(r12)
            java.util.regex.Pattern r12 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_LANGUAGE
            java.lang.String r12 = parseOptionalStringAttr(r5, r12, r11)
            com.google.android.exoplayer2.Format$Builder r10 = r10.setLanguage(r12)
            java.util.regex.Pattern r12 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_URI
            java.lang.String r12 = parseOptionalStringAttr(r5, r12, r11)
            r14 = r37
            if (r12 != 0) goto L2fe
            r12 = r8
            goto L302
        L2fe:
            android.net.Uri r12 = com.google.android.exoplayer2.util.UriUtil.resolveToUri(r14, r12)
        L302:
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            r34 = r4
            r4 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r14 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r4 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            r20 = r15
            java.util.List r15 = java.util.Collections.emptyList()
            r4.<init>(r6, r7, r15)
            r15 = 0
            r14[r15] = r4
            r8.<init>(r14)
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_TYPE
            java.lang.String r4 = parseStringAttr(r5, r4, r11)
            java.util.Objects.requireNonNull(r4)
            int r14 = r4.hashCode()
            r15 = 2
            switch(r14) {
                case -959297733: goto L34e;
                case -333210994: goto L343;
                case 62628790: goto L338;
                case 81665115: goto L32d;
                default: goto L32b;
            }
        L32b:
            r4 = -1
            goto L358
        L32d:
            java.lang.String r14 = "VIDEO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L336
            goto L32b
        L336:
            r4 = 3
            goto L358
        L338:
            java.lang.String r14 = "AUDIO"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L341
            goto L32b
        L341:
            r4 = 2
            goto L358
        L343:
            java.lang.String r14 = "CLOSED-CAPTIONS"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L34c
            goto L32b
        L34c:
            r4 = 1
            goto L358
        L34e:
            java.lang.String r14 = "SUBTITLES"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L357
            goto L32b
        L357:
            r4 = 0
        L358:
            switch(r4) {
                case 0: goto L464;
                case 1: goto L420;
                case 2: goto L3ad;
                case 3: goto L367;
                default: goto L35b;
            }
        L35b:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
        L363:
            r16 = 0
            goto L4aa
        L367:
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r4 = getVariantWithVideoGroup(r2, r6)
            if (r4 == 0) goto L392
            com.google.android.exoplayer2.Format r4 = r4.format
            java.lang.String r5 = r4.codecs
            java.lang.String r5 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r5, r15)
            com.google.android.exoplayer2.Format$Builder r14 = r10.setCodecs(r5)
            java.lang.String r5 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r5)
            com.google.android.exoplayer2.Format$Builder r5 = r14.setSampleMimeType(r5)
            int r14 = r4.width
            com.google.android.exoplayer2.Format$Builder r5 = r5.setWidth(r14)
            int r14 = r4.height
            com.google.android.exoplayer2.Format$Builder r5 = r5.setHeight(r14)
            float r4 = r4.frameRate
            r5.setFrameRate(r4)
        L392:
            if (r12 != 0) goto L395
            goto L35b
        L395:
            r10.setMetadata(r8)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition
            com.google.android.exoplayer2.Format r5 = r10.build()
            r4.<init>(r12, r5, r6, r7)
            r14 = r33
            r14.add(r4)
            r21 = r9
            r6 = r31
            r9 = r32
            goto L363
        L3ad:
            r14 = r33
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r4 = getVariantWithAudioGroup(r2, r6)
            if (r4 == 0) goto L3c8
            com.google.android.exoplayer2.Format r15 = r4.format
            java.lang.String r15 = r15.codecs
            r21 = r9
            r9 = 1
            java.lang.String r15 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r15, r9)
            r10.setCodecs(r15)
            java.lang.String r15 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r15)
            goto L3cb
        L3c8:
            r21 = r9
            r15 = 0
        L3cb:
            java.util.regex.Pattern r9 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CHANNELS
            java.lang.String r5 = parseOptionalStringAttr(r5, r9, r11)
            if (r5 == 0) goto L3fc
            java.lang.String r9 = "/"
            java.lang.String[] r9 = com.google.android.exoplayer2.util.Util.splitAtFirst(r5, r9)
            r16 = 0
            r9 = r9[r16]
            int r9 = java.lang.Integer.parseInt(r9)
            r10.setChannelCount(r9)
            java.lang.String r9 = "audio/eac3"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L3fe
            java.lang.String r9 = "/JOC"
            boolean r5 = r5.endsWith(r9)
            if (r5 == 0) goto L3fe
            java.lang.String r5 = "ec+3"
            r10.setCodecs(r5)
            java.lang.String r15 = "audio/eac3-joc"
            goto L3fe
        L3fc:
            r16 = 0
        L3fe:
            r10.setSampleMimeType(r15)
            if (r12 == 0) goto L415
            r10.setMetadata(r8)
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition
            com.google.android.exoplayer2.Format r5 = r10.build()
            r4.<init>(r12, r5, r6, r7)
            r9 = r32
            r9.add(r4)
            goto L461
        L415:
            r9 = r32
            if (r4 == 0) goto L461
            com.google.android.exoplayer2.Format r4 = r10.build()
            r21 = r4
            goto L461
        L420:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_INSTREAM_ID
            java.lang.String r4 = parseStringAttr(r5, r4, r11)
            java.lang.String r5 = "CC"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L441
            java.lang.String r4 = r4.substring(r15)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-608"
            goto L44c
        L441:
            r5 = 7
            java.lang.String r4 = r4.substring(r5)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "application/cea-708"
        L44c:
            if (r1 != 0) goto L453
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L453:
            com.google.android.exoplayer2.Format$Builder r5 = r10.setSampleMimeType(r5)
            r5.setAccessibilityChannel(r4)
            com.google.android.exoplayer2.Format r4 = r10.build()
            r1.add(r4)
        L461:
            r6 = r31
            goto L4aa
        L464:
            r21 = r9
            r9 = r32
            r14 = r33
            r16 = 0
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Variant r4 = getVariantWithSubtitleGroup(r2, r6)
            if (r4 == 0) goto L483
            com.google.android.exoplayer2.Format r4 = r4.format
            java.lang.String r4 = r4.codecs
            r5 = 3
            java.lang.String r4 = com.google.android.exoplayer2.util.Util.getCodecsOfType(r4, r5)
            r10.setCodecs(r4)
            java.lang.String r4 = com.google.android.exoplayer2.util.MimeTypes.getMediaMimeType(r4)
            goto L484
        L483:
            r4 = 0
        L484:
            if (r4 != 0) goto L489
            java.lang.String r4 = "text/vtt"
        L489:
            com.google.android.exoplayer2.Format$Builder r4 = r10.setSampleMimeType(r4)
            r4.setMetadata(r8)
            if (r12 == 0) goto L4a1
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition r4 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist$Rendition
            com.google.android.exoplayer2.Format r5 = r10.build()
            r4.<init>(r12, r5, r6, r7)
            r6 = r31
            r6.add(r4)
            goto L4aa
        L4a1:
            r6 = r31
            java.lang.String r4 = "HlsPlaylistParser"
            java.lang.String r5 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            com.google.android.exoplayer2.util.Log.w(r4, r5)
        L4aa:
            int r0 = r0 + 1
            r31 = r6
            r32 = r9
            r33 = r14
            r15 = r20
            r9 = r21
            r8 = 0
            goto L299
        L4b9:
            r21 = r9
            r6 = r31
            r9 = r32
            r14 = r33
            if (r13 == 0) goto L4c9
            java.util.List r0 = java.util.Collections.emptyList()
            r10 = r0
            goto L4ca
        L4c9:
            r10 = r1
        L4ca:
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r13 = new com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist
            r0 = r13
            r1 = r37
            r2 = r30
            r4 = r14
            r5 = r9
            r7 = r29
            r8 = r21
            r9 = r10
            r10 = r19
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    private static boolean parseOptionalBooleanAttribute(java.lang.String r0, java.util.regex.Pattern r1, boolean r2) {
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L16
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.String r1 = "YES"
            boolean r0 = r1.equals(r0)
            return r0
        L16:
            return r2
    }

    private static double parseOptionalDoubleAttr(java.lang.String r0, java.util.regex.Pattern r1, double r2) {
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L1a
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
        L1a:
            return r2
    }

    private static int parseOptionalIntAttr(java.lang.String r0, java.util.regex.Pattern r1, int r2) {
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L1a
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
        L1a:
            return r2
    }

    private static long parseOptionalLongAttr(java.lang.String r0, java.util.regex.Pattern r1, long r2) {
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L1a
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            return r0
        L1a:
            return r2
    }

    private static java.lang.String parseOptionalStringAttr(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L16
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L16:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L23
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            java.lang.String r2 = replaceVariableReferences(r2, r3)
        L23:
            return r2
    }

    @androidx.annotation.Nullable
    private static java.lang.String parseOptionalStringAttr(java.lang.String r1, java.util.regex.Pattern r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = 0
            java.lang.String r1 = parseOptionalStringAttr(r1, r2, r0, r3)
            return r1
    }

    private static int parseRoleFlags(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CHARACTERISTICS
            java.lang.String r1 = parseOptionalStringAttr(r1, r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r2 == 0) goto Le
            return r0
        Le:
            java.lang.String r2 = ","
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r1, r2)
            java.lang.String r2 = "public.accessibility.describes-video"
            boolean r2 = com.google.android.exoplayer2.util.Util.contains(r1, r2)
            if (r2 == 0) goto L1f
            r0 = 512(0x200, float:7.17E-43)
        L1f:
            java.lang.String r2 = "public.accessibility.transcribes-spoken-dialog"
            boolean r2 = com.google.android.exoplayer2.util.Util.contains(r1, r2)
            if (r2 == 0) goto L2a
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L2a:
            java.lang.String r2 = "public.accessibility.describes-music-and-sound"
            boolean r2 = com.google.android.exoplayer2.util.Util.contains(r1, r2)
            if (r2 == 0) goto L35
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L35:
            java.lang.String r2 = "public.easy-to-read"
            boolean r1 = com.google.android.exoplayer2.util.Util.contains(r1, r2)
            if (r1 == 0) goto L40
            r0 = r0 | 8192(0x2000, float:1.148E-41)
        L40:
            return r0
    }

    private static int parseSelectionFlags(java.lang.String r3) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_DEFAULT
            r1 = 0
            boolean r0 = parseOptionalBooleanAttribute(r3, r0, r1)
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_FORCED
            boolean r2 = parseOptionalBooleanAttribute(r3, r2, r1)
            if (r2 == 0) goto L11
            r0 = r0 | 2
        L11:
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_AUTOSELECT
            boolean r3 = parseOptionalBooleanAttribute(r3, r2, r1)
            if (r3 == 0) goto L1b
            r0 = r0 | 4
        L1b:
            return r0
    }

    private static com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.ServerControl parseServerControl(java.lang.String r19) {
            r0 = r19
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CAN_SKIP_UNTIL
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = parseOptionalDoubleAttr(r0, r1, r2)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L1a
            r11 = r6
            goto L1e
        L1a:
            double r4 = r4 * r8
            long r4 = (long) r4
            r11 = r4
        L1e:
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CAN_SKIP_DATE_RANGES
            r4 = 0
            boolean r13 = parseOptionalBooleanAttribute(r0, r1, r4)
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_HOLD_BACK
            double r14 = parseOptionalDoubleAttr(r0, r1, r2)
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 != 0) goto L31
            r14 = r6
            goto L34
        L31:
            double r14 = r14 * r8
            long r14 = (long) r14
        L34:
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_PART_HOLD_BACK
            double r16 = parseOptionalDoubleAttr(r0, r1, r2)
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 != 0) goto L3f
            goto L42
        L3f:
            double r1 = r16 * r8
            long r6 = (long) r1
        L42:
            r16 = r6
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_CAN_BLOCK_RELOAD
            boolean r18 = parseOptionalBooleanAttribute(r0, r1, r4)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$ServerControl
            r10 = r0
            r10.<init>(r11, r13, r14, r16, r18)
            return r0
    }

    private static java.lang.String parseStringAttr(java.lang.String r0, java.util.regex.Pattern r1, java.util.Map<java.lang.String, java.lang.String> r2) throws com.google.android.exoplayer2.ParserException {
            java.lang.String r2 = parseOptionalStringAttr(r0, r1, r2)
            if (r2 == 0) goto L7
            return r2
        L7:
            java.lang.String r2 = "Couldn't match "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r1 = r1.pattern()
            r2.append(r1)
            java.lang.String r1 = " in "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r0, r1)
            throw r0
    }

    private static long parseTimeSecondsToUs(java.lang.String r2, java.util.regex.Pattern r3) throws com.google.android.exoplayer2.ParserException {
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r2 = parseStringAttr(r2, r3, r0)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r2.<init>(r0)
            java.math.BigDecimal r2 = r3.multiply(r2)
            long r2 = r2.longValue()
            return r2
    }

    private static java.lang.String replaceVariableReferences(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.REGEX_VARIABLE_REFERENCE
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        Lb:
            boolean r1 = r3.find()
            if (r1 == 0) goto L2a
            r1 = 1
            java.lang.String r1 = r3.group(r1)
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.util.regex.Matcher.quoteReplacement(r1)
            r3.appendReplacement(r0, r1)
            goto Lb
        L2a:
            r3.appendTail(r0)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static int skipIgnorableWhitespace(java.io.BufferedReader r1, boolean r2, int r3) throws java.io.IOException {
        L0:
            r0 = -1
            if (r3 == r0) goto L16
            boolean r0 = java.lang.Character.isWhitespace(r3)
            if (r0 == 0) goto L16
            if (r2 != 0) goto L11
            boolean r0 = com.google.android.exoplayer2.util.Util.isLinebreak(r3)
            if (r0 != 0) goto L16
        L11:
            int r3 = r1.read()
            goto L0
        L16:
            return r3
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist parse(android.net.Uri r5, java.io.InputStream r6) throws java.io.IOException {
            r4 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r6)
            r0.<init>(r1)
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>()
            boolean r1 = checkPlaylistHeader(r0)     // Catch: java.lang.Throwable -> Lb1
            r2 = 0
            if (r1 == 0) goto Laa
        L16:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto La0
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> Lb1
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L27
            goto L16
        L27:
            java.lang.String r3 = "#EXT-X-STREAM-INF"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L43
            r6.add(r1)     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r5 = parseMultivariantPlaylist(r1, r5)     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            return r5
        L43:
            java.lang.String r3 = "#EXT-X-TARGETDURATION"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXTINF"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXT-X-KEY"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXT-X-BYTERANGE"
            boolean r3 = r1.startsWith(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXT-X-DISCONTINUITY"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L88
            java.lang.String r3 = "#EXT-X-ENDLIST"
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L84
            goto L88
        L84:
            r6.add(r1)     // Catch: java.lang.Throwable -> Lb1
            goto L16
        L88:
            r6.add(r1)     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist r1 = r4.multivariantPlaylist     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r2 = r4.previousMediaPlaylist     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator r3 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$LineIterator     // Catch: java.lang.Throwable -> Lb1
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r5 = parseMediaPlaylist(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> Lb1
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            return r5
        La0:
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            java.lang.String r5 = "Failed to parse the playlist, could not identify any tags."
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r5, r2)
            throw r5
        Laa:
            java.lang.String r5 = "Input does not start with the #EXTM3U header."
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r5, r2)     // Catch: java.lang.Throwable -> Lb1
            throw r5     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r5 = move-exception
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            throw r5
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist parse(android.net.Uri r1, java.io.InputStream r2) throws java.io.IOException {
            r0 = this;
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist r1 = r0.parse(r1, r2)
            return r1
    }
}
