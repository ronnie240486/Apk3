package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends android.widget.FrameLayout {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private java.util.List<com.google.android.exoplayer2.text.Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private android.view.View innerSubtitleView;
    private com.google.android.exoplayer2.ui.SubtitleView.Output output;
    private com.google.android.exoplayer2.ui.CaptionStyleCompat style;
    private int viewType;

    /* JADX INFO: loaded from: classes.dex */
    public interface Output {
        void update(java.util.List<com.google.android.exoplayer2.text.Cue> r1, com.google.android.exoplayer2.ui.CaptionStyleCompat r2, float r3, int r4, float r5);
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SubtitleView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            java.util.List r3 = java.util.Collections.emptyList()
            r1.cues = r3
            com.google.android.exoplayer2.ui.CaptionStyleCompat r3 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            r1.style = r3
            r3 = 0
            r1.defaultTextSizeType = r3
            r3 = 1029329178(0x3d5a511a, float:0.0533)
            r1.defaultTextSize = r3
            r3 = 1034147594(0x3da3d70a, float:0.08)
            r1.bottomPaddingFraction = r3
            r3 = 1
            r1.applyEmbeddedStyles = r3
            r1.applyEmbeddedFontSizes = r3
            com.google.android.exoplayer2.ui.CanvasSubtitleOutput r0 = new com.google.android.exoplayer2.ui.CanvasSubtitleOutput
            r0.<init>(r2)
            r1.output = r0
            r1.innerSubtitleView = r0
            r1.addView(r0)
            r1.viewType = r3
            return
    }

    private java.util.List<com.google.android.exoplayer2.text.Cue> getCuesWithStylingPreferencesApplied() {
            r3 = this;
            boolean r0 = r3.applyEmbeddedStyles
            if (r0 == 0) goto Lb
            boolean r0 = r3.applyEmbeddedFontSizes
            if (r0 == 0) goto Lb
            java.util.List<com.google.android.exoplayer2.text.Cue> r0 = r3.cues
            return r0
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.google.android.exoplayer2.text.Cue> r1 = r3.cues
            int r1 = r1.size()
            r0.<init>(r1)
            r1 = 0
        L17:
            java.util.List<com.google.android.exoplayer2.text.Cue> r2 = r3.cues
            int r2 = r2.size()
            if (r1 >= r2) goto L31
            java.util.List<com.google.android.exoplayer2.text.Cue> r2 = r3.cues
            java.lang.Object r2 = r2.get(r1)
            com.google.android.exoplayer2.text.Cue r2 = (com.google.android.exoplayer2.text.Cue) r2
            com.google.android.exoplayer2.text.Cue r2 = r3.removeEmbeddedStyling(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L17
        L31:
            return r0
    }

    private float getUserCaptionFontScale() {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 19
            if (r0 < r2) goto L27
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto Lf
            goto L27
        Lf:
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "captioning"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.accessibility.CaptioningManager r0 = (android.view.accessibility.CaptioningManager) r0
            if (r0 == 0) goto L27
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L27
            float r1 = r0.getFontScale()
        L27:
            return r1
    }

    private com.google.android.exoplayer2.ui.CaptionStyleCompat getUserCaptionStyle() {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 19
            if (r0 < r1) goto L2d
            boolean r0 = r2.isInEditMode()
            if (r0 == 0) goto Ld
            goto L2d
        Ld:
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "captioning"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.CaptioningManager r0 = (android.view.accessibility.CaptioningManager) r0
            if (r0 == 0) goto L2a
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L2a
            android.view.accessibility.CaptioningManager$CaptionStyle r0 = r0.getUserStyle()
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.createFromCaptionStyle(r0)
            goto L2c
        L2a:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
        L2c:
            return r0
        L2d:
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT
            return r0
    }

    private com.google.android.exoplayer2.text.Cue removeEmbeddedStyling(com.google.android.exoplayer2.text.Cue r2) {
            r1 = this;
            com.google.android.exoplayer2.text.Cue$Builder r2 = r2.buildUpon()
            boolean r0 = r1.applyEmbeddedStyles
            if (r0 != 0) goto Lc
            com.google.android.exoplayer2.ui.SubtitleViewUtils.removeAllEmbeddedStyling(r2)
            goto L13
        Lc:
            boolean r0 = r1.applyEmbeddedFontSizes
            if (r0 != 0) goto L13
            com.google.android.exoplayer2.ui.SubtitleViewUtils.removeEmbeddedFontSizes(r2)
        L13:
            com.google.android.exoplayer2.text.Cue r2 = r2.build()
            return r2
    }

    private void setTextSize(int r1, float r2) {
            r0 = this;
            r0.defaultTextSizeType = r1
            r0.defaultTextSize = r2
            r0.updateOutput()
            return
    }

    private <T extends android.view.View & com.google.android.exoplayer2.ui.SubtitleView.Output> void setView(T r3) {
            r2 = this;
            android.view.View r0 = r2.innerSubtitleView
            r2.removeView(r0)
            android.view.View r0 = r2.innerSubtitleView
            boolean r1 = r0 instanceof com.google.android.exoplayer2.ui.WebViewSubtitleOutput
            if (r1 == 0) goto L10
            com.google.android.exoplayer2.ui.WebViewSubtitleOutput r0 = (com.google.android.exoplayer2.ui.WebViewSubtitleOutput) r0
            r0.destroy()
        L10:
            r2.innerSubtitleView = r3
            r0 = r3
            com.google.android.exoplayer2.ui.SubtitleView$Output r0 = (com.google.android.exoplayer2.ui.SubtitleView.Output) r0
            r2.output = r0
            r2.addView(r3)
            return
    }

    private void updateOutput() {
            r6 = this;
            com.google.android.exoplayer2.ui.SubtitleView$Output r0 = r6.output
            java.util.List r1 = r6.getCuesWithStylingPreferencesApplied()
            com.google.android.exoplayer2.ui.CaptionStyleCompat r2 = r6.style
            float r3 = r6.defaultTextSize
            int r4 = r6.defaultTextSizeType
            float r5 = r6.bottomPaddingFraction
            r0.update(r1, r2, r3, r4, r5)
            return
    }

    public void setApplyEmbeddedFontSizes(boolean r1) {
            r0 = this;
            r0.applyEmbeddedFontSizes = r1
            r0.updateOutput()
            return
    }

    public void setApplyEmbeddedStyles(boolean r1) {
            r0 = this;
            r0.applyEmbeddedStyles = r1
            r0.updateOutput()
            return
    }

    public void setBottomPaddingFraction(float r1) {
            r0 = this;
            r0.bottomPaddingFraction = r1
            r0.updateOutput()
            return
    }

    public void setCues(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.text.Cue> r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L7
        L3:
            java.util.List r1 = java.util.Collections.emptyList()
        L7:
            r0.cues = r1
            r0.updateOutput()
            return
    }

    public void setFixedTextSize(@androidx.annotation.Dimension int r3, float r4) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 != 0) goto Lb
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Lf
        Lb:
            android.content.res.Resources r0 = r0.getResources()
        Lf:
            r1 = 2
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            r2.setTextSize(r1, r3)
            return
    }

    public void setFractionalTextSize(float r2) {
            r1 = this;
            r0 = 0
            r1.setFractionalTextSize(r2, r0)
            return
    }

    public void setFractionalTextSize(float r1, boolean r2) {
            r0 = this;
            r0.setTextSize(r2, r1)
            return
    }

    public void setStyle(com.google.android.exoplayer2.ui.CaptionStyleCompat r1) {
            r0 = this;
            r0.style = r1
            r0.updateOutput()
            return
    }

    public void setUserDefaultStyle() {
            r1 = this;
            com.google.android.exoplayer2.ui.CaptionStyleCompat r0 = r1.getUserCaptionStyle()
            r1.setStyle(r0)
            return
    }

    public void setUserDefaultTextSize() {
            r2 = this;
            float r0 = r2.getUserCaptionFontScale()
            r1 = 1029329178(0x3d5a511a, float:0.0533)
            float r0 = r0 * r1
            r2.setFractionalTextSize(r0)
            return
    }

    public void setViewType(int r3) {
            r2 = this;
            int r0 = r2.viewType
            if (r0 != r3) goto L5
            return
        L5:
            r0 = 1
            if (r3 == r0) goto L1e
            r0 = 2
            if (r3 != r0) goto L18
            com.google.android.exoplayer2.ui.WebViewSubtitleOutput r0 = new com.google.android.exoplayer2.ui.WebViewSubtitleOutput
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.setView(r0)
            goto L2a
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L1e:
            com.google.android.exoplayer2.ui.CanvasSubtitleOutput r0 = new com.google.android.exoplayer2.ui.CanvasSubtitleOutput
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.setView(r0)
        L2a:
            r2.viewType = r3
            return
    }
}
