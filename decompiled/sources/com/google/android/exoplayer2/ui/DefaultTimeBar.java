package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTimeBar extends android.view.View implements com.google.android.exoplayer2.ui.TimeBar {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;

    @androidx.annotation.Nullable
    private long[] adGroupTimesMs;
    private final android.graphics.Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final android.graphics.Rect bufferedBar;
    private final android.graphics.Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private android.graphics.Rect lastExclusionRectangle;
    private final java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar.OnScrubListener> listeners;

    @androidx.annotation.Nullable
    private boolean[] playedAdGroups;
    private final android.graphics.Paint playedAdMarkerPaint;
    private final android.graphics.Paint playedPaint;
    private long position;
    private final android.graphics.Rect progressBar;
    private long scrubPosition;
    private final android.graphics.Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;

    @androidx.annotation.Nullable
    private final android.graphics.drawable.Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final android.graphics.Paint scrubberPaint;
    private float scrubberScale;
    private android.animation.ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final android.graphics.Rect seekBounds;
    private final java.lang.Runnable stopScrubbingRunnable;
    private final android.graphics.Point touchPosition;
    private final int touchTargetHeight;
    private final android.graphics.Paint unplayedPaint;

    public static /* synthetic */ void $r8$lambda$0kViDiRVwCDE5XwNTNyFNxX8LLg(com.google.android.exoplayer2.ui.DefaultTimeBar r0) {
            r0.lambda$new$0()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$TSNFqIHZT-a28zmMBK5qTl_VdZo, reason: not valid java name */
    public static /* synthetic */ void m262$r8$lambda$TSNFqIHZTa28zmMBK5qTl_VdZo(com.google.android.exoplayer2.ui.DefaultTimeBar r0, android.animation.ValueAnimator r1) {
            r0.lambda$new$1(r1)
            return
    }

    public DefaultTimeBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultTimeBar(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultTimeBar(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3, r2)
            return
    }

    public DefaultTimeBar(android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, @androidx.annotation.Nullable android.util.AttributeSet r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultTimeBar(android.content.Context r19, @androidx.annotation.Nullable android.util.AttributeSet r20, int r21, @androidx.annotation.Nullable android.util.AttributeSet r22, int r23) {
            r18 = this;
            r1 = r18
            r0 = r22
            r18.<init>(r19, r20, r21)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.seekBounds = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.progressBar = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.bufferedBar = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.scrubberBar = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.playedPaint = r2
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r1.bufferedPaint = r3
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r1.unplayedPaint = r4
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r1.adMarkerPaint = r5
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r1.playedAdMarkerPaint = r6
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r1.scrubberPaint = r7
            r8 = 1
            r7.setAntiAlias(r8)
            java.util.concurrent.CopyOnWriteArraySet r9 = new java.util.concurrent.CopyOnWriteArraySet
            r9.<init>()
            r1.listeners = r9
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>()
            r1.touchPosition = r9
            android.content.res.Resources r9 = r19.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            r1.density = r9
            r10 = -50
            int r10 = dpToPx(r9, r10)
            r1.fineScrubYThreshold = r10
            r10 = 4
            int r11 = dpToPx(r9, r10)
            r12 = 26
            int r12 = dpToPx(r9, r12)
            int r10 = dpToPx(r9, r10)
            r13 = 12
            int r13 = dpToPx(r9, r13)
            r14 = 0
            int r15 = dpToPx(r9, r14)
            r8 = 16
            int r8 = dpToPx(r9, r8)
            if (r0 == 0) goto L145
            android.content.res.Resources$Theme r9 = r19.getTheme()
            int[] r14 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar
            r17 = r5
            r16 = r6
            r6 = r21
            r5 = r23
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r0, r14, r6, r5)
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_scrubber_drawable     // Catch: java.lang.Throwable -> L140
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)     // Catch: java.lang.Throwable -> L140
            r1.scrubberDrawable = r0     // Catch: java.lang.Throwable -> L140
            if (r0 == 0) goto Lbc
            r1.setDrawableLayoutDirection(r0)     // Catch: java.lang.Throwable -> L140
            int r0 = r0.getMinimumHeight()     // Catch: java.lang.Throwable -> L140
            int r12 = java.lang.Math.max(r0, r12)     // Catch: java.lang.Throwable -> L140
        Lbc:
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_bar_height     // Catch: java.lang.Throwable -> L140
            int r0 = r5.getDimensionPixelSize(r0, r11)     // Catch: java.lang.Throwable -> L140
            r1.barHeight = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_touch_target_height     // Catch: java.lang.Throwable -> L140
            int r0 = r5.getDimensionPixelSize(r0, r12)     // Catch: java.lang.Throwable -> L140
            r1.touchTargetHeight = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_bar_gravity     // Catch: java.lang.Throwable -> L140
            r6 = 0
            int r0 = r5.getInt(r0, r6)     // Catch: java.lang.Throwable -> L140
            r1.barGravity = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_ad_marker_width     // Catch: java.lang.Throwable -> L140
            int r0 = r5.getDimensionPixelSize(r0, r10)     // Catch: java.lang.Throwable -> L140
            r1.adMarkerWidth = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_scrubber_enabled_size     // Catch: java.lang.Throwable -> L140
            int r0 = r5.getDimensionPixelSize(r0, r13)     // Catch: java.lang.Throwable -> L140
            r1.scrubberEnabledSize = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_scrubber_disabled_size     // Catch: java.lang.Throwable -> L140
            int r0 = r5.getDimensionPixelSize(r0, r15)     // Catch: java.lang.Throwable -> L140
            r1.scrubberDisabledSize = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_scrubber_dragged_size     // Catch: java.lang.Throwable -> L140
            int r0 = r5.getDimensionPixelSize(r0, r8)     // Catch: java.lang.Throwable -> L140
            r1.scrubberDraggedSize = r0     // Catch: java.lang.Throwable -> L140
            int r0 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_played_color     // Catch: java.lang.Throwable -> L140
            r6 = -1
            int r0 = r5.getInt(r0, r6)     // Catch: java.lang.Throwable -> L140
            int r8 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_scrubber_color     // Catch: java.lang.Throwable -> L140
            int r6 = r5.getInt(r8, r6)     // Catch: java.lang.Throwable -> L140
            int r8 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_buffered_color     // Catch: java.lang.Throwable -> L140
            r9 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            int r8 = r5.getInt(r8, r9)     // Catch: java.lang.Throwable -> L140
            int r9 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_unplayed_color     // Catch: java.lang.Throwable -> L140
            r10 = 872415231(0x33ffffff, float:1.1920928E-7)
            int r9 = r5.getInt(r9, r10)     // Catch: java.lang.Throwable -> L140
            int r10 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_ad_marker_color     // Catch: java.lang.Throwable -> L140
            r11 = -1291845888(0xffffffffb2ffff00, float:-2.9801868E-8)
            int r10 = r5.getInt(r10, r11)     // Catch: java.lang.Throwable -> L140
            int r11 = com.google.android.exoplayer2.ui.R.styleable.DefaultTimeBar_played_ad_marker_color     // Catch: java.lang.Throwable -> L140
            r12 = 872414976(0x33ffff00, float:1.1920747E-7)
            int r11 = r5.getInt(r11, r12)     // Catch: java.lang.Throwable -> L140
            r2.setColor(r0)     // Catch: java.lang.Throwable -> L140
            r7.setColor(r6)     // Catch: java.lang.Throwable -> L140
            r3.setColor(r8)     // Catch: java.lang.Throwable -> L140
            r4.setColor(r9)     // Catch: java.lang.Throwable -> L140
            r0 = r17
            r0.setColor(r10)     // Catch: java.lang.Throwable -> L140
            r6 = r16
            r6.setColor(r11)     // Catch: java.lang.Throwable -> L140
            r5.recycle()
            goto L177
        L140:
            r0 = move-exception
            r5.recycle()
            throw r0
        L145:
            r0 = r5
            r1.barHeight = r11
            r1.touchTargetHeight = r12
            r5 = 0
            r1.barGravity = r5
            r1.adMarkerWidth = r10
            r1.scrubberEnabledSize = r13
            r1.scrubberDisabledSize = r15
            r1.scrubberDraggedSize = r8
            r5 = -1
            r2.setColor(r5)
            r7.setColor(r5)
            r2 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            r3.setColor(r2)
            r2 = 872415231(0x33ffffff, float:1.1920928E-7)
            r4.setColor(r2)
            r2 = -1291845888(0xffffffffb2ffff00, float:-2.9801868E-8)
            r0.setColor(r2)
            r0 = 872414976(0x33ffff00, float:1.1920747E-7)
            r6.setColor(r0)
            r0 = 0
            r1.scrubberDrawable = r0
        L177:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.formatBuilder = r0
            java.util.Formatter r2 = new java.util.Formatter
            java.util.Locale r3 = java.util.Locale.getDefault()
            r2.<init>(r0, r3)
            r1.formatter = r2
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda1 r0 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda1
            r2 = 0
            r0.<init>(r1, r2)
            r1.stopScrubbingRunnable = r0
            android.graphics.drawable.Drawable r0 = r1.scrubberDrawable
            if (r0 == 0) goto L1a0
            int r0 = r0.getMinimumWidth()
            r2 = 1
            int r0 = r0 + r2
            int r0 = r0 / 2
            r1.scrubberPadding = r0
            goto L1b4
        L1a0:
            r2 = 1
            int r0 = r1.scrubberDisabledSize
            int r3 = r1.scrubberEnabledSize
            int r4 = r1.scrubberDraggedSize
            int r3 = java.lang.Math.max(r3, r4)
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = r0 + r2
            int r0 = r0 / 2
            r1.scrubberPadding = r0
        L1b4:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.scrubberScale = r0
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r1.scrubberScalingAnimator = r0
            com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.ui.DefaultTimeBar$$ExternalSyntheticLambda0
            r3 = 0
            r2.<init>(r1, r3)
            r0.addUpdateListener(r2)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.duration = r2
            r1.keyTimeIncrement = r2
            r0 = 20
            r1.keyCountIncrement = r0
            r0 = 1
            r1.setFocusable(r0)
            int r2 = r18.getImportantForAccessibility()
            if (r2 != 0) goto L1e2
            r1.setImportantForAccessibility(r0)
        L1e2:
            return
    }

    private static int dpToPx(float r0, int r1) {
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    private void drawPlayhead(android.graphics.Canvas r8) {
            r7 = this;
            long r0 = r7.duration
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L9
            return
        L9:
            android.graphics.Rect r0 = r7.scrubberBar
            int r1 = r0.right
            int r0 = r0.left
            android.graphics.Rect r2 = r7.progressBar
            int r2 = r2.right
            int r0 = com.google.android.exoplayer2.util.Util.constrainValue(r1, r0, r2)
            android.graphics.Rect r1 = r7.scrubberBar
            int r1 = r1.centerY()
            android.graphics.drawable.Drawable r2 = r7.scrubberDrawable
            if (r2 != 0) goto L4c
            boolean r2 = r7.scrubbing
            if (r2 != 0) goto L38
            boolean r2 = r7.isFocused()
            if (r2 == 0) goto L2c
            goto L38
        L2c:
            boolean r2 = r7.isEnabled()
            if (r2 == 0) goto L35
            int r2 = r7.scrubberEnabledSize
            goto L3a
        L35:
            int r2 = r7.scrubberDisabledSize
            goto L3a
        L38:
            int r2 = r7.scrubberDraggedSize
        L3a:
            float r2 = (float) r2
            float r3 = r7.scrubberScale
            float r2 = r2 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r2 = (int) r2
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = (float) r2
            android.graphics.Paint r3 = r7.scrubberPaint
            r8.drawCircle(r0, r1, r2, r3)
            goto L76
        L4c:
            int r2 = r2.getIntrinsicWidth()
            float r2 = (float) r2
            float r3 = r7.scrubberScale
            float r2 = r2 * r3
            int r2 = (int) r2
            android.graphics.drawable.Drawable r3 = r7.scrubberDrawable
            int r3 = r3.getIntrinsicHeight()
            float r3 = (float) r3
            float r4 = r7.scrubberScale
            float r3 = r3 * r4
            int r3 = (int) r3
            android.graphics.drawable.Drawable r4 = r7.scrubberDrawable
            int r2 = r2 / 2
            int r5 = r0 - r2
            int r3 = r3 / 2
            int r6 = r1 - r3
            int r0 = r0 + r2
            int r1 = r1 + r3
            r4.setBounds(r5, r6, r0, r1)
            android.graphics.drawable.Drawable r0 = r7.scrubberDrawable
            r0.draw(r8)
        L76:
            return
    }

    private void drawTimeBar(android.graphics.Canvas r17) {
            r16 = this;
            r0 = r16
            android.graphics.Rect r1 = r0.progressBar
            int r1 = r1.height()
            android.graphics.Rect r2 = r0.progressBar
            int r2 = r2.centerY()
            int r3 = r1 / 2
            int r2 = r2 - r3
            int r1 = r1 + r2
            long r3 = r0.duration
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L2c
            android.graphics.Rect r3 = r0.progressBar
            int r4 = r3.left
            float r6 = (float) r4
            float r7 = (float) r2
            int r2 = r3.right
            float r8 = (float) r2
            float r9 = (float) r1
            android.graphics.Paint r10 = r0.unplayedPaint
            r5 = r17
            r5.drawRect(r6, r7, r8, r9, r10)
            return
        L2c:
            android.graphics.Rect r3 = r0.bufferedBar
            int r4 = r3.left
            int r3 = r3.right
            android.graphics.Rect r5 = r0.progressBar
            int r5 = r5.left
            int r5 = java.lang.Math.max(r5, r3)
            android.graphics.Rect r6 = r0.scrubberBar
            int r6 = r6.right
            int r5 = java.lang.Math.max(r5, r6)
            android.graphics.Rect r6 = r0.progressBar
            int r6 = r6.right
            if (r5 >= r6) goto L53
            float r8 = (float) r5
            float r9 = (float) r2
            float r10 = (float) r6
            float r11 = (float) r1
            android.graphics.Paint r12 = r0.unplayedPaint
            r7 = r17
            r7.drawRect(r8, r9, r10, r11, r12)
        L53:
            android.graphics.Rect r5 = r0.scrubberBar
            int r5 = r5.right
            int r4 = java.lang.Math.max(r4, r5)
            if (r3 <= r4) goto L68
            float r6 = (float) r4
            float r7 = (float) r2
            float r8 = (float) r3
            float r9 = (float) r1
            android.graphics.Paint r10 = r0.bufferedPaint
            r5 = r17
            r5.drawRect(r6, r7, r8, r9, r10)
        L68:
            android.graphics.Rect r3 = r0.scrubberBar
            int r3 = r3.width()
            if (r3 <= 0) goto L81
            android.graphics.Rect r3 = r0.scrubberBar
            int r4 = r3.left
            float r6 = (float) r4
            float r7 = (float) r2
            int r3 = r3.right
            float r8 = (float) r3
            float r9 = (float) r1
            android.graphics.Paint r10 = r0.playedPaint
            r5 = r17
            r5.drawRect(r6, r7, r8, r9, r10)
        L81:
            int r3 = r0.adGroupCount
            if (r3 != 0) goto L86
            return
        L86:
            long[] r3 = r0.adGroupTimesMs
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            long[] r3 = (long[]) r3
            boolean[] r4 = r0.playedAdGroups
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            boolean[] r4 = (boolean[]) r4
            int r5 = r0.adMarkerWidth
            int r5 = r5 / 2
            r6 = 0
            r7 = 0
        L9c:
            int r8 = r0.adGroupCount
            if (r7 >= r8) goto Le5
            r9 = r3[r7]
            r11 = 0
            long r13 = r0.duration
            long r8 = com.google.android.exoplayer2.util.Util.constrainValue(r9, r11, r13)
            android.graphics.Rect r10 = r0.progressBar
            int r10 = r10.width()
            long r10 = (long) r10
            long r10 = r10 * r8
            long r8 = r0.duration
            long r10 = r10 / r8
            int r8 = (int) r10
            int r8 = r8 - r5
            android.graphics.Rect r9 = r0.progressBar
            int r10 = r9.left
            int r9 = r9.width()
            int r11 = r0.adMarkerWidth
            int r9 = r9 - r11
            int r8 = java.lang.Math.max(r6, r8)
            int r8 = java.lang.Math.min(r9, r8)
            int r8 = r8 + r10
            boolean r9 = r4[r7]
            if (r9 == 0) goto Ld3
            android.graphics.Paint r9 = r0.playedAdMarkerPaint
            goto Ld5
        Ld3:
            android.graphics.Paint r9 = r0.adMarkerPaint
        Ld5:
            r15 = r9
            float r11 = (float) r8
            float r12 = (float) r2
            int r9 = r0.adMarkerWidth
            int r8 = r8 + r9
            float r13 = (float) r8
            float r14 = (float) r1
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            int r7 = r7 + 1
            goto L9c
        Le5:
            return
    }

    private long getPositionIncrement() {
            r5 = this;
            long r0 = r5.keyTimeIncrement
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            long r0 = r5.duration
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            r0 = 0
            goto L18
        L14:
            int r2 = r5.keyCountIncrement
            long r2 = (long) r2
            long r0 = r0 / r2
        L18:
            return r0
    }

    private java.lang.String getProgressText() {
            r4 = this;
            java.lang.StringBuilder r0 = r4.formatBuilder
            java.util.Formatter r1 = r4.formatter
            long r2 = r4.position
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.getStringForTime(r0, r1, r2)
            return r0
    }

    private long getScrubberPosition() {
            r5 = this;
            android.graphics.Rect r0 = r5.progressBar
            int r0 = r0.width()
            if (r0 <= 0) goto L28
            long r0 = r5.duration
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            goto L28
        L14:
            android.graphics.Rect r0 = r5.scrubberBar
            int r0 = r0.width()
            long r0 = (long) r0
            long r2 = r5.duration
            long r0 = r0 * r2
            android.graphics.Rect r2 = r5.progressBar
            int r2 = r2.width()
            long r2 = (long) r2
            long r0 = r0 / r2
            return r0
        L28:
            r0 = 0
            return r0
    }

    private boolean isInSeekBar(float r2, float r3) {
            r1 = this;
            android.graphics.Rect r0 = r1.seekBounds
            int r2 = (int) r2
            int r3 = (int) r3
            boolean r2 = r0.contains(r2, r3)
            return r2
    }

    private /* synthetic */ void lambda$new$0() {
            r1 = this;
            r0 = 0
            r1.stopScrubbing(r0)
            return
    }

    private /* synthetic */ void lambda$new$1(android.animation.ValueAnimator r1) {
            r0 = this;
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.scrubberScale = r1
            android.graphics.Rect r1 = r0.seekBounds
            r0.invalidate(r1)
            return
    }

    private void positionScrubber(float r4) {
            r3 = this;
            android.graphics.Rect r0 = r3.scrubberBar
            int r4 = (int) r4
            android.graphics.Rect r1 = r3.progressBar
            int r2 = r1.left
            int r1 = r1.right
            int r4 = com.google.android.exoplayer2.util.Util.constrainValue(r4, r2, r1)
            r0.right = r4
            return
    }

    private static int pxToDp(float r0, int r1) {
            float r1 = (float) r1
            float r1 = r1 / r0
            int r0 = (int) r1
            return r0
    }

    private android.graphics.Point resolveRelativeTouchPosition(android.view.MotionEvent r3) {
            r2 = this;
            android.graphics.Point r0 = r2.touchPosition
            float r1 = r3.getX()
            int r1 = (int) r1
            float r3 = r3.getY()
            int r3 = (int) r3
            r0.set(r1, r3)
            android.graphics.Point r3 = r2.touchPosition
            return r3
    }

    private boolean scrubIncrementally(long r10) {
            r9 = this;
            long r4 = r9.duration
            r6 = 0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            return r6
        La:
            boolean r0 = r9.scrubbing
            if (r0 == 0) goto L11
            long r0 = r9.scrubPosition
            goto L13
        L11:
            long r0 = r9.position
        L13:
            r7 = r0
            long r0 = r7 + r10
            r2 = 0
            long r10 = com.google.android.exoplayer2.util.Util.constrainValue(r0, r2, r4)
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L21
            return r6
        L21:
            boolean r0 = r9.scrubbing
            if (r0 != 0) goto L29
            r9.startScrubbing(r10)
            goto L2c
        L29:
            r9.updateScrubbing(r10)
        L2c:
            r9.update()
            r10 = 1
            return r10
    }

    private boolean setDrawableLayoutDirection(android.graphics.drawable.Drawable r3) {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L12
            int r0 = r2.getLayoutDirection()
            boolean r3 = setDrawableLayoutDirection(r3, r0)
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
    }

    private static boolean setDrawableLayoutDirection(android.graphics.drawable.Drawable r2, int r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto Le
            boolean r2 = r2.setLayoutDirection(r3)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @androidx.annotation.RequiresApi(29)
    private void setSystemGestureExclusionRectsV29(int r3, int r4) {
            r2 = this;
            android.graphics.Rect r0 = r2.lastExclusionRectangle
            if (r0 == 0) goto L13
            int r0 = r0.width()
            if (r0 != r3) goto L13
            android.graphics.Rect r0 = r2.lastExclusionRectangle
            int r0 = r0.height()
            if (r0 != r4) goto L13
            return
        L13:
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 0
            r0.<init>(r1, r1, r3, r4)
            r2.lastExclusionRectangle = r0
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r2.setSystemGestureExclusionRects(r3)
            return
    }

    private void startScrubbing(long r3) {
            r2 = this;
            r2.scrubPosition = r3
            r0 = 1
            r2.scrubbing = r0
            r2.setPressed(r0)
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L11
            r1.requestDisallowInterceptTouchEvent(r0)
        L11:
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar$OnScrubListener> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ui.TimeBar$OnScrubListener r1 = (com.google.android.exoplayer2.ui.TimeBar.OnScrubListener) r1
            r1.onScrubStart(r2, r3)
            goto L17
        L27:
            return
    }

    private void stopScrubbing(boolean r5) {
            r4 = this;
            java.lang.Runnable r0 = r4.stopScrubbingRunnable
            r4.removeCallbacks(r0)
            r0 = 0
            r4.scrubbing = r0
            r4.setPressed(r0)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L14
            r1.requestDisallowInterceptTouchEvent(r0)
        L14:
            r4.invalidate()
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar$OnScrubListener> r0 = r4.listeners
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ui.TimeBar$OnScrubListener r1 = (com.google.android.exoplayer2.ui.TimeBar.OnScrubListener) r1
            long r2 = r4.scrubPosition
            r1.onScrubStop(r4, r2, r5)
            goto L1d
        L2f:
            return
    }

    private void update() {
            r7 = this;
            android.graphics.Rect r0 = r7.bufferedBar
            android.graphics.Rect r1 = r7.progressBar
            r0.set(r1)
            android.graphics.Rect r0 = r7.scrubberBar
            android.graphics.Rect r1 = r7.progressBar
            r0.set(r1)
            boolean r0 = r7.scrubbing
            if (r0 == 0) goto L15
            long r0 = r7.scrubPosition
            goto L17
        L15:
            long r0 = r7.position
        L17:
            long r2 = r7.duration
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L5a
            android.graphics.Rect r2 = r7.progressBar
            int r2 = r2.width()
            long r2 = (long) r2
            long r4 = r7.bufferedPosition
            long r2 = r2 * r4
            long r4 = r7.duration
            long r2 = r2 / r4
            int r3 = (int) r2
            android.graphics.Rect r2 = r7.bufferedBar
            android.graphics.Rect r4 = r7.progressBar
            int r5 = r4.left
            int r5 = r5 + r3
            int r3 = r4.right
            int r3 = java.lang.Math.min(r5, r3)
            r2.right = r3
            android.graphics.Rect r2 = r7.progressBar
            int r2 = r2.width()
            long r2 = (long) r2
            long r2 = r2 * r0
            long r0 = r7.duration
            long r2 = r2 / r0
            int r0 = (int) r2
            android.graphics.Rect r1 = r7.scrubberBar
            android.graphics.Rect r2 = r7.progressBar
            int r3 = r2.left
            int r3 = r3 + r0
            int r0 = r2.right
            int r0 = java.lang.Math.min(r3, r0)
            r1.right = r0
            goto L66
        L5a:
            android.graphics.Rect r0 = r7.bufferedBar
            android.graphics.Rect r1 = r7.progressBar
            int r1 = r1.left
            r0.right = r1
            android.graphics.Rect r0 = r7.scrubberBar
            r0.right = r1
        L66:
            android.graphics.Rect r0 = r7.seekBounds
            r7.invalidate(r0)
            return
    }

    private void updateDrawableState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.scrubberDrawable
            if (r0 == 0) goto L19
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r0 = r2.scrubberDrawable
            int[] r1 = r2.getDrawableState()
            boolean r0 = r0.setState(r1)
            if (r0 == 0) goto L19
            r2.invalidate()
        L19:
            return
    }

    private void updateScrubbing(long r4) {
            r3 = this;
            long r0 = r3.scrubPosition
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r3.scrubPosition = r4
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar$OnScrubListener> r0 = r3.listeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.ui.TimeBar$OnScrubListener r1 = (com.google.android.exoplayer2.ui.TimeBar.OnScrubListener) r1
            r1.onScrubMove(r3, r4)
            goto Lf
        L1f:
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void addListener(com.google.android.exoplayer2.ui.TimeBar.OnScrubListener r2) {
            r1 = this;
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar$OnScrubListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            r0.updateDrawableState()
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public long getPreferredUpdateDelay() {
            r6 = this;
            float r0 = r6.density
            android.graphics.Rect r1 = r6.progressBar
            int r1 = r1.width()
            int r0 = pxToDp(r0, r1)
            if (r0 == 0) goto L23
            long r1 = r6.duration
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L23
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L20
            goto L23
        L20:
            long r3 = (long) r0
            long r1 = r1 / r3
            goto L28
        L23:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L28:
            return r1
    }

    public void hideScrubber(long r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto Ld
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            r0.cancel()
        Ld:
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            float r3 = r4.scrubberScale
            r1[r2] = r3
            r2 = 1
            r3 = 0
            r1[r2] = r3
            r0.setFloatValues(r1)
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            r0.setDuration(r5)
            android.animation.ValueAnimator r5 = r4.scrubberScalingAnimator
            r5.start()
            return
    }

    public void hideScrubber(boolean r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.scrubberScalingAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto Ld
            android.animation.ValueAnimator r0 = r1.scrubberScalingAnimator
            r0.cancel()
        Ld:
            r1.scrubberPaddingDisabled = r2
            r2 = 0
            r1.scrubberScale = r2
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.scrubberDrawable
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            r1.save()
            r0.drawTimeBar(r1)
            r0.drawPlayhead(r1)
            r1.restore()
            return
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, @androidx.annotation.Nullable android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            boolean r2 = r0.scrubbing
            if (r2 == 0) goto Ld
            if (r1 != 0) goto Ld
            r1 = 0
            r0.stopScrubbing(r1)
        Ld:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.onInitializeAccessibilityEvent(r3)
            int r0 = r3.getEventType()
            r1 = 4
            if (r0 != r1) goto L15
            java.util.List r0 = r3.getText()
            java.lang.String r1 = r2.getProgressText()
            r0.add(r1)
        L15:
            java.lang.String r0 = "android.widget.SeekBar"
            r3.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            java.lang.String r0 = "android.widget.SeekBar"
            r6.setClassName(r0)
            java.lang.String r0 = r5.getProgressText()
            r6.setContentDescription(r0)
            long r0 = r5.duration
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L18
            return
        L18:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L29
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD
            r6.addAction(r0)
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD
            r6.addAction(r0)
            goto L33
        L29:
            r0 = 4096(0x1000, float:5.74E-42)
            r6.addAction(r0)
            r0 = 8192(0x2000, float:1.148E-41)
            r6.addAction(r0)
        L33:
            return
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.scrubIncrementally(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.stopScrubbingRunnable
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.stopScrubbingRunnable
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.scrubbing
            if (r0 == 0) goto L30
            r5 = 0
            r4.stopScrubbing(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
    }

    @Override // android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r8 = r8 - r6
            int r9 = r9 - r7
            int r5 = r4.getPaddingLeft()
            int r6 = r4.getPaddingRight()
            int r6 = r8 - r6
            boolean r7 = r4.scrubberPaddingDisabled
            r0 = 0
            if (r7 == 0) goto L13
            r7 = 0
            goto L15
        L13:
            int r7 = r4.scrubberPadding
        L15:
            int r1 = r4.barGravity
            r2 = 1
            if (r1 != r2) goto L36
            int r1 = r4.getPaddingBottom()
            int r1 = r9 - r1
            int r2 = r4.touchTargetHeight
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r2 = r9 - r2
            int r3 = r4.barHeight
            int r2 = r2 - r3
            int r3 = r3 / 2
            int r3 = r7 - r3
            int r0 = java.lang.Math.max(r3, r0)
            int r2 = r2 - r0
            goto L42
        L36:
            int r0 = r4.touchTargetHeight
            int r0 = r9 - r0
            int r1 = r0 / 2
            int r0 = r4.barHeight
            int r0 = r9 - r0
            int r2 = r0 / 2
        L42:
            android.graphics.Rect r0 = r4.seekBounds
            int r3 = r4.touchTargetHeight
            int r3 = r3 + r1
            r0.set(r5, r1, r6, r3)
            android.graphics.Rect r5 = r4.progressBar
            android.graphics.Rect r6 = r4.seekBounds
            int r0 = r6.left
            int r0 = r0 + r7
            int r6 = r6.right
            int r6 = r6 - r7
            int r7 = r4.barHeight
            int r7 = r7 + r2
            r5.set(r0, r2, r6, r7)
            int r5 = com.google.android.exoplayer2.util.Util.SDK_INT
            r6 = 29
            if (r5 < r6) goto L63
            r4.setSystemGestureExclusionRectsV29(r8, r9)
        L63:
            r4.update()
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            if (r0 != 0) goto Ld
            int r4 = r2.touchTargetHeight
            goto L18
        Ld:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L18
        L12:
            int r0 = r2.touchTargetHeight
            int r4 = java.lang.Math.min(r0, r4)
        L18:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r2.setMeasuredDimension(r3, r4)
            r2.updateDrawableState()
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.scrubberDrawable
            if (r0 == 0) goto Ld
            boolean r2 = setDrawableLayoutDirection(r0, r2)
            if (r2 == 0) goto Ld
            r1.invalidate()
        Ld:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.duration
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.resolveRelativeTouchPosition(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.scrubbing
            if (r8 == 0) goto L76
            int r8 = r7.fineScrubYThreshold
            if (r0 >= r8) goto L3a
            int r8 = r7.lastCoarseScrubXPosition
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.positionScrubber(r8)
            goto L40
        L3a:
            r7.lastCoarseScrubXPosition = r2
            float r8 = (float) r2
            r7.positionScrubber(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.updateScrubbing(r0)
            r7.update()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.scrubbing
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = 1
        L59:
            r7.stopScrubbing(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.isInSeekBar(r8, r0)
            if (r0 == 0) goto L76
            r7.positionScrubber(r8)
            long r0 = r7.getScrubberPosition()
            r7.startScrubbing(r0)
            r7.update()
            r7.invalidate()
            return r4
        L76:
            return r1
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int r7, @androidx.annotation.Nullable android.os.Bundle r8) {
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L8
            return r0
        L8:
            long r1 = r6.duration
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            return r8
        L12:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r7 != r1) goto L25
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.scrubIncrementally(r1)
            if (r7 == 0) goto L36
            r6.stopScrubbing(r8)
            goto L36
        L25:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L3b
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.scrubIncrementally(r1)
            if (r7 == 0) goto L36
            r6.stopScrubbing(r8)
        L36:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L3b:
            return r8
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void removeListener(com.google.android.exoplayer2.ui.TimeBar.OnScrubListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar$OnScrubListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setAdGroupTimesMs(@androidx.annotation.Nullable long[] r2, @androidx.annotation.Nullable boolean[] r3, int r4) {
            r1 = this;
            if (r4 == 0) goto L9
            if (r2 == 0) goto L7
            if (r3 == 0) goto L7
            goto L9
        L7:
            r0 = 0
            goto La
        L9:
            r0 = 1
        La:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r1.adGroupCount = r4
            r1.adGroupTimesMs = r2
            r1.playedAdGroups = r3
            r1.update()
            return
    }

    public void setAdMarkerColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.adMarkerPaint
            r0.setColor(r2)
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    public void setBufferedColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.bufferedPaint
            r0.setColor(r2)
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setBufferedPosition(long r4) {
            r3 = this;
            long r0 = r3.bufferedPosition
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r3.bufferedPosition = r4
            r3.update()
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setDuration(long r4) {
            r3 = this;
            long r0 = r3.duration
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r3.duration = r4
            boolean r0 = r3.scrubbing
            if (r0 == 0) goto L1a
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            r4 = 1
            r3.stopScrubbing(r4)
        L1a:
            r3.update()
            return
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.TimeBar
    public void setEnabled(boolean r2) {
            r1 = this;
            super.setEnabled(r2)
            boolean r0 = r1.scrubbing
            if (r0 == 0) goto Ld
            if (r2 != 0) goto Ld
            r2 = 1
            r1.stopScrubbing(r2)
        Ld:
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyCountIncrement(int r3) {
            r2 = this;
            if (r3 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r2.keyCountIncrement = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.keyTimeIncrement = r0
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyTimeIncrement(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r0 = -1
            r3.keyCountIncrement = r0
            r3.keyTimeIncrement = r4
            return
    }

    public void setPlayedAdMarkerColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.playedAdMarkerPaint
            r0.setColor(r2)
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    public void setPlayedColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.playedPaint
            r0.setColor(r2)
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setPosition(long r4) {
            r3 = this;
            long r0 = r3.position
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            r3.position = r4
            java.lang.String r4 = r3.getProgressText()
            r3.setContentDescription(r4)
            r3.update()
            return
    }

    public void setScrubberColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.scrubberPaint
            r0.setColor(r2)
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    public void setUnplayedColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.unplayedPaint
            r0.setColor(r2)
            android.graphics.Rect r2 = r1.seekBounds
            r1.invalidate(r2)
            return
    }

    public void showScrubber() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.scrubberScalingAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto Ld
            android.animation.ValueAnimator r0 = r1.scrubberScalingAnimator
            r0.cancel()
        Ld:
            r0 = 0
            r1.scrubberPaddingDisabled = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.scrubberScale = r0
            android.graphics.Rect r0 = r1.seekBounds
            r1.invalidate(r0)
            return
    }

    public void showScrubber(long r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto Ld
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            r0.cancel()
        Ld:
            r0 = 0
            r4.scrubberPaddingDisabled = r0
            android.animation.ValueAnimator r1 = r4.scrubberScalingAnimator
            r2 = 2
            float[] r2 = new float[r2]
            float r3 = r4.scrubberScale
            r2[r0] = r3
            r0 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            r2[r0] = r3
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r0 = r4.scrubberScalingAnimator
            r0.setDuration(r5)
            android.animation.ValueAnimator r5 = r4.scrubberScalingAnimator
            r5.start()
            return
    }
}
