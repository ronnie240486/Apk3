package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class BitmapContainerTransitionFactory<R> implements com.bumptech.glide.request.transition.TransitionFactory<R> {
    private final com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> realFactory;

    /* JADX INFO: loaded from: classes2.dex */
    public final class BitmapGlideAnimation implements com.bumptech.glide.request.transition.Transition<R> {
        public final /* synthetic */ com.bumptech.glide.request.transition.BitmapContainerTransitionFactory this$0;
        private final com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> transition;

        public BitmapGlideAnimation(com.bumptech.glide.request.transition.BitmapContainerTransitionFactory r1, com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.transition = r2
                return
        }

        @Override // com.bumptech.glide.request.transition.Transition
        public boolean transition(R r4, com.bumptech.glide.request.transition.Transition.ViewAdapter r5) {
                r3 = this;
                android.view.View r0 = r5.getView()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
                com.bumptech.glide.request.transition.BitmapContainerTransitionFactory r2 = r3.this$0
                android.graphics.Bitmap r4 = r2.getBitmap(r4)
                r1.<init>(r0, r4)
                com.bumptech.glide.request.transition.Transition<android.graphics.drawable.Drawable> r4 = r3.transition
                boolean r4 = r4.transition(r1, r5)
                return r4
        }
    }

    public BitmapContainerTransitionFactory(com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r1) {
            r0 = this;
            r0.<init>()
            r0.realFactory = r1
            return
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public com.bumptech.glide.request.transition.Transition<R> build(com.bumptech.glide.load.DataSource r2, boolean r3) {
            r1 = this;
            com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r0 = r1.realFactory
            com.bumptech.glide.request.transition.Transition r2 = r0.build(r2, r3)
            com.bumptech.glide.request.transition.BitmapContainerTransitionFactory$BitmapGlideAnimation r3 = new com.bumptech.glide.request.transition.BitmapContainerTransitionFactory$BitmapGlideAnimation
            r3.<init>(r1, r2)
            return r3
    }

    public abstract android.graphics.Bitmap getBitmap(R r1);
}
