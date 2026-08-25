package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ShortcutXmlParser {
    private static final java.lang.String ATTR_SHORTCUT_ID = "shortcutId";
    private static final java.lang.Object GET_INSTANCE_LOCK = null;
    private static final java.lang.String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final java.lang.String TAG = "ShortcutXmlParser";
    private static final java.lang.String TAG_SHORTCUT = "shortcut";
    private static volatile java.util.ArrayList<java.lang.String> sShortcutIds;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.pm.ShortcutXmlParser.GET_INSTANCE_LOCK = r0
            return
    }

    private ShortcutXmlParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getAttributeValue(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r1.getAttributeValue(r0, r2)
            if (r0 != 0) goto Ld
            r0 = 0
            java.lang.String r0 = r1.getAttributeValue(r0, r2)
        Ld:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    public static java.util.List<java.lang.String> getShortcutIds(@androidx.annotation.NonNull android.content.Context r2) {
            java.util.ArrayList<java.lang.String> r0 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds
            if (r0 != 0) goto L20
            java.lang.Object r0 = androidx.core.content.pm.ShortcutXmlParser.GET_INSTANCE_LOCK
            monitor-enter(r0)
            java.util.ArrayList<java.lang.String> r1 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            androidx.core.content.pm.ShortcutXmlParser.sShortcutIds = r1     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList<java.lang.String> r1 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds     // Catch: java.lang.Throwable -> L1d
            java.util.Set r2 = parseShortcutIds(r2)     // Catch: java.lang.Throwable -> L1d
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2
        L20:
            java.util.ArrayList<java.lang.String> r2 = androidx.core.content.pm.ShortcutXmlParser.sShortcutIds
            return r2
    }

    @androidx.annotation.NonNull
    private static android.content.res.XmlResourceParser getXmlResourceParser(android.content.Context r1, android.content.pm.ActivityInfo r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "android.app.shortcuts"
            android.content.res.XmlResourceParser r1 = r2.loadXmlMetaData(r1, r0)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed to open android.app.shortcuts meta-data resource of "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r2 = r2.name
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public static java.util.List<java.lang.String> parseShortcutIds(@androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
        L6:
            int r2 = r6.next()
            if (r2 == r1) goto L39
            r3 = 3
            if (r2 != r3) goto L15
            int r3 = r6.getDepth()
            if (r3 <= 0) goto L39
        L15:
            int r3 = r6.getDepth()
            java.lang.String r4 = r6.getName()
            r5 = 2
            if (r2 != r5) goto L6
            if (r3 != r5) goto L6
            java.lang.String r2 = "shortcut"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            java.lang.String r2 = "shortcutId"
            java.lang.String r2 = getAttributeValue(r6, r2)
            if (r2 != 0) goto L35
            goto L6
        L35:
            r0.add(r2)
            goto L6
        L39:
            return r0
    }

    @androidx.annotation.NonNull
    private static java.util.Set<java.lang.String> parseShortcutIds(@androidx.annotation.NonNull android.content.Context r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.category.LAUNCHER"
            r1.addCategory(r2)
            java.lang.String r2 = r5.getPackageName()
            r1.setPackage(r2)
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r1 = r2.queryIntentActivities(r1, r3)
            if (r1 == 0) goto L6e
            int r2 = r1.size()
            if (r2 != 0) goto L2b
            goto L6e
        L2b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L66
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L66
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch: java.lang.Exception -> L66
            android.content.pm.ActivityInfo r2 = r2.activityInfo     // Catch: java.lang.Exception -> L66
            android.os.Bundle r3 = r2.metaData     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L2f
            java.lang.String r4 = "android.app.shortcuts"
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Exception -> L66
            if (r3 == 0) goto L2f
            android.content.res.XmlResourceParser r2 = getXmlResourceParser(r5, r2)     // Catch: java.lang.Exception -> L66
            java.util.List r3 = parseShortcutIds(r2)     // Catch: java.lang.Throwable -> L5a
            r0.addAll(r3)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.lang.Exception -> L66
            goto L2f
        L5a:
            r5 = move-exception
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Exception -> L66
        L65:
            throw r5     // Catch: java.lang.Exception -> L66
        L66:
            r5 = move-exception
            java.lang.String r1 = "ShortcutXmlParser"
            java.lang.String r2 = "Failed to parse the Xml resource: "
            android.util.Log.e(r1, r2, r5)
        L6e:
            return r0
    }
}
