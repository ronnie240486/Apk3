package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
class StreamingTextView extends android.widget.EditText {
    private static final boolean DEBUG = false;
    private static final boolean DOTS_FOR_PENDING = true;
    private static final boolean DOTS_FOR_STABLE = false;
    private static final java.util.regex.Pattern SPLIT_PATTERN = null;
    private static final android.util.Property<androidx.leanback.widget.StreamingTextView, java.lang.Integer> STREAM_POSITION_PROPERTY = null;
    private static final long STREAM_UPDATE_DELAY_MILLIS = 50;
    private static final java.lang.String TAG = "StreamingTextView";
    private static final float TEXT_DOT_SCALE = 1.3f;
    public android.graphics.Bitmap mOneDot;
    public final java.util.Random mRandom;
    public int mStreamPosition;
    private android.animation.ObjectAnimator mStreamingAnimation;
    public android.graphics.Bitmap mTwoDot;


    /* JADX INFO: loaded from: classes2.dex */
    public class DottySpan extends android.text.style.ReplacementSpan {
        private final int mPosition;
        private final int mSeed;
        public final /* synthetic */ androidx.leanback.widget.StreamingTextView this$0;

        public DottySpan(androidx.leanback.widget.StreamingTextView r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mSeed = r2
                r0.mPosition = r3
                return
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(android.graphics.Canvas r7, java.lang.CharSequence r8, int r9, int r10, float r11, int r12, int r13, int r14, android.graphics.Paint r15) {
                r6 = this;
                float r8 = r15.measureText(r8, r9, r10)
                int r8 = (int) r8
                androidx.leanback.widget.StreamingTextView r9 = r6.this$0
                android.graphics.Bitmap r9 = r9.mOneDot
                int r9 = r9.getWidth()
                int r10 = r9 * 2
                int r12 = r8 / r10
                int r14 = r8 % r10
                int r14 = r14 / 2
                androidx.leanback.widget.StreamingTextView r0 = r6.this$0
                boolean r0 = androidx.leanback.widget.StreamingTextView.isLayoutRtl(r0)
                androidx.leanback.widget.StreamingTextView r1 = r6.this$0
                java.util.Random r1 = r1.mRandom
                int r2 = r6.mSeed
                long r2 = (long) r2
                r1.setSeed(r2)
                int r1 = r15.getAlpha()
                r2 = 0
            L2a:
                if (r2 >= r12) goto L7f
                int r3 = r6.mPosition
                int r3 = r3 + r2
                androidx.leanback.widget.StreamingTextView r4 = r6.this$0
                int r5 = r4.mStreamPosition
                if (r3 < r5) goto L36
                goto L7f
            L36:
                int r3 = r2 * r10
                int r3 = r3 + r14
                int r5 = r9 / 2
                int r5 = r5 + r3
                float r3 = (float) r5
                if (r0 == 0) goto L45
                float r5 = (float) r8
                float r5 = r5 + r11
                float r5 = r5 - r3
                float r3 = (float) r9
                float r5 = r5 - r3
                goto L47
            L45:
                float r5 = r11 + r3
            L47:
                java.util.Random r3 = r4.mRandom
                r4 = 4
                int r3 = r3.nextInt(r4)
                int r3 = r3 + 1
                int r3 = r3 * 63
                r15.setAlpha(r3)
                androidx.leanback.widget.StreamingTextView r3 = r6.this$0
                java.util.Random r3 = r3.mRandom
                boolean r3 = r3.nextBoolean()
                if (r3 == 0) goto L6e
                androidx.leanback.widget.StreamingTextView r3 = r6.this$0
                android.graphics.Bitmap r3 = r3.mTwoDot
                int r4 = r3.getHeight()
                int r4 = r13 - r4
                float r4 = (float) r4
                r7.drawBitmap(r3, r5, r4, r15)
                goto L7c
            L6e:
                androidx.leanback.widget.StreamingTextView r3 = r6.this$0
                android.graphics.Bitmap r3 = r3.mOneDot
                int r4 = r3.getHeight()
                int r4 = r13 - r4
                float r4 = (float) r4
                r7.drawBitmap(r3, r5, r4, r15)
            L7c:
                int r2 = r2 + 1
                goto L2a
            L7f:
                r15.setAlpha(r1)
                return
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(android.graphics.Paint r1, java.lang.CharSequence r2, int r3, int r4, android.graphics.Paint.FontMetricsInt r5) {
                r0 = this;
                float r1 = r1.measureText(r2, r3, r4)
                int r1 = (int) r1
                return r1
        }
    }

    static {
            java.lang.String r0 = "\\S+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.leanback.widget.StreamingTextView.SPLIT_PATTERN = r0
            androidx.leanback.widget.StreamingTextView$1 r0 = new androidx.leanback.widget.StreamingTextView$1
            r0.<init>()
            androidx.leanback.widget.StreamingTextView.STREAM_POSITION_PROPERTY = r0
            return
    }

    public StreamingTextView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0.mRandom = r1
            return
    }

