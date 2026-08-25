package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class MediaRowFocusView extends android.view.View {
    private final android.graphics.Paint mPaint;
    private final android.graphics.RectF mRoundRectF;
    private int mRoundRectRadius;

    public MediaRowFocusView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.mRoundRectF = r0
            android.graphics.Paint r2 = r1.createPaint(r2)
            r1.mPaint = r2
            return
    }

    public MediaRowFocusView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r0.mRoundRectF = r2
            android.graphics.Paint r1 = r0.createPaint(r1)
            r0.mPaint = r1
            return
    }

    public MediaRowFocusView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r0.mRoundRectF = r2
            android.graphics.Paint r1 = r0.createPaint(r1)
            r0.mPaint = r1
            return
    }

    private android.graphics.Paint createPaint(android.content.Context r3) {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.content.res.Resources r3 = r3.getResources()
            int r1 = androidx.leanback.R.color.lb_playback_media_row_highlight_color
            int r3 = r3.getColor(r1)
            r0.setColor(r3)
            return r0
    }

    public int getRoundRectRadius() {
            r1 = this;
            int r0 = r1.mRoundRectRadius
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            super.onDraw(r6)
            int r0 = r5.getHeight()
            int r0 = r0 / 2
            r5.mRoundRectRadius = r0
            int r0 = r0 * 2
            int r1 = r5.getHeight()
            int r0 = r0 - r1
            int r0 = r0 / 2
            android.graphics.RectF r1 = r5.mRoundRectF
            int r2 = -r0
            float r2 = (float) r2
            int r3 = r5.getWidth()
            float r3 = (float) r3
            int r4 = r5.getHeight()
            int r4 = r4 + r0
            float r0 = (float) r4
            r4 = 0
            r1.set(r4, r2, r3, r0)
            android.graphics.RectF r0 = r5.mRoundRectF
            int r1 = r5.mRoundRectRadius
            float r2 = (float) r1
            float r1 = (float) r1
            android.graphics.Paint r3 = r5.mPaint
            r6.drawRoundRect(r0, r2, r1, r3)
            return
    }
}
