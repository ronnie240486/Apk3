package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class GuidedActionDiffCallback extends androidx.leanback.widget.DiffCallback<androidx.leanback.widget.GuidedAction> {
    public static final androidx.leanback.widget.GuidedActionDiffCallback sInstance = null;

    static {
            androidx.leanback.widget.GuidedActionDiffCallback r0 = new androidx.leanback.widget.GuidedActionDiffCallback
            r0.<init>()
            androidx.leanback.widget.GuidedActionDiffCallback.sInstance = r0
            return
    }

    public GuidedActionDiffCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.leanback.widget.GuidedActionDiffCallback getInstance() {
            androidx.leanback.widget.GuidedActionDiffCallback r0 = androidx.leanback.widget.GuidedActionDiffCallback.sInstance
            return r0
    }

    /* JADX INFO: renamed from: areContentsTheSame, reason: avoid collision after fix types in other method */
    public boolean areContentsTheSame2(@androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r5, @androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L9
            if (r6 != 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
        L9:
            if (r6 != 0) goto Lc
            return r1
        Lc:
            int r2 = r5.getCheckSetId()
            int r3 = r6.getCheckSetId()
            if (r2 != r3) goto L73
            int r2 = r5.mActionFlags
            int r3 = r6.mActionFlags
            if (r2 != r3) goto L73
            java.lang.CharSequence r2 = r5.getTitle()
            java.lang.CharSequence r3 = r6.getTitle()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L73
            java.lang.CharSequence r2 = r5.getDescription()
            java.lang.CharSequence r3 = r6.getDescription()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L73
            int r2 = r5.getInputType()
            int r3 = r6.getInputType()
            if (r2 != r3) goto L73
            java.lang.CharSequence r2 = r5.getEditTitle()
            java.lang.CharSequence r3 = r6.getEditTitle()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L73
            java.lang.CharSequence r2 = r5.getEditDescription()
            java.lang.CharSequence r3 = r6.getEditDescription()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L73
            int r2 = r5.getEditInputType()
            int r3 = r6.getEditInputType()
            if (r2 != r3) goto L73
            int r5 = r5.getDescriptionEditInputType()
            int r6 = r6.getDescriptionEditInputType()
            if (r5 != r6) goto L73
            goto L74
        L73:
            r0 = 0
        L74:
            return r0
    }

    @Override // androidx.leanback.widget.DiffCallback
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(@androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r1, @androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r2) {
            r0 = this;
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            androidx.leanback.widget.GuidedAction r2 = (androidx.leanback.widget.GuidedAction) r2
            boolean r1 = r0.areContentsTheSame2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: areItemsTheSame, reason: avoid collision after fix types in other method */
    public boolean areItemsTheSame2(@androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r6, @androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L9
            if (r7 != 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
        L9:
            if (r7 != 0) goto Lc
            return r1
        Lc:
            long r2 = r6.getId()
            long r6 = r7.getId()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @Override // androidx.leanback.widget.DiffCallback
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(@androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r1, @androidx.annotation.NonNull androidx.leanback.widget.GuidedAction r2) {
            r0 = this;
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            androidx.leanback.widget.GuidedAction r2 = (androidx.leanback.widget.GuidedAction) r2
            boolean r1 = r0.areItemsTheSame2(r1, r2)
            return r1
    }
}
