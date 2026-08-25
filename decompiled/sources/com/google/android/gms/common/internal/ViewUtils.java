package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class ViewUtils {
    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getXmlAttributeString(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull android.util.AttributeSet r6, boolean r7, boolean r8, @androidx.annotation.NonNull java.lang.String r9) {
            if (r6 != 0) goto L4
            r3 = 0
            goto L8
        L4:
            java.lang.String r3 = r6.getAttributeValue(r3, r4)
        L8:
            if (r3 == 0) goto L9d
            java.lang.String r6 = "@string/"
            boolean r6 = r3.startsWith(r6)
            if (r6 == 0) goto L9d
            if (r7 == 0) goto L9d
            r6 = 8
            java.lang.String r7 = r3.substring(r6)
            java.lang.String r0 = r5.getPackageName()
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources r5 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L52
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r2 = r2.length()     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r2 = r2 + r6
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r6 = r6.length()     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L52
            r6.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L52
            r6.append(r0)     // Catch: android.content.res.Resources.NotFoundException -> L52
            java.lang.String r0 = ":string/"
            r6.append(r0)     // Catch: android.content.res.Resources.NotFoundException -> L52
            r6.append(r7)     // Catch: android.content.res.Resources.NotFoundException -> L52
            java.lang.String r6 = r6.toString()     // Catch: android.content.res.Resources.NotFoundException -> L52
            r7 = 1
            r5.getValue(r6, r1, r7)     // Catch: android.content.res.Resources.NotFoundException -> L52
            goto L71
        L52:
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 30
            int r7 = r3.length()
            int r7 = r7 + r5
            r6.<init>(r7)
            java.lang.String r5 = "Could not find resource for "
            java.lang.String r7 = ": "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6, r5, r4, r7, r3)
            android.util.Log.w(r9, r5)
        L71:
            java.lang.CharSequence r5 = r1.string
            if (r5 == 0) goto L7a
            java.lang.String r3 = r5.toString()
            goto L9d
        L7a:
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 28
            int r0 = r5.length()
            int r0 = r0 + r6
            r7.<init>(r0)
            java.lang.String r6 = "Resource "
            java.lang.String r0 = " was not a string: "
            java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7, r6, r4, r0, r5)
            android.util.Log.w(r9, r5)
        L9d:
            if (r8 == 0) goto Lc4
            if (r3 != 0) goto Lc4
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 33
            r6.<init>(r5)
            java.lang.String r5 = "Required XML attribute \""
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "\" missing"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.w(r9, r4)
        Lc4:
            return r3
    }
}
