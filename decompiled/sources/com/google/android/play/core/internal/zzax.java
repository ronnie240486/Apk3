package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzax {
    private final com.google.android.play.core.splitcompat.zza zza;

    @androidx.annotation.Nullable
    private org.xmlpull.v1.XmlPullParser zzb;

    public zzax(com.google.android.play.core.splitcompat.zza r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final long zza() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r7 = this;
            org.xmlpull.v1.XmlPullParser r0 = r7.zzb
            if (r0 == 0) goto L8a
        L4:
            org.xmlpull.v1.XmlPullParser r0 = r7.zzb
            int r0 = r0.next()
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L11
            if (r0 == r2) goto L82
            goto L4
        L11:
            org.xmlpull.v1.XmlPullParser r0 = r7.zzb
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "manifest"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L82
            org.xmlpull.v1.XmlPullParser r0 = r7.zzb
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "versionCode"
            java.lang.String r0 = r0.getAttributeValue(r1, r3)
            org.xmlpull.v1.XmlPullParser r3 = r7.zzb
            java.lang.String r4 = "versionCodeMajor"
            java.lang.String r1 = r3.getAttributeValue(r1, r4)
            if (r0 == 0) goto L7a
            r3 = 0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L65
            if (r1 != 0) goto L3e
            long r0 = (long) r0
            return r0
        L3e:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L50
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
        L50:
            r0 = move-exception
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2[r3] = r0
            java.lang.String r0 = "Couldn't parse versionCodeMajor to int: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L65:
            r0 = move-exception
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2[r3] = r0
            java.lang.String r0 = "Couldn't parse versionCode to int: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L7a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "Manifest entry doesn't contain 'versionCode' attribute."
            r0.<init>(r1)
            throw r0
        L82:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "Couldn't find manifest entry at top-level."
            r0.<init>(r1)
            throw r0
        L8a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "Manifest file needs to be loaded before parsing."
            r0.<init>(r1)
            throw r0
    }

    public final void zzb(android.content.res.AssetManager r2, java.io.File r3) throws java.io.IOException {
            r1 = this;
            int r3 = com.google.android.play.core.splitcompat.zza.zzc(r2, r3)
            java.lang.String r0 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r2 = r2.openXmlResourceParser(r3, r0)
            r1.zzb = r2
            return
    }
}
