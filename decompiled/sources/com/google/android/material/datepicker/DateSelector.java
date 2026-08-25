package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends android.os.Parcelable {

    /* JADX INFO: renamed from: com.google.android.material.datepicker.DateSelector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<S> {
        public static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(android.widget.EditText[] r2, android.view.View r3, boolean r4) {
                int r4 = r2.length
                r0 = 0
            L2:
                if (r0 >= r4) goto L10
                r1 = r2[r0]
                boolean r1 = r1.hasFocus()
                if (r1 == 0) goto Ld
                return
            Ld:
                int r0 = r0 + 1
                goto L2
            L10:
                com.google.android.material.internal.ViewUtils.hideKeyboard(r3)
                return
        }

        public static void showKeyboardWithAutoHideBehavior(@androidx.annotation.NonNull android.widget.EditText... r5) {
                int r0 = r5.length
                if (r0 != 0) goto L4
                return
            L4:
                com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0 r0 = new com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0
                r0.<init>(r5)
                int r1 = r5.length
                r2 = 0
                r3 = 0
            Lc:
                if (r3 >= r1) goto L16
                r4 = r5[r3]
                r4.setOnFocusChangeListener(r0)
                int r3 = r3 + 1
                goto Lc
            L16:
                r5 = r5[r2]
                com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(r5)
                return
        }
    }

    @androidx.annotation.StyleRes
    int getDefaultThemeResId(android.content.Context r1);

    @androidx.annotation.StringRes
    int getDefaultTitleResId();

    @androidx.annotation.Nullable
    java.lang.String getError();

    @androidx.annotation.NonNull
    java.util.Collection<java.lang.Long> getSelectedDays();

    @androidx.annotation.NonNull
    java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges();

    @androidx.annotation.Nullable
    S getSelection();

    @androidx.annotation.NonNull
    java.lang.String getSelectionContentDescription(@androidx.annotation.NonNull android.content.Context r1);

    @androidx.annotation.NonNull
    java.lang.String getSelectionDisplayString(android.content.Context r1);

    boolean isSelectionComplete();

    @androidx.annotation.NonNull
    android.view.View onCreateTextInputView(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, @androidx.annotation.Nullable android.os.Bundle r3, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r4, @androidx.annotation.NonNull com.google.android.material.datepicker.OnSelectionChangedListener<S> r5);

    void select(long r1);

    void setSelection(@androidx.annotation.NonNull S r1);

    void setTextInputFormat(@androidx.annotation.Nullable java.text.SimpleDateFormat r1);
}
