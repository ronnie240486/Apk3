package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MediaNowPlayingView extends android.widget.LinearLayout {
    private final android.widget.ImageView mImage1;
    private final android.widget.ImageView mImage2;
    private final android.widget.ImageView mImage3;
    private final android.animation.ObjectAnimator mObjectAnimator1;
    private final android.animation.ObjectAnimator mObjectAnimator2;
    private final android.animation.ObjectAnimator mObjectAnimator3;

    public MediaNowPlayingView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>(r7, r8)
            android.view.animation.LinearInterpolator r8 = new android.view.animation.LinearInterpolator
            r8.<init>()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = androidx.leanback.R.layout.lb_playback_now_playing_bars
            r1 = 1
            r7.inflate(r0, r6, r1)
            int r7 = androidx.leanback.R.id.bar1
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.mImage1 = r7
            int r0 = androidx.leanback.R.id.bar2
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.mImage2 = r0
            int r1 = androidx.leanback.R.id.bar3
            android.view.View r1 = r6.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.mImage3 = r1
            android.graphics.drawable.Drawable r2 = r7.getDrawable()
            int r2 = r2.getIntrinsicHeight()
            float r2 = (float) r2
            r7.setPivotY(r2)
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            int r2 = r2.getIntrinsicHeight()
            float r2 = (float) r2
            r0.setPivotY(r2)
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            int r2 = r2.getIntrinsicHeight()
            float r2 = (float) r2
            r1.setPivotY(r2)
            setDropScale(r7)
            setDropScale(r0)
            setDropScale(r1)
            r2 = 30
            float[] r2 = new float[r2]
            r2 = {x00aa: FILL_ARRAY_DATA , data: [1054168405, 1048576000, 1054168405, 1058362709, 1061158912, 1062557013, 1063955115, 1065353216, 1063955115, 1065353216, 1062557013, 1059760811, 1056964608, 1051372203, 1042983595, 1051372203, 1056964608, 1058362709, 1061158912, 1063955115, 1061158912, 1058362709, 1054168405, 1048576000, 1054168405, 1059760811, 1054168405, 1048576000, 1051372203, 1054168405} // fill-array
            java.lang.String r3 = "scaleY"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r3, r2)
            r6.mObjectAnimator1 = r7
            r2 = -1
            r7.setRepeatCount(r2)
            r4 = 2320(0x910, double:1.146E-320)
            r7.setDuration(r4)
            r7.setInterpolator(r8)
            r7 = 27
            float[] r7 = new float[r7]
            r7 = {x00ea: FILL_ARRAY_DATA , data: [1065353216, 1063955115, 1062557013, 1063955115, 1065353216, 1063955115, 1061158912, 1058362709, 1061158912, 1063955115, 1065353216, 1062557013, 1059760811, 1062557013, 1065353216, 1063955115, 1061158912, 1054168405, 1048576000, 1054168405, 1059760811, 1062557013, 1065353216, 1062557013, 1061158912, 1059760811, 1065353216} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r0, r3, r7)
            r6.mObjectAnimator2 = r7
            r7.setRepeatCount(r2)
            r4 = 2080(0x820, double:1.0277E-320)
            r7.setDuration(r4)
            r7.setInterpolator(r8)
            r7 = 26
            float[] r7 = new float[r7]
            r7 = {x0124: FILL_ARRAY_DATA , data: [1059760811, 1061158912, 1062557013, 1065353216, 1063955115, 1061158912, 1058362709, 1054168405, 1058362709, 1059760811, 1061158912, 1065353216, 1063955115, 1065353216, 1061158912, 1058362709, 1061158912, 1063955115, 1065353216, 1062557013, 1059760811, 1061158912, 1058362709, 1054168405, 1048576000, 1059760811} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r1, r3, r7)
            r6.mObjectAnimator3 = r7
            r7.setRepeatCount(r2)
            r0 = 2000(0x7d0, double:9.88E-321)
            r7.setDuration(r0)
            r7.setInterpolator(r8)
            return
    }

    public static void setDropScale(android.view.View r1) {
            r0 = 1034594987(0x3daaaaab, float:0.083333336)
            r1.setScaleY(r0)
            return
    }

    private void startAnimation() {
            r2 = this;
            android.animation.ObjectAnimator r0 = r2.mObjectAnimator1
            r2.startAnimation(r0)
            android.animation.ObjectAnimator r0 = r2.mObjectAnimator2
            r2.startAnimation(r0)
            android.animation.ObjectAnimator r0 = r2.mObjectAnimator3
            r2.startAnimation(r0)
            android.widget.ImageView r0 = r2.mImage1
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.mImage2
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.mImage3
            r0.setVisibility(r1)
            return
    }

    private void startAnimation(android.animation.Animator r2) {
            r1 = this;
            boolean r0 = r2.isStarted()
            if (r0 != 0) goto L9
            r2.start()
        L9:
            return
    }

    private void stopAnimation() {
            r2 = this;
            android.animation.ObjectAnimator r0 = r2.mObjectAnimator1
            android.widget.ImageView r1 = r2.mImage1
            r2.stopAnimation(r0, r1)
            android.animation.ObjectAnimator r0 = r2.mObjectAnimator2
            android.widget.ImageView r1 = r2.mImage2
            r2.stopAnimation(r0, r1)
            android.animation.ObjectAnimator r0 = r2.mObjectAnimator3
            android.widget.ImageView r1 = r2.mImage3
            r2.stopAnimation(r0, r1)
            android.widget.ImageView r0 = r2.mImage1
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.mImage2
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.mImage3
            r0.setVisibility(r1)
            return
    }

    private void stopAnimation(android.animation.Animator r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r2.isStarted()
            if (r0 == 0) goto Lc
            r2.cancel()
            setDropScale(r3)
        Lc:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            int r0 = r1.getVisibility()
            if (r0 != 0) goto Lc
            r1.startAnimation()
        Lc:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.stopAnimation()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            r0 = 8
            if (r2 != r0) goto Lb
            r1.stopAnimation()
            goto Le
        Lb:
            r1.startAnimation()
        Le:
            return
    }
}
