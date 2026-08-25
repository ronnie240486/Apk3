package com.google.android.exoplayer2.text.span;

/* JADX INFO: loaded from: classes2.dex */
public final class SpanUtil {
    private SpanUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addOrReplaceSpan(android.text.Spannable r5, java.lang.Object r6, int r7, int r8, int r9) {
            java.lang.Class r0 = r6.getClass()
            java.lang.Object[] r0 = r5.getSpans(r7, r8, r0)
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            int r4 = r5.getSpanStart(r3)
            if (r4 != r7) goto L23
            int r4 = r5.getSpanEnd(r3)
            if (r4 != r8) goto L23
            int r4 = r5.getSpanFlags(r3)
            if (r4 != r9) goto L23
            r5.removeSpan(r3)
        L23:
            int r2 = r2 + 1
            goto La
        L26:
            r5.setSpan(r6, r7, r8, r9)
            return
    }
}
