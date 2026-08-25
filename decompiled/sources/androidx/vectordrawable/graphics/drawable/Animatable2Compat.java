package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public interface Animatable2Compat extends android.graphics.drawable.Animatable {

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class AnimationCallback {
        public android.graphics.drawable.Animatable2.AnimationCallback mPlatformCallback;

        /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1, reason: invalid class name */
        /* JADX INFO: loaded from: classes.dex */
        class AnonymousClass1 extends android.graphics.drawable.Animatable2.AnimationCallback {
            public final /* synthetic */ androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback this$0;

            public AnonymousClass1(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(android.graphics.drawable.Drawable r2) {
                    r1 = this;
                    androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r0 = r1.this$0
                    r0.onAnimationEnd(r2)
                    return
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(android.graphics.drawable.Drawable r2) {
                    r1 = this;
                    androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback r0 = r1.this$0
                    r0.onAnimationStart(r2)
                    return
            }
        }

        public AnimationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAnimationEnd(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        public void onAnimationStart(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1);

    boolean unregisterAnimationCallback(@androidx.annotation.NonNull androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1);
}
