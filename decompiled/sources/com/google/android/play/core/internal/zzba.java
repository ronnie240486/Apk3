package com.google.android.play.core.internal;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba {
    public static com.google.android.play.core.internal.zzaz zza() {
            int r0 = android.os.Build.VERSION.SDK_INT
            switch(r0) {
                case 21: goto L2e;
                case 22: goto L28;
                case 23: goto L22;
                case 24: goto L1c;
                case 25: goto L16;
                case 26: goto L10;
                case 27: goto L6;
                default: goto L5;
            }
        L5:
            goto L34
        L6:
            int r0 = android.os.Build.VERSION.PREVIEW_SDK_INT
            if (r0 != 0) goto L34
            com.google.android.play.core.internal.zzbq r0 = new com.google.android.play.core.internal.zzbq
            r0.<init>()
            return r0
        L10:
            com.google.android.play.core.internal.zzbp r0 = new com.google.android.play.core.internal.zzbp
            r0.<init>()
            return r0
        L16:
            com.google.android.play.core.internal.zzbm r0 = new com.google.android.play.core.internal.zzbm
            r0.<init>()
            return r0
        L1c:
            com.google.android.play.core.internal.zzbl r0 = new com.google.android.play.core.internal.zzbl
            r0.<init>()
            return r0
        L22:
            com.google.android.play.core.internal.zzbk r0 = new com.google.android.play.core.internal.zzbk
            r0.<init>()
            return r0
        L28:
            com.google.android.play.core.internal.zzbg r0 = new com.google.android.play.core.internal.zzbg
            r0.<init>()
            return r0
        L2e:
            com.google.android.play.core.internal.zzbf r0 = new com.google.android.play.core.internal.zzbf
            r0.<init>()
            return r0
        L34:
            com.google.android.play.core.internal.zzbs r0 = new com.google.android.play.core.internal.zzbs
            r0.<init>()
            return r0
    }
}
