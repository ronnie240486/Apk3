package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public interface RendererCapabilities {
    public static final int ADAPTIVE_NOT_SEAMLESS = 8;
    public static final int ADAPTIVE_NOT_SUPPORTED = 0;
    public static final int ADAPTIVE_SEAMLESS = 16;
    public static final int ADAPTIVE_SUPPORT_MASK = 24;
    public static final int DECODER_SUPPORT_FALLBACK = 0;
    public static final int DECODER_SUPPORT_FALLBACK_MIMETYPE = 256;
    public static final int DECODER_SUPPORT_PRIMARY = 128;

    @java.lang.Deprecated
    public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;

    @java.lang.Deprecated
    public static final int FORMAT_HANDLED = 4;
    public static final int FORMAT_SUPPORT_MASK = 7;

    @java.lang.Deprecated
    public static final int FORMAT_UNSUPPORTED_DRM = 2;

    @java.lang.Deprecated
    public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;

    @java.lang.Deprecated
    public static final int FORMAT_UNSUPPORTED_TYPE = 0;
    public static final int HARDWARE_ACCELERATION_NOT_SUPPORTED = 0;
    public static final int HARDWARE_ACCELERATION_SUPPORTED = 64;
    public static final int HARDWARE_ACCELERATION_SUPPORT_MASK = 64;
    public static final int MODE_SUPPORT_MASK = 384;
    public static final int TUNNELING_NOT_SUPPORTED = 0;
    public static final int TUNNELING_SUPPORTED = 32;
    public static final int TUNNELING_SUPPORT_MASK = 32;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.RendererCapabilities$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static int create(int r1) {
                r0 = 0
                int r1 = create(r1, r0, r0)
                return r1
        }

        public static int create(int r2, int r3, int r4) {
                r0 = 0
                r1 = 128(0x80, float:1.8E-43)
                int r2 = create(r2, r3, r4, r0, r1)
                return r2
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public static int create(int r0, int r1, int r2, int r3, int r4) {
                r0 = r0 | r1
                r0 = r0 | r2
                r0 = r0 | r3
                r0 = r0 | r4
                return r0
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public static int getAdaptiveSupport(int r0) {
                r0 = r0 & 24
                return r0
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public static int getDecoderSupport(int r0) {
                r0 = r0 & 384(0x180, float:5.38E-43)
                return r0
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public static int getFormatSupport(int r0) {
                r0 = r0 & 7
                return r0
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public static int getHardwareAccelerationSupport(int r0) {
                r0 = r0 & 64
                return r0
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public static int getTunnelingSupport(int r0) {
                r0 = r0 & 32
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DecoderSupport {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.Deprecated
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FormatSupport {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HardwareAccelerationSupport {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    java.lang.String getName();

    int getTrackType();

    int supportsFormat(com.google.android.exoplayer2.Format r1) throws com.google.android.exoplayer2.ExoPlaybackException;

    int supportsMixedMimeTypeAdaptation() throws com.google.android.exoplayer2.ExoPlaybackException;
}
