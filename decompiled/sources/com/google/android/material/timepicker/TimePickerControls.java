package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes2.dex */
interface TimePickerControls {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActiveSelection {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ClockPeriod {
    }

    void setActiveSelection(int r1);

    void setHandRotation(float r1);

    void setValues(java.lang.String[] r1, @androidx.annotation.StringRes int r2);

    void updateTime(int r1, int r2, @androidx.annotation.IntRange(from = 0) int r3);
}
