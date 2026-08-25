package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class EditTextUtils {
    private EditTextUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isEditable(@androidx.annotation.NonNull android.widget.EditText r0) {
            int r0 = r0.getInputType()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
