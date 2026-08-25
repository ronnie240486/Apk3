package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAttributeValue(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) {
            int r0 = r3.getAttributeCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.String r2 = r3.getAttributeName(r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L16
            java.lang.String r3 = r3.getAttributeValue(r1)
            return r3
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    public static java.lang.String getAttributeValueIgnorePrefix(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) {
            int r0 = r3.getAttributeCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            java.lang.String r2 = r3.getAttributeName(r1)
            java.lang.String r2 = stripPrefix(r2)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1a
            java.lang.String r3 = r3.getAttributeValue(r1)
            return r3
        L1a:
            int r1 = r1 + 1
            goto L5
        L1d:
            r3 = 0
            return r3
    }

    public static boolean isEndTag(org.xmlpull.v1.XmlPullParser r1) throws org.xmlpull.v1.XmlPullParserException {
            int r1 = r1.getEventType()
            r0 = 3
            if (r1 != r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static boolean isEndTag(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) throws org.xmlpull.v1.XmlPullParserException {
            boolean r0 = isEndTag(r1)
            if (r0 == 0) goto L12
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static boolean isStartTag(org.xmlpull.v1.XmlPullParser r1) throws org.xmlpull.v1.XmlPullParserException {
            int r1 = r1.getEventType()
            r0 = 2
            if (r1 != r0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static boolean isStartTag(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) throws org.xmlpull.v1.XmlPullParserException {
            boolean r0 = isStartTag(r1)
            if (r0 == 0) goto L12
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static boolean isStartTagIgnorePrefix(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) throws org.xmlpull.v1.XmlPullParserException {
            boolean r0 = isStartTag(r1)
            if (r0 == 0) goto L16
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = stripPrefix(r1)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    private static java.lang.String stripPrefix(java.lang.String r2) {
            r0 = 58
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            goto L10
        La:
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
        L10:
            return r2
    }
}
