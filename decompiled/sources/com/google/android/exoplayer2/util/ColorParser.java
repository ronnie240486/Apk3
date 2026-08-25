package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorParser {
    private static final java.util.Map<java.lang.String, java.lang.Integer> COLOR_MAP = null;
    private static final java.lang.String RGB = "rgb";
    private static final java.lang.String RGBA = "rgba";
    private static final java.util.regex.Pattern RGBA_PATTERN_FLOAT_ALPHA = null;
    private static final java.util.regex.Pattern RGBA_PATTERN_INT_ALPHA = null;
    private static final java.util.regex.Pattern RGB_PATTERN = null;

    static {
            java.lang.String r0 = "^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.util.ColorParser.RGB_PATTERN = r0
            java.lang.String r0 = "^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.util.ColorParser.RGBA_PATTERN_INT_ALPHA = r0
            java.lang.String r0 = "^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.exoplayer2.util.ColorParser.RGBA_PATTERN_FLOAT_ALPHA = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.exoplayer2.util.ColorParser.COLOR_MAP = r0
            r1 = -984833(0xfffffffffff0f8ff, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "aliceblue"
            r0.put(r2, r1)
            r1 = -332841(0xfffffffffffaebd7, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "antiquewhite"
            r0.put(r2, r1)
            r1 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "aqua"
            r0.put(r1, r10)
            r1 = -8388652(0xffffffffff7fffd4, float:-3.4028147E38)
            java.lang.String r3 = "aquamarine"
            r4 = -983041(0xfffffffffff0ffff, float:NaN)
            java.lang.String r5 = "azure"
            r6 = -657956(0xfffffffffff5f5dc, float:NaN)
            java.lang.String r7 = "beige"
            r8 = -6972(0xffffffffffffe4c4, float:NaN)
            java.lang.String r9 = "bisque"
            r2 = r0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.String r3 = "black"
            r4 = -5171(0xffffffffffffebcd, float:NaN)
            java.lang.String r5 = "blanchedalmond"
            r6 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            java.lang.String r7 = "blue"
            r8 = -7722014(0xffffffffff8a2be2, float:NaN)
            java.lang.String r9 = "blueviolet"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -5952982(0xffffffffffa52a2a, float:NaN)
            java.lang.String r3 = "brown"
            r4 = -2180985(0xffffffffffdeb887, float:NaN)
            java.lang.String r5 = "burlywood"
            r6 = -10510688(0xffffffffff5f9ea0, float:-2.9724147E38)
            java.lang.String r7 = "cadetblue"
            r8 = -8388864(0xffffffffff7fff00, float:-3.4027717E38)
            java.lang.String r9 = "chartreuse"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -2987746(0xffffffffffd2691e, float:NaN)
            java.lang.String r3 = "chocolate"
            r4 = -32944(0xffffffffffff7f50, float:NaN)
            java.lang.String r5 = "coral"
            r6 = -10185235(0xffffffffff6495ed, float:-3.0384244E38)
            java.lang.String r7 = "cornflowerblue"
            r8 = -1828(0xfffffffffffff8dc, float:NaN)
            java.lang.String r9 = "cornsilk"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -2354116(0xffffffffffdc143c, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "crimson"
            r0.put(r2, r1)
            java.lang.String r1 = "cyan"
            r0.put(r1, r10)
            r1 = -16777077(0xffffffffff00008b, float:-1.70144E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkblue"
            r0.put(r2, r1)
            r1 = -16741493(0xffffffffff008b8b, float:-1.7086573E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkcyan"
            r0.put(r2, r1)
            r1 = -4684277(0xffffffffffb8860b, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkgoldenrod"
            r0.put(r2, r1)
            r1 = -5658199(0xffffffffffa9a9a9, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkgray"
            r0.put(r2, r1)
            r2 = -16751616(0xffffffffff006400, float:-1.7066041E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "darkgreen"
            r0.put(r3, r2)
            java.lang.String r2 = "darkgrey"
            r0.put(r2, r1)
            r1 = -4343957(0xffffffffffbdb76b, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkkhaki"
            r0.put(r2, r1)
            r1 = -7667573(0xffffffffff8b008b, float:NaN)
            java.lang.String r3 = "darkmagenta"
            r4 = -11179217(0xffffffffff556b2f, float:-2.836821E38)
            java.lang.String r5 = "darkolivegreen"
            r6 = -29696(0xffffffffffff8c00, float:NaN)
            java.lang.String r7 = "darkorange"
            r8 = -6737204(0xffffffffff9932cc, float:NaN)
            java.lang.String r9 = "darkorchid"
            r2 = r0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -7667712(0xffffffffff8b0000, float:NaN)
            java.lang.String r3 = "darkred"
            r4 = -1468806(0xffffffffffe9967a, float:NaN)
            java.lang.String r5 = "darksalmon"
            r6 = -7357297(0xffffffffff8fbc8f, float:NaN)
            java.lang.String r7 = "darkseagreen"
            r8 = -12042869(0xffffffffff483d8b, float:-2.6616515E38)
            java.lang.String r9 = "darkslateblue"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -13676721(0xffffffffff2f4f4f, float:-2.330267E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkslategray"
            r0.put(r2, r1)
            java.lang.String r2 = "darkslategrey"
            r0.put(r2, r1)
            r1 = -16724271(0xffffffffff00ced1, float:-1.7121504E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkturquoise"
            r0.put(r2, r1)
            r1 = -7077677(0xffffffffff9400d3, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "darkviolet"
            r0.put(r2, r1)
            r1 = -60269(0xffffffffffff1493, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "deeppink"
            r0.put(r2, r1)
            r1 = -16728065(0xffffffffff00bfff, float:-1.7113808E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "deepskyblue"
            r0.put(r2, r1)
            r1 = -9868951(0xffffffffff696969, float:-3.1025744E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "dimgray"
            r0.put(r2, r1)
            java.lang.String r2 = "dimgrey"
            r0.put(r2, r1)
            r1 = -14774017(0xffffffffff1e90ff, float:-2.1077089E38)
            java.lang.String r3 = "dodgerblue"
            r4 = -5103070(0xffffffffffb22222, float:NaN)
            java.lang.String r5 = "firebrick"
            r6 = -1296(0xfffffffffffffaf0, float:NaN)
            java.lang.String r7 = "floralwhite"
            r8 = -14513374(0xffffffffff228b22, float:-2.1605735E38)
            java.lang.String r9 = "forestgreen"
            r2 = r0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "fuchsia"
            r0.put(r1, r10)
            r1 = -2302756(0xffffffffffdcdcdc, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "gainsboro"
            r0.put(r2, r1)
            r1 = -460545(0xfffffffffff8f8ff, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ghostwhite"
            r0.put(r2, r1)
            r1 = -10496(0xffffffffffffd700, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "gold"
            r0.put(r2, r1)
            r1 = -2448096(0xffffffffffdaa520, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "goldenrod"
            r0.put(r2, r1)
            r1 = -8355712(0xffffffffff808080, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "gray"
            r0.put(r2, r1)
            r2 = -16744448(0xffffffffff008000, float:-1.708058E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "green"
            r0.put(r3, r2)
            r2 = -5374161(0xffffffffffadff2f, float:NaN)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "greenyellow"
            r0.put(r3, r2)
            java.lang.String r2 = "grey"
            r0.put(r2, r1)
            r1 = -983056(0xfffffffffff0fff0, float:NaN)
            java.lang.String r3 = "honeydew"
            r4 = -38476(0xffffffffffff69b4, float:NaN)
            java.lang.String r5 = "hotpink"
            r6 = -3318692(0xffffffffffcd5c5c, float:NaN)
            java.lang.String r7 = "indianred"
            r8 = -11861886(0xffffffffff4b0082, float:-2.6983592E38)
            java.lang.String r9 = "indigo"
            r2 = r0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -16
            java.lang.String r3 = "ivory"
            r4 = -989556(0xfffffffffff0e68c, float:NaN)
            java.lang.String r5 = "khaki"
            r6 = -1644806(0xffffffffffe6e6fa, float:NaN)
            java.lang.String r7 = "lavender"
            r8 = -3851(0xfffffffffffff0f5, float:NaN)
            java.lang.String r9 = "lavenderblush"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -8586240(0xffffffffff7cfc00, float:-3.3627391E38)
            java.lang.String r3 = "lawngreen"
            r4 = -1331(0xfffffffffffffacd, float:NaN)
            java.lang.String r5 = "lemonchiffon"
            r6 = -5383962(0xffffffffffadd8e6, float:NaN)
            java.lang.String r7 = "lightblue"
            r8 = -1015680(0xfffffffffff08080, float:NaN)
            java.lang.String r9 = "lightcoral"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -2031617(0xffffffffffe0ffff, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightcyan"
            r0.put(r2, r1)
            r1 = -329006(0xfffffffffffafad2, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightgoldenrodyellow"
            r0.put(r2, r1)
            r1 = -2894893(0xffffffffffd3d3d3, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightgray"
            r0.put(r2, r1)
            r2 = -7278960(0xffffffffff90ee90, float:NaN)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "lightgreen"
            r0.put(r3, r2)
            java.lang.String r2 = "lightgrey"
            r0.put(r2, r1)
            r1 = -18751(0xffffffffffffb6c1, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightpink"
            r0.put(r2, r1)
            r1 = -24454(0xffffffffffffa07a, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightsalmon"
            r0.put(r2, r1)
            r1 = -14634326(0xffffffffff20b2aa, float:-2.1360416E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightseagreen"
            r0.put(r2, r1)
            r1 = -7876870(0xffffffffff87cefa, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightskyblue"
            r0.put(r2, r1)
            r1 = -8943463(0xffffffffff778899, float:-3.2902857E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightslategray"
            r0.put(r2, r1)
            java.lang.String r2 = "lightslategrey"
            r0.put(r2, r1)
            r1 = -5192482(0xffffffffffb0c4de, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightsteelblue"
            r0.put(r2, r1)
            r1 = -32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lightyellow"
            r0.put(r2, r1)
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "lime"
            r0.put(r2, r1)
            r1 = -13447886(0xffffffffff32cd32, float:-2.3766802E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "limegreen"
            r0.put(r2, r1)
            r1 = -331546(0xfffffffffffaf0e6, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "linen"
            r0.put(r2, r1)
            java.lang.String r1 = "magenta"
            r0.put(r1, r10)
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "maroon"
            r0.put(r2, r1)
            r1 = -10039894(0xffffffffff66cdaa, float:-3.067903E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "mediumaquamarine"
            r0.put(r2, r1)
            r1 = -16777011(0xffffffffff0000cd, float:-1.7014534E38)
            java.lang.String r3 = "mediumblue"
            r4 = -4565549(0xffffffffffba55d3, float:NaN)
            java.lang.String r5 = "mediumorchid"
            r6 = -7114533(0xffffffffff9370db, float:NaN)
            java.lang.String r7 = "mediumpurple"
            r8 = -12799119(0xffffffffff3cb371, float:-2.5082658E38)
            java.lang.String r9 = "mediumseagreen"
            r2 = r0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -8689426(0xffffffffff7b68ee, float:-3.3418105E38)
            java.lang.String r3 = "mediumslateblue"
            r4 = -16713062(0xffffffffff00fa9a, float:-1.7144238E38)
            java.lang.String r5 = "mediumspringgreen"
            r6 = -12004916(0xffffffffff48d1cc, float:-2.6693493E38)
            java.lang.String r7 = "mediumturquoise"
            r8 = -3730043(0xffffffffffc71585, float:NaN)
            java.lang.String r9 = "mediumvioletred"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -15132304(0xffffffffff191970, float:-2.0350396E38)
            java.lang.String r3 = "midnightblue"
            r4 = -655366(0xfffffffffff5fffa, float:NaN)
            java.lang.String r5 = "mintcream"
            r6 = -6943(0xffffffffffffe4e1, float:NaN)
            java.lang.String r7 = "mistyrose"
            r8 = -6987(0xffffffffffffe4b5, float:NaN)
            java.lang.String r9 = "moccasin"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -8531(0xffffffffffffdead, float:NaN)
            java.lang.String r3 = "navajowhite"
            r4 = -16777088(0xffffffffff000080, float:-1.7014378E38)
            java.lang.String r5 = "navy"
            r6 = -133658(0xfffffffffffdf5e6, float:NaN)
            java.lang.String r7 = "oldlace"
            r8 = -8355840(0xffffffffff808000, float:NaN)
            java.lang.String r9 = "olive"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -9728477(0xffffffffff6b8e23, float:-3.131066E38)
            java.lang.String r3 = "olivedrab"
            r4 = -23296(0xffffffffffffa500, float:NaN)
            java.lang.String r5 = "orange"
            r6 = -47872(0xffffffffffff4500, float:NaN)
            java.lang.String r7 = "orangered"
            r8 = -2461482(0xffffffffffda70d6, float:NaN)
            java.lang.String r9 = "orchid"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -1120086(0xffffffffffeee8aa, float:NaN)
            java.lang.String r3 = "palegoldenrod"
            r4 = -6751336(0xffffffffff98fb98, float:NaN)
            java.lang.String r5 = "palegreen"
            r6 = -5247250(0xffffffffffafeeee, float:NaN)
            java.lang.String r7 = "paleturquoise"
            r8 = -2396013(0xffffffffffdb7093, float:NaN)
            java.lang.String r9 = "palevioletred"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -4139(0xffffffffffffefd5, float:NaN)
            java.lang.String r3 = "papayawhip"
            r4 = -9543(0xffffffffffffdab9, float:NaN)
            java.lang.String r5 = "peachpuff"
            r6 = -3308225(0xffffffffffcd853f, float:NaN)
            java.lang.String r7 = "peru"
            r8 = -16181(0xffffffffffffc0cb, float:NaN)
            java.lang.String r9 = "pink"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -2252579(0xffffffffffdda0dd, float:NaN)
            java.lang.String r3 = "plum"
            r4 = -5185306(0xffffffffffb0e0e6, float:NaN)
            java.lang.String r5 = "powderblue"
            r6 = -8388480(0xffffffffff800080, float:NaN)
            java.lang.String r7 = "purple"
            r8 = -10079335(0xffffffffff663399, float:-3.0599035E38)
            java.lang.String r9 = "rebeccapurple"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            java.lang.String r3 = "red"
            r4 = -4419697(0xffffffffffbc8f8f, float:NaN)
            java.lang.String r5 = "rosybrown"
            r6 = -12490271(0xffffffffff4169e1, float:-2.5709076E38)
            java.lang.String r7 = "royalblue"
            r8 = -7650029(0xffffffffff8b4513, float:NaN)
            java.lang.String r9 = "saddlebrown"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -360334(0xfffffffffffa8072, float:NaN)
            java.lang.String r3 = "salmon"
            r4 = -744352(0xfffffffffff4a460, float:NaN)
            java.lang.String r5 = "sandybrown"
            r6 = -13726889(0xffffffffff2e8b57, float:-2.3200917E38)
            java.lang.String r7 = "seagreen"
            r8 = -2578(0xfffffffffffff5ee, float:NaN)
            java.lang.String r9 = "seashell"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -6270419(0xffffffffffa0522d, float:NaN)
            java.lang.String r3 = "sienna"
            r4 = -4144960(0xffffffffffc0c0c0, float:NaN)
            java.lang.String r5 = "silver"
            r6 = -7876885(0xffffffffff87ceeb, float:NaN)
            java.lang.String r7 = "skyblue"
            r8 = -9807155(0xffffffffff6a5acd, float:-3.1151082E38)
            java.lang.String r9 = "slateblue"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -9404272(0xffffffffff708090, float:-3.1968225E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "slategray"
            r0.put(r2, r1)
            java.lang.String r2 = "slategrey"
            r0.put(r2, r1)
            r1 = -1286(0xfffffffffffffafa, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "snow"
            r0.put(r2, r1)
            r1 = -16711809(0xffffffffff00ff7f, float:-1.714678E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "springgreen"
            r0.put(r2, r1)
            r1 = -12156236(0xffffffffff4682b4, float:-2.638658E38)
            java.lang.String r3 = "steelblue"
            r4 = -2968436(0xffffffffffd2b48c, float:NaN)
            java.lang.String r5 = "tan"
            r6 = -16744320(0xffffffffff008080, float:-1.708084E38)
            java.lang.String r7 = "teal"
            r8 = -2572328(0xffffffffffd8bfd8, float:NaN)
            java.lang.String r9 = "thistle"
            r2 = r0
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -40121(0xffffffffffff6347, float:NaN)
            java.lang.String r3 = "tomato"
            r4 = 0
            java.lang.String r5 = "transparent"
            r6 = -12525360(0xffffffffff40e0d0, float:-2.5637907E38)
            java.lang.String r7 = "turquoise"
            r8 = -1146130(0xffffffffffee82ee, float:NaN)
            java.lang.String r9 = "violet"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -663885(0xfffffffffff5deb3, float:NaN)
            java.lang.String r3 = "wheat"
            r4 = -1
            java.lang.String r5 = "white"
            r6 = -657931(0xfffffffffff5f5f5, float:NaN)
            java.lang.String r7 = "whitesmoke"
            r8 = -256(0xffffffffffffff00, float:NaN)
            java.lang.String r9 = "yellow"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -6632142(0xffffffffff9acd32, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "yellowgreen"
            r0.put(r2, r1)
            return
    }

    private ColorParser() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ColorInt
    private static int parseColorInternal(java.lang.String r5, boolean r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            java.lang.String r0 = " "
            java.lang.String r2 = ""
            java.lang.String r5 = r5.replace(r0, r2)
            r0 = 0
            char r0 = r5.charAt(r0)
            r2 = 35
            if (r0 != r2) goto L46
            java.lang.String r6 = r5.substring(r1)
            r0 = 16
            long r0 = java.lang.Long.parseLong(r6, r0)
            int r6 = (int) r0
            int r0 = r5.length()
            r1 = 7
            if (r0 != r1) goto L30
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 | r6
            goto L3f
        L30:
            int r5 = r5.length()
            r0 = 9
            if (r5 != r0) goto L40
            r5 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 24
            int r6 = r6 >>> 8
            r5 = r5 | r6
        L3f:
            return r5
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L46:
            java.lang.String r0 = "rgba"
            boolean r0 = r5.startsWith(r0)
            r2 = 3
            r3 = 2
            r4 = 10
            if (r0 == 0) goto Lb8
            if (r6 == 0) goto L58
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.util.ColorParser.RGBA_PATTERN_FLOAT_ALPHA
            goto L5a
        L58:
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.util.ColorParser.RGBA_PATTERN_INT_ALPHA
        L5a:
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r0 = r5.matches()
            if (r0 == 0) goto L10f
            r0 = 4
            if (r6 == 0) goto L7b
            r6 = 1132396544(0x437f0000, float:255.0)
            java.lang.String r0 = r5.group(r0)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            float r0 = java.lang.Float.parseFloat(r0)
            float r0 = r0 * r6
            int r6 = (int) r0
            goto L89
        L7b:
            java.lang.String r6 = r5.group(r0)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = java.lang.Integer.parseInt(r6, r4)
        L89:
            java.lang.String r0 = r5.group(r1)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0, r4)
            java.lang.String r1 = r5.group(r3)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = java.lang.Integer.parseInt(r1, r4)
            java.lang.String r5 = r5.group(r2)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = java.lang.Integer.parseInt(r5, r4)
            int r5 = android.graphics.Color.argb(r6, r0, r1, r5)
            return r5
        Lb8:
            java.lang.String r6 = "rgb"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto Lfc
            java.util.regex.Pattern r6 = com.google.android.exoplayer2.util.ColorParser.RGB_PATTERN
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L10f
            java.lang.String r6 = r5.group(r1)
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = java.lang.Integer.parseInt(r6, r4)
            java.lang.String r0 = r5.group(r3)
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0, r4)
            java.lang.String r5 = r5.group(r2)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = java.lang.Integer.parseInt(r5, r4)
            int r5 = android.graphics.Color.rgb(r6, r0, r5)
            return r5
        Lfc:
            java.util.Map<java.lang.String, java.lang.Integer> r6 = com.google.android.exoplayer2.util.ColorParser.COLOR_MAP
            java.lang.String r5 = com.google.common.base.Ascii.toLowerCase(r5)
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L10f
            int r5 = r5.intValue()
            return r5
        L10f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    @androidx.annotation.ColorInt
    public static int parseCssColor(java.lang.String r1) {
            r0 = 1
            int r1 = parseColorInternal(r1, r0)
            return r1
    }

    @androidx.annotation.ColorInt
    public static int parseTtmlColor(java.lang.String r1) {
            r0 = 0
            int r1 = parseColorInternal(r1, r0)
            return r1
    }
}
