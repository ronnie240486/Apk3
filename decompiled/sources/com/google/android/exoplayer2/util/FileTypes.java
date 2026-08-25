package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    private static final java.lang.String EXTENSION_AAC = ".aac";
    private static final java.lang.String EXTENSION_AC3 = ".ac3";
    private static final java.lang.String EXTENSION_AC4 = ".ac4";
    private static final java.lang.String EXTENSION_ADTS = ".adts";
    private static final java.lang.String EXTENSION_AMR = ".amr";
    private static final java.lang.String EXTENSION_AVI = ".avi";
    private static final java.lang.String EXTENSION_EC3 = ".ec3";
    private static final java.lang.String EXTENSION_FLAC = ".flac";
    private static final java.lang.String EXTENSION_FLV = ".flv";
    private static final java.lang.String EXTENSION_JPEG = ".jpeg";
    private static final java.lang.String EXTENSION_JPG = ".jpg";
    private static final java.lang.String EXTENSION_M2P = ".m2p";
    private static final java.lang.String EXTENSION_MID = ".mid";
    private static final java.lang.String EXTENSION_MIDI = ".midi";
    private static final java.lang.String EXTENSION_MP3 = ".mp3";
    private static final java.lang.String EXTENSION_MP4 = ".mp4";
    private static final java.lang.String EXTENSION_MPEG = ".mpeg";
    private static final java.lang.String EXTENSION_MPG = ".mpg";
    private static final java.lang.String EXTENSION_OPUS = ".opus";
    private static final java.lang.String EXTENSION_PREFIX_CMF = ".cmf";
    private static final java.lang.String EXTENSION_PREFIX_M4 = ".m4";
    private static final java.lang.String EXTENSION_PREFIX_MK = ".mk";
    private static final java.lang.String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final java.lang.String EXTENSION_PREFIX_OG = ".og";
    private static final java.lang.String EXTENSION_PREFIX_TS = ".ts";
    private static final java.lang.String EXTENSION_PS = ".ps";
    private static final java.lang.String EXTENSION_SMF = ".smf";
    private static final java.lang.String EXTENSION_TS = ".ts";
    private static final java.lang.String EXTENSION_VTT = ".vtt";
    private static final java.lang.String EXTENSION_WAV = ".wav";
    private static final java.lang.String EXTENSION_WAVE = ".wave";
    private static final java.lang.String EXTENSION_WEBM = ".webm";
    private static final java.lang.String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PS = 10;
    public static final int TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBVTT = 13;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int inferFileTypeFromMimeType(@androidx.annotation.Nullable java.lang.String r19) {
            r0 = -1
            if (r19 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = com.google.android.exoplayer2.util.MimeTypes.normalizeMimeType(r19)
            java.util.Objects.requireNonNull(r1)
            int r2 = r1.hashCode()
            r3 = 16
            r4 = 15
            r5 = 14
            r6 = 13
            r7 = 12
            r8 = 11
            r9 = 10
            r10 = 9
            r11 = 8
            r12 = 7
            r13 = 6
            r14 = 5
            r15 = 4
            r16 = 3
            r17 = 1
            r18 = 0
            switch(r2) {
                case -2123537834: goto L180;
                case -1662384011: goto L173;
                case -1662384007: goto L166;
                case -1662095187: goto L159;
                case -1606874997: goto L14d;
                case -1487394660: goto L141;
                case -1248337486: goto L135;
                case -1079884372: goto L128;
                case -1004728940: goto L119;
                case -387023398: goto L10b;
                case -43467528: goto Lfd;
                case 13915911: goto Lee;
                case 187078296: goto Le0;
                case 187078297: goto Ld2;
                case 187078669: goto Lc4;
                case 187090232: goto Lb6;
                case 187091926: goto La8;
                case 187099443: goto L9b;
                case 1331848029: goto L8d;
                case 1503095341: goto L80;
                case 1504578661: goto L73;
                case 1504619009: goto L66;
                case 1504824762: goto L59;
                case 1504831518: goto L4c;
                case 1505118770: goto L3f;
                case 2039520277: goto L31;
                default: goto L2e;
            }
        L2e:
            r1 = -1
            goto L18b
        L31:
            java.lang.String r2 = "video/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3b
            goto L2e
        L3b:
            r1 = 25
            goto L18b
        L3f:
            java.lang.String r2 = "audio/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L48
            goto L2e
        L48:
            r1 = 24
            goto L18b
        L4c:
            java.lang.String r2 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L55
            goto L2e
        L55:
            r1 = 23
            goto L18b
        L59:
            java.lang.String r2 = "audio/midi"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L62
            goto L2e
        L62:
            r1 = 22
            goto L18b
        L66:
            java.lang.String r2 = "audio/flac"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6f
            goto L2e
        L6f:
            r1 = 21
            goto L18b
        L73:
            java.lang.String r2 = "audio/eac3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7c
            goto L2e
        L7c:
            r1 = 20
            goto L18b
        L80:
            java.lang.String r2 = "audio/3gpp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L89
            goto L2e
        L89:
            r1 = 19
            goto L18b
        L8d:
            java.lang.String r2 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L97
            goto L2e
        L97:
            r1 = 18
            goto L18b
        L9b:
            java.lang.String r2 = "audio/wav"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto La4
            goto L2e
        La4:
            r1 = 17
            goto L18b
        La8:
            java.lang.String r2 = "audio/ogg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lb2
            goto L2e
        Lb2:
            r1 = 16
            goto L18b
        Lb6:
            java.lang.String r2 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lc0
            goto L2e
        Lc0:
            r1 = 15
            goto L18b
        Lc4:
            java.lang.String r2 = "audio/amr"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lce
            goto L2e
        Lce:
            r1 = 14
            goto L18b
        Ld2:
            java.lang.String r2 = "audio/ac4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Ldc
            goto L2e
        Ldc:
            r1 = 13
            goto L18b
        Le0:
            java.lang.String r2 = "audio/ac3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lea
            goto L2e
        Lea:
            r1 = 12
            goto L18b
        Lee:
            java.lang.String r2 = "video/x-flv"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lf9
            goto L2e
        Lf9:
            r1 = 11
            goto L18b
        Lfd:
            java.lang.String r2 = "application/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L107
            goto L2e
        L107:
            r1 = 10
            goto L18b
        L10b:
            java.lang.String r2 = "audio/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L115
            goto L2e
        L115:
            r1 = 9
            goto L18b
        L119:
            java.lang.String r2 = "text/vtt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L124
            goto L2e
        L124:
            r1 = 8
            goto L18b
        L128:
            java.lang.String r2 = "video/x-msvideo"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L133
            goto L2e
        L133:
            r1 = 7
            goto L18b
        L135:
            java.lang.String r2 = "application/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13f
            goto L2e
        L13f:
            r1 = 6
            goto L18b
        L141:
            java.lang.String r2 = "image/jpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L14b
            goto L2e
        L14b:
            r1 = 5
            goto L18b
        L14d:
            java.lang.String r2 = "audio/amr-wb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L157
            goto L2e
        L157:
            r1 = 4
            goto L18b
        L159:
            java.lang.String r2 = "video/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L164
            goto L2e
        L164:
            r1 = 3
            goto L18b
        L166:
            java.lang.String r2 = "video/mp2t"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L171
            goto L2e
        L171:
            r1 = 2
            goto L18b
        L173:
            java.lang.String r2 = "video/mp2p"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L17e
            goto L2e
        L17e:
            r1 = 1
            goto L18b
        L180:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L18a
            goto L2e
        L18a:
            r1 = 0
        L18b:
            switch(r1) {
                case 0: goto L19e;
                case 1: goto L19d;
                case 2: goto L19c;
                case 3: goto L19b;
                case 4: goto L19a;
                case 5: goto L199;
                case 6: goto L198;
                case 7: goto L197;
                case 8: goto L196;
                case 9: goto L19b;
                case 10: goto L19b;
                case 11: goto L195;
                case 12: goto L19e;
                case 13: goto L194;
                case 14: goto L19a;
                case 15: goto L198;
                case 16: goto L193;
                case 17: goto L192;
                case 18: goto L198;
                case 19: goto L19a;
                case 20: goto L19e;
                case 21: goto L191;
                case 22: goto L190;
                case 23: goto L18f;
                case 24: goto L19b;
                case 25: goto L19b;
                default: goto L18e;
            }
        L18e:
            return r0
        L18f:
            return r12
        L190:
            return r4
        L191:
            return r15
        L192:
            return r7
        L193:
            return r10
        L194:
            return r17
        L195:
            return r14
        L196:
            return r6
        L197:
            return r3
        L198:
            return r11
        L199:
            return r5
        L19a:
            return r16
        L19b:
            return r13
        L19c:
            return r8
        L19d:
            return r9
        L19e:
            return r18
    }

    public static int inferFileTypeFromResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1) {
            java.lang.String r0 = "Content-Type"
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L19
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L11
            goto L19
        L11:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            goto L1a
        L19:
            r1 = 0
        L1a:
            int r1 = inferFileTypeFromMimeType(r1)
            return r1
    }

    public static int inferFileTypeFromUri(android.net.Uri r6) {
            java.lang.String r6 = r6.getLastPathSegment()
            r0 = -1
            if (r6 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = ".ac3"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L165
            java.lang.String r1 = ".ec3"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L1a
            goto L165
        L1a:
            java.lang.String r1 = ".ac4"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L24
            r6 = 1
            return r6
        L24:
            java.lang.String r1 = ".adts"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L163
            java.lang.String r1 = ".aac"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L36
            goto L163
        L36:
            java.lang.String r1 = ".amr"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L40
            r6 = 3
            return r6
        L40:
            java.lang.String r1 = ".flac"
            boolean r1 = r6.endsWith(r1)
            r2 = 4
            if (r1 == 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = ".flv"
            boolean r1 = r6.endsWith(r1)
            r3 = 5
            if (r1 == 0) goto L54
            return r3
        L54:
            java.lang.String r1 = ".mid"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L160
            java.lang.String r1 = ".midi"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L160
            java.lang.String r1 = ".smf"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L6e
            goto L160
        L6e:
            int r1 = r6.length()
            int r1 = r1 - r2
            java.lang.String r4 = ".mk"
            boolean r1 = r6.startsWith(r4, r1)
            if (r1 != 0) goto L15e
            java.lang.String r1 = ".webm"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L85
            goto L15e
        L85:
            java.lang.String r1 = ".mp3"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L8f
            r6 = 7
            return r6
        L8f:
            java.lang.String r1 = ".mp4"
            boolean r4 = r6.endsWith(r1)
            if (r4 != 0) goto L15b
            int r4 = r6.length()
            int r4 = r4 - r2
            java.lang.String r5 = ".m4"
            boolean r4 = r6.startsWith(r5, r4)
            if (r4 != 0) goto L15b
            int r4 = r6.length()
            int r4 = r4 - r3
            boolean r1 = r6.startsWith(r1, r4)
            if (r1 != 0) goto L15b
            int r1 = r6.length()
            int r1 = r1 - r3
            java.lang.String r3 = ".cmf"
            boolean r1 = r6.startsWith(r3, r1)
            if (r1 == 0) goto Lbe
            goto L15b
        Lbe:
            int r1 = r6.length()
            int r1 = r1 - r2
            java.lang.String r3 = ".og"
            boolean r1 = r6.startsWith(r3, r1)
            if (r1 != 0) goto L158
            java.lang.String r1 = ".opus"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto Ld5
            goto L158
        Ld5:
            java.lang.String r1 = ".ps"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L155
            java.lang.String r1 = ".mpeg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L155
            java.lang.String r1 = ".mpg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L155
            java.lang.String r1 = ".m2p"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto Lf6
            goto L155
        Lf6:
            java.lang.String r1 = ".ts"
            boolean r3 = r6.endsWith(r1)
            if (r3 != 0) goto L152
            int r3 = r6.length()
            int r3 = r3 - r2
            boolean r1 = r6.startsWith(r1, r3)
            if (r1 == 0) goto L10a
            goto L152
        L10a:
            java.lang.String r1 = ".wav"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L14f
            java.lang.String r1 = ".wave"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L11b
            goto L14f
        L11b:
            java.lang.String r1 = ".vtt"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L14c
            java.lang.String r1 = ".webvtt"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L12c
            goto L14c
        L12c:
            java.lang.String r1 = ".jpg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L149
            java.lang.String r1 = ".jpeg"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L13d
            goto L149
        L13d:
            java.lang.String r1 = ".avi"
            boolean r6 = r6.endsWith(r1)
            if (r6 == 0) goto L148
            r6 = 16
            return r6
        L148:
            return r0
        L149:
            r6 = 14
            return r6
        L14c:
            r6 = 13
            return r6
        L14f:
            r6 = 12
            return r6
        L152:
            r6 = 11
            return r6
        L155:
            r6 = 10
            return r6
        L158:
            r6 = 9
            return r6
        L15b:
            r6 = 8
            return r6
        L15e:
            r6 = 6
            return r6
        L160:
            r6 = 15
            return r6
        L163:
            r6 = 2
            return r6
        L165:
            r6 = 0
            return r6
    }
}
