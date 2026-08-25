package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypedArrayUtils {
    private static final java.lang.String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getAttr(@androidx.annotation.NonNull android.content.Context r2, int r3, int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            r2.resolveAttribute(r3, r0, r1)
            int r2 = r0.resourceId
            if (r2 == 0) goto L12
            return r3
        L12:
            return r4
    }

    public static boolean getBoolean(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2, boolean r3) {
            boolean r2 = r0.getBoolean(r2, r3)
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2) {
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            if (r1 != 0) goto La
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)
        La:
            return r1
    }

    public static int getInt(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2, int r3) {
            int r2 = r0.getInt(r2, r3)
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static boolean getNamedBoolean(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.StyleableRes int r3, boolean r4) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            boolean r0 = r0.getBoolean(r3, r4)
            return r0
    }

    @androidx.annotation.ColorInt
    public static int getNamedColor(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.StyleableRes int r3, @androidx.annotation.ColorInt int r4) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getColor(r3, r4)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getNamedColorStateList(@androidx.annotation.NonNull android.content.res.TypedArray r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.StyleableRes int r5) {
            boolean r2 = hasAttribute(r2, r4)
            if (r2 == 0) goto L4d
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r5, r2)
            int r4 = r2.type
            r0 = 2
            if (r4 == r0) goto L2e
            r0 = 28
            if (r4 < r0) goto L20
            r0 = 31
            if (r4 > r0) goto L20
            android.content.res.ColorStateList r1 = getNamedColorStateListFromInt(r2)
            return r1
        L20:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 0
            int r1 = r1.getResourceId(r5, r4)
            android.content.res.ColorStateList r1 = androidx.core.content.res.ColorStateListInflaterCompat.inflate(r2, r1, r3)
            return r1
        L2e:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L4d:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    private static android.content.res.ColorStateList getNamedColorStateListFromInt(@androidx.annotation.NonNull android.util.TypedValue r0) {
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            return r0
    }

    public static androidx.core.content.res.ComplexColorCompat getNamedComplexColor(@androidx.annotation.NonNull android.content.res.TypedArray r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.Nullable android.content.res.Resources.Theme r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.StyleableRes int r5, @androidx.annotation.ColorInt int r6) {
            boolean r2 = hasAttribute(r2, r4)
            if (r2 == 0) goto L2f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r5, r2)
            int r4 = r2.type
            r0 = 28
            if (r4 < r0) goto L1f
            r0 = 31
            if (r4 > r0) goto L1f
            int r1 = r2.data
            androidx.core.content.res.ComplexColorCompat r1 = androidx.core.content.res.ComplexColorCompat.from(r1)
            return r1
        L1f:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 0
            int r1 = r1.getResourceId(r5, r4)
            androidx.core.content.res.ComplexColorCompat r1 = androidx.core.content.res.ComplexColorCompat.inflate(r2, r1, r3)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            androidx.core.content.res.ComplexColorCompat r1 = androidx.core.content.res.ComplexColorCompat.from(r6)
            return r1
    }

    public static float getNamedFloat(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.StyleableRes int r3, float r4) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            float r0 = r0.getFloat(r3, r4)
            return r0
    }

    public static int getNamedInt(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.StyleableRes int r3, int r4) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getInt(r3, r4)
            return r0
    }

    @androidx.annotation.AnyRes
    public static int getNamedResourceId(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.StyleableRes int r3, @androidx.annotation.AnyRes int r4) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getResourceId(r3, r4)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String getNamedString(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.StyleableRes int r3) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r0.getString(r3)
            return r0
    }

    @androidx.annotation.AnyRes
    public static int getResourceId(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2, @androidx.annotation.AnyRes int r3) {
            int r2 = r0.getResourceId(r2, r3)
            int r0 = r0.getResourceId(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String getString(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2) {
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto La
            java.lang.String r1 = r0.getString(r2)
        La:
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.CharSequence getText(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2) {
            java.lang.CharSequence r1 = r0.getText(r1)
            if (r1 != 0) goto La
            java.lang.CharSequence r1 = r0.getText(r2)
        La:
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.CharSequence[] getTextArray(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.StyleableRes int r1, @androidx.annotation.StyleableRes int r2) {
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 != 0) goto La
            java.lang.CharSequence[] r1 = r0.getTextArray(r2)
        La:
            return r1
    }

    public static boolean hasAttribute(@androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @androidx.annotation.NonNull
    public static android.content.res.TypedArray obtainAttributes(@androidx.annotation.NonNull android.content.res.Resources r0, @androidx.annotation.Nullable android.content.res.Resources.Theme r1, @androidx.annotation.NonNull android.util.AttributeSet r2, @androidx.annotation.NonNull int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.util.TypedValue peekNamedValue(@androidx.annotation.NonNull android.content.res.TypedArray r0, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r1, @androidx.annotation.NonNull java.lang.String r2, int r3) {
            boolean r1 = hasAttribute(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.util.TypedValue r0 = r0.peekValue(r3)
            return r0
    }
}
