package androidx.swiperefreshlayout.widget;

/* JADX INFO: loaded from: classes3.dex */
class CircleImageView extends android.widget.ImageView {
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private android.view.animation.Animation.AnimationListener mListener;
    public int mShadowRadius;

    /* JADX INFO: loaded from: classes.dex */
    public class OvalShadow extends android.graphics.drawable.shapes.OvalShape {
        private android.graphics.RadialGradient mRadialGradient;
        private android.graphics.Paint mShadowPaint;
        public final /* synthetic */ androidx.swiperefreshlayout.widget.CircleImageView this$0;

        public OvalShadow(androidx.swiperefreshlayout.widget.CircleImageView r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r1.mShadowPaint = r0
                r2.mShadowRadius = r3
                android.graphics.RectF r2 = r1.rect()
                float r2 = r2.width()
                int r2 = (int) r2
                r1.updateRadialGradient(r2)
                return
        }

        private void updateRadialGradient(int r9) {
                r8 = this;
                android.graphics.RadialGradient r7 = new android.graphics.RadialGradient
                r0 = 2
                int r9 = r9 / r0
                float r2 = (float) r9
                androidx.swiperefreshlayout.widget.CircleImageView r9 = r8.this$0
                int r9 = r9.mShadowRadius
                float r3 = (float) r9
                int[] r4 = new int[r0]
                r4 = {x0020: FILL_ARRAY_DATA , data: [1023410176, 0} // fill-array
                android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
                r5 = 0
                r0 = r7
                r1 = r2
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.mRadialGradient = r7
                android.graphics.Paint r9 = r8.mShadowPaint
                r9.setShader(r7)
                return
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(android.graphics.Canvas r5, android.graphics.Paint r6) {
                r4 = this;
                androidx.swiperefreshlayout.widget.CircleImageView r0 = r4.this$0
                int r0 = r0.getWidth()
                androidx.swiperefreshlayout.widget.CircleImageView r1 = r4.this$0
                int r1 = r1.getHeight()
                int r0 = r0 / 2
                float r2 = (float) r0
                int r1 = r1 / 2
                float r1 = (float) r1
                android.graphics.Paint r3 = r4.mShadowPaint
                r5.drawCircle(r2, r1, r2, r3)
                androidx.swiperefreshlayout.widget.CircleImageView r3 = r4.this$0
                int r3 = r3.mShadowRadius
                int r0 = r0 - r3
                float r0 = (float) r0
                r5.drawCircle(r2, r1, r0, r6)
                return
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public final void onResize(float r1, float r2) {
                r0 = this;
                super.onResize(r1, r2)
                int r1 = (int) r1
                r0.updateRadialGradient(r1)
                return
        }
    }

    public CircleImageView(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            android.content.Context r6 = r5.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r0 = 1071644672(0x3fe00000, float:1.75)
            float r0 = r0 * r6
            int r0 = (int) r0
            r1 = 0
            float r1 = r1 * r6
            int r1 = (int) r1
            r2 = 1080033280(0x40600000, float:3.5)
            float r2 = r2 * r6
            int r2 = (int) r2
            r5.mShadowRadius = r2
            boolean r2 = r5.elevationSupported()
            if (r2 == 0) goto L39
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r1
            androidx.core.view.ViewCompat.setElevation(r5, r6)
            goto L61
        L39:
            androidx.swiperefreshlayout.widget.CircleImageView$OvalShadow r6 = new androidx.swiperefreshlayout.widget.CircleImageView$OvalShadow
            int r2 = r5.mShadowRadius
            r6.<init>(r5, r2)
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r2.<init>(r6)
            r6 = 1
            android.graphics.Paint r3 = r2.getPaint()
            r5.setLayerType(r6, r3)
            android.graphics.Paint r6 = r2.getPaint()
            int r3 = r5.mShadowRadius
            float r3 = (float) r3
            float r1 = (float) r1
            float r0 = (float) r0
            r4 = 503316480(0x1e000000, float:6.7762636E-21)
            r6.setShadowLayer(r3, r1, r0, r4)
            int r6 = r5.mShadowRadius
            r5.setPadding(r6, r6, r6, r6)
            r0 = r2
        L61:
            android.graphics.Paint r6 = r0.getPaint()
            r1 = -328966(0xfffffffffffafafa, float:NaN)
            r6.setColor(r1)
            androidx.core.view.ViewCompat.setBackground(r5, r0)
            return
    }

    private boolean elevationSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public void onAnimationEnd() {
            r2 = this;
            super.onAnimationEnd()
            android.view.animation.Animation$AnimationListener r0 = r2.mListener
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationEnd(r1)
        Le:
            return
    }

    @Override // android.view.View
    public void onAnimationStart() {
            r2 = this;
            super.onAnimationStart()
            android.view.animation.Animation$AnimationListener r0 = r2.mListener
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r2.getAnimation()
            r0.onAnimationStart(r1)
        Le:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            boolean r2 = r1.elevationSupported()
            if (r2 != 0) goto L1e
            int r2 = r1.getMeasuredWidth()
            int r3 = r1.mShadowRadius
            int r3 = r3 * 2
            int r3 = r3 + r2
            int r2 = r1.getMeasuredHeight()
            int r0 = r1.mShadowRadius
            int r0 = r0 * 2
            int r0 = r0 + r2
            r1.setMeasuredDimension(r3, r0)
        L1e:
            return
    }

    public void setAnimationListener(android.view.animation.Animation.AnimationListener r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.ShapeDrawable r0 = (android.graphics.drawable.ShapeDrawable) r0
            android.graphics.Paint r0 = r0.getPaint()
            r0.setColor(r2)
        L15:
            return
    }

    public void setBackgroundColorRes(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setBackgroundColor(r2)
            return
    }
}
