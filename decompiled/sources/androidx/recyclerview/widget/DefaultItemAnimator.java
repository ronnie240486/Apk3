package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultItemAnimator extends androidx.recyclerview.widget.SimpleItemAnimator {
    private static final boolean DEBUG = false;
    private static android.animation.TimeInterpolator sDefaultInterpolator;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAddAnimations;
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder>> mAdditionsList;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mChangeAnimations;
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo>> mChangesList;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mMoveAnimations;
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo>> mMovesList;
    private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingAdditions;
    private java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> mPendingChanges;
    private java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo> mPendingMoves;
    private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingRemovals;
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mRemoveAnimations;









    /* JADX INFO: loaded from: classes.dex */
    public static class ChangeInfo {
        public int fromX;
        public int fromY;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder newHolder;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder oldHolder;
        public int toX;
        public int toY;

        private ChangeInfo(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                r0.<init>()
                r0.oldHolder = r1
                r0.newHolder = r2
                return
        }

        public ChangeInfo(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.fromX = r3
                r0.fromY = r4
                r0.toX = r5
                r0.toY = r6
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "ChangeInfo{oldHolder="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r3.oldHolder
                r0.append(r1)
                java.lang.String r1 = ", newHolder="
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r3.newHolder
                r0.append(r1)
                java.lang.String r1 = ", fromX="
                r0.append(r1)
                int r1 = r3.fromX
                r0.append(r1)
                java.lang.String r1 = ", fromY="
                r0.append(r1)
                int r1 = r3.fromY
                r0.append(r1)
                java.lang.String r1 = ", toX="
                r0.append(r1)
                int r1 = r3.toX
                r0.append(r1)
                java.lang.String r1 = ", toY="
                r0.append(r1)
                int r1 = r3.toY
                r2 = 125(0x7d, float:1.75E-43)
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class MoveInfo {
        public int fromX;
        public int fromY;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder holder;
        public int toX;
        public int toY;

        public MoveInfo(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.holder = r1
                r0.fromX = r2
                r0.fromY = r3
                r0.toX = r4
                r0.toY = r5
                return
        }
    }

    public DefaultItemAnimator() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingRemovals = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingAdditions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingMoves = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingChanges = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdditionsList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMovesList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mChangesList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAddAnimations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMoveAnimations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRemoveAnimations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mChangeAnimations = r0
            return
    }

    private void animateRemoveImpl(androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
            r4 = this;
            android.view.View r0 = r5.itemView
            android.view.ViewPropertyAnimator r1 = r0.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r4.mRemoveAnimations
            r2.add(r5)
            long r2 = r4.getRemoveDuration()
            android.view.ViewPropertyAnimator r2 = r1.setDuration(r2)
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            androidx.recyclerview.widget.DefaultItemAnimator$4 r3 = new androidx.recyclerview.widget.DefaultItemAnimator$4
            r3.<init>(r4, r5, r1, r0)
            android.view.ViewPropertyAnimator r5 = r2.setListener(r3)
            r5.start()
            return
    }

    private void endChangeAnimation(java.util.List<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> r4, androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo r1 = (androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo) r1
            boolean r2 = r3.endChangeAnimationIfNecessary(r1, r5)
            if (r2 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.oldHolder
            if (r2 != 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.newHolder
            if (r2 != 0) goto L1f
            r4.remove(r1)
        L1f:
            int r0 = r0 + (-1)
            goto L6
        L22:
            return
    }

    private void endChangeAnimationIfNecessary(androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.oldHolder
            if (r0 == 0) goto L7
            r1.endChangeAnimationIfNecessary(r2, r0)
        L7:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.newHolder
            if (r0 == 0) goto Le
            r1.endChangeAnimationIfNecessary(r2, r0)
        Le:
            return
    }

    private boolean endChangeAnimationIfNecessary(androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo r5, androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r5.newHolder
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto La
            r5.newHolder = r2
            goto L11
        La:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r5.oldHolder
            if (r0 != r6) goto L27
            r5.oldHolder = r2
            r3 = 1
        L11:
            android.view.View r5 = r6.itemView
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            android.view.View r5 = r6.itemView
            r0 = 0
            r5.setTranslationX(r0)
            android.view.View r5 = r6.itemView
            r5.setTranslationY(r0)
            r4.dispatchChangeFinished(r6, r3)
            return r1
        L27:
            return r3
    }

    private void resetAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = androidx.recyclerview.widget.DefaultItemAnimator.sDefaultInterpolator
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            androidx.recyclerview.widget.DefaultItemAnimator.sDefaultInterpolator = r0
        Lf:
            android.view.View r0 = r3.itemView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = androidx.recyclerview.widget.DefaultItemAnimator.sDefaultInterpolator
            r0.setInterpolator(r1)
            r2.endAnimation(r3)
            return
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            r2.resetAnimation(r3)
            android.view.View r0 = r3.itemView
            r1 = 0
            r0.setAlpha(r1)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mPendingAdditions
            r0.add(r3)
            r3 = 1
            return r3
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12, int r13, int r14, int r15) {
            r9 = this;
            if (r10 != r11) goto Ld
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            boolean r10 = r0.animateMove(r1, r2, r3, r4, r5)
            return r10
        Ld:
            android.view.View r0 = r10.itemView
            float r0 = r0.getTranslationX()
            android.view.View r1 = r10.itemView
            float r1 = r1.getTranslationY()
            android.view.View r2 = r10.itemView
            float r2 = r2.getAlpha()
            r9.resetAnimation(r10)
            int r3 = r14 - r12
            float r3 = (float) r3
            float r3 = r3 - r0
            int r3 = (int) r3
            int r4 = r15 - r13
            float r4 = (float) r4
            float r4 = r4 - r1
            int r4 = (int) r4
            android.view.View r5 = r10.itemView
            r5.setTranslationX(r0)
            android.view.View r0 = r10.itemView
            r0.setTranslationY(r1)
            android.view.View r0 = r10.itemView
            r0.setAlpha(r2)
            if (r11 == 0) goto L54
            r9.resetAnimation(r11)
            android.view.View r0 = r11.itemView
            int r1 = -r3
            float r1 = (float) r1
            r0.setTranslationX(r1)
            android.view.View r0 = r11.itemView
            int r1 = -r4
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.View r0 = r11.itemView
            r1 = 0
            r0.setAlpha(r1)
        L54:
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r0 = r9.mPendingChanges
            androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo r8 = new androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r8)
            r10 = 1
            return r10
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            android.view.View r0 = r9.itemView
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r4 = r10 + r1
            android.view.View r10 = r9.itemView
            float r10 = r10.getTranslationY()
            int r10 = (int) r10
            int r5 = r11 + r10
            r8.resetAnimation(r9)
            int r10 = r12 - r4
            int r11 = r13 - r5
            if (r10 != 0) goto L22
            if (r11 != 0) goto L22
            r8.dispatchMoveFinished(r9)
            r9 = 0
            return r9
        L22:
            if (r10 == 0) goto L29
            int r10 = -r10
            float r10 = (float) r10
            r0.setTranslationX(r10)
        L29:
            if (r11 == 0) goto L30
            int r10 = -r11
            float r10 = (float) r10
            r0.setTranslationY(r10)
        L30:
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r10 = r8.mPendingMoves
            androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo r11 = new androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo
            r2 = r11
            r3 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r10.add(r11)
            r9 = 1
            return r9
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r1.resetAnimation(r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mPendingRemovals
            r0.add(r2)
            r2 = 1
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r2, @androidx.annotation.NonNull java.util.List<java.lang.Object> r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            boolean r2 = super.canReuseUpdatedViewHolder(r2, r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    public final void cancelAll(java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
            android.view.View r1 = r1.itemView
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    public final void dispatchFinishedWhenDone() {
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L9
            r1.dispatchAnimationsFinished()
        L9:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder r8) {
            r7 = this;
            android.view.View r0 = r8.itemView
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r1 = r7.mPendingMoves
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L11:
            r2 = 0
            if (r1 < 0) goto L31
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r3 = r7.mPendingMoves
            java.lang.Object r3 = r3.get(r1)
            androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo r3 = (androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo) r3
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r3.holder
            if (r3 != r8) goto L2e
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.dispatchMoveFinished(r8)
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r2 = r7.mPendingMoves
            r2.remove(r1)
        L2e:
            int r1 = r1 + (-1)
            goto L11
        L31:
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r1 = r7.mPendingChanges
            r7.endChangeAnimation(r1, r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r7.mPendingRemovals
            boolean r1 = r1.remove(r8)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L46
            r0.setAlpha(r3)
            r7.dispatchRemoveFinished(r8)
        L46:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r7.mPendingAdditions
            boolean r1 = r1.remove(r8)
            if (r1 == 0) goto L54
            r0.setAlpha(r3)
            r7.dispatchAddFinished(r8)
        L54:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r1 = r7.mChangesList
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L5c:
            if (r1 < 0) goto L77
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r4 = r7.mChangesList
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r7.endChangeAnimation(r4, r8)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L74
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r4 = r7.mChangesList
            r4.remove(r1)
        L74:
            int r1 = r1 + (-1)
            goto L5c
        L77:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r1 = r7.mMovesList
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L7f:
            if (r1 < 0) goto Lb9
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r4 = r7.mMovesList
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L8f:
            if (r5 < 0) goto Lb6
            java.lang.Object r6 = r4.get(r5)
            androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo r6 = (androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo) r6
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r6.holder
            if (r6 != r8) goto Lb3
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.dispatchMoveFinished(r8)
            r4.remove(r5)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lb6
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r4 = r7.mMovesList
            r4.remove(r1)
            goto Lb6
        Lb3:
            int r5 = r5 + (-1)
            goto L8f
        Lb6:
            int r1 = r1 + (-1)
            goto L7f
        Lb9:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r1 = r7.mAdditionsList
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Lc1:
            if (r1 < 0) goto Le5
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r2 = r7.mAdditionsList
            java.lang.Object r2 = r2.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r8)
            if (r4 == 0) goto Le2
            r0.setAlpha(r3)
            r7.dispatchAddFinished(r8)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le2
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r2 = r7.mAdditionsList
            r2.remove(r1)
        Le2:
            int r1 = r1 + (-1)
            goto Lc1
        Le5:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mRemoveAnimations
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mAddAnimations
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mChangeAnimations
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mMoveAnimations
            r0.remove(r8)
            r7.dispatchFinishedWhenDone()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r0 = r7.mPendingMoves
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            r1 = 0
            if (r0 < 0) goto L2a
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r2 = r7.mPendingMoves
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo r2 = (androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo) r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.holder
            android.view.View r3 = r3.itemView
            r3.setTranslationY(r1)
            r3.setTranslationX(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r2.holder
            r7.dispatchMoveFinished(r1)
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r1 = r7.mPendingMoves
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto L8
        L2a:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mPendingRemovals
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L32:
            if (r0 < 0) goto L47
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r7.mPendingRemovals
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
            r7.dispatchRemoveFinished(r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r7.mPendingRemovals
            r2.remove(r0)
            int r0 = r0 + (-1)
            goto L32
        L47:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mPendingAdditions
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L4f:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto L6b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r7.mPendingAdditions
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r3
            android.view.View r4 = r3.itemView
            r4.setAlpha(r2)
            r7.dispatchAddFinished(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r7.mPendingAdditions
            r2.remove(r0)
            int r0 = r0 + (-1)
            goto L4f
        L6b:
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r0 = r7.mPendingChanges
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L73:
            if (r0 < 0) goto L83
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r3 = r7.mPendingChanges
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo r3 = (androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo) r3
            r7.endChangeAnimationIfNecessary(r3)
            int r0 = r0 + (-1)
            goto L73
        L83:
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r0 = r7.mPendingChanges
            r0.clear()
            boolean r0 = r7.isRunning()
            if (r0 != 0) goto L8f
            return
        L8f:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r0 = r7.mMovesList
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L97:
            if (r0 < 0) goto Ld2
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r3 = r7.mMovesList
            java.lang.Object r3 = r3.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
        La7:
            if (r4 < 0) goto Lcf
            java.lang.Object r5 = r3.get(r4)
            androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo r5 = (androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo) r5
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r5.holder
            android.view.View r6 = r6.itemView
            r6.setTranslationY(r1)
            r6.setTranslationX(r1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = r5.holder
            r7.dispatchMoveFinished(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lcc
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r5 = r7.mMovesList
            r5.remove(r3)
        Lcc:
            int r4 = r4 + (-1)
            goto La7
        Lcf:
            int r0 = r0 + (-1)
            goto L97
        Ld2:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r0 = r7.mAdditionsList
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lda:
            if (r0 < 0) goto L10e
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r1 = r7.mAdditionsList
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            int r3 = r3 + (-1)
        Lea:
            if (r3 < 0) goto L10b
            java.lang.Object r4 = r1.get(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r4
            android.view.View r5 = r4.itemView
            r5.setAlpha(r2)
            r7.dispatchAddFinished(r4)
            r1.remove(r3)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L108
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r4 = r7.mAdditionsList
            r4.remove(r1)
        L108:
            int r3 = r3 + (-1)
            goto Lea
        L10b:
            int r0 = r0 + (-1)
            goto Lda
        L10e:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r0 = r7.mChangesList
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L116:
            if (r0 < 0) goto L142
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r1 = r7.mChangesList
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L126:
            if (r2 < 0) goto L13f
            java.lang.Object r3 = r1.get(r2)
            androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo r3 = (androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo) r3
            r7.endChangeAnimationIfNecessary(r3)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L13c
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r3 = r7.mChangesList
            r3.remove(r1)
        L13c:
            int r2 = r2 + (-1)
            goto L126
        L13f:
            int r0 = r0 + (-1)
            goto L116
        L142:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mRemoveAnimations
            r7.cancelAll(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mMoveAnimations
            r7.cancelAll(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mAddAnimations
            r7.cancelAll(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r7.mChangeAnimations
            r7.cancelAll(r0)
            r7.dispatchAnimationsFinished()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mPendingAdditions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r0 = r1.mPendingChanges
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r0 = r1.mPendingMoves
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mPendingRemovals
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mMoveAnimations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mRemoveAnimations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mAddAnimations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mChangeAnimations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r0 = r1.mMovesList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r0 = r1.mAdditionsList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r0 = r1.mChangesList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            goto L5b
        L59:
            r0 = 0
            goto L5c
        L5b:
            r0 = 1
        L5c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
            r10 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r10.mPendingRemovals
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r1 = r10.mPendingMoves
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r2 = r10.mPendingChanges
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r3 = r10.mPendingAdditions
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r0 != 0) goto L29
            if (r1 != 0) goto L29
            if (r3 != 0) goto L29
            if (r2 != 0) goto L29
            return
        L29:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r10.mPendingRemovals
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.next()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r5
            r10.animateRemoveImpl(r5)
            goto L2f
        L3f:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r4 = r10.mPendingRemovals
            r4.clear()
            r4 = 0
            if (r1 == 0) goto L77
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r6 = r10.mPendingMoves
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo>> r6 = r10.mMovesList
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo> r6 = r10.mPendingMoves
            r6.clear()
            androidx.recyclerview.widget.DefaultItemAnimator$1 r6 = new androidx.recyclerview.widget.DefaultItemAnimator$1
            r6.<init>(r10, r5)
            if (r0 == 0) goto L74
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.DefaultItemAnimator$MoveInfo r5 = (androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo) r5
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = r5.holder
            android.view.View r5 = r5.itemView
            long r7 = r10.getRemoveDuration()
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r5, r6, r7)
            goto L77
        L74:
            r6.run()
        L77:
            if (r2 == 0) goto La9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r6 = r10.mPendingChanges
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo>> r6 = r10.mChangesList
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo> r6 = r10.mPendingChanges
            r6.clear()
            androidx.recyclerview.widget.DefaultItemAnimator$2 r6 = new androidx.recyclerview.widget.DefaultItemAnimator$2
            r6.<init>(r10, r5)
            if (r0 == 0) goto La6
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.DefaultItemAnimator$ChangeInfo r5 = (androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo) r5
            androidx.recyclerview.widget.RecyclerView$ViewHolder r5 = r5.oldHolder
            android.view.View r5 = r5.itemView
            long r7 = r10.getRemoveDuration()
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r5, r6, r7)
            goto La9
        La6:
            r6.run()
        La9:
            if (r3 == 0) goto Lf7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r10.mPendingAdditions
            r3.addAll(r5)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r5 = r10.mAdditionsList
            r5.add(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder> r5 = r10.mPendingAdditions
            r5.clear()
            androidx.recyclerview.widget.DefaultItemAnimator$3 r5 = new androidx.recyclerview.widget.DefaultItemAnimator$3
            r5.<init>(r10, r3)
            if (r0 != 0) goto Lcf
            if (r1 != 0) goto Lcf
            if (r2 == 0) goto Lcb
            goto Lcf
        Lcb:
            r5.run()
            goto Lf7
        Lcf:
            r6 = 0
            if (r0 == 0) goto Ld8
            long r8 = r10.getRemoveDuration()
            goto Ld9
        Ld8:
            r8 = r6
        Ld9:
            if (r1 == 0) goto Le0
            long r0 = r10.getMoveDuration()
            goto Le1
        Le0:
            r0 = r6
        Le1:
            if (r2 == 0) goto Le7
            long r6 = r10.getChangeDuration()
        Le7:
            long r0 = java.lang.Math.max(r0, r6)
            long r0 = r0 + r8
            java.lang.Object r2 = r3.get(r4)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
            android.view.View r2 = r2.itemView
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r2, r5, r0)
        Lf7:
            return
    }
}
