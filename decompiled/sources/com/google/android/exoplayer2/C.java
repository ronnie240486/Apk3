package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class C {
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;

    @java.lang.Deprecated
    public static final java.lang.String ASCII_NAME = "US-ASCII";
    public static final int AUDIO_CONTENT_TYPE_MOVIE = 3;
    public static final int AUDIO_CONTENT_TYPE_MUSIC = 2;
    public static final int AUDIO_CONTENT_TYPE_SONIFICATION = 4;
    public static final int AUDIO_CONTENT_TYPE_SPEECH = 1;
    public static final int AUDIO_CONTENT_TYPE_UNKNOWN = 0;
    public static final int AUDIO_SESSION_ID_UNSET = 0;
    public static final int BITS_PER_BYTE = 8;
    public static final int BUFFER_FLAG_DECODE_ONLY = Integer.MIN_VALUE;
    public static final int BUFFER_FLAG_ENCRYPTED = 1073741824;
    public static final int BUFFER_FLAG_END_OF_STREAM = 4;
    public static final int BUFFER_FLAG_FIRST_SAMPLE = 134217728;
    public static final int BUFFER_FLAG_HAS_SUPPLEMENTAL_DATA = 268435456;
    public static final int BUFFER_FLAG_KEY_FRAME = 1;
    public static final int BUFFER_FLAG_LAST_SAMPLE = 536870912;
    public static final int BYTES_PER_FLOAT = 4;
    public static final java.lang.String CENC_TYPE_cbc1 = "cbc1";
    public static final java.lang.String CENC_TYPE_cbcs = "cbcs";
    public static final java.lang.String CENC_TYPE_cenc = "cenc";
    public static final java.lang.String CENC_TYPE_cens = "cens";
    public static final java.util.UUID CLEARKEY_UUID = null;
    public static final int COLOR_RANGE_FULL = 1;
    public static final int COLOR_RANGE_LIMITED = 2;
    public static final int COLOR_SPACE_BT2020 = 6;
    public static final int COLOR_SPACE_BT601 = 2;
    public static final int COLOR_SPACE_BT709 = 1;
    public static final int COLOR_TRANSFER_HLG = 7;
    public static final int COLOR_TRANSFER_SDR = 3;
    public static final int COLOR_TRANSFER_ST2084 = 6;
    public static final java.util.UUID COMMON_PSSH_UUID = null;
    public static final int CONTENT_TYPE_DASH = 0;
    public static final int CONTENT_TYPE_HLS = 2;

    @java.lang.Deprecated
    public static final int CONTENT_TYPE_MOVIE = 3;

    @java.lang.Deprecated
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_OTHER = 4;
    public static final int CONTENT_TYPE_RTSP = 3;

    @java.lang.Deprecated
    public static final int CONTENT_TYPE_SONIFICATION = 4;

    @java.lang.Deprecated
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_SS = 1;

    @java.lang.Deprecated
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int CRYPTO_MODE_AES_CBC = 2;
    public static final int CRYPTO_MODE_AES_CTR = 1;
    public static final int CRYPTO_MODE_UNENCRYPTED = 0;
    public static final int CRYPTO_TYPE_CUSTOM_BASE = 10000;
    public static final int CRYPTO_TYPE_FRAMEWORK = 2;
    public static final int CRYPTO_TYPE_NONE = 0;
    public static final int CRYPTO_TYPE_UNSUPPORTED = 1;
    public static final int DATA_TYPE_AD = 6;
    public static final int DATA_TYPE_CUSTOM_BASE = 10000;
    public static final int DATA_TYPE_DRM = 3;
    public static final int DATA_TYPE_MANIFEST = 4;
    public static final int DATA_TYPE_MEDIA = 1;
    public static final int DATA_TYPE_MEDIA_INITIALIZATION = 2;
    public static final int DATA_TYPE_MEDIA_PROGRESSIVE_LIVE = 7;
    public static final int DATA_TYPE_TIME_SYNCHRONIZATION = 5;
    public static final int DATA_TYPE_UNKNOWN = 0;
    public static final int DEFAULT_BUFFER_SEGMENT_SIZE = 65536;
    public static final long DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS = 3000;
    public static final long DEFAULT_SEEK_BACK_INCREMENT_MS = 5000;
    public static final long DEFAULT_SEEK_FORWARD_INCREMENT_MS = 15000;
    public static final int ENCODING_AAC_ELD = 15;
    public static final int ENCODING_AAC_ER_BSAC = 1073741824;
    public static final int ENCODING_AAC_HE_V1 = 11;
    public static final int ENCODING_AAC_HE_V2 = 12;
    public static final int ENCODING_AAC_LC = 10;
    public static final int ENCODING_AAC_XHE = 16;
    public static final int ENCODING_AC3 = 5;
    public static final int ENCODING_AC4 = 17;
    public static final int ENCODING_DOLBY_TRUEHD = 14;
    public static final int ENCODING_DTS = 7;
    public static final int ENCODING_DTS_HD = 8;
    public static final int ENCODING_E_AC3 = 6;
    public static final int ENCODING_E_AC3_JOC = 18;
    public static final int ENCODING_INVALID = 0;
    public static final int ENCODING_MP3 = 9;
    public static final int ENCODING_OPUS = 20;
    public static final int ENCODING_PCM_16BIT = 2;
    public static final int ENCODING_PCM_16BIT_BIG_ENDIAN = 268435456;
    public static final int ENCODING_PCM_24BIT = 536870912;
    public static final int ENCODING_PCM_32BIT = 805306368;
    public static final int ENCODING_PCM_8BIT = 3;
    public static final int ENCODING_PCM_FLOAT = 4;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;
    public static final int FORMAT_HANDLED = 4;
    public static final int FORMAT_UNSUPPORTED_DRM = 2;
    public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;
    public static final int FORMAT_UNSUPPORTED_TYPE = 0;
    public static final int INDEX_UNSET = -1;

    @java.lang.Deprecated
    public static final java.lang.String ISO88591_NAME = "ISO-8859-1";
    public static final java.lang.String LANGUAGE_UNDETERMINED = "und";
    public static final int LENGTH_UNSET = -1;
    public static final long MICROS_PER_SECOND = 1000000;
    public static final long MILLIS_PER_SECOND = 1000;
    public static final long NANOS_PER_SECOND = 1000000000;
    public static final int NETWORK_TYPE_2G = 3;
    public static final int NETWORK_TYPE_3G = 4;
    public static final int NETWORK_TYPE_4G = 5;
    public static final int NETWORK_TYPE_5G_NSA = 10;
    public static final int NETWORK_TYPE_5G_SA = 9;
    public static final int NETWORK_TYPE_CELLULAR_UNKNOWN = 6;
    public static final int NETWORK_TYPE_ETHERNET = 7;
    public static final int NETWORK_TYPE_OFFLINE = 1;
    public static final int NETWORK_TYPE_OTHER = 8;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 2;
    public static final int PERCENTAGE_UNSET = -1;
    public static final java.util.UUID PLAYREADY_UUID = null;
    public static final int POSITION_UNSET = -1;
    public static final int PRIORITY_DOWNLOAD = -1000;
    public static final int PRIORITY_PLAYBACK = 0;
    public static final int PROJECTION_CUBEMAP = 2;
    public static final int PROJECTION_EQUIRECTANGULAR = 1;
    public static final int PROJECTION_MESH = 3;
    public static final int PROJECTION_RECTANGULAR = 0;
    public static final float RATE_UNSET = -3.4028235E38f;
    public static final int RATE_UNSET_INT = -2147483647;
    public static final int RESULT_BUFFER_READ = -4;
    public static final int RESULT_END_OF_INPUT = -1;
    public static final int RESULT_FORMAT_READ = -5;
    public static final int RESULT_MAX_LENGTH_EXCEEDED = -2;
    public static final int RESULT_NOTHING_READ = -3;
    public static final int ROLE_FLAG_ALTERNATE = 2;
    public static final int ROLE_FLAG_CAPTION = 64;
    public static final int ROLE_FLAG_COMMENTARY = 8;
    public static final int ROLE_FLAG_DESCRIBES_MUSIC_AND_SOUND = 1024;
    public static final int ROLE_FLAG_DESCRIBES_VIDEO = 512;
    public static final int ROLE_FLAG_DUB = 16;
    public static final int ROLE_FLAG_EASY_TO_READ = 8192;
    public static final int ROLE_FLAG_EMERGENCY = 32;
    public static final int ROLE_FLAG_ENHANCED_DIALOG_INTELLIGIBILITY = 2048;
    public static final int ROLE_FLAG_MAIN = 1;
    public static final int ROLE_FLAG_SIGN = 256;
    public static final int ROLE_FLAG_SUBTITLE = 128;
    public static final int ROLE_FLAG_SUPPLEMENTARY = 4;
    public static final int ROLE_FLAG_TRANSCRIBES_DIALOG = 4096;
    public static final int ROLE_FLAG_TRICK_PLAY = 16384;
    public static final java.lang.String SANS_SERIF_NAME = "sans-serif";
    public static final int SELECTION_FLAG_AUTOSELECT = 4;
    public static final int SELECTION_FLAG_DEFAULT = 1;
    public static final int SELECTION_FLAG_FORCED = 2;
    public static final int SELECTION_REASON_ADAPTIVE = 3;
    public static final int SELECTION_REASON_CUSTOM_BASE = 10000;
    public static final int SELECTION_REASON_INITIAL = 1;
    public static final int SELECTION_REASON_MANUAL = 2;
    public static final int SELECTION_REASON_TRICK_PLAY = 4;
    public static final int SELECTION_REASON_UNKNOWN = 0;
    public static final java.lang.String SERIF_NAME = "serif";
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = 0;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = 1;
    public static final java.lang.String SSAI_SCHEME = "ssai";
    public static final int STEREO_MODE_LEFT_RIGHT = 2;
    public static final int STEREO_MODE_MONO = 0;
    public static final int STEREO_MODE_STEREO_MESH = 3;
    public static final int STEREO_MODE_TOP_BOTTOM = 1;
    public static final int STREAM_TYPE_ALARM = 4;
    public static final int STREAM_TYPE_DEFAULT = 3;
    public static final int STREAM_TYPE_DTMF = 8;
    public static final int STREAM_TYPE_MUSIC = 3;
    public static final int STREAM_TYPE_NOTIFICATION = 5;
    public static final int STREAM_TYPE_RING = 2;
    public static final int STREAM_TYPE_SYSTEM = 1;
    public static final int STREAM_TYPE_VOICE_CALL = 0;
    public static final long TIME_END_OF_SOURCE = Long.MIN_VALUE;
    public static final long TIME_UNSET = -9223372036854775807L;
    public static final int TRACK_TYPE_AUDIO = 1;
    public static final int TRACK_TYPE_CAMERA_MOTION = 6;
    public static final int TRACK_TYPE_CUSTOM_BASE = 10000;
    public static final int TRACK_TYPE_DEFAULT = 0;
    public static final int TRACK_TYPE_IMAGE = 4;
    public static final int TRACK_TYPE_METADATA = 5;
    public static final int TRACK_TYPE_NONE = -2;
    public static final int TRACK_TYPE_TEXT = 3;
    public static final int TRACK_TYPE_UNKNOWN = -1;
    public static final int TRACK_TYPE_VIDEO = 2;

    @java.lang.Deprecated
    public static final int TYPE_DASH = 0;

    @java.lang.Deprecated
    public static final int TYPE_HLS = 2;

    @java.lang.Deprecated
    public static final int TYPE_OTHER = 4;

    @java.lang.Deprecated
    public static final int TYPE_RTSP = 3;

    @java.lang.Deprecated
    public static final int TYPE_SS = 1;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;

    @java.lang.Deprecated
    public static final java.lang.String UTF16LE_NAME = "UTF-16LE";

    @java.lang.Deprecated
    public static final java.lang.String UTF16_NAME = "UTF-16";

    @java.lang.Deprecated
    public static final java.lang.String UTF8_NAME = "UTF-8";
    public static final java.util.UUID UUID_NIL = null;
    public static final int VIDEO_CHANGE_FRAME_RATE_STRATEGY_OFF = Integer.MIN_VALUE;
    public static final int VIDEO_CHANGE_FRAME_RATE_STRATEGY_ONLY_IF_SEAMLESS = 0;
    public static final int VIDEO_OUTPUT_MODE_NONE = -1;
    public static final int VIDEO_OUTPUT_MODE_SURFACE_YUV = 1;
    public static final int VIDEO_OUTPUT_MODE_YUV = 0;
    public static final int VIDEO_SCALING_MODE_DEFAULT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    public static final int WAKE_MODE_LOCAL = 1;
    public static final int WAKE_MODE_NETWORK = 2;
    public static final int WAKE_MODE_NONE = 0;
    public static final java.util.UUID WIDEVINE_UUID = null;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AudioAllowedCapturePolicy {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AudioContentType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AudioFlags {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AudioUsage {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BufferFlags {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorRange {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorSpace {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorTransfer {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ContentType {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CryptoMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CryptoType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DataType {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Encoding {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FormatSupport {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PcmEncoding {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Projection {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RoleFlags {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SelectionFlags {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SelectionReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SpatializationBehavior {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StereoMode {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @android.annotation.SuppressLint({"UniqueConstants"})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TrackType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VideoChangeFrameRateStrategy {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VideoOutputMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @android.annotation.SuppressLint({"UniqueConstants"})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VideoScalingMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface WakeMode {
    }

    static {
            java.util.UUID r0 = new java.util.UUID
            r1 = 0
            r0.<init>(r1, r1)
            com.google.android.exoplayer2.C.UUID_NIL = r0
            java.util.UUID r0 = new java.util.UUID
            r1 = 1186680826959645954(0x1077efecc0b24d02, double:2.4669297115218948E-229)
            r3 = -5988876978535335093(0xace33c1e52e2fb4b, double:-1.8442503140481377E-92)
            r0.<init>(r1, r3)
            com.google.android.exoplayer2.C.COMMON_PSSH_UUID = r0
            java.util.UUID r0 = new java.util.UUID
            r1 = -2129748144642739255(0xe2719d58a985b3c9, double:-1.6229728350858627E166)
            r3 = 8654423357094679310(0x781ab030af78d30e, double:3.524813189889319E270)
            r0.<init>(r1, r3)
            com.google.android.exoplayer2.C.CLEARKEY_UUID = r0
            java.util.UUID r0 = new java.util.UUID
            r1 = -1301668207276963122(0xedef8ba979d64ace, double:-3.563403477674908E221)
            r3 = -6645017420763422227(0xa3c827dcd51d21ed, double:-2.5964014370906125E-136)
            r0.<init>(r1, r3)
            com.google.android.exoplayer2.C.WIDEVINE_UUID = r0
            java.util.UUID r0 = new java.util.UUID
            r1 = -7348484286925749626(0x9a04f07998404286, double:-2.4639730719150333E-183)
            r3 = -6083546864340672619(0xab92e65be0885f95, double:-8.640911267670052E-99)
            r0.<init>(r1, r3)
            com.google.android.exoplayer2.C.PLAYREADY_UUID = r0
            return
    }

    private C() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.generateAudioSessionIdV21(context)")
    @androidx.annotation.RequiresApi(21)
    @java.lang.Deprecated
    public static int generateAudioSessionIdV21(android.content.Context r0) {
            int r0 = com.google.android.exoplayer2.util.Util.generateAudioSessionIdV21(r0)
            return r0
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.getErrorCodeForMediaDrmErrorCode(mediaDrmErrorCode)")
    @java.lang.Deprecated
    public static int getErrorCodeForMediaDrmErrorCode(int r0) {
            int r0 = com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(r0)
            return r0
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.getFormatSupportString(formatSupport)")
    @java.lang.Deprecated
    public static java.lang.String getFormatSupportString(int r0) {
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.getFormatSupportString(r0)
            return r0
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.msToUs(timeMs)")
    @java.lang.Deprecated
    public static long msToUs(long r0) {
            long r0 = com.google.android.exoplayer2.util.Util.msToUs(r0)
            return r0
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.exoplayer2.util.Util"}, replacement = "Util.usToMs(timeUs)")
    @java.lang.Deprecated
    public static long usToMs(long r0) {
            long r0 = com.google.android.exoplayer2.util.Util.usToMs(r0)
            return r0
    }
}
