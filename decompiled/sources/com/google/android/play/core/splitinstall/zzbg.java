package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbg {
    @androidx.annotation.Nullable
    public static final com.google.android.play.core.splitinstall.zzk zza(org.xmlpull.v1.XmlPullParser r5, com.google.android.play.core.splitinstall.zzi r6) {
        L0:
            int r0 = r5.next()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            r1 = 1
            if (r0 == r1) goto L99
            int r0 = r5.getEventType()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            r1 = 2
            if (r0 != r1) goto L0
            java.lang.String r0 = r5.getName()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r2 = "splits"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L94
        L1b:
            int r0 = r5.next()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            r2 = 3
            if (r0 == r2) goto L0
            int r0 = r5.getEventType()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 != r1) goto L1b
            java.lang.String r0 = r5.getName()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r3 = "module"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L90
            java.lang.String r0 = "name"
            java.lang.String r0 = zzb(r0, r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r0 == 0) goto L8c
        L3c:
            int r3 = r5.next()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 == r2) goto L1b
            int r3 = r5.getEventType()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 != r1) goto L3c
            java.lang.String r3 = r5.getName()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r4 = "language"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 == 0) goto L88
        L54:
            int r3 = r5.next()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 == r2) goto L3c
            int r3 = r5.getEventType()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 != r1) goto L54
            java.lang.String r3 = r5.getName()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r4 = "entry"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 == 0) goto L84
            java.lang.String r3 = "key"
            java.lang.String r3 = zzb(r3, r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            java.lang.String r4 = "split"
            java.lang.String r4 = zzb(r4, r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            zzc(r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            if (r3 == 0) goto L54
            if (r4 == 0) goto L54
            r6.zza(r0, r3, r4)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            goto L54
        L84:
            zzc(r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            goto L54
        L88:
            zzc(r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            goto L3c
        L8c:
            zzc(r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            goto L1b
        L90:
            zzc(r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            goto L1b
        L94:
            zzc(r5, r6)     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            goto L0
        L99:
            com.google.android.play.core.splitinstall.zzk r5 = r6.zzb()     // Catch: java.lang.IllegalStateException -> L9e java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La2
            return r5
        L9e:
            r5 = move-exception
            goto La3
        La0:
            r5 = move-exception
            goto La3
        La2:
            r5 = move-exception
        La3:
            java.lang.String r6 = "SplitInstall"
            java.lang.String r0 = "Error while parsing splits.xml"
            android.util.Log.e(r6, r0, r5)
            r5 = 0
            return r5
    }

    @androidx.annotation.Nullable
    private static final java.lang.String zzb(java.lang.String r1, org.xmlpull.v1.XmlPullParser r2, com.google.android.play.core.splitinstall.zzi r3) {
            r3 = 0
        L1:
            int r0 = r2.getAttributeCount()
            if (r3 >= r0) goto L19
            java.lang.String r0 = r2.getAttributeName(r3)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.String r1 = r2.getAttributeValue(r3)
            return r1
        L16:
            int r3 = r3 + 1
            goto L1
        L19:
            r1 = 0
            return r1
    }

    private static final void zzc(org.xmlpull.v1.XmlPullParser r2, com.google.android.play.core.splitinstall.zzi r3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r3 = 1
        L1:
            if (r3 == 0) goto L14
            int r0 = r2.next()
            r1 = 2
            if (r0 == r1) goto L11
            r1 = 3
            if (r0 == r1) goto Le
            goto L1
        Le:
            int r3 = r3 + (-1)
            goto L1
        L11:
            int r3 = r3 + 1
            goto L1
        L14:
            return
    }
}
