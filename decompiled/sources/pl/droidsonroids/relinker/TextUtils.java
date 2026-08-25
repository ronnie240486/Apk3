package pl.droidsonroids.relinker;

/* JADX INFO: loaded from: classes2.dex */
final class TextUtils {
    public TextUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isEmpty(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
