package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SlideNoPropagation extends android.transition.Slide {
    public SlideNoPropagation() {
            r0 = this;
            r0.<init>()
            return
    }

    public SlideNoPropagation(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SlideNoPropagation(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.transition.Slide
    public void setSlideEdge(int r1) {
            r0 = this;
            super.setSlideEdge(r1)
            r1 = 0
            r0.setPropagation(r1)
            return
    }
}
