package com.makeramen.roundedimageview;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedTransformationBuilder {
    private android.content.res.ColorStateList mBorderColor;
    private float mBorderWidth;
    private float[] mCornerRadii;
    private final android.util.DisplayMetrics mDisplayMetrics;
    private boolean mOval;
    private android.widget.ImageView.ScaleType mScaleType;


    public RoundedTransformationBuilder() {
            r1 = this;
            r1.<init>()
            r0 = 4
            float[] r0 = new float[r0]
            r0 = {x0028: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            r1.mCornerRadii = r0
            r0 = 0
            r1.mOval = r0
            r0 = 0
            r1.mBorderWidth = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.mBorderColor = r0
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.mScaleType = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1.mDisplayMetrics = r0
            return
    }

    public static /* synthetic */ boolean access$000(com.makeramen.roundedimageview.RoundedTransformationBuilder r0) {
            boolean r0 = r0.mOval
            return r0
    }

    public static /* synthetic */ android.content.res.ColorStateList access$100(com.makeramen.roundedimageview.RoundedTransformationBuilder r0) {
            android.content.res.ColorStateList r0 = r0.mBorderColor
            return r0
    }

    public static /* synthetic */ float access$200(com.makeramen.roundedimageview.RoundedTransformationBuilder r0) {
            float r0 = r0.mBorderWidth
            return r0
    }

    public static /* synthetic */ float[] access$300(com.makeramen.roundedimageview.RoundedTransformationBuilder r0) {
            float[] r0 = r0.mCornerRadii
            return r0
    }

    public static /* synthetic */ android.widget.ImageView.ScaleType access$400(com.makeramen.roundedimageview.RoundedTransformationBuilder r0) {
            android.widget.ImageView$ScaleType r0 = r0.mScaleType
            return r0
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder borderColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.mBorderColor = r1
            return r0
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder borderColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mBorderColor = r1
            return r0
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder borderWidth(float r1) {
            r0 = this;
            r0.mBorderWidth = r1
            return r0
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder borderWidthDp(float r3) {
            r2 = this;
            android.util.DisplayMetrics r0 = r2.mDisplayMetrics
            r1 = 1
            float r3 = android.util.TypedValue.applyDimension(r1, r3, r0)
            r2.mBorderWidth = r3
            return r2
    }

    public com.squareup.picasso.Transformation build() {
            r1 = this;
            com.makeramen.roundedimageview.RoundedTransformationBuilder$1 r0 = new com.makeramen.roundedimageview.RoundedTransformationBuilder$1
            r0.<init>(r1)
            return r0
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder cornerRadius(float r3) {
            r2 = this;
            float[] r0 = r2.mCornerRadii
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            r1 = 2
            r0[r1] = r3
            r1 = 3
            r0[r1] = r3
            return r2
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder cornerRadius(int r2, float r3) {
            r1 = this;
            float[] r0 = r1.mCornerRadii
            r0[r2] = r3
            return r1
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder cornerRadiusDp(float r3) {
            r2 = this;
            android.util.DisplayMetrics r0 = r2.mDisplayMetrics
            r1 = 1
            float r3 = android.util.TypedValue.applyDimension(r1, r3, r0)
            com.makeramen.roundedimageview.RoundedTransformationBuilder r3 = r2.cornerRadius(r3)
            return r3
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder cornerRadiusDp(int r3, float r4) {
            r2 = this;
            android.util.DisplayMetrics r0 = r2.mDisplayMetrics
            r1 = 1
            float r4 = android.util.TypedValue.applyDimension(r1, r4, r0)
            com.makeramen.roundedimageview.RoundedTransformationBuilder r3 = r2.cornerRadius(r3, r4)
            return r3
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder oval(boolean r1) {
            r0 = this;
            r0.mOval = r1
            return r0
    }

    public com.makeramen.roundedimageview.RoundedTransformationBuilder scaleType(android.widget.ImageView.ScaleType r1) {
            r0 = this;
            r0.mScaleType = r1
            return r0
    }
}
