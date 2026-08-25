package org.androidannotations.api.sharedpreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class SetXmlSerializer {
    private static final java.lang.String NAMESPACE = "";
    private static final java.lang.String SET_TAG = "AA_set";
    private static final java.lang.String STRING_TAG = "AA_string";

    private SetXmlSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Set<java.lang.String> deserialize(java.lang.String r8) {
            java.lang.String r0 = "AA_string"
            java.lang.String r1 = ""
            java.lang.String r2 = "getStringSet"
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>()
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()
            r5 = 0
            java.io.StringReader r6 = new java.io.StringReader     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r6.<init>(r8)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r4.setInput(r6)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r4.next()     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r8 = "AA_set"
            r6 = 2
            r4.require(r6, r1, r8)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
        L21:
            int r8 = r4.next()     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r7 = 3
            if (r8 == r7) goto L40
            r4.require(r6, r1, r0)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r4.next()     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r8 = 4
            r4.require(r8, r5, r5)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r8 = r4.getText()     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r3.add(r8)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r4.next()     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            r4.require(r7, r5, r0)     // Catch: java.io.IOException -> L41 org.xmlpull.v1.XmlPullParserException -> L46
            goto L21
        L40:
            return r3
        L41:
            r8 = move-exception
            android.util.Log.w(r2, r8)
            return r5
        L46:
            r8 = move-exception
            android.util.Log.w(r2, r8)
            return r5
    }

    public static java.lang.String serialize(java.util.Set<java.lang.String> r7) {
            java.lang.String r0 = "AA_string"
            java.lang.String r1 = "AA_set"
            java.lang.String r2 = ""
            if (r7 != 0) goto Lc
            java.util.Set r7 = java.util.Collections.emptySet()
        Lc:
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
            r4.setOutput(r3)     // Catch: java.lang.Throwable -> L3e
            r4.startTag(r2, r1)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L3e
        L1f:
            boolean r5 = r7.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L37
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3e
            org.xmlpull.v1.XmlSerializer r6 = r4.startTag(r2, r0)     // Catch: java.lang.Throwable -> L3e
            org.xmlpull.v1.XmlSerializer r5 = r6.text(r5)     // Catch: java.lang.Throwable -> L3e
            r5.endTag(r2, r0)     // Catch: java.lang.Throwable -> L3e
            goto L1f
        L37:
            org.xmlpull.v1.XmlSerializer r7 = r4.endTag(r2, r1)     // Catch: java.lang.Throwable -> L3e
            r7.endDocument()     // Catch: java.lang.Throwable -> L3e
        L3e:
            java.lang.String r7 = r3.toString()
            return r7
    }
}
