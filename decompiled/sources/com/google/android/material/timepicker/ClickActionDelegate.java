package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes2.dex */
class ClickActionDelegate extends androidx.core.view.AccessibilityDelegateCompat {
    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat clickAction;

    public ClickActionDelegate(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            java.lang.String r2 = r2.getString(r3)
            r3 = 16
            r0.<init>(r3, r2)
            r1.clickAction = r0
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = r0.clickAction
            r2.addAction(r1)
            return
    }
}