    public StreamingTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0.mRandom = r1
            return
    }

    private void addColorSpan(android.text.SpannableStringBuilder r2, int r3, java.lang.String r4, int r5) {
            r1 = this;
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r3)
            int r3 = r4.length()
            int r3 = r3 + r5
            r4 = 33
            r2.setSpan(r0, r5, r3, r4)
            return
    }

    private void addDottySpans(android.text.SpannableStringBuilder r6, java.lang.String r7, int r8) {
            r5 = this;
            java.util.regex.Pattern r0 = androidx.leanback.widget.StreamingTextView.SPLIT_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r7)
        L6:
            boolean r1 = r0.find()
            if (r1 == 0) goto L29
            int r1 = r0.start()
            int r1 = r1 + r8
            int r2 = r0.end()
            int r2 = r2 + r8
            androidx.leanback.widget.StreamingTextView$DottySpan r3 = new androidx.leanback.widget.StreamingTextView$DottySpan
            int r4 = r0.start()
            char r4 = r7.charAt(r4)
            r3.<init>(r5, r4, r1)
            r4 = 33
            r6.setSpan(r3, r1, r2, r4)
            goto L6
        L29:
            return
    }

    private void cancelStreamAnimation() {
            r1 = this;
            android.animation.ObjectAnimator r0 = r1.mStreamingAnimation
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    private android.graphics.Bitmap getScaledBitmap(int r3, float r4) {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r0, r3)
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
            int r1 = r3.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r4
            int r4 = (int) r1
            r1 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r0, r4, r1)
            return r3
    }

    public static boolean isLayoutRtl(android.view.View r1) {
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void startStreamAnimation() {
            r6 = this;
            r6.cancelStreamAnimation()
            int r0 = r6.getStreamPosition()
            int r1 = r6.length()
            int r2 = r1 - r0
            if (r2 <= 0) goto L41
            android.animation.ObjectAnimator r3 = r6.mStreamingAnimation
            if (r3 != 0) goto L24
            android.animation.ObjectAnimator r3 = new android.animation.ObjectAnimator
            r3.<init>()
            r6.mStreamingAnimation = r3
            r3.setTarget(r6)
            android.animation.ObjectAnimator r3 = r6.mStreamingAnimation
            android.util.Property<androidx.leanback.widget.StreamingTextView, java.lang.Integer> r4 = androidx.leanback.widget.StreamingTextView.STREAM_POSITION_PROPERTY
            r3.setProperty(r4)
        L24:
            android.animation.ObjectAnimator r3 = r6.mStreamingAnimation
            r4 = 2
            int[] r4 = new int[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r3.setIntValues(r4)
            android.animation.ObjectAnimator r0 = r6.mStreamingAnimation
            r3 = 50
            long r1 = (long) r2
            long r1 = r1 * r3
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r6.mStreamingAnimation
            r0.start()
        L41:
            return
    }

    private void updateText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setText(r1)
            int r1 = r0.length()
            r0.bringPointIntoView(r1)
            return
    }

    public int getStreamPosition() {
            r1 = this;
            int r0 = r1.mStreamPosition
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = androidx.leanback.R.drawable.lb_text_dot_one
            r1 = 1067869798(0x3fa66666, float:1.3)
            android.graphics.Bitmap r0 = r2.getScaledBitmap(r0, r1)
            r2.mOneDot = r0
            int r0 = androidx.leanback.R.drawable.lb_text_dot_two
            android.graphics.Bitmap r0 = r2.getScaledBitmap(r0, r1)
            r2.mTwoDot = r0
            r2.reset()
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.Class<androidx.leanback.widget.StreamingTextView> r0 = androidx.leanback.widget.StreamingTextView.class
            java.lang.String r0 = r0.getCanonicalName()
            r2.setClassName(r0)
            return
    }

    public void reset() {
            r1 = this;
            r0 = -1
            r1.mStreamPosition = r0
            r1.cancelStreamAnimation()
            java.lang.String r0 = ""
            r1.setText(r0)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setFinalRecognizedText(java.lang.CharSequence r1) {
            r0 = this;
            r0.updateText(r1)
            return
    }

    public void setStreamPosition(int r1) {
            r0 = this;
            r0.mStreamPosition = r1
            r0.invalidate()
            return
    }

    public void updateRecognizedText(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            if (r4 == 0) goto L15
            int r1 = r0.length()
            r0.append(r4)
            r2.addDottySpans(r0, r4, r1)
        L15:
            int r3 = r3.length()
            int r4 = r2.mStreamPosition
            int r3 = java.lang.Math.max(r3, r4)
            r2.mStreamPosition = r3
            android.text.SpannedString r3 = new android.text.SpannedString
            r3.<init>(r0)
            r2.updateText(r3)
            r2.startStreamAnimation()
            return
    }

    public void updateRecognizedText(java.lang.String r1, java.util.List<java.lang.Float> r2) {
            r0 = this;
            return
    }
}
