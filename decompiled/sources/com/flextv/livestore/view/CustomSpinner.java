package com.flextv.livestore.view;

/* JADX INFO: loaded from: classes.dex */
public class CustomSpinner extends androidx.appcompat.widget.AppCompatSpinner {
    private com.flextv.livestore.view.CustomSpinner.OnSpinnerEventsListener listener;
    private boolean mOpenInitiated;

    public interface OnSpinnerEventsListener {
        void onPopupWindowClosed(android.widget.Spinner r1);

        void onPopupWindowOpened(android.widget.Spinner r1);
    }

    public CustomSpinner(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mOpenInitiated = r1
            return
    }

    public CustomSpinner(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mOpenInitiated = r1
            return
    }

    public CustomSpinner(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mOpenInitiated = r1
            return
    }

    public CustomSpinner(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mOpenInitiated = r1
            return
    }

    public CustomSpinner(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 0
            r0.mOpenInitiated = r1
            return
    }

    public CustomSpinner(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4, android.content.res.Resources.Theme r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 0
            r0.mOpenInitiated = r1
            return
    }

    public boolean hasBeenFocused() {
            r1 = this;
            boolean r0 = r1.mOpenInitiated
            return r0
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            boolean r0 = r1.hasBeenFocused()
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r1.performCloseEvent()
        Lb:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            r0 = 0
            r1.mOpenInitiated = r0
            com.flextv.livestore.view.CustomSpinner$OnSpinnerEventsListener r0 = r1.listener
            if (r0 == 0) goto La
            r0.onPopupWindowOpened(r1)
        La:
            boolean r0 = super.performClick()
            return r0
    }

    public void performCloseEvent() {
            r1 = this;
            r0 = 0
            r1.mOpenInitiated = r0
            com.flextv.livestore.view.CustomSpinner$OnSpinnerEventsListener r0 = r1.listener
            if (r0 == 0) goto La
            r0.onPopupWindowClosed(r1)
        La:
            return
    }

    public void setSpinnerEventsListener(com.flextv.livestore.view.CustomSpinner.OnSpinnerEventsListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
