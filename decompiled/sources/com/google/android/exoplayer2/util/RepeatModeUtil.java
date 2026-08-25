package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getNextRepeatMode(int r3, int r4) {
            r0 = 1
        L1:
            r1 = 2
            if (r0 > r1) goto L12
            int r1 = r3 + r0
            int r1 = r1 % 3
            boolean r2 = isRepeatModeEnabled(r1, r4)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            return r3
    }

    public static boolean isRepeatModeEnabled(int r3, int r4) {
            r0 = 1
            if (r3 == 0) goto L17
            r1 = 0
            if (r3 == r0) goto L11
            r2 = 2
            if (r3 == r2) goto La
            return r1
        La:
            r3 = r4 & 2
            if (r3 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            r3 = r4 & 1
            if (r3 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }
}
