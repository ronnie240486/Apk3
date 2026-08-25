package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF = null;
    private static final int[] CRC8_BYTES_MSBF = null;
    public static final java.lang.String DEVICE = null;
    public static final java.lang.String DEVICE_DEBUG_INFO = null;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final java.util.regex.Pattern ESCAPED_CHARACTER_PATTERN = null;
    private static final java.lang.String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final java.lang.String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final java.util.regex.Pattern ISM_PATH_PATTERN = null;
    public static final java.lang.String MANUFACTURER = null;
    public static final java.lang.String MODEL = null;
    public static final int SDK_INT = 0;
    private static final java.lang.String TAG = "Util";
    private static final java.util.regex.Pattern XS_DATE_TIME_PATTERN = null;
    private static final java.util.regex.Pattern XS_DURATION_PATTERN = null;
    private static final java.lang.String[] additionalIsoLanguageReplacements = null;
    private static final java.lang.String[] isoLegacyTagReplacements = null;

    @androidx.annotation.Nullable
    private static java.util.HashMap<java.lang.String, java.lang.String> languageTagReplacementMap;

    @androidx.annotation.RequiresApi(21)
    public static final class Api21 {
        private Api21() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Drawable getDrawable(android.content.Context r0, android.content.res.Resources r1, @androidx.annotation.DrawableRes int r2) {
                android.content.res.Resources$Theme r0 = r0.getTheme()
                android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r0)
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$DSdcFhMZFeNvai4CKemAhlKDeCY(com.google.common.util.concurrent.ListenableFuture r0, com.google.common.util.concurrent.SettableFuture r1, com.google.common.util.concurrent.AsyncFunction r2) {
            lambda$transformFutureAsync$2(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$ZfnFpleg-wixrRMpxSt_dFcCTgo, reason: not valid java name */
    public static /* synthetic */ void m274$r8$lambda$ZfnFplegwixrRMpxSt_dFcCTgo(com.google.common.util.concurrent.SettableFuture r0, java.lang.Runnable r1, java.lang.Object r2) {
            lambda$postOrRunWithCompletion$0(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$lciPjQTIl8EORFgORqEmHr5uUWw(com.google.common.util.concurrent.SettableFuture r0, com.google.common.util.concurrent.ListenableFuture r1) {
            lambda$transformFutureAsync$1(r0, r1)
            return
    }

    public static /* synthetic */ java.lang.Thread $r8$lambda$v2YB0WFvbKTVAGdYe6puw1TMTpE(java.lang.String r0, java.lang.Runnable r1) {
            java.lang.Thread r0 = lambda$newSingleThreadExecutor$3(r0, r1)
            return r0
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.exoplayer2.util.Util.SDK_INT = r0
            java.lang.String r1 = android.os.Build.DEVICE
            com.google.android.exoplayer2.util.Util.DEVICE = r1
            java.lang.String r2 = android.os.Build.MANUFACTURER
            com.google.android.exoplayer2.util.Util.MANUFACTURER = r2
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.exoplayer2.util.Util.MODEL = r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ", "
            r4.append(r1)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY = r0
            java.lang.String r0 = "(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.util.Util.XS_DATE_TIME_PATTERN = r0
            java.lang.String r0 = "^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.util.Util.XS_DURATION_PATTERN = r0
            java.lang.String r0 = "%([A-Fa-f0-9]{2})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.util.Util.ESCAPED_CHARACTER_PATTERN = r0
            java.lang.String r0 = "(?:.*\\.)?isml?(?:/(manifest(.*))?)?"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.exoplayer2.util.Util.ISM_PATH_PATTERN = r0
            java.lang.String r1 = "alb"
            java.lang.String r2 = "sq"
            java.lang.String r3 = "arm"
            java.lang.String r4 = "hy"
            java.lang.String r5 = "baq"
            java.lang.String r6 = "eu"
            java.lang.String r7 = "bur"
            java.lang.String r8 = "my"
            java.lang.String r9 = "tib"
            java.lang.String r10 = "bo"
            java.lang.String r11 = "chi"
            java.lang.String r12 = "zh"
            java.lang.String r13 = "cze"
            java.lang.String r14 = "cs"
            java.lang.String r15 = "dut"
            java.lang.String r16 = "nl"
            java.lang.String r17 = "ger"
            java.lang.String r18 = "de"
            java.lang.String r19 = "gre"
            java.lang.String r20 = "el"
            java.lang.String r21 = "fre"
            java.lang.String r22 = "fr"
            java.lang.String r23 = "geo"
            java.lang.String r24 = "ka"
            java.lang.String r25 = "ice"
            java.lang.String r26 = "is"
            java.lang.String r27 = "mac"
            java.lang.String r28 = "mk"
            java.lang.String r29 = "mao"
            java.lang.String r30 = "mi"
            java.lang.String r31 = "may"
            java.lang.String r32 = "ms"
            java.lang.String r33 = "per"
            java.lang.String r34 = "fa"
            java.lang.String r35 = "rum"
            java.lang.String r36 = "ro"
            java.lang.String r37 = "scc"
            java.lang.String r38 = "hbs-srp"
            java.lang.String r39 = "slo"
            java.lang.String r40 = "sk"
            java.lang.String r41 = "wel"
            java.lang.String r42 = "cy"
            java.lang.String r43 = "id"
            java.lang.String r44 = "ms-ind"
            java.lang.String r45 = "iw"
            java.lang.String r46 = "he"
            java.lang.String r47 = "heb"
            java.lang.String r48 = "he"
            java.lang.String r49 = "ji"
            java.lang.String r50 = "yi"
            java.lang.String r51 = "arb"
            java.lang.String r52 = "ar-arb"
            java.lang.String r53 = "in"
            java.lang.String r54 = "ms-ind"
            java.lang.String r55 = "ind"
            java.lang.String r56 = "ms-ind"
            java.lang.String r57 = "nb"
            java.lang.String r58 = "no-nob"
            java.lang.String r59 = "nob"
            java.lang.String r60 = "no-nob"
            java.lang.String r61 = "nn"
            java.lang.String r62 = "no-nno"
            java.lang.String r63 = "nno"
            java.lang.String r64 = "no-nno"
            java.lang.String r65 = "tw"
            java.lang.String r66 = "ak-twi"
            java.lang.String r67 = "twi"
            java.lang.String r68 = "ak-twi"
            java.lang.String r69 = "bs"
            java.lang.String r70 = "hbs-bos"
            java.lang.String r71 = "bos"
            java.lang.String r72 = "hbs-bos"
            java.lang.String r73 = "hr"
            java.lang.String r74 = "hbs-hrv"
            java.lang.String r75 = "hrv"
            java.lang.String r76 = "hbs-hrv"
            java.lang.String r77 = "sr"
            java.lang.String r78 = "hbs-srp"
            java.lang.String r79 = "srp"
            java.lang.String r80 = "hbs-srp"
            java.lang.String r81 = "cmn"
            java.lang.String r82 = "zh-cmn"
            java.lang.String r83 = "hak"
            java.lang.String r84 = "zh-hak"
            java.lang.String r85 = "nan"
            java.lang.String r86 = "zh-nan"
            java.lang.String r87 = "hsn"
            java.lang.String r88 = "zh-hsn"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88}
            com.google.android.exoplayer2.util.Util.additionalIsoLanguageReplacements = r0
            java.lang.String r1 = "i-lux"
            java.lang.String r2 = "lb"
            java.lang.String r3 = "i-hak"
            java.lang.String r4 = "zh-hak"
            java.lang.String r5 = "i-navajo"
            java.lang.String r6 = "nv"
            java.lang.String r7 = "no-bok"
            java.lang.String r8 = "no-nob"
            java.lang.String r9 = "no-nyn"
            java.lang.String r10 = "no-nno"
            java.lang.String r11 = "zh-guoyu"
            java.lang.String r12 = "zh-cmn"
            java.lang.String r13 = "zh-hakka"
            java.lang.String r14 = "zh-hak"
            java.lang.String r15 = "zh-min-nan"
            java.lang.String r16 = "zh-nan"
            java.lang.String r17 = "zh-xiang"
            java.lang.String r18 = "zh-hsn"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            com.google.android.exoplayer2.util.Util.isoLegacyTagReplacements = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r1 = {x0164: FILL_ARRAY_DATA , data: [0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108} // fill-array
            com.google.android.exoplayer2.util.Util.CRC32_BYTES_MSBF = r1
            int[] r0 = new int[r0]
            r0 = {x0368: FILL_ARRAY_DATA , data: [0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243} // fill-array
            com.google.android.exoplayer2.util.Util.CRC8_BYTES_MSBF = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long addWithOverflowDefault(long r3, long r5, long r7) {
            long r0 = r3 + r5
            long r3 = r3 ^ r0
            long r5 = r5 ^ r0
            long r3 = r3 & r5
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto Lc
            return r7
        Lc:
            return r0
    }

    public static boolean areEqual(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchCeil(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L8
            int r4 = ~r0
            goto L23
        L8:
            int r1 = r3.size()
        Lc:
            int r0 = r0 + 1
            if (r0 >= r1) goto L1d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L1d
            goto Lc
        L1d:
            if (r5 == 0) goto L22
            int r4 = r0 + (-1)
            goto L23
        L22:
            r4 = r0
        L23:
            if (r6 == 0) goto L2f
            int r3 = r3.size()
            int r3 = r3 + (-1)
            int r4 = java.lang.Math.min(r3, r4)
        L2f:
            return r4
    }

    public static int binarySearchCeil(int[] r2, int r3, boolean r4, boolean r5) {
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L8
            int r3 = ~r0
            goto L18
        L8:
            int r0 = r0 + 1
            int r1 = r2.length
            if (r0 >= r1) goto L12
            r1 = r2[r0]
            if (r1 != r3) goto L12
            goto L8
        L12:
            if (r4 == 0) goto L17
            int r3 = r0 + (-1)
            goto L18
        L17:
            r3 = r0
        L18:
            if (r5 == 0) goto L21
            int r2 = r2.length
            int r2 = r2 + (-1)
            int r3 = java.lang.Math.min(r2, r3)
        L21:
            return r3
    }

    public static int binarySearchCeil(long[] r4, long r5, boolean r7, boolean r8) {
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L8
            int r5 = ~r0
            goto L1a
        L8:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L14
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L14
            goto L8
        L14:
            if (r7 == 0) goto L19
            int r5 = r0 + (-1)
            goto L1a
        L19:
            r5 = r0
        L1a:
            if (r8 == 0) goto L23
            int r4 = r4.length
            int r4 = r4 + (-1)
            int r5 = java.lang.Math.min(r4, r5)
        L23:
            return r5
    }

    public static int binarySearchFloor(com.google.android.exoplayer2.util.LongArray r7, long r8, boolean r10, boolean r11) {
            int r0 = r7.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        L8:
            if (r2 > r0) goto L1d
            int r3 = r2 + r0
            int r3 = r3 >>> 1
            long r4 = r7.get(r3)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 >= 0) goto L19
            int r2 = r3 + 1
            goto L8
        L19:
            int r3 = r3 + (-1)
            r0 = r3
            goto L8
        L1d:
            if (r10 == 0) goto L31
            int r10 = r0 + 1
            int r2 = r7.size()
            if (r10 >= r2) goto L31
            long r2 = r7.get(r10)
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 != 0) goto L31
            r1 = r10
            goto L38
        L31:
            if (r11 == 0) goto L37
            r7 = -1
            if (r0 != r7) goto L37
            goto L38
        L37:
            r1 = r0
        L38:
            return r1
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchFloor(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L21
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            if (r4 == 0) goto L20
            int r2 = r0 + 1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r5 == 0) goto L28
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L28:
            return r2
    }

    public static int binarySearchFloor(int[] r2, int r3, boolean r4, boolean r5) {
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
    }

    public static int binarySearchFloor(long[] r4, long r5, boolean r7, boolean r8) {
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r4 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L15
            goto La
        L15:
            if (r7 == 0) goto L1a
            int r4 = r0 + 1
            goto L1b
        L1a:
            r4 = r0
        L1b:
            if (r8 == 0) goto L22
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L22:
            return r4
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T castNonNull(@androidx.annotation.Nullable T r0) {
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] r0) {
            return r0
    }

    public static int ceilDivide(int r0, int r1) {
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            int r0 = r0 / r1
            return r0
    }

    public static long ceilDivide(long r2, long r4) {
            long r2 = r2 + r4
            r0 = 1
            long r2 = r2 - r0
            long r2 = r2 / r4
            return r2
    }

    public static boolean checkCleartextTrafficPermitted(com.google.android.exoplayer2.MediaItem... r7) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1
            r2 = 24
            if (r0 >= r2) goto L8
            return r1
        L8:
            int r0 = r7.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L41
            r4 = r7[r3]
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r5 = r4.localConfiguration
            if (r5 != 0) goto L14
            goto L3e
        L14:
            android.net.Uri r5 = r5.uri
            boolean r5 = isTrafficRestricted(r5)
            if (r5 == 0) goto L1d
            return r2
        L1d:
            r5 = 0
        L1e:
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r6 = r4.localConfiguration
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r6 = r6.subtitleConfigurations
            int r6 = r6.size()
            if (r5 >= r6) goto L3e
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r6 = r4.localConfiguration
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r6 = r6.subtitleConfigurations
            java.lang.Object r6 = r6.get(r5)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            android.net.Uri r6 = r6.uri
            boolean r6 = isTrafficRestricted(r6)
            if (r6 == 0) goto L3b
            return r2
        L3b:
            int r5 = r5 + 1
            goto L1e
        L3e:
            int r3 = r3 + 1
            goto Lb
        L41:
            return r1
    }

    public static void closeQuietly(@androidx.annotation.Nullable java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static int compareLong(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            goto Lb
        L6:
            if (r0 != 0) goto La
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    public static float constrainValue(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r0, r2)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static int constrainValue(int r0, int r1, int r2) {
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static long constrainValue(long r0, long r2, long r4) {
            long r0 = java.lang.Math.min(r0, r4)
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public static boolean contains(java.lang.Object[] r4, @androidx.annotation.Nullable java.lang.Object r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L12
            r3 = r4[r2]
            boolean r3 = areEqual(r3, r5)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    public static int crc32(byte[] r3, int r4, int r5, int r6) {
        L0:
            if (r4 >= r5) goto L15
            int r0 = r6 << 8
            int[] r1 = com.google.android.exoplayer2.util.Util.CRC32_BYTES_MSBF
            int r6 = r6 >>> 24
            r2 = r3[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6 = r6 ^ r2
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r1[r6]
            r6 = r6 ^ r0
            int r4 = r4 + 1
            goto L0
        L15:
            return r6
    }

    public static int crc8(byte[] r2, int r3, int r4, int r5) {
        L0:
            if (r3 >= r4) goto Le
            int[] r0 = com.google.android.exoplayer2.util.Util.CRC8_BYTES_MSBF
            r1 = r2[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r1
            r5 = r0[r5]
            int r3 = r3 + 1
            goto L0
        Le:
            return r5
    }

    public static android.os.Handler createHandler(android.os.Looper r1, @androidx.annotation.Nullable android.os.Handler.Callback r2) {
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r2)
            return r0
    }

    public static android.os.Handler createHandlerForCurrentLooper() {
            r0 = 0
            android.os.Handler r0 = createHandlerForCurrentLooper(r0)
            return r0
    }

    public static android.os.Handler createHandlerForCurrentLooper(@androidx.annotation.Nullable android.os.Handler.Callback r1) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            android.os.Looper r0 = (android.os.Looper) r0
            android.os.Handler r1 = createHandler(r0, r1)
            return r1
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper() {
            r0 = 0
            android.os.Handler r0 = createHandlerForCurrentOrMainLooper(r0)
            return r0
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper(@androidx.annotation.Nullable android.os.Handler.Callback r1) {
            android.os.Looper r0 = getCurrentOrMainLooper()
            android.os.Handler r1 = createHandler(r0, r1)
            return r1
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> createIsoLanguageReplacementMap() {
            java.lang.String[] r0 = java.util.Locale.getISOLanguages()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.length
            java.lang.String[] r3 = com.google.android.exoplayer2.util.Util.additionalIsoLanguageReplacements
            int r3 = r3.length
            int r2 = r2 + r3
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L11:
            if (r4 >= r2) goto L2a
            r5 = r0[r4]
            java.util.Locale r6 = new java.util.Locale     // Catch: java.util.MissingResourceException -> L27
            r6.<init>(r5)     // Catch: java.util.MissingResourceException -> L27
            java.lang.String r6 = r6.getISO3Language()     // Catch: java.util.MissingResourceException -> L27
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.util.MissingResourceException -> L27
            if (r7 != 0) goto L27
            r1.put(r6, r5)     // Catch: java.util.MissingResourceException -> L27
        L27:
            int r4 = r4 + 1
            goto L11
        L2a:
            java.lang.String[] r0 = com.google.android.exoplayer2.util.Util.additionalIsoLanguageReplacements
            int r2 = r0.length
            if (r3 >= r2) goto L3b
            r2 = r0[r3]
            int r4 = r3 + 1
            r0 = r0[r4]
            r1.put(r2, r0)
            int r3 = r3 + 2
            goto L2a
        L3b:
            return r1
    }

    public static java.io.File createTempDirectory(android.content.Context r0, java.lang.String r1) throws java.io.IOException {
            java.io.File r0 = createTempFile(r0, r1)
            r0.delete()
            r0.mkdir()
            return r0
    }

    public static java.io.File createTempFile(android.content.Context r1, java.lang.String r2) throws java.io.IOException {
            java.io.File r1 = r1.getCacheDir()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            java.io.File r1 = java.io.File.createTempFile(r2, r0, r1)
            return r1
    }

    public static java.lang.String escapeFileName(java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L18
            char r4 = r6.charAt(r2)
            boolean r4 = shouldEscapeCharacter(r4)
            if (r4 == 0) goto L15
            int r3 = r3 + 1
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            if (r3 != 0) goto L1b
            return r6
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r4 = r3 * 2
            int r4 = r4 + r0
            r2.<init>(r4)
        L23:
            if (r3 <= 0) goto L45
            int r4 = r1 + 1
            char r1 = r6.charAt(r1)
            boolean r5 = shouldEscapeCharacter(r1)
            if (r5 == 0) goto L40
            r5 = 37
            r2.append(r5)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r2.append(r1)
            int r3 = r3 + (-1)
            goto L43
        L40:
            r2.append(r1)
        L43:
            r1 = r4
            goto L23
        L45:
            if (r1 >= r0) goto L4a
            r2.append(r6, r1, r0)
        L4a:
            java.lang.String r6 = r2.toString()
            return r6
    }

    public static android.net.Uri fixSmoothStreamingIsmManifestUri(android.net.Uri r2) {
            java.lang.String r0 = r2.getPath()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.util.Util.ISM_PATH_PATTERN
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L20
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            if (r0 != 0) goto L20
            java.lang.String r0 = "Manifest"
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r2, r0)
        L20:
            return r2
    }

    public static java.lang.String formatInvariant(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    public static java.lang.String fromUtf8Bytes(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String fromUtf8Bytes(byte[] r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(21)
    public static int generateAudioSessionIdV21(android.content.Context r1) {
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            if (r1 != 0) goto Lc
            r1 = -1
            goto L10
        Lc:
            int r1 = r1.generateAudioSessionId()
        L10:
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAdaptiveMimeTypeForContentType(int r1) {
            if (r1 == 0) goto L10
            r0 = 1
            if (r1 == r0) goto Ld
            r0 = 2
            if (r1 == r0) goto La
            r1 = 0
            return r1
        La:
            java.lang.String r1 = "application/x-mpegURL"
            return r1
        Ld:
            java.lang.String r1 = "application/vnd.ms-sstr+xml"
            return r1
        L10:
            java.lang.String r1 = "application/dash+xml"
            return r1
    }

    public static int getAudioContentTypeForStreamType(int r3) {
            r0 = 1
            if (r3 == 0) goto L14
            r1 = 4
            if (r3 == r0) goto L13
            r0 = 2
            if (r3 == r0) goto L13
            if (r3 == r1) goto L13
            r2 = 5
            if (r3 == r2) goto L13
            r2 = 8
            if (r3 == r2) goto L13
            return r0
        L13:
            return r1
        L14:
            return r0
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    public static int getAudioTrackChannelConfig(int r1) {
            r0 = 12
            if (r1 == r0) goto L1e
            switch(r1) {
                case 1: goto L1c;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L12;
                case 6: goto Lf;
                case 7: goto Lc;
                case 8: goto L9;
                default: goto L7;
            }
        L7:
            r1 = 0
            return r1
        L9:
            r1 = 6396(0x18fc, float:8.963E-42)
            return r1
        Lc:
            r1 = 1276(0x4fc, float:1.788E-42)
            return r1
        Lf:
            r1 = 252(0xfc, float:3.53E-43)
            return r1
        L12:
            r1 = 220(0xdc, float:3.08E-43)
            return r1
        L15:
            r1 = 204(0xcc, float:2.86E-43)
            return r1
        L18:
            r1 = 28
            return r1
        L1b:
            return r0
        L1c:
            r1 = 4
            return r1
        L1e:
            r1 = 743676(0xb58fc, float:1.042112E-39)
            return r1
    }

    public static int getAudioUsageForStreamType(int r2) {
            r0 = 2
            if (r2 == 0) goto L1b
            r1 = 1
            if (r2 == r1) goto L18
            if (r2 == r0) goto L16
            r0 = 4
            if (r2 == r0) goto L15
            r0 = 5
            if (r2 == r0) goto L15
            r0 = 8
            if (r2 == r0) goto L13
            return r1
        L13:
            r2 = 3
            return r2
        L15:
            return r0
        L16:
            r2 = 6
            return r2
        L18:
            r2 = 13
            return r2
        L1b:
            return r0
    }

    public static com.google.android.exoplayer2.Player.Commands getAvailableCommands(com.google.android.exoplayer2.Player r10, com.google.android.exoplayer2.Player.Commands r11) {
            boolean r0 = r10.isPlayingAd()
            boolean r1 = r10.isCurrentMediaItemSeekable()
            boolean r2 = r10.hasPreviousMediaItem()
            boolean r3 = r10.hasNextMediaItem()
            boolean r4 = r10.isCurrentMediaItemLive()
            boolean r5 = r10.isCurrentMediaItemDynamic()
            com.google.android.exoplayer2.Timeline r10 = r10.getCurrentTimeline()
            boolean r10 = r10.isEmpty()
            com.google.android.exoplayer2.Player$Commands$Builder r6 = new com.google.android.exoplayer2.Player$Commands$Builder
            r6.<init>()
            com.google.android.exoplayer2.Player$Commands$Builder r11 = r6.addAll(r11)
            r6 = r0 ^ 1
            r7 = 4
            com.google.android.exoplayer2.Player$Commands$Builder r11 = r11.addIf(r7, r6)
            r6 = 5
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L39
            if (r0 != 0) goto L39
            r9 = 1
            goto L3a
        L39:
            r9 = 0
        L3a:
            com.google.android.exoplayer2.Player$Commands$Builder r11 = r11.addIf(r6, r9)
            r6 = 6
            if (r2 == 0) goto L45
            if (r0 != 0) goto L45
            r9 = 1
            goto L46
        L45:
            r9 = 0
        L46:
            com.google.android.exoplayer2.Player$Commands$Builder r11 = r11.addIf(r6, r9)
            r6 = 7
            if (r10 != 0) goto L57
            if (r2 != 0) goto L53
            if (r4 == 0) goto L53
            if (r1 == 0) goto L57
        L53:
            if (r0 != 0) goto L57
            r2 = 1
            goto L58
        L57:
            r2 = 0
        L58:
            com.google.android.exoplayer2.Player$Commands$Builder r11 = r11.addIf(r6, r2)
            r2 = 8
            if (r3 == 0) goto L64
            if (r0 != 0) goto L64
            r6 = 1
            goto L65
        L64:
            r6 = 0
        L65:
            com.google.android.exoplayer2.Player$Commands$Builder r11 = r11.addIf(r2, r6)
            r2 = 9
            if (r10 != 0) goto L77
            if (r3 != 0) goto L73
            if (r4 == 0) goto L77
            if (r5 == 0) goto L77
        L73:
            if (r0 != 0) goto L77
            r10 = 1
            goto L78
        L77:
            r10 = 0
        L78:
            com.google.android.exoplayer2.Player$Commands$Builder r10 = r11.addIf(r2, r10)
            r11 = 10
            r2 = r0 ^ 1
            com.google.android.exoplayer2.Player$Commands$Builder r10 = r10.addIf(r11, r2)
            r11 = 11
            if (r1 == 0) goto L8c
            if (r0 != 0) goto L8c
            r2 = 1
            goto L8d
        L8c:
            r2 = 0
        L8d:
            com.google.android.exoplayer2.Player$Commands$Builder r10 = r10.addIf(r11, r2)
            r11 = 12
            if (r1 == 0) goto L98
            if (r0 != 0) goto L98
            r7 = 1
        L98:
            com.google.android.exoplayer2.Player$Commands$Builder r10 = r10.addIf(r11, r7)
            com.google.android.exoplayer2.Player$Commands r10 = r10.build()
            return r10
    }

    public static int getBigEndianInt(java.nio.ByteBuffer r1, int r2) {
            int r2 = r1.getInt(r2)
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r0) goto Ld
            goto L11
        Ld:
            int r2 = java.lang.Integer.reverseBytes(r2)
        L11:
            return r2
    }

    public static byte[] getBytesFromHexString(java.lang.String r6) {
            int r0 = r6.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            int r3 = r2 * 2
            char r4 = r6.charAt(r3)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r6.charAt(r3)
            int r3 = java.lang.Character.digit(r3, r5)
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L2a:
            return r1
    }

    public static int getCodecCountOfType(@androidx.annotation.Nullable java.lang.String r4, int r5) {
            java.lang.String[] r4 = splitCodecs(r4)
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L7:
            if (r1 >= r0) goto L16
            r3 = r4[r1]
            int r3 = com.google.android.exoplayer2.util.MimeTypes.getTrackTypeOfCodec(r3)
            if (r5 != r3) goto L13
            int r2 = r2 + 1
        L13:
            int r1 = r1 + 1
            goto L7
        L16:
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String getCodecsOfType(@androidx.annotation.Nullable java.lang.String r6, int r7) {
            java.lang.String[] r6 = splitCodecs(r6)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r6.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L2b
            r4 = r6[r3]
            int r5 = com.google.android.exoplayer2.util.MimeTypes.getTrackTypeOfCodec(r4)
            if (r7 != r5) goto L28
            int r5 = r0.length()
            if (r5 <= 0) goto L25
            java.lang.String r5 = ","
            r0.append(r5)
        L25:
            r0.append(r4)
        L28:
            int r3 = r3 + 1
            goto L10
        L2b:
            int r6 = r0.length()
            if (r6 <= 0) goto L35
            java.lang.String r1 = r0.toString()
        L35:
            return r1
    }

    public static java.lang.String getCommaDelimitedSimpleClassNames(java.lang.Object[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.length
            if (r1 >= r2) goto L23
            r2 = r3[r1]
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            int r2 = r3.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L20
            java.lang.String r2 = ", "
            r0.append(r2)
        L20:
            int r1 = r1 + 1
            goto L6
        L23:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String getCountryCode(@androidx.annotation.Nullable android.content.Context r1) {
            if (r1 == 0) goto L1b
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.getNetworkCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1b
            java.lang.String r1 = com.google.common.base.Ascii.toUpperCase(r1)
            return r1
        L1b:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            java.lang.String r1 = com.google.common.base.Ascii.toUpperCase(r1)
            return r1
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 17
            if (r0 < r1) goto L16
            java.lang.String r0 = "display"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L16
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L2c
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
        L2c:
            android.graphics.Point r2 = getCurrentDisplayModeSize(r2, r0)
            return r2
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context r4, android.view.Display r5) {
            int r0 = r5.getDisplayId()
            if (r0 != 0) goto L8e
            boolean r0 = isTv(r4)
            if (r0 == 0) goto L8e
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1a
            java.lang.String r0 = "sys.display-size"
            java.lang.String r0 = getSystemProperty(r0)
            goto L21
        L1a:
            java.lang.String r0 = "vendor.display-size"
            java.lang.String r0 = getSystemProperty(r0)
        L21:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L64
            java.lang.String r1 = r0.trim()     // Catch: java.lang.NumberFormatException -> L4e
            java.lang.String r2 = "x"
            java.lang.String[] r1 = split(r1, r2)     // Catch: java.lang.NumberFormatException -> L4e
            int r2 = r1.length     // Catch: java.lang.NumberFormatException -> L4e
            r3 = 2
            if (r2 != r3) goto L4e
            r2 = 0
            r2 = r1[r2]     // Catch: java.lang.NumberFormatException -> L4e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L4e
            r3 = 1
            r1 = r1[r3]     // Catch: java.lang.NumberFormatException -> L4e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L4e
            if (r2 <= 0) goto L4e
            if (r1 <= 0) goto L4e
            android.graphics.Point r3 = new android.graphics.Point     // Catch: java.lang.NumberFormatException -> L4e
            r3.<init>(r2, r1)     // Catch: java.lang.NumberFormatException -> L4e
            return r3
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid display size: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Util"
            com.google.android.exoplayer2.util.Log.e(r1, r0)
        L64:
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MANUFACTURER
            java.lang.String r1 = "Sony"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8e
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.MODEL
            java.lang.String r1 = "BRAVIA"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L8e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r4 = r4.hasSystemFeature(r0)
            if (r4 == 0) goto L8e
            android.graphics.Point r4 = new android.graphics.Point
            r5 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r4.<init>(r5, r0)
            return r4
        L8e:
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9d
            getDisplaySizeV23(r5, r4)
            goto La8
        L9d:
            r1 = 17
            if (r0 < r1) goto La5
            getDisplaySizeV17(r5, r4)
            goto La8
        La5:
            getDisplaySizeV16(r5, r4)
        La8:
            return r4
    }

    public static android.os.Looper getCurrentOrMainLooper() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L7
            goto Lb
        L7:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        Lb:
            return r0
    }

    public static android.net.Uri getDataUriForString(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "data:"
            java.lang.String r1 = ";base64,"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r0, r2, r1)
            byte[] r3 = r3.getBytes()
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    public static java.util.Locale getDefaultDisplayLocale() {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 24
            if (r0 < r1) goto Ld
            java.util.Locale$Category r0 = java.util.Locale.Category.DISPLAY
            java.util.Locale r0 = java.util.Locale.getDefault(r0)
            goto L11
        Ld:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L11:
            return r0
    }

    private static void getDisplaySizeV16(android.view.Display r0, android.graphics.Point r1) {
            r0.getSize(r1)
            return
    }

    @androidx.annotation.RequiresApi(17)
    private static void getDisplaySizeV17(android.view.Display r0, android.graphics.Point r1) {
            r0.getRealSize(r1)
            return
    }

    @androidx.annotation.RequiresApi(23)
    private static void getDisplaySizeV23(android.view.Display r1, android.graphics.Point r2) {
            android.view.Display$Mode r1 = r1.getMode()
            int r0 = r1.getPhysicalWidth()
            r2.x = r0
            int r1 = r1.getPhysicalHeight()
            r2.y = r1
            return
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r2, android.content.res.Resources r3, @androidx.annotation.DrawableRes int r4) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r2 = com.google.android.exoplayer2.util.Util.Api21.getDrawable(r2, r3, r4)
            goto Lf
        Lb:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r4)
        Lf:
            return r2
    }

    @androidx.annotation.Nullable
    public static java.util.UUID getDrmUuid(java.lang.String r3) {
            java.lang.String r0 = com.google.common.base.Ascii.toLowerCase(r3)
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1860423953: goto L27;
                case -1400551171: goto L1b;
                case 790309106: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L31
        L10:
            java.lang.String r1 = "clearkey"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19
            goto L31
        L19:
            r2 = 2
            goto L31
        L1b:
            java.lang.String r1 = "widevine"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            goto L31
        L25:
            r2 = 1
            goto L31
        L27:
            java.lang.String r1 = "playready"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L31
        L30:
            r2 = 0
        L31:
            switch(r2) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                default: goto L34;
            }
        L34:
            java.util.UUID r3 = java.util.UUID.fromString(r3)     // Catch: java.lang.RuntimeException -> L39
            return r3
        L39:
            r3 = 0
            return r3
        L3b:
            java.util.UUID r3 = com.google.android.exoplayer2.C.CLEARKEY_UUID
            return r3
        L3e:
            java.util.UUID r3 = com.google.android.exoplayer2.C.WIDEVINE_UUID
            return r3
        L41:
            java.util.UUID r3 = com.google.android.exoplayer2.C.PLAYREADY_UUID
            return r3
    }

    public static int getErrorCodeForMediaDrmErrorCode(int r1) {
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 4
            if (r1 == r0) goto L23
            r0 = 10
            if (r1 == r0) goto L20
            r0 = 7
            if (r1 == r0) goto L23
            r0 = 8
            if (r1 == r0) goto L1d
            switch(r1) {
                case 15: goto L1d;
                case 16: goto L23;
                case 17: goto L20;
                case 18: goto L23;
                case 19: goto L20;
                case 20: goto L20;
                case 21: goto L20;
                case 22: goto L20;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 24: goto L1a;
                case 25: goto L1a;
                case 26: goto L1a;
                case 27: goto L1a;
                case 28: goto L1a;
                default: goto L17;
            }
        L17:
            r1 = 6006(0x1776, float:8.416E-42)
            return r1
        L1a:
            r1 = 6002(0x1772, float:8.41E-42)
            return r1
        L1d:
            r1 = 6003(0x1773, float:8.412E-42)
            return r1
        L20:
            r1 = 6004(0x1774, float:8.413E-42)
            return r1
        L23:
            r1 = 6005(0x1775, float:8.415E-42)
            return r1
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(@androidx.annotation.Nullable java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "_"
            java.lang.String[] r5 = split(r5, r1)
            int r1 = r5.length
            r2 = 2
            if (r1 >= r2) goto Lf
            return r0
        Lf:
            int r3 = r1 + (-1)
            r3 = r5[r3]
            r4 = 3
            if (r1 < r4) goto L23
            int r1 = r1 - r2
            r5 = r5[r1]
            java.lang.String r1 = "neg"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)     // Catch: java.lang.NumberFormatException -> L31
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L31
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L31
            if (r5 == 0) goto L31
            int r0 = -r0
        L31:
            return r0
    }

    public static java.lang.String getFormatSupportString(int r1) {
            if (r1 == 0) goto L20
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L17
            r0 = 4
            if (r1 != r0) goto L11
            java.lang.String r1 = "YES"
            return r1
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L17:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            return r1
        L1a:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            return r1
        L1d:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            return r1
        L20:
            java.lang.String r1 = "NO"
            return r1
    }

    public static int getIntegerCodeForString(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
            r2 = 4
            if (r0 > r2) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            r2 = 0
        Lf:
            if (r1 >= r0) goto L1b
            int r2 = r2 << 8
            char r3 = r4.charAt(r1)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto Lf
        L1b:
            return r2
    }

    public static java.lang.String getLocaleLanguageTag(java.util.Locale r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            java.lang.String r2 = getLocaleLanguageTagV21(r2)
            goto Lf
        Lb:
            java.lang.String r2 = r2.toString()
        Lf:
            return r2
    }

    @androidx.annotation.RequiresApi(21)
    private static java.lang.String getLocaleLanguageTagV21(java.util.Locale r0) {
            java.lang.String r0 = r0.toLanguageTag()
            return r0
    }

    public static long getMediaDurationForPlayoutDuration(long r2, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r2
        L7:
            double r2 = (double) r2
            double r0 = (double) r4
            double r2 = r2 * r0
            long r2 = java.lang.Math.round(r2)
            return r2
    }

    public static long getNowUnixTimeMs(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            long r3 = java.lang.System.currentTimeMillis()
            goto L13
        Le:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 + r0
        L13:
            return r3
    }

    public static int getPcmEncoding(int r1) {
            r0 = 8
            if (r1 == r0) goto L1a
            r0 = 16
            if (r1 == r0) goto L18
            r0 = 24
            if (r1 == r0) goto L15
            r0 = 32
            if (r1 == r0) goto L12
            r1 = 0
            return r1
        L12:
            r1 = 805306368(0x30000000, float:4.656613E-10)
            return r1
        L15:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            return r1
        L18:
            r1 = 2
            return r1
        L1a:
            r1 = 3
            return r1
    }

    public static com.google.android.exoplayer2.Format getPcmFormat(int r2, int r3, int r4) {
            com.google.android.exoplayer2.Format$Builder r0 = new com.google.android.exoplayer2.Format$Builder
            r0.<init>()
            java.lang.String r1 = "audio/raw"
            com.google.android.exoplayer2.Format$Builder r0 = r0.setSampleMimeType(r1)
            com.google.android.exoplayer2.Format$Builder r3 = r0.setChannelCount(r3)
            com.google.android.exoplayer2.Format$Builder r3 = r3.setSampleRate(r4)
            com.google.android.exoplayer2.Format$Builder r2 = r3.setPcmEncoding(r2)
            com.google.android.exoplayer2.Format r2 = r2.build()
            return r2
    }

    public static int getPcmFrameSize(int r4, int r5) {
            r0 = 2
            if (r4 == r0) goto L22
            r1 = 3
            if (r4 == r1) goto L21
            r2 = 4
            if (r4 == r2) goto L1f
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 == r3) goto L22
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 == r0) goto L1c
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 != r0) goto L16
            goto L1f
        L16:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L1c:
            int r5 = r5 * 3
            return r5
        L1f:
            int r5 = r5 * 4
        L21:
            return r5
        L22:
            int r5 = r5 * 2
            return r5
    }

    public static long getPlayoutDurationForMediaDuration(long r2, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r2
        L7:
            double r2 = (double) r2
            double r0 = (double) r4
            double r2 = r2 / r0
            long r2 = java.lang.Math.round(r2)
            return r2
    }

    public static int getStreamTypeForAudioUsage(int r1) {
            r0 = 13
            if (r1 == r0) goto L14
            switch(r1) {
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Ld;
                case 5: goto Lb;
                case 6: goto L9;
                case 7: goto Lb;
                case 8: goto Lb;
                case 9: goto Lb;
                case 10: goto Lb;
                default: goto L7;
            }
        L7:
            r1 = 3
            return r1
        L9:
            r1 = 2
            return r1
        Lb:
            r1 = 5
            return r1
        Ld:
            r1 = 4
            return r1
        Lf:
            r1 = 8
            return r1
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static java.lang.String getStringForTime(java.lang.StringBuilder r11, java.util.Formatter r12, long r13) {
            r0 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r13 = r0
        Lc:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L13
            java.lang.String r2 = "-"
            goto L15
        L13:
            java.lang.String r2 = ""
        L15:
            long r13 = java.lang.Math.abs(r13)
            r3 = 500(0x1f4, double:2.47E-321)
            long r13 = r13 + r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r3
            r3 = 60
            long r5 = r13 % r3
            long r7 = r13 / r3
            long r7 = r7 % r3
            r3 = 3600(0xe10, double:1.7786E-320)
            long r13 = r13 / r3
            r3 = 0
            r11.setLength(r3)
            r11 = 2
            r4 = 1
            r9 = 3
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 <= 0) goto L56
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r2
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r0[r4] = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            r0[r11] = r13
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r0[r9] = r11
            java.lang.String r11 = "%s%d:%02d:%02d"
            java.util.Formatter r11 = r12.format(r11, r0)
            java.lang.String r11 = r11.toString()
            goto L70
        L56:
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r3] = r2
            java.lang.Long r14 = java.lang.Long.valueOf(r7)
            r13[r4] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            r13[r11] = r14
            java.lang.String r11 = "%s%02d:%02d"
            java.util.Formatter r11 = r12.format(r11, r13)
            java.lang.String r11 = r11.toString()
        L70:
            return r11
    }

    public static java.lang.String[] getSystemLanguageCodes() {
            java.lang.String[] r0 = getSystemLocales()
            r1 = 0
        L5:
            int r2 = r0.length
            if (r1 >= r2) goto L13
            r2 = r0[r1]
            java.lang.String r2 = normalizeLanguageCode(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5
        L13:
            return r0
    }

    private static java.lang.String[] getSystemLocales() {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 24
            if (r1 < r2) goto L13
            java.lang.String[] r0 = getSystemLocalesV24(r0)
            goto L20
        L13:
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = getLocaleLanguageTag(r0)
            r1[r2] = r0
            r0 = r1
        L20:
            return r0
    }

    @androidx.annotation.RequiresApi(24)
    private static java.lang.String[] getSystemLocalesV24(android.content.res.Configuration r1) {
            android.os.LocaleList r1 = r1.getLocales()
            java.lang.String r1 = r1.toLanguageTags()
            java.lang.String r0 = ","
            java.lang.String[] r1 = split(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    private static java.lang.String getSystemProperty(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r2[r5] = r6     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1f
            return r0
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read system property "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "Util"
            com.google.android.exoplayer2.util.Log.e(r1, r6, r0)
            r6 = 0
            return r6
    }

    public static java.lang.String getTrackTypeString(int r2) {
            switch(r2) {
                case -2: goto L2b;
                case -1: goto L27;
                case 0: goto L24;
                case 1: goto L21;
                case 2: goto L1d;
                case 3: goto L19;
                case 4: goto L16;
                case 5: goto L13;
                case 6: goto L10;
                default: goto L3;
            }
        L3:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r2 < r0) goto L2e
            java.lang.String r0 = "custom ("
            java.lang.String r1 = ")"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1)
            goto L30
        L10:
            java.lang.String r2 = "camera motion"
            return r2
        L13:
            java.lang.String r2 = "metadata"
            return r2
        L16:
            java.lang.String r2 = "image"
            return r2
        L19:
            java.lang.String r2 = "text"
            return r2
        L1d:
            java.lang.String r2 = "video"
            return r2
        L21:
            java.lang.String r2 = "audio"
            return r2
        L24:
            java.lang.String r2 = "default"
            return r2
        L27:
            java.lang.String r2 = "unknown"
            return r2
        L2b:
            java.lang.String r2 = "none"
            return r2
        L2e:
            java.lang.String r2 = "?"
        L30:
            return r2
    }

    public static java.lang.String getUserAgent(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r2 = r2.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            goto L12
        L10:
            java.lang.String r2 = "?"
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "/"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " (Linux;Android "
            r0.append(r2)
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = ") "
            java.lang.String r1 = "ExoPlayerLib/2.18.6"
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r3, r1)
            return r2
    }

    public static byte[] getUtf8Bytes(java.lang.String r1) {
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    public static byte[] gzip(byte[] r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L1f
            r1.<init>(r0)     // Catch: java.io.IOException -> L1f
            r1.write(r2)     // Catch: java.lang.Throwable -> L15
            r1.close()     // Catch: java.io.IOException -> L1f
            byte[] r2 = r0.toByteArray()
            return r2
        L15:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L1f
        L1e:
            throw r2     // Catch: java.io.IOException -> L1f
        L1f:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    public static int inferContentType(android.net.Uri r4) {
            java.lang.String r0 = r4.getScheme()
            if (r0 == 0) goto L11
            java.lang.String r1 = "rtsp"
            boolean r0 = com.google.common.base.Ascii.equalsIgnoreCase(r1, r0)
            if (r0 == 0) goto L11
            r4 = 3
            return r4
        L11:
            java.lang.String r0 = r4.getLastPathSegment()
            r1 = 4
            if (r0 != 0) goto L19
            return r1
        L19:
            r2 = 46
            int r2 = r0.lastIndexOf(r2)
            r3 = 1
            if (r2 < 0) goto L2e
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r2)
            int r0 = inferContentTypeForExtension(r0)
            if (r0 == r1) goto L2e
            return r0
        L2e:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.util.Util.ISM_PATH_PATTERN
            java.lang.String r4 = r4.getPath()
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.util.regex.Matcher r4 = r0.matcher(r4)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L5f
            r0 = 2
            java.lang.String r4 = r4.group(r0)
            if (r4 == 0) goto L5e
            java.lang.String r1 = "format=mpd-time-csf"
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L55
            r4 = 0
            return r4
        L55:
            java.lang.String r1 = "format=m3u8-aapl"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L5e
            return r0
        L5e:
            return r3
        L5f:
            return r1
    }

    @java.lang.Deprecated
    public static int inferContentType(android.net.Uri r1, @androidx.annotation.Nullable java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            int r1 = inferContentType(r1)
            goto Lf
        Lb:
            int r1 = inferContentTypeForExtension(r2)
        Lf:
            return r1
    }

    @java.lang.Deprecated
    public static int inferContentType(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file:///"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            int r2 = inferContentType(r2)
            return r2
    }

    public static int inferContentTypeForExtension(java.lang.String r5) {
            java.lang.String r5 = com.google.common.base.Ascii.toLowerCase(r5)
            java.util.Objects.requireNonNull(r5)
            int r0 = r5.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r0) {
                case 104579: goto L34;
                case 108321: goto L29;
                case 3242057: goto L1e;
                case 3299913: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r0 = "m3u8"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L1c
            goto L3e
        L1c:
            r4 = 3
            goto L3e
        L1e:
            java.lang.String r0 = "isml"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L27
            goto L3e
        L27:
            r4 = 2
            goto L3e
        L29:
            java.lang.String r0 = "mpd"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L32
            goto L3e
        L32:
            r4 = 1
            goto L3e
        L34:
            java.lang.String r0 = "ism"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            switch(r4) {
                case 0: goto L45;
                case 1: goto L44;
                case 2: goto L45;
                case 3: goto L43;
                default: goto L41;
            }
        L41:
            r5 = 4
            return r5
        L43:
            return r1
        L44:
            return r3
        L45:
            return r2
    }

    public static int inferContentTypeForUriAndMimeType(android.net.Uri r5, @androidx.annotation.Nullable java.lang.String r6) {
            if (r6 != 0) goto L7
            int r5 = inferContentType(r5)
            return r5
        L7:
            r5 = -1
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r0) {
                case -979127466: goto L35;
                case -156749520: goto L2a;
                case 64194685: goto L1f;
                case 1154777587: goto L14;
                default: goto L13;
            }
        L13:
            goto L3f
        L14:
            java.lang.String r0 = "application/x-rtsp"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L1d
            goto L3f
        L1d:
            r5 = 3
            goto L3f
        L1f:
            java.lang.String r0 = "application/dash+xml"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L28
            goto L3f
        L28:
            r5 = 2
            goto L3f
        L2a:
            java.lang.String r0 = "application/vnd.ms-sstr+xml"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L33
            goto L3f
        L33:
            r5 = 1
            goto L3f
        L35:
            java.lang.String r0 = "application/x-mpegURL"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3e
            goto L3f
        L3e:
            r5 = 0
        L3f:
            switch(r5) {
                case 0: goto L47;
                case 1: goto L46;
                case 2: goto L45;
                case 3: goto L44;
                default: goto L42;
            }
        L42:
            r5 = 4
            return r5
        L44:
            return r1
        L45:
            return r4
        L46:
            return r3
        L47:
            return r2
    }

    public static boolean inflate(com.google.android.exoplayer2.util.ParsableByteArray r3, com.google.android.exoplayer2.util.ParsableByteArray r4, @androidx.annotation.Nullable java.util.zip.Inflater r5) {
            int r0 = r3.bytesLeft()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.capacity()
            int r2 = r3.bytesLeft()
            if (r0 >= r2) goto L1b
            int r0 = r3.bytesLeft()
            int r0 = r0 * 2
            r4.ensureCapacity(r0)
        L1b:
            if (r5 != 0) goto L22
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L22:
            byte[] r0 = r3.getData()
            int r2 = r3.getPosition()
            int r3 = r3.bytesLeft()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L32:
            byte[] r0 = r4.getData()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            int r2 = r4.capacity()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            if (r0 == 0) goto L4e
            r4.setLimit(r3)     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            r3 = 1
            r5.reset()
            return r3
        L4e:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            if (r0 == 0) goto L5b
            goto L6b
        L5b:
            int r0 = r4.capacity()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            if (r3 != r0) goto L32
            int r0 = r4.capacity()     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            int r0 = r0 * 2
            r4.ensureCapacity(r0)     // Catch: java.lang.Throwable -> L6f java.util.zip.DataFormatException -> L74
            goto L32
        L6b:
            r5.reset()
            return r1
        L6f:
            r3 = move-exception
            r5.reset()
            throw r3
        L74:
            r5.reset()
            return r1
    }

    public static java.lang.String intToStringMaxRadix(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    public static boolean isAutomotive(android.content.Context r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L14
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public static boolean isEncodingHighResolutionPcm(int r1) {
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto Le
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto Le
            r0 = 4
            if (r1 != r0) goto Lc
            goto Le
        Lc:
            r1 = 0
            goto Lf
        Le:
            r1 = 1
        Lf:
            return r1
    }

    public static boolean isEncodingLinearPcm(int r1) {
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L18
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r1 == r0) goto L18
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L18
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 != r0) goto L16
            goto L18
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            return r1
    }

    public static boolean isLinebreak(int r1) {
            r0 = 10
            if (r1 == r0) goto Lb
            r0 = 13
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    public static boolean isLocalFileUri(android.net.Uri r1) {
            java.lang.String r1 = r1.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = "file"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            goto L16
        L15:
            r1 = 1
        L16:
            return r1
    }

    private static boolean isMediaStoreExternalContentUri(android.net.Uri r3) {
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L3c
            java.lang.String r0 = r3.getAuthority()
            java.lang.String r2 = "media"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            goto L3c
        L1a:
            java.util.List r3 = r3.getPathSegments()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L25
            return r1
        L25:
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "external"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "external_primary"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L3c
        L3b:
            r1 = 1
        L3c:
            return r1
    }

    @androidx.annotation.RequiresApi(api = 24)
    private static boolean isTrafficRestricted(android.net.Uri r2) {
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "http"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L22
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r2 = r2.getHost()
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r0.isCleartextTrafficPermitted(r2)
            if (r2 != 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            return r2
    }

    public static boolean isTv(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            if (r1 == 0) goto L18
            int r1 = r1.getCurrentModeType()
            r0 = 4
            if (r1 != r0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    private static /* synthetic */ java.lang.Thread lambda$newSingleThreadExecutor$3(java.lang.String r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r2, r1)
            return r0
    }

    private static /* synthetic */ void lambda$postOrRunWithCompletion$0(com.google.common.util.concurrent.SettableFuture r1, java.lang.Runnable r2, java.lang.Object r3) {
            boolean r0 = r1.isCancelled()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L7
            return
        L7:
            r2.run()     // Catch: java.lang.Throwable -> Le
            r1.set(r3)     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r2 = move-exception
            r1.setException(r2)
        L12:
            return
    }

    private static /* synthetic */ void lambda$transformFutureAsync$1(com.google.common.util.concurrent.SettableFuture r0, com.google.common.util.concurrent.ListenableFuture r1) {
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto La
            r0 = 0
            r1.cancel(r0)
        La:
            return
    }

    private static /* synthetic */ void lambda$transformFutureAsync$2(com.google.common.util.concurrent.ListenableFuture r0, com.google.common.util.concurrent.SettableFuture r1, com.google.common.util.concurrent.AsyncFunction r2) {
            java.lang.Object r0 = com.google.common.util.concurrent.Futures.getDone(r0)     // Catch: java.lang.Error -> L11 java.lang.RuntimeException -> L13 java.util.concurrent.ExecutionException -> L18 java.util.concurrent.CancellationException -> L25
            com.google.common.util.concurrent.ListenableFuture r0 = r2.apply(r0)     // Catch: java.lang.Throwable -> Lc
            r1.setFuture(r0)     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r0 = move-exception
            r1.setException(r0)
        L10:
            return
        L11:
            r0 = move-exception
            goto L14
        L13:
            r0 = move-exception
        L14:
            r1.setException(r0)
            return
        L18:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()
            if (r2 != 0) goto L20
            goto L21
        L20:
            r0 = r2
        L21:
            r1.setException(r0)
            return
        L25:
            r0 = 0
            r1.cancel(r0)
            return
    }

    public static int linearSearch(int[] r2, int r3) {
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto Lc
            r1 = r2[r0]
            if (r1 != r3) goto L9
            return r0
        L9:
            int r0 = r0 + 1
            goto L1
        Lc:
            r2 = -1
            return r2
    }

    public static int linearSearch(long[] r4, long r5) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto Le
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto Lb
            return r0
        Lb:
            int r0 = r0 + 1
            goto L1
        Le:
            r4 = -1
            return r4
    }

    @androidx.annotation.RequiresApi(18)
    public static long maxValue(android.util.SparseLongArray r5) {
            int r0 = r5.size()
            if (r0 == 0) goto L1b
            r0 = -9223372036854775808
            r2 = 0
        L9:
            int r3 = r5.size()
            if (r2 >= r3) goto L1a
            long r3 = r5.valueAt(r2)
            long r0 = java.lang.Math.max(r0, r3)
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
        L1b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    private static java.lang.String maybeReplaceLegacyLanguageTags(java.lang.String r4) {
            r0 = 0
        L1:
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.isoLegacyTagReplacements
            int r2 = r1.length
            if (r0 >= r2) goto L2f
            r2 = r1[r0]
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0 + 1
            r3 = r1[r3]
            r2.append(r3)
            r0 = r1[r0]
            int r0 = r0.length()
            java.lang.String r4 = r4.substring(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
        L2c:
            int r0 = r0 + 2
            goto L1
        L2f:
            return r4
    }

    private static boolean maybeRequestReadExternalStoragePermission(android.app.Activity r2, android.net.Uri r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1a
            boolean r0 = isLocalFileUri(r3)
            if (r0 != 0) goto L12
            boolean r3 = isMediaStoreExternalContentUri(r3)
            if (r3 == 0) goto L1a
        L12:
            boolean r2 = requestExternalStoragePermission(r2)
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity r4, android.net.Uri... r5) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto L8
            return r1
        L8:
            int r0 = r5.length
            r2 = 0
        La:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            boolean r3 = maybeRequestReadExternalStoragePermission(r4, r3)
            if (r3 == 0) goto L16
            r4 = 1
            return r4
        L16:
            int r2 = r2 + 1
            goto La
        L19:
            return r1
    }

    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity r7, com.google.android.exoplayer2.MediaItem... r8) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto L8
            return r1
        L8:
            int r0 = r8.length
            r2 = 0
        La:
            if (r2 >= r0) goto L3d
            r3 = r8[r2]
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r4 = r3.localConfiguration
            if (r4 != 0) goto L13
            goto L3a
        L13:
            android.net.Uri r4 = r4.uri
            boolean r4 = maybeRequestReadExternalStoragePermission(r7, r4)
            r5 = 1
            if (r4 == 0) goto L1d
            return r5
        L1d:
            com.google.android.exoplayer2.MediaItem$LocalConfiguration r3 = r3.localConfiguration
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r3 = r3.subtitleConfigurations
            r4 = 0
        L22:
            int r6 = r3.size()
            if (r4 >= r6) goto L3a
            java.lang.Object r6 = r3.get(r4)
            com.google.android.exoplayer2.MediaItem$SubtitleConfiguration r6 = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) r6
            android.net.Uri r6 = r6.uri
            boolean r6 = maybeRequestReadExternalStoragePermission(r7, r6)
            if (r6 == 0) goto L37
            return r5
        L37:
            int r4 = r4 + 1
            goto L22
        L3a:
            int r2 = r2 + 1
            goto La
        L3d:
            return r1
    }

    @androidx.annotation.RequiresApi(18)
    public static long minValue(android.util.SparseLongArray r5) {
            int r0 = r5.size()
            if (r0 == 0) goto L1e
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
        Lc:
            int r3 = r5.size()
            if (r2 >= r3) goto L1d
            long r3 = r5.valueAt(r2)
            long r0 = java.lang.Math.min(r0, r3)
            int r2 = r2 + 1
            goto Lc
        L1d:
            return r0
        L1e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            r5.<init>()
            throw r5
    }

    public static <T> void moveItems(java.util.List<T> r2, int r3, int r4, int r5) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            int r4 = r4 - r3
            int r4 = r4 + (-1)
        L8:
            if (r4 < 0) goto L16
            int r1 = r3 + r4
            java.lang.Object r1 = r2.remove(r1)
            r0.addFirst(r1)
            int r4 = r4 + (-1)
            goto L8
        L16:
            int r3 = r2.size()
            int r3 = java.lang.Math.min(r5, r3)
            r2.addAll(r3, r0)
            return
    }

    public static long msToUs(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L14
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L14
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
        L14:
            return r3
    }

    public static java.util.concurrent.ExecutorService newSingleThreadExecutor(java.lang.String r1) {
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda2 r0 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda2
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            return r1
    }

    public static java.lang.String normalizeLanguageCode(java.lang.String r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 95
            r1 = 45
            java.lang.String r0 = r3.replace(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1d
            java.lang.String r1 = "und"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r3 = r0
        L1d:
            java.lang.String r3 = com.google.common.base.Ascii.toLowerCase(r3)
            java.lang.String r0 = "-"
            java.lang.String[] r0 = splitAtFirst(r3, r0)
            r1 = 0
            r0 = r0[r1]
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.google.android.exoplayer2.util.Util.languageTagReplacementMap
            if (r1 != 0) goto L34
            java.util.HashMap r1 = createIsoLanguageReplacementMap()
            com.google.android.exoplayer2.util.Util.languageTagReplacementMap = r1
        L34:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.google.android.exoplayer2.util.Util.languageTagReplacementMap
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0 = r1
        L52:
            java.lang.String r1 = "no"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "i"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "zh"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
        L6b:
            java.lang.String r3 = maybeReplaceLegacyLanguageTags(r3)
        L6f:
            return r3
    }

    public static <T> T[] nullSafeArrayAppend(T[] r1, T r2) {
            int r0 = r1.length
            int r0 = r0 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            int r1 = r1.length
            r0[r1] = r2
            java.lang.Object[] r1 = castNonNullTypeArray(r0)
            return r1
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] r3, T[] r4) {
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static <T> T[] nullSafeArrayCopy(T[] r1, int r2) {
            int r0 = r1.length
            if (r2 > r0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            return r1
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] r3, int r4, int r5) {
            r0 = 1
            r1 = 0
            if (r4 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            int r2 = r3.length
            if (r5 > r2) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r3, r4, r5)
            return r3
    }

    public static <T> void nullSafeListToArray(java.util.List<T> r2, T[] r3) {
            int r0 = r2.size()
            int r1 = r3.length
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            r2.toArray(r3)
            return
    }

    public static long parseXsDateTime(java.lang.String r10) throws com.google.android.exoplayer2.ParserException {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.util.Util.XS_DATE_TIME_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r1 = r0.matches()
            if (r1 == 0) goto Ld2
            r10 = 9
            java.lang.String r1 = r0.group(r10)
            r2 = 0
            if (r1 != 0) goto L16
            goto L4b
        L16:
            java.lang.String r10 = r0.group(r10)
            java.lang.String r1 = "Z"
            boolean r10 = r10.equalsIgnoreCase(r1)
            if (r10 == 0) goto L23
            goto L4b
        L23:
            r10 = 12
            java.lang.String r10 = r0.group(r10)
            int r10 = java.lang.Integer.parseInt(r10)
            int r10 = r10 * 60
            r1 = 13
            java.lang.String r1 = r0.group(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            int r2 = r1 + r10
            r10 = 11
            java.lang.String r10 = r0.group(r10)
            java.lang.String r1 = "-"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L4b
            int r2 = r2 * (-1)
        L4b:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r10.<init>(r1)
            r10.clear()
            r1 = 1
            java.lang.String r1 = r0.group(r1)
            int r4 = java.lang.Integer.parseInt(r1)
            r1 = 2
            java.lang.String r1 = r0.group(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            int r5 = r1 + (-1)
            r1 = 3
            java.lang.String r3 = r0.group(r1)
            int r6 = java.lang.Integer.parseInt(r3)
            r3 = 4
            java.lang.String r3 = r0.group(r3)
            int r7 = java.lang.Integer.parseInt(r3)
            r3 = 5
            java.lang.String r3 = r0.group(r3)
            int r8 = java.lang.Integer.parseInt(r3)
            r3 = 6
            java.lang.String r3 = r0.group(r3)
            int r9 = java.lang.Integer.parseInt(r3)
            r3 = r10
            r3.set(r4, r5, r6, r7, r8, r9)
            r3 = 8
            java.lang.String r4 = r0.group(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lc4
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.lang.String r5 = "0."
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r0 = r0.group(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            r0 = 14
            java.math.BigDecimal r1 = r4.movePointRight(r1)
            int r1 = r1.intValue()
            r10.set(r0, r1)
        Lc4:
            long r0 = r10.getTimeInMillis()
            if (r2 == 0) goto Ld1
            long r2 = (long) r2
            r4 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r4
            long r0 = r0 - r2
        Ld1:
            return r0
        Ld2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid date/time format: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r0 = 0
            com.google.android.exoplayer2.ParserException r10 = com.google.android.exoplayer2.ParserException.createForMalformedContainer(r10, r0)
            throw r10
    }

    public static long parseXsDuration(java.lang.String r14) {
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.util.Util.XS_DURATION_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r4 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            if (r1 == 0) goto L98
            r14 = 1
            java.lang.String r1 = r0.group(r14)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r14 = r14 ^ r1
            r1 = 3
            java.lang.String r1 = r0.group(r1)
            r6 = 0
            if (r1 == 0) goto L35
            double r8 = java.lang.Double.parseDouble(r1)
            r10 = 4719236203218468864(0x417e1852c0000000, double:3.1556908E7)
            double r8 = r8 * r10
            goto L36
        L35:
            r8 = r6
        L36:
            r1 = 5
            java.lang.String r1 = r0.group(r1)
            if (r1 == 0) goto L49
            double r10 = java.lang.Double.parseDouble(r1)
            r12 = 4702901732848435200(0x4144103580000000, double:2629739.0)
            double r10 = r10 * r12
            goto L4a
        L49:
            r10 = r6
        L4a:
            double r8 = r8 + r10
            r1 = 7
            java.lang.String r1 = r0.group(r1)
            if (r1 == 0) goto L5e
            double r10 = java.lang.Double.parseDouble(r1)
            r12 = 4680673776000565248(0x40f5180000000000, double:86400.0)
            double r10 = r10 * r12
            goto L5f
        L5e:
            r10 = r6
        L5f:
            double r8 = r8 + r10
            r1 = 10
            java.lang.String r1 = r0.group(r1)
            if (r1 == 0) goto L6f
            double r10 = java.lang.Double.parseDouble(r1)
            double r10 = r10 * r4
            goto L70
        L6f:
            r10 = r6
        L70:
            double r8 = r8 + r10
            r1 = 12
            java.lang.String r1 = r0.group(r1)
            if (r1 == 0) goto L82
            double r4 = java.lang.Double.parseDouble(r1)
            r10 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r4 = r4 * r10
            goto L83
        L82:
            r4 = r6
        L83:
            double r8 = r8 + r4
            r1 = 14
            java.lang.String r0 = r0.group(r1)
            if (r0 == 0) goto L90
            double r6 = java.lang.Double.parseDouble(r0)
        L90:
            double r8 = r8 + r6
            double r8 = r8 * r2
            long r0 = (long) r8
            if (r14 == 0) goto L97
            long r0 = -r0
        L97:
            return r0
        L98:
            double r0 = java.lang.Double.parseDouble(r14)
            double r0 = r0 * r4
            double r0 = r0 * r2
            long r0 = (long) r0
            return r0
    }

    public static boolean postOrRun(android.os.Handler r2, java.lang.Runnable r3) {
            android.os.Looper r0 = r2.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L10
            r2 = 0
            return r2
        L10:
            android.os.Looper r0 = r2.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L1f
            r3.run()
            r2 = 1
            return r2
        L1f:
            boolean r2 = r2.post(r3)
            return r2
    }

    public static <T> com.google.common.util.concurrent.ListenableFuture<T> postOrRunWithCompletion(android.os.Handler r2, java.lang.Runnable r3, T r4) {
            com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1
            r1.<init>(r0, r3, r4)
            postOrRun(r2, r1)
            return r0
    }

    public static boolean readBoolean(android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void recursiveDelete(java.io.File r4) {
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            recursiveDelete(r3)
            int r2 = r2 + 1
            goto L8
        L12:
            r4.delete()
            return
    }

    @androidx.annotation.Nullable
    public static android.content.Intent registerReceiverNotExported(android.content.Context r2, @androidx.annotation.Nullable android.content.BroadcastReceiver r3, android.content.IntentFilter r4) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 33
            if (r0 >= r1) goto Lb
            android.content.Intent r2 = r2.registerReceiver(r3, r4)
            return r2
        Lb:
            r0 = 4
            android.content.Intent r2 = r2.registerReceiver(r3, r4, r0)
            return r2
    }

    public static <T> void removeRange(java.util.List<T> r1, int r2, int r3) {
            if (r2 < 0) goto L14
            int r0 = r1.size()
            if (r3 > r0) goto L14
            if (r2 > r3) goto L14
            if (r2 == r3) goto L13
            java.util.List r1 = r1.subList(r2, r3)
            r1.clear()
        L13:
            return
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    @androidx.annotation.RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(android.app.Activity r3) {
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            int r1 = r3.checkSelfPermission(r0)
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r3.requestPermissions(r0, r2)
            r3 = 1
            return r3
        L12:
            return r2
    }

    public static long scaleLargeTimestamp(long r6, long r8, long r10) {
            r0 = 0
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 < 0) goto Lf
            long r3 = r10 % r8
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto Lf
            long r10 = r10 / r8
            long r6 = r6 / r10
            return r6
        Lf:
            if (r2 >= 0) goto L1b
            long r2 = r8 % r10
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L1b
            long r8 = r8 / r10
            long r8 = r8 * r6
            return r8
        L1b:
            double r8 = (double) r8
            double r10 = (double) r10
            double r8 = r8 / r10
            double r6 = (double) r6
            double r6 = r6 * r8
            long r6 = (long) r6
            return r6
    }

    public static long[] scaleLargeTimestamps(java.util.List<java.lang.Long> r9, long r10, long r12) {
            int r0 = r9.size()
            long[] r1 = new long[r0]
            r2 = 0
            r4 = 0
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 < 0) goto L26
            long r6 = r12 % r10
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L26
            long r12 = r12 / r10
        L14:
            if (r4 >= r0) goto L5a
            java.lang.Object r10 = r9.get(r4)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = r10 / r12
            r1[r4] = r10
            int r4 = r4 + 1
            goto L14
        L26:
            if (r5 >= 0) goto L42
            long r5 = r10 % r12
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L42
            long r10 = r10 / r12
        L2f:
            if (r4 >= r0) goto L5a
            java.lang.Object r12 = r9.get(r4)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = r12 * r10
            r1[r4] = r12
            int r4 = r4 + 1
            goto L2f
        L42:
            double r10 = (double) r10
            double r12 = (double) r12
            double r10 = r10 / r12
        L45:
            if (r4 >= r0) goto L5a
            java.lang.Object r12 = r9.get(r4)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            double r12 = (double) r12
            double r12 = r12 * r10
            long r12 = (long) r12
            r1[r4] = r12
            int r4 = r4 + 1
            goto L45
        L5a:
            return r1
    }

    public static void scaleLargeTimestampsInPlace(long[] r7, long r8, long r10) {
            r0 = 0
            r2 = 0
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 < 0) goto L19
            long r4 = r10 % r8
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L19
            long r10 = r10 / r8
        Le:
            int r8 = r7.length
            if (r2 >= r8) goto L3f
            r8 = r7[r2]
            long r8 = r8 / r10
            r7[r2] = r8
            int r2 = r2 + 1
            goto Le
        L19:
            if (r3 >= 0) goto L2e
            long r3 = r8 % r10
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L2e
            long r8 = r8 / r10
        L22:
            int r10 = r7.length
            if (r2 >= r10) goto L3f
            r10 = r7[r2]
            long r10 = r10 * r8
            r7[r2] = r10
            int r2 = r2 + 1
            goto L22
        L2e:
            double r8 = (double) r8
            double r10 = (double) r10
            double r8 = r8 / r10
        L31:
            int r10 = r7.length
            if (r2 >= r10) goto L3f
            r10 = r7[r2]
            double r10 = (double) r10
            double r10 = r10 * r8
            long r10 = (long) r10
            r7[r2] = r10
            int r2 = r2 + 1
            goto L31
        L3f:
            return
    }

    private static boolean shouldEscapeCharacter(char r1) {
            r0 = 34
            if (r1 == r0) goto L2a
            r0 = 37
            if (r1 == r0) goto L2a
            r0 = 42
            if (r1 == r0) goto L2a
            r0 = 47
            if (r1 == r0) goto L2a
            r0 = 58
            if (r1 == r0) goto L2a
            r0 = 60
            if (r1 == r0) goto L2a
            r0 = 92
            if (r1 == r0) goto L2a
            r0 = 124(0x7c, float:1.74E-43)
            if (r1 == r0) goto L2a
            r0 = 62
            if (r1 == r0) goto L2a
            r0 = 63
            if (r1 == r0) goto L2a
            r1 = 0
            return r1
        L2a:
            r1 = 1
            return r1
    }

    public static void sneakyThrow(java.lang.Throwable r0) {
            sneakyThrowInternal(r0)
            return
    }

    private static <T extends java.lang.Throwable> void sneakyThrowInternal(java.lang.Throwable r0) throws java.lang.Throwable {
            throw r0
    }

    public static java.lang.String[] split(java.lang.String r1, java.lang.String r2) {
            r0 = -1
            java.lang.String[] r1 = r1.split(r2, r0)
            return r1
    }

    public static java.lang.String[] splitAtFirst(java.lang.String r1, java.lang.String r2) {
            r0 = 2
            java.lang.String[] r1 = r1.split(r2, r0)
            return r1
    }

    public static java.lang.String[] splitCodecs(@androidx.annotation.Nullable java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            return r1
        La:
            java.lang.String r1 = r1.trim()
            java.lang.String r0 = "(\\s*,\\s*)"
            java.lang.String[] r1 = split(r1, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static android.content.ComponentName startForegroundService(android.content.Context r2, android.content.Intent r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.content.ComponentName r2 = r2.startForegroundService(r3)
            return r2
        Lb:
            android.content.ComponentName r2 = r2.startService(r3)
            return r2
    }

    public static long subtractWithOverflowDefault(long r3, long r5, long r7) {
            long r0 = r3 - r5
            long r5 = r5 ^ r3
            long r3 = r3 ^ r0
            long r3 = r3 & r5
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto Lc
            return r7
        Lc:
            return r0
    }

    public static long sum(long... r6) {
            int r0 = r6.length
            r1 = 0
            r3 = 0
        L4:
            if (r3 >= r0) goto Lc
            r4 = r6[r3]
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
        Lc:
            return r1
    }

    public static boolean tableExists(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6) {
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r6 = "sqlite_master"
            java.lang.String r3 = "tbl_name = ?"
            long r5 = android.database.DatabaseUtils.queryNumEntries(r5, r6, r3, r1)
            r3 = 0
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public static byte[] toByteArray(java.io.InputStream r4) throws java.io.IOException {
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
        L9:
            int r2 = r4.read(r0)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r1.write(r0, r3, r2)
            goto L9
        L15:
            byte[] r4 = r1.toByteArray()
            return r4
    }

    public static java.lang.String toHexString(byte[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        L9:
            int r2 = r4.length
            if (r1 >= r2) goto L29
            r2 = r4[r1]
            int r2 = r2 >> 4
            r2 = r2 & 15
            r3 = 16
            char r2 = java.lang.Character.forDigit(r2, r3)
            r0.append(r2)
            r2 = r4[r1]
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r3)
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
        L29:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static long toLong(int r2, int r3) {
            long r0 = toUnsignedLong(r2)
            r2 = 32
            long r0 = r0 << r2
            long r2 = toUnsignedLong(r3)
            long r2 = r2 | r0
            return r2
    }

    public static long toUnsignedLong(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    public static <T, U> com.google.common.util.concurrent.ListenableFuture<T> transformFutureAsync(com.google.common.util.concurrent.ListenableFuture<U> r4, com.google.common.util.concurrent.AsyncFunction<U, T> r5) {
            com.google.common.util.concurrent.SettableFuture r0 = com.google.common.util.concurrent.SettableFuture.create()
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r0, r4, r2)
            java.util.concurrent.Executor r3 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r0.addListener(r1, r3)
            com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1 r1 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1
            r1.<init>(r4, r0, r5, r2)
            java.util.concurrent.Executor r5 = com.google.common.util.concurrent.MoreExecutors.directExecutor()
            r4.addListener(r1, r5)
            return r0
    }

    public static java.lang.CharSequence truncateAscii(java.lang.CharSequence r1, int r2) {
            int r0 = r1.length()
            if (r0 > r2) goto L7
            goto Lc
        L7:
            r0 = 0
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
        Lc:
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String unescapeFileName(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L16
            char r4 = r8.charAt(r2)
            r5 = 37
            if (r4 != r5) goto L13
            int r3 = r3 + 1
        L13:
            int r2 = r2 + 1
            goto L7
        L16:
            if (r3 != 0) goto L19
            return r8
        L19:
            int r2 = r3 * 2
            int r2 = r0 - r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.util.regex.Pattern r5 = com.google.android.exoplayer2.util.Util.ESCAPED_CHARACTER_PATTERN
            java.util.regex.Matcher r5 = r5.matcher(r8)
        L28:
            if (r3 <= 0) goto L53
            boolean r6 = r5.find()
            if (r6 == 0) goto L53
            r6 = 1
            java.lang.String r6 = r5.group(r6)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 16
            int r6 = java.lang.Integer.parseInt(r6, r7)
            char r6 = (char) r6
            int r7 = r5.start()
            r4.append(r8, r1, r7)
            r4.append(r6)
            int r1 = r5.end()
            int r3 = r3 + (-1)
            goto L28
        L53:
            if (r1 >= r0) goto L58
            r4.append(r8, r1, r0)
        L58:
            int r8 = r4.length()
            if (r8 == r2) goto L60
            r8 = 0
            return r8
        L60:
            java.lang.String r8 = r4.toString()
            return r8
    }

    public static long usToMs(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L13
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L13
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
        L13:
            return r3
    }

    public static void writeBoolean(android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }
}
