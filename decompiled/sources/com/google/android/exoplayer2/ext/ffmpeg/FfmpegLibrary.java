package com.google.android.exoplayer2.ext.ffmpeg;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegLibrary {
    private static final com.google.android.exoplayer2.util.LibraryLoader LOADER = null;
    private static final java.lang.String TAG = "FfmpegLibrary";
    private static int inputBufferPaddingSize;
    private static java.lang.String version;


    static {
            java.lang.String r0 = "goog.exo.ffmpeg"
            com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule(r0)
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary$1 r0 = new com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary$1
            java.lang.String r1 = "ffmpegJNI"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.<init>(r1)
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.LOADER = r0
            r0 = -1
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.inputBufferPaddingSize = r0
            return
    }

    private FfmpegLibrary() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native java.lang.String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(java.lang.String r0);

    @androidx.annotation.Nullable
    public static java.lang.String getCodecName(java.lang.String r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -2123537834: goto Le6;
                case -1606874997: goto Ldb;
                case -1095064472: goto Ld0;
                case -1003765268: goto Lc5;
                case -432837260: goto Lba;
                case -432837259: goto Laf;
                case -53558318: goto La4;
                case 187078296: goto L99;
                case 1503095341: goto L8b;
                case 1504470054: goto L7d;
                case 1504578661: goto L6f;
                case 1504619009: goto L61;
                case 1504831518: goto L53;
                case 1504891608: goto L45;
                case 1505942594: goto L37;
                case 1556697186: goto L29;
                case 1903231877: goto L1b;
                case 1903589369: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lf0
        Ld:
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            goto Lf0
        L17:
            r1 = 17
            goto Lf0
        L1b:
            java.lang.String r0 = "audio/g711-alaw"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L25
            goto Lf0
        L25:
            r1 = 16
            goto Lf0
        L29:
            java.lang.String r0 = "audio/true-hd"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto Lf0
        L33:
            r1 = 15
            goto Lf0
        L37:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto Lf0
        L41:
            r1 = 14
            goto Lf0
        L45:
            java.lang.String r0 = "audio/opus"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4f
            goto Lf0
        L4f:
            r1 = 13
            goto Lf0
        L53:
            java.lang.String r0 = "audio/mpeg"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5d
            goto Lf0
        L5d:
            r1 = 12
            goto Lf0
        L61:
            java.lang.String r0 = "audio/flac"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6b
            goto Lf0
        L6b:
            r1 = 11
            goto Lf0
        L6f:
            java.lang.String r0 = "audio/eac3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L79
            goto Lf0
        L79:
            r1 = 10
            goto Lf0
        L7d:
            java.lang.String r0 = "audio/alac"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L87
            goto Lf0
        L87:
            r1 = 9
            goto Lf0
        L8b:
            java.lang.String r0 = "audio/3gpp"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L95
            goto Lf0
        L95:
            r1 = 8
            goto Lf0
        L99:
            java.lang.String r0 = "audio/ac3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La2
            goto Lf0
        La2:
            r1 = 7
            goto Lf0
        La4:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lad
            goto Lf0
        Lad:
            r1 = 6
            goto Lf0
        Laf:
            java.lang.String r0 = "audio/mpeg-L2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb8
            goto Lf0
        Lb8:
            r1 = 5
            goto Lf0
        Lba:
            java.lang.String r0 = "audio/mpeg-L1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc3
            goto Lf0
        Lc3:
            r1 = 4
            goto Lf0
        Lc5:
            java.lang.String r0 = "audio/vorbis"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lce
            goto Lf0
        Lce:
            r1 = 3
            goto Lf0
        Ld0:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ld9
            goto Lf0
        Ld9:
            r1 = 2
            goto Lf0
        Ldb:
            java.lang.String r0 = "audio/amr-wb"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Le4
            goto Lf0
        Le4:
            r1 = 1
            goto Lf0
        Le6:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lef
            goto Lf0
        Lef:
            r1 = 0
        Lf0:
            switch(r1) {
                case 0: goto L11e;
                case 1: goto L11b;
                case 2: goto L118;
                case 3: goto L114;
                case 4: goto L111;
                case 5: goto L111;
                case 6: goto L10e;
                case 7: goto L10b;
                case 8: goto L108;
                case 9: goto L105;
                case 10: goto L11e;
                case 11: goto L102;
                case 12: goto L111;
                case 13: goto Lff;
                case 14: goto L118;
                case 15: goto Lfb;
                case 16: goto Lf8;
                case 17: goto Lf5;
                default: goto Lf3;
            }
        Lf3:
            r2 = 0
            return r2
        Lf5:
            java.lang.String r2 = "pcm_mulaw"
            return r2
        Lf8:
            java.lang.String r2 = "pcm_alaw"
            return r2
        Lfb:
            java.lang.String r2 = "truehd"
            return r2
        Lff:
            java.lang.String r2 = "opus"
            return r2
        L102:
            java.lang.String r2 = "flac"
            return r2
        L105:
            java.lang.String r2 = "alac"
            return r2
        L108:
            java.lang.String r2 = "amrnb"
            return r2
        L10b:
            java.lang.String r2 = "ac3"
            return r2
        L10e:
            java.lang.String r2 = "aac"
            return r2
        L111:
            java.lang.String r2 = "mp3"
            return r2
        L114:
            java.lang.String r2 = "vorbis"
            return r2
        L118:
            java.lang.String r2 = "dca"
            return r2
        L11b:
            java.lang.String r2 = "amrwb"
            return r2
        L11e:
            java.lang.String r2 = "eac3"
            return r2
    }

    public static int getInputBufferPaddingSize() {
            boolean r0 = isAvailable()
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.inputBufferPaddingSize
            if (r0 != r1) goto L12
            int r0 = ffmpegGetInputBufferPaddingSize()
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.inputBufferPaddingSize = r0
        L12:
            int r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.inputBufferPaddingSize
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String getVersion() {
            boolean r0 = isAvailable()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.version
            if (r0 != 0) goto L12
            java.lang.String r0 = ffmpegGetVersion()
            com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.version = r0
        L12:
            java.lang.String r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.version
            return r0
    }

    public static boolean isAvailable() {
            com.google.android.exoplayer2.util.LibraryLoader r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.LOADER
            boolean r0 = r0.isAvailable()
            return r0
    }

    public static void setLibraries(java.lang.String... r1) {
            com.google.android.exoplayer2.util.LibraryLoader r0 = com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.LOADER
            r0.setLibraries(r1)
            return
    }

    public static boolean supportsFormat(java.lang.String r3) {
            boolean r0 = isAvailable()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r3 = getCodecName(r3)
            if (r3 != 0) goto Lf
            return r1
        Lf:
            boolean r0 = ffmpegHasDecoder(r3)
            if (r0 != 0) goto L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "No "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = " decoder available. Check the FFmpeg build configuration."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "FfmpegLibrary"
            com.google.android.exoplayer2.util.Log.w(r0, r3)
            return r1
        L31:
            r3 = 1
            return r3
    }
}
