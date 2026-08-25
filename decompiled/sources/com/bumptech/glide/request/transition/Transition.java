package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes2.dex */
public interface Transition<R> {

    /* JADX INFO: loaded from: classes.dex */
    public interface ViewAdapter {
        @androidx.annotation.Nullable
        android.graphics.drawable.Drawable getCurrentDrawable();

        android.view.View getView();

        void setDrawable(android.graphics.drawable.Drawable r1);
    }

    boolean transition(R r1, com.bumptech.glide.request.transition.Transition.ViewAdapter r2);
}
