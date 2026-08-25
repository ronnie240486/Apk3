package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public class GuidedActionEditText extends android.widget.EditText implements androidx.leanback.widget.ImeKeyMonitor, androidx.leanback.widget.GuidedActionAutofillSupport {
    private androidx.leanback.widget.GuidedActionAutofillSupport.OnAutofillListener mAutofillListener;
    private androidx.leanback.widget.ImeKeyMonitor.ImeKeyListener mKeyListener;
    private final android.graphics.drawable.Drawable mNoPaddingDrawable;
    private final android.graphics.drawable.Drawable mSavedBackground;

    public static final class NoPaddingDrawable extends android.graphics.drawable.Drawable {
        public NoPaddingDrawable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
                r1 = this;
                r0 = -2
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(android.graphics.Rect r2) {
                r1 = this;
                r0 = 0
                r2.set(r0, r0, r0, r0)
                r2 = 1
                return r2
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter r1) {
                r0 = this;
                return
        }
    }

    public GuidedActionEditText(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GuidedActionEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842862(0x101006e, float:2.3693866E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public GuidedActionEditText(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            r0.mSavedBackground = r1
            androidx.leanback.widget.GuidedActionEditText$NoPaddingDrawable r1 = new androidx.leanback.widget.GuidedActionEditText$NoPaddingDrawable
            r1.<init>()
            r0.mNoPaddingDrawable = r1
            r0.setBackground(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(android.view.autofill.AutofillValue r1) {
            r0 = this;
            super.autofill(r1)
            androidx.leanback.widget.GuidedActionAutofillSupport$OnAutofillListener r1 = r0.mAutofillListener
            if (r1 == 0) goto La
            r1.onAutofill(r0)
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            if (r1 == 0) goto Lb
            android.graphics.drawable.Drawable r2 = r0.mSavedBackground
            r0.setBackground(r2)
            goto L10
        Lb:
            android.graphics.drawable.Drawable r2 = r0.mNoPaddingDrawable
            r0.setBackground(r2)
        L10:
            if (r1 != 0) goto L16
            r1 = 0
            r0.setFocusable(r1)
        L16:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            boolean r0 = r1.isFocused()
            if (r0 == 0) goto Lc
            java.lang.Class<android.widget.EditText> r0 = android.widget.EditText.class
            goto Le
        Lc:
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
        Le:
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.leanback.widget.ImeKeyMonitor$ImeKeyListener r0 = r1.mKeyListener
            if (r0 == 0) goto L9
            boolean r0 = r0.onKeyPreIme(r1, r2, r3)
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L10
            boolean r0 = super.onKeyPreIme(r2, r3)
        L10:
            return r0
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r0, r1)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    @Override // androidx.leanback.widget.ImeKeyMonitor
    public void setImeKeyListener(androidx.leanback.widget.ImeKeyMonitor.ImeKeyListener r1) {
            r0 = this;
            r0.mKeyListener = r1
            return
    }

    @Override // androidx.leanback.widget.GuidedActionAutofillSupport
    public void setOnAutofillListener(androidx.leanback.widget.GuidedActionAutofillSupport.OnAutofillListener r1) {
            r0 = this;
            r0.mAutofillListener = r1
            return
    }
}
