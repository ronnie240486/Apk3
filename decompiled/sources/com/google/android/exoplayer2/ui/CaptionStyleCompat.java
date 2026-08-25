package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public final class CaptionStyleCompat {
    public static final com.google.android.exoplayer2.ui.CaptionStyleCompat DEFAULT = null;
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int USE_TRACK_COLOR_SETTINGS = 1;
    public final int backgroundColor;
    public final int edgeColor;
    public final int edgeType;
    public final int foregroundColor;

    @androidx.annotation.Nullable
    public final android.graphics.Typeface typeface;
    public final int windowColor;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    static {
            com.google.android.exoplayer2.ui.CaptionStyleCompat r7 = new com.google.android.exoplayer2.ui.CaptionStyleCompat
            r1 = -1
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT = r7
            return
    }

    public CaptionStyleCompat(int r1, int r2, int r3, int r4, int r5, @androidx.annotation.Nullable android.graphics.Typeface r6) {
            r0 = this;
            r0.<init>()
            r0.foregroundColor = r1
            r0.backgroundColor = r2
            r0.windowColor = r3
            r0.edgeType = r4
            r0.edgeColor = r5
            r0.typeface = r6
            return
    }

    @androidx.annotation.RequiresApi(19)
    public static com.google.android.exoplayer2.ui.CaptionStyleCompat createFromCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle r2) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto Lb
            com.google.android.exoplayer2.ui.CaptionStyleCompat r2 = createFromCaptionStyleV21(r2)
            return r2
        Lb:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r2 = createFromCaptionStyleV19(r2)
            return r2
    }

    @androidx.annotation.RequiresApi(19)
    private static com.google.android.exoplayer2.ui.CaptionStyleCompat createFromCaptionStyleV19(android.view.accessibility.CaptioningManager.CaptionStyle r8) {
            com.google.android.exoplayer2.ui.CaptionStyleCompat r7 = new com.google.android.exoplayer2.ui.CaptionStyleCompat
            int r1 = r8.foregroundColor
            int r2 = r8.backgroundColor
            int r4 = r8.edgeType
            int r5 = r8.edgeColor
            android.graphics.Typeface r6 = r8.getTypeface()
            r3 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @androidx.annotation.RequiresApi(21)
    private static com.google.android.exoplayer2.ui.CaptionStyleCompat createFromCaptionStyleV21(android.view.accessibility.CaptioningManager.CaptionStyle r8) {
            com.google.android.exoplayer2.ui.CaptionStyleCompat r7 = new com.google.android.exoplayer2.ui.CaptionStyleCompat
            boolean r0 = r8.hasForegroundColor()
            if (r0 == 0) goto Lb
            int r0 = r8.foregroundColor
            goto Lf
        Lb:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            int r0 = r0.foregroundColor
        Lf:
            r1 = r0
            boolean r0 = r8.hasBackgroundColor()
            if (r0 == 0) goto L19
            int r0 = r8.backgroundColor
            goto L1d
        L19:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            int r0 = r0.backgroundColor
        L1d:
            r2 = r0
            boolean r0 = r8.hasWindowColor()
            if (r0 == 0) goto L27
            int r0 = r8.windowColor
            goto L2b
        L27:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            int r0 = r0.windowColor
        L2b:
            r3 = r0
            boolean r0 = r8.hasEdgeType()
            if (r0 == 0) goto L35
            int r0 = r8.edgeType
            goto L39
        L35:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            int r0 = r0.edgeType
        L39:
            r4 = r0
            boolean r0 = r8.hasEdgeColor()
            if (r0 == 0) goto L43
            int r0 = r8.edgeColor
            goto L47
        L43:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            int r0 = r0.edgeColor
        L47:
            r5 = r0
            android.graphics.Typeface r6 = r8.getTypeface()
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
