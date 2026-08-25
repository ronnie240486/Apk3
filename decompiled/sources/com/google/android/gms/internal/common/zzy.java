package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzy {
    public static java.lang.String zza(@javax.annotation.CheckForNull java.lang.String r11, @javax.annotation.CheckForNull java.lang.Object... r12) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r12.length
            if (r1 >= r2) goto L99
            r2 = r12[r1]
            if (r2 != 0) goto Ld
            java.lang.String r2 = "null"
            goto L93
        Ld:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L13
            goto L93
        L13:
            r9 = move-exception
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r4 = r3.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 1
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r3)
            r3 = 64
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = "com.google.common.base.Strings"
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r5 = "Exception during lenientFormat for "
            int r6 = r2.length()
            if (r6 == 0) goto L5d
            java.lang.String r5 = r5.concat(r2)
            r7 = r5
            goto L63
        L5d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            r7 = r6
        L63:
            java.lang.String r5 = "com.google.common.base.Strings"
            java.lang.String r6 = "lenientToString"
            r8 = r9
            r3.logp(r4, r5, r6, r7, r8)
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r2.length()
            int r6 = r6 + 9
            int r6 = r6 + r4
            r5.<init>(r6)
            java.lang.String r4 = "<"
            java.lang.String r6 = " threw "
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r4, r2, r6, r3)
            java.lang.String r2 = ">"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L93:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L2
        L99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r11.length()
            int r2 = r2 * 16
            int r2 = r2 + r3
            r1.<init>(r2)
            r2 = 0
        La6:
            int r3 = r12.length
            if (r0 >= r3) goto Lc3
            java.lang.String r4 = "%s"
            int r4 = r11.indexOf(r4, r2)
            r5 = -1
            if (r4 != r5) goto Lb3
            goto Lc3
        Lb3:
            r1.append(r11, r2, r4)
            int r2 = r0 + 1
            r0 = r12[r0]
            r1.append(r0)
            int r0 = r4 + 2
            r10 = r2
            r2 = r0
            r0 = r10
            goto La6
        Lc3:
            int r4 = r11.length()
            r1.append(r11, r2, r4)
            if (r0 >= r3) goto Lee
            java.lang.String r11 = " ["
            r1.append(r11)
            int r11 = r0 + 1
            r0 = r12[r0]
            r1.append(r0)
        Ld8:
            int r0 = r12.length
            if (r11 >= r0) goto Le9
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r11 + 1
            r11 = r12[r11]
            r1.append(r11)
            r11 = r0
            goto Ld8
        Le9:
            r11 = 93
            r1.append(r11)
        Lee:
            java.lang.String r11 = r1.toString()
            return r11
    }
}
