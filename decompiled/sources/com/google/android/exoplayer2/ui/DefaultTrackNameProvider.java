package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTrackNameProvider implements com.google.android.exoplayer2.ui.TrackNameProvider {
    private final android.content.res.Resources resources;

    public DefaultTrackNameProvider(android.content.res.Resources r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0.resources = r1
            return
    }

    private java.lang.String buildAudioChannelString(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            int r2 = r2.channelCount
            r0 = -1
            if (r2 == r0) goto L45
            r0 = 1
            if (r2 >= r0) goto L9
            goto L45
        L9:
            if (r2 == r0) goto L3c
            r0 = 2
            if (r2 == r0) goto L33
            r0 = 6
            if (r2 == r0) goto L2a
            r0 = 7
            if (r2 == r0) goto L2a
            r0 = 8
            if (r2 == r0) goto L21
            android.content.res.Resources r2 = r1.resources
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_track_surround
            java.lang.String r2 = r2.getString(r0)
            return r2
        L21:
            android.content.res.Resources r2 = r1.resources
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_track_surround_7_point_1
            java.lang.String r2 = r2.getString(r0)
            return r2
        L2a:
            android.content.res.Resources r2 = r1.resources
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_track_surround_5_point_1
            java.lang.String r2 = r2.getString(r0)
            return r2
        L33:
            android.content.res.Resources r2 = r1.resources
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_track_stereo
            java.lang.String r2 = r2.getString(r0)
            return r2
        L3c:
            android.content.res.Resources r2 = r1.resources
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_track_mono
            java.lang.String r2 = r2.getString(r0)
            return r2
        L45:
            java.lang.String r2 = ""
            return r2
    }

    private java.lang.String buildBitrateString(com.google.android.exoplayer2.Format r6) {
            r5 = this;
            int r6 = r6.bitrate
            r0 = -1
            if (r6 != r0) goto L8
            java.lang.String r6 = ""
            goto L1f
        L8:
            android.content.res.Resources r0 = r5.resources
            int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_bitrate
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            float r6 = (float) r6
            r4 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r4
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r2[r3] = r6
            java.lang.String r6 = r0.getString(r1, r2)
        L1f:
            return r6
    }

    private java.lang.String buildLabelString(com.google.android.exoplayer2.Format r2) {
            r1 = this;
            java.lang.String r0 = r2.label
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = ""
            goto Ld
        Lb:
            java.lang.String r2 = r2.label
        Ld:
            return r2
    }

    private java.lang.String buildLanguageOrLabelString(com.google.android.exoplayer2.Format r4) {
            r3 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r3.buildLanguageString(r4)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.buildRoleString(r4)
            r2 = 1
            r0[r2] = r1
            java.lang.String r0 = r3.joinWithSeparator(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = r3.buildLabelString(r4)
        L1f:
            return r0
    }

    private java.lang.String buildLanguageString(com.google.android.exoplayer2.Format r5) {
            r4 = this;
            java.lang.String r5 = r5.language
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 != 0) goto L56
            java.lang.String r0 = "und"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L14
            goto L56
        L14:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 21
            if (r0 < r2) goto L1f
            java.util.Locale r5 = java.util.Locale.forLanguageTag(r5)
            goto L25
        L1f:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r5)
            r5 = r0
        L25:
            java.util.Locale r0 = com.google.android.exoplayer2.util.Util.getDefaultDisplayLocale()
            java.lang.String r5 = r5.getDisplayName(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L34
            return r1
        L34:
            r1 = 1
            r2 = 0
            int r1 = r5.offsetByCodePoints(r2, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L55
            r3.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r2 = r5.substring(r2, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r0 = r2.toUpperCase(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            r3.append(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r0 = r5.substring(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            r3.append(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r5 = r3.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L55
        L55:
            return r5
        L56:
            return r1
    }

    private java.lang.String buildResolutionString(com.google.android.exoplayer2.Format r6) {
            r5 = this;
            int r0 = r6.width
            int r6 = r6.height
            r1 = -1
            if (r0 == r1) goto L24
            if (r6 != r1) goto La
            goto L24
        La:
            android.content.res.Resources r1 = r5.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_track_resolution
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            r0 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r0] = r6
            java.lang.String r6 = r1.getString(r2, r3)
            goto L26
        L24:
            java.lang.String r6 = ""
        L26:
            return r6
    }

    private java.lang.String buildRoleString(com.google.android.exoplayer2.Format r7) {
            r6 = this;
            int r0 = r7.roleFlags
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto Lf
            android.content.res.Resources r0 = r6.resources
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_track_role_alternate
            java.lang.String r0 = r0.getString(r2)
            goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            int r2 = r7.roleFlags
            r2 = r2 & 4
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2b
            java.lang.String[] r2 = new java.lang.String[r1]
            r2[r4] = r0
            android.content.res.Resources r0 = r6.resources
            int r5 = com.google.android.exoplayer2.ui.R.string.exo_track_role_supplementary
            java.lang.String r0 = r0.getString(r5)
            r2[r3] = r0
            java.lang.String r0 = r6.joinWithSeparator(r2)
        L2b:
            int r2 = r7.roleFlags
            r2 = r2 & 8
            if (r2 == 0) goto L43
            java.lang.String[] r2 = new java.lang.String[r1]
            r2[r4] = r0
            android.content.res.Resources r0 = r6.resources
            int r5 = com.google.android.exoplayer2.ui.R.string.exo_track_role_commentary
            java.lang.String r0 = r0.getString(r5)
            r2[r3] = r0
            java.lang.String r0 = r6.joinWithSeparator(r2)
        L43:
            int r7 = r7.roleFlags
            r7 = r7 & 1088(0x440, float:1.525E-42)
            if (r7 == 0) goto L5b
            java.lang.String[] r7 = new java.lang.String[r1]
            r7[r4] = r0
            android.content.res.Resources r0 = r6.resources
            int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_role_closed_captions
            java.lang.String r0 = r0.getString(r1)
            r7[r3] = r0
            java.lang.String r0 = r6.joinWithSeparator(r7)
        L5b:
            return r0
    }

    private static int inferPrimaryTrackType(com.google.android.exoplayer2.Format r4) {
            java.lang.String r0 = r4.sampleMimeType
            int r0 = com.google.android.exoplayer2.util.MimeTypes.getTrackType(r0)
            r1 = -1
            if (r0 == r1) goto La
            return r0
        La:
            java.lang.String r0 = r4.codecs
            java.lang.String r0 = com.google.android.exoplayer2.util.MimeTypes.getVideoMediaMimeType(r0)
            r2 = 2
            if (r0 == 0) goto L14
            return r2
        L14:
            java.lang.String r0 = r4.codecs
            java.lang.String r0 = com.google.android.exoplayer2.util.MimeTypes.getAudioMediaMimeType(r0)
            r3 = 1
            if (r0 == 0) goto L1e
            return r3
        L1e:
            int r0 = r4.width
            if (r0 != r1) goto L32
            int r0 = r4.height
            if (r0 == r1) goto L27
            goto L32
        L27:
            int r0 = r4.channelCount
            if (r0 != r1) goto L31
            int r4 = r4.sampleRate
            if (r4 == r1) goto L30
            goto L31
        L30:
            return r1
        L31:
            return r3
        L32:
            return r2
    }

    private java.lang.String joinWithSeparator(java.lang.String... r9) {
            r8 = this;
            int r0 = r9.length
            r1 = 0
            java.lang.String r2 = ""
            r3 = 0
        L5:
            if (r3 >= r0) goto L2a
            r4 = r9[r3]
            int r5 = r4.length()
            if (r5 <= 0) goto L27
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L17
            r2 = r4
            goto L27
        L17:
            android.content.res.Resources r5 = r8.resources
            int r6 = com.google.android.exoplayer2.ui.R.string.exo_item_list
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r2
            r2 = 1
            r7[r2] = r4
            java.lang.String r2 = r5.getString(r6, r7)
        L27:
            int r3 = r3 + 1
            goto L5
        L2a:
            return r2
    }

    @Override // com.google.android.exoplayer2.ui.TrackNameProvider
    public java.lang.String getTrackName(com.google.android.exoplayer2.Format r6) {
            r5 = this;
            int r0 = inferPrimaryTrackType(r6)
            r1 = 0
            r2 = 3
            r3 = 1
            r4 = 2
            if (r0 != r4) goto L23
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r2 = r5.buildRoleString(r6)
            r0[r1] = r2
            java.lang.String r1 = r5.buildResolutionString(r6)
            r0[r3] = r1
            java.lang.String r6 = r5.buildBitrateString(r6)
            r0[r4] = r6
            java.lang.String r6 = r5.joinWithSeparator(r0)
            goto L42
        L23:
            if (r0 != r3) goto L3e
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r2 = r5.buildLanguageOrLabelString(r6)
            r0[r1] = r2
            java.lang.String r1 = r5.buildAudioChannelString(r6)
            r0[r3] = r1
            java.lang.String r6 = r5.buildBitrateString(r6)
            r0[r4] = r6
            java.lang.String r6 = r5.joinWithSeparator(r0)
            goto L42
        L3e:
            java.lang.String r6 = r5.buildLanguageOrLabelString(r6)
        L42:
            int r0 = r6.length()
            if (r0 != 0) goto L50
            android.content.res.Resources r6 = r5.resources
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_track_unknown
            java.lang.String r6 = r6.getString(r0)
        L50:
            return r6
    }
}
