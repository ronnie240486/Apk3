package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {

    @androidx.annotation.Nullable
    private android.animation.AnimatorSet currentAnimation;


    public ExpandableTransformationBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ void access$002(com.google.android.material.transformation.ExpandableTransformationBehavior r1) {
            r0 = 0
            r1.currentAnimation = r0
            return
    }

    @androidx.annotation.NonNull
    public abstract android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(android.view.View r1, android.view.View r2, boolean r3, boolean r4);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @androidx.annotation.CallSuper
    public void onExpandedStateChange(android.view.View r3, android.view.View r4, boolean r5, boolean r6) {
            r2 = this;
            android.animation.AnimatorSet r0 = r2.currentAnimation
            if (r0 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto Lc
            r0.cancel()
        Lc:
            android.animation.AnimatorSet r3 = r2.onCreateExpandedStateChangeAnimation(r3, r4, r5, r1)
            r2.currentAnimation = r3
            com.google.android.material.transformation.ExpandableTransformationBehavior$1 r4 = new com.google.android.material.transformation.ExpandableTransformationBehavior$1
            r4.<init>(r2)
            r3.addListener(r4)
            android.animation.AnimatorSet r3 = r2.currentAnimation
            r3.start()
            if (r6 != 0) goto L26
            android.animation.AnimatorSet r3 = r2.currentAnimation
            r3.end()
        L26:
            return
    }
}
