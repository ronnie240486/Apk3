package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends android.widget.LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = 0;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = null;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final java.lang.String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private android.animation.ValueAnimator animator;
    private boolean areCornerRadiiRtl;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;

    @androidx.annotation.ColorInt
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;

    @androidx.annotation.ColorInt
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.MaterialShapeDrawable boxUnderlineDefault;

    @androidx.annotation.Nullable
    private com.google.android.material.shape.MaterialShapeDrawable boxUnderlineFocused;
    public final com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper;
    public boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList counterTextColor;

    @androidx.annotation.Nullable
    private android.widget.TextView counterView;

    @androidx.annotation.ColorInt
    private int defaultFilledBackgroundColor;
    private android.content.res.ColorStateList defaultHintTextColor;

    @androidx.annotation.ColorInt
    private int defaultStrokeColor;

    @androidx.annotation.ColorInt
    private int disabledColor;

    @androidx.annotation.ColorInt
    private int disabledFilledBackgroundColor;
    public android.widget.EditText editText;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener> editTextAttachedListeners;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable endDummyDrawable;
    private int endDummyDrawableWidth;

    @androidx.annotation.NonNull
    private final com.google.android.material.textfield.EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private android.graphics.drawable.StateListDrawable filledDropDownMenuBackground;

    @androidx.annotation.ColorInt
    private int focusedFilledBackgroundColor;

    @androidx.annotation.ColorInt
    private int focusedStrokeColor;
    private android.content.res.ColorStateList focusedTextColor;
    private java.lang.CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;

    @androidx.annotation.ColorInt
    private int hoveredFilledBackgroundColor;

    @androidx.annotation.ColorInt
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final com.google.android.material.textfield.IndicatorViewController indicatorViewController;

    @androidx.annotation.NonNull
    private final android.widget.FrameLayout inputFrame;
    private boolean isProvidingHint;

    @androidx.annotation.NonNull
    private com.google.android.material.textfield.TextInputLayout.LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private android.graphics.drawable.Drawable originalEditTextEndDrawable;
    private java.lang.CharSequence originalHint;
    private com.google.android.material.shape.MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;

    @androidx.annotation.Nullable
    private androidx.transition.Fade placeholderFadeIn;

    @androidx.annotation.Nullable
    private androidx.transition.Fade placeholderFadeOut;
    private java.lang.CharSequence placeholderText;
    private int placeholderTextAppearance;

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList placeholderTextColor;
    private android.widget.TextView placeholderTextView;
    private boolean restoringSavedState;

    @androidx.annotation.NonNull
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable startDummyDrawable;
    private int startDummyDrawableWidth;

    @androidx.annotation.NonNull
    private final com.google.android.material.textfield.StartCompoundLayout startLayout;
    private android.content.res.ColorStateList strokeErrorColor;
    private final android.graphics.Rect tmpBoundsRect;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF;
    private android.graphics.Typeface typeface;





    /* JADX INFO: loaded from: classes.dex */
    public static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final com.google.android.material.textfield.TextInputLayout layout;

        public AccessibilityDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r1) {
                r0 = this;
                r0.<init>()
                r0.layout = r1
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.View r14, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
                r13 = this;
                super.onInitializeAccessibilityNodeInfo(r14, r15)
                com.google.android.material.textfield.TextInputLayout r0 = r13.layout
                android.widget.EditText r0 = r0.getEditText()
                if (r0 == 0) goto L10
                android.text.Editable r0 = r0.getText()
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.android.material.textfield.TextInputLayout r1 = r13.layout
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.layout
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.layout
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.layout
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.layout
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.layout
                boolean r9 = r9.isHintExpanded()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L51
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L4f
                goto L51
            L4f:
                r11 = 0
                goto L52
            L51:
                r11 = 1
            L52:
                if (r8 == 0) goto L59
                java.lang.String r1 = r1.toString()
                goto L5b
            L59:
                java.lang.String r1 = ""
            L5b:
                com.google.android.material.textfield.TextInputLayout r8 = r13.layout
                com.google.android.material.textfield.StartCompoundLayout r8 = com.google.android.material.textfield.TextInputLayout.access$400(r8)
                r8.setupAccessibilityNodeInfo(r15)
                java.lang.String r8 = ", "
                if (r6 == 0) goto L6c
                r15.setText(r0)
                goto L94
            L6c:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L8f
                r15.setText(r1)
                if (r9 == 0) goto L94
                if (r3 == 0) goto L94
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                r15.setText(r3)
                goto L94
            L8f:
                if (r3 == 0) goto L94
                r15.setText(r3)
            L94:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto Lc0
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto La4
                r15.setHintText(r1)
                goto Lbb
            La4:
                if (r6 == 0) goto Lb8
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            Lb8:
                r15.setText(r1)
            Lbb:
                r1 = r6 ^ 1
                r15.setShowingHintText(r1)
            Lc0:
                if (r0 == 0) goto Lc9
                int r0 = r0.length()
                if (r0 != r4) goto Lc9
                goto Lca
            Lc9:
                r4 = -1
            Lca:
                r15.setMaxTextLength(r4)
                if (r11 == 0) goto Ld6
                if (r10 == 0) goto Ld2
                goto Ld3
            Ld2:
                r2 = r5
            Ld3:
                r15.setError(r2)
            Ld6:
                com.google.android.material.textfield.TextInputLayout r0 = r13.layout
                com.google.android.material.textfield.IndicatorViewController r0 = com.google.android.material.textfield.TextInputLayout.access$500(r0)
                android.view.View r0 = r0.getHelperTextView()
                if (r0 == 0) goto Le5
                r15.setLabelFor(r0)
            Le5:
                com.google.android.material.textfield.TextInputLayout r0 = r13.layout
                com.google.android.material.textfield.EndCompoundLayout r0 = com.google.android.material.textfield.TextInputLayout.access$300(r0)
                com.google.android.material.textfield.EndIconDelegate r0 = r0.getEndIconDelegate()
                r0.onInitializeAccessibilityNodeInfo(r14, r15)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.onPopulateAccessibilityEvent(r2, r3)
                com.google.android.material.textfield.TextInputLayout r0 = r1.layout
                com.google.android.material.textfield.EndCompoundLayout r0 = com.google.android.material.textfield.TextInputLayout.access$300(r0)
                com.google.android.material.textfield.EndIconDelegate r0 = r0.getEndIconDelegate()
                r0.onPopulateAccessibilityEvent(r2, r3)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface LengthCounter {
        int countLength(@androidx.annotation.Nullable android.text.Editable r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnEndIconChangedListener {
        void onEndIconChanged(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r1, int r2);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.SavedState> CREATOR = null;

        @androidx.annotation.Nullable
        public java.lang.CharSequence error;
        public boolean isEndIconChecked;


        static {
                com.google.android.material.textfield.TextInputLayout$SavedState$1 r0 = new com.google.android.material.textfield.TextInputLayout$SavedState$1
                r0.<init>()
                com.google.android.material.textfield.TextInputLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Parcelable$Creator r2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r2 = r2.createFromParcel(r1)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r0.error = r2
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto L15
                goto L16
            L15:
                r2 = 0
            L16:
                r0.isEndIconChecked = r2
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "TextInputLayout.SavedState{"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " error="
                r0.append(r1)
                java.lang.CharSequence r1 = r2.error
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                java.lang.CharSequence r0 = r1.error
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                boolean r3 = r1.isEndIconChecked
                r2.writeInt(r3)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$ae-b_REtQE9J8sctylgQBMSu39c, reason: not valid java name */
    public static /* synthetic */ int m294$r8$lambda$aeb_REtQE9J8sctylgQBMSu39c(android.text.Editable r0) {
            int r0 = lambda$new$0(r0)
            return r0
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_TextInputLayout
            com.google.android.material.textfield.TextInputLayout.DEF_STYLE_RES = r0
            r0 = 2
            int[][] r0 = new int[r0][]
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r4 = 0
            r2[r4] = r3
            r0[r4] = r2
            int[] r2 = new int[r4]
            r0[r1] = r2
            com.google.android.material.textfield.TextInputLayout.EDIT_TEXT_BACKGROUND_RIPPLE_STATE = r0
            return
    }

    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.textInputStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r21, @androidx.annotation.Nullable android.util.AttributeSet r22, int r23) {
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r9 = com.google.android.material.textfield.TextInputLayout.DEF_STYLE_RES
            r1 = r21
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.minEms = r10
            r0.maxEms = r10
            r0.minWidth = r10
            r0.maxWidth = r10
            com.google.android.material.textfield.IndicatorViewController r1 = new com.google.android.material.textfield.IndicatorViewController
            r1.<init>(r0)
            r0.indicatorViewController = r1
            io.realm.Realm$$ExternalSyntheticLambda0 r1 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$27
            r0.lengthCounter = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpBoundsRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.editTextAttachedListeners = r1
            com.google.android.material.internal.CollapsingTextHelper r1 = new com.google.android.material.internal.CollapsingTextHelper
            r1.<init>(r0)
            r0.collapsingTextHelper = r1
            android.content.Context r11 = r20.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r13 = 0
            r0.setWillNotDraw(r13)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r11)
            r0.inputFrame = r14
            r14.setAddStatesFromChildren(r12)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r1.setTextSizeInterpolator(r2)
            r1.setPositionInterpolator(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.setCollapsedTextGravity(r2)
            int[] r3 = com.google.android.material.R.styleable.TextInputLayout
            r1 = 5
            int[] r6 = new int[r1]
            int r15 = com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance
            r6[r13] = r15
            int r5 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance
            r6[r12] = r5
            int r4 = com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance
            r2 = 2
            r6[r2] = r4
            int r1 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance
            r16 = 3
            r6[r16] = r1
            int r13 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            r16 = 4
            r6[r16] = r13
            r17 = r1
            r1 = r11
            r2 = r22
            r18 = r4
            r4 = r23
            r19 = r5
            r5 = r9
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.StartCompoundLayout r2 = new com.google.android.material.textfield.StartCompoundLayout
            r2.<init>(r0, r1)
            r0.startLayout = r2
            int r3 = com.google.android.material.R.styleable.TextInputLayout_hintEnabled
            boolean r3 = r1.getBoolean(r3, r12)
            r0.hintEnabled = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_android_hint
            java.lang.CharSequence r3 = r1.getText(r3)
            r0.setHint(r3)
            int r3 = com.google.android.material.R.styleable.TextInputLayout_hintAnimationEnabled
            boolean r3 = r1.getBoolean(r3, r12)
            r0.hintAnimationEnabled = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_expandedHintEnabled
            boolean r3 = r1.getBoolean(r3, r12)
            r0.expandedHintEnabled = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_android_minEms
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto Ld5
            int r3 = r1.getInt(r3, r10)
            r0.setMinEms(r3)
            goto Le4
        Ld5:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_android_minWidth
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto Le4
            int r3 = r1.getDimensionPixelSize(r3, r10)
            r0.setMinWidth(r3)
        Le4:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_android_maxEms
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto Lf4
            int r3 = r1.getInt(r3, r10)
            r0.setMaxEms(r3)
            goto L103
        Lf4:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_android_maxWidth
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L103
            int r3 = r1.getDimensionPixelSize(r3, r10)
            r0.setMaxWidth(r3)
        L103:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = com.google.android.material.shape.ShapeAppearanceModel.builder(r11, r7, r8, r9)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r3.build()
            r0.shapeAppearanceModel = r3
            android.content.res.Resources r3 = r11.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.boxLabelCutoutPaddingPx = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxCollapsedPaddingTop
            r4 = 0
            int r3 = r1.getDimensionPixelOffset(r3, r4)
            r0.boxCollapsedPaddingTopPx = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r4 = r11.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.getDimensionPixelSize(r3, r4)
            r0.boxStrokeWidthDefaultPx = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r4 = r11.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.getDimensionPixelSize(r3, r4)
            r0.boxStrokeWidthFocusedPx = r3
            int r3 = r0.boxStrokeWidthDefaultPx
            r0.boxStrokeWidthPx = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopStart
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.getDimension(r3, r4)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r5 = r1.getDimension(r5, r4)
            int r6 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r6 = r1.getDimension(r6, r4)
            int r7 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r4 = r1.getDimension(r7, r4)
            com.google.android.material.shape.ShapeAppearanceModel r7 = r0.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r7 = r7.toBuilder()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L172
            r7.setTopLeftCornerSize(r3)
        L172:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L179
            r7.setTopRightCornerSize(r5)
        L179:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L180
            r7.setBottomRightCornerSize(r6)
        L180:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L187
            r7.setBottomLeftCornerSize(r4)
        L187:
            com.google.android.material.shape.ShapeAppearanceModel r3 = r7.build()
            r0.shapeAppearanceModel = r3
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.getColorStateList(r11, r1, r3)
            if (r3 == 0) goto L1ed
            int r4 = r3.getDefaultColor()
            r0.defaultFilledBackgroundColor = r4
            r0.boxBackgroundColor = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L1c9
            int[] r4 = new int[r12]
            r6 = 0
            r4[r6] = r5
            int r4 = r3.getColorForState(r4, r10)
            r0.disabledFilledBackgroundColor = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {x0362: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.focusedFilledBackgroundColor = r5
            int[] r5 = new int[r4]
            r5 = {x036a: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            r0.hoveredFilledBackgroundColor = r3
            goto L1f9
        L1c9:
            r4 = 2
            int r3 = r0.defaultFilledBackgroundColor
            r0.focusedFilledBackgroundColor = r3
            int r3 = com.google.android.material.R.color.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r11, r3)
            int[] r6 = new int[r12]
            r7 = 0
            r6[r7] = r5
            int r5 = r3.getColorForState(r6, r10)
            r0.disabledFilledBackgroundColor = r5
            int[] r5 = new int[r12]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r7] = r6
            int r3 = r3.getColorForState(r5, r10)
            r0.hoveredFilledBackgroundColor = r3
            goto L1f9
        L1ed:
            r4 = 2
            r7 = 0
            r0.boxBackgroundColor = r7
            r0.defaultFilledBackgroundColor = r7
            r0.disabledFilledBackgroundColor = r7
            r0.focusedFilledBackgroundColor = r7
            r0.hoveredFilledBackgroundColor = r7
        L1f9:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_android_textColorHint
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L209
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.focusedTextColor = r3
            r0.defaultHintTextColor = r3
        L209:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r5 = com.google.android.material.resources.MaterialResources.getColorStateList(r11, r1, r3)
            r6 = 0
            int r3 = r1.getColor(r3, r6)
            r0.focusedStrokeColor = r3
            int r3 = com.google.android.material.R.color.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.ContextCompat.getColor(r11, r3)
            r0.defaultStrokeColor = r3
            int r3 = com.google.android.material.R.color.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.ContextCompat.getColor(r11, r3)
            r0.disabledColor = r3
            int r3 = com.google.android.material.R.color.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.ContextCompat.getColor(r11, r3)
            r0.hoveredStrokeColor = r3
            if (r5 == 0) goto L233
            r0.setBoxStrokeColorStateList(r5)
        L233:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L242
            android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.getColorStateList(r11, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L242:
            int r3 = r1.getResourceId(r13, r10)
            if (r3 == r10) goto L251
            r3 = 0
            int r5 = r1.getResourceId(r13, r3)
            r0.setHintTextAppearance(r5)
            goto L252
        L251:
            r3 = 0
        L252:
            r5 = r18
            int r5 = r1.getResourceId(r5, r3)
            int r6 = com.google.android.material.R.styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r6 = r1.getText(r6)
            int r7 = com.google.android.material.R.styleable.TextInputLayout_errorAccessibilityLiveRegion
            int r7 = r1.getInt(r7, r12)
            int r8 = com.google.android.material.R.styleable.TextInputLayout_errorEnabled
            boolean r8 = r1.getBoolean(r8, r3)
            r9 = r17
            int r9 = r1.getResourceId(r9, r3)
            int r11 = com.google.android.material.R.styleable.TextInputLayout_helperTextEnabled
            boolean r11 = r1.getBoolean(r11, r3)
            int r13 = com.google.android.material.R.styleable.TextInputLayout_helperText
            java.lang.CharSequence r13 = r1.getText(r13)
            int r4 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextAppearance
            int r4 = r1.getResourceId(r4, r3)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r12 = r1.getText(r12)
            int r10 = com.google.android.material.R.styleable.TextInputLayout_counterEnabled
            boolean r10 = r1.getBoolean(r10, r3)
            int r3 = com.google.android.material.R.styleable.TextInputLayout_counterMaxLength
            r22 = r13
            r13 = -1
            int r3 = r1.getInt(r3, r13)
            r0.setCounterMaxLength(r3)
            r3 = 0
            int r13 = r1.getResourceId(r15, r3)
            r0.counterTextAppearance = r13
            r13 = r19
            int r13 = r1.getResourceId(r13, r3)
            r0.counterOverflowTextAppearance = r13
            int r13 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundMode
            int r3 = r1.getInt(r13, r3)
            r0.setBoxBackgroundMode(r3)
            r0.setErrorContentDescription(r6)
            r0.setErrorAccessibilityLiveRegion(r7)
            int r3 = r0.counterOverflowTextAppearance
            r0.setCounterOverflowTextAppearance(r3)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r5)
            int r3 = r0.counterTextAppearance
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r12)
            r0.setPlaceholderTextAppearance(r4)
            int r3 = com.google.android.material.R.styleable.TextInputLayout_errorTextColor
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L2dd
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.setErrorTextColor(r3)
        L2dd:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L2ec
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.setHelperTextColor(r3)
        L2ec:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_hintTextColor
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L2fb
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.setHintTextColor(r3)
        L2fb:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_counterTextColor
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L30a
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.setCounterTextColor(r3)
        L30a:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L319
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.setCounterOverflowTextColor(r3)
        L319:
            int r3 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L328
            android.content.res.ColorStateList r3 = r1.getColorStateList(r3)
            r0.setPlaceholderTextColor(r3)
        L328:
            com.google.android.material.textfield.EndCompoundLayout r3 = new com.google.android.material.textfield.EndCompoundLayout
            r3.<init>(r0, r1)
            r0.endLayout = r3
            int r4 = com.google.android.material.R.styleable.TextInputLayout_android_enabled
            r5 = 1
            boolean r4 = r1.getBoolean(r4, r5)
            r1.recycle()
            r1 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L346
            androidx.core.view.ViewCompat.setImportantForAutofill(r0, r5)
        L346:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r11)
            r0.setErrorEnabled(r8)
            r0.setCounterEnabled(r10)
            r1 = r22
            r0.setHelperText(r1)
            return
    }

    public static /* synthetic */ boolean access$000(com.google.android.material.textfield.TextInputLayout r0) {
            boolean r0 = r0.restoringSavedState
            return r0
    }

    public static /* synthetic */ boolean access$100(com.google.android.material.textfield.TextInputLayout r0) {
            boolean r0 = r0.placeholderEnabled
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.material.textfield.TextInputLayout r0, android.text.Editable r1) {
            r0.updatePlaceholderText(r1)
            return
    }

    public static /* synthetic */ com.google.android.material.textfield.EndCompoundLayout access$300(com.google.android.material.textfield.TextInputLayout r0) {
            com.google.android.material.textfield.EndCompoundLayout r0 = r0.endLayout
            return r0
    }

    public static /* synthetic */ com.google.android.material.textfield.StartCompoundLayout access$400(com.google.android.material.textfield.TextInputLayout r0) {
            com.google.android.material.textfield.StartCompoundLayout r0 = r0.startLayout
            return r0
    }

    public static /* synthetic */ com.google.android.material.textfield.IndicatorViewController access$500(com.google.android.material.textfield.TextInputLayout r0) {
            com.google.android.material.textfield.IndicatorViewController r0 = r0.indicatorViewController
            return r0
    }

    private void addPlaceholderTextView() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto Lf
            android.widget.FrameLayout r1 = r2.inputFrame
            r1.addView(r0)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 0
            r0.setVisibility(r1)
        Lf:
            return
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
            r6 = this;
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L65
            int r0 = r6.boxBackgroundMode
            r1 = 1
            if (r0 == r1) goto La
            goto L65
        La:
            android.content.Context r0 = r6.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast2_0(r0)
            if (r0 == 0) goto L38
            android.widget.EditText r0 = r6.editText
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            android.content.res.Resources r2 = r6.getResources()
            int r3 = com.google.android.material.R.dimen.material_filled_edittext_font_2_0_padding_top
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.editText
            int r3 = androidx.core.view.ViewCompat.getPaddingEnd(r3)
            android.content.res.Resources r4 = r6.getResources()
            int r5 = com.google.android.material.R.dimen.material_filled_edittext_font_2_0_padding_bottom
            int r4 = r4.getDimensionPixelSize(r5)
            androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
            goto L65
        L38:
            android.content.Context r0 = r6.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r0)
            if (r0 == 0) goto L65
            android.widget.EditText r0 = r6.editText
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            android.content.res.Resources r2 = r6.getResources()
            int r3 = com.google.android.material.R.dimen.material_filled_edittext_font_1_3_padding_top
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.editText
            int r3 = androidx.core.view.ViewCompat.getPaddingEnd(r3)
            android.content.res.Resources r4 = r6.getResources()
            int r5 = com.google.android.material.R.dimen.material_filled_edittext_font_1_3_padding_bottom
            int r4 = r4.getDimensionPixelSize(r5)
            androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
        L65:
            return
    }

    private void applyBoxAttributes() {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxBackground
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel r1 = r3.shapeAppearanceModel
            if (r0 == r1) goto L12
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxBackground
            r0.setShapeAppearanceModel(r1)
        L12:
            boolean r0 = r3.canDrawOutlineStroke()
            if (r0 == 0) goto L22
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.boxBackground
            int r1 = r3.boxStrokeWidthPx
            float r1 = (float) r1
            int r2 = r3.boxStrokeColor
            r0.setStroke(r1, r2)
        L22:
            int r0 = r3.calculateBoxBackgroundColor()
            r3.boxBackgroundColor = r0
            com.google.android.material.shape.MaterialShapeDrawable r1 = r3.boxBackground
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setFillColor(r0)
            r3.applyBoxUnderlineAttributes()
            r3.updateEditTextBoxBackgroundIfNeeded()
            return
    }

    private void applyBoxUnderlineAttributes() {
            r2 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxUnderlineDefault
            if (r0 == 0) goto L37
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxUnderlineFocused
            if (r0 != 0) goto L9
            goto L37
        L9:
            boolean r0 = r2.canDrawStroke()
            if (r0 == 0) goto L34
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxUnderlineDefault
            android.widget.EditText r1 = r2.editText
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L20
            int r1 = r2.defaultStrokeColor
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L26
        L20:
            int r1 = r2.boxStrokeColor
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L26:
            r0.setFillColor(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxUnderlineFocused
            int r1 = r2.boxStrokeColor
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
        L34:
            r2.invalidate()
        L37:
            return
    }

    private void applyCutoutPadding(@androidx.annotation.NonNull android.graphics.RectF r4) {
            r3 = this;
            float r0 = r4.left
            int r1 = r3.boxLabelCutoutPaddingPx
            float r2 = (float) r1
            float r0 = r0 - r2
            r4.left = r0
            float r0 = r4.right
            float r1 = (float) r1
            float r0 = r0 + r1
            r4.right = r0
            return
    }

    private void assignBoxBackgroundByMode() {
            r4 = this;
            int r0 = r4.boxBackgroundMode
            r1 = 0
            if (r0 == 0) goto L5a
            r2 = 1
            if (r0 == r2) goto L42
            r2 = 2
            if (r0 != r2) goto L2f
            boolean r0 = r4.hintEnabled
            if (r0 == 0) goto L21
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.boxBackground
            boolean r0 = r0 instanceof com.google.android.material.textfield.CutoutDrawable
            if (r0 != 0) goto L21
            com.google.android.material.shape.ShapeAppearanceModel r0 = r4.shapeAppearanceModel
            int r2 = com.google.android.material.textfield.CutoutDrawable.$r8$clinit
            com.google.android.material.textfield.CutoutDrawable$ImplApi18 r2 = new com.google.android.material.textfield.CutoutDrawable$ImplApi18
            r2.<init>(r0)
            r4.boxBackground = r2
            goto L2a
        L21:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r4.shapeAppearanceModel
            r0.<init>(r2)
            r4.boxBackground = r0
        L2a:
            r4.boxUnderlineDefault = r1
            r4.boxUnderlineFocused = r1
            goto L60
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.boxBackgroundMode
            java.lang.String r3 = " is illegal; only @BoxBackgroundMode constants are supported."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L42:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r4.shapeAppearanceModel
            r0.<init>(r1)
            r4.boxBackground = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r4.boxUnderlineDefault = r0
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r4.boxUnderlineFocused = r0
            goto L60
        L5a:
            r4.boxBackground = r1
            r4.boxUnderlineDefault = r1
            r4.boxUnderlineFocused = r1
        L60:
            return
    }

    private int calculateBoxBackgroundColor() {
            r3 = this;
            int r0 = r3.boxBackgroundColor
            int r1 = r3.boxBackgroundMode
            r2 = 1
            if (r1 != r2) goto L14
            int r0 = com.google.android.material.R.attr.colorSurface
            r1 = 0
            int r0 = com.google.android.material.color.MaterialColors.getColor(r3, r0, r1)
            int r1 = r3.boxBackgroundColor
            int r0 = com.google.android.material.color.MaterialColors.layer(r0, r1)
        L14:
            return r0
    }

    @androidx.annotation.NonNull
    private android.graphics.Rect calculateCollapsedTextBounds(@androidx.annotation.NonNull android.graphics.Rect r5) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 == 0) goto L65
            android.graphics.Rect r0 = r4.tmpBoundsRect
            boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r4)
            int r2 = r5.bottom
            r0.bottom = r2
            int r2 = r4.boxBackgroundMode
            r3 = 1
            if (r2 == r3) goto L4d
            r3 = 2
            if (r2 == r3) goto L2d
            int r2 = r5.left
            int r2 = r4.getLabelLeftBoundAlightWithPrefix(r2, r1)
            r0.left = r2
            int r2 = r4.getPaddingTop()
            r0.top = r2
            int r5 = r5.right
            int r5 = r4.getLabelRightBoundAlignedWithSuffix(r5, r1)
            r0.right = r5
            return r0
        L2d:
            int r1 = r5.left
            android.widget.EditText r2 = r4.editText
            int r2 = r2.getPaddingLeft()
            int r2 = r2 + r1
            r0.left = r2
            int r1 = r5.top
            int r2 = r4.calculateLabelMarginTop()
            int r1 = r1 - r2
            r0.top = r1
            int r5 = r5.right
            android.widget.EditText r1 = r4.editText
            int r1 = r1.getPaddingRight()
            int r5 = r5 - r1
            r0.right = r5
            return r0
        L4d:
            int r2 = r5.left
            int r2 = r4.getLabelLeftBoundAlightWithPrefix(r2, r1)
            r0.left = r2
            int r2 = r5.top
            int r3 = r4.boxCollapsedPaddingTopPx
            int r2 = r2 + r3
            r0.top = r2
            int r5 = r5.right
            int r5 = r4.getLabelRightBoundAlignedWithSuffix(r5, r1)
            r0.right = r5
            return r0
        L65:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
    }

    private int calculateExpandedLabelBottom(@androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.graphics.Rect r3, float r4) {
            r1 = this;
            boolean r0 = r1.isSingleLineFilledTextField()
            if (r0 == 0) goto Lc
            int r2 = r3.top
            float r2 = (float) r2
            float r2 = r2 + r4
            int r2 = (int) r2
            return r2
        Lc:
            int r2 = r2.bottom
            android.widget.EditText r3 = r1.editText
            int r3 = r3.getCompoundPaddingBottom()
            int r2 = r2 - r3
            return r2
    }

    private int calculateExpandedLabelTop(@androidx.annotation.NonNull android.graphics.Rect r2, float r3) {
            r1 = this;
            boolean r0 = r1.isSingleLineFilledTextField()
            if (r0 == 0) goto L11
            int r2 = r2.centerY()
            float r2 = (float) r2
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r2 = r2 - r3
            int r2 = (int) r2
            return r2
        L11:
            int r2 = r2.top
            android.widget.EditText r3 = r1.editText
            int r3 = r3.getCompoundPaddingTop()
            int r3 = r3 + r2
            return r3
    }

    @androidx.annotation.NonNull
    private android.graphics.Rect calculateExpandedTextBounds(@androidx.annotation.NonNull android.graphics.Rect r5) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 == 0) goto L2f
            android.graphics.Rect r0 = r4.tmpBoundsRect
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            float r1 = r1.getExpandedTextHeight()
            int r2 = r5.left
            android.widget.EditText r3 = r4.editText
            int r3 = r3.getCompoundPaddingLeft()
            int r3 = r3 + r2
            r0.left = r3
            int r2 = r4.calculateExpandedLabelTop(r5, r1)
            r0.top = r2
            int r2 = r5.right
            android.widget.EditText r3 = r4.editText
            int r3 = r3.getCompoundPaddingRight()
            int r2 = r2 - r3
            r0.right = r2
            int r5 = r4.calculateExpandedLabelBottom(r5, r0, r1)
            r0.bottom = r5
            return r0
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
    }

    private int calculateLabelMarginTop() {
            r3 = this;
            boolean r0 = r3.hintEnabled
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r3.boxBackgroundMode
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r2) goto Le
            return r1
        Le:
            com.google.android.material.internal.CollapsingTextHelper r0 = r3.collapsingTextHelper
            float r0 = r0.getCollapsedTextHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
        L17:
            int r0 = (int) r0
            return r0
        L19:
            com.google.android.material.internal.CollapsingTextHelper r0 = r3.collapsingTextHelper
            float r0 = r0.getCollapsedTextHeight()
            goto L17
    }

    private boolean canDrawOutlineStroke() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 2
            if (r0 != r1) goto Ld
            boolean r0 = r2.canDrawStroke()
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    private boolean canDrawStroke() {
            r2 = this;
            int r0 = r2.boxStrokeWidthPx
            r1 = -1
            if (r0 <= r1) goto Lb
            int r0 = r2.boxStrokeColor
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private void closeCutout() {
            r2 = this;
            boolean r0 = r2.cutoutEnabled()
            if (r0 == 0) goto Le
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxBackground
            com.google.android.material.textfield.CutoutDrawable r0 = (com.google.android.material.textfield.CutoutDrawable) r0
            r1 = 0
            r0.setCutout(r1, r1, r1, r1)
        Le:
            return
    }

    private void collapseHint(boolean r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.animator
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.animator
            r0.cancel()
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L1b
            boolean r2 = r1.hintAnimationEnabled
            if (r2 == 0) goto L1b
            r1.animateToExpansionFraction(r0)
            goto L20
        L1b:
            com.google.android.material.internal.CollapsingTextHelper r2 = r1.collapsingTextHelper
            r2.setExpansionFraction(r0)
        L20:
            r2 = 0
            r1.hintExpanded = r2
            boolean r0 = r1.cutoutEnabled()
            if (r0 == 0) goto L2c
            r1.openCutout()
        L2c:
            r1.updatePlaceholderText()
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.onHintStateChanged(r2)
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.onHintStateChanged(r2)
            return
    }

    private androidx.transition.Fade createPlaceholderFadeTransition() {
            r4 = this;
            androidx.transition.Fade r0 = new androidx.transition.Fade
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.attr.motionDurationShort2
            r3 = 87
            int r1 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r1, r2, r3)
            long r1 = (long) r1
            r0.setDuration(r1)
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r1, r2, r3)
            r0.setInterpolator(r1)
            return r0
    }

    private boolean cutoutEnabled() {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto L14
            java.lang.CharSequence r0 = r1.hint
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            boolean r0 = r0 instanceof com.google.android.material.textfield.CutoutDrawable
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private void dispatchOnEditTextAttached() {
            r2 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r2.editTextAttachedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener r1 = (com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener) r1
            r1.onEditTextAttached(r2)
            goto L6
        L16:
            return
    }

    private void drawBoxUnderline(android.graphics.Canvas r6) {
            r5 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.boxUnderlineFocused
            if (r0 == 0) goto L3e
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.boxUnderlineDefault
            if (r0 == 0) goto L3e
            r0.draw(r6)
            android.widget.EditText r0 = r5.editText
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L3e
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.boxUnderlineFocused
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r5.boxUnderlineDefault
            android.graphics.Rect r1 = r1.getBounds()
            com.google.android.material.internal.CollapsingTextHelper r2 = r5.collapsingTextHelper
            float r2 = r2.getExpansionFraction()
            int r3 = r1.centerX()
            int r4 = r1.left
            int r4 = com.google.android.material.animation.AnimationUtils.lerp(r3, r4, r2)
            r0.left = r4
            int r1 = r1.right
            int r1 = com.google.android.material.animation.AnimationUtils.lerp(r3, r1, r2)
            r0.right = r1
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.boxUnderlineFocused
            r0.draw(r6)
        L3e:
            return
    }

    private void drawHint(@androidx.annotation.NonNull android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto L9
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.draw(r2)
        L9:
            return
    }

    private void expandHint(boolean r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.animator
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.animator
            r0.cancel()
        Lf:
            r0 = 0
            if (r2 == 0) goto L1a
            boolean r2 = r1.hintAnimationEnabled
            if (r2 == 0) goto L1a
            r1.animateToExpansionFraction(r0)
            goto L1f
        L1a:
            com.google.android.material.internal.CollapsingTextHelper r2 = r1.collapsingTextHelper
            r2.setExpansionFraction(r0)
        L1f:
            boolean r2 = r1.cutoutEnabled()
            r0 = 1
            if (r2 == 0) goto L36
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.boxBackground
            com.google.android.material.textfield.CutoutDrawable r2 = (com.google.android.material.textfield.CutoutDrawable) r2
            android.graphics.RectF r2 = r2.cutoutBounds
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L36
            r1.closeCutout()
        L36:
            r1.hintExpanded = r0
            r1.hidePlaceholderText()
            com.google.android.material.textfield.StartCompoundLayout r2 = r1.startLayout
            r2.onHintStateChanged(r0)
            com.google.android.material.textfield.EndCompoundLayout r2 = r1.endLayout
            r2.onHintStateChanged(r0)
            return
    }

    private com.google.android.material.shape.MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean r5) {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_shape_corner_size_small_component
            int r0 = r0.getDimensionPixelOffset(r1)
            float r0 = (float) r0
            if (r5 == 0) goto Lf
            r5 = r0
            goto L10
        Lf:
            r5 = 0
        L10:
            android.widget.EditText r1 = r4.editText
            boolean r2 = r1 instanceof com.google.android.material.textfield.MaterialAutoCompleteTextView
            if (r2 == 0) goto L1d
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) r1
            float r1 = r1.getPopupElevation()
            goto L28
        L1d:
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.google.android.material.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation
            int r1 = r1.getDimensionPixelOffset(r2)
            float r1 = (float) r1
        L28:
            android.content.res.Resources r2 = r4.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.setTopLeftCornerSize(r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r5 = r3.setTopRightCornerSize(r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r5 = r5.setBottomLeftCornerSize(r0)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r5 = r5.setBottomRightCornerSize(r0)
            com.google.android.material.shape.ShapeAppearanceModel r5 = r5.build()
            android.content.Context r0 = r4.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r0 = com.google.android.material.shape.MaterialShapeDrawable.createWithElevationOverlay(r0, r1)
            r0.setShapeAppearanceModel(r5)
            r5 = 0
            r0.setPadding(r5, r2, r5, r2)
            return r0
    }

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable getEditTextBoxBackground() {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
            if (r1 == 0) goto L37
            boolean r0 = com.google.android.material.textfield.EditTextUtils.isEditable(r0)
            if (r0 == 0) goto Ld
            goto L37
        Ld:
            android.widget.EditText r0 = r4.editText
            int r1 = com.google.android.material.R.attr.colorControlHighlight
            int r0 = com.google.android.material.color.MaterialColors.getColor(r0, r1)
            int r1 = r4.boxBackgroundMode
            r2 = 2
            if (r1 != r2) goto L27
            android.content.Context r1 = r4.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.boxBackground
            int[][] r3 = com.google.android.material.textfield.TextInputLayout.EDIT_TEXT_BACKGROUND_RIPPLE_STATE
            android.graphics.drawable.Drawable r0 = getOutlinedBoxBackgroundWithRipple(r1, r2, r0, r3)
            return r0
        L27:
            r2 = 1
            if (r1 != r2) goto L35
            com.google.android.material.shape.MaterialShapeDrawable r1 = r4.boxBackground
            int r2 = r4.boxBackgroundColor
            int[][] r3 = com.google.android.material.textfield.TextInputLayout.EDIT_TEXT_BACKGROUND_RIPPLE_STATE
            android.graphics.drawable.Drawable r0 = getFilledBoxBackgroundWithRipple(r1, r2, r0, r3)
            return r0
        L35:
            r0 = 0
            return r0
        L37:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r4.boxBackground
            return r0
    }

    private static android.graphics.drawable.Drawable getFilledBoxBackgroundWithRipple(com.google.android.material.shape.MaterialShapeDrawable r2, int r3, int r4, int[][] r5) {
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r4 = com.google.android.material.color.MaterialColors.layer(r4, r3, r0)
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r3
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r3.<init>(r5, r0)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            r4.<init>(r3, r2, r2)
            return r4
    }

    private int getLabelLeftBoundAlightWithPrefix(int r2, boolean r3) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            int r0 = r0.getCompoundPaddingLeft()
            int r0 = r0 + r2
            java.lang.CharSequence r2 = r1.getPrefixText()
            if (r2 == 0) goto L21
            if (r3 != 0) goto L21
            android.widget.TextView r2 = r1.getPrefixTextView()
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            android.widget.TextView r2 = r1.getPrefixTextView()
            int r2 = r2.getPaddingLeft()
            int r0 = r0 + r2
        L21:
            return r0
    }

    private int getLabelRightBoundAlignedWithSuffix(int r2, boolean r3) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            int r0 = r0.getCompoundPaddingRight()
            int r2 = r2 - r0
            java.lang.CharSequence r0 = r1.getPrefixText()
            if (r0 == 0) goto L21
            if (r3 == 0) goto L21
            android.widget.TextView r3 = r1.getPrefixTextView()
            int r3 = r3.getMeasuredWidth()
            android.widget.TextView r0 = r1.getPrefixTextView()
            int r0 = r0.getPaddingRight()
            int r3 = r3 - r0
            int r2 = r2 + r3
        L21:
            return r2
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground() {
            r4 = this;
            android.graphics.drawable.StateListDrawable r0 = r4.filledDropDownMenuBackground
            if (r0 != 0) goto L26
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            r4.filledDropDownMenuBackground = r0
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 16842922(0x10100aa, float:2.3694034E-38)
            r3 = 0
            r1[r3] = r2
            android.graphics.drawable.Drawable r2 = r4.getOrCreateOutlinedDropDownMenuBackground()
            r0.addState(r1, r2)
            android.graphics.drawable.StateListDrawable r0 = r4.filledDropDownMenuBackground
            int[] r1 = new int[r3]
            com.google.android.material.shape.MaterialShapeDrawable r2 = r4.getDropDownMaterialShapeDrawable(r3)
            r0.addState(r1, r2)
        L26:
            android.graphics.drawable.StateListDrawable r0 = r4.filledDropDownMenuBackground
            return r0
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.outlinedDropDownMenuBackground
            if (r0 != 0) goto Lb
            r0 = 1
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.getDropDownMaterialShapeDrawable(r0)
            r1.outlinedDropDownMenuBackground = r0
        Lb:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.outlinedDropDownMenuBackground
            return r0
    }

    private static android.graphics.drawable.Drawable getOutlinedBoxBackgroundWithRipple(android.content.Context r6, com.google.android.material.shape.MaterialShapeDrawable r7, int r8, int[][] r9) {
            int r0 = com.google.android.material.R.attr.colorSurface
            java.lang.String r1 = "TextInputLayout"
            int r6 = com.google.android.material.color.MaterialColors.getColor(r6, r0, r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r1 = r7.getShapeAppearanceModel()
            r0.<init>(r1)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r8 = com.google.android.material.color.MaterialColors.layer(r8, r6, r1)
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 0
            r2[r3] = r8
            r4 = 1
            r2[r4] = r3
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r9, r2)
            r0.setFillColor(r5)
            r0.setTint(r6)
            int[] r2 = new int[r1]
            r2[r3] = r8
            r2[r4] = r6
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r6.<init>(r9, r2)
            com.google.android.material.shape.MaterialShapeDrawable r8 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r9 = r7.getShapeAppearanceModel()
            r8.<init>(r9)
            r9 = -1
            r8.setTint(r9)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            r9.<init>(r6, r0, r8)
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r1]
            r6[r3] = r9
            r6[r4] = r7
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r7.<init>(r6)
            return r7
    }

    private void hidePlaceholderText() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto L19
            boolean r1 = r2.placeholderEnabled
            if (r1 == 0) goto L19
            r1 = 0
            r0.setText(r1)
            android.widget.FrameLayout r0 = r2.inputFrame
            androidx.transition.Fade r1 = r2.placeholderFadeOut
            androidx.transition.TransitionManager.beginDelayedTransition(r0, r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 4
            r0.setVisibility(r1)
        L19:
            return
    }

    private boolean isSingleLineFilledTextField() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 1
            if (r0 != r1) goto Le
            android.widget.EditText r0 = r2.editText
            int r0 = r0.getMinLines()
            if (r0 > r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static /* synthetic */ int lambda$new$0(android.text.Editable r0) {
            if (r0 == 0) goto L7
            int r0 = r0.length()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private void onApplyBoxBackgroundMode() {
            r1 = this;
            r1.assignBoxBackgroundByMode()
            r1.updateEditTextBoxBackgroundIfNeeded()
            r1.updateTextInputBoxState()
            r1.updateBoxCollapsedPaddingTop()
            r1.adjustFilledEditTextPaddingForLargeFont()
            int r0 = r1.boxBackgroundMode
            if (r0 == 0) goto L16
            r1.updateInputLayoutMargins()
        L16:
            r1.setDropDownMenuBackgroundIfNeeded()
            return
    }

    private void openCutout() {
            r5 = this;
            boolean r0 = r5.cutoutEnabled()
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.RectF r0 = r5.tmpRectF
            com.google.android.material.internal.CollapsingTextHelper r1 = r5.collapsingTextHelper
            android.widget.EditText r2 = r5.editText
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r5.editText
            int r3 = r3.getGravity()
            r1.getCollapsedTextActualBounds(r0, r2, r3)
            float r1 = r0.width()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L5c
            float r1 = r0.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L2c
            goto L5c
        L2c:
            r5.applyCutoutPadding(r0)
            int r1 = r5.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r5.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 - r3
            int r3 = r5.boxStrokeWidthPx
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r5.boxBackground
            com.google.android.material.textfield.CutoutDrawable r1 = (com.google.android.material.textfield.CutoutDrawable) r1
            java.util.Objects.requireNonNull(r1)
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.setCutout(r2, r3, r4, r0)
        L5c:
            return
    }

    private void recalculateCutout() {
            r1 = this;
            boolean r0 = r1.cutoutEnabled()
            if (r0 == 0) goto L10
            boolean r0 = r1.hintExpanded
            if (r0 != 0) goto L10
            r1.closeCutout()
            r1.openCutout()
        L10:
            return
    }

    private static void recursiveSetEnabled(@androidx.annotation.NonNull android.view.ViewGroup r4, boolean r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            r2.setEnabled(r5)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L17
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            recursiveSetEnabled(r2, r5)
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            return
    }

    private void removePlaceholderTextView() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }

    private void setDropDownMenuBackgroundIfNeeded() {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
            if (r1 != 0) goto L7
            return
        L7:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r1 = r0.getDropDownBackground()
            if (r1 != 0) goto L26
            int r1 = r3.boxBackgroundMode
            r2 = 2
            if (r1 != r2) goto L1c
            android.graphics.drawable.Drawable r1 = r3.getOrCreateOutlinedDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r1)
            goto L26
        L1c:
            r2 = 1
            if (r1 != r2) goto L26
            android.graphics.drawable.Drawable r1 = r3.getOrCreateFilledDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r1)
        L26:
            return
    }

    private void setEditText(android.widget.EditText r5) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 != 0) goto Le0
            int r0 = r4.getEndIconMode()
            r1 = 3
            if (r0 == r1) goto L16
            boolean r0 = r5 instanceof com.google.android.material.textfield.TextInputEditText
            if (r0 != 0) goto L16
            java.lang.String r0 = "TextInputLayout"
            java.lang.String r1 = "EditText added is not a TextInputEditText. Please switch to using that class instead."
            android.util.Log.i(r0, r1)
        L16:
            r4.editText = r5
            int r0 = r4.minEms
            r1 = -1
            if (r0 == r1) goto L21
            r4.setMinEms(r0)
            goto L26
        L21:
            int r0 = r4.minWidth
            r4.setMinWidth(r0)
        L26:
            int r0 = r4.maxEms
            if (r0 == r1) goto L2e
            r4.setMaxEms(r0)
            goto L33
        L2e:
            int r0 = r4.maxWidth
            r4.setMaxWidth(r0)
        L33:
            r0 = 0
            r4.boxBackgroundApplied = r0
            r4.onApplyBoxBackgroundMode()
            com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate r1 = new com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate
            r1.<init>(r4)
            r4.setTextInputAccessibilityDelegate(r1)
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            android.widget.EditText r2 = r4.editText
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypefaces(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            android.widget.EditText r2 = r4.editText
            float r2 = r2.getTextSize()
            r1.setExpandedTextSize(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r4.collapsingTextHelper
            android.widget.EditText r2 = r4.editText
            float r2 = r2.getLetterSpacing()
            r1.setExpandedLetterSpacing(r2)
            android.widget.EditText r1 = r4.editText
            int r1 = r1.getGravity()
            com.google.android.material.internal.CollapsingTextHelper r2 = r4.collapsingTextHelper
            r3 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | 48
            r2.setCollapsedTextGravity(r3)
            com.google.android.material.internal.CollapsingTextHelper r2 = r4.collapsingTextHelper
            r2.setExpandedTextGravity(r1)
            android.widget.EditText r1 = r4.editText
            com.google.android.material.textfield.TextInputLayout$1 r2 = new com.google.android.material.textfield.TextInputLayout$1
            r2.<init>(r4)
            r1.addTextChangedListener(r2)
            android.content.res.ColorStateList r1 = r4.defaultHintTextColor
            if (r1 != 0) goto L8c
            android.widget.EditText r1 = r4.editText
            android.content.res.ColorStateList r1 = r1.getHintTextColors()
            r4.defaultHintTextColor = r1
        L8c:
            boolean r1 = r4.hintEnabled
            r2 = 1
            if (r1 == 0) goto Lac
            java.lang.CharSequence r1 = r4.hint
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Laa
            android.widget.EditText r1 = r4.editText
            java.lang.CharSequence r1 = r1.getHint()
            r4.originalHint = r1
            r4.setHint(r1)
            android.widget.EditText r1 = r4.editText
            r3 = 0
            r1.setHint(r3)
        Laa:
            r4.isProvidingHint = r2
        Lac:
            android.widget.TextView r1 = r4.counterView
            if (r1 == 0) goto Lb9
            android.widget.EditText r1 = r4.editText
            android.text.Editable r1 = r1.getText()
            r4.updateCounter(r1)
        Lb9:
            r4.updateEditTextBackground()
            com.google.android.material.textfield.IndicatorViewController r1 = r4.indicatorViewController
            r1.adjustIndicatorPadding()
            com.google.android.material.textfield.StartCompoundLayout r1 = r4.startLayout
            r1.bringToFront()
            com.google.android.material.textfield.EndCompoundLayout r1 = r4.endLayout
            r1.bringToFront()
            r4.dispatchOnEditTextAttached()
            com.google.android.material.textfield.EndCompoundLayout r1 = r4.endLayout
            r1.updateSuffixTextViewPadding()
            boolean r1 = r4.isEnabled()
            if (r1 != 0) goto Ldc
            r5.setEnabled(r0)
        Ldc:
            r4.updateLabelState(r0, r2)
            return
        Le0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "We already have an EditText, can only have one"
            r5.<init>(r0)
            throw r5
    }

    private void setHintInternal(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.hint
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L16
            r1.hint = r2
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setText(r2)
            boolean r2 = r1.hintExpanded
            if (r2 != 0) goto L16
            r1.openCutout()
        L16:
            return
    }

    private void setPlaceholderTextEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.placeholderEnabled
            if (r0 != r2) goto L5
            return
        L5:
            if (r2 == 0) goto Lb
            r1.addPlaceholderTextView()
            goto L11
        Lb:
            r1.removePlaceholderTextView()
            r0 = 0
            r1.placeholderTextView = r0
        L11:
            r1.placeholderEnabled = r2
            return
    }

    private boolean shouldUpdateEndDummyDrawable() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            boolean r0 = r0.isErrorIconVisible()
            if (r0 != 0) goto L1e
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            boolean r0 = r0.hasEndIcon()
            if (r0 == 0) goto L16
            boolean r0 = r1.isEndIconVisible()
            if (r0 != 0) goto L1e
        L16:
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            java.lang.CharSequence r0 = r0.getSuffixText()
            if (r0 == 0) goto L28
        L1e:
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    private boolean shouldUpdateStartDummyDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getStartIconDrawable()
            if (r0 != 0) goto L16
            java.lang.CharSequence r0 = r1.getPrefixText()
            if (r0 == 0) goto L20
            android.widget.TextView r0 = r1.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L20
        L16:
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    private void showPlaceholderText() {
            r2 = this;
            android.widget.TextView r0 = r2.placeholderTextView
            if (r0 == 0) goto L2e
            boolean r0 = r2.placeholderEnabled
            if (r0 == 0) goto L2e
            java.lang.CharSequence r0 = r2.placeholderText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2e
            android.widget.TextView r0 = r2.placeholderTextView
            java.lang.CharSequence r1 = r2.placeholderText
            r0.setText(r1)
            android.widget.FrameLayout r0 = r2.inputFrame
            androidx.transition.Fade r1 = r2.placeholderFadeIn
            androidx.transition.TransitionManager.beginDelayedTransition(r0, r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.placeholderTextView
            r0.bringToFront()
            java.lang.CharSequence r0 = r2.placeholderText
            r2.announceForAccessibility(r0)
        L2e:
            return
    }

    private void updateBoxCollapsedPaddingTop() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 1
            if (r0 != r1) goto L32
            android.content.Context r0 = r2.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast2_0(r0)
            if (r0 == 0) goto L1c
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.dimen.material_font_2_0_box_collapsed_padding_top
            int r0 = r0.getDimensionPixelSize(r1)
            r2.boxCollapsedPaddingTopPx = r0
            goto L32
        L1c:
            android.content.Context r0 = r2.getContext()
            boolean r0 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r0)
            if (r0 == 0) goto L32
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.dimen.material_font_1_3_box_collapsed_padding_top
            int r0 = r0.getDimensionPixelSize(r1)
            r2.boxCollapsedPaddingTopPx = r0
        L32:
            return
    }

    private void updateBoxUnderlineBounds(@androidx.annotation.NonNull android.graphics.Rect r6) {
            r5 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.boxUnderlineDefault
            if (r0 == 0) goto L11
            int r1 = r6.bottom
            int r2 = r5.boxStrokeWidthDefaultPx
            int r2 = r1 - r2
            int r3 = r6.left
            int r4 = r6.right
            r0.setBounds(r3, r2, r4, r1)
        L11:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.boxUnderlineFocused
            if (r0 == 0) goto L22
            int r1 = r6.bottom
            int r2 = r5.boxStrokeWidthFocusedPx
            int r2 = r1 - r2
            int r3 = r6.left
            int r6 = r6.right
            r0.setBounds(r3, r2, r6, r1)
        L22:
            return
    }

    private void updateCounter() {
            r1 = this;
            android.widget.TextView r0 = r1.counterView
            if (r0 == 0) goto L11
            android.widget.EditText r0 = r1.editText
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            android.text.Editable r0 = r0.getText()
        Le:
            r1.updateCounter(r0)
        L11:
            return
    }

    private static void updateCounterContentDescription(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.widget.TextView r3, int r4, int r5, boolean r6) {
            if (r6 == 0) goto L5
            int r6 = com.google.android.material.R.string.character_counter_overflowed_content_description
            goto L7
        L5:
            int r6 = com.google.android.material.R.string.character_counter_content_description
        L7:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r2 = r2.getString(r6, r0)
            r3.setContentDescription(r2)
            return
    }

    private void updateCounterTextAppearanceAndColor() {
            r2 = this;
            android.widget.TextView r0 = r2.counterView
            if (r0 == 0) goto L2a
            boolean r1 = r2.counterOverflowed
            if (r1 == 0) goto Lb
            int r1 = r2.counterOverflowTextAppearance
            goto Ld
        Lb:
            int r1 = r2.counterTextAppearance
        Ld:
            r2.setTextAppearanceCompatWithErrorFallback(r0, r1)
            boolean r0 = r2.counterOverflowed
            if (r0 != 0) goto L1d
            android.content.res.ColorStateList r0 = r2.counterTextColor
            if (r0 == 0) goto L1d
            android.widget.TextView r1 = r2.counterView
            r1.setTextColor(r0)
        L1d:
            boolean r0 = r2.counterOverflowed
            if (r0 == 0) goto L2a
            android.content.res.ColorStateList r0 = r2.counterOverflowTextColor
            if (r0 == 0) goto L2a
            android.widget.TextView r1 = r2.counterView
            r1.setTextColor(r0)
        L2a:
            return
    }

    @android.annotation.TargetApi(29)
    private void updateCursorColor(boolean r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.google.android.material.R.attr.colorControlActivated
            android.content.res.ColorStateList r0 = com.google.android.material.color.MaterialColors.getColorStateListOrNull(r0, r1)
            android.widget.EditText r1 = r2.editText
            if (r1 == 0) goto L2e
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 == 0) goto L2e
            if (r0 != 0) goto L17
            goto L2e
        L17:
            android.widget.EditText r1 = r2.editText
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r3 == 0) goto L2b
            android.content.res.ColorStateList r3 = r2.strokeErrorColor
            if (r3 == 0) goto L24
            goto L2a
        L24:
            int r3 = r2.boxStrokeColor
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
        L2a:
            r0 = r3
        L2b:
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r1, r0)
        L2e:
            return
    }

    private boolean updateEditTextHeightBasedOnIcon() {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.material.textfield.EndCompoundLayout r0 = r3.endLayout
            int r0 = r0.getMeasuredHeight()
            com.google.android.material.textfield.StartCompoundLayout r2 = r3.startLayout
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.editText
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L25
            android.widget.EditText r1 = r3.editText
            r1.setMinimumHeight(r0)
            r0 = 1
            return r0
        L25:
            return r1
    }

    private void updateInputLayoutMargins() {
            r3 = this;
            int r0 = r3.boxBackgroundMode
            r1 = 1
            if (r0 == r1) goto L1c
            android.widget.FrameLayout r0 = r3.inputFrame
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r3.calculateLabelMarginTop()
            int r2 = r0.topMargin
            if (r1 == r2) goto L1c
            r0.topMargin = r1
            android.widget.FrameLayout r0 = r3.inputFrame
            r0.requestLayout()
        L1c:
            return
    }

    private void updateLabelState(boolean r8, boolean r9) {
            r7 = this;
            boolean r0 = r7.isEnabled()
            android.widget.EditText r1 = r7.editText
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            android.widget.EditText r4 = r7.editText
            if (r4 == 0) goto L23
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L23
            r4 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            android.content.res.ColorStateList r5 = r7.defaultHintTextColor
            if (r5 == 0) goto L2d
            com.google.android.material.internal.CollapsingTextHelper r6 = r7.collapsingTextHelper
            r6.setCollapsedAndExpandedTextColor(r5)
        L2d:
            if (r0 != 0) goto L4d
            android.content.res.ColorStateList r0 = r7.defaultHintTextColor
            if (r0 == 0) goto L41
            int[] r2 = new int[r2]
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r2[r3] = r5
            int r3 = r7.disabledColor
            int r0 = r0.getColorForState(r2, r3)
            goto L43
        L41:
            int r0 = r7.disabledColor
        L43:
            com.google.android.material.internal.CollapsingTextHelper r2 = r7.collapsingTextHelper
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setCollapsedAndExpandedTextColor(r0)
            goto L7c
        L4d:
            boolean r0 = r7.shouldShowError()
            if (r0 == 0) goto L5f
            com.google.android.material.internal.CollapsingTextHelper r0 = r7.collapsingTextHelper
            com.google.android.material.textfield.IndicatorViewController r2 = r7.indicatorViewController
            android.content.res.ColorStateList r2 = r2.getErrorViewTextColors()
            r0.setCollapsedAndExpandedTextColor(r2)
            goto L7c
        L5f:
            boolean r0 = r7.counterOverflowed
            if (r0 == 0) goto L71
            android.widget.TextView r0 = r7.counterView
            if (r0 == 0) goto L71
            com.google.android.material.internal.CollapsingTextHelper r2 = r7.collapsingTextHelper
            android.content.res.ColorStateList r0 = r0.getTextColors()
            r2.setCollapsedAndExpandedTextColor(r0)
            goto L7c
        L71:
            if (r4 == 0) goto L7c
            android.content.res.ColorStateList r0 = r7.focusedTextColor
            if (r0 == 0) goto L7c
            com.google.android.material.internal.CollapsingTextHelper r2 = r7.collapsingTextHelper
            r2.setCollapsedTextColor(r0)
        L7c:
            if (r1 != 0) goto L95
            boolean r0 = r7.expandedHintEnabled
            if (r0 == 0) goto L95
            boolean r0 = r7.isEnabled()
            if (r0 == 0) goto L8b
            if (r4 == 0) goto L8b
            goto L95
        L8b:
            if (r9 != 0) goto L91
            boolean r9 = r7.hintExpanded
            if (r9 != 0) goto L9e
        L91:
            r7.expandHint(r8)
            goto L9e
        L95:
            if (r9 != 0) goto L9b
            boolean r9 = r7.hintExpanded
            if (r9 == 0) goto L9e
        L9b:
            r7.collapseHint(r8)
        L9e:
            return
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
            r5 = this;
            android.widget.TextView r0 = r5.placeholderTextView
            if (r0 == 0) goto L2e
            android.widget.EditText r0 = r5.editText
            if (r0 == 0) goto L2e
            int r0 = r0.getGravity()
            android.widget.TextView r1 = r5.placeholderTextView
            r1.setGravity(r0)
            android.widget.TextView r0 = r5.placeholderTextView
            android.widget.EditText r1 = r5.editText
            int r1 = r1.getCompoundPaddingLeft()
            android.widget.EditText r2 = r5.editText
            int r2 = r2.getCompoundPaddingTop()
            android.widget.EditText r3 = r5.editText
            int r3 = r3.getCompoundPaddingRight()
            android.widget.EditText r4 = r5.editText
            int r4 = r4.getCompoundPaddingBottom()
            r0.setPadding(r1, r2, r3, r4)
        L2e:
            return
    }

    private void updatePlaceholderText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            android.text.Editable r0 = r0.getText()
        La:
            r1.updatePlaceholderText(r0)
            return
    }

    private void updatePlaceholderText(@androidx.annotation.Nullable android.text.Editable r2) {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout$LengthCounter r0 = r1.lengthCounter
            int r2 = r0.countLength(r2)
            if (r2 != 0) goto L10
            boolean r2 = r1.hintExpanded
            if (r2 != 0) goto L10
            r1.showPlaceholderText()
            goto L13
        L10:
            r1.hidePlaceholderText()
        L13:
            return
    }

    private void updateStrokeErrorColor(boolean r5, boolean r6) {
            r4 = this;
            android.content.res.ColorStateList r0 = r4.strokeErrorColor
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r1 = r4.strokeErrorColor
            r2 = 2
            int[] r3 = new int[r2]
            r3 = {x002a: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r1 = r1.getColorForState(r3, r0)
            android.content.res.ColorStateList r3 = r4.strokeErrorColor
            int[] r2 = new int[r2]
            r2 = {x0032: FILL_ARRAY_DATA , data: [16843518, 16842910} // fill-array
            int r2 = r3.getColorForState(r2, r0)
            if (r5 == 0) goto L22
            r4.boxStrokeColor = r2
            goto L29
        L22:
            if (r6 == 0) goto L27
            r4.boxStrokeColor = r1
            goto L29
        L27:
            r4.boxStrokeColor = r0
        L29:
            return
    }

    public void addOnEditTextAttachedListener(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r1.editTextAttachedListeners
            r0.add(r2)
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto Lc
            r2.onEditTextAttached(r1)
        Lc:
            return
    }

    public void addOnEndIconChangedListener(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.addOnEndIconChangedListener(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(@androidx.annotation.NonNull android.view.View r2, int r3, @androidx.annotation.NonNull android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L24
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4)
            int r0 = r3.gravity
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r0 = r0 | 16
            r3.gravity = r0
            android.widget.FrameLayout r0 = r1.inputFrame
            r0.addView(r2, r3)
            android.widget.FrameLayout r3 = r1.inputFrame
            r3.setLayoutParams(r4)
            r1.updateInputLayoutMargins()
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.setEditText(r2)
            goto L27
        L24:
            super.addView(r2, r3, r4)
        L27:
            return
    }

    @androidx.annotation.VisibleForTesting
    public final void animateToExpansionFraction(float r5) {
            r4 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r4.collapsingTextHelper
            float r0 = r0.getExpansionFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            android.animation.ValueAnimator r0 = r4.animator
            if (r0 != 0) goto L41
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r4.animator = r0
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r1, r2, r3)
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r4.animator
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.attr.motionDurationMedium4
            r3 = 167(0xa7, float:2.34E-43)
            int r1 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r1, r2, r3)
            long r1 = (long) r1
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r4.animator
            com.google.android.material.textfield.TextInputLayout$4 r1 = new com.google.android.material.textfield.TextInputLayout$4
            r1.<init>(r4)
            r0.addUpdateListener(r1)
        L41:
            android.animation.ValueAnimator r0 = r4.animator
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            com.google.android.material.internal.CollapsingTextHelper r3 = r4.collapsingTextHelper
            float r3 = r3.getExpansionFraction()
            r1[r2] = r3
            r2 = 1
            r1[r2] = r5
            r0.setFloatValues(r1)
            android.animation.ValueAnimator r5 = r4.animator
            r5.start()
            return
    }

    public void clearOnEditTextAttachedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r1.editTextAttachedListeners
            r0.clear()
            return
    }

    public void clearOnEndIconChangedListeners() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.clearOnEndIconChangedListeners()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @android.annotation.TargetApi(26)
    public void dispatchProvideAutofillStructure(@androidx.annotation.NonNull android.view.ViewStructure r5, int r6) {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            if (r0 != 0) goto L8
            super.dispatchProvideAutofillStructure(r5, r6)
            return
        L8:
            java.lang.CharSequence r1 = r4.originalHint
            r2 = 0
            if (r1 == 0) goto L30
            boolean r1 = r4.isProvidingHint
            r4.isProvidingHint = r2
            java.lang.CharSequence r0 = r0.getHint()
            android.widget.EditText r2 = r4.editText
            java.lang.CharSequence r3 = r4.originalHint
            r2.setHint(r3)
            super.dispatchProvideAutofillStructure(r5, r6)     // Catch: java.lang.Throwable -> L27
            android.widget.EditText r5 = r4.editText
            r5.setHint(r0)
            r4.isProvidingHint = r1
            goto L69
        L27:
            r5 = move-exception
            android.widget.EditText r6 = r4.editText
            r6.setHint(r0)
            r4.isProvidingHint = r1
            throw r5
        L30:
            android.view.autofill.AutofillId r0 = r4.getAutofillId()
            r5.setAutofillId(r0)
            r4.onProvideAutofillStructure(r5, r6)
            r4.onProvideAutofillVirtualStructure(r5, r6)
            android.widget.FrameLayout r0 = r4.inputFrame
            int r0 = r0.getChildCount()
            r5.setChildCount(r0)
        L46:
            android.widget.FrameLayout r0 = r4.inputFrame
            int r0 = r0.getChildCount()
            if (r2 >= r0) goto L69
            android.widget.FrameLayout r0 = r4.inputFrame
            android.view.View r0 = r0.getChildAt(r2)
            android.view.ViewStructure r1 = r5.newChild(r2)
            r0.dispatchProvideAutofillStructure(r1, r6)
            android.widget.EditText r3 = r4.editText
            if (r0 != r3) goto L66
            java.lang.CharSequence r0 = r4.getHint()
            r1.setHint(r0)
        L66:
            int r2 = r2 + 1
            goto L46
        L69:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@androidx.annotation.NonNull android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r0 = 1
            r1.restoringSavedState = r0
            super.dispatchRestoreInstanceState(r2)
            r2 = 0
            r1.restoringSavedState = r2
            return
    }

    @Override // android.view.View
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            r0.drawHint(r1)
            r0.drawBoxUnderline(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            boolean r0 = r4.inDrawableStateChanged
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.inDrawableStateChanged = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            com.google.android.material.internal.CollapsingTextHelper r2 = r4.collapsingTextHelper
            r3 = 0
            if (r2 == 0) goto L1a
            boolean r1 = r2.setState(r1)
            r1 = r1 | r3
            goto L1b
        L1a:
            r1 = 0
        L1b:
            android.widget.EditText r2 = r4.editText
            if (r2 == 0) goto L30
            boolean r2 = androidx.core.view.ViewCompat.isLaidOut(r4)
            if (r2 == 0) goto L2c
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r4.updateLabelState(r0, r3)
        L30:
            r4.updateEditTextBackground()
            r4.updateTextInputBoxState()
            if (r1 == 0) goto L3b
            r4.invalidate()
        L3b:
            r4.inDrawableStateChanged = r3
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto L13
            int r0 = r0.getBaseline()
            int r1 = r2.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r2.calculateLabelMarginTop()
            int r1 = r1 + r0
            return r1
        L13:
            int r0 = super.getBaseline()
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.shape.MaterialShapeDrawable getBoxBackground() {
            r2 = this;
            int r0 = r2.boxBackgroundMode
            r1 = 1
            if (r0 == r1) goto Lf
            r1 = 2
            if (r0 != r1) goto L9
            goto Lf
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Lf:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.boxBackground
            return r0
    }

    public int getBoxBackgroundColor() {
            r1 = this;
            int r0 = r1.boxBackgroundColor
            return r0
    }

    public int getBoxBackgroundMode() {
            r1 = this;
            int r0 = r1.boxBackgroundMode
            return r0
    }

    public int getBoxCollapsedPaddingTop() {
            r1 = this;
            int r0 = r1.boxCollapsedPaddingTopPx
            return r0
    }

    public float getBoxCornerRadiusBottomEnd() {
            r2 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto L13
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomLeftCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
            goto L1f
        L13:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomRightCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
        L1f:
            return r0
    }

    public float getBoxCornerRadiusBottomStart() {
            r2 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto L13
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomRightCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
            goto L1f
        L13:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getBottomLeftCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
        L1f:
            return r0
    }

    public float getBoxCornerRadiusTopEnd() {
            r2 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto L13
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
            goto L1f
        L13:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopRightCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
        L1f:
            return r0
    }

    public float getBoxCornerRadiusTopStart() {
            r2 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r2)
            if (r0 == 0) goto L13
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopRightCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
            goto L1f
        L13:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r0 = r0.getTopLeftCornerSize()
            android.graphics.RectF r1 = r2.tmpRectF
            float r0 = r0.getCornerSize(r1)
        L1f:
            return r0
    }

    public int getBoxStrokeColor() {
            r1 = this;
            int r0 = r1.focusedStrokeColor
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeErrorColor
            return r0
    }

    public int getBoxStrokeWidth() {
            r1 = this;
            int r0 = r1.boxStrokeWidthDefaultPx
            return r0
    }

    public int getBoxStrokeWidthFocused() {
            r1 = this;
            int r0 = r1.boxStrokeWidthFocusedPx
            return r0
    }

    public int getCounterMaxLength() {
            r1 = this;
            int r0 = r1.counterMaxLength
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getCounterOverflowDescription() {
            r1 = this;
            boolean r0 = r1.counterEnabled
            if (r0 == 0) goto L11
            boolean r0 = r1.counterOverflowed
            if (r0 == 0) goto L11
            android.widget.TextView r0 = r1.counterView
            if (r0 == 0) goto L11
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getCounterOverflowTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterOverflowTextColor
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getCounterTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterTextColor
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getDefaultHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.defaultHintTextColor
            return r0
    }

    @androidx.annotation.Nullable
    public android.widget.EditText getEditText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getEndIconContentDescription() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            java.lang.CharSequence r0 = r0.getEndIconContentDescription()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getEndIconDrawable() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            android.graphics.drawable.Drawable r0 = r0.getEndIconDrawable()
            return r0
    }

    public int getEndIconMinSize() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            int r0 = r0.getEndIconMinSize()
            return r0
    }

    public int getEndIconMode() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            int r0 = r0.getEndIconMode()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.ImageView.ScaleType getEndIconScaleType() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            android.widget.ImageView$ScaleType r0 = r0.getEndIconScaleType()
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            com.google.android.material.internal.CheckableImageButton r0 = r0.getEndIconView()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getError() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto Lf
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            java.lang.CharSequence r0 = r0.getErrorText()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int getErrorAccessibilityLiveRegion() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getErrorAccessibilityLiveRegion()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getErrorContentDescription() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            java.lang.CharSequence r0 = r0.getErrorContentDescription()
            return r0
    }

    @androidx.annotation.ColorInt
    public int getErrorCurrentTextColors() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getErrorViewCurrentTextColor()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getErrorIconDrawable() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            android.graphics.drawable.Drawable r0 = r0.getErrorIconDrawable()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getHelperText() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isHelperTextEnabled()
            if (r0 == 0) goto Lf
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            java.lang.CharSequence r0 = r0.getHelperText()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @androidx.annotation.ColorInt
    public int getHelperTextCurrentTextColor() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            int r0 = r0.getHelperTextViewCurrentTextColor()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getHint() {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.hint
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public final float getHintCollapsedTextHeight() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            float r0 = r0.getCollapsedTextHeight()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            int r0 = r0.getCurrentCollapsedTextColor()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.focusedTextColor
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.textfield.TextInputLayout.LengthCounter getLengthCounter() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout$LengthCounter r0 = r1.lengthCounter
            return r0
    }

    public int getMaxEms() {
            r1 = this;
            int r0 = r1.maxEms
            return r0
    }

    @androidx.annotation.Px
    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.maxWidth
            return r0
    }

    public int getMinEms() {
            r1 = this;
            int r0 = r1.minEms
            return r0
    }

    @androidx.annotation.Px
    public int getMinWidth() {
            r1 = this;
            int r0 = r1.minWidth
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            java.lang.CharSequence r0 = r0.getPasswordVisibilityToggleContentDescription()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            android.graphics.drawable.Drawable r0 = r0.getPasswordVisibilityToggleDrawable()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getPlaceholderText() {
            r1 = this;
            boolean r0 = r1.placeholderEnabled
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.placeholderText
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @androidx.annotation.StyleRes
    public int getPlaceholderTextAppearance() {
            r1 = this;
            int r0 = r1.placeholderTextAppearance
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getPlaceholderTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.placeholderTextColor
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getPrefixText() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            java.lang.CharSequence r0 = r0.getPrefixText()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getPrefixTextColor() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            android.content.res.ColorStateList r0 = r0.getPrefixTextColor()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.TextView getPrefixTextView() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            android.widget.TextView r0 = r0.getPrefixTextView()
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getStartIconContentDescription() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            java.lang.CharSequence r0 = r0.getStartIconContentDescription()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getStartIconDrawable() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            android.graphics.drawable.Drawable r0 = r0.getStartIconDrawable()
            return r0
    }

    public int getStartIconMinSize() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            int r0 = r0.getStartIconMinSize()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.ImageView.ScaleType getStartIconScaleType() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            android.widget.ImageView$ScaleType r0 = r0.getStartIconScaleType()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getSuffixText() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            java.lang.CharSequence r0 = r0.getSuffixText()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getSuffixTextColor() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            android.content.res.ColorStateList r0 = r0.getSuffixTextColor()
            return r0
    }

    @androidx.annotation.NonNull
    public android.widget.TextView getSuffixTextView() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            android.widget.TextView r0 = r0.getSuffixTextView()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            return r0
    }

    public boolean isCounterEnabled() {
            r1 = this;
            boolean r0 = r1.counterEnabled
            return r0
    }

    public boolean isEndIconCheckable() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            boolean r0 = r0.isEndIconCheckable()
            return r0
    }

    public boolean isEndIconVisible() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            boolean r0 = r0.isEndIconVisible()
            return r0
    }

    public boolean isErrorEnabled() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    public boolean isExpandedHintEnabled() {
            r1 = this;
            boolean r0 = r1.expandedHintEnabled
            return r0
    }

    public boolean isHelperTextEnabled() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isHelperTextEnabled()
            return r0
    }

    public boolean isHintAnimationEnabled() {
            r1 = this;
            boolean r0 = r1.hintAnimationEnabled
            return r0
    }

    public boolean isHintEnabled() {
            r1 = this;
            boolean r0 = r1.hintEnabled
            return r0
    }

    public final boolean isHintExpanded() {
            r1 = this;
            boolean r0 = r1.hintExpanded
            return r0
    }

    @java.lang.Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            boolean r0 = r0.isPasswordVisibilityToggleEnabled()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
            r1 = this;
            boolean r0 = r1.isProvidingHint
            return r0
    }

    public boolean isStartIconCheckable() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            boolean r0 = r0.isStartIconCheckable()
            return r0
    }

    public boolean isStartIconVisible() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            boolean r0 = r0.isStartIconVisible()
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@androidx.annotation.NonNull android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.maybeUpdateFontWeightAdjustment(r2)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.widget.EditText r1 = r0.editText
            if (r1 == 0) goto L56
            android.graphics.Rect r2 = r0.tmpRect
            com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r0, r1, r2)
            r0.updateBoxUnderlineBounds(r2)
            boolean r1 = r0.hintEnabled
            if (r1 == 0) goto L56
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.widget.EditText r3 = r0.editText
            float r3 = r3.getTextSize()
            r1.setExpandedTextSize(r3)
            android.widget.EditText r1 = r0.editText
            int r1 = r1.getGravity()
            com.google.android.material.internal.CollapsingTextHelper r3 = r0.collapsingTextHelper
            r4 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            r4 = r4 | 48
            r3.setCollapsedTextGravity(r4)
            com.google.android.material.internal.CollapsingTextHelper r3 = r0.collapsingTextHelper
            r3.setExpandedTextGravity(r1)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.graphics.Rect r3 = r0.calculateCollapsedTextBounds(r2)
            r1.setCollapsedBounds(r3)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            android.graphics.Rect r2 = r0.calculateExpandedTextBounds(r2)
            r1.setExpandedBounds(r2)
            com.google.android.material.internal.CollapsingTextHelper r1 = r0.collapsingTextHelper
            r1.recalculate()
            boolean r1 = r0.cutoutEnabled()
            if (r1 == 0) goto L56
            boolean r1 = r0.hintExpanded
            if (r1 != 0) goto L56
            r0.openCutout()
        L56:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            boolean r1 = r0.updateEditTextHeightBasedOnIcon()
            boolean r2 = r0.updateDummyDrawables()
            if (r1 != 0) goto Lf
            if (r2 == 0) goto L19
        Lf:
            android.widget.EditText r1 = r0.editText
            com.google.android.material.textfield.TextInputLayout$3 r2 = new com.google.android.material.textfield.TextInputLayout$3
            r2.<init>(r0)
            r1.post(r2)
        L19:
            r0.updatePlaceholderMeasurementsBasedOnEditText()
            com.google.android.material.textfield.EndCompoundLayout r1 = r0.endLayout
            r1.updateSuffixTextViewPadding()
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@androidx.annotation.Nullable android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.textfield.TextInputLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.textfield.TextInputLayout$SavedState r2 = (com.google.android.material.textfield.TextInputLayout.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r2.error
            r1.setError(r0)
            boolean r2 = r2.isEndIconChecked
            if (r2 == 0) goto L22
            com.google.android.material.textfield.TextInputLayout$2 r2 = new com.google.android.material.textfield.TextInputLayout$2
            r2.<init>(r1)
            r1.post(r2)
        L22:
            r1.requestLayout()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int r10) {
            r9 = this;
            super.onRtlPropertiesChanged(r10)
            r0 = 1
            if (r10 != r0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r10 = r9.areCornerRadiiRtl
            if (r0 == r10) goto L81
            com.google.android.material.shape.ShapeAppearanceModel r10 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r10 = r10.getTopLeftCornerSize()
            android.graphics.RectF r1 = r9.tmpRectF
            float r10 = r10.getCornerSize(r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r1 = r1.getTopRightCornerSize()
            android.graphics.RectF r2 = r9.tmpRectF
            float r1 = r1.getCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r2 = r2.getBottomLeftCornerSize()
            android.graphics.RectF r3 = r9.tmpRectF
            float r2 = r2.getCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r3 = r3.getBottomRightCornerSize()
            android.graphics.RectF r4 = r9.tmpRectF
            float r3 = r3.getCornerSize(r4)
            com.google.android.material.shape.ShapeAppearanceModel r4 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r4 = r4.getTopLeftCorner()
            com.google.android.material.shape.ShapeAppearanceModel r5 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r5 = r5.getTopRightCorner()
            com.google.android.material.shape.ShapeAppearanceModel r6 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r6 = r6.getBottomLeftCorner()
            com.google.android.material.shape.ShapeAppearanceModel r7 = r9.shapeAppearanceModel
            com.google.android.material.shape.CornerTreatment r7 = r7.getBottomRightCorner()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r8 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r5 = r8.setTopLeftCorner(r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r5.setTopRightCorner(r4)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setBottomLeftCorner(r7)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setBottomRightCorner(r6)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r4.setTopLeftCornerSize(r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = r1.setTopRightCornerSize(r10)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = r10.setBottomLeftCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = r10.setBottomRightCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.build()
            r9.areCornerRadiiRtl = r0
            r9.setShapeAppearanceModel(r10)
        L81:
            return
    }

    @Override // android.view.View
    @androidx.annotation.Nullable
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.textfield.TextInputLayout$SavedState r1 = new com.google.android.material.textfield.TextInputLayout$SavedState
            r1.<init>(r0)
            boolean r0 = r2.shouldShowError()
            if (r0 == 0) goto L15
            java.lang.CharSequence r0 = r2.getError()
            r1.error = r0
        L15:
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            boolean r0 = r0.isEndIconChecked()
            r1.isEndIconChecked = r0
            return r1
    }

    @java.lang.Deprecated
    public void passwordVisibilityToggleRequested(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.togglePasswordVisibilityToggle(r2)
            return
    }

    public void refreshEndIconDrawableState() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.refreshEndIconDrawableState()
            return
    }

    public void refreshErrorIconDrawableState() {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.refreshErrorIconDrawableState()
            return
    }

    public void refreshStartIconDrawableState() {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.refreshStartIconDrawableState()
            return
    }

    public void removeOnEditTextAttachedListener(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener> r0 = r1.editTextAttachedListeners
            r0.remove(r2)
            return
    }

    public void removeOnEndIconChangedListener(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.removeOnEndIconChangedListener(r2)
            return
    }

    public void setBoxBackgroundColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.boxBackgroundColor
            if (r0 == r2) goto Lf
            r1.boxBackgroundColor = r2
            r1.defaultFilledBackgroundColor = r2
            r1.focusedFilledBackgroundColor = r2
            r1.hoveredFilledBackgroundColor = r2
            r1.applyBoxAttributes()
        Lf:
            return
    }

    public void setBoxBackgroundColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setBoxBackgroundColor(r2)
            return
    }

    public void setBoxBackgroundColorStateList(@androidx.annotation.NonNull android.content.res.ColorStateList r4) {
            r3 = this;
            int r0 = r4.getDefaultColor()
            r3.defaultFilledBackgroundColor = r0
            r3.boxBackgroundColor = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r1] = r2
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.disabledFilledBackgroundColor = r0
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {x0034: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            int r2 = r4.getColorForState(r2, r1)
            r3.focusedFilledBackgroundColor = r2
            int[] r0 = new int[r0]
            r0 = {x003c: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r0, r1)
            r3.hoveredFilledBackgroundColor = r4
            r3.applyBoxAttributes()
            return
    }

    public void setBoxBackgroundMode(int r2) {
            r1 = this;
            int r0 = r1.boxBackgroundMode
            if (r2 != r0) goto L5
            return
        L5:
            r1.boxBackgroundMode = r2
            android.widget.EditText r2 = r1.editText
            if (r2 == 0) goto Le
            r1.onApplyBoxBackgroundMode()
        Le:
            return
    }

    public void setBoxCollapsedPaddingTop(int r1) {
            r0 = this;
            r0.boxCollapsedPaddingTopPx = r1
            return
    }

    public void setBoxCornerFamily(int r3) {
            r2 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r1 = r1.getTopLeftCornerSize()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopLeftCorner(r3, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r1 = r1.getTopRightCornerSize()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopRightCorner(r3, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r1 = r1.getBottomLeftCornerSize()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setBottomLeftCorner(r3, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r2.shapeAppearanceModel
            com.google.android.material.shape.CornerSize r1 = r1.getBottomRightCornerSize()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r0.setBottomRightCorner(r3, r1)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r3.build()
            r2.shapeAppearanceModel = r3
            r2.applyBoxAttributes()
            return
    }

    public void setBoxCornerRadii(float r3, float r4, float r5, float r6) {
            r2 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r2)
            r2.areCornerRadiiRtl = r0
            if (r0 == 0) goto La
            r1 = r4
            goto Lb
        La:
            r1 = r3
        Lb:
            if (r0 == 0) goto Le
            goto Lf
        Le:
            r3 = r4
        Lf:
            if (r0 == 0) goto L13
            r4 = r6
            goto L14
        L13:
            r4 = r5
        L14:
            if (r0 == 0) goto L17
            goto L18
        L17:
            r5 = r6
        L18:
            com.google.android.material.shape.MaterialShapeDrawable r6 = r2.boxBackground
            if (r6 == 0) goto L42
            float r6 = r6.getTopLeftCornerResolvedSize()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L42
            com.google.android.material.shape.MaterialShapeDrawable r6 = r2.boxBackground
            float r6 = r6.getTopRightCornerResolvedSize()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L42
            com.google.android.material.shape.MaterialShapeDrawable r6 = r2.boxBackground
            float r6 = r6.getBottomLeftCornerResolvedSize()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L42
            com.google.android.material.shape.MaterialShapeDrawable r6 = r2.boxBackground
            float r6 = r6.getBottomRightCornerResolvedSize()
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L61
        L42:
            com.google.android.material.shape.ShapeAppearanceModel r6 = r2.shapeAppearanceModel
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = r6.toBuilder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = r6.setTopLeftCornerSize(r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r6.setTopRightCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.setBottomLeftCornerSize(r4)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.setBottomRightCornerSize(r5)
            com.google.android.material.shape.ShapeAppearanceModel r3 = r3.build()
            r2.shapeAppearanceModel = r3
            r2.applyBoxAttributes()
        L61:
            return
    }

    public void setBoxCornerRadiiResources(@androidx.annotation.DimenRes int r2, @androidx.annotation.DimenRes int r3, @androidx.annotation.DimenRes int r4, @androidx.annotation.DimenRes int r5) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r3 = r0.getDimension(r3)
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r5 = r0.getDimension(r5)
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            float r4 = r0.getDimension(r4)
            r1.setBoxCornerRadii(r2, r3, r5, r4)
            return
    }

    public void setBoxStrokeColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            int r0 = r1.focusedStrokeColor
            if (r0 == r2) goto L9
            r1.focusedStrokeColor = r2
            r1.updateTextInputBoxState()
        L9:
            return
    }

    public void setBoxStrokeColorStateList(@androidx.annotation.NonNull android.content.res.ColorStateList r4) {
            r3 = this;
            boolean r0 = r4.isStateful()
            if (r0 == 0) goto L34
            int r0 = r4.getDefaultColor()
            r3.defaultStrokeColor = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r1] = r2
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.disabledColor = r0
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {x0046: FILL_ARRAY_DATA , data: [16843623, 16842910} // fill-array
            int r2 = r4.getColorForState(r2, r1)
            r3.hoveredStrokeColor = r2
            int[] r0 = new int[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [16842908, 16842910} // fill-array
            int r4 = r4.getColorForState(r0, r1)
            r3.focusedStrokeColor = r4
            goto L42
        L34:
            int r0 = r3.focusedStrokeColor
            int r1 = r4.getDefaultColor()
            if (r0 == r1) goto L42
            int r4 = r4.getDefaultColor()
            r3.focusedStrokeColor = r4
        L42:
            r3.updateTextInputBoxState()
            return
    }

    public void setBoxStrokeErrorColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.strokeErrorColor
            if (r0 == r2) goto L9
            r1.strokeErrorColor = r2
            r1.updateTextInputBoxState()
        L9:
            return
    }

    public void setBoxStrokeWidth(int r1) {
            r0 = this;
            r0.boxStrokeWidthDefaultPx = r1
            r0.updateTextInputBoxState()
            return
    }

    public void setBoxStrokeWidthFocused(int r1) {
            r0 = this;
            r0.boxStrokeWidthFocusedPx = r1
            r0.updateTextInputBoxState()
            return
    }

    public void setBoxStrokeWidthFocusedResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidthFocused(r2)
            return
    }

    public void setBoxStrokeWidthResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidth(r2)
            return
    }

    public void setCounterEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.counterEnabled
            if (r0 == r4) goto L55
            r0 = 2
            if (r4 == 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r3.getContext()
            r1.<init>(r2)
            r3.counterView = r1
            int r2 = com.google.android.material.R.id.textinput_counter
            r1.setId(r2)
            android.graphics.Typeface r1 = r3.typeface
            if (r1 == 0) goto L20
            android.widget.TextView r2 = r3.counterView
            r2.setTypeface(r1)
        L20:
            android.widget.TextView r1 = r3.counterView
            r2 = 1
            r1.setMaxLines(r2)
            com.google.android.material.textfield.IndicatorViewController r1 = r3.indicatorViewController
            android.widget.TextView r2 = r3.counterView
            r1.addIndicator(r2, r0)
            android.widget.TextView r0 = r3.counterView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_textinput_counter_margin_start
            int r1 = r1.getDimensionPixelOffset(r2)
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r0, r1)
            r3.updateCounterTextAppearanceAndColor()
            r3.updateCounter()
            goto L53
        L49:
            com.google.android.material.textfield.IndicatorViewController r1 = r3.indicatorViewController
            android.widget.TextView r2 = r3.counterView
            r1.removeIndicator(r2, r0)
            r0 = 0
            r3.counterView = r0
        L53:
            r3.counterEnabled = r4
        L55:
            return
    }

    public void setCounterMaxLength(int r2) {
            r1 = this;
            int r0 = r1.counterMaxLength
            if (r0 == r2) goto L13
            if (r2 <= 0) goto L9
            r1.counterMaxLength = r2
            goto Lc
        L9:
            r2 = -1
            r1.counterMaxLength = r2
        Lc:
            boolean r2 = r1.counterEnabled
            if (r2 == 0) goto L13
            r1.updateCounter()
        L13:
            return
    }

    public void setCounterOverflowTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.counterOverflowTextAppearance
            if (r0 == r2) goto L9
            r1.counterOverflowTextAppearance = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setCounterOverflowTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterOverflowTextColor
            if (r0 == r2) goto L9
            r1.counterOverflowTextColor = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setCounterTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.counterTextAppearance
            if (r0 == r2) goto L9
            r1.counterTextAppearance = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setCounterTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.counterTextColor
            if (r0 == r2) goto L9
            r1.counterTextColor = r2
            r1.updateCounterTextAppearanceAndColor()
        L9:
            return
    }

    public void setDefaultHintTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            r0 = this;
            r0.defaultHintTextColor = r1
            r0.focusedTextColor = r1
            android.widget.EditText r1 = r0.editText
            if (r1 == 0) goto Lc
            r1 = 0
            r0.updateLabelState(r1, r1)
        Lc:
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            recursiveSetEnabled(r0, r1)
            super.setEnabled(r1)
            return
    }

    public void setEndIconActivated(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconActivated(r2)
            return
    }

    public void setEndIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconCheckable(r2)
            return
    }

    public void setEndIconContentDescription(@androidx.annotation.StringRes int r3) {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            if (r3 == 0) goto Ld
            android.content.res.Resources r1 = r0.getResources()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.setEndIconContentDescription(r3)
            return
    }

    public void setEndIconContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconContentDescription(r2)
            return
    }

    public void setEndIconDrawable(@androidx.annotation.DrawableRes int r3) {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.setEndIconDrawable(r3)
            return
    }

    public void setEndIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconDrawable(r2)
            return
    }

    public void setEndIconMinSize(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconMinSize(r2)
            return
    }

    public void setEndIconMode(int r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconMode(r2)
            return
    }

    public void setEndIconOnClickListener(@androidx.annotation.Nullable android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconOnClickListener(r2)
            return
    }

    public void setEndIconOnLongClickListener(@androidx.annotation.Nullable android.view.View.OnLongClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconOnLongClickListener(r2)
            return
    }

    public void setEndIconScaleType(@androidx.annotation.NonNull android.widget.ImageView.ScaleType r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconScaleType(r2)
            return
    }

    public void setEndIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconTintList(r2)
            return
    }

    public void setEndIconTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconTintMode(r2)
            return
    }

    public void setEndIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setEndIconVisible(r2)
            return
    }

    public void setError(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.isErrorEnabled()
            if (r0 != 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = 1
            r1.setErrorEnabled(r0)
        L13:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.showError(r2)
            goto L24
        L1f:
            com.google.android.material.textfield.IndicatorViewController r2 = r1.indicatorViewController
            r2.hideError()
        L24:
            return
    }

    public void setErrorAccessibilityLiveRegion(int r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorAccessibilityLiveRegion(r2)
            return
    }

    public void setErrorContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorContentDescription(r2)
            return
    }

    public void setErrorEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorEnabled(r2)
            return
    }

    public void setErrorIconDrawable(@androidx.annotation.DrawableRes int r3) {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.setErrorIconDrawable(r3)
            r0.refreshErrorIconDrawableState()
            return
    }

    public void setErrorIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setErrorIconDrawable(r2)
            return
    }

    public void setErrorIconOnClickListener(@androidx.annotation.Nullable android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setErrorIconOnClickListener(r2)
            return
    }

    public void setErrorIconOnLongClickListener(@androidx.annotation.Nullable android.view.View.OnLongClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setErrorIconOnLongClickListener(r2)
            return
    }

    public void setErrorIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setErrorIconTintList(r2)
            return
    }

    public void setErrorIconTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setErrorIconTintMode(r2)
            return
    }

    public void setErrorTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorTextAppearance(r2)
            return
    }

    public void setErrorTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setErrorViewTextColor(r2)
            return
    }

    public void setExpandedHintEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.expandedHintEnabled
            if (r0 == r2) goto La
            r1.expandedHintEnabled = r2
            r2 = 0
            r1.updateLabelState(r2, r2)
        La:
            return
    }

    public void setHelperText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L11
            boolean r2 = r1.isHelperTextEnabled()
            if (r2 == 0) goto L20
            r2 = 0
            r1.setHelperTextEnabled(r2)
            goto L20
        L11:
            boolean r0 = r1.isHelperTextEnabled()
            if (r0 != 0) goto L1b
            r0 = 1
            r1.setHelperTextEnabled(r0)
        L1b:
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.showHelper(r2)
        L20:
            return
    }

    public void setHelperTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setHelperTextViewTextColor(r2)
            return
    }

    public void setHelperTextEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setHelperTextEnabled(r2)
            return
    }

    public void setHelperTextTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setHelperTextAppearance(r2)
            return
    }

    public void setHint(@androidx.annotation.StringRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setHint(r2)
            return
    }

    public void setHint(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.hintEnabled
            if (r0 == 0) goto Lc
            r1.setHintInternal(r2)
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        Lc:
            return
    }

    public void setHintAnimationEnabled(boolean r1) {
            r0 = this;
            r0.hintAnimationEnabled = r1
            return
    }

    public void setHintEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.hintEnabled
            if (r3 == r0) goto L51
            r2.hintEnabled = r3
            r0 = 0
            if (r3 != 0) goto L2b
            r3 = 0
            r2.isProvidingHint = r3
            java.lang.CharSequence r3 = r2.hint
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L27
            android.widget.EditText r3 = r2.editText
            java.lang.CharSequence r3 = r3.getHint()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            android.widget.EditText r3 = r2.editText
            java.lang.CharSequence r1 = r2.hint
            r3.setHint(r1)
        L27:
            r2.setHintInternal(r0)
            goto L4a
        L2b:
            android.widget.EditText r3 = r2.editText
            java.lang.CharSequence r3 = r3.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L47
            java.lang.CharSequence r1 = r2.hint
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L42
            r2.setHint(r3)
        L42:
            android.widget.EditText r3 = r2.editText
            r3.setHint(r0)
        L47:
            r3 = 1
            r2.isProvidingHint = r3
        L4a:
            android.widget.EditText r3 = r2.editText
            if (r3 == 0) goto L51
            r2.updateInputLayoutMargins()
        L51:
            return
    }

    public void setHintTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextAppearance(r2)
            com.google.android.material.internal.CollapsingTextHelper r2 = r1.collapsingTextHelper
            android.content.res.ColorStateList r2 = r2.getCollapsedTextColor()
            r1.focusedTextColor = r2
            android.widget.EditText r2 = r1.editText
            if (r2 == 0) goto L18
            r2 = 0
            r1.updateLabelState(r2, r2)
            r1.updateInputLayoutMargins()
        L18:
            return
    }

    public void setHintTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.focusedTextColor
            if (r0 == r2) goto L17
            android.content.res.ColorStateList r0 = r1.defaultHintTextColor
            if (r0 != 0) goto Ld
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setCollapsedTextColor(r2)
        Ld:
            r1.focusedTextColor = r2
            android.widget.EditText r2 = r1.editText
            if (r2 == 0) goto L17
            r2 = 0
            r1.updateLabelState(r2, r2)
        L17:
            return
    }

    public void setLengthCounter(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout.LengthCounter r1) {
            r0 = this;
            r0.lengthCounter = r1
            return
    }

    public void setMaxEms(int r3) {
            r2 = this;
            r2.maxEms = r3
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMaxEms(r3)
        Lc:
            return
    }

    public void setMaxWidth(@androidx.annotation.Px int r3) {
            r2 = this;
            r2.maxWidth = r3
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMaxWidth(r3)
        Lc:
            return
    }

    public void setMaxWidthResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMaxWidth(r2)
            return
    }

    public void setMinEms(int r3) {
            r2 = this;
            r2.minEms = r3
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMinEms(r3)
        Lc:
            return
    }

    public void setMinWidth(@androidx.annotation.Px int r3) {
            r2 = this;
            r2.minWidth = r3
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMinWidth(r3)
        Lc:
            return
    }

    public void setMinWidthResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMinWidth(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(@androidx.annotation.StringRes int r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleEnabled(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleTintList(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setPasswordVisibilityToggleTintMode(r2)
            return
    }

    public void setPlaceholderText(@androidx.annotation.Nullable java.lang.CharSequence r4) {
            r3 = this;
            android.widget.TextView r0 = r3.placeholderTextView
            if (r0 != 0) goto L35
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.placeholderTextView = r0
            int r1 = com.google.android.material.R.id.textinput_placeholder
            r0.setId(r1)
            android.widget.TextView r0 = r3.placeholderTextView
            r1 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r1)
            androidx.transition.Fade r0 = r3.createPlaceholderFadeTransition()
            r3.placeholderFadeIn = r0
            r1 = 67
            r0.setStartDelay(r1)
            androidx.transition.Fade r0 = r3.createPlaceholderFadeTransition()
            r3.placeholderFadeOut = r0
            int r0 = r3.placeholderTextAppearance
            r3.setPlaceholderTextAppearance(r0)
            android.content.res.ColorStateList r0 = r3.placeholderTextColor
            r3.setPlaceholderTextColor(r0)
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L40
            r4 = 0
            r3.setPlaceholderTextEnabled(r4)
            goto L4a
        L40:
            boolean r0 = r3.placeholderEnabled
            if (r0 != 0) goto L48
            r0 = 1
            r3.setPlaceholderTextEnabled(r0)
        L48:
            r3.placeholderText = r4
        L4a:
            r3.updatePlaceholderText()
            return
    }

    public void setPlaceholderTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            r1.placeholderTextAppearance = r2
            android.widget.TextView r0 = r1.placeholderTextView
            if (r0 == 0) goto L9
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L9:
            return
    }

    public void setPlaceholderTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.placeholderTextColor
            if (r0 == r2) goto Lf
            r1.placeholderTextColor = r2
            android.widget.TextView r0 = r1.placeholderTextView
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r0.setTextColor(r2)
        Lf:
            return
    }

    public void setPrefixText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setPrefixText(r2)
            return
    }

    public void setPrefixTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setPrefixTextAppearance(r2)
            return
    }

    public void setPrefixTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setPrefixTextColor(r2)
            return
    }

    public void setShapeAppearanceModel(@androidx.annotation.NonNull com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.boxBackground
            if (r0 == 0) goto Lf
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            if (r0 == r2) goto Lf
            r1.shapeAppearanceModel = r2
            r1.applyBoxAttributes()
        Lf:
            return
    }

    public void setStartIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconCheckable(r2)
            return
    }

    public void setStartIconContentDescription(@androidx.annotation.StringRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconContentDescription(r2)
            return
    }

    public void setStartIconContentDescription(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconContentDescription(r2)
            return
    }

    public void setStartIconDrawable(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconDrawable(r2)
            return
    }

    public void setStartIconDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconDrawable(r2)
            return
    }

    public void setStartIconMinSize(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconMinSize(r2)
            return
    }

    public void setStartIconOnClickListener(@androidx.annotation.Nullable android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconOnClickListener(r2)
            return
    }

    public void setStartIconOnLongClickListener(@androidx.annotation.Nullable android.view.View.OnLongClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconOnLongClickListener(r2)
            return
    }

    public void setStartIconScaleType(@androidx.annotation.NonNull android.widget.ImageView.ScaleType r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconScaleType(r2)
            return
    }

    public void setStartIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconTintList(r2)
            return
    }

    public void setStartIconTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconTintMode(r2)
            return
    }

    public void setStartIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.StartCompoundLayout r0 = r1.startLayout
            r0.setStartIconVisible(r2)
            return
    }

    public void setSuffixText(@androidx.annotation.Nullable java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setSuffixText(r2)
            return
    }

    public void setSuffixTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setSuffixTextAppearance(r2)
            return
    }

    public void setSuffixTextColor(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r1.endLayout
            r0.setSuffixTextColor(r2)
            return
    }

    public final void setTextAppearanceCompatWithErrorFallback(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.StyleRes int r4) {
            r2 = this;
            r0 = 1
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.google.android.material.R.style.TextAppearance_AppCompat_Caption
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R.color.design_error
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
    }

    public void setTextInputAccessibilityDelegate(@androidx.annotation.Nullable com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            if (r0 == 0) goto L7
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
        L7:
            return
    }

    public void setTypeface(@androidx.annotation.Nullable android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            if (r2 == r0) goto L17
            r1.typeface = r2
            com.google.android.material.internal.CollapsingTextHelper r0 = r1.collapsingTextHelper
            r0.setTypefaces(r2)
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            r0.setTypefaces(r2)
            android.widget.TextView r0 = r1.counterView
            if (r0 == 0) goto L17
            r0.setTypeface(r2)
        L17:
            return
    }

    public final boolean shouldShowError() {
            r1 = this;
            com.google.android.material.textfield.IndicatorViewController r0 = r1.indicatorViewController
            boolean r0 = r0.errorShouldBeShown()
            return r0
    }

    public final void updateCounter(@androidx.annotation.Nullable android.text.Editable r9) {
            r8 = this;
            com.google.android.material.textfield.TextInputLayout$LengthCounter r0 = r8.lengthCounter
            int r9 = r0.countLength(r9)
            boolean r0 = r8.counterOverflowed
            int r1 = r8.counterMaxLength
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L20
            android.widget.TextView r1 = r8.counterView
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r1.setText(r9)
            android.widget.TextView r9 = r8.counterView
            r1 = 0
            r9.setContentDescription(r1)
            r8.counterOverflowed = r2
            goto L64
        L20:
            r3 = 1
            if (r9 <= r1) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            r8.counterOverflowed = r1
            android.content.Context r1 = r8.getContext()
            android.widget.TextView r4 = r8.counterView
            int r5 = r8.counterMaxLength
            boolean r6 = r8.counterOverflowed
            updateCounterContentDescription(r1, r4, r9, r5, r6)
            boolean r1 = r8.counterOverflowed
            if (r0 == r1) goto L3c
            r8.updateCounterTextAppearanceAndColor()
        L3c:
            androidx.core.text.BidiFormatter r1 = androidx.core.text.BidiFormatter.getInstance()
            android.widget.TextView r4 = r8.counterView
            android.content.Context r5 = r8.getContext()
            int r6 = com.google.android.material.R.string.character_counter_pattern
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r2] = r9
            int r9 = r8.counterMaxLength
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r3] = r9
            java.lang.String r9 = r5.getString(r6, r7)
            java.lang.String r9 = r1.unicodeWrap(r9)
            r4.setText(r9)
        L64:
            android.widget.EditText r9 = r8.editText
            if (r9 == 0) goto L75
            boolean r9 = r8.counterOverflowed
            if (r0 == r9) goto L75
            r8.updateLabelState(r2, r2)
            r8.updateTextInputBoxState()
            r8.updateEditTextBackground()
        L75:
            return
    }

    public final boolean updateDummyDrawables() {
            r10 = this;
            android.widget.EditText r0 = r10.editText
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r10.shouldUpdateStartDummyDrawable()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L49
            com.google.android.material.textfield.StartCompoundLayout r0 = r10.startLayout
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.startDummyDrawable
            if (r6 == 0) goto L25
            int r6 = r10.startDummyDrawableWidth
            if (r6 == r0) goto L31
        L25:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.startDummyDrawable = r6
            r10.startDummyDrawableWidth = r0
            r6.setBounds(r1, r1, r0, r5)
        L31:
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.startDummyDrawable
            if (r6 == r7) goto L62
            android.widget.EditText r6 = r10.editText
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r6, r7, r8, r9, r0)
            goto L60
        L49:
            android.graphics.drawable.Drawable r0 = r10.startDummyDrawable
            if (r0 == 0) goto L62
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r0)
            android.widget.EditText r6 = r10.editText
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r6, r2, r7, r8, r0)
            r10.startDummyDrawable = r2
        L60:
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r6 = r10.shouldUpdateEndDummyDrawable()
            if (r6 == 0) goto Ld9
            com.google.android.material.textfield.EndCompoundLayout r2 = r10.endLayout
            android.widget.TextView r2 = r2.getSuffixTextView()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.EndCompoundLayout r6 = r10.endLayout
            com.google.android.material.internal.CheckableImageButton r6 = r6.getCurrentEndIconView()
            if (r6 == 0) goto L92
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r2
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r2)
            int r2 = r2 + r7
        L92:
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r7 == 0) goto Lb3
            int r8 = r10.endDummyDrawableWidth
            if (r8 == r2) goto Lb3
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.endDummyDrawable
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r2, r4, r3)
            goto Lfa
        Lb3:
            if (r7 != 0) goto Lc1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.endDummyDrawable = r7
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
        Lc1:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r2 == r7) goto Ld7
            r0 = r6[r4]
            r10.originalEditTextEndDrawable = r0
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r2, r7, r3)
            goto Lfa
        Ld7:
            r5 = r0
            goto Lfa
        Ld9:
            android.graphics.drawable.Drawable r6 = r10.endDummyDrawable
            if (r6 == 0) goto Lfb
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r4 != r7) goto Lf7
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.originalEditTextEndDrawable
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r4, r7, r3)
            goto Lf8
        Lf7:
            r5 = r0
        Lf8:
            r10.endDummyDrawable = r2
        Lfa:
            r0 = r5
        Lfb:
            return r0
    }

    public final void updateEditTextBackground() {
            r3 = this;
            android.widget.EditText r0 = r3.editText
            if (r0 == 0) goto L4c
            int r1 = r3.boxBackgroundMode
            if (r1 == 0) goto L9
            goto L4c
        L9:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L10
            return
        L10:
            boolean r1 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r0)
            if (r1 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r0.mutate()
        L1a:
            boolean r1 = r3.shouldShowError()
            if (r1 == 0) goto L2e
            int r1 = r3.getErrorCurrentTextColors()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r1, r2)
            r0.setColorFilter(r1)
            goto L4c
        L2e:
            boolean r1 = r3.counterOverflowed
            if (r1 == 0) goto L44
            android.widget.TextView r1 = r3.counterView
            if (r1 == 0) goto L44
            int r1 = r1.getCurrentTextColor()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r1, r2)
            r0.setColorFilter(r1)
            goto L4c
        L44:
            androidx.core.graphics.drawable.DrawableCompat.clearColorFilter(r0)
            android.widget.EditText r0 = r3.editText
            r0.refreshDrawableState()
        L4c:
            return
    }

    public final void updateEditTextBoxBackgroundIfNeeded() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            if (r0 == 0) goto L23
            com.google.android.material.shape.MaterialShapeDrawable r1 = r2.boxBackground
            if (r1 == 0) goto L23
            boolean r1 = r2.boxBackgroundApplied
            if (r1 != 0) goto L12
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L23
        L12:
            int r0 = r2.boxBackgroundMode
            if (r0 != 0) goto L17
            goto L23
        L17:
            android.widget.EditText r0 = r2.editText
            android.graphics.drawable.Drawable r1 = r2.getEditTextBoxBackground()
            androidx.core.view.ViewCompat.setBackground(r0, r1)
            r0 = 1
            r2.boxBackgroundApplied = r0
        L23:
            return
    }

    public final void updateLabelState(boolean r2) {
            r1 = this;
            r0 = 0
            r1.updateLabelState(r2, r0)
            return
    }

    public final void updateTextInputBoxState() {
            r6 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.boxBackground
            if (r0 == 0) goto Le2
            int r0 = r6.boxBackgroundMode
            if (r0 != 0) goto La
            goto Le2
        La:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L33
            android.widget.EditText r3 = r6.editText
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
            goto L33
        L31:
            r3 = 0
            goto L34
        L33:
            r3 = 1
        L34:
            boolean r4 = r6.shouldShowError()
            if (r4 != 0) goto L42
            android.widget.TextView r4 = r6.counterView
            if (r4 == 0) goto L43
            boolean r4 = r6.counterOverflowed
            if (r4 == 0) goto L43
        L42:
            r1 = 1
        L43:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L4e
            int r4 = r6.disabledColor
            r6.boxStrokeColor = r4
            goto L8c
        L4e:
            boolean r4 = r6.shouldShowError()
            if (r4 == 0) goto L63
            android.content.res.ColorStateList r4 = r6.strokeErrorColor
            if (r4 == 0) goto L5c
            r6.updateStrokeErrorColor(r0, r3)
            goto L8c
        L5c:
            int r4 = r6.getErrorCurrentTextColors()
            r6.boxStrokeColor = r4
            goto L8c
        L63:
            boolean r4 = r6.counterOverflowed
            if (r4 == 0) goto L7a
            android.widget.TextView r4 = r6.counterView
            if (r4 == 0) goto L7a
            android.content.res.ColorStateList r5 = r6.strokeErrorColor
            if (r5 == 0) goto L73
            r6.updateStrokeErrorColor(r0, r3)
            goto L8c
        L73:
            int r4 = r4.getCurrentTextColor()
            r6.boxStrokeColor = r4
            goto L8c
        L7a:
            if (r0 == 0) goto L81
            int r4 = r6.focusedStrokeColor
            r6.boxStrokeColor = r4
            goto L8c
        L81:
            if (r3 == 0) goto L88
            int r4 = r6.hoveredStrokeColor
            r6.boxStrokeColor = r4
            goto L8c
        L88:
            int r4 = r6.defaultStrokeColor
            r6.boxStrokeColor = r4
        L8c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L95
            r6.updateCursorColor(r1)
        L95:
            com.google.android.material.textfield.EndCompoundLayout r1 = r6.endLayout
            r1.onTextInputBoxStateUpdated()
            r6.refreshStartIconDrawableState()
            int r1 = r6.boxBackgroundMode
            r4 = 2
            if (r1 != r4) goto Lbc
            int r1 = r6.boxStrokeWidthPx
            if (r0 == 0) goto Lb1
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto Lb1
            int r4 = r6.boxStrokeWidthFocusedPx
            r6.boxStrokeWidthPx = r4
            goto Lb5
        Lb1:
            int r4 = r6.boxStrokeWidthDefaultPx
            r6.boxStrokeWidthPx = r4
        Lb5:
            int r4 = r6.boxStrokeWidthPx
            if (r4 == r1) goto Lbc
            r6.recalculateCutout()
        Lbc:
            int r1 = r6.boxBackgroundMode
            if (r1 != r2) goto Ldf
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Lcb
            int r0 = r6.disabledFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto Ldf
        Lcb:
            if (r3 == 0) goto Ld4
            if (r0 != 0) goto Ld4
            int r0 = r6.hoveredFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto Ldf
        Ld4:
            if (r0 == 0) goto Ldb
            int r0 = r6.focusedFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto Ldf
        Ldb:
            int r0 = r6.defaultFilledBackgroundColor
            r6.boxBackgroundColor = r0
        Ldf:
            r6.applyBoxAttributes()
        Le2:
            return
    }
}
