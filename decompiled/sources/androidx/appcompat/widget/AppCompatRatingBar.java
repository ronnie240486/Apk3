package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends android.widget.RatingBar {
    private final androidx.appcompat.widget.AppCompatProgressBarHelper mAppCompatProgressBarHelper;

    public AppCompatRatingBar(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatRatingBar(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.ratingBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatRatingBar(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r0, r1)
            androidx.appcompat.widget.AppCompatProgressBarHelper r1 = new androidx.appcompat.widget.AppCompatProgressBarHelper
            r1.<init>(r0)
            r0.mAppCompatProgressBarHelper = r1
            r1.loadFromAttributes(r2, r3)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L24
            androidx.appcompat.widget.AppCompatProgressBarHelper r3 = r1.mAppCompatProgressBarHelper     // Catch: java.lang.Throwable -> L24
            android.graphics.Bitmap r3 = r3.getSampleTile()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L22
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L24
            int r0 = r1.getNumStars()     // Catch: java.lang.Throwable -> L24
            int r3 = r3 * r0
            r0 = 0
            int r2 = android.view.View.resolveSizeAndState(r3, r2, r0)     // Catch: java.lang.Throwable -> L24
            int r3 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L24
            r1.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r1)
            return
        L24:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
