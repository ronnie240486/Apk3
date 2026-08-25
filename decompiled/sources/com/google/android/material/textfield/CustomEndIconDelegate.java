package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class CustomEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    public CustomEndIconDelegate(@androidx.annotation.NonNull com.google.android.material.textfield.EndCompoundLayout r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void setUp() {
            r2 = this;
            com.google.android.material.textfield.EndCompoundLayout r0 = r2.endLayout
            r1 = 0
            r0.setEndIconOnLongClickListener(r1)
            return
    }
}
