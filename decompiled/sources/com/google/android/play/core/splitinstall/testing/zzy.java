package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzy {
    private static final com.google.android.play.core.internal.zzag zza = null;
    private final org.xmlpull.v1.XmlPullParser zzb;
    private final com.google.android.play.core.splitinstall.testing.zzs zzc;

    static {
            com.google.android.play.core.internal.zzag r0 = new com.google.android.play.core.internal.zzag
            java.lang.String r1 = "LocalTestingConfigParser"
            r0.<init>(r1)
            com.google.android.play.core.splitinstall.testing.zzy.zza = r0
            return
    }

    public zzy(org.xmlpull.v1.XmlPullParser r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            com.google.android.play.core.splitinstall.testing.zzt r2 = com.google.android.play.core.splitinstall.testing.zzt.zza
            com.google.android.play.core.splitinstall.testing.zza r2 = new com.google.android.play.core.splitinstall.testing.zza
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb(r0)
            r1.zzc = r2
            return
    }

    public static com.google.android.play.core.splitinstall.testing.zzt zza(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "local_testing_config.xml"
            r0.<init>(r4, r1)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L10
            com.google.android.play.core.splitinstall.testing.zzt r4 = com.google.android.play.core.splitinstall.testing.zzt.zza
            return r4
        L10:
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.RuntimeException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b java.io.IOException -> L4d
            r4.<init>(r0)     // Catch: java.lang.RuntimeException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b java.io.IOException -> L4d
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: java.lang.Throwable -> L44
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch: java.lang.Throwable -> L44
            r0.setInput(r4)     // Catch: java.lang.Throwable -> L44
            com.google.android.play.core.splitinstall.testing.zzy r2 = new com.google.android.play.core.splitinstall.testing.zzy     // Catch: java.lang.Throwable -> L44
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L44
            com.google.android.play.core.splitinstall.testing.zzu r0 = new com.google.android.play.core.splitinstall.testing.zzu     // Catch: java.lang.Throwable -> L44
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "local-testing-config"
            r2.zze(r3, r0)     // Catch: java.lang.Throwable -> L44
            com.google.android.play.core.splitinstall.testing.zzs r0 = r2.zzc     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = r0.zzd()     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)     // Catch: java.lang.Throwable -> L44
            r0.zzb(r2)     // Catch: java.lang.Throwable -> L44
            com.google.android.play.core.splitinstall.testing.zzt r0 = r0.zzc()     // Catch: java.lang.Throwable -> L44
            r4.close()     // Catch: java.lang.RuntimeException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b java.io.IOException -> L4d
            return r0
        L44:
            r0 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L48
        L48:
            throw r0     // Catch: java.lang.RuntimeException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b java.io.IOException -> L4d
        L49:
            r4 = move-exception
            goto L4e
        L4b:
            r4 = move-exception
            goto L4e
        L4d:
            r4 = move-exception
        L4e:
            com.google.android.play.core.internal.zzag r0 = com.google.android.play.core.splitinstall.testing.zzy.zza
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            java.lang.String r4 = r4.getMessage()
            r2[r1] = r4
            java.lang.String r4 = "%s can not be parsed, using default. Error: %s"
            r0.zze(r4, r2)
            com.google.android.play.core.splitinstall.testing.zzt r4 = com.google.android.play.core.splitinstall.testing.zzt.zza
            return r4
    }

    public static /* synthetic */ void zzb(com.google.android.play.core.splitinstall.testing.zzy r3) {
            r0 = 0
        L1:
            org.xmlpull.v1.XmlPullParser r1 = r3.zzb
            int r1 = r1.getAttributeCount()
            if (r0 >= r1) goto L29
            org.xmlpull.v1.XmlPullParser r1 = r3.zzb
            java.lang.String r1 = r1.getAttributeName(r0)
            java.lang.String r2 = "defaultErrorCode"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L26
            com.google.android.play.core.splitinstall.testing.zzs r1 = r3.zzc
            org.xmlpull.v1.XmlPullParser r2 = r3.zzb
            java.lang.String r2 = r2.getAttributeValue(r0)
            int r2 = com.google.android.play.core.splitinstall.model.zza.zza(r2)
            r1.zza(r2)
        L26:
            int r0 = r0 + 1
            goto L1
        L29:
            com.google.android.play.core.splitinstall.testing.zzw r0 = new com.google.android.play.core.splitinstall.testing.zzw
            r0.<init>(r3)
            java.lang.String r1 = "split-install-error"
            r3.zze(r1, r0)
            return
    }

    public static /* synthetic */ void zzc(com.google.android.play.core.splitinstall.testing.zzy r7) {
            r0 = 0
            r1 = 0
            r3 = r1
            r4 = r3
            r2 = 0
        L5:
            org.xmlpull.v1.XmlPullParser r5 = r7.zzb
            int r5 = r5.getAttributeCount()
            if (r2 >= r5) goto L38
            org.xmlpull.v1.XmlPullParser r5 = r7.zzb
            java.lang.String r5 = r5.getAttributeName(r2)
            java.lang.String r6 = "module"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L21
            org.xmlpull.v1.XmlPullParser r3 = r7.zzb
            java.lang.String r3 = r3.getAttributeValue(r2)
        L21:
            org.xmlpull.v1.XmlPullParser r5 = r7.zzb
            java.lang.String r5 = r5.getAttributeName(r2)
            java.lang.String r6 = "errorCode"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L35
            org.xmlpull.v1.XmlPullParser r4 = r7.zzb
            java.lang.String r4 = r4.getAttributeValue(r2)
        L35:
            int r2 = r2 + 1
            goto L5
        L38:
            if (r3 == 0) goto L57
            if (r4 == 0) goto L57
            com.google.android.play.core.splitinstall.testing.zzs r0 = r7.zzc
            int r1 = com.google.android.play.core.splitinstall.model.zza.zza(r4)
            java.util.Map r0 = r0.zzd()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
        L4d:
            org.xmlpull.v1.XmlPullParser r0 = r7.zzb
            int r0 = r0.next()
            r1 = 3
            if (r0 != r1) goto L4d
            return
        L57:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "split-install-error"
            r3[r0] = r4
            java.lang.String r0 = "'%s' element does not contain 'module'/'errorCode' attributes."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            org.xmlpull.v1.XmlPullParser r7 = r7.zzb
            r2.<init>(r0, r7, r1)
            throw r2
    }

    private final void zze(java.lang.String r4, com.google.android.play.core.splitinstall.testing.zzx r5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r3 = this;
        L0:
            org.xmlpull.v1.XmlPullParser r0 = r3.zzb
            int r0 = r0.next()
            r1 = 3
            if (r0 == r1) goto L42
            r1 = 1
            if (r0 != r1) goto Ld
            goto L42
        Ld:
            org.xmlpull.v1.XmlPullParser r0 = r3.zzb
            int r0 = r0.getEventType()
            r2 = 2
            if (r0 != r2) goto L0
            org.xmlpull.v1.XmlPullParser r0 = r3.zzb
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L26
            r5.zza()
            goto L0
        L26:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 0
            r0[r2] = r4
            org.xmlpull.v1.XmlPullParser r4 = r3.zzb
            java.lang.String r4 = r4.getName()
            r0[r1] = r4
            java.lang.String r4 = "Expected '%s' tag but found '%s'."
            java.lang.String r4 = java.lang.String.format(r4, r0)
            org.xmlpull.v1.XmlPullParser r0 = r3.zzb
            r1 = 0
            r5.<init>(r4, r0, r1)
            throw r5
        L42:
            return
    }

    public final /* synthetic */ void zzd() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r2 = this;
            com.google.android.play.core.splitinstall.testing.zzv r0 = new com.google.android.play.core.splitinstall.testing.zzv
            r0.<init>(r2)
            java.lang.String r1 = "split-install-errors"
            r2.zze(r1, r0)
            return
    }
}
