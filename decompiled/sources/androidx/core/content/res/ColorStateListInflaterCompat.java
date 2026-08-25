package androidx.core.content.res;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ColorStateListInflaterCompat {
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue = r0
            return
    }

    private ColorStateListInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList createFromXml(@androidx.annotation.NonNull android.content.res.Resources r4, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto Lf
            r3 = 1
            if (r1 == r3) goto Lf
            goto L4
        Lf:
            if (r1 != r2) goto L16
            android.content.res.ColorStateList r4 = createFromXmlInner(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList createFromXmlInner(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r3, @androidx.annotation.NonNull android.util.AttributeSet r4, @androidx.annotation.Nullable android.content.res.Resources.Theme r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "selector"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L12
            android.content.res.ColorStateList r2 = inflate(r2, r3, r4, r5)
            return r2
        L12:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r4.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.NonNull
    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ColorStateListInflaterCompat.sTempTypedValue
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList inflate(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.XmlRes int r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
            android.content.res.XmlResourceParser r1 = r0.getXml(r1)     // Catch: java.lang.Exception -> L9
            android.content.res.ColorStateList r0 = createFromXml(r0, r1, r2)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.String r1 = "CSLCompat"
            java.lang.String r2 = "Failed to inflate ColorStateList."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    private static android.content.res.ColorStateList inflate(@androidx.annotation.NonNull android.content.res.Resources r17, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.NonNull android.util.AttributeSet r19, @androidx.annotation.Nullable android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L13:
            int r9 = r18.next()
            if (r9 == r4) goto Lec
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L22
            r11 = 3
            if (r9 == r11) goto Lec
        L22:
            r11 = 2
            if (r9 != r11) goto Le7
            if (r10 > r3) goto Le7
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L35
            goto Le7
        L35:
            int[] r9 = androidx.core.R.styleable.ColorStateListItem
            android.content.res.TypedArray r9 = obtainAttributes(r0, r2, r1, r9)
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L61
            boolean r11 = isColorInt(r0, r12)
            if (r11 != 0) goto L61
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch: java.lang.Exception -> L5a
            android.content.res.ColorStateList r10 = createFromXml(r0, r10, r2)     // Catch: java.lang.Exception -> L5a
            int r10 = r10.getDefaultColor()     // Catch: java.lang.Exception -> L5a
            goto L65
        L5a:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
            goto L65
        L61:
            int r10 = r9.getColor(r10, r13)
        L65:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L74
            float r11 = r9.getFloat(r12, r11)
            goto L80
        L74:
            int r12 = androidx.core.R.styleable.ColorStateListItem_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L80
            float r11 = r9.getFloat(r12, r11)
        L80:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r13) goto L95
            int r12 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L95
            float r12 = r9.getFloat(r12, r14)
            goto L9b
        L95:
            int r12 = androidx.core.R.styleable.ColorStateListItem_lStar
            float r12 = r9.getFloat(r12, r14)
        L9b:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r13 = new int[r9]
            r14 = 0
            r15 = 0
        La6:
            if (r14 >= r9) goto Ld2
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto Lcc
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto Lcc
            int r7 = androidx.core.R.attr.alpha
            if (r4 == r7) goto Lcc
            int r7 = androidx.core.R.attr.lStar
            if (r4 == r7) goto Lcc
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto Lc8
            goto Lc9
        Lc8:
            int r4 = -r4
        Lc9:
            r13[r15] = r4
            r15 = r7
        Lcc:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto La6
        Ld2:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r15)
            int r4 = modulateColorAlpha(r10, r11, r12)
            int[] r5 = androidx.core.content.res.GrowingArrayUtils.append(r5, r8, r4)
            java.lang.Object[] r0 = androidx.core.content.res.GrowingArrayUtils.append(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        Le7:
            r4 = 1
            r0 = r17
            goto L13
        Lec:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
    }

    private static boolean isColorInt(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.ColorRes int r3) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L13
            r3 = 31
            if (r2 > r3) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @androidx.annotation.ColorInt
    private static int modulateColorAlpha(@androidx.annotation.ColorInt int r3, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4, @androidx.annotation.FloatRange(from = 0.0d, to = 100.0d) float r5) {
            r0 = 0
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto Le
            r1 = 1120403456(0x42c80000, float:100.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            if (r1 != 0) goto L18
            return r3
        L18:
            int r2 = android.graphics.Color.alpha(r3)
            float r2 = (float) r2
            float r2 = r2 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            int r4 = (int) r2
            r2 = 255(0xff, float:3.57E-43)
            int r4 = androidx.core.math.MathUtils.clamp(r4, r0, r2)
            if (r1 == 0) goto L3b
            androidx.core.content.res.CamColor r3 = androidx.core.content.res.CamColor.fromColor(r3)
            float r0 = r3.getHue()
            float r3 = r3.getChroma()
            int r3 = androidx.core.content.res.CamColor.toColor(r0, r3, r5)
        L3b:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            int r4 = r4 << 24
            r3 = r3 | r4
            return r3
    }

    private static android.content.res.TypedArray obtainAttributes(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            goto Lc
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
        Lc:
            return r0
    }
}
