package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class MapUtils {
    public MapUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeStringMapToJson(@androidx.annotation.NonNull java.lang.StringBuilder r5, @androidx.annotation.NonNull java.util.HashMap<java.lang.String, java.lang.String> r6) {
            java.lang.String r0 = "{"
            r5.append(r0)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 1
        L10:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 != 0) goto L23
            java.lang.String r2 = ","
            r5.append(r2)
        L23:
            java.lang.Object r2 = r6.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "\""
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "\":"
            r5.append(r3)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "null"
            r5.append(r2)
            goto L47
        L3e:
            r5.append(r4)
            r5.append(r2)
            r5.append(r4)
        L47:
            r2 = 0
            goto L10
        L49:
            java.lang.String r6 = "}"
            r5.append(r6)
            return
    }
}
