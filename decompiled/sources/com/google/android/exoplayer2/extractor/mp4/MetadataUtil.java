package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;

    @androidx.annotation.VisibleForTesting
    public static final java.lang.String[] STANDARD_GENRES = null;
    private static final java.lang.String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    static {
            java.lang.String r0 = "Blues"
            java.lang.String r1 = "Classic Rock"
            java.lang.String r2 = "Country"
            java.lang.String r3 = "Dance"
            java.lang.String r4 = "Disco"
            java.lang.String r5 = "Funk"
            java.lang.String r6 = "Grunge"
            java.lang.String r7 = "Hip-Hop"
            java.lang.String r8 = "Jazz"
            java.lang.String r9 = "Metal"
            java.lang.String r10 = "New Age"
            java.lang.String r11 = "Oldies"
            java.lang.String r12 = "Other"
            java.lang.String r13 = "Pop"
            java.lang.String r14 = "R&B"
            java.lang.String r15 = "Rap"
            java.lang.String r16 = "Reggae"
            java.lang.String r17 = "Rock"
            java.lang.String r18 = "Techno"
            java.lang.String r19 = "Industrial"
            java.lang.String r20 = "Alternative"
            java.lang.String r21 = "Ska"
            java.lang.String r22 = "Death Metal"
            java.lang.String r23 = "Pranks"
            java.lang.String r24 = "Soundtrack"
            java.lang.String r25 = "Euro-Techno"
            java.lang.String r26 = "Ambient"
            java.lang.String r27 = "Trip-Hop"
            java.lang.String r28 = "Vocal"
            java.lang.String r29 = "Jazz+Funk"
            java.lang.String r30 = "Fusion"
            java.lang.String r31 = "Trance"
            java.lang.String r32 = "Classical"
            java.lang.String r33 = "Instrumental"
            java.lang.String r34 = "Acid"
            java.lang.String r35 = "House"
            java.lang.String r36 = "Game"
            java.lang.String r37 = "Sound Clip"
            java.lang.String r38 = "Gospel"
            java.lang.String r39 = "Noise"
            java.lang.String r40 = "AlternRock"
            java.lang.String r41 = "Bass"
            java.lang.String r42 = "Soul"
            java.lang.String r43 = "Punk"
            java.lang.String r44 = "Space"
            java.lang.String r45 = "Meditative"
            java.lang.String r46 = "Instrumental Pop"
            java.lang.String r47 = "Instrumental Rock"
            java.lang.String r48 = "Ethnic"
            java.lang.String r49 = "Gothic"
            java.lang.String r50 = "Darkwave"
            java.lang.String r51 = "Techno-Industrial"
            java.lang.String r52 = "Electronic"
            java.lang.String r53 = "Pop-Folk"
            java.lang.String r54 = "Eurodance"
            java.lang.String r55 = "Dream"
            java.lang.String r56 = "Southern Rock"
            java.lang.String r57 = "Comedy"
            java.lang.String r58 = "Cult"
            java.lang.String r59 = "Gangsta"
            java.lang.String r60 = "Top 40"
            java.lang.String r61 = "Christian Rap"
            java.lang.String r62 = "Pop/Funk"
            java.lang.String r63 = "Jungle"
            java.lang.String r64 = "Native American"
            java.lang.String r65 = "Cabaret"
            java.lang.String r66 = "New Wave"
            java.lang.String r67 = "Psychadelic"
            java.lang.String r68 = "Rave"
            java.lang.String r69 = "Showtunes"
            java.lang.String r70 = "Trailer"
            java.lang.String r71 = "Lo-Fi"
            java.lang.String r72 = "Tribal"
            java.lang.String r73 = "Acid Punk"
            java.lang.String r74 = "Acid Jazz"
            java.lang.String r75 = "Polka"
            java.lang.String r76 = "Retro"
            java.lang.String r77 = "Musical"
            java.lang.String r78 = "Rock & Roll"
            java.lang.String r79 = "Hard Rock"
            java.lang.String r80 = "Folk"
            java.lang.String r81 = "Folk-Rock"
            java.lang.String r82 = "National Folk"
            java.lang.String r83 = "Swing"
            java.lang.String r84 = "Fast Fusion"
            java.lang.String r85 = "Bebob"
            java.lang.String r86 = "Latin"
            java.lang.String r87 = "Revival"
            java.lang.String r88 = "Celtic"
            java.lang.String r89 = "Bluegrass"
            java.lang.String r90 = "Avantgarde"
            java.lang.String r91 = "Gothic Rock"
            java.lang.String r92 = "Progressive Rock"
            java.lang.String r93 = "Psychedelic Rock"
            java.lang.String r94 = "Symphonic Rock"
            java.lang.String r95 = "Slow Rock"
            java.lang.String r96 = "Big Band"
            java.lang.String r97 = "Chorus"
            java.lang.String r98 = "Easy Listening"
            java.lang.String r99 = "Acoustic"
            java.lang.String r100 = "Humour"
            java.lang.String r101 = "Speech"
            java.lang.String r102 = "Chanson"
            java.lang.String r103 = "Opera"
            java.lang.String r104 = "Chamber Music"
            java.lang.String r105 = "Sonata"
            java.lang.String r106 = "Symphony"
            java.lang.String r107 = "Booty Bass"
            java.lang.String r108 = "Primus"
            java.lang.String r109 = "Porn Groove"
            java.lang.String r110 = "Satire"
            java.lang.String r111 = "Slow Jam"
            java.lang.String r112 = "Club"
            java.lang.String r113 = "Tango"
            java.lang.String r114 = "Samba"
            java.lang.String r115 = "Folklore"
            java.lang.String r116 = "Ballad"
            java.lang.String r117 = "Power Ballad"
            java.lang.String r118 = "Rhythmic Soul"
            java.lang.String r119 = "Freestyle"
            java.lang.String r120 = "Duet"
            java.lang.String r121 = "Punk Rock"
            java.lang.String r122 = "Drum Solo"
            java.lang.String r123 = "A capella"
            java.lang.String r124 = "Euro-House"
            java.lang.String r125 = "Dance Hall"
            java.lang.String r126 = "Goa"
            java.lang.String r127 = "Drum & Bass"
            java.lang.String r128 = "Club-House"
            java.lang.String r129 = "Hardcore"
            java.lang.String r130 = "Terror"
            java.lang.String r131 = "Indie"
            java.lang.String r132 = "BritPop"
            java.lang.String r133 = "Afro-Punk"
            java.lang.String r134 = "Polsk Punk"
            java.lang.String r135 = "Beat"
            java.lang.String r136 = "Christian Gangsta Rap"
            java.lang.String r137 = "Heavy Metal"
            java.lang.String r138 = "Black Metal"
            java.lang.String r139 = "Crossover"
            java.lang.String r140 = "Contemporary Christian"
            java.lang.String r141 = "Christian Rock"
            java.lang.String r142 = "Merengue"
            java.lang.String r143 = "Salsa"
            java.lang.String r144 = "Thrash Metal"
            java.lang.String r145 = "Anime"
            java.lang.String r146 = "Jpop"
            java.lang.String r147 = "Synthpop"
            java.lang.String r148 = "Abstract"
            java.lang.String r149 = "Art Rock"
            java.lang.String r150 = "Baroque"
            java.lang.String r151 = "Bhangra"
            java.lang.String r152 = "Big beat"
            java.lang.String r153 = "Breakbeat"
            java.lang.String r154 = "Chillout"
            java.lang.String r155 = "Downtempo"
            java.lang.String r156 = "Dub"
            java.lang.String r157 = "EBM"
            java.lang.String r158 = "Eclectic"
            java.lang.String r159 = "Electro"
            java.lang.String r160 = "Electroclash"
            java.lang.String r161 = "Emo"
            java.lang.String r162 = "Experimental"
            java.lang.String r163 = "Garage"
            java.lang.String r164 = "Global"
            java.lang.String r165 = "IDM"
            java.lang.String r166 = "Illbient"
            java.lang.String r167 = "Industro-Goth"
            java.lang.String r168 = "Jam Band"
            java.lang.String r169 = "Krautrock"
            java.lang.String r170 = "Leftfield"
            java.lang.String r171 = "Lounge"
            java.lang.String r172 = "Math Rock"
            java.lang.String r173 = "New Romantic"
            java.lang.String r174 = "Nu-Breakz"
            java.lang.String r175 = "Post-Punk"
            java.lang.String r176 = "Post-Rock"
            java.lang.String r177 = "Psytrance"
            java.lang.String r178 = "Shoegaze"
            java.lang.String r179 = "Space Rock"
            java.lang.String r180 = "Trop Rock"
            java.lang.String r181 = "World Music"
            java.lang.String r182 = "Neoclassical"
            java.lang.String r183 = "Audiobook"
            java.lang.String r184 = "Audio theatre"
            java.lang.String r185 = "Neue Deutsche Welle"
            java.lang.String r186 = "Podcast"
            java.lang.String r187 = "Indie-Rock"
            java.lang.String r188 = "G-Funk"
            java.lang.String r189 = "Dubstep"
            java.lang.String r190 = "Garage Rock"
            java.lang.String r191 = "Psybient"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191}
            com.google.android.exoplayer2.extractor.mp4.MetadataUtil.STANDARD_GENRES = r0
            return
    }

    private MetadataUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.CommentFrame parseCommentAttribute(int r3, com.google.android.exoplayer2.util.ParsableByteArray r4) {
            int r0 = r4.readInt()
            int r1 = r4.readInt()
            r2 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r2) goto L21
            r3 = 8
            r4.skipBytes(r3)
            int r0 = r0 + (-16)
            java.lang.String r3 = r4.readNullTerminatedString(r0)
            com.google.android.exoplayer2.metadata.id3.CommentFrame r4 = new com.google.android.exoplayer2.metadata.id3.CommentFrame
            java.lang.String r0 = "und"
            r4.<init>(r0, r3, r3)
            return r4
        L21:
            java.lang.String r4 = "Failed to parse comment attribute: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r3 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "MetadataUtil"
            com.google.android.exoplayer2.util.Log.w(r4, r3)
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.ApicFrame parseCoverArt(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            int r0 = r5.readInt()
            int r1 = r5.readInt()
            java.lang.String r2 = "MetadataUtil"
            r3 = 0
            r4 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r4) goto L42
            int r1 = r5.readInt()
            int r1 = com.google.android.exoplayer2.extractor.mp4.Atom.parseFullAtomFlags(r1)
            r4 = 13
            if (r1 != r4) goto L1f
            java.lang.String r4 = "image/jpeg"
            goto L27
        L1f:
            r4 = 14
            if (r1 != r4) goto L26
            java.lang.String r4 = "image/png"
            goto L27
        L26:
            r4 = r3
        L27:
            if (r4 != 0) goto L2f
            java.lang.String r5 = "Unrecognized cover art flags: "
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r5, r1, r2)
            return r3
        L2f:
            r1 = 4
            r5.skipBytes(r1)
            int r0 = r0 + (-16)
            byte[] r1 = new byte[r0]
            r2 = 0
            r5.readBytes(r1, r2, r0)
            com.google.android.exoplayer2.metadata.id3.ApicFrame r5 = new com.google.android.exoplayer2.metadata.id3.ApicFrame
            r0 = 3
            r5.<init>(r4, r3, r0, r1)
            return r5
        L42:
            java.lang.String r5 = "Failed to parse cover art attribute"
            com.google.android.exoplayer2.util.Log.w(r2, r5)
            return r3
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.Metadata.Entry parseIlstElement(com.google.android.exoplayer2.util.ParsableByteArray r5) {
            int r0 = r5.getPosition()
            int r1 = r5.readInt()
            int r1 = r1 + r0
            int r0 = r5.readInt()
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 169(0xa9, float:2.37E-43)
            if (r2 == r3) goto L116
            r3 = 253(0xfd, float:3.55E-43)
            if (r2 != r3) goto L1b
            goto L116
        L1b:
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r0 != r2) goto L28
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseStandardGenreAttribute(r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L28:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r0 != r2) goto L37
            java.lang.String r2 = "TPOS"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseIndexAndCountAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L37:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r0 != r2) goto L46
            java.lang.String r2 = "TRCK"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseIndexAndCountAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L46:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L57
            java.lang.String r2 = "TBPM"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r0 = parseUint8Attribute(r0, r2, r5, r4, r3)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L57:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r0 != r2) goto L66
            java.lang.String r2 = "TCMP"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r0 = parseUint8Attribute(r0, r2, r5, r4, r4)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L66:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r0 != r2) goto L73
            com.google.android.exoplayer2.metadata.id3.ApicFrame r0 = parseCoverArt(r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L73:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r0 != r2) goto L82
            java.lang.String r2 = "TPE2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L82:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r0 != r2) goto L91
            java.lang.String r2 = "TSOT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L91:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r0 != r2) goto La0
            java.lang.String r2 = "TSO2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        La0:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r0 != r2) goto Laf
            java.lang.String r2 = "TSOA"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        Laf:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r0 != r2) goto Lbe
            java.lang.String r2 = "TSOP"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        Lbe:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r0 != r2) goto Lcd
            java.lang.String r2 = "TSOC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        Lcd:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r0 != r2) goto Ldc
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r0 = parseUint8Attribute(r0, r2, r5, r3, r3)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        Ldc:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r0 != r2) goto Leb
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r0 = parseUint8Attribute(r0, r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        Leb:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r0 != r2) goto Lfa
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        Lfa:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r0 != r2) goto L109
            java.lang.String r2 = "TVSHOW"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L109:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r0 != r2) goto L1ab
            com.google.android.exoplayer2.metadata.id3.Id3Frame r0 = parseInternalAttribute(r5, r1)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L116:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r3 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r3) goto L12a
            com.google.android.exoplayer2.metadata.id3.CommentFrame r0 = parseCommentAttribute(r0, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L127:
            r0 = move-exception
            goto L1de
        L12a:
            r3 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r3) goto L1d4
            r3 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r3) goto L136
            goto L1d4
        L136:
            r3 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r3) goto L1ca
            r3 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r3) goto L142
            goto L1ca
        L142:
            r3 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r3) goto L151
            java.lang.String r2 = "TDRC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L151:
            r3 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r3) goto L160
            java.lang.String r2 = "TPE1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L160:
            r3 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r3) goto L16f
            java.lang.String r2 = "TSSE"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L16f:
            r3 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r3) goto L17e
            java.lang.String r2 = "TALB"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L17e:
            r3 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r3) goto L18d
            java.lang.String r2 = "USLT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L18d:
            r3 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r3) goto L19c
            java.lang.String r2 = "TCON"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L19c:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L1ab
            java.lang.String r2 = "TIT1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L1ab:
            java.lang.String r2 = "MetadataUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r3.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "Skipped unknown metadata entry: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L127
            java.lang.String r0 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r0)     // Catch: java.lang.Throwable -> L127
            r3.append(r0)     // Catch: java.lang.Throwable -> L127
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L127
            com.google.android.exoplayer2.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L127
            r0 = 0
            r5.setPosition(r1)
            return r0
        L1ca:
            java.lang.String r2 = "TCOM"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L1d4:
            java.lang.String r2 = "TIT2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = parseTextAttribute(r0, r2, r5)     // Catch: java.lang.Throwable -> L127
            r5.setPosition(r1)
            return r0
        L1de:
            r5.setPosition(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseIndexAndCountAttribute(int r4, java.lang.String r5, com.google.android.exoplayer2.util.ParsableByteArray r6) {
            int r0 = r6.readInt()
            int r1 = r6.readInt()
            r2 = 0
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r3) goto L47
            r1 = 22
            if (r0 < r1) goto L47
            r0 = 10
            r6.skipBytes(r0)
            int r0 = r6.readUnsignedShort()
            if (r0 <= 0) goto L47
            java.lang.String r4 = ""
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r0)
            int r6 = r6.readUnsignedShort()
            if (r6 <= 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "/"
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
        L3d:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r6 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of(r4)
            r6.<init>(r5, r2, r4)
            return r6
        L47:
            java.lang.String r5 = "Failed to parse index/count attribute: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MetadataUtil"
            com.google.android.exoplayer2.util.Log.w(r5, r4)
            return r2
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame parseInternalAttribute(com.google.android.exoplayer2.util.ParsableByteArray r10, int r11) {
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = -1
            r5 = -1
        L6:
            int r6 = r10.getPosition()
            if (r6 >= r11) goto L41
            int r6 = r10.getPosition()
            int r7 = r10.readInt()
            int r8 = r10.readInt()
            r9 = 4
            r10.skipBytes(r9)
            r9 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r8 != r9) goto L28
            int r7 = r7 + (-12)
            java.lang.String r2 = r10.readNullTerminatedString(r7)
            goto L6
        L28:
            r9 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r8 != r9) goto L34
            int r7 = r7 + (-12)
            java.lang.String r3 = r10.readNullTerminatedString(r7)
            goto L6
        L34:
            r9 = 1684108385(0x64617461, float:1.6635614E22)
            if (r8 != r9) goto L3b
            r4 = r6
            r5 = r7
        L3b:
            int r7 = r7 + (-12)
            r10.skipBytes(r7)
            goto L6
        L41:
            if (r2 == 0) goto L5b
            if (r3 == 0) goto L5b
            if (r4 != r0) goto L48
            goto L5b
        L48:
            r10.setPosition(r4)
            r11 = 16
            r10.skipBytes(r11)
            int r5 = r5 - r11
            java.lang.String r10 = r10.readNullTerminatedString(r5)
            com.google.android.exoplayer2.metadata.id3.InternalFrame r11 = new com.google.android.exoplayer2.metadata.id3.InternalFrame
            r11.<init>(r2, r3, r10)
            return r11
        L5b:
            return r1
    }

    @androidx.annotation.Nullable
    public static com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(com.google.android.exoplayer2.util.ParsableByteArray r4, int r5, java.lang.String r6) {
        L0:
            int r0 = r4.getPosition()
            if (r0 >= r5) goto L2e
            int r1 = r4.readInt()
            int r2 = r4.readInt()
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r2 != r3) goto L29
            int r5 = r4.readInt()
            int r0 = r4.readInt()
            int r1 = r1 + (-16)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4.readBytes(r2, r3, r1)
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r4 = new com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            r4.<init>(r6, r2, r0, r5)
            return r4
        L29:
            int r0 = r0 + r1
            r4.setPosition(r0)
            goto L0
        L2e:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseStandardGenreAttribute(com.google.android.exoplayer2.util.ParsableByteArray r3) {
            int r3 = parseUint8AttributeValue(r3)
            r0 = 0
            if (r3 <= 0) goto L12
            java.lang.String[] r1 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.STANDARD_GENRES
            r2 = 192(0xc0, float:2.69E-43)
            if (r3 > r2) goto L12
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L13
        L12:
            r3 = r0
        L13:
            if (r3 == 0) goto L21
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L21:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.google.android.exoplayer2.util.Log.w(r3, r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame parseTextAttribute(int r4, java.lang.String r5, com.google.android.exoplayer2.util.ParsableByteArray r6) {
            int r0 = r6.readInt()
            int r1 = r6.readInt()
            r2 = 0
            r3 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r3) goto L23
            r4 = 8
            r6.skipBytes(r4)
            int r0 = r0 + (-16)
            java.lang.String r4 = r6.readNullTerminatedString(r0)
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r6 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of(r4)
            r6.<init>(r5, r2, r4)
            return r6
        L23:
            java.lang.String r5 = "Failed to parse text attribute: "
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r4 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r4)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MetadataUtil"
            com.google.android.exoplayer2.util.Log.w(r5, r4)
            return r2
    }

    @androidx.annotation.Nullable
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame parseUint8Attribute(int r0, java.lang.String r1, com.google.android.exoplayer2.util.ParsableByteArray r2, boolean r3, boolean r4) {
            int r2 = parseUint8AttributeValue(r2)
            if (r4 == 0) goto Lb
            r4 = 1
            int r2 = java.lang.Math.min(r4, r2)
        Lb:
            r4 = 0
            if (r2 < 0) goto L2b
            if (r3 == 0) goto L1e
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r0 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = java.lang.Integer.toString(r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2)
            r0.<init>(r1, r4, r2)
            goto L2a
        L1e:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r0 = new com.google.android.exoplayer2.metadata.id3.CommentFrame
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r3 = "und"
            r0.<init>(r3, r1, r2)
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "Failed to parse uint8 attribute: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r0 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MetadataUtil"
            com.google.android.exoplayer2.util.Log.w(r1, r0)
            return r4
    }

    private static int parseUint8AttributeValue(com.google.android.exoplayer2.util.ParsableByteArray r2) {
            r0 = 4
            r2.skipBytes(r0)
            int r0 = r2.readInt()
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            if (r0 != r1) goto L17
            r0 = 8
            r2.skipBytes(r0)
            int r2 = r2.readUnsignedByte()
            return r2
        L17:
            java.lang.String r2 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            com.google.android.exoplayer2.util.Log.w(r2, r0)
            r2 = -1
            return r2
    }

    public static void setFormatGaplessInfo(int r1, com.google.android.exoplayer2.extractor.GaplessInfoHolder r2, com.google.android.exoplayer2.Format.Builder r3) {
            r0 = 1
            if (r1 != r0) goto L14
            boolean r1 = r2.hasGaplessInfo()
            if (r1 == 0) goto L14
            int r1 = r2.encoderDelay
            com.google.android.exoplayer2.Format$Builder r1 = r3.setEncoderDelay(r1)
            int r2 = r2.encoderPadding
            r1.setEncoderPadding(r2)
        L14:
            return
    }

    public static void setFormatMetadata(int r5, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r6, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r7, com.google.android.exoplayer2.Format.Builder r8, com.google.android.exoplayer2.metadata.Metadata... r9) {
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = 0
        L14:
            int r6 = r7.length()
            if (r5 >= r6) goto L3c
            com.google.android.exoplayer2.metadata.Metadata$Entry r6 = r7.get(r5)
            boolean r3 = r6 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r6 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.key
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.copyWithAppendedEntriesFrom(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.length()
            if (r5 <= 0) goto L52
            r8.setMetadata(r6)
        L52:
            return
    }
}
