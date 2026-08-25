package com.iarcuschin.simpleratingbar;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleRatingBar extends android.view.View {

    @androidx.annotation.ColorInt
    private int backgroundColor;

    @androidx.annotation.ColorInt
    private int borderColor;
    private android.view.View.OnClickListener clickListener;
    private android.graphics.CornerPathEffect cornerPathEffect;
    private float currentStarSize;
    private float defaultStarSize;
    private float desiredStarSize;
    private boolean drawBorderEnabled;

    @androidx.annotation.ColorInt
    private int fillColor;
    private com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity gravity;
    private android.graphics.Bitmap internalBitmap;
    private android.graphics.Canvas internalCanvas;
    private boolean isIndicator;
    private float maxStarSize;
    private int numberOfStars;
    private android.graphics.Paint paintStarBackground;
    private android.graphics.Paint paintStarBorder;
    private android.graphics.Paint paintStarFill;
    private android.graphics.Paint paintStarOutline;

    @androidx.annotation.ColorInt
    private int pressedBackgroundColor;

    @androidx.annotation.ColorInt
    private int pressedBorderColor;

    @androidx.annotation.ColorInt
    private int pressedFillColor;

    @androidx.annotation.ColorInt
    private int pressedStarBackgroundColor;
    private float rating;
    private android.animation.ValueAnimator ratingAnimator;
    private com.iarcuschin.simpleratingbar.SimpleRatingBar.OnRatingBarChangeListener ratingListener;

    @androidx.annotation.ColorInt
    private int starBackgroundColor;
    private float starBorderWidth;
    private float starCornerRadius;
    private android.graphics.Path starPath;
    private float[] starVertex;
    private android.graphics.RectF starsDrawingSpace;
    private float starsSeparation;
    private android.graphics.RectF starsTouchSpace;
    private float stepSize;
    private boolean touchInProgress;



    /* JADX INFO: loaded from: classes.dex */
    public class AnimationBuilder {
        private android.animation.Animator.AnimatorListener animatorListener;
        private long duration;
        private android.view.animation.Interpolator interpolator;
        private com.iarcuschin.simpleratingbar.SimpleRatingBar ratingBar;
        private float ratingTarget;
        private int repeatCount;
        private int repeatMode;

        private AnimationBuilder(com.iarcuschin.simpleratingbar.SimpleRatingBar r3, com.iarcuschin.simpleratingbar.SimpleRatingBar r4) {
                r2 = this;
                r2.<init>()
                r2.ratingBar = r4
                r0 = 2000(0x7d0, double:9.88E-321)
                r2.duration = r0
                android.view.animation.BounceInterpolator r3 = new android.view.animation.BounceInterpolator
                r3.<init>()
                r2.interpolator = r3
                int r3 = r4.getNumberOfStars()
                float r3 = (float) r3
                r2.ratingTarget = r3
                r3 = 1
                r2.repeatCount = r3
                r3 = 2
                r2.repeatMode = r3
                return
        }

        public /* synthetic */ AnimationBuilder(com.iarcuschin.simpleratingbar.SimpleRatingBar r1, com.iarcuschin.simpleratingbar.SimpleRatingBar r2, com.iarcuschin.simpleratingbar.SimpleRatingBar.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ float access$100(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r0) {
                float r0 = r0.ratingTarget
                return r0
        }

        public static /* synthetic */ float access$102(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r0, float r1) {
                r0.ratingTarget = r1
                return r1
        }

        public static /* synthetic */ long access$200(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r2) {
                long r0 = r2.duration
                return r0
        }

        public static /* synthetic */ int access$300(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r0) {
                int r0 = r0.repeatCount
                return r0
        }

        public static /* synthetic */ int access$400(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r0) {
                int r0 = r0.repeatMode
                return r0
        }

        public static /* synthetic */ android.view.animation.Interpolator access$500(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r0) {
                android.view.animation.Interpolator r0 = r0.interpolator
                return r0
        }

        public static /* synthetic */ android.animation.Animator.AnimatorListener access$600(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r0) {
                android.animation.Animator$AnimatorListener r0 = r0.animatorListener
                return r0
        }

        public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder setAnimatorListener(android.animation.Animator.AnimatorListener r1) {
                r0 = this;
                r0.animatorListener = r1
                return r0
        }

        public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder setDuration(long r1) {
                r0 = this;
                r0.duration = r1
                return r0
        }

        public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder setInterpolator(android.view.animation.Interpolator r1) {
                r0 = this;
                r0.interpolator = r1
                return r0
        }

        public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder setRatingTarget(float r1) {
                r0 = this;
                r0.ratingTarget = r1
                return r0
        }

        public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder setRepeatCount(int r1) {
                r0 = this;
                r0.repeatCount = r1
                return r0
        }

        public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder setRepeatMode(int r1) {
                r0 = this;
                r0.repeatMode = r1
                return r0
        }

        public void start() {
                r1 = this;
                com.iarcuschin.simpleratingbar.SimpleRatingBar r0 = r1.ratingBar
                com.iarcuschin.simpleratingbar.SimpleRatingBar.access$1000(r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum Gravity extends java.lang.Enum<com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity> {
        private static final /* synthetic */ com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity[] $VALUES = null;
        public static final com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity Left = null;
        public static final com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity Right = null;
        public int id;

        static {
                com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r0 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity
                java.lang.String r1 = "Left"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left = r0
                com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r1 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity
                java.lang.String r3 = "Right"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Right = r1
                r3 = 2
                com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity[] r3 = new com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.$VALUES = r3
                return
        }

        private Gravity(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.id = r3
                return
        }

        public static com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity valueOf(java.lang.String r1) {
                java.lang.Class<com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity> r0 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r1 = (com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity) r1
                return r1
        }

        public static com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity[] values() {
                com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity[] r0 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.$VALUES
                java.lang.Object r0 = r0.clone()
                com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity[] r0 = (com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity[]) r0
                return r0
        }
    }

    public interface OnRatingBarChangeListener {
        void onRatingChanged(com.iarcuschin.simpleratingbar.SimpleRatingBar r1, float r2, boolean r3);
    }

    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState> CREATOR = null;
        private float rating;


        static {
                com.iarcuschin.simpleratingbar.SimpleRatingBar$SavedState$1 r0 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$SavedState$1
                r0.<init>()
                com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.rating = r0
                float r2 = r2.readFloat()
                r1.rating = r2
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.rating = r1
                return
        }

        public static /* synthetic */ float access$000(com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState r0) {
                float r0 = r0.rating
                return r0
        }

        public static /* synthetic */ float access$002(com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState r0, float r1) {
                r0.rating = r1
                return r1
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                float r2 = r0.rating
                r1.writeFloat(r2)
                return
        }
    }

    public SimpleRatingBar(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.initView()
            return
    }

    public SimpleRatingBar(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.parseAttrs(r2)
            r0.initView()
            return
    }

    public SimpleRatingBar(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.parseAttrs(r2)
            r0.initView()
            return
    }

    public static /* synthetic */ void access$1000(com.iarcuschin.simpleratingbar.SimpleRatingBar r0, com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r1) {
            r0.animateRating(r1)
            return
    }

    public static /* synthetic */ com.iarcuschin.simpleratingbar.SimpleRatingBar.OnRatingBarChangeListener access$700(com.iarcuschin.simpleratingbar.SimpleRatingBar r0) {
            com.iarcuschin.simpleratingbar.SimpleRatingBar$OnRatingBarChangeListener r0 = r0.ratingListener
            return r0
    }

    public static /* synthetic */ float access$800(com.iarcuschin.simpleratingbar.SimpleRatingBar r0) {
            float r0 = r0.rating
            return r0
    }

    private void animateRating(com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder r4) {
            r3 = this;
            float r0 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$100(r4)
            float r0 = r3.normalizeRating(r0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$102(r4, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            float r1 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$100(r4)
            r2 = 1
            r0[r2] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.ratingAnimator = r0
            long r1 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$200(r4)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.ratingAnimator
            int r1 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$300(r4)
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r3.ratingAnimator
            int r1 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$400(r4)
            r0.setRepeatMode(r1)
            android.animation.ValueAnimator r0 = r3.ratingAnimator
            com.iarcuschin.simpleratingbar.SimpleRatingBar$1 r1 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$1
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.view.animation.Interpolator r0 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$500(r4)
            if (r0 == 0) goto L51
            android.animation.ValueAnimator r0 = r3.ratingAnimator
            android.view.animation.Interpolator r1 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$500(r4)
            r0.setInterpolator(r1)
        L51:
            android.animation.Animator$AnimatorListener r0 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$600(r4)
            if (r0 == 0) goto L60
            android.animation.ValueAnimator r0 = r3.ratingAnimator
            android.animation.Animator$AnimatorListener r4 = com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder.access$600(r4)
            r0.addListener(r4)
        L60:
            android.animation.ValueAnimator r4 = r3.ratingAnimator
            com.iarcuschin.simpleratingbar.SimpleRatingBar$2 r0 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$2
            r0.<init>(r3)
            r4.addListener(r0)
            android.animation.ValueAnimator r4 = r3.ratingAnimator
            r4.start()
            return
    }

    private float calculateBestStarSize(int r6, int r7) {
            r5 = this;
            float r0 = r5.maxStarSize
            r1 = 1325400064(0x4f000000, float:2.1474836E9)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L52
            int r1 = r5.numberOfStars
            float r2 = r5.starsSeparation
            r3 = 1
            int r0 = r5.calculateTotalWidth(r0, r1, r2, r3)
            float r0 = (float) r0
            float r1 = r5.maxStarSize
            int r2 = r5.numberOfStars
            float r4 = r5.starsSeparation
            int r1 = r5.calculateTotalHeight(r1, r2, r4, r3)
            float r1 = (float) r1
            float r2 = (float) r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2b
            float r0 = (float) r7
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L28
            goto L2b
        L28:
            float r6 = r5.maxStarSize
            return r6
        L2b:
            int r0 = r5.getPaddingLeft()
            int r6 = r6 - r0
            int r0 = r5.getPaddingRight()
            int r6 = r6 - r0
            float r6 = (float) r6
            float r0 = r5.starsSeparation
            int r1 = r5.numberOfStars
            int r2 = r1 + (-1)
            float r2 = (float) r2
            float r0 = r0 * r2
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
            int r0 = r5.getPaddingTop()
            int r7 = r7 - r0
            int r0 = r5.getPaddingBottom()
            int r7 = r7 - r0
            float r7 = (float) r7
            float r6 = java.lang.Math.min(r6, r7)
            return r6
        L52:
            int r0 = r5.getPaddingLeft()
            int r6 = r6 - r0
            int r0 = r5.getPaddingRight()
            int r6 = r6 - r0
            float r6 = (float) r6
            float r0 = r5.starsSeparation
            int r1 = r5.numberOfStars
            int r2 = r1 + (-1)
            float r2 = (float) r2
            float r0 = r0 * r2
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
            int r0 = r5.getPaddingTop()
            int r7 = r7 - r0
            int r0 = r5.getPaddingBottom()
            int r7 = r7 - r0
            float r7 = (float) r7
            float r6 = java.lang.Math.min(r6, r7)
            return r6
    }

    private int calculateTotalHeight(float r1, int r2, float r3, boolean r4) {
            r0 = this;
            int r1 = java.lang.Math.round(r1)
            if (r4 == 0) goto L10
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingBottom()
            int r3 = r3 + r2
            goto L11
        L10:
            r3 = 0
        L11:
            int r1 = r1 + r3
            return r1
    }

    private int calculateTotalWidth(float r2, int r3, float r4, boolean r5) {
            r1 = this;
            float r0 = (float) r3
            float r2 = r2 * r0
            int r3 = r3 + (-1)
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r2
            int r2 = java.lang.Math.round(r4)
            if (r5 == 0) goto L19
            int r3 = r1.getPaddingLeft()
            int r4 = r1.getPaddingRight()
            int r4 = r4 + r3
            goto L1a
        L19:
            r4 = 0
        L1a:
            int r2 = r2 + r4
            return r2
    }

    private void drawFromLeftToRight(android.graphics.Canvas r12) {
            r11 = this;
            float r0 = r11.rating
            android.graphics.RectF r1 = r11.starsDrawingSpace
            float r2 = r1.left
            float r1 = r1.top
            r3 = 0
            r9 = r0
            r0 = 0
        Lb:
            int r3 = r11.numberOfStars
            if (r0 >= r3) goto L37
            r10 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r3 < 0) goto L22
            r7 = 1065353216(0x3f800000, float:1.0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r8 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
            r3 = r11
            r4 = r12
            r5 = r2
            r6 = r1
            r3.drawStar(r4, r5, r6, r7, r8)
            float r9 = r9 - r10
            goto L2e
        L22:
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r8 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
            r3 = r11
            r4 = r12
            r5 = r2
            r6 = r1
            r7 = r9
            r3.drawStar(r4, r5, r6, r7, r8)
            r3 = 0
            r9 = 0
        L2e:
            float r3 = r11.starsSeparation
            float r4 = r11.currentStarSize
            float r3 = r3 + r4
            float r2 = r2 + r3
            int r0 = r0 + 1
            goto Lb
        L37:
            return
    }

    private void drawFromRightToLeft(android.graphics.Canvas r12) {
            r11 = this;
            float r0 = r11.rating
            android.graphics.RectF r1 = r11.starsDrawingSpace
            float r2 = r1.right
            float r3 = r11.currentStarSize
            float r2 = r2 - r3
            float r1 = r1.top
            r3 = 0
            r9 = r0
            r0 = 0
        Le:
            int r3 = r11.numberOfStars
            if (r0 >= r3) goto L3a
            r10 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r3 < 0) goto L25
            r7 = 1065353216(0x3f800000, float:1.0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r8 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Right
            r3 = r11
            r4 = r12
            r5 = r2
            r6 = r1
            r3.drawStar(r4, r5, r6, r7, r8)
            float r9 = r9 - r10
            goto L31
        L25:
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r8 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Right
            r3 = r11
            r4 = r12
            r5 = r2
            r6 = r1
            r7 = r9
            r3.drawStar(r4, r5, r6, r7, r8)
            r3 = 0
            r9 = 0
        L31:
            float r3 = r11.starsSeparation
            float r4 = r11.currentStarSize
            float r3 = r3 + r4
            float r2 = r2 - r3
            int r0 = r0 + 1
            goto Le
        L3a:
            return
    }

    private void drawStar(android.graphics.Canvas r11, float r12, float r13, float r14, com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity r15) {
            r10 = this;
            float r0 = r10.currentStarSize
            float r0 = r0 * r14
            android.graphics.Path r14 = r10.starPath
            r14.reset()
            android.graphics.Path r14 = r10.starPath
            float[] r1 = r10.starVertex
            r2 = 0
            r2 = r1[r2]
            float r2 = r2 + r12
            r3 = 1
            r1 = r1[r3]
            float r1 = r1 + r13
            r14.moveTo(r2, r1)
            r14 = 2
        L19:
            float[] r1 = r10.starVertex
            int r2 = r1.length
            if (r14 >= r2) goto L2e
            android.graphics.Path r2 = r10.starPath
            r3 = r1[r14]
            float r3 = r3 + r12
            int r4 = r14 + 1
            r1 = r1[r4]
            float r1 = r1 + r13
            r2.lineTo(r3, r1)
            int r14 = r14 + 2
            goto L19
        L2e:
            android.graphics.Path r14 = r10.starPath
            r14.close()
            android.graphics.Path r14 = r10.starPath
            android.graphics.Paint r1 = r10.paintStarOutline
            r11.drawPath(r14, r1)
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r14 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            if (r15 != r14) goto L61
            float r3 = r12 + r0
            float r14 = r10.currentStarSize
            float r1 = r1 * r14
            float r7 = r1 + r3
            float r8 = r13 + r14
            android.graphics.Paint r9 = r10.paintStarFill
            r4 = r11
            r5 = r12
            r6 = r13
            r4.drawRect(r5, r6, r7, r8, r9)
            float r14 = r10.currentStarSize
            float r5 = r12 + r14
            float r6 = r13 + r14
            android.graphics.Paint r7 = r10.paintStarBackground
            r2 = r11
            r4 = r13
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L85
        L61:
            float r14 = r10.currentStarSize
            float r15 = r12 + r14
            float r1 = r1 * r14
            float r1 = r1 + r0
            float r3 = r15 - r1
            float r5 = r12 + r14
            float r6 = r13 + r14
            android.graphics.Paint r7 = r10.paintStarFill
            r2 = r11
            r4 = r13
            r2.drawRect(r3, r4, r5, r6, r7)
            float r14 = r10.currentStarSize
            float r15 = r12 + r14
            float r4 = r15 - r0
            float r5 = r13 + r14
            android.graphics.Paint r6 = r10.paintStarBackground
            r1 = r11
            r2 = r12
            r3 = r13
            r1.drawRect(r2, r3, r4, r5, r6)
        L85:
            boolean r12 = r10.drawBorderEnabled
            if (r12 == 0) goto L90
            android.graphics.Path r12 = r10.starPath
            android.graphics.Paint r13 = r10.paintStarBorder
            r11.drawPath(r12, r13)
        L90:
            return
    }

    private void generateInternalCanvas(int r2, int r3) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.internalBitmap
            if (r0 == 0) goto L7
            r0.recycle()
        L7:
            if (r2 <= 0) goto L20
            if (r3 <= 0) goto L20
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            r1.internalBitmap = r2
            r3 = 0
            r2.eraseColor(r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r3 = r1.internalBitmap
            r2.<init>(r3)
            r1.internalCanvas = r2
        L20:
            return
    }

    private void initView() {
            r4 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.starPath = r0
            android.graphics.CornerPathEffect r0 = new android.graphics.CornerPathEffect
            float r1 = r4.starCornerRadius
            r0.<init>(r1)
            r4.cornerPathEffect = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 5
            r0.<init>(r1)
            r4.paintStarOutline = r0
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r4.paintStarOutline
            r2 = 1
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r4.paintStarOutline
            r0.setDither(r2)
            android.graphics.Paint r0 = r4.paintStarOutline
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r3)
            android.graphics.Paint r0 = r4.paintStarOutline
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r3)
            android.graphics.Paint r0 = r4.paintStarOutline
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r3)
            android.graphics.Paint r0 = r4.paintStarOutline
            android.graphics.CornerPathEffect r3 = r4.cornerPathEffect
            r0.setPathEffect(r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.paintStarBorder = r0
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            android.graphics.Paint r0 = r4.paintStarBorder
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r3)
            android.graphics.Paint r0 = r4.paintStarBorder
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r3)
            android.graphics.Paint r0 = r4.paintStarBorder
            float r3 = r4.starBorderWidth
            r0.setStrokeWidth(r3)
            android.graphics.Paint r0 = r4.paintStarBorder
            android.graphics.CornerPathEffect r3 = r4.cornerPathEffect
            r0.setPathEffect(r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.paintStarBackground = r0
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r3)
            android.graphics.Paint r0 = r4.paintStarBackground
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r4.paintStarBackground
            r0.setDither(r2)
            android.graphics.Paint r0 = r4.paintStarBackground
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r3)
            android.graphics.Paint r0 = r4.paintStarBackground
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.paintStarFill = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.paintStarFill
            r0.setAntiAlias(r2)
            android.graphics.Paint r0 = r4.paintStarFill
            r0.setDither(r2)
            android.graphics.Paint r0 = r4.paintStarFill
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r1)
            android.graphics.Paint r0 = r4.paintStarFill
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1106247680(0x41f00000, float:30.0)
            float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
            r4.defaultStarSize = r0
            return
    }

    private float normalizeRating(float r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "SimpleRatingBar"
            r3 = 0
            int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r4 >= 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r1[r0] = r6
            java.lang.String r6 = "Assigned rating is less than 0 (%f < 0), I will set it to exactly 0"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            android.util.Log.w(r2, r6)
            return r3
        L1b:
            int r3 = r5.numberOfStars
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L3f
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r3[r0] = r6
            int r6 = r5.numberOfStars
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "Assigned rating is greater than numberOfStars (%f > %d), I will set it to exactly numberOfStars"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            android.util.Log.w(r2, r6)
            int r6 = r5.numberOfStars
            float r6 = (float) r6
        L3f:
            return r6
    }

    private void parseAttrs(android.util.AttributeSet r8) {
            r7 = this;
            android.content.Context r0 = r7.getContext()
            int[] r1 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r8, r1)
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_borderColor
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.iarcuschin.simpleratingbar.R.color.golden_stars
            int r1 = r1.getColor(r2)
            int r0 = r8.getColor(r0, r1)
            r7.borderColor = r0
            int r1 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_fillColor
            int r0 = r8.getColor(r1, r0)
            r7.fillColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_starBackgroundColor
            r1 = 0
            int r0 = r8.getColor(r0, r1)
            r7.starBackgroundColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_backgroundColor
            int r0 = r8.getColor(r0, r1)
            r7.backgroundColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_pressedBorderColor
            int r2 = r7.borderColor
            int r0 = r8.getColor(r0, r2)
            r7.pressedBorderColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_pressedFillColor
            int r2 = r7.fillColor
            int r0 = r8.getColor(r0, r2)
            r7.pressedFillColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_pressedStarBackgroundColor
            int r2 = r7.starBackgroundColor
            int r0 = r8.getColor(r0, r2)
            r7.pressedStarBackgroundColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_pressedBackgroundColor
            int r2 = r7.backgroundColor
            int r0 = r8.getColor(r0, r2)
            r7.pressedBackgroundColor = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_numberOfStars
            r2 = 5
            int r0 = r8.getInteger(r0, r2)
            r7.numberOfStars = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_starsSeparation
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r7.valueToPixels(r2, r1)
            int r2 = (int) r2
            int r0 = r8.getDimensionPixelSize(r0, r2)
            float r0 = (float) r0
            r7.starsSeparation = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_maxStarSize
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r8.getDimensionPixelSize(r0, r2)
            float r0 = (float) r0
            r7.maxStarSize = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_starSize
            int r0 = r8.getDimensionPixelSize(r0, r2)
            float r0 = (float) r0
            r7.desiredStarSize = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_stepSize
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r8.getFloat(r0, r2)
            r7.stepSize = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_starBorderWidth
            r2 = 1084227584(0x40a00000, float:5.0)
            float r0 = r8.getFloat(r0, r2)
            r7.starBorderWidth = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_starCornerRadius
            r2 = 1086324736(0x40c00000, float:6.0)
            float r0 = r8.getFloat(r0, r2)
            r7.starCornerRadius = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_rating
            r2 = 0
            float r0 = r8.getFloat(r0, r2)
            float r0 = r7.normalizeRating(r0)
            r7.rating = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_isIndicator
            boolean r0 = r8.getBoolean(r0, r1)
            r7.isIndicator = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_drawBorderEnabled
            r2 = 1
            boolean r0 = r8.getBoolean(r0, r2)
            r7.drawBorderEnabled = r0
            int r0 = com.iarcuschin.simpleratingbar.R.styleable.SimpleRatingBar_srb_gravity
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r2 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
            int r2 = r2.id
            int r0 = r8.getInt(r0, r2)
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity[] r2 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.values()
            int r3 = r2.length
            r4 = 0
        Ld8:
            if (r4 >= r3) goto Le4
            r5 = r2[r4]
            int r6 = r5.id
            if (r6 != r0) goto Le1
            goto Lf3
        Le1:
            int r4 = r4 + 1
            goto Ld8
        Le4:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Gravity chosen is neither 'left' nor 'right', I will set it to Left"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "SimpleRatingBar"
            android.util.Log.w(r1, r0)
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r5 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
        Lf3:
            r7.gravity = r5
            r8.recycle()
            r7.validateAttrs()
            return
    }

    private void performStarSizeAssociatedCalculations(int r12, int r13) {
            r11 = this;
            float r0 = r11.currentStarSize
            int r1 = r11.numberOfStars
            float r2 = r11.starsSeparation
            r3 = 0
            int r0 = r11.calculateTotalWidth(r0, r1, r2, r3)
            float r0 = (float) r0
            float r1 = r11.currentStarSize
            int r2 = r11.numberOfStars
            float r4 = r11.starsSeparation
            int r1 = r11.calculateTotalHeight(r1, r2, r4, r3)
            float r1 = (float) r1
            int r2 = r11.getPaddingLeft()
            int r12 = r12 - r2
            int r2 = r11.getPaddingRight()
            int r12 = r12 - r2
            r2 = 2
            int r12 = r12 / r2
            float r12 = (float) r12
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r0 / r4
            float r12 = r12 - r5
            int r5 = r11.getPaddingLeft()
            float r5 = (float) r5
            float r12 = r12 + r5
            int r5 = r11.getPaddingTop()
            int r13 = r13 - r5
            int r5 = r11.getPaddingBottom()
            int r13 = r13 - r5
            int r13 = r13 / r2
            float r13 = (float) r13
            float r4 = r1 / r4
            float r13 = r13 - r4
            int r4 = r11.getPaddingTop()
            float r4 = (float) r4
            float r13 = r13 + r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r0 = r0 + r12
            float r1 = r1 + r13
            r4.<init>(r12, r13, r0, r1)
            r11.starsDrawingSpace = r4
            float r12 = r4.width()
            r13 = 1028443341(0x3d4ccccd, float:0.05)
            float r12 = r12 * r13
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.RectF r1 = r11.starsDrawingSpace
            float r4 = r1.left
            float r4 = r4 - r12
            float r5 = r1.top
            float r6 = r1.right
            float r6 = r6 + r12
            float r12 = r1.bottom
            r0.<init>(r4, r5, r6, r12)
            r11.starsTouchSpace = r0
            float r12 = r11.currentStarSize
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r12
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r1 = r1 * r12
            r4 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r12
            float r13 = r13 * r12
            r5 = 1022739087(0x3cf5c28f, float:0.03)
            float r5 = r5 * r12
            r6 = 1052938076(0x3ec28f5c, float:0.38)
            float r6 = r6 * r12
            r7 = 1050924810(0x3ea3d70a, float:0.32)
            float r7 = r7 * r12
            r8 = 1058642330(0x3f19999a, float:0.6)
            float r8 = r8 * r12
            r9 = 1049247089(0x3e8a3d71, float:0.27)
            float r9 = r9 * r12
            r10 = 20
            float[] r10 = new float[r10]
            r10[r3] = r5
            r3 = 1
            r10[r3] = r6
            float r3 = r5 + r1
            r10[r2] = r3
            r2 = 3
            r10[r2] = r6
            r2 = 4
            r10[r2] = r4
            r2 = 5
            r10[r2] = r13
            float r2 = r12 - r5
            float r2 = r2 - r1
            r1 = 6
            r10[r1] = r2
            r1 = 7
            r10[r1] = r6
            float r1 = r12 - r5
            r2 = 8
            r10[r2] = r1
            r1 = 9
            r10[r1] = r6
            float r1 = r12 - r7
            r2 = 10
            r10[r2] = r1
            r1 = 11
            r10[r1] = r8
            float r1 = r12 - r0
            r2 = 12
            r10[r2] = r1
            float r1 = r12 - r13
            r2 = 13
            r10[r2] = r1
            r1 = 14
            r10[r1] = r4
            float r1 = r12 - r9
            r2 = 15
            r10[r2] = r1
            r1 = 16
            r10[r1] = r0
            float r12 = r12 - r13
            r13 = 17
            r10[r13] = r12
            r12 = 18
            r10[r12] = r7
            r12 = 19
            r10[r12] = r8
            r11.starVertex = r10
            return
    }

    private void setNewRatingFromTouch(float r4, float r5) {
            r3 = this;
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r5 = r3.gravity
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r0 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
            if (r5 == r0) goto Ld
            int r5 = r3.getWidth()
            float r5 = (float) r5
            float r4 = r5 - r4
        Ld:
            android.graphics.RectF r5 = r3.starsDrawingSpace
            float r0 = r5.left
            r1 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            r3.rating = r1
            return
        L19:
            float r2 = r5.right
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L25
            int r4 = r3.numberOfStars
            float r4 = (float) r4
            r3.rating = r4
            return
        L25:
            float r4 = r4 - r0
            int r0 = r3.numberOfStars
            float r0 = (float) r0
            float r5 = r5.width()
            float r0 = r0 / r5
            float r0 = r0 * r4
            r3.rating = r0
            float r4 = r3.stepSize
            float r5 = r0 % r4
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r4 / r2
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L48
            float r0 = r0 - r5
            r3.rating = r0
            float r4 = java.lang.Math.max(r1, r0)
            r3.rating = r4
            goto L55
        L48:
            float r0 = r0 - r5
            float r0 = r0 + r4
            r3.rating = r0
            int r4 = r3.numberOfStars
            float r4 = (float) r4
            float r4 = java.lang.Math.min(r4, r0)
            r3.rating = r4
        L55:
            return
    }

    private void setupColorsInPaint() {
            r3 = this;
            boolean r0 = r3.touchInProgress
            if (r0 == 0) goto L54
            android.graphics.Paint r0 = r3.paintStarBorder
            int r1 = r3.pressedBorderColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.paintStarFill
            int r1 = r3.pressedFillColor
            r0.setColor(r1)
            int r0 = r3.pressedFillColor
            if (r0 == 0) goto L23
            android.graphics.Paint r0 = r3.paintStarFill
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.<init>(r2)
            r0.setXfermode(r1)
            goto L2f
        L23:
            android.graphics.Paint r0 = r3.paintStarFill
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
        L2f:
            android.graphics.Paint r0 = r3.paintStarBackground
            int r1 = r3.pressedStarBackgroundColor
            r0.setColor(r1)
            int r0 = r3.pressedStarBackgroundColor
            if (r0 == 0) goto L47
            android.graphics.Paint r0 = r3.paintStarBackground
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.<init>(r2)
            r0.setXfermode(r1)
            goto La3
        L47:
            android.graphics.Paint r0 = r3.paintStarBackground
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
            goto La3
        L54:
            android.graphics.Paint r0 = r3.paintStarBorder
            int r1 = r3.borderColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.paintStarFill
            int r1 = r3.fillColor
            r0.setColor(r1)
            int r0 = r3.fillColor
            if (r0 == 0) goto L73
            android.graphics.Paint r0 = r3.paintStarFill
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.<init>(r2)
            r0.setXfermode(r1)
            goto L7f
        L73:
            android.graphics.Paint r0 = r3.paintStarFill
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
        L7f:
            android.graphics.Paint r0 = r3.paintStarBackground
            int r1 = r3.starBackgroundColor
            r0.setColor(r1)
            int r0 = r3.starBackgroundColor
            if (r0 == 0) goto L97
            android.graphics.Paint r0 = r3.paintStarBackground
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.<init>(r2)
            r0.setXfermode(r1)
            goto La3
        L97:
            android.graphics.Paint r0 = r3.paintStarBackground
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
        La3:
            return
    }

    private void validateAttrs() {
            r5 = this;
            int r0 = r5.numberOfStars
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L8a
            float r0 = r5.desiredStarSize
            r3 = 1325400064(0x4f000000, float:2.1474836E9)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 == 0) goto L34
            float r4 = r5.maxStarSize
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L34
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3[r1] = r0
            float r0 = r5.maxStarSize
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Initialized with conflicting values: starSize is greater than maxStarSize (%f > %f). I will ignore maxStarSize"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.String r3 = "SimpleRatingBar"
            android.util.Log.w(r3, r0)
        L34:
            float r0 = r5.stepSize
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L74
            float r0 = r5.starBorderWidth
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5e
            float r0 = r5.starCornerRadius
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            float r3 = r5.starBorderWidth
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "SimpleRatingBar initialized with invalid value for starCornerRadius. Found %f, but should be greater or equal than 0"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            float r3 = r5.starBorderWidth
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "SimpleRatingBar initialized with invalid value for starBorderWidth. Found %f, but should be greater than 0"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L74:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            float r3 = r5.stepSize
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "SimpleRatingBar initialized with invalid value for stepSize. Found %f, but should be greater than 0"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L8a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.numberOfStars
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r1 = "SimpleRatingBar initialized with invalid value for numberOfStars. Found %d, but should be greater than 0"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    private float valueFromPixels(float r2, @androidx.annotation.Dimension int r3) {
            r1 = this;
            if (r3 == 0) goto L12
            r0 = 2
            if (r3 == r0) goto L6
            return r2
        L6:
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.scaledDensity
        L10:
            float r2 = r2 / r3
            return r2
        L12:
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            goto L10
    }

    private float valueToPixels(float r2, @androidx.annotation.Dimension int r3) {
            r1 = this;
            if (r3 == 0) goto L13
            r0 = 2
            if (r3 == r0) goto L6
            return r2
        L6:
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r0, r2, r3)
            return r2
        L13:
            r3 = 1
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r3, r2, r0)
            return r2
    }

    public com.iarcuschin.simpleratingbar.SimpleRatingBar.AnimationBuilder getAnimationBuilder() {
            r2 = this;
            com.iarcuschin.simpleratingbar.SimpleRatingBar$AnimationBuilder r0 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$AnimationBuilder
            r1 = 0
            r0.<init>(r2, r2, r1)
            return r0
    }

    @androidx.annotation.ColorInt
    public int getBorderColor() {
            r1 = this;
            int r0 = r1.borderColor
            return r0
    }

    @androidx.annotation.ColorInt
    public int getFillColor() {
            r1 = this;
            int r0 = r1.fillColor
            return r0
    }

    public com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity getGravity() {
            r1 = this;
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r0 = r1.gravity
            return r0
    }

    public float getMaxStarSize() {
            r1 = this;
            float r0 = r1.maxStarSize
            return r0
    }

    public float getMaxStarSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            float r0 = r1.maxStarSize
            float r2 = r1.valueFromPixels(r0, r2)
            return r2
    }

    public int getNumberOfStars() {
            r1 = this;
            int r0 = r1.numberOfStars
            return r0
    }

    @androidx.annotation.ColorInt
    public int getPressedBorderColor() {
            r1 = this;
            int r0 = r1.pressedBorderColor
            return r0
    }

    @androidx.annotation.ColorInt
    public int getPressedFillColor() {
            r1 = this;
            int r0 = r1.pressedFillColor
            return r0
    }

    @androidx.annotation.ColorInt
    public int getPressedStarBackgroundColor() {
            r1 = this;
            int r0 = r1.pressedStarBackgroundColor
            return r0
    }

    public float getRating() {
            r1 = this;
            float r0 = r1.rating
            return r0
    }

    @androidx.annotation.ColorInt
    public int getStarBackgroundColor() {
            r1 = this;
            int r0 = r1.starBackgroundColor
            return r0
    }

    public float getStarBorderWidth() {
            r1 = this;
            float r0 = r1.starBorderWidth
            return r0
    }

    public float getStarBorderWidth(@androidx.annotation.Dimension int r2) {
            r1 = this;
            float r0 = r1.starBorderWidth
            float r2 = r1.valueFromPixels(r0, r2)
            return r2
    }

    public float getStarCornerRadius() {
            r1 = this;
            float r0 = r1.starCornerRadius
            return r0
    }

    public float getStarCornerRadius(@androidx.annotation.Dimension int r2) {
            r1 = this;
            float r0 = r1.starCornerRadius
            float r2 = r1.valueFromPixels(r0, r2)
            return r2
    }

    public float getStarSize() {
            r1 = this;
            float r0 = r1.currentStarSize
            return r0
    }

    public float getStarSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            float r0 = r1.currentStarSize
            float r2 = r1.valueFromPixels(r0, r2)
            return r2
    }

    public float getStarsSeparation() {
            r1 = this;
            float r0 = r1.starsSeparation
            return r0
    }

    public float getStarsSeparation(@androidx.annotation.Dimension int r2) {
            r1 = this;
            float r0 = r1.starsSeparation
            float r2 = r1.valueFromPixels(r0, r2)
            return r2
    }

    public float getStepSize() {
            r1 = this;
            float r0 = r1.stepSize
            return r0
    }

    public boolean isDrawBorderEnabled() {
            r1 = this;
            boolean r0 = r1.drawBorderEnabled
            return r0
    }

    public boolean isIndicator() {
            r1 = this;
            boolean r0 = r1.isIndicator
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            int r0 = r3.getHeight()
            int r1 = r3.getWidth()
            if (r1 == 0) goto L42
            if (r0 != 0) goto L10
            goto L42
        L10:
            android.graphics.Canvas r0 = r3.internalCanvas
            r1 = 0
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r0.drawColor(r1, r2)
            r3.setupColorsInPaint()
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r0 = r3.gravity
            com.iarcuschin.simpleratingbar.SimpleRatingBar$Gravity r1 = com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity.Left
            if (r0 != r1) goto L27
            android.graphics.Canvas r0 = r3.internalCanvas
            r3.drawFromLeftToRight(r0)
            goto L2c
        L27:
            android.graphics.Canvas r0 = r3.internalCanvas
            r3.drawFromRightToLeft(r0)
        L2c:
            boolean r0 = r3.touchInProgress
            if (r0 == 0) goto L36
            int r0 = r3.pressedBackgroundColor
            r4.drawColor(r0)
            goto L3b
        L36:
            int r0 = r3.backgroundColor
            r4.drawColor(r0)
        L3b:
            android.graphics.Bitmap r0 = r3.internalBitmap
            r1 = 0
            r2 = 0
            r4.drawBitmap(r0, r2, r2, r1)
        L42:
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            float r3 = r0.desiredStarSize
            r4 = 1325400064(0x4f000000, float:2.1474836E9)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L1a
            float r3 = r0.calculateBestStarSize(r1, r2)
            r0.currentStarSize = r3
            goto L1c
        L1a:
            r0.currentStarSize = r3
        L1c:
            r0.performStarSizeAssociatedCalculations(r1, r2)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r10, int r11) {
            r9 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            int r1 = android.view.View.MeasureSpec.getMode(r11)
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1325400064(0x4f000000, float:2.1474836E9)
            r5 = 1
            if (r0 != r3) goto L1a
            goto L79
        L1a:
            if (r0 != r2) goto L51
            float r0 = r9.desiredStarSize
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L2f
            int r6 = r9.numberOfStars
            float r7 = r9.starsSeparation
            int r0 = r9.calculateTotalWidth(r0, r6, r7, r5)
            int r10 = java.lang.Math.min(r0, r10)
            goto L79
        L2f:
            float r0 = r9.maxStarSize
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L42
            int r6 = r9.numberOfStars
            float r7 = r9.starsSeparation
            int r0 = r9.calculateTotalWidth(r0, r6, r7, r5)
            int r10 = java.lang.Math.min(r0, r10)
            goto L79
        L42:
            float r0 = r9.defaultStarSize
            int r6 = r9.numberOfStars
            float r7 = r9.starsSeparation
            int r0 = r9.calculateTotalWidth(r0, r6, r7, r5)
            int r10 = java.lang.Math.min(r0, r10)
            goto L79
        L51:
            float r10 = r9.desiredStarSize
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L60
            int r0 = r9.numberOfStars
            float r6 = r9.starsSeparation
            int r10 = r9.calculateTotalWidth(r10, r0, r6, r5)
            goto L79
        L60:
            float r10 = r9.maxStarSize
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L6f
            int r0 = r9.numberOfStars
            float r6 = r9.starsSeparation
            int r10 = r9.calculateTotalWidth(r10, r0, r6, r5)
            goto L79
        L6f:
            float r10 = r9.defaultStarSize
            int r0 = r9.numberOfStars
            float r6 = r9.starsSeparation
            int r10 = r9.calculateTotalWidth(r10, r0, r6, r5)
        L79:
            int r0 = r9.getPaddingLeft()
            int r0 = r10 - r0
            int r6 = r9.getPaddingRight()
            int r0 = r0 - r6
            float r0 = (float) r0
            float r6 = r9.starsSeparation
            int r7 = r9.numberOfStars
            int r8 = r7 + (-1)
            float r8 = (float) r8
            float r8 = r8 * r6
            float r0 = r0 - r8
            float r8 = (float) r7
            float r0 = r0 / r8
            if (r1 != r3) goto L94
            goto Ld7
        L94:
            if (r1 != r2) goto Lbd
            float r1 = r9.desiredStarSize
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 == 0) goto La5
            int r0 = r9.calculateTotalHeight(r1, r7, r6, r5)
            int r11 = java.lang.Math.min(r0, r11)
            goto Ld7
        La5:
            float r1 = r9.maxStarSize
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 == 0) goto Lb4
            int r0 = r9.calculateTotalHeight(r1, r7, r6, r5)
            int r11 = java.lang.Math.min(r0, r11)
            goto Ld7
        Lb4:
            int r0 = r9.calculateTotalHeight(r0, r7, r6, r5)
            int r11 = java.lang.Math.min(r0, r11)
            goto Ld7
        Lbd:
            float r11 = r9.desiredStarSize
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto Lc8
            int r11 = r9.calculateTotalHeight(r11, r7, r6, r5)
            goto Ld7
        Lc8:
            float r11 = r9.maxStarSize
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto Ld3
            int r11 = r9.calculateTotalHeight(r11, r7, r6, r5)
            goto Ld7
        Ld3:
            int r11 = r9.calculateTotalHeight(r0, r7, r6, r5)
        Ld7:
            r9.setMeasuredDimension(r10, r11)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            com.iarcuschin.simpleratingbar.SimpleRatingBar$SavedState r2 = (com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            float r2 = com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState.access$000(r2)
            r1.setRating(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.iarcuschin.simpleratingbar.SimpleRatingBar$SavedState r1 = new com.iarcuschin.simpleratingbar.SimpleRatingBar$SavedState
            r1.<init>(r0)
            float r0 = r2.getRating()
            com.iarcuschin.simpleratingbar.SimpleRatingBar.SavedState.access$002(r1, r0)
            return r1
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.generateInternalCanvas(r1, r2)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.isIndicator
            r1 = 0
            if (r0 != 0) goto L70
            android.animation.ValueAnimator r0 = r5.ratingAnimator
            if (r0 == 0) goto L10
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L10
            goto L70
        L10:
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 == r2) goto L22
            r3 = 2
            if (r0 == r3) goto L40
            r6 = 3
            if (r0 == r6) goto L34
            goto L5d
        L22:
            float r0 = r6.getX()
            float r6 = r6.getY()
            r5.setNewRatingFromTouch(r0, r6)
            android.view.View$OnClickListener r6 = r5.clickListener
            if (r6 == 0) goto L34
            r6.onClick(r5)
        L34:
            com.iarcuschin.simpleratingbar.SimpleRatingBar$OnRatingBarChangeListener r6 = r5.ratingListener
            if (r6 == 0) goto L3d
            float r0 = r5.rating
            r6.onRatingChanged(r5, r0, r2)
        L3d:
            r5.touchInProgress = r1
            goto L5d
        L40:
            android.graphics.RectF r0 = r5.starsTouchSpace
            float r3 = r6.getX()
            float r4 = r6.getY()
            boolean r0 = r0.contains(r3, r4)
            if (r0 == 0) goto L61
            r5.touchInProgress = r2
            float r0 = r6.getX()
            float r6 = r6.getY()
            r5.setNewRatingFromTouch(r0, r6)
        L5d:
            r5.invalidate()
            return r2
        L61:
            boolean r6 = r5.touchInProgress
            if (r6 == 0) goto L6e
            com.iarcuschin.simpleratingbar.SimpleRatingBar$OnRatingBarChangeListener r6 = r5.ratingListener
            if (r6 == 0) goto L6e
            float r0 = r5.rating
            r6.onRatingChanged(r5, r0, r2)
        L6e:
            r5.touchInProgress = r1
        L70:
            return r1
    }

    public void setBorderColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.borderColor = r1
            r0.invalidate()
            return
    }

    public void setDrawBorderEnabled(boolean r1) {
            r0 = this;
            r0.drawBorderEnabled = r1
            r0.invalidate()
            return
    }

    public void setFillColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.fillColor = r1
            r0.invalidate()
            return
    }

    public void setGravity(com.iarcuschin.simpleratingbar.SimpleRatingBar.Gravity r1) {
            r0 = this;
            r0.gravity = r1
            r0.invalidate()
            return
    }

    public void setIndicator(boolean r1) {
            r0 = this;
            r0.isIndicator = r1
            r1 = 0
            r0.touchInProgress = r1
            return
    }

    public void setMaxStarSize(float r2) {
            r1 = this;
            r1.maxStarSize = r2
            float r0 = r1.currentStarSize
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L19
            r1.requestLayout()
            int r2 = r1.getWidth()
            int r0 = r1.getHeight()
            r1.generateInternalCanvas(r2, r0)
            r1.invalidate()
        L19:
            return
    }

    public void setMaxStarSize(float r1, @androidx.annotation.Dimension int r2) {
            r0 = this;
            float r1 = r0.valueToPixels(r1, r2)
            r0.setMaxStarSize(r1)
            return
    }

    public void setNumberOfStars(int r4) {
            r3 = this;
            r3.numberOfStars = r4
            if (r4 <= 0) goto L19
            r4 = 0
            r3.rating = r4
            r3.requestLayout()
            int r4 = r3.getWidth()
            int r0 = r3.getHeight()
            r3.generateInternalCanvas(r4, r0)
            r3.invalidate()
            return
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "SimpleRatingBar initialized with invalid value for numberOfStars. Found %d, but should be greater than 0"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.clickListener = r1
            return
    }

    public void setOnRatingBarChangeListener(com.iarcuschin.simpleratingbar.SimpleRatingBar.OnRatingBarChangeListener r1) {
            r0 = this;
            r0.ratingListener = r1
            return
    }

    public void setPressedBorderColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.pressedBorderColor = r1
            r0.invalidate()
            return
    }

    public void setPressedFillColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.pressedFillColor = r1
            r0.invalidate()
            return
    }

    public void setPressedStarBackgroundColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.pressedStarBackgroundColor = r1
            r0.invalidate()
            return
    }

    public void setRating(float r3) {
            r2 = this;
            float r0 = r2.normalizeRating(r3)
            r2.rating = r0
            r2.invalidate()
            com.iarcuschin.simpleratingbar.SimpleRatingBar$OnRatingBarChangeListener r0 = r2.ratingListener
            if (r0 == 0) goto L1d
            android.animation.ValueAnimator r0 = r2.ratingAnimator
            if (r0 == 0) goto L17
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L1d
        L17:
            com.iarcuschin.simpleratingbar.SimpleRatingBar$OnRatingBarChangeListener r0 = r2.ratingListener
            r1 = 0
            r0.onRatingChanged(r2, r3, r1)
        L1d:
            return
    }

    public void setStarBackgroundColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.starBackgroundColor = r1
            r0.invalidate()
            return
    }

    public void setStarBorderWidth(float r4) {
            r3 = this;
            r3.starBorderWidth = r4
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            android.graphics.Paint r0 = r3.paintStarBorder
            r0.setStrokeWidth(r4)
            r3.invalidate()
            return
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "SimpleRatingBar initialized with invalid value for starBorderWidth. Found %f, but should be greater than 0"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public void setStarBorderWidth(float r1, @androidx.annotation.Dimension int r2) {
            r0 = this;
            float r1 = r0.valueToPixels(r1, r2)
            r0.setStarBorderWidth(r1)
            return
    }

    public void setStarCornerRadius(float r4) {
            r3 = this;
            r3.starCornerRadius = r4
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1e
            android.graphics.CornerPathEffect r0 = new android.graphics.CornerPathEffect
            r0.<init>(r4)
            r3.cornerPathEffect = r0
            android.graphics.Paint r4 = r3.paintStarBorder
            r4.setPathEffect(r0)
            android.graphics.Paint r4 = r3.paintStarOutline
            android.graphics.CornerPathEffect r0 = r3.cornerPathEffect
            r4.setPathEffect(r0)
            r3.invalidate()
            return
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "SimpleRatingBar initialized with invalid value for starCornerRadius. Found %f, but should be greater or equal than 0"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public void setStarCornerRadius(float r1, @androidx.annotation.Dimension int r2) {
            r0 = this;
            float r1 = r0.valueToPixels(r1, r2)
            r0.setStarCornerRadius(r1)
            return
    }

    public void setStarSize(float r3) {
            r2 = this;
            r2.desiredStarSize = r3
            r0 = 1325400064(0x4f000000, float:2.1474836E9)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 == 0) goto L30
            float r1 = r2.maxStarSize
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0[r1] = r3
            r3 = 1
            float r1 = r2.maxStarSize
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r3] = r1
            java.lang.String r3 = "Initialized with conflicting values: starSize is greater than maxStarSize (%f > %f). I will ignore maxStarSize"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = "SimpleRatingBar"
            android.util.Log.w(r0, r3)
        L30:
            r2.requestLayout()
            int r3 = r2.getWidth()
            int r0 = r2.getHeight()
            r2.generateInternalCanvas(r3, r0)
            r2.invalidate()
            return
    }

    public void setStarSize(float r1, @androidx.annotation.Dimension int r2) {
            r0 = this;
            float r1 = r0.valueToPixels(r1, r2)
            r0.setStarSize(r1)
            return
    }

    public void setStarsSeparation(float r2) {
            r1 = this;
            r1.starsSeparation = r2
            r1.requestLayout()
            int r2 = r1.getWidth()
            int r0 = r1.getHeight()
            r1.generateInternalCanvas(r2, r0)
            r1.invalidate()
            return
    }

    public void setStarsSeparation(float r1, @androidx.annotation.Dimension int r2) {
            r0 = this;
            float r1 = r0.valueToPixels(r1, r2)
            r0.setStarsSeparation(r1)
            return
    }

    public void setStepSize(float r4) {
            r3 = this;
            r3.stepSize = r4
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb
            r3.invalidate()
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "SimpleRatingBar initialized with invalid value for stepSize. Found %f, but should be greater than 0"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }
}
