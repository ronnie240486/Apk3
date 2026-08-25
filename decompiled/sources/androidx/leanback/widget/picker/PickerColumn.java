package androidx.leanback.widget.picker;

/* JADX INFO: loaded from: classes3.dex */
public class PickerColumn {
    private int mCurrentValue;
    private java.lang.String mLabelFormat;
    private int mMaxValue;
    private int mMinValue;
    private java.lang.CharSequence[] mStaticLabels;

    public PickerColumn() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getCount() {
            r2 = this;
            int r0 = r2.mMaxValue
            int r1 = r2.mMinValue
            int r0 = r0 - r1
            int r0 = r0 + 1
            return r0
    }

    public int getCurrentValue() {
            r1 = this;
            int r0 = r1.mCurrentValue
            return r0
    }

    public java.lang.CharSequence getLabelFor(int r4) {
            r3 = this;
            java.lang.CharSequence[] r0 = r3.mStaticLabels
            if (r0 != 0) goto L15
            java.lang.String r0 = r3.mLabelFormat
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = java.lang.String.format(r0, r1)
            return r4
        L15:
            r4 = r0[r4]
            return r4
    }

    public java.lang.String getLabelFormat() {
            r1 = this;
            java.lang.String r0 = r1.mLabelFormat
            return r0
    }

    public int getMaxValue() {
            r1 = this;
            int r0 = r1.mMaxValue
            return r0
    }

    public int getMinValue() {
            r1 = this;
            int r0 = r1.mMinValue
            return r0
    }

    public java.lang.CharSequence[] getStaticLabels() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.mStaticLabels
            return r0
    }

    public void setCurrentValue(int r1) {
            r0 = this;
            r0.mCurrentValue = r1
            return
    }

    public void setLabelFormat(java.lang.String r1) {
            r0 = this;
            r0.mLabelFormat = r1
            return
    }

    public void setMaxValue(int r1) {
            r0 = this;
            r0.mMaxValue = r1
            return
    }

    public void setMinValue(int r1) {
            r0 = this;
            r0.mMinValue = r1
            return
    }

    public void setStaticLabels(java.lang.CharSequence[] r1) {
            r0 = this;
            r0.mStaticLabels = r1
            return
    }
}
